/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008f00e4
 */

/* cpr::Session::Post() */

void cpr::Session::Post(void)

{
  Session *in_x0;
  
  PreparePost(in_x0);
  if (*(long *)(in_x0 + 0x2a0) == 0) {
    DoEasyPerform(in_x0);
    Complete();
    return;
  }
  intercept();
  return;
}

