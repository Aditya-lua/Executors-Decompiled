/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008ac024
 */

void FUN_008ac024(long param_1)

{
  long lVar1;
  int iVar2;
  long lVar3;
  long lVar4;
  ulong uVar5;
  undefined4 local_2c;
  long local_28;
  
  lVar1 = tpidr_el0;
  local_28 = *(long *)(lVar1 + 0x28);
  lVar4 = *(long *)(param_1 + 0x50);
  lVar3 = *(long *)(param_1 + 0x68);
  uVar5 = *(ulong *)(lVar4 + 0x18);
  if (uVar5 < lVar3 + 0x10U) {
    if (0x1f3f0 < lVar3 - *(long *)(param_1 + 0x70)) {
LAB_008ac0f0:
      FUN_008b9568(param_1,"stack overflow");
      if (*(long *)(lVar1 + 0x28) == local_28) {
        FUN_008aa5f4(param_1);
      }
      goto LAB_008ac118;
    }
    if (*(long *)(param_1 + 0x48) - lVar3 < 0x11) {
      local_2c = 1;
      iVar2 = FUN_008b3edc(param_1,&LAB_008aa604,&local_2c);
      if (iVar2 != 0) goto LAB_008ac0f0;
      lVar4 = *(long *)(param_1 + 0x50);
      lVar3 = *(long *)(param_1 + 0x68);
      uVar5 = *(ulong *)(lVar4 + 0x18);
    }
    if (uVar5 < lVar3 + 0x10U) {
      *(ulong *)(lVar4 + 0x18) = lVar3 + 0x10U;
    }
  }
  *(undefined4 *)(lVar3 + 0xc) = 0;
  *(long *)(param_1 + 0x68) = lVar3 + 0x10;
  if (*(long *)(lVar1 + 0x28) == local_28) {
    return;
  }
LAB_008ac118:
                    /* WARNING: Subroutine does not return */
  __stack_chk_fail();
}

