/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008ef2dc
 */

/* cpr::Session::SetRange(cpr::Range const&) */

void cpr::Session::SetRange(Range *param_1)

{
  void *pvVar1;
  long lVar2;
  byte local_50 [16];
  void *local_40;
  long local_38;
  
  lVar2 = tpidr_el0;
  local_38 = *(long *)(lVar2 + 0x28);
  Range::str();
  pvVar1 = (void *)((ulong)local_50 | 1);
  if ((local_50[0] & 1) != 0) {
    pvVar1 = local_40;
  }
                    /* try { // try from 008ef32c to 008ef333 has its CatchHandler @ 008ef36c */
  curl_easy_setopt(**(undefined8 **)(param_1 + 0x18),0x2717,pvVar1);
  if ((local_50[0] & 1) != 0) {
    operator_delete(local_40);
  }
  if (*(long *)(lVar2 + 0x28) != local_38) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return;
}

