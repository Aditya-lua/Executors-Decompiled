/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008fbe48
 */

/* cpr::CurlContainer<cpr::Parameter>::Add(std::initializer_list<cpr::Parameter> const&) */

void __thiscall
cpr::CurlContainer<cpr::Parameter>::Add
          (CurlContainer<cpr::Parameter> *this,initializer_list *param_1)

{
  ulong *puVar1;
  long lVar2;
  Parameter *pPVar3;
  long lVar4;
  ulong local_78;
  ulong uStack_70;
  void *local_68;
  ulong local_60;
  ulong uStack_58;
  void *local_50;
  long local_48;
  
  lVar2 = tpidr_el0;
  local_48 = *(long *)(lVar2 + 0x28);
  if (*(long *)(param_1 + 8) != 0) {
    pPVar3 = *(Parameter **)param_1;
    lVar4 = *(long *)(param_1 + 8) * 0x30;
    do {
      Parameter::Parameter((Parameter *)&local_78,pPVar3);
      puVar1 = *(ulong **)(this + 0x10);
      if (puVar1 < *(ulong **)(this + 0x18)) {
        puVar1[2] = (ulong)local_68;
        puVar1[1] = uStack_70;
        *puVar1 = local_78;
        uStack_70 = 0;
        local_68 = (void *)0x0;
        local_78 = 0;
        puVar1[5] = (ulong)local_50;
        puVar1[4] = uStack_58;
        puVar1[3] = local_60;
        uStack_58 = 0;
        local_50 = (void *)0x0;
        local_60 = 0;
        *(long *)(this + 0x10) = *(long *)(this + 0x10) + 0x30;
      }
      else {
                    /* try { // try from 008fbef0 to 008fbefb has its CatchHandler @ 008fbf54 */
        std::__ndk1::vector<cpr::Parameter,std::__ndk1::allocator<cpr::Parameter>>::
        __push_back_slow_path<cpr::Parameter>
                  ((vector<cpr::Parameter,std::__ndk1::allocator<cpr::Parameter>> *)(this + 8),
                   (Parameter *)&local_78);
        if ((local_60 & 1) != 0) {
          operator_delete(local_50);
        }
        if ((local_78 & 1) != 0) {
          operator_delete(local_68);
        }
      }
      lVar4 = lVar4 + -0x30;
      pPVar3 = pPVar3 + 0x30;
    } while (lVar4 != 0);
  }
  if (*(long *)(lVar2 + 0x28) != local_48) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return;
}

