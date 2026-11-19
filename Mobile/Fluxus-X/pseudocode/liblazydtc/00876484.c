/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00876484
 */

void FUN_00876484(long param_1,void *param_2,ulong param_3)

{
  ulong uVar1;
  long lVar2;
  long lVar3;
  int iVar4;
  ulong *puVar5;
  void *__dest;
  void *local_60;
  ulong uStack_58;
  void *local_50;
  long local_48;
  
  lVar2 = tpidr_el0;
  local_48 = *(long *)(lVar2 + 0x28);
  local_60 = param_2;
  uStack_58 = param_3;
  if (((ulong)(*(long *)(param_1 + 0x240) * 3) >> 2 <= *(ulong *)(param_1 + 0x248)) &&
     (lVar3 = FUN_0087bef8(param_1 + 0x220,&local_60), lVar3 == 0)) {
    FUN_0087bff0(param_1 + 0x220);
  }
  lVar3 = FUN_0087bdcc(param_1 + 0x220,&local_60);
  iVar4 = *(int *)(lVar3 + 0x10);
  if (iVar4 == 0) {
    iVar4 = *(int *)(param_1 + 0x248);
    *(int *)(lVar3 + 0x10) = iVar4;
    if ((*(byte *)(param_1 + 0x2c0) & 1) != 0) {
      FUN_00874d58(param_1 + 600,&local_60);
      iVar4 = *(int *)(lVar3 + 0x10);
    }
  }
  *(int *)(*(long *)(param_1 + 8) + (ulong)*(uint *)(param_1 + 0x20) * 0x88 + 0x1c) = iVar4;
  if ((*(ulong *)(param_1 + 0x318) & 1) != 0 || *(long *)(param_1 + 0x310) != 0) {
    if (0xfffffffffffffff7 < param_3) {
      if (*(long *)(lVar2 + 0x28) == local_48) {
                    /* WARNING: Subroutine does not return */
        FUN_007fe124();
      }
      goto LAB_00876624;
    }
    if (param_3 < 0x17) {
      __dest = (void *)((ulong)&local_60 | 1);
      local_60 = (void *)CONCAT71(local_60._1_7_,(char)((int)param_3 << 1));
      if (param_3 != 0) goto LAB_00876598;
    }
    else {
      uVar1 = 0x1a;
      if ((param_3 | 7) != 0x17) {
        uVar1 = (param_3 | 7) + 1;
      }
      __dest = operator_new(uVar1);
      local_60 = (void *)(uVar1 | 1);
      uStack_58 = param_3;
      local_50 = __dest;
LAB_00876598:
      memmove(__dest,param_2,param_3);
    }
    *(undefined1 *)((long)__dest + param_3) = 0;
    lVar3 = *(long *)(param_1 + 8) + (ulong)*(uint *)(param_1 + 0x20) * 0x88;
    puVar5 = (ulong *)(lVar3 + 0x40);
    if ((*(byte *)puVar5 & 1) != 0) {
      operator_delete(*(void **)(lVar3 + 0x50),*puVar5 & 0xfffffffffffffffe);
    }
    *(ulong *)(lVar3 + 0x48) = uStack_58;
    *puVar5 = (ulong)local_60;
    *(void **)(lVar3 + 0x50) = local_50;
  }
  if (*(long *)(lVar2 + 0x28) == local_48) {
    return;
  }
LAB_00876624:
                    /* WARNING: Subroutine does not return */
  __stack_chk_fail();
}

