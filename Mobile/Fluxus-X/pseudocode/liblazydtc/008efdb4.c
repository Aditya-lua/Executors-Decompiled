/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008efdb4
 */

/* cpr::Session::Get() */

void cpr::Session::Get(void)

{
  Session *in_x0;
  
  PrepareGet(in_x0);
  if (*(long *)(in_x0 + 0x2a0) == 0) {
    DoEasyPerform(in_x0);
    Complete();
    return;
  }
  intercept();
  return;
}

