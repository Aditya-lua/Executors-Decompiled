/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00aa8860
 */

void CRYPTO_cfb128_encrypt
               (byte *param_1,byte *param_2,ulong param_3,undefined8 param_4,long param_5,
               uint *param_6,int param_7,code *param_8)

{
  long lVar1;
  undefined8 *puVar2;
  byte bVar3;
  bool bVar4;
  ulong uVar5;
  uint uVar6;
  ulong uVar7;
  ulong uVar8;
  ulong uVar9;
  byte *pbVar10;
  uint uVar11;
  byte *pbVar12;
  undefined8 uVar13;
  undefined8 uVar14;
  undefined8 uVar15;
  undefined8 uVar16;
  undefined8 uVar17;
  undefined8 uVar18;
  undefined8 uVar19;
  undefined8 uVar20;
  
  uVar11 = *param_6;
  if ((int)uVar11 < 0) {
    uVar11 = 0xffffffff;
    goto LAB_00aa8cb0;
  }
  if (param_7 == 0) {
    uVar5 = param_3;
    pbVar10 = param_2;
    pbVar12 = param_1;
    if (!(uVar11 == 0 || param_3 == 0)) {
      do {
        uVar7 = (ulong)uVar11;
        param_1 = pbVar12 + 1;
        bVar3 = *pbVar12;
        uVar11 = uVar11 + 1 & 0xf;
        param_3 = uVar5 - 1;
        param_2 = pbVar10 + 1;
        *pbVar10 = bVar3 ^ *(byte *)(param_5 + uVar7);
        *(byte *)(param_5 + uVar7) = bVar3;
        if (uVar11 == 0) break;
        bVar4 = uVar5 != 1;
        uVar5 = param_3;
        pbVar10 = param_2;
        pbVar12 = param_1;
      } while (bVar4);
    }
    uVar5 = param_3 - 0x10;
    if (0xf < param_3) {
      uVar7 = uVar5 & 0xfffffffffffffff0;
      lVar1 = uVar7 + 0x10;
      pbVar12 = param_2 + lVar1;
      pbVar10 = param_1;
      do {
        (*param_8)(param_5,param_5,param_4);
        if (uVar11 < 0x10) {
          uVar8 = (ulong)uVar11;
          do {
            uVar9 = *(ulong *)(pbVar10 + uVar8);
            *(ulong *)(param_2 + uVar8) = *(ulong *)(param_5 + uVar8) ^ uVar9;
            *(ulong *)(param_5 + uVar8) = uVar9;
            uVar8 = uVar8 + 8;
          } while (uVar8 < 0x10);
        }
        param_3 = param_3 - 0x10;
        uVar11 = 0;
        param_2 = param_2 + 0x10;
        pbVar10 = pbVar10 + 0x10;
      } while (0xf < param_3);
      uVar11 = 0;
      param_3 = uVar5 - uVar7;
      param_1 = param_1 + lVar1;
      param_2 = pbVar12;
    }
    if (param_3 == 0) goto LAB_00aa8cb0;
    (*param_8)(param_5,param_5,param_4);
    if (((param_3 < 0x20) || (CARRY4(uVar11,(uint)(param_3 - 1)))) || (param_3 - 1 >> 0x20 != 0)) {
LAB_00aa8c80:
      uVar5 = param_3;
      uVar6 = uVar11;
    }
    else {
      uVar5 = (ulong)uVar11;
      lVar1 = param_3 + uVar5;
      if (((param_2 + uVar5 < (byte *)(param_5 + lVar1) &&
            (byte *)(param_5 + uVar5) < param_2 + lVar1) ||
          (param_2 + uVar5 < param_1 + lVar1 && param_1 + uVar5 < param_2 + lVar1)) ||
         ((byte *)(param_5 + uVar5) < param_1 + lVar1 && param_1 + uVar5 < (byte *)(param_5 + lVar1)
         )) goto LAB_00aa8c80;
      uVar7 = param_3 & 0xffffffffffffffe0;
      uVar5 = uVar7;
      uVar6 = uVar11;
      do {
        uVar8 = (ulong)uVar6;
        puVar2 = (undefined8 *)(param_5 + uVar8);
        pbVar10 = param_1 + uVar8;
        uVar14 = puVar2[1];
        uVar13 = *puVar2;
        uVar16 = puVar2[3];
        uVar15 = puVar2[2];
        uVar18 = *(undefined8 *)(pbVar10 + 8);
        uVar17 = *(undefined8 *)pbVar10;
        uVar20 = *(undefined8 *)(pbVar10 + 0x18);
        uVar19 = *(undefined8 *)(pbVar10 + 0x10);
        uVar5 = uVar5 - 0x20;
        pbVar10 = param_2 + uVar8;
        uVar6 = uVar6 + 0x20;
        *(ulong *)(pbVar10 + 8) =
             CONCAT17((byte)((ulong)uVar18 >> 0x38) ^ (byte)((ulong)uVar14 >> 0x38),
                      CONCAT16((byte)((ulong)uVar18 >> 0x30) ^ (byte)((ulong)uVar14 >> 0x30),
                               CONCAT15((byte)((ulong)uVar18 >> 0x28) ^
                                        (byte)((ulong)uVar14 >> 0x28),
                                        CONCAT14((byte)((ulong)uVar18 >> 0x20) ^
                                                 (byte)((ulong)uVar14 >> 0x20),
                                                 CONCAT13((byte)((ulong)uVar18 >> 0x18) ^
                                                          (byte)((ulong)uVar14 >> 0x18),
                                                          CONCAT12((byte)((ulong)uVar18 >> 0x10) ^
                                                                   (byte)((ulong)uVar14 >> 0x10),
                                                                   CONCAT11((byte)((ulong)uVar18 >>
                                                                                  8) ^
                                                                            (byte)((ulong)uVar14 >>
                                                                                  8),(byte)uVar18 ^
                                                                                     (byte)uVar14)))
                                                ))));
        *(ulong *)pbVar10 =
             CONCAT17((byte)((ulong)uVar17 >> 0x38) ^ (byte)((ulong)uVar13 >> 0x38),
                      CONCAT16((byte)((ulong)uVar17 >> 0x30) ^ (byte)((ulong)uVar13 >> 0x30),
                               CONCAT15((byte)((ulong)uVar17 >> 0x28) ^
                                        (byte)((ulong)uVar13 >> 0x28),
                                        CONCAT14((byte)((ulong)uVar17 >> 0x20) ^
                                                 (byte)((ulong)uVar13 >> 0x20),
                                                 CONCAT13((byte)((ulong)uVar17 >> 0x18) ^
                                                          (byte)((ulong)uVar13 >> 0x18),
                                                          CONCAT12((byte)((ulong)uVar17 >> 0x10) ^
                                                                   (byte)((ulong)uVar13 >> 0x10),
                                                                   CONCAT11((byte)((ulong)uVar17 >>
                                                                                  8) ^
                                                                            (byte)((ulong)uVar13 >>
                                                                                  8),(byte)uVar17 ^
                                                                                     (byte)uVar13)))
                                                ))));
        *(ulong *)(pbVar10 + 0x18) =
             CONCAT17((byte)((ulong)uVar20 >> 0x38) ^ (byte)((ulong)uVar16 >> 0x38),
                      CONCAT16((byte)((ulong)uVar20 >> 0x30) ^ (byte)((ulong)uVar16 >> 0x30),
                               CONCAT15((byte)((ulong)uVar20 >> 0x28) ^
                                        (byte)((ulong)uVar16 >> 0x28),
                                        CONCAT14((byte)((ulong)uVar20 >> 0x20) ^
                                                 (byte)((ulong)uVar16 >> 0x20),
                                                 CONCAT13((byte)((ulong)uVar20 >> 0x18) ^
                                                          (byte)((ulong)uVar16 >> 0x18),
                                                          CONCAT12((byte)((ulong)uVar20 >> 0x10) ^
                                                                   (byte)((ulong)uVar16 >> 0x10),
                                                                   CONCAT11((byte)((ulong)uVar20 >>
                                                                                  8) ^
                                                                            (byte)((ulong)uVar16 >>
                                                                                  8),(byte)uVar20 ^
                                                                                     (byte)uVar16)))
                                                ))));
        *(ulong *)(pbVar10 + 0x10) =
             CONCAT17((byte)((ulong)uVar19 >> 0x38) ^ (byte)((ulong)uVar15 >> 0x38),
                      CONCAT16((byte)((ulong)uVar19 >> 0x30) ^ (byte)((ulong)uVar15 >> 0x30),
                               CONCAT15((byte)((ulong)uVar19 >> 0x28) ^
                                        (byte)((ulong)uVar15 >> 0x28),
                                        CONCAT14((byte)((ulong)uVar19 >> 0x20) ^
                                                 (byte)((ulong)uVar15 >> 0x20),
                                                 CONCAT13((byte)((ulong)uVar19 >> 0x18) ^
                                                          (byte)((ulong)uVar15 >> 0x18),
                                                          CONCAT12((byte)((ulong)uVar19 >> 0x10) ^
                                                                   (byte)((ulong)uVar15 >> 0x10),
                                                                   CONCAT11((byte)((ulong)uVar19 >>
                                                                                  8) ^
                                                                            (byte)((ulong)uVar15 >>
                                                                                  8),(byte)uVar19 ^
                                                                                     (byte)uVar15)))
                                                ))));
        puVar2[1] = uVar18;
        *puVar2 = uVar17;
        puVar2[3] = uVar20;
        puVar2[2] = uVar19;
      } while (uVar5 != 0);
      uVar5 = param_3 - uVar7;
      uVar6 = uVar11 + (int)uVar7;
      if (param_3 == uVar7) goto LAB_00aa8cac;
    }
    do {
      uVar7 = (ulong)uVar6;
      bVar3 = param_1[uVar7];
      uVar5 = uVar5 - 1;
      param_2[uVar7] = bVar3 ^ *(byte *)(param_5 + uVar7);
      *(byte *)(param_5 + uVar7) = bVar3;
      uVar6 = uVar6 + 1;
    } while (uVar5 != 0);
  }
  else {
    pbVar10 = param_2;
    pbVar12 = param_1;
    if (uVar11 == 0 || param_3 == 0) {
      uVar5 = param_3 - 0x10;
    }
    else {
      do {
        uVar5 = param_3;
        uVar7 = (ulong)uVar11;
        param_1 = pbVar12 + 1;
        uVar11 = uVar11 + 1 & 0xf;
        param_3 = uVar5 - 1;
        bVar3 = *(byte *)(param_5 + uVar7) ^ *pbVar12;
        *(byte *)(param_5 + uVar7) = bVar3;
        param_2 = pbVar10 + 1;
        *pbVar10 = bVar3;
        if (uVar11 == 0) break;
        pbVar10 = param_2;
        pbVar12 = param_1;
      } while (uVar5 != 1);
      uVar5 = uVar5 - 0x11;
    }
    if (0xf < param_3) {
      lVar1 = (uVar5 & 0xfffffffffffffff0) + 0x10;
      pbVar12 = param_2 + lVar1;
      pbVar10 = param_1;
      do {
        (*param_8)(param_5,param_5,param_4);
        if (uVar11 < 0x10) {
          uVar7 = (ulong)uVar11;
          do {
            uVar8 = *(ulong *)(param_5 + uVar7) ^ *(ulong *)(pbVar10 + uVar7);
            *(ulong *)(param_5 + uVar7) = uVar8;
            *(ulong *)(param_2 + uVar7) = uVar8;
            uVar7 = uVar7 + 8;
          } while (uVar7 < 0x10);
        }
        param_3 = param_3 - 0x10;
        uVar11 = 0;
        param_2 = param_2 + 0x10;
        pbVar10 = pbVar10 + 0x10;
      } while (0xf < param_3);
      uVar11 = 0;
      param_3 = uVar5 - (uVar5 & 0xfffffffffffffff0);
      param_1 = param_1 + lVar1;
      param_2 = pbVar12;
    }
    if (param_3 == 0) goto LAB_00aa8cb0;
    (*param_8)(param_5,param_5,param_4);
    if (((param_3 < 0x20) || (CARRY4(uVar11,(uint)(param_3 - 1)))) || (param_3 - 1 >> 0x20 != 0)) {
LAB_00aa8ac0:
      uVar5 = param_3;
      uVar6 = uVar11;
    }
    else {
      uVar5 = (ulong)uVar11;
      lVar1 = param_3 + uVar5;
      if ((((byte *)(param_5 + uVar5) < param_2 + lVar1 &&
            param_2 + uVar5 < (byte *)(param_5 + lVar1)) ||
          ((byte *)(param_5 + uVar5) < param_1 + lVar1 &&
           param_1 + uVar5 < (byte *)(param_5 + lVar1))) ||
         (param_2 + uVar5 < param_1 + lVar1 && param_1 + uVar5 < param_2 + lVar1))
      goto LAB_00aa8ac0;
      uVar7 = param_3 & 0xffffffffffffffe0;
      uVar5 = uVar7;
      uVar6 = uVar11;
      do {
        uVar8 = (ulong)uVar6;
        pbVar10 = param_1 + uVar8;
        uVar14 = *(undefined8 *)(pbVar10 + 8);
        uVar13 = *(undefined8 *)pbVar10;
        uVar16 = *(undefined8 *)(pbVar10 + 0x18);
        uVar15 = *(undefined8 *)(pbVar10 + 0x10);
        puVar2 = (undefined8 *)(param_5 + uVar8);
        uVar18 = puVar2[1];
        uVar17 = *puVar2;
        uVar20 = puVar2[3];
        uVar19 = puVar2[2];
        uVar5 = uVar5 - 0x20;
        pbVar10 = param_2 + uVar8;
        uVar6 = uVar6 + 0x20;
        uVar13 = CONCAT17((byte)((ulong)uVar17 >> 0x38) ^ (byte)((ulong)uVar13 >> 0x38),
                          CONCAT16((byte)((ulong)uVar17 >> 0x30) ^ (byte)((ulong)uVar13 >> 0x30),
                                   CONCAT15((byte)((ulong)uVar17 >> 0x28) ^
                                            (byte)((ulong)uVar13 >> 0x28),
                                            CONCAT14((byte)((ulong)uVar17 >> 0x20) ^
                                                     (byte)((ulong)uVar13 >> 0x20),
                                                     CONCAT13((byte)((ulong)uVar17 >> 0x18) ^
                                                              (byte)((ulong)uVar13 >> 0x18),
                                                              CONCAT12((byte)((ulong)uVar17 >> 0x10)
                                                                       ^ (byte)((ulong)uVar13 >>
                                                                               0x10),
                                                                       CONCAT11((byte)((ulong)uVar17
                                                                                      >> 8) ^
                                                                                (byte)((ulong)uVar13
                                                                                      >> 8),
                                                                                (byte)uVar17 ^
                                                                                (byte)uVar13)))))));
        uVar14 = CONCAT17((byte)((ulong)uVar18 >> 0x38) ^ (byte)((ulong)uVar14 >> 0x38),
                          CONCAT16((byte)((ulong)uVar18 >> 0x30) ^ (byte)((ulong)uVar14 >> 0x30),
                                   CONCAT15((byte)((ulong)uVar18 >> 0x28) ^
                                            (byte)((ulong)uVar14 >> 0x28),
                                            CONCAT14((byte)((ulong)uVar18 >> 0x20) ^
                                                     (byte)((ulong)uVar14 >> 0x20),
                                                     CONCAT13((byte)((ulong)uVar18 >> 0x18) ^
                                                              (byte)((ulong)uVar14 >> 0x18),
                                                              CONCAT12((byte)((ulong)uVar18 >> 0x10)
                                                                       ^ (byte)((ulong)uVar14 >>
                                                                               0x10),
                                                                       CONCAT11((byte)((ulong)uVar18
                                                                                      >> 8) ^
                                                                                (byte)((ulong)uVar14
                                                                                      >> 8),
                                                                                (byte)uVar18 ^
                                                                                (byte)uVar14)))))));
        uVar15 = CONCAT17((byte)((ulong)uVar19 >> 0x38) ^ (byte)((ulong)uVar15 >> 0x38),
                          CONCAT16((byte)((ulong)uVar19 >> 0x30) ^ (byte)((ulong)uVar15 >> 0x30),
                                   CONCAT15((byte)((ulong)uVar19 >> 0x28) ^
                                            (byte)((ulong)uVar15 >> 0x28),
                                            CONCAT14((byte)((ulong)uVar19 >> 0x20) ^
                                                     (byte)((ulong)uVar15 >> 0x20),
                                                     CONCAT13((byte)((ulong)uVar19 >> 0x18) ^
                                                              (byte)((ulong)uVar15 >> 0x18),
                                                              CONCAT12((byte)((ulong)uVar19 >> 0x10)
                                                                       ^ (byte)((ulong)uVar15 >>
                                                                               0x10),
                                                                       CONCAT11((byte)((ulong)uVar19
                                                                                      >> 8) ^
                                                                                (byte)((ulong)uVar15
                                                                                      >> 8),
                                                                                (byte)uVar19 ^
                                                                                (byte)uVar15)))))));
        uVar16 = CONCAT17((byte)((ulong)uVar20 >> 0x38) ^ (byte)((ulong)uVar16 >> 0x38),
                          CONCAT16((byte)((ulong)uVar20 >> 0x30) ^ (byte)((ulong)uVar16 >> 0x30),
                                   CONCAT15((byte)((ulong)uVar20 >> 0x28) ^
                                            (byte)((ulong)uVar16 >> 0x28),
                                            CONCAT14((byte)((ulong)uVar20 >> 0x20) ^
                                                     (byte)((ulong)uVar16 >> 0x20),
                                                     CONCAT13((byte)((ulong)uVar20 >> 0x18) ^
                                                              (byte)((ulong)uVar16 >> 0x18),
                                                              CONCAT12((byte)((ulong)uVar20 >> 0x10)
                                                                       ^ (byte)((ulong)uVar16 >>
                                                                               0x10),
                                                                       CONCAT11((byte)((ulong)uVar20
                                                                                      >> 8) ^
                                                                                (byte)((ulong)uVar16
                                                                                      >> 8),
                                                                                (byte)uVar20 ^
                                                                                (byte)uVar16)))))));
        puVar2[1] = uVar14;
        *puVar2 = uVar13;
        puVar2[3] = uVar16;
        puVar2[2] = uVar15;
        *(undefined8 *)(pbVar10 + 8) = uVar14;
        *(undefined8 *)pbVar10 = uVar13;
        *(undefined8 *)(pbVar10 + 0x18) = uVar16;
        *(undefined8 *)(pbVar10 + 0x10) = uVar15;
      } while (uVar5 != 0);
      uVar5 = param_3 - uVar7;
      uVar6 = uVar11 + (int)uVar7;
      if (param_3 == uVar7) goto LAB_00aa8cac;
    }
    do {
      uVar7 = (ulong)uVar6;
      uVar5 = uVar5 - 1;
      bVar3 = *(byte *)(param_5 + uVar7) ^ param_1[uVar7];
      *(byte *)(param_5 + uVar7) = bVar3;
      param_2[uVar7] = bVar3;
      uVar6 = uVar6 + 1;
    } while (uVar5 != 0);
  }
LAB_00aa8cac:
  uVar11 = uVar11 + (int)param_3;
LAB_00aa8cb0:
  *param_6 = uVar11;
  return;
}

