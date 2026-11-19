/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008ba594
 */

undefined8 FUN_008ba594(undefined8 param_1,long param_2,double *param_3)

{
  long lVar1;
  uint uVar2;
  bool bVar3;
  int iVar4;
  ulong uVar5;
  double *pdVar6;
  int iVar7;
  ulong uVar8;
  long lVar9;
  long lVar10;
  double dVar11;
  
  if (*(int *)((long)param_3 + 0xc) == 3) {
    dVar11 = *param_3;
    iVar4 = (int)dVar11;
    uVar5 = (ulong)(iVar4 - 1);
    bVar3 = false;
    if ((0 < iVar4) && (bVar3 = false, !NAN(dVar11) && !NAN((double)iVar4))) {
      bVar3 = dVar11 == (double)iVar4;
    }
    if ((bVar3) && (iVar7 = *(int *)(param_2 + 8), iVar4 <= iVar7)) goto LAB_008ba670;
  }
  else if (*(int *)((long)param_3 + 0xc) == 0) {
    iVar7 = *(int *)(param_2 + 8);
    uVar5 = 0xffffffff;
    goto LAB_008ba670;
  }
  lVar9 = FUN_008bd784(param_2,param_3);
  while( true ) {
    iVar4 = FUN_008b92ec((double *)(lVar9 + 0x10),param_3);
    if (iVar4 != 0) break;
    uVar2 = *(uint *)(lVar9 + 0x1c);
    if ((((uVar2 & 0xf) == 0xd) && (4 < *(int *)((long)param_3 + 0xc))) &&
       (*(double *)(lVar9 + 0x10) == *param_3)) break;
    if (uVar2 < 0x10) {
                    /* WARNING: Subroutine does not return */
      FUN_008b39cc(param_1,"invalid key to \'next\'");
    }
    lVar9 = lVar9 + ((long)((ulong)uVar2 << 0x20) >> 0x24) * 0x20;
  }
  iVar7 = *(int *)(param_2 + 8);
  uVar5 = (ulong)(uint)(iVar7 + (int)((ulong)(lVar9 - *(long *)(param_2 + 0x28)) >> 5));
LAB_008ba670:
  uVar2 = (int)uVar5 - iVar7;
  uVar8 = -(uVar5 >> 0x1f) & 0xfffffff000000000 | uVar5 << 4;
  lVar9 = (long)(int)uVar5 + 1;
  do {
    uVar2 = uVar2 + 1;
    if (iVar7 <= lVar9) {
      lVar9 = 1L << ((ulong)*(byte *)(param_2 + 5) & 0x3f);
      if ((int)lVar9 <= (int)uVar2) {
        return 0;
      }
      lVar10 = (long)(int)uVar2;
      uVar5 = -(ulong)(uVar2 >> 0x1f) & 0xffffffe000000000 | (ulong)uVar2 << 5;
      while (lVar1 = *(long *)(param_2 + 0x28) + uVar5, *(int *)(lVar1 + 0xc) == 0) {
        lVar10 = lVar10 + 1;
        uVar5 = uVar5 + 0x20;
        if (lVar9 <= lVar10) {
          return 0;
        }
      }
      *param_3 = *(double *)(lVar1 + 0x10);
      *(undefined4 *)(param_3 + 1) = *(undefined4 *)(lVar1 + 0x18);
      pdVar6 = (double *)(*(long *)(param_2 + 0x28) + uVar5);
      *(uint *)((long)param_3 + 0xc) = *(uint *)(lVar1 + 0x1c) & 0xf;
      goto LAB_008ba730;
    }
    lVar9 = lVar9 + 1;
    lVar10 = *(long *)(param_2 + 0x20) + uVar8;
    uVar8 = uVar8 + 0x10;
  } while (*(int *)(lVar10 + 0x1c) == 0);
  *(undefined4 *)((long)param_3 + 0xc) = 3;
  *param_3 = (double)(int)lVar9;
  pdVar6 = (double *)(*(long *)(param_2 + 0x20) + uVar8);
LAB_008ba730:
  dVar11 = *pdVar6;
  param_3[3] = pdVar6[1];
  param_3[2] = dVar11;
  return 1;
}

