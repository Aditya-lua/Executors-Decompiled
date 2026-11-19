/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a97164
 */

void IDEA_set_decrypt_key(long param_1,int *param_2)

{
  uint *puVar1;
  int iVar2;
  uint uVar3;
  long lVar4;
  uint uVar5;
  ulong uVar6;
  uint uVar7;
  uint *puVar8;
  int *piVar9;
  int iVar10;
  ulong uVar11;
  long lVar12;
  ulong uVar13;
  ulong uVar14;
  long lVar15;
  long lVar16;
  ulong uVar17;
  
  uVar7 = 0;
  puVar8 = (uint *)(param_1 + 0xc0);
  piVar9 = param_2;
  do {
    uVar3 = *puVar8;
    iVar10 = 0;
    if (uVar3 != 0) {
      uVar5 = 0;
      if (uVar3 != 0) {
        uVar5 = 0x10001 / uVar3;
      }
      uVar5 = 0x10001 - uVar5 * uVar3;
      if (uVar5 == 0) {
        iVar10 = 1;
      }
      else {
        uVar6 = (ulong)uVar3;
        lVar12 = 0;
        uVar14 = (ulong)uVar5;
        lVar16 = 1;
        uVar17 = 0x10001;
        do {
          uVar11 = uVar6;
          lVar15 = 0;
          if (uVar11 != 0) {
            lVar15 = (long)uVar17 / (long)uVar11;
          }
          lVar4 = 0;
          if (uVar14 != 0) {
            lVar4 = (long)uVar11 / (long)uVar14;
          }
          uVar13 = uVar11 - lVar4 * uVar14;
          lVar15 = lVar12 - lVar15 * lVar16;
          uVar6 = uVar14;
          lVar12 = lVar16;
          uVar14 = uVar13;
          lVar16 = lVar15;
          uVar17 = uVar11;
        } while (uVar13 != 0);
        iVar10 = (int)lVar15 + 0x10001;
        if (-1 < lVar15) {
          iVar10 = (int)lVar15;
        }
      }
    }
    *piVar9 = iVar10;
    piVar9[1] = -puVar8[2] & 0xffff;
    piVar9[2] = -puVar8[1] & 0xffff;
    uVar3 = puVar8[3];
    iVar10 = 0;
    if (uVar3 != 0) {
      uVar5 = 0;
      if (uVar3 != 0) {
        uVar5 = 0x10001 / uVar3;
      }
      uVar5 = 0x10001 - uVar5 * uVar3;
      if (uVar5 == 0) {
        iVar10 = 1;
      }
      else {
        uVar6 = (ulong)uVar3;
        lVar12 = 0;
        uVar14 = (ulong)uVar5;
        lVar16 = 1;
        uVar17 = 0x10001;
        do {
          uVar11 = uVar6;
          lVar15 = 0;
          if (uVar11 != 0) {
            lVar15 = (long)uVar17 / (long)uVar11;
          }
          lVar4 = 0;
          if (uVar14 != 0) {
            lVar4 = (long)uVar11 / (long)uVar14;
          }
          uVar13 = uVar11 - lVar4 * uVar14;
          lVar15 = lVar12 - lVar15 * lVar16;
          uVar6 = uVar14;
          lVar12 = lVar16;
          uVar14 = uVar13;
          lVar16 = lVar15;
          uVar17 = uVar11;
        } while (uVar13 != 0);
        iVar10 = (int)lVar15 + 0x10001;
        if (-1 < lVar15) {
          iVar10 = (int)lVar15;
        }
      }
    }
    piVar9[3] = iVar10;
    if (uVar7 == 8) break;
    uVar7 = uVar7 + 1;
    piVar9[4] = puVar8[-2];
    puVar1 = puVar8 + -1;
    puVar8 = puVar8 + -6;
    piVar9[5] = *puVar1;
    piVar9 = piVar9 + 6;
  } while (uVar7 < 9);
  iVar10 = param_2[1];
  iVar2 = param_2[0x31];
  param_2[1] = param_2[2];
  param_2[2] = iVar10;
  param_2[0x31] = param_2[0x32];
  param_2[0x32] = iVar2;
  return;
}

