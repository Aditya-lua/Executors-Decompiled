/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008ee92c
 */

/* cpr::Session::SetCookies(cpr::Cookies const&) */

void __thiscall cpr::Session::SetCookies(Session *this,Cookies *param_1)

{
  void *pvVar1;
  long lVar2;
  undefined8 uVar3;
  byte local_50 [16];
  void *local_40;
  long local_38;
  
  lVar2 = tpidr_el0;
  local_38 = *(long *)(lVar2 + 0x28);
  curl_easy_setopt(**(undefined8 **)(this + 0x18),0x2797,&DAT_002d4f78);
  uVar3 = *(undefined8 *)*(CurlHolder **)(this + 0x18);
  Cookies::GetEncoded(param_1,*(CurlHolder **)(this + 0x18));
  pvVar1 = (void *)((ulong)local_50 | 1);
  if ((local_50[0] & 1) != 0) {
    pvVar1 = local_40;
  }
                    /* try { // try from 008ee998 to 008ee9a3 has its CatchHandler @ 008ee9dc */
  curl_easy_setopt(uVar3,0x2726,pvVar1);
  if ((local_50[0] & 1) != 0) {
    operator_delete(local_40);
  }
  if (*(long *)(lVar2 + 0x28) != local_38) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return;
}

