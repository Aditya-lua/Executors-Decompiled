/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b73468
 */

void mbedtls_ct_memcpy_offset
               (long param_1,long param_2,ulong param_3,ulong param_4,ulong param_5,ulong param_6)

{
  ulong uVar1;
  uint3 uVar2;
  uint3 uVar3;
  uint3 uVar4;
  uint3 uVar5;
  long lVar6;
  long lVar7;
  ulong uVar8;
  ulong uVar9;
  ulong uVar10;
  ulong uVar11;
  ulong uVar12;
  ulong uVar13;
  byte bVar14;
  byte bVar15;
  undefined8 uVar16;
  undefined8 uVar17;
  undefined8 uVar18;
  undefined8 uVar19;
  
  if (param_4 <= param_5) {
    lVar6 = 0;
    lVar7 = param_2 + param_4;
    uVar8 = param_4;
    do {
      uVar9 = -(param_3 ^ uVar8) | param_3 ^ uVar8;
      uVar10 = (long)uVar9 >> 0x3f;
      uVar11 = ~uVar10;
      uVar12 = 0;
      if (7 < param_6) {
        uVar13 = 0;
        do {
          uVar12 = uVar13 + 8;
          uVar1 = uVar13 + 0x10;
          *(ulong *)(param_1 + uVar13) =
               *(ulong *)(param_1 + uVar13) & uVar10 | *(ulong *)(lVar7 + uVar13) & uVar11;
          uVar13 = uVar12;
        } while (uVar1 <= param_6);
      }
      if (uVar12 < param_6) {
        uVar10 = param_6 - uVar12;
        bVar14 = (byte)uVar11;
        bVar15 = (byte)((long)uVar9 >> 0x3f);
        if ((uVar10 < 0x10) ||
           ((param_1 + uVar12 < param_2 + param_6 + param_4 + lVar6 &&
            (param_2 + lVar6 + param_4 + uVar12 < param_1 + param_6)))) {
          uVar9 = uVar12;
        }
        else {
          uVar13 = uVar10 & 0xfffffffffffffff0;
          uVar9 = uVar12 + uVar13;
          uVar11 = uVar13;
          do {
            uVar17 = ((undefined8 *)(lVar7 + uVar12))[1];
            uVar16 = *(undefined8 *)(lVar7 + uVar12);
            uVar19 = ((undefined8 *)(param_1 + uVar12))[1];
            uVar18 = *(undefined8 *)(param_1 + uVar12);
            uVar11 = uVar11 - 0x10;
            uVar2 = CONCAT12((char)((ulong)uVar16 >> 8),(short)uVar16) & 0xff00ff;
            uVar3 = CONCAT12((char)((ulong)uVar17 >> 8),(short)uVar17) & 0xff00ff;
            uVar4 = CONCAT12((char)((ulong)uVar18 >> 8),(short)uVar18) & 0xff00ff;
            uVar5 = CONCAT12((char)((ulong)uVar19 >> 8),(short)uVar19) & 0xff00ff;
            ((undefined8 *)(param_1 + uVar12))[1] =
                 CONCAT17(bVar15 & (byte)((ulong)uVar19 >> 0x38) |
                          bVar14 & (byte)((ulong)uVar17 >> 0x38),
                          CONCAT16(bVar15 & (byte)((ulong)uVar19 >> 0x30) |
                                   bVar14 & (byte)((ulong)uVar17 >> 0x30),
                                   CONCAT15(bVar15 & (byte)((ulong)uVar19 >> 0x28) |
                                            bVar14 & (byte)((ulong)uVar17 >> 0x28),
                                            CONCAT14(bVar15 & (byte)((ulong)uVar19 >> 0x20) |
                                                     bVar14 & (byte)((ulong)uVar17 >> 0x20),
                                                     CONCAT13(bVar15 & (byte)((ulong)uVar19 >> 0x18)
                                                              | bVar14 & (byte)((ulong)uVar17 >>
                                                                               0x18),
                                                              CONCAT12(bVar15 & (byte)((ulong)uVar19
                                                                                      >> 0x10) |
                                                                       bVar14 & (byte)((ulong)uVar17
                                                                                      >> 0x10),
                                                                       CONCAT11(bVar15 & (byte)(
                                                  uVar5 >> 0x10) | bVar14 & (byte)(uVar3 >> 0x10),
                                                  bVar15 & (byte)uVar5 | bVar14 & (byte)uVar3)))))))
            ;
            *(undefined8 *)(param_1 + uVar12) =
                 CONCAT17(bVar15 & (byte)((ulong)uVar18 >> 0x38) |
                          bVar14 & (byte)((ulong)uVar16 >> 0x38),
                          CONCAT16(bVar15 & (byte)((ulong)uVar18 >> 0x30) |
                                   bVar14 & (byte)((ulong)uVar16 >> 0x30),
                                   CONCAT15(bVar15 & (byte)((ulong)uVar18 >> 0x28) |
                                            bVar14 & (byte)((ulong)uVar16 >> 0x28),
                                            CONCAT14(bVar15 & (byte)((ulong)uVar18 >> 0x20) |
                                                     bVar14 & (byte)((ulong)uVar16 >> 0x20),
                                                     CONCAT13(bVar15 & (byte)((ulong)uVar18 >> 0x18)
                                                              | bVar14 & (byte)((ulong)uVar16 >>
                                                                               0x18),
                                                              CONCAT12(bVar15 & (byte)((ulong)uVar18
                                                                                      >> 0x10) |
                                                                       bVar14 & (byte)((ulong)uVar16
                                                                                      >> 0x10),
                                                                       CONCAT11(bVar15 & (byte)(
                                                  uVar4 >> 0x10) | bVar14 & (byte)(uVar2 >> 0x10),
                                                  bVar15 & (byte)uVar4 | bVar14 & (byte)uVar2)))))))
            ;
            uVar12 = uVar12 + 0x10;
          } while (uVar11 != 0);
          if (uVar10 == uVar13) goto LAB_00b7368c;
        }
        do {
          *(byte *)(param_1 + uVar9) =
               *(byte *)(param_1 + uVar9) & bVar15 | *(byte *)(lVar7 + uVar9) & bVar14;
          uVar9 = uVar9 + 1;
        } while (param_6 != uVar9);
      }
LAB_00b7368c:
      uVar8 = uVar8 + 1;
      lVar6 = lVar6 + 1;
      lVar7 = lVar7 + 1;
    } while (uVar8 <= param_5);
  }
  return;
}

