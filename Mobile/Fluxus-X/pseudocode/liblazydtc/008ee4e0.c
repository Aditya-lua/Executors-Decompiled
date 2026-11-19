/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008ee4e0
 */

/* cpr::Session::SetPayload(cpr::Payload&&) */

void __thiscall cpr::Session::SetPayload(Session *this,Payload *param_1)

{
  ulong uVar1;
  void *pvVar2;
  long lVar3;
  byte local_50 [8];
  ulong local_48;
  void *local_40;
  long local_38;
  
  lVar3 = tpidr_el0;
  local_38 = *(long *)(lVar3 + 0x28);
  this[0x10] = (Session)0x1;
  CurlContainer<cpr::Pair>::GetContent((CurlHolder *)param_1);
  uVar1 = (ulong)(local_50[0] >> 1);
  if ((local_50[0] & 1) != 0) {
    uVar1 = local_48;
  }
                    /* try { // try from 008ee540 to 008ee56b has its CatchHandler @ 008ee5a4 */
  curl_easy_setopt(**(undefined8 **)(this + 0x18),0x75a8,uVar1);
  pvVar2 = (void *)((ulong)local_50 | 1);
  if ((local_50[0] & 1) != 0) {
    pvVar2 = local_40;
  }
  curl_easy_setopt(**(undefined8 **)(this + 0x18),0x27b5,pvVar2);
  if ((local_50[0] & 1) != 0) {
    operator_delete(local_40);
  }
  if (*(long *)(lVar3 + 0x28) != local_38) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return;
}

