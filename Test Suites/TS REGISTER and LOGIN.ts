<?xml version="1.0" encoding="UTF-8"?>
<TestSuiteEntity>
   <description></description>
   <name>TS REGISTER and LOGIN</name>
   <tag></tag>
   <isRerun>false</isRerun>
   <mailRecipient></mailRecipient>
   <numberOfRerun>3</numberOfRerun>
   <pageLoadTimeout>30</pageLoadTimeout>
   <pageLoadTimeoutDefault>true</pageLoadTimeoutDefault>
   <rerunFailedTestCasesOnly>false</rerunFailedTestCasesOnly>
   <rerunImmediately>true</rerunImmediately>
   <testSuiteGuid>abb08249-45e9-488a-8e64-7e05fa8d112a</testSuiteGuid>
   <testCaseLink>
      <guid>0453a701-7327-4bc5-8940-2864d895cb84</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/SCENARIOS/P.4 Register</testCaseId>
      <testDataLink>
         <combinationType>ONE</combinationType>
         <id>56bb49d0-efc4-47c5-8932-e311f88d6faf</id>
         <iterationEntity>
            <iterationType>ALL</iterationType>
            <value></value>
         </iterationEntity>
         <testDataId>Data Files/DATA/Register Several Acc</testDataId>
      </testDataLink>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
      <variableLink>
         <testDataLinkId>56bb49d0-efc4-47c5-8932-e311f88d6faf</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>email</value>
         <variableId>d75e7601-c279-43eb-9c38-0e0065679a8b</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>56bb49d0-efc4-47c5-8932-e311f88d6faf</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>password</value>
         <variableId>04ceb5f2-d4d5-4d8b-b88c-bebe13764d2f</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>56bb49d0-efc4-47c5-8932-e311f88d6faf</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>repeat</value>
         <variableId>fcd845dc-8999-45a9-bab0-995a3f9a09e7</variableId>
      </variableLink>
   </testCaseLink>
   <testCaseLink>
      <guid>e6a59c7a-5a12-4fca-bae4-3d09566ecd04</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/SCENARIOS/N.1 Wrong password Login</testCaseId>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
   </testCaseLink>
</TestSuiteEntity>
