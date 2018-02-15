# spock-spy-testcase
Testcase for issue with Spock spy creation

This is a reduced testcase that shows how creating a Spy for a provided instance fails when the spy is assigned
to a variable of interface type.

The first two testcases fail normally, since the class under test really does call Dao.expensive, when it's
expected not to. The third case errors, since the creation of the spy fails.
