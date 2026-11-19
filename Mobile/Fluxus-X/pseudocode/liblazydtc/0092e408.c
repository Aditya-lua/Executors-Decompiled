/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0092e408
 */

void FUN_0092e408(long param_1)

{
  long lVar1;
  int iVar2;
  undefined4 uVar3;
  undefined8 uVar4;
  undefined8 local_58;
  undefined8 uStack_50;
  undefined8 local_48;
  undefined8 uStack_40;
  long local_38;
  
  lVar1 = tpidr_el0;
  local_38 = *(long *)(lVar1 + 0x28);
  uVar4 = *(undefined8 *)(param_1 + 0xc0);
  FUN_0092bcf8(param_1,&local_58);
  iVar2 = FUN_0092dfc0(uVar4,param_1,&local_58,(undefined8 *)(param_1 + 0x90));
  if (iVar2 == 0) {
    *(undefined8 *)(param_1 + 0xa8) = uStack_40;
    *(undefined8 *)(param_1 + 0xa0) = local_48;
    *(undefined8 *)(param_1 + 0x98) = uStack_50;
    *(undefined8 *)(param_1 + 0x90) = local_58;
  }
  uVar3 = 0;
  if (iVar2 != 0) {
    uVar3 = 0x2a;
  }
  if (*(long *)(lVar1 + 0x28) != local_38) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail(uVar3);
  }
  return;
}

