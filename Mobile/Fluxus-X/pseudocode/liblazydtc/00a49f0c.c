/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a49f0c
 */

void FUN_00a49f0c(ulong param_1,ushort *param_2,int param_3)

{
  undefined8 *puVar1;
  uint uVar2;
  uint uVar3;
  int iVar4;
  uint uVar5;
  uint uVar6;
  uint uVar7;
  ulong uVar8;
  ulong uVar9;
  uint uVar10;
  ulong uVar11;
  undefined8 *puVar12;
  int *piVar13;
  uint uVar14;
  undefined8 uVar15;
  undefined8 uVar16;
  undefined8 uVar17;
  
  uVar6 = param_3 + 1;
  uVar8 = (ulong)*param_2;
  uVar10 = 1;
  uVar5 = 0;
  if (uVar6 != 0) {
    uVar5 = 0x1be / uVar6;
  }
  uVar2 = 1 << (ulong)(uVar6 & 0x1f);
  uVar6 = uVar5 + 1;
  *(undefined8 *)(param_1 + (ulong)(uVar5 + 2) * 8) = 0xffffffff;
  do {
    if (uVar10 < 0x1c) {
      uVar8 = (*(ulong *)(param_2 + (ulong)(uVar10 >> 2) * 4) >> ((uVar10 & 3) << 4) & 0xffff) *
              0x10000 + uVar8;
    }
    if ((uVar8 & 0xffff) != 0) {
      piVar13 = (int *)(param_1 + 4 + (long)(int)uVar6 * 8);
      do {
        uVar7 = (uint)uVar8;
        uVar3 = (uVar7 & 0xaaaaaaaa) >> 1 | (uVar7 & 0x55555555) << 1;
        uVar3 = (uVar3 & 0xcccccccc) >> 2 | (uVar3 & 0x33333333) << 2;
        uVar3 = (uVar3 & 0xf0f0f0f0) >> 4 | (uVar3 & 0xf0f0f0f) << 4;
        uVar3 = (uVar3 & 0xff00ff00) >> 8 | (uVar3 & 0xff00ff) << 8;
        uVar14 = (uint)LZCOUNT(uVar3 >> 0x10 | uVar3 << 0x10);
        uVar7 = uVar7 >> (ulong)(uVar14 & 0x1f);
        uVar3 = 0;
        if ((uVar7 & uVar2) != 0) {
          uVar3 = uVar2;
        }
        iVar4 = (uVar7 & uVar2 - 1) - uVar3;
        uVar8 = uVar8 - (long)(iVar4 << (ulong)(uVar14 & 0x1f));
        piVar13[-1] = uVar10 * 0x10 + -0x10 + uVar14;
        *piVar13 = iVar4;
        piVar13 = piVar13 + -2;
        uVar6 = uVar6 - 1;
      } while ((uVar8 & 0xffff) != 0);
    }
    uVar10 = uVar10 + 1;
    uVar8 = uVar8 >> 0x10;
  } while (uVar10 != 0x1e);
  uVar10 = uVar5 + ~uVar6 + 3;
  if (uVar10 != 0) {
    uVar8 = 0;
    uVar9 = (ulong)uVar10;
    if (3 < uVar10) {
      if (CARRY4(uVar6 + 1,(uint)(uVar9 - 1))) {
        uVar8 = 0;
      }
      else {
        uVar8 = 0;
        if ((uVar9 - 1 >> 0x20 == 0) &&
           ((param_1 + (uVar9 + (uVar6 + 1)) * 8 <= param_1 ||
            (uVar8 = 0, param_1 + uVar9 * 8 <= param_1 + (ulong)(uVar6 + 1) * 8)))) {
          uVar11 = 0;
          uVar8 = uVar9 & 0xfffffffc;
          puVar12 = (undefined8 *)(param_1 + 0x10);
          do {
            puVar1 = (undefined8 *)(param_1 + (ulong)(uVar6 + 1 + (int)uVar11) * 8);
            uVar15 = *puVar1;
            uVar17 = puVar1[3];
            uVar16 = puVar1[2];
            uVar11 = uVar11 + 4;
            puVar12[-1] = puVar1[1];
            puVar12[-2] = uVar15;
            puVar12[1] = uVar17;
            *puVar12 = uVar16;
            puVar12 = puVar12 + 4;
          } while (uVar11 != uVar8);
          if (uVar8 == uVar9) {
            return;
          }
        }
      }
    }
    do {
      *(undefined8 *)(param_1 + uVar8 * 8) =
           *(undefined8 *)(param_1 + (ulong)(uVar6 + (int)uVar8 + 1) * 8);
      uVar8 = uVar8 + 1;
    } while (uVar8 < uVar9);
  }
  return;
}

