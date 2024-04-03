import { Button, DatePicker, Form, InputNumber, Tabs, message } from "antd";
import React from "react";
import { searchStays } from "../utils";

const {TabPane} = Tabs;

class GuestHomePage extends React.Component {
    render() {
        return (
            <Tabs defaultActiveKey="1" destroyInactiveTabPane={true}>
              <TabPane tab="Search Stays" key="1">
                <></>
              </TabPane>
              <TabPane tab="My Reservations" key="2">
                <div>My Reservations</div>
              </TabPane>
            </Tabs>
          );
    }      
}

export default GuestHomePage;