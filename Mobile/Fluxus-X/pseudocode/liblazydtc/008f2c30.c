/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008f2c30
 */

/* cpr::Session::proceed() */

void cpr::Session::proceed(void)

{
  Session *in_x0;
  
  prepareCommon();
  if (*(long *)(in_x0 + 0x2a0) == 0) {
    DoEasyPerform(in_x0);
    Complete();
    return;
  }
  intercept();
  return;
}

