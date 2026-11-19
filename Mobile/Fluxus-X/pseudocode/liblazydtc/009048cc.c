/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009048cc
 */

void FUN_009048cc(undefined8 param_1,undefined8 param_2,undefined8 param_3,undefined8 param_4,
                 undefined8 param_5,undefined8 param_6,undefined8 param_7,undefined8 param_8)

{
  undefined4 uVar1;
  long lVar2;
  int iVar3;
  undefined4 uVar4;
  undefined8 local_a0;
  undefined8 uStack_98;
  undefined8 local_90;
  undefined8 uStack_88;
  undefined8 local_80;
  undefined8 uStack_78;
  undefined1 *local_50;
  long lStack_48;
  undefined8 *puStack_40;
  undefined8 uStack_38;
  long local_28;
  
  lVar2 = tpidr_el0;
  local_28 = *(long *)(lVar2 + 0x28);
  puStack_40 = &local_a0;
  lStack_48 = (long)register0x00000008 + -0x70;
  uStack_38 = 0xffffff80ffffffd0;
  local_a0 = param_3;
  uStack_98 = param_4;
  local_90 = param_5;
  uStack_88 = param_6;
  local_80 = param_7;
  uStack_78 = param_8;
  local_50 = (undefined1 *)register0x00000008;
  iVar3 = FUN_0092a3d4(param_1,param_2,&local_50);
  uVar4 = 100;
  if (iVar3 != 2) {
    uVar4 = 0x1b;
  }
  uVar1 = 0;
  if (iVar3 != 0) {
    uVar1 = uVar4;
  }
  if (*(long *)(lVar2 + 0x28) != local_28) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail(uVar1);
  }
  return;
}

