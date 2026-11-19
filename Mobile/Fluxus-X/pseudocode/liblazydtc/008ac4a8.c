/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008ac4a8
 */

void FUN_008ac4a8(long param_1,char *param_2)

{
  long lVar1;
  int iVar2;
  size_t sVar3;
  long lVar4;
  long lVar5;
  ulong uVar6;
  undefined4 local_3c;
  long local_38;
  
  lVar1 = tpidr_el0;
  local_38 = *(long *)(lVar1 + 0x28);
  if (param_2 != (char *)0x0) {
    sVar3 = strlen(param_2);
    if (*(long *)(lVar1 + 0x28) == local_38) {
      FUN_008ac34c(param_1,param_2,sVar3);
      return;
    }
    goto LAB_008ac5e0;
  }
  lVar5 = *(long *)(param_1 + 0x50);
  lVar4 = *(long *)(param_1 + 0x68);
  uVar6 = *(ulong *)(lVar5 + 0x18);
  if (uVar6 < lVar4 + 0x10U) {
    if (0x1f3f0 < lVar4 - *(long *)(param_1 + 0x70)) {
LAB_008ac5b8:
      FUN_008b9568(param_1,"stack overflow");
      if (*(long *)(lVar1 + 0x28) == local_38) {
        FUN_008aa5f4(param_1);
      }
      goto LAB_008ac5e0;
    }
    if (*(long *)(param_1 + 0x48) - lVar4 < 0x11) {
      local_3c = 1;
      iVar2 = FUN_008b3edc(param_1,&LAB_008aa604,&local_3c);
      if (iVar2 != 0) goto LAB_008ac5b8;
      lVar5 = *(long *)(param_1 + 0x50);
      lVar4 = *(long *)(param_1 + 0x68);
      uVar6 = *(ulong *)(lVar5 + 0x18);
    }
    if (uVar6 < lVar4 + 0x10U) {
      *(ulong *)(lVar5 + 0x18) = lVar4 + 0x10U;
    }
  }
  *(undefined4 *)(lVar4 + 0xc) = 0;
  *(long *)(param_1 + 0x68) = lVar4 + 0x10;
  if (*(long *)(lVar1 + 0x28) == local_38) {
    return;
  }
LAB_008ac5e0:
                    /* WARNING: Subroutine does not return */
  __stack_chk_fail();
}

