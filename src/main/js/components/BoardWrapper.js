import React, {Component} from "react";
import styled from "styled-components";

const StyledBoardWrapper = styled.div`
  height: 100vh;
  display: grid;
  grid-auto-rows: 1fr;
  grid-auto-columns: minmax(33%, 1fr);
  grid-template-rows: repeat(auto-fill, fit-content(100px, auto));
  grid-template-columns: repeat(auto-fill, minmax(33%, auto));
  grid-gap: 10px;
`;

class BoardWrapper extends Component {

    render() {
        return (
            <StyledBoardWrapper>
                {this.props.children}
            </StyledBoardWrapper>
        );
    }
}

export default BoardWrapper;