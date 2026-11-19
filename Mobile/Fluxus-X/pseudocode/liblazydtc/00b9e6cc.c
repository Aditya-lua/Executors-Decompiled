/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b9e6cc
 */

void mbedtls_cipher_cmac_update(long *param_1,void *param_2,ulong param_3)

{
  ulong *puVar1;
  undefined8 *puVar2;
  uint uVar3;
  long lVar4;
  undefined8 uVar5;
  long lVar6;
  ulong uVar7;
  long lVar8;
  ulong uVar9;
  ulong uVar10;
  byte *pbVar11;
  ulong uVar12;
  ulong uVar13;
  undefined8 *puVar14;
  ulong uVar15;
  long lVar16;
  ulong uVar17;
  void *pvVar18;
  long lVar19;
  undefined8 uVar20;
  byte bVar22;
  byte bVar23;
  byte bVar24;
  byte bVar25;
  byte bVar26;
  byte bVar27;
  undefined8 uVar21;
  byte bVar28;
  byte bVar30;
  byte bVar31;
  byte bVar32;
  byte bVar33;
  byte bVar34;
  byte bVar35;
  undefined8 uVar29;
  byte bVar36;
  undefined8 uVar37;
  undefined8 uVar38;
  undefined8 uVar39;
  undefined8 uVar40;
  undefined1 auStack_70 [8];
  long local_68;
  
  lVar4 = tpidr_el0;
  local_68 = *(long *)(lVar4 + 0x28);
  if (param_1 != (long *)0x0) {
    uVar5 = 0xffff9f00;
    if ((param_2 == (void *)0x0) || (*param_1 == 0)) goto LAB_00b9e990;
    lVar16 = param_1[0xb];
    if (lVar16 != 0) {
      uVar3 = *(uint *)(*param_1 + 8);
      lVar6 = *(long *)(lVar16 + 0x20);
      uVar17 = (ulong)uVar3 & 0x1f;
      if ((lVar6 != 0) && (uVar17 - lVar6 < param_3)) {
        memcpy((void *)(lVar16 + lVar6 + 0x10),param_2,uVar17 - lVar6);
        uVar7 = 0;
        if (7 < (uint)uVar17) {
          lVar6 = 0;
          lVar19 = 0x10;
          if (0x10 < uVar17 + 1) {
            lVar19 = uVar17 + 1;
          }
          do {
            puVar1 = (ulong *)(lVar16 + lVar6);
            uVar7 = lVar6 + 0x10;
            lVar6 = lVar6 + 8;
            *puVar1 = *puVar1 ^ puVar1[2];
          } while (uVar7 <= uVar17);
          uVar7 = lVar19 - 1U & 0xfffffffffffffff8;
        }
        if (uVar7 < uVar17) {
          uVar10 = uVar17 - uVar7;
          if (0x1f < uVar10) {
            uVar12 = uVar10 & 0xffffffffffffffe0;
            lVar6 = lVar16 + uVar7;
            uVar7 = uVar7 + uVar12;
            puVar14 = (undefined8 *)(lVar6 + 0x10);
            uVar13 = uVar12;
            do {
              uVar20 = puVar14[-1];
              uVar5 = puVar14[-2];
              uVar29 = puVar14[1];
              uVar21 = *puVar14;
              uVar38 = puVar14[3];
              uVar37 = puVar14[2];
              uVar13 = uVar13 - 0x20;
              bVar22 = (byte)((ulong)uVar21 >> 8);
              bVar23 = (byte)((ulong)uVar21 >> 0x10);
              bVar24 = (byte)((ulong)uVar21 >> 0x18);
              bVar25 = (byte)((ulong)uVar21 >> 0x20);
              bVar26 = (byte)((ulong)uVar21 >> 0x28);
              bVar27 = (byte)((ulong)uVar21 >> 0x30);
              bVar28 = (byte)((ulong)uVar21 >> 0x38);
              bVar30 = (byte)((ulong)uVar29 >> 8);
              bVar31 = (byte)((ulong)uVar29 >> 0x10);
              bVar32 = (byte)((ulong)uVar29 >> 0x18);
              bVar33 = (byte)((ulong)uVar29 >> 0x20);
              bVar34 = (byte)((ulong)uVar29 >> 0x28);
              bVar35 = (byte)((ulong)uVar29 >> 0x30);
              bVar36 = (byte)((ulong)uVar29 >> 0x38);
              puVar14[-1] = CONCAT17((byte)((ulong)uVar20 >> 0x38) ^ bVar36,
                                     CONCAT16((byte)((ulong)uVar20 >> 0x30) ^ bVar35,
                                              CONCAT15((byte)((ulong)uVar20 >> 0x28) ^ bVar34,
                                                       CONCAT14((byte)((ulong)uVar20 >> 0x20) ^
                                                                bVar33,CONCAT13((byte)((ulong)uVar20
                                                                                      >> 0x18) ^
                                                                                bVar32,CONCAT12((
                                                  byte)((ulong)uVar20 >> 0x10) ^ bVar31,
                                                  CONCAT11((byte)((ulong)uVar20 >> 8) ^ bVar30,
                                                           (byte)uVar20 ^ (byte)uVar29)))))));
              puVar14[-2] = CONCAT17((byte)((ulong)uVar5 >> 0x38) ^ bVar28,
                                     CONCAT16((byte)((ulong)uVar5 >> 0x30) ^ bVar27,
                                              CONCAT15((byte)((ulong)uVar5 >> 0x28) ^ bVar26,
                                                       CONCAT14((byte)((ulong)uVar5 >> 0x20) ^
                                                                bVar25,CONCAT13((byte)((ulong)uVar5
                                                                                      >> 0x18) ^
                                                                                bVar24,CONCAT12((
                                                  byte)((ulong)uVar5 >> 0x10) ^ bVar23,
                                                  CONCAT11((byte)((ulong)uVar5 >> 8) ^ bVar22,
                                                           (byte)uVar5 ^ (byte)uVar21)))))));
              puVar14[1] = CONCAT17(bVar36 ^ (byte)((ulong)uVar38 >> 0x38),
                                    CONCAT16(bVar35 ^ (byte)((ulong)uVar38 >> 0x30),
                                             CONCAT15(bVar34 ^ (byte)((ulong)uVar38 >> 0x28),
                                                      CONCAT14(bVar33 ^ (byte)((ulong)uVar38 >> 0x20
                                                                              ),
                                                               CONCAT13(bVar32 ^ (byte)((ulong)
                                                  uVar38 >> 0x18),
                                                  CONCAT12(bVar31 ^ (byte)((ulong)uVar38 >> 0x10),
                                                           CONCAT11(bVar30 ^ (byte)((ulong)uVar38 >>
                                                                                   8),
                                                                    (byte)uVar29 ^ (byte)uVar38)))))
                                            ));
              *puVar14 = CONCAT17(bVar28 ^ (byte)((ulong)uVar37 >> 0x38),
                                  CONCAT16(bVar27 ^ (byte)((ulong)uVar37 >> 0x30),
                                           CONCAT15(bVar26 ^ (byte)((ulong)uVar37 >> 0x28),
                                                    CONCAT14(bVar25 ^ (byte)((ulong)uVar37 >> 0x20),
                                                             CONCAT13(bVar24 ^ (byte)((ulong)uVar37
                                                                                     >> 0x18),
                                                                      CONCAT12(bVar23 ^ (byte)((
                                                  ulong)uVar37 >> 0x10),
                                                  CONCAT11(bVar22 ^ (byte)((ulong)uVar37 >> 8),
                                                           (byte)uVar21 ^ (byte)uVar37)))))));
              puVar14 = puVar14 + 4;
            } while (uVar13 != 0);
            if (uVar10 == uVar12) goto LAB_00b9e808;
          }
          lVar6 = uVar17 - uVar7;
          pbVar11 = (byte *)(lVar16 + uVar7);
          do {
            lVar6 = lVar6 + -1;
            *pbVar11 = *pbVar11 ^ pbVar11[0x10];
            pbVar11 = pbVar11 + 1;
          } while (lVar6 != 0);
        }
LAB_00b9e808:
        uVar5 = mbedtls_cipher_update(param_1,lVar16,uVar17,lVar16,auStack_70);
        if ((int)uVar5 != 0) goto LAB_00b9e990;
        lVar6 = *(long *)(lVar16 + 0x20);
        *(undefined8 *)(lVar16 + 0x20) = 0;
        lVar6 = uVar17 - lVar6;
        param_2 = (void *)((long)param_2 + lVar6);
        param_3 = param_3 - lVar6;
      }
      uVar7 = 0;
      if ((uVar3 & 0x1f) != 0) {
        uVar7 = ((uVar17 + param_3) - 1) / uVar17;
      }
      pvVar18 = param_2;
      if (1 < uVar7) {
        lVar6 = 0x10;
        if (0x10 < uVar17 + 1) {
          lVar6 = uVar17 + 1;
        }
        lVar19 = 0;
        uVar10 = 1;
        do {
          uVar13 = 0;
          if (7 < (uint)uVar17) {
            lVar8 = 0;
            do {
              uVar13 = lVar8 + 0x10;
              *(ulong *)(lVar16 + lVar8) =
                   *(ulong *)(lVar16 + lVar8) ^ *(ulong *)((long)pvVar18 + lVar8);
              lVar8 = lVar8 + 8;
            } while (uVar13 <= uVar17);
            uVar13 = lVar6 - 1U & 0xfffffffffffffff8;
          }
          if (uVar13 < uVar17) {
            uVar12 = uVar17 - uVar13;
            if ((uVar12 < 0x20) ||
               ((lVar16 + uVar13 < (long)param_2 + lVar19 * uVar17 + uVar17 &&
                ((long)param_2 + uVar13 + lVar19 * uVar17 < lVar16 + uVar17)))) {
              uVar9 = uVar13;
            }
            else {
              uVar15 = uVar12 & 0xffffffffffffffe0;
              uVar9 = uVar13 + uVar15;
              lVar8 = uVar13 + 0x10;
              uVar13 = uVar15;
              do {
                puVar14 = (undefined8 *)((long)pvVar18 + lVar8);
                puVar2 = (undefined8 *)(lVar16 + lVar8);
                uVar20 = puVar14[-1];
                uVar5 = puVar14[-2];
                uVar29 = puVar14[1];
                uVar21 = *puVar14;
                uVar38 = puVar2[-1];
                uVar37 = puVar2[-2];
                uVar40 = puVar2[1];
                uVar39 = *puVar2;
                uVar13 = uVar13 - 0x20;
                lVar8 = lVar8 + 0x20;
                puVar2[-1] = CONCAT17((byte)((ulong)uVar38 >> 0x38) ^ (byte)((ulong)uVar20 >> 0x38),
                                      CONCAT16((byte)((ulong)uVar38 >> 0x30) ^
                                               (byte)((ulong)uVar20 >> 0x30),
                                               CONCAT15((byte)((ulong)uVar38 >> 0x28) ^
                                                        (byte)((ulong)uVar20 >> 0x28),
                                                        CONCAT14((byte)((ulong)uVar38 >> 0x20) ^
                                                                 (byte)((ulong)uVar20 >> 0x20),
                                                                 CONCAT13((byte)((ulong)uVar38 >>
                                                                                0x18) ^
                                                                          (byte)((ulong)uVar20 >>
                                                                                0x18),
                                                                          CONCAT12((byte)((ulong)
                                                  uVar38 >> 0x10) ^ (byte)((ulong)uVar20 >> 0x10),
                                                  CONCAT11((byte)((ulong)uVar38 >> 8) ^
                                                           (byte)((ulong)uVar20 >> 8),
                                                           (byte)uVar38 ^ (byte)uVar20)))))));
                puVar2[-2] = CONCAT17((byte)((ulong)uVar37 >> 0x38) ^ (byte)((ulong)uVar5 >> 0x38),
                                      CONCAT16((byte)((ulong)uVar37 >> 0x30) ^
                                               (byte)((ulong)uVar5 >> 0x30),
                                               CONCAT15((byte)((ulong)uVar37 >> 0x28) ^
                                                        (byte)((ulong)uVar5 >> 0x28),
                                                        CONCAT14((byte)((ulong)uVar37 >> 0x20) ^
                                                                 (byte)((ulong)uVar5 >> 0x20),
                                                                 CONCAT13((byte)((ulong)uVar37 >>
                                                                                0x18) ^
                                                                          (byte)((ulong)uVar5 >>
                                                                                0x18),
                                                                          CONCAT12((byte)((ulong)
                                                  uVar37 >> 0x10) ^ (byte)((ulong)uVar5 >> 0x10),
                                                  CONCAT11((byte)((ulong)uVar37 >> 8) ^
                                                           (byte)((ulong)uVar5 >> 8),
                                                           (byte)uVar37 ^ (byte)uVar5)))))));
                puVar2[1] = CONCAT17((byte)((ulong)uVar40 >> 0x38) ^ (byte)((ulong)uVar29 >> 0x38),
                                     CONCAT16((byte)((ulong)uVar40 >> 0x30) ^
                                              (byte)((ulong)uVar29 >> 0x30),
                                              CONCAT15((byte)((ulong)uVar40 >> 0x28) ^
                                                       (byte)((ulong)uVar29 >> 0x28),
                                                       CONCAT14((byte)((ulong)uVar40 >> 0x20) ^
                                                                (byte)((ulong)uVar29 >> 0x20),
                                                                CONCAT13((byte)((ulong)uVar40 >>
                                                                               0x18) ^
                                                                         (byte)((ulong)uVar29 >>
                                                                               0x18),
                                                                         CONCAT12((byte)((ulong)
                                                  uVar40 >> 0x10) ^ (byte)((ulong)uVar29 >> 0x10),
                                                  CONCAT11((byte)((ulong)uVar40 >> 8) ^
                                                           (byte)((ulong)uVar29 >> 8),
                                                           (byte)uVar40 ^ (byte)uVar29)))))));
                *puVar2 = CONCAT17((byte)((ulong)uVar39 >> 0x38) ^ (byte)((ulong)uVar21 >> 0x38),
                                   CONCAT16((byte)((ulong)uVar39 >> 0x30) ^
                                            (byte)((ulong)uVar21 >> 0x30),
                                            CONCAT15((byte)((ulong)uVar39 >> 0x28) ^
                                                     (byte)((ulong)uVar21 >> 0x28),
                                                     CONCAT14((byte)((ulong)uVar39 >> 0x20) ^
                                                              (byte)((ulong)uVar21 >> 0x20),
                                                              CONCAT13((byte)((ulong)uVar39 >> 0x18)
                                                                       ^ (byte)((ulong)uVar21 >>
                                                                               0x18),
                                                                       CONCAT12((byte)((ulong)uVar39
                                                                                      >> 0x10) ^
                                                                                (byte)((ulong)uVar21
                                                                                      >> 0x10),
                                                                                CONCAT11((byte)((
                                                  ulong)uVar39 >> 8) ^ (byte)((ulong)uVar21 >> 8),
                                                  (byte)uVar39 ^ (byte)uVar21)))))));
              } while (uVar13 != 0);
              if (uVar12 == uVar15) goto LAB_00b9e910;
            }
            do {
              *(byte *)(lVar16 + uVar9) =
                   *(byte *)(lVar16 + uVar9) ^ *(byte *)((long)pvVar18 + uVar9);
              uVar9 = uVar9 + 1;
            } while (uVar17 != uVar9);
          }
LAB_00b9e910:
          uVar5 = mbedtls_cipher_update(param_1,lVar16,uVar17,lVar16,auStack_70);
          if ((int)uVar5 != 0) goto LAB_00b9e990;
          uVar10 = uVar10 + 1;
          param_3 = param_3 - uVar17;
          pvVar18 = (void *)((long)pvVar18 + uVar17);
          lVar19 = lVar19 + 1;
        } while (uVar10 < uVar7);
      }
      if (param_3 == 0) {
        uVar5 = 0;
      }
      else {
        memcpy((void *)(lVar16 + *(long *)(lVar16 + 0x20) + 0x10),pvVar18,param_3);
        uVar5 = 0;
        *(ulong *)(lVar16 + 0x20) = *(long *)(lVar16 + 0x20) + param_3;
      }
      goto LAB_00b9e990;
    }
  }
  uVar5 = 0xffff9f00;
LAB_00b9e990:
  if (*(long *)(lVar4 + 0x28) != local_68) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail(uVar5);
  }
  return;
}

