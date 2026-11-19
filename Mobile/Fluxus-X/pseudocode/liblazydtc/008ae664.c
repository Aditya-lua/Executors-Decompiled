/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008ae664
 */

uint FUN_008ae664(long param_1,uint param_2)

{
  int iVar1;
  double *pdVar2;
  double *pdVar3;
  uint uVar4;
  long lVar5;
  long lVar6;
  double dVar7;
  
  lVar6 = *(long *)(param_1 + 0x60);
  if ((int)param_2 < 1) {
    if ((int)param_2 < -9999) {
      pdVar3 = (double *)FUN_008aea7c(param_1);
      iVar1 = *(int *)((long)pdVar3 + 0xc);
      goto joined_r0x008ae77c;
    }
    pdVar3 = (double *)(*(long *)(param_1 + 0x68) + (long)(int)param_2 * 0x10);
  }
  else {
    pdVar3 = (double *)(*(long *)(param_1 + 0x70) + (ulong)param_2 * 0x10 + -0x10);
    if (*(double **)(param_1 + 0x68) <= pdVar3) {
      if (((DAT_00d1f1e0 & 1) == 0) && (iVar1 = __cxa_guard_acquire(&DAT_00d1f1e0), iVar1 != 0)) {
                    /* try { // try from 008ae7b4 to 008ae7b7 has its CatchHandler @ 008ae7cc */
        DAT_00d1f1d8 = FUN_007fe1ec(DAT_00cca8c8);
        __cxa_guard_release(&DAT_00d1f1e0);
      }
      pdVar3 = (double *)((long)&DWORD_007f2ef0 + DAT_00d1f1d8);
      iVar1 = *(int *)((long)&QWORD_007f2ef9 + DAT_00d1f1d8 + 3);
      goto joined_r0x008ae77c;
    }
  }
  iVar1 = *(int *)((long)pdVar3 + 0xc);
joined_r0x008ae77c:
  if (iVar1 == 0) {
    uVar4 = 0;
  }
  else {
    lVar5 = *(long *)(*(long *)(param_1 + 0x60) + 0x620);
    uVar4 = *(uint *)(lVar6 + 0x630) & 0xfffffff;
    if (uVar4 == 0) {
      iVar1 = FUN_008bcf64(lVar5);
      uVar4 = iVar1 + 1;
    }
    pdVar2 = (double *)FUN_008bcd04(param_1,lVar5,uVar4);
    if ((*(uint *)(lVar6 + 0x630) & 0xfffffff) != 0) {
      *(uint *)(lVar6 + 0x630) = *(uint *)(lVar6 + 0x630) & 0xf0000000 | (int)*pdVar2 & 0xfffffffU;
    }
    dVar7 = *pdVar3;
    pdVar2[1] = pdVar3[1];
    *pdVar2 = dVar7;
    if (((4 < *(int *)((long)pdVar3 + 0xc)) && ((*(byte *)(lVar5 + 2) >> 2 & 1) != 0)) &&
       ((*(byte *)((long)*pdVar3 + 2) & 3) != 0)) {
      FUN_008b6370(param_1,lVar5);
    }
  }
  return uVar4;
}

