/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00aac00c
 */

undefined8 CRYPTO_ocb128_decrypt(undefined8 *param_1,ulong *param_2,ulong *param_3,ulong param_4)

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
  byte bVar15;
  byte bVar17;
  byte bVar18;
  byte bVar19;
  byte bVar20;
  byte bVar21;
  byte bVar22;
  undefined8 uVar16;
  byte bVar23;
  byte bVar24;
  byte bVar26;
  byte bVar27;
  byte bVar28;
  byte bVar29;
  byte bVar30;
  byte bVar31;
  undefined8 uVar25;
  byte bVar32;
  undefined8 uVar33;
  undefined8 uVar34;
  ulong local_70;
  ulong uStack_68;
  
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
      local_70 = *puVar2 ^ param_1[0x12];
      param_1[0x12] = local_70;
      uStack_68 = *(ulong *)(param_1[0xb] + uVar10 * 0x10 + 8) ^ param_1[0x13];
      param_1[0x13] = uStack_68;
      local_70 = *param_2 ^ local_70;
      uStack_68 = param_2[1] ^ uStack_68;
      (*(code *)param_1[1])(&local_70,&local_70,param_1[3]);
      uVar25 = param_1[0x13];
      uVar16 = param_1[0x12];
      bVar15 = (byte)local_70 ^ (byte)uVar16;
      bVar17 = (byte)(local_70 >> 8) ^ (byte)((ulong)uVar16 >> 8);
      bVar18 = (byte)(local_70 >> 0x10) ^ (byte)((ulong)uVar16 >> 0x10);
      bVar19 = (byte)(local_70 >> 0x18) ^ (byte)((ulong)uVar16 >> 0x18);
      bVar20 = (byte)(local_70 >> 0x20) ^ (byte)((ulong)uVar16 >> 0x20);
      bVar21 = (byte)(local_70 >> 0x28) ^ (byte)((ulong)uVar16 >> 0x28);
      bVar22 = (byte)(local_70 >> 0x30) ^ (byte)((ulong)uVar16 >> 0x30);
      bVar23 = (byte)(local_70 >> 0x38) ^ (byte)((ulong)uVar16 >> 0x38);
      local_70 = CONCAT17(bVar23,CONCAT16(bVar22,CONCAT15(bVar21,CONCAT14(bVar20,CONCAT13(bVar19,
                                                  CONCAT12(bVar18,CONCAT11(bVar17,bVar15)))))));
      bVar24 = (byte)uStack_68 ^ (byte)uVar25;
      bVar26 = (byte)(uStack_68 >> 8) ^ (byte)((ulong)uVar25 >> 8);
      bVar27 = (byte)(uStack_68 >> 0x10) ^ (byte)((ulong)uVar25 >> 0x10);
      bVar28 = (byte)(uStack_68 >> 0x18) ^ (byte)((ulong)uVar25 >> 0x18);
      bVar29 = (byte)(uStack_68 >> 0x20) ^ (byte)((ulong)uVar25 >> 0x20);
      bVar30 = (byte)(uStack_68 >> 0x28) ^ (byte)((ulong)uVar25 >> 0x28);
      bVar31 = (byte)(uStack_68 >> 0x30) ^ (byte)((ulong)uVar25 >> 0x30);
      bVar32 = (byte)(uStack_68 >> 0x38) ^ (byte)((ulong)uVar25 >> 0x38);
      uStack_68 = CONCAT17(bVar32,CONCAT16(bVar31,CONCAT15(bVar30,CONCAT14(bVar29,CONCAT13(bVar28,
                                                  CONCAT12(bVar27,CONCAT11(bVar26,bVar24)))))));
      uVar25 = param_1[0x15];
      uVar16 = param_1[0x14];
      param_1[0x15] =
           CONCAT17((byte)((ulong)uVar25 >> 0x38) ^ bVar32,
                    CONCAT16((byte)((ulong)uVar25 >> 0x30) ^ bVar31,
                             CONCAT15((byte)((ulong)uVar25 >> 0x28) ^ bVar30,
                                      CONCAT14((byte)((ulong)uVar25 >> 0x20) ^ bVar29,
                                               CONCAT13((byte)((ulong)uVar25 >> 0x18) ^ bVar28,
                                                        CONCAT12((byte)((ulong)uVar25 >> 0x10) ^
                                                                 bVar27,CONCAT11((byte)((ulong)
                                                  uVar25 >> 8) ^ bVar26,(byte)uVar25 ^ bVar24)))))))
      ;
      param_1[0x14] =
           CONCAT17((byte)((ulong)uVar16 >> 0x38) ^ bVar23,
                    CONCAT16((byte)((ulong)uVar16 >> 0x30) ^ bVar22,
                             CONCAT15((byte)((ulong)uVar16 >> 0x28) ^ bVar21,
                                      CONCAT14((byte)((ulong)uVar16 >> 0x20) ^ bVar20,
                                               CONCAT13((byte)((ulong)uVar16 >> 0x18) ^ bVar19,
                                                        CONCAT12((byte)((ulong)uVar16 >> 0x10) ^
                                                                 bVar18,CONCAT11((byte)((ulong)
                                                  uVar16 >> 8) ^ bVar17,(byte)uVar16 ^ bVar15)))))))
      ;
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
              (param_2,param_3,uVar12,param_1[3],param_1[0xd] + 1,param_1 + 0x12,param_1[0xb],
               param_1 + 0x14);
  }
  param_4 = param_4 & 0xf;
  if (param_4 != 0) {
    puVar7 = param_1 + 0x12;
    uVar25 = param_1[0x13];
    uVar16 = *puVar7;
    uVar34 = param_1[8];
    uVar33 = param_1[7];
    param_1[0x13] =
         CONCAT17((byte)((ulong)uVar34 >> 0x38) ^ (byte)((ulong)uVar25 >> 0x38),
                  CONCAT16((byte)((ulong)uVar34 >> 0x30) ^ (byte)((ulong)uVar25 >> 0x30),
                           CONCAT15((byte)((ulong)uVar34 >> 0x28) ^ (byte)((ulong)uVar25 >> 0x28),
                                    CONCAT14((byte)((ulong)uVar34 >> 0x20) ^
                                             (byte)((ulong)uVar25 >> 0x20),
                                             CONCAT13((byte)((ulong)uVar34 >> 0x18) ^
                                                      (byte)((ulong)uVar25 >> 0x18),
                                                      CONCAT12((byte)((ulong)uVar34 >> 0x10) ^
                                                               (byte)((ulong)uVar25 >> 0x10),
                                                               CONCAT11((byte)((ulong)uVar34 >> 8) ^
                                                                        (byte)((ulong)uVar25 >> 8),
                                                                        (byte)uVar34 ^ (byte)uVar25)
                                                              ))))));
    *puVar7 = CONCAT17((byte)((ulong)uVar33 >> 0x38) ^ (byte)((ulong)uVar16 >> 0x38),
                       CONCAT16((byte)((ulong)uVar33 >> 0x30) ^ (byte)((ulong)uVar16 >> 0x30),
                                CONCAT15((byte)((ulong)uVar33 >> 0x28) ^
                                         (byte)((ulong)uVar16 >> 0x28),
                                         CONCAT14((byte)((ulong)uVar33 >> 0x20) ^
                                                  (byte)((ulong)uVar16 >> 0x20),
                                                  CONCAT13((byte)((ulong)uVar33 >> 0x18) ^
                                                           (byte)((ulong)uVar16 >> 0x18),
                                                           CONCAT12((byte)((ulong)uVar33 >> 0x10) ^
                                                                    (byte)((ulong)uVar16 >> 0x10),
                                                                    CONCAT11((byte)((ulong)uVar33 >>
                                                                                   8) ^
                                                                             (byte)((ulong)uVar16 >>
                                                                                   8),(byte)uVar33 ^
                                                                                      (byte)uVar16))
                                                          )))));
    (*(code *)*param_1)(puVar7,&local_70,param_1[2]);
    uVar9 = 0;
    do {
      *(byte *)((long)param_3 + uVar9) =
           *(byte *)((long)&local_70 + uVar9) ^ *(byte *)((long)param_2 + uVar9);
      uVar9 = uVar9 + 1;
    } while (param_4 != uVar9);
    memset((undefined1 *)((long)&local_70 + param_4),0,0x10 - param_4);
    memcpy(&local_70,param_3,param_4);
    *(undefined1 *)((long)&local_70 + param_4) = 0x80;
    uVar25 = param_1[0x15];
    uVar16 = param_1[0x14];
    param_1[0x15] =
         CONCAT17((byte)((ulong)uVar25 >> 0x38) ^ (byte)(uStack_68 >> 0x38),
                  CONCAT16((byte)((ulong)uVar25 >> 0x30) ^ (byte)(uStack_68 >> 0x30),
                           CONCAT15((byte)((ulong)uVar25 >> 0x28) ^ (byte)(uStack_68 >> 0x28),
                                    CONCAT14((byte)((ulong)uVar25 >> 0x20) ^
                                             (byte)(uStack_68 >> 0x20),
                                             CONCAT13((byte)((ulong)uVar25 >> 0x18) ^
                                                      (byte)(uStack_68 >> 0x18),
                                                      CONCAT12((byte)((ulong)uVar25 >> 0x10) ^
                                                               (byte)(uStack_68 >> 0x10),
                                                               CONCAT11((byte)((ulong)uVar25 >> 8) ^
                                                                        (byte)(uStack_68 >> 8),
                                                                        (byte)uVar25 ^
                                                                        (byte)uStack_68)))))));
    param_1[0x14] =
         CONCAT17((byte)((ulong)uVar16 >> 0x38) ^ (byte)(local_70 >> 0x38),
                  CONCAT16((byte)((ulong)uVar16 >> 0x30) ^ (byte)(local_70 >> 0x30),
                           CONCAT15((byte)((ulong)uVar16 >> 0x28) ^ (byte)(local_70 >> 0x28),
                                    CONCAT14((byte)((ulong)uVar16 >> 0x20) ^
                                             (byte)(local_70 >> 0x20),
                                             CONCAT13((byte)((ulong)uVar16 >> 0x18) ^
                                                      (byte)(local_70 >> 0x18),
                                                      CONCAT12((byte)((ulong)uVar16 >> 0x10) ^
                                                               (byte)(local_70 >> 0x10),
                                                               CONCAT11((byte)((ulong)uVar16 >> 8) ^
                                                                        (byte)(local_70 >> 8),
                                                                        (byte)uVar16 ^
                                                                        (byte)local_70)))))));
  }
  param_1[0xd] = uVar1;
  return 1;
}

