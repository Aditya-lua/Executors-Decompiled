/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0088b6b8
 */

void FUN_0088b6b8(long param_1,long param_2)

{
  uint uVar1;
  uint uVar2;
  int iVar3;
  long lVar4;
  undefined8 uVar5;
  undefined1 auVar6 [16];
  undefined1 auStack_78 [48];
  long local_48;
  int local_40;
  long local_38;
  
  lVar4 = tpidr_el0;
  local_38 = *(long *)(lVar4 + 0x28);
  auVar6 = FUN_0088df20(param_1,*(undefined8 *)(param_2 + 0x20));
  auVar6._0_8_ = auVar6._0_8_;
  if (auVar6._0_4_ < 0) {
    iVar3 = *(int *)(param_1 + 0x64c);
    uVar1 = iVar3 + 1;
    local_48 = param_1;
    local_40 = iVar3;
    if (uVar1 < 0x100) {
      uVar5 = *(undefined8 *)(param_2 + 0x28);
      *(uint *)(param_1 + 0x64c) = uVar1;
      uVar2 = *(uint *)(param_1 + 0x650);
      if (*(uint *)(param_1 + 0x650) <= uVar1) {
        uVar2 = uVar1;
      }
      *(uint *)(param_1 + 0x650) = uVar2;
                    /* try { // try from 0088b750 to 0088b75f has its CatchHandler @ 0088b7f0 */
      FUN_0088d1d0(param_1,uVar5,iVar3,1);
                    /* try { // try from 0088b764 to 0088b78b has its CatchHandler @ 0088b7e4 */
      FUN_00899540(auStack_78,param_1,*(undefined8 *)(param_2 + 0x20),&local_48);
      auVar6 = FUN_00892774(param_1,auStack_78,iVar3,1,*(undefined8 *)(param_2 + 0x20));
      *(int *)(local_48 + 0x64c) = local_40;
      if (*(long *)(lVar4 + 0x28) == local_38) {
        return;
      }
    }
    else if (*(long *)(lVar4 + 0x28) == local_38) {
                    /* try { // try from 0088b7cc to 0088b7e3 has its CatchHandler @ 0088b7f0 */
                    /* WARNING: Subroutine does not return */
      FUN_0087fcd8(param_2 + 0xc,
                   "Out of registers when trying to allocate %d registers: exceeded limit %d",1,0xff
                  );
    }
  }
  else {
    auVar6._8_8_ = *(undefined8 *)(param_2 + 0x28);
    auVar6._0_8_ = auVar6._0_8_;
    if (*(long *)(lVar4 + 0x28) == local_38) {
      FUN_0088d1d0(param_1,*(undefined8 *)(param_2 + 0x28),auVar6._0_8_ & 0xffffffff,0);
      return;
    }
  }
                    /* WARNING: Subroutine does not return */
  __stack_chk_fail(auVar6._0_8_,auVar6._8_8_);
}

