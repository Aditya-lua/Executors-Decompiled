/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00875070
 */

void FUN_00875070(long param_1,undefined8 param_2,undefined8 param_3)

{
  long lVar1;
  long lVar2;
  uint uVar3;
  undefined4 local_88 [2];
  ulong local_80;
  undefined8 uStack_78;
  undefined8 local_70;
  undefined8 uStack_68;
  undefined8 local_60;
  ulong uStack_58;
  undefined8 uStack_50;
  undefined8 uStack_48;
  undefined8 local_40;
  long local_38;
  
  lVar1 = tpidr_el0;
  local_38 = *(long *)(lVar1 + 0x28);
  local_60 = param_2;
  uStack_58 = param_3;
  if (((ulong)(*(long *)(param_1 + 0x240) * 3) >> 2 <= *(ulong *)(param_1 + 0x248)) &&
     (lVar2 = FUN_0087bef8(param_1 + 0x220,&local_60), lVar2 == 0)) {
    FUN_0087bff0(param_1 + 0x220);
  }
  lVar2 = FUN_0087bdcc(param_1 + 0x220,&local_60);
  uVar3 = *(uint *)(lVar2 + 0x10);
  if (uVar3 == 0) {
    uVar3 = *(uint *)(param_1 + 0x248);
    *(uint *)(lVar2 + 0x10) = uVar3;
    if ((*(byte *)(param_1 + 0x2c0) & 1) != 0) {
      FUN_00874d58(param_1 + 600,&local_60);
      uVar3 = *(uint *)(lVar2 + 0x10);
    }
  }
  local_40 = 0;
  local_88[0] = 5;
  local_70 = 0;
  uStack_68 = 0;
  uStack_48 = 0;
  uStack_50 = 0;
  uStack_58 = (ulong)uVar3;
  local_80 = (ulong)uVar3;
  local_60 = 5;
  uStack_78 = 0;
  FUN_00874b84(param_1,local_88,&local_60);
  if (*(long *)(lVar1 + 0x28) != local_38) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return;
}

