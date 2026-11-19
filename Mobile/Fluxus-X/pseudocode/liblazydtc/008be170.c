/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008be170
 */

long FUN_008be170(long param_1,long *param_2)

{
  int iVar1;
  long lVar2;
  long *plVar3;
  long lVar4;
  long lVar5;
  
  iVar1 = *(int *)((long)param_2 + 0xc);
  if (iVar1 == 2) {
    if ((*(uint *)(param_2 + 1) < 0x80) &&
       (lVar2 = *(long *)(*(long *)(param_1 + 0x60) + (ulong)*(uint *)(param_2 + 1) * 8 + 0x4c68),
       lVar2 != 0)) {
      return lVar2;
    }
LAB_008be1f8:
    lVar5 = (long)iVar1;
    lVar4 = *(long *)(param_1 + 0x60);
    lVar2 = *(long *)(lVar4 + lVar5 * 8 + 0x448);
    if (lVar2 != 0) {
      plVar3 = (long *)FUN_008bb440(lVar2,*(undefined8 *)(lVar4 + 0x3d0));
      if (*(int *)((long)plVar3 + 0xc) == 5) goto LAB_008be220;
      lVar4 = *(long *)(param_1 + 0x60);
      lVar5 = (long)*(int *)((long)param_2 + 0xc);
    }
    lVar2 = *(long *)(lVar4 + lVar5 * 8 + 0x3e0);
  }
  else {
    if (((iVar1 != 8) || (*(char *)(*param_2 + 3) == -0x7f)) ||
       (lVar2 = *(long *)(*param_2 + 8), lVar2 == 0)) goto LAB_008be1f8;
    plVar3 = (long *)FUN_008bb440(lVar2,*(undefined8 *)(*(long *)(param_1 + 0x60) + 0x3d0));
    if (*(int *)((long)plVar3 + 0xc) != 5) {
      plVar3 = (long *)(*(long *)(param_1 + 0x60) + (long)*(int *)((long)param_2 + 0xc) * 8 + 0x3e0)
      ;
    }
LAB_008be220:
    lVar2 = *plVar3;
  }
  return lVar2;
}

