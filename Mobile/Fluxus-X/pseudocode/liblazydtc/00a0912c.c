/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a0912c
 */

undefined8 bn_mod_sub_fixed_top(long *param_1,long *param_2,long *param_3,long *param_4)

{
  long lVar1;
  ulong uVar2;
  int iVar3;
  int iVar4;
  int iVar5;
  long lVar6;
  long lVar7;
  long lVar8;
  undefined8 uVar9;
  ulong uVar10;
  ulong uVar11;
  long lVar12;
  ulong uVar13;
  ulong uVar14;
  ulong uVar15;
  long lVar16;
  long lVar17;
  ulong uVar18;
  long lVar19;
  ulong uVar20;
  
  iVar5 = (int)param_4[1];
  lVar8 = bn_wexpand(param_1,iVar5);
  uVar9 = 0;
  if (lVar8 != 0) {
    lVar12 = *param_1;
    lVar8 = lVar12;
    if (*param_2 != 0) {
      lVar8 = *param_2;
    }
    lVar19 = lVar12;
    if (*param_3 != 0) {
      lVar19 = *param_3;
    }
    if (iVar5 != 0) {
      lVar6 = param_2[1];
      iVar3 = *(int *)((long)param_2 + 0xc);
      lVar7 = param_3[1];
      iVar4 = *(int *)((long)param_3 + 0xc);
      uVar15 = 0;
      uVar18 = 0;
      lVar16 = 0;
      uVar14 = 0;
      lVar17 = 0;
      uVar13 = (ulong)iVar5;
      do {
        lVar1 = lVar16 * 8;
        lVar16 = lVar16 - ((long)((1 - (long)iVar3) + uVar18) >> 0x3f);
        uVar10 = *(ulong *)(lVar8 + lVar1) & (long)(uVar18 - (long)(int)lVar6) >> 0x3f;
        uVar11 = *(ulong *)(lVar19 + lVar17 * 8) & (long)(uVar18 - (long)(int)lVar7) >> 0x3f;
        lVar1 = (1 - (long)iVar4) + uVar18;
        *(ulong *)(lVar12 + uVar18 * 8) = (uVar10 + uVar15) - uVar11;
        if (uVar10 != uVar11) {
          uVar14 = (ulong)(uVar10 < uVar11);
        }
        uVar18 = uVar18 + 1;
        lVar17 = lVar17 - (lVar1 >> 0x3f);
        uVar15 = -uVar14;
      } while (uVar18 < uVar13);
      if (iVar5 != 0) {
        lVar8 = *param_4;
        uVar18 = 0;
        uVar10 = 0;
        do {
          lVar19 = uVar18 * 8;
          uVar18 = uVar18 + 1;
          uVar20 = *(ulong *)(lVar8 + lVar19) & uVar15;
          uVar11 = uVar20 + uVar10;
          uVar2 = 2;
          if (!CARRY8(uVar20,uVar10)) {
            uVar2 = 1;
          }
          uVar10 = (ulong)CARRY8(uVar20,uVar10);
          if (CARRY8(uVar11,*(ulong *)(lVar12 + lVar19))) {
            uVar10 = uVar2;
          }
          *(ulong *)(lVar12 + lVar19) = uVar11 + *(ulong *)(lVar12 + lVar19);
        } while (uVar18 < uVar13);
        if (iVar5 != 0) {
          uVar18 = 0;
          uVar15 = 0;
          do {
            lVar19 = uVar18 * 8;
            uVar18 = uVar18 + 1;
            uVar20 = *(ulong *)(lVar8 + lVar19) & uVar10 - uVar14;
            uVar11 = uVar20 + uVar15;
            uVar2 = 2;
            if (!CARRY8(uVar20,uVar15)) {
              uVar2 = 1;
            }
            uVar15 = (ulong)CARRY8(uVar20,uVar15);
            if (CARRY8(uVar11,*(ulong *)(lVar12 + lVar19))) {
              uVar15 = uVar2;
            }
            *(ulong *)(lVar12 + lVar19) = uVar11 + *(ulong *)(lVar12 + lVar19);
          } while (uVar18 < uVar13);
        }
      }
    }
    uVar9 = 1;
    *(int *)(param_1 + 1) = iVar5;
    *(undefined4 *)(param_1 + 2) = 0;
  }
  return uVar9;
}

