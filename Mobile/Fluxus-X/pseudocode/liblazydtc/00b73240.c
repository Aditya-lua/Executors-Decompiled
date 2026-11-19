/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b73240
 */

void mbedtls_ct_memcpy_if(ulong param_1,long param_2,long param_3,long param_4,ulong param_5)

{
  long lVar1;
  uint3 uVar2;
  uint3 uVar3;
  uint3 uVar4;
  uint3 uVar5;
  byte *pbVar6;
  ulong uVar7;
  byte *pbVar8;
  long lVar9;
  ulong uVar10;
  byte *pbVar11;
  undefined8 *puVar12;
  undefined8 *puVar13;
  ulong uVar14;
  undefined8 *puVar15;
  ulong uVar16;
  byte bVar17;
  byte bVar18;
  undefined8 uVar19;
  undefined8 uVar20;
  undefined8 uVar21;
  undefined8 uVar22;
  
  uVar14 = 0;
  lVar1 = param_2;
  if (param_4 != 0) {
    lVar1 = param_4;
  }
  if (7 < param_5) {
    uVar7 = 0;
    do {
      uVar14 = uVar7 + 8;
      uVar16 = uVar7 + 0x10;
      *(ulong *)(param_2 + uVar7) =
           *(ulong *)(lVar1 + uVar7) & ~param_1 | *(ulong *)(param_3 + uVar7) & param_1;
      uVar7 = uVar14;
    } while (uVar16 <= param_5);
  }
  if (param_5 <= uVar14) {
    return;
  }
  uVar7 = param_5 - uVar14;
  bVar17 = (byte)param_1;
  bVar18 = (byte)~param_1;
  if (0xf < uVar7) {
    if ((param_3 + param_5 <= param_2 + uVar14 || param_2 + param_5 <= param_3 + uVar14) &&
       (lVar1 + param_5 <= param_2 + uVar14 || param_2 + param_5 <= lVar1 + uVar14)) {
      uVar10 = uVar7 & 0xfffffffffffffff0;
      puVar12 = (undefined8 *)(param_2 + uVar14);
      puVar13 = (undefined8 *)(lVar1 + uVar14);
      puVar15 = (undefined8 *)(param_3 + uVar14);
      uVar16 = uVar10;
      do {
        uVar20 = puVar15[1];
        uVar19 = *puVar15;
        uVar22 = puVar13[1];
        uVar21 = *puVar13;
        uVar16 = uVar16 - 0x10;
        uVar2 = CONCAT12((char)((ulong)uVar19 >> 8),(short)uVar19) & 0xff00ff;
        uVar3 = CONCAT12((char)((ulong)uVar20 >> 8),(short)uVar20) & 0xff00ff;
        uVar4 = CONCAT12((char)((ulong)uVar21 >> 8),(short)uVar21) & 0xff00ff;
        uVar5 = CONCAT12((char)((ulong)uVar22 >> 8),(short)uVar22) & 0xff00ff;
        puVar12[1] = CONCAT17(bVar18 & (byte)((ulong)uVar22 >> 0x38) |
                              bVar17 & (byte)((ulong)uVar20 >> 0x38),
                              CONCAT16(bVar18 & (byte)((ulong)uVar22 >> 0x30) |
                                       bVar17 & (byte)((ulong)uVar20 >> 0x30),
                                       CONCAT15(bVar18 & (byte)((ulong)uVar22 >> 0x28) |
                                                bVar17 & (byte)((ulong)uVar20 >> 0x28),
                                                CONCAT14(bVar18 & (byte)((ulong)uVar22 >> 0x20) |
                                                         bVar17 & (byte)((ulong)uVar20 >> 0x20),
                                                         CONCAT13(bVar18 & (byte)((ulong)uVar22 >>
                                                                                 0x18) |
                                                                  bVar17 & (byte)((ulong)uVar20 >>
                                                                                 0x18),
                                                                  CONCAT12(bVar18 & (byte)((ulong)
                                                  uVar22 >> 0x10) |
                                                  bVar17 & (byte)((ulong)uVar20 >> 0x10),
                                                  CONCAT11(bVar18 & (byte)(uVar5 >> 0x10) |
                                                           bVar17 & (byte)(uVar3 >> 0x10),
                                                           bVar18 & (byte)uVar5 |
                                                           bVar17 & (byte)uVar3)))))));
        *puVar12 = CONCAT17(bVar18 & (byte)((ulong)uVar21 >> 0x38) |
                            bVar17 & (byte)((ulong)uVar19 >> 0x38),
                            CONCAT16(bVar18 & (byte)((ulong)uVar21 >> 0x30) |
                                     bVar17 & (byte)((ulong)uVar19 >> 0x30),
                                     CONCAT15(bVar18 & (byte)((ulong)uVar21 >> 0x28) |
                                              bVar17 & (byte)((ulong)uVar19 >> 0x28),
                                              CONCAT14(bVar18 & (byte)((ulong)uVar21 >> 0x20) |
                                                       bVar17 & (byte)((ulong)uVar19 >> 0x20),
                                                       CONCAT13(bVar18 & (byte)((ulong)uVar21 >>
                                                                               0x18) |
                                                                bVar17 & (byte)((ulong)uVar19 >>
                                                                               0x18),
                                                                CONCAT12(bVar18 & (byte)((ulong)
                                                  uVar21 >> 0x10) |
                                                  bVar17 & (byte)((ulong)uVar19 >> 0x10),
                                                  CONCAT11(bVar18 & (byte)(uVar4 >> 0x10) |
                                                           bVar17 & (byte)(uVar2 >> 0x10),
                                                           bVar18 & (byte)uVar4 |
                                                           bVar17 & (byte)uVar2)))))));
        puVar12 = puVar12 + 2;
        puVar13 = puVar13 + 2;
        puVar15 = puVar15 + 2;
      } while (uVar16 != 0);
      uVar14 = uVar14 + uVar10;
      if (uVar7 == uVar10) {
        return;
      }
    }
  }
  lVar9 = param_5 - uVar14;
  pbVar6 = (byte *)(lVar1 + uVar14);
  pbVar8 = (byte *)(param_3 + uVar14);
  pbVar11 = (byte *)(param_2 + uVar14);
  do {
    lVar9 = lVar9 + -1;
    *pbVar11 = *pbVar6 & bVar18 | *pbVar8 & bVar17;
    pbVar6 = pbVar6 + 1;
    pbVar8 = pbVar8 + 1;
    pbVar11 = pbVar11 + 1;
  } while (lVar9 != 0);
  return;
}

