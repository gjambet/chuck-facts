import React from "react";
import styled from "styled-components";

const StyledPanel = styled.div`
    background-color: green;
    min-height: 100px;
    max-height: 100vh;
    font-size: 24px;
    border-radius: 5px;
`;

const Panel = ({jobResult}) => (
    <StyledPanel>{jobResult.jobName + " " + jobResult.status}</StyledPanel>
);

export default Panel;