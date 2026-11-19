/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b70a60
 */

undefined8 mbedtls_aria_crypt_ecb(byte *param_1,uint *param_2,uint *param_3)

{
  uint uVar1;
  byte bVar2;
  byte bVar3;
  byte bVar4;
  byte bVar5;
  byte bVar6;
  uint uVar7;
  uint uVar8;
  undefined2 uVar9;
  uint uVar10;
  uint uVar11;
  uint uVar12;
  uint uVar13;
  uint uVar14;
  uint *puVar15;
  uint uVar16;
  ulong uVar17;
  uint uVar18;
  uint uVar19;
  
  uVar19 = *param_2;
  uVar18 = param_2[1];
  uVar12 = param_2[2];
  uVar10 = param_2[3];
  puVar15 = (uint *)(param_1 + 0x10);
  bVar2 = *param_1;
  uVar17 = 2;
  uVar16 = (uint)bVar2;
  if (bVar2 < 3) {
    uVar16 = 2;
  }
  while( true ) {
    uVar19 = puVar15[-3] ^ uVar19;
    uVar18 = puVar15[-2] ^ uVar18;
    uVar12 = puVar15[-1] ^ uVar12;
    uVar10 = *puVar15 ^ uVar10;
    uVar9 = CONCAT11((&DAT_0077d81c)[uVar10 >> 8 & 0xff],(&DAT_0077d71c)[uVar10 & 0xff]);
    uVar7 = (uint)(byte)(&DAT_0077d81c)[uVar12 >> 8 & 0xff] |
            (uint)(byte)(&DAT_0077da1c)[uVar12 >> 0x18] << 0x10 |
            ((uint)(byte)(&DAT_0077d71c)[uVar12 & 0xff] |
            (uint)(byte)(&DAT_0077d91c)[uVar12 >> 0x10 & 0xff] << 0x10) << 8;
    uVar12 = CONCAT13((&DAT_0077da1c)[uVar19 >> 0x18],
                      CONCAT12((&DAT_0077d91c)[uVar19 >> 0x10 & 0xff],
                               CONCAT11((&DAT_0077d81c)[uVar19 >> 8 & 0xff],
                                        (&DAT_0077d71c)[uVar19 & 0xff])));
    uVar14 = CONCAT13((&DAT_0077da1c)[uVar18 >> 0x18],
                      CONCAT12((&DAT_0077d91c)[uVar18 >> 0x10 & 0xff],
                               CONCAT11((&DAT_0077d81c)[uVar18 >> 8 & 0xff],
                                        (&DAT_0077d71c)[uVar18 & 0xff])));
    uVar1 = uVar7 ^ uVar14;
    uVar8 = ((uint)(byte)(&DAT_0077d81c)[uVar10 >> 8 & 0xff] << 8 |
            (uint)(byte)(&DAT_0077da1c)[uVar10 >> 0x18] << 0x18) >> 8 |
            ((uint)(byte)(&DAT_0077d71c)[uVar10 & 0xff] |
            (uint)(byte)(&DAT_0077d91c)[uVar10 >> 0x10 & 0xff] << 0x10) << 8;
    uVar8 = uVar8 >> 0x10 | uVar8 << 0x10;
    uVar11 = (uint)(CONCAT24(CONCAT11((&DAT_0077d81c)[uVar18 >> 8 & 0xff],
                                      (&DAT_0077d71c)[uVar18 & 0xff]),uVar14) >> 0x10);
    uVar14 = (uint)(CONCAT24(CONCAT11((&DAT_0077d81c)[uVar19 >> 8 & 0xff],
                                      (&DAT_0077d71c)[uVar19 & 0xff]),uVar12) >> 0x10);
    uVar19 = (uint)(CONCAT24(uVar9,CONCAT13((&DAT_0077da1c)[uVar10 >> 0x18],
                                            CONCAT12((&DAT_0077d91c)[uVar10 >> 0x10 & 0xff],uVar9)))
                   >> 0x10) ^ (uVar7 >> 0x10 | uVar7 << 0x10);
    uVar18 = uVar8 ^ uVar14 ^ (uVar1 >> 8 & 0xff00ff | (uVar1 & 0xff00ff) << 8);
    uVar14 = (uVar11 >> 8 & 0xff00ff | (uVar11 & 0xff00ff) << 8) ^ uVar14;
    uVar10 = uVar18 ^ (uVar19 >> 0x10 | uVar19 << 0x10);
    uVar13 = (uVar14 & 0xff00ff00) >> 8 | (uVar14 & 0xff00ff) << 8;
    uVar19 = puVar15[2] ^ uVar12 ^ uVar19 ^ uVar18;
    uVar12 = (uVar18 & 0xff00ff00) >> 8 | (uVar18 & 0xff00ff) << 8;
    uVar14 = uVar14 ^ uVar7 ^ puVar15[4] ^ (uVar12 >> 0x10 | uVar12 << 0x10);
    uVar1 = puVar15[1] ^ uVar11 ^ (uVar10 >> 8 & 0xff00ff | (uVar10 & 0xff00ff) << 8);
    uVar12 = puVar15[3] ^ (uVar13 >> 0x10 | uVar13 << 0x10) ^ uVar8 ^
             (uVar18 >> 0x10 | uVar18 << 0x10);
    uVar9 = CONCAT11((&DAT_0077da1c)[uVar14 >> 8 & 0xff],(&DAT_0077d91c)[uVar14 & 0xff]);
    uVar18 = CONCAT13((&DAT_0077d81c)[uVar19 >> 0x18],
                      CONCAT12((&DAT_0077d71c)[uVar19 >> 0x10 & 0xff],
                               CONCAT11((&DAT_0077da1c)[uVar19 >> 8 & 0xff],
                                        (&DAT_0077d91c)[uVar19 & 0xff])));
    bVar3 = (&DAT_0077d91c)[uVar12 & 0xff];
    bVar4 = (&DAT_0077da1c)[uVar12 >> 8 & 0xff];
    bVar5 = (&DAT_0077d71c)[uVar12 >> 0x10 & 0xff];
    bVar6 = (&DAT_0077d81c)[uVar12 >> 0x18];
    uVar12 = CONCAT13((&DAT_0077d81c)[uVar1 >> 0x18],
                      CONCAT12((&DAT_0077d71c)[uVar1 >> 0x10 & 0xff],
                               CONCAT11((&DAT_0077da1c)[uVar1 >> 8 & 0xff],
                                        (&DAT_0077d91c)[uVar1 & 0xff])));
    uVar10 = CONCAT13((&DAT_0077d81c)[uVar14 >> 0x18],
                      CONCAT12((&DAT_0077d71c)[uVar14 >> 0x10 & 0xff],uVar9));
    if (bVar2 <= uVar17) break;
    uVar8 = ((uint)bVar4 << 8 | (uint)bVar6 << 0x18) >> 8 | ((uint)bVar3 | (uint)bVar5 << 0x10) << 8
    ;
    uVar19 = (uint)(CONCAT24(CONCAT11((&DAT_0077da1c)[uVar19 >> 8 & 0xff],
                                      (&DAT_0077d91c)[uVar19 & 0xff]),uVar18) >> 0x10);
    uVar7 = ((uint)(byte)(&DAT_0077da1c)[uVar14 >> 8 & 0xff] << 8 |
            (uint)(byte)(&DAT_0077d81c)[uVar14 >> 0x18] << 0x18) >> 8 |
            ((uint)(byte)(&DAT_0077d91c)[uVar14 & 0xff] |
            (uint)(byte)(&DAT_0077d71c)[uVar14 >> 0x10 & 0xff] << 0x10) << 8;
    uVar13 = (uint)(CONCAT24(CONCAT11((&DAT_0077da1c)[uVar1 >> 8 & 0xff],
                                      (&DAT_0077d91c)[uVar1 & 0xff]),uVar12) >> 0x10);
    uVar14 = (uVar19 >> 8 & 0xff00ff | (uVar19 & 0xff00ff) << 8) ^ uVar13;
    uVar1 = (uint)(CONCAT24(uVar9,uVar10) >> 0x10) ^ (uVar8 >> 0x10 | uVar8 << 0x10);
    uVar10 = uVar10 ^ uVar14;
    uVar7 = (uVar7 >> 0x10 | uVar7 << 0x10) ^ uVar13 ^
            ((uVar8 ^ uVar18) >> 8 & 0xff00ff | ((uVar8 ^ uVar18) & 0xff00ff) << 8);
    uVar10 = (uVar10 & 0xff00ff00) >> 8 | (uVar10 & 0xff00ff) << 8;
    uVar18 = uVar1 ^ uVar12 ^ uVar7;
    uVar1 = uVar7 ^ (uVar1 >> 0x10 | uVar1 << 0x10);
    uVar13 = (uVar7 & 0xff00ff00) >> 8 | (uVar7 & 0xff00ff) << 8;
    uVar12 = (uVar10 >> 0x10 | uVar10 << 0x10) ^ (uVar7 >> 0x10 | uVar7 << 0x10);
    uVar17 = uVar17 + 2;
    uVar10 = uVar8 ^ uVar14 ^ (uVar13 >> 0x10 | uVar13 << 0x10);
    uVar19 = (uVar1 >> 8 & 0xff00ff | (uVar1 & 0xff00ff) << 8) ^ uVar19;
    puVar15 = puVar15 + 8;
  }
  uVar16 = uVar16 + 1 & 0x1fe;
  uVar14 = *(uint *)(param_1 + (ulong)uVar16 * 0x10 + 8);
  uVar19 = *(uint *)(param_1 + (ulong)uVar16 * 0x10 + 0xc);
  uVar1 = *(uint *)(param_1 + (ulong)uVar16 * 0x10 + 0x10);
  *param_3 = *(uint *)(param_1 + (ulong)uVar16 * 0x10 + 4) ^ uVar12;
  param_3[1] = uVar14 ^ uVar18;
  param_3[2] = uVar19 ^ CONCAT13(bVar6,CONCAT12(bVar5,CONCAT11(bVar4,bVar3)));
  param_3[3] = uVar1 ^ uVar10;
  return 0;
}

