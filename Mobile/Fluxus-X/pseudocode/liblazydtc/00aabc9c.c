/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00aabc9c
 */

undefined8
CRYPTO_ocb128_encrypt(undefined8 *param_1,undefined8 *param_2,undefined8 *param_3,ulong param_4)

{
  ulong uVar1;
  ulong *puVar2;
  char *pcVar3;
  char cVar4;
  uint uVar5;
  void *pvVar6;
  undefined8 *puVar7;
  uint uVar8;
  ulong uVar9;
  ulong uVar10;
  ulong uVar11;
  ulong uVar12;
  long lVar13;
  long lVar14;
  byte bVar16;
  byte bVar17;
  byte bVar18;
  byte bVar19;
  byte bVar20;
  byte bVar21;
  undefined8 uVar15;
  byte bVar22;
  byte bVar24;
  byte bVar25;
  byte bVar26;
  byte bVar27;
  byte bVar28;
  byte bVar29;
  undefined8 uVar23;
  byte bVar30;
  undefined8 uVar31;
  undefined8 uVar32;
  undefined8 local_70;
  undefined8 uStack_68;
  
  uVar9 = param_1[0xd];
  uVar12 = param_4 >> 4;
  uVar1 = uVar9 + uVar12;
  if ((uVar12 == 0) || (param_1[4] == 0)) {
    while (uVar9 = uVar9 + 1, uVar9 <= uVar1) {
      uVar8 = 0;
      if ((uVar9 & 1) == 0) {
        uVar8 = 0;
        uVar12 = uVar9;
        do {
          uVar5 = (uint)uVar12;
          uVar12 = uVar12 >> 1;
          uVar8 = uVar8 + 1;
        } while ((uVar5 >> 1 & 1) == 0);
      }
      uVar12 = param_1[5];
      uVar10 = (ulong)uVar8;
      if (uVar12 < uVar10) {
        uVar11 = param_1[6];
        if (uVar11 <= uVar10) {
          lVar14 = ((uVar10 + 4) - uVar11 & 0xfffffffffffffffc) + uVar11;
          param_1[6] = lVar14;
          pvVar6 = CRYPTO_realloc((void *)param_1[0xb],(int)lVar14 * 0x10,"crypto/modes/ocb128.c",
                                  0x71);
          if (pvVar6 == (void *)0x0) {
            return 0;
          }
          param_1[0xb] = pvVar6;
        }
        lVar13 = uVar10 - uVar12;
        lVar14 = uVar12 << 4;
        do {
          pcVar3 = (char *)(param_1[0xb] + lVar14);
          cVar4 = *pcVar3;
          FUN_00aab930(pcVar3,1,pcVar3 + 0x10);
          lVar13 = lVar13 + -1;
          lVar14 = lVar14 + 0x10;
          pcVar3[0x1f] = pcVar3[0x1f] ^ (byte)((ulong)(long)cVar4 >> 7) & 0x87;
        } while (lVar13 != 0);
        param_1[5] = uVar10;
      }
      puVar2 = (ulong *)(param_1[0xb] + uVar10 * 0x10);
      if (puVar2 == (ulong *)0x0) {
        return 0;
      }
      uVar11 = *puVar2 ^ param_1[0x12];
      param_1[0x12] = uVar11;
      uVar12 = *(ulong *)(param_1[0xb] + uVar10 * 0x10 + 8) ^ param_1[0x13];
      param_1[0x13] = uVar12;
      uVar23 = param_2[1];
      uVar15 = *param_2;
      uVar32 = param_1[0x15];
      uVar31 = param_1[0x14];
      bVar16 = (byte)((ulong)uVar15 >> 8);
      bVar17 = (byte)((ulong)uVar15 >> 0x10);
      bVar18 = (byte)((ulong)uVar15 >> 0x18);
      bVar19 = (byte)((ulong)uVar15 >> 0x20);
      bVar20 = (byte)((ulong)uVar15 >> 0x28);
      bVar21 = (byte)((ulong)uVar15 >> 0x30);
      bVar22 = (byte)((ulong)uVar15 >> 0x38);
      bVar24 = (byte)((ulong)uVar23 >> 8);
      bVar25 = (byte)((ulong)uVar23 >> 0x10);
      bVar26 = (byte)((ulong)uVar23 >> 0x18);
      bVar27 = (byte)((ulong)uVar23 >> 0x20);
      bVar28 = (byte)((ulong)uVar23 >> 0x28);
      bVar29 = (byte)((ulong)uVar23 >> 0x30);
      bVar30 = (byte)((ulong)uVar23 >> 0x38);
      local_70 = CONCAT17(bVar22 ^ (byte)(uVar11 >> 0x38),
                          CONCAT16(bVar21 ^ (byte)(uVar11 >> 0x30),
                                   CONCAT15(bVar20 ^ (byte)(uVar11 >> 0x28),
                                            CONCAT14(bVar19 ^ (byte)(uVar11 >> 0x20),
                                                     CONCAT13(bVar18 ^ (byte)(uVar11 >> 0x18),
                                                              CONCAT12(bVar17 ^ (byte)(uVar11 >>
                                                                                      0x10),
                                                                       CONCAT11(bVar16 ^ (byte)(
                                                  uVar11 >> 8),(byte)uVar15 ^ (byte)uVar11)))))));
      uStack_68 = CONCAT17(bVar30 ^ (byte)(uVar12 >> 0x38),
                           CONCAT16(bVar29 ^ (byte)(uVar12 >> 0x30),
                                    CONCAT15(bVar28 ^ (byte)(uVar12 >> 0x28),
                                             CONCAT14(bVar27 ^ (byte)(uVar12 >> 0x20),
                                                      CONCAT13(bVar26 ^ (byte)(uVar12 >> 0x18),
                                                               CONCAT12(bVar25 ^ (byte)(uVar12 >>
                                                                                       0x10),
                                                                        CONCAT11(bVar24 ^ (byte)(
                                                  uVar12 >> 8),(byte)uVar23 ^ (byte)uVar12)))))));
      param_1[0x15] =
           CONCAT17((byte)((ulong)uVar32 >> 0x38) ^ bVar30,
                    CONCAT16((byte)((ulong)uVar32 >> 0x30) ^ bVar29,
                             CONCAT15((byte)((ulong)uVar32 >> 0x28) ^ bVar28,
                                      CONCAT14((byte)((ulong)uVar32 >> 0x20) ^ bVar27,
                                               CONCAT13((byte)((ulong)uVar32 >> 0x18) ^ bVar26,
                                                        CONCAT12((byte)((ulong)uVar32 >> 0x10) ^
                                                                 bVar25,CONCAT11((byte)((ulong)
                                                  uVar32 >> 8) ^ bVar24,(byte)uVar32 ^ (byte)uVar23)
                                                  ))))));
      param_1[0x14] =
           CONCAT17((byte)((ulong)uVar31 >> 0x38) ^ bVar22,
                    CONCAT16((byte)((ulong)uVar31 >> 0x30) ^ bVar21,
                             CONCAT15((byte)((ulong)uVar31 >> 0x28) ^ bVar20,
                                      CONCAT14((byte)((ulong)uVar31 >> 0x20) ^ bVar19,
                                               CONCAT13((byte)((ulong)uVar31 >> 0x18) ^ bVar18,
                                                        CONCAT12((byte)((ulong)uVar31 >> 0x10) ^
                                                                 bVar17,CONCAT11((byte)((ulong)
                                                  uVar31 >> 8) ^ bVar16,(byte)uVar31 ^ (byte)uVar15)
                                                  ))))));
      (*(code *)*param_1)(&local_70,&local_70,param_1[2]);
      uVar23 = param_1[0x13];
      uVar15 = param_1[0x12];
      local_70 = CONCAT17((byte)((ulong)local_70 >> 0x38) ^ (byte)((ulong)uVar15 >> 0x38),
                          CONCAT16((byte)((ulong)local_70 >> 0x30) ^ (byte)((ulong)uVar15 >> 0x30),
                                   CONCAT15((byte)((ulong)local_70 >> 0x28) ^
                                            (byte)((ulong)uVar15 >> 0x28),
                                            CONCAT14((byte)((ulong)local_70 >> 0x20) ^
                                                     (byte)((ulong)uVar15 >> 0x20),
                                                     CONCAT13((byte)((ulong)local_70 >> 0x18) ^
                                                              (byte)((ulong)uVar15 >> 0x18),
                                                              CONCAT12((byte)((ulong)local_70 >>
                                                                             0x10) ^
                                                                       (byte)((ulong)uVar15 >> 0x10)
                                                                       ,CONCAT11((byte)((ulong)
                                                  local_70 >> 8) ^ (byte)((ulong)uVar15 >> 8),
                                                  (byte)local_70 ^ (byte)uVar15)))))));
      uStack_68 = CONCAT17((byte)((ulong)uStack_68 >> 0x38) ^ (byte)((ulong)uVar23 >> 0x38),
                           CONCAT16((byte)((ulong)uStack_68 >> 0x30) ^ (byte)((ulong)uVar23 >> 0x30)
                                    ,CONCAT15((byte)((ulong)uStack_68 >> 0x28) ^
                                              (byte)((ulong)uVar23 >> 0x28),
                                              CONCAT14((byte)((ulong)uStack_68 >> 0x20) ^
                                                       (byte)((ulong)uVar23 >> 0x20),
                                                       CONCAT13((byte)((ulong)uStack_68 >> 0x18) ^
                                                                (byte)((ulong)uVar23 >> 0x18),
                                                                CONCAT12((byte)((ulong)uStack_68 >>
                                                                               0x10) ^
                                                                         (byte)((ulong)uVar23 >>
                                                                               0x10),
                                                                         CONCAT11((byte)((ulong)
                                                  uStack_68 >> 8) ^ (byte)((ulong)uVar23 >> 8),
                                                  (byte)uStack_68 ^ (byte)uVar23)))))));
      param_3[1] = uStack_68;
      *param_3 = local_70;
      param_3 = param_3 + 2;
      param_2 = param_2 + 2;
    }
  }
  else {
    uVar9 = 0xffffffffffffffff;
    lVar14 = 0x10;
    uVar10 = uVar1;
    do {
      uVar10 = uVar10 >> 1;
      uVar9 = uVar9 + 1;
      lVar14 = lVar14 + -0x10;
    } while (uVar10 != 0);
    uVar10 = param_1[5];
    if (uVar10 < uVar9) {
      uVar11 = param_1[6];
      if (uVar11 <= uVar9) {
        lVar13 = ((uVar9 - uVar11) + 4 & 0xfffffffffffffffc) + uVar11;
        param_1[6] = lVar13;
        pvVar6 = CRYPTO_realloc((void *)param_1[0xb],(int)lVar13 * 0x10,"crypto/modes/ocb128.c",0x71
                               );
        if (pvVar6 == (void *)0x0) {
          return 0;
        }
        param_1[0xb] = pvVar6;
      }
      lVar13 = uVar10 << 4;
      do {
        pcVar3 = (char *)(param_1[0xb] + lVar13);
        cVar4 = *pcVar3;
        FUN_00aab930(pcVar3,1,pcVar3 + 0x10);
        uVar10 = uVar10 + 1;
        lVar13 = lVar13 + 0x10;
        pcVar3[0x1f] = pcVar3[0x1f] ^ (byte)((ulong)(long)cVar4 >> 7) & 0x87;
      } while (uVar9 != uVar10);
      param_1[5] = uVar9;
    }
    if (param_1[0xb] == lVar14) {
      return 0;
    }
    (*(code *)param_1[4])
              (param_2,param_3,uVar12,param_1[2],param_1[0xd] + 1,param_1 + 0x12,param_1[0xb],
               param_1 + 0x14);
  }
  param_4 = param_4 & 0xf;
  if (param_4 != 0) {
    puVar7 = param_1 + 0x12;
    uVar23 = param_1[0x13];
    uVar15 = *puVar7;
    uVar32 = param_1[8];
    uVar31 = param_1[7];
    param_1[0x13] =
         CONCAT17((byte)((ulong)uVar32 >> 0x38) ^ (byte)((ulong)uVar23 >> 0x38),
                  CONCAT16((byte)((ulong)uVar32 >> 0x30) ^ (byte)((ulong)uVar23 >> 0x30),
                           CONCAT15((byte)((ulong)uVar32 >> 0x28) ^ (byte)((ulong)uVar23 >> 0x28),
                                    CONCAT14((byte)((ulong)uVar32 >> 0x20) ^
                                             (byte)((ulong)uVar23 >> 0x20),
                                             CONCAT13((byte)((ulong)uVar32 >> 0x18) ^
                                                      (byte)((ulong)uVar23 >> 0x18),
                                                      CONCAT12((byte)((ulong)uVar32 >> 0x10) ^
                                                               (byte)((ulong)uVar23 >> 0x10),
                                                               CONCAT11((byte)((ulong)uVar32 >> 8) ^
                                                                        (byte)((ulong)uVar23 >> 8),
                                                                        (byte)uVar32 ^ (byte)uVar23)
                                                              ))))));
    *puVar7 = CONCAT17((byte)((ulong)uVar31 >> 0x38) ^ (byte)((ulong)uVar15 >> 0x38),
                       CONCAT16((byte)((ulong)uVar31 >> 0x30) ^ (byte)((ulong)uVar15 >> 0x30),
                                CONCAT15((byte)((ulong)uVar31 >> 0x28) ^
                                         (byte)((ulong)uVar15 >> 0x28),
                                         CONCAT14((byte)((ulong)uVar31 >> 0x20) ^
                                                  (byte)((ulong)uVar15 >> 0x20),
                                                  CONCAT13((byte)((ulong)uVar31 >> 0x18) ^
                                                           (byte)((ulong)uVar15 >> 0x18),
                                                           CONCAT12((byte)((ulong)uVar31 >> 0x10) ^
                                                                    (byte)((ulong)uVar15 >> 0x10),
                                                                    CONCAT11((byte)((ulong)uVar31 >>
                                                                                   8) ^
                                                                             (byte)((ulong)uVar15 >>
                                                                                   8),(byte)uVar31 ^
                                                                                      (byte)uVar15))
                                                          )))));
    (*(code *)*param_1)(puVar7,&local_70,param_1[2]);
    uVar9 = 0;
    do {
      *(byte *)((long)param_3 + uVar9) =
           *(byte *)((long)&local_70 + uVar9) ^ *(byte *)((long)param_2 + uVar9);
      uVar9 = uVar9 + 1;
    } while (param_4 != uVar9);
    memset((undefined1 *)((long)&local_70 + param_4),0,0x10 - param_4);
    memcpy(&local_70,param_2,param_4);
    *(undefined1 *)((long)&local_70 + param_4) = 0x80;
    uVar23 = param_1[0x15];
    uVar15 = param_1[0x14];
    param_1[0x15] =
         CONCAT17((byte)((ulong)uVar23 >> 0x38) ^ (byte)((ulong)uStack_68 >> 0x38),
                  CONCAT16((byte)((ulong)uVar23 >> 0x30) ^ (byte)((ulong)uStack_68 >> 0x30),
                           CONCAT15((byte)((ulong)uVar23 >> 0x28) ^ (byte)((ulong)uStack_68 >> 0x28)
                                    ,CONCAT14((byte)((ulong)uVar23 >> 0x20) ^
                                              (byte)((ulong)uStack_68 >> 0x20),
                                              CONCAT13((byte)((ulong)uVar23 >> 0x18) ^
                                                       (byte)((ulong)uStack_68 >> 0x18),
                                                       CONCAT12((byte)((ulong)uVar23 >> 0x10) ^
                                                                (byte)((ulong)uStack_68 >> 0x10),
                                                                CONCAT11((byte)((ulong)uVar23 >> 8)
                                                                         ^ (byte)((ulong)uStack_68
                                                                                 >> 8),
                                                                         (byte)uVar23 ^
                                                                         (byte)uStack_68)))))));
    param_1[0x14] =
         CONCAT17((byte)((ulong)uVar15 >> 0x38) ^ (byte)((ulong)local_70 >> 0x38),
                  CONCAT16((byte)((ulong)uVar15 >> 0x30) ^ (byte)((ulong)local_70 >> 0x30),
                           CONCAT15((byte)((ulong)uVar15 >> 0x28) ^ (byte)((ulong)local_70 >> 0x28),
                                    CONCAT14((byte)((ulong)uVar15 >> 0x20) ^
                                             (byte)((ulong)local_70 >> 0x20),
                                             CONCAT13((byte)((ulong)uVar15 >> 0x18) ^
                                                      (byte)((ulong)local_70 >> 0x18),
                                                      CONCAT12((byte)((ulong)uVar15 >> 0x10) ^
                                                               (byte)((ulong)local_70 >> 0x10),
                                                               CONCAT11((byte)((ulong)uVar15 >> 8) ^
                                                                        (byte)((ulong)local_70 >> 8)
                                                                        ,(byte)uVar15 ^
                                                                         (byte)local_70)))))));
  }
  param_1[0xd] = uVar1;
  return 1;
}

