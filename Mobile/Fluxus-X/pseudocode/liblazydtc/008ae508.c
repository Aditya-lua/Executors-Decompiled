/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008ae508
 */

long FUN_008ae508(long param_1,undefined8 param_2,undefined4 param_3)

{
  long lVar1;
  int iVar2;
  long lVar3;
  long *plVar4;
  long lVar5;
  ulong uVar6;
  undefined4 local_3c;
  long local_38;
  
  lVar1 = tpidr_el0;
  local_38 = *(long *)(lVar1 + 0x28);
  if (*(ulong *)(*(long *)(param_1 + 0x60) + 8) <= *(ulong *)(*(long *)(param_1 + 0x60) + 0x10)) {
    FUN_008b52c4(param_1,1);
  }
  if ((*(byte *)(param_1 + 2) >> 2 & 1) != 0) {
    FUN_008b63a4(param_1,param_1,param_1 + 0x38);
  }
  lVar3 = *(long *)(param_1 + 0x50);
  lVar5 = *(long *)(param_1 + 0x68);
  uVar6 = *(ulong *)(lVar3 + 0x18);
  if (uVar6 < lVar5 + 0x10U) {
    if (0x1f3f0 < lVar5 - *(long *)(param_1 + 0x70)) {
LAB_008ae638:
      FUN_008b9568(param_1,"stack overflow");
      if (*(long *)(lVar1 + 0x28) == local_38) {
        FUN_008aa5f4(param_1);
      }
      goto LAB_008ae660;
    }
    if (*(long *)(param_1 + 0x48) - lVar5 < 0x11) {
      local_3c = 1;
      iVar2 = FUN_008b3edc(param_1,&LAB_008aa604,&local_3c);
      if (iVar2 != 0) goto LAB_008ae638;
      lVar3 = *(long *)(param_1 + 0x50);
      lVar5 = *(long *)(param_1 + 0x68);
      uVar6 = *(ulong *)(lVar3 + 0x18);
    }
    if (uVar6 < lVar5 + 0x10U) {
      *(ulong *)(lVar3 + 0x18) = lVar5 + 0x10U;
    }
  }
  lVar3 = FUN_008be288(param_1,param_2,param_3);
  plVar4 = *(long **)(param_1 + 0x68);
  *plVar4 = lVar3;
  lVar5 = *(long *)(param_1 + 0x68);
  *(undefined4 *)((long)plVar4 + 0xc) = 8;
  *(long *)(param_1 + 0x68) = lVar5 + 0x10;
  if (*(long *)(lVar1 + 0x28) == local_38) {
    return lVar3 + 0x10;
  }
LAB_008ae660:
                    /* WARNING: Subroutine does not return */
  __stack_chk_fail();
}

