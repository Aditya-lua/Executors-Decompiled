/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008f01bc
 */

/* cpr::Session::Put() */

void cpr::Session::Put(void)

{
  Session *in_x0;
  
  PreparePut(in_x0);
  if (*(long *)(in_x0 + 0x2a0) == 0) {
    DoEasyPerform(in_x0);
    Complete();
    return;
  }
  intercept();
  return;
}

