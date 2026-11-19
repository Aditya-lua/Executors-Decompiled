/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00aaba78
 */

undefined8 CRYPTO_ocb128_aad(undefined8 *param_1,ulong *param_2,ulong param_3)

{
  ulong uVar1;
  char *pcVar2;
  ulong *puVar3;
  char cVar4;
  uint uVar5;
  void *pvVar6;
  uint uVar7;
  ulong uVar8;
  ulong uVar9;
  ulong uVar10;
  ulong uVar11;
  long lVar12;
  long lVar13;
  byte bVar14;
  byte bVar16;
  byte bVar17;
  byte bVar18;
  byte bVar19;
  byte bVar20;
  byte bVar21;
  undefined8 uVar15;
  byte bVar22;
  byte bVar23;
  byte bVar25;
  byte bVar26;
  byte bVar27;
  byte bVar28;
  byte bVar29;
  byte bVar30;
  undefined8 uVar24;
  byte bVar31;
  undefined8 uVar32;
  undefined8 uVar33;
  ulong local_70;
  ulong uStack_68;
  
  uVar8 = param_1[0xc];
  uVar1 = uVar8 + (param_3 >> 4);
  while( true ) {
    uVar8 = uVar8 + 1;
    if (uVar1 < uVar8) {
      param_3 = param_3 & 0xf;
      if (param_3 != 0) {
        uVar24 = param_1[0xf];
        uVar15 = param_1[0xe];
        uVar33 = param_1[8];
        uVar32 = param_1[7];
        bVar14 = (byte)uVar32 ^ (byte)uVar15;
        bVar16 = (byte)((ulong)uVar32 >> 8) ^ (byte)((ulong)uVar15 >> 8);
        bVar17 = (byte)((ulong)uVar32 >> 0x10) ^ (byte)((ulong)uVar15 >> 0x10);
        bVar18 = (byte)((ulong)uVar32 >> 0x18) ^ (byte)((ulong)uVar15 >> 0x18);
        bVar19 = (byte)((ulong)uVar32 >> 0x20) ^ (byte)((ulong)uVar15 >> 0x20);
        bVar20 = (byte)((ulong)uVar32 >> 0x28) ^ (byte)((ulong)uVar15 >> 0x28);
        bVar21 = (byte)((ulong)uVar32 >> 0x30) ^ (byte)((ulong)uVar15 >> 0x30);
        bVar22 = (byte)((ulong)uVar32 >> 0x38) ^ (byte)((ulong)uVar15 >> 0x38);
        bVar23 = (byte)uVar33 ^ (byte)uVar24;
        bVar25 = (byte)((ulong)uVar33 >> 8) ^ (byte)((ulong)uVar24 >> 8);
        bVar26 = (byte)((ulong)uVar33 >> 0x10) ^ (byte)((ulong)uVar24 >> 0x10);
        bVar27 = (byte)((ulong)uVar33 >> 0x18) ^ (byte)((ulong)uVar24 >> 0x18);
        bVar28 = (byte)((ulong)uVar33 >> 0x20) ^ (byte)((ulong)uVar24 >> 0x20);
        bVar29 = (byte)((ulong)uVar33 >> 0x28) ^ (byte)((ulong)uVar24 >> 0x28);
        bVar30 = (byte)((ulong)uVar33 >> 0x30) ^ (byte)((ulong)uVar24 >> 0x30);
        bVar31 = (byte)((ulong)uVar33 >> 0x38) ^ (byte)((ulong)uVar24 >> 0x38);
        param_1[0xf] = CONCAT17(bVar31,CONCAT16(bVar30,CONCAT15(bVar29,CONCAT14(bVar28,CONCAT13(
                                                  bVar27,CONCAT12(bVar26,CONCAT11(bVar25,bVar23)))))
                                               ));
        param_1[0xe] = CONCAT17(bVar22,CONCAT16(bVar21,CONCAT15(bVar20,CONCAT14(bVar19,CONCAT13(
                                                  bVar18,CONCAT12(bVar17,CONCAT11(bVar16,bVar14)))))
                                               ));
        memset((undefined1 *)((long)&local_70 + param_3),0,0x10 - param_3);
        memcpy(&local_70,param_2,param_3);
        *(undefined1 *)((long)&local_70 + param_3) = 0x80;
        local_70 = CONCAT17((byte)(local_70 >> 0x38) ^ bVar22,
                            CONCAT16((byte)(local_70 >> 0x30) ^ bVar21,
                                     CONCAT15((byte)(local_70 >> 0x28) ^ bVar20,
                                              CONCAT14((byte)(local_70 >> 0x20) ^ bVar19,
                                                       CONCAT13((byte)(local_70 >> 0x18) ^ bVar18,
                                                                CONCAT12((byte)(local_70 >> 0x10) ^
                                                                         bVar17,CONCAT11((byte)(
                                                  local_70 >> 8) ^ bVar16,(byte)local_70 ^ bVar14)))
                                                  ))));
        uStack_68 = CONCAT17((byte)(uStack_68 >> 0x38) ^ bVar31,
                             CONCAT16((byte)(uStack_68 >> 0x30) ^ bVar30,
                                      CONCAT15((byte)(uStack_68 >> 0x28) ^ bVar29,
                                               CONCAT14((byte)(uStack_68 >> 0x20) ^ bVar28,
                                                        CONCAT13((byte)(uStack_68 >> 0x18) ^ bVar27,
                                                                 CONCAT12((byte)(uStack_68 >> 0x10)
                                                                          ^ bVar26,CONCAT11((byte)(
                                                  uStack_68 >> 8) ^ bVar25,(byte)uStack_68 ^ bVar23)
                                                  ))))));
        (*(code *)*param_1)(&local_70,&local_70,param_1[2]);
        uVar24 = param_1[0x11];
        uVar15 = param_1[0x10];
        param_1[0x11] =
             CONCAT17((byte)((ulong)uVar24 >> 0x38) ^ (byte)(uStack_68 >> 0x38),
                      CONCAT16((byte)((ulong)uVar24 >> 0x30) ^ (byte)(uStack_68 >> 0x30),
                               CONCAT15((byte)((ulong)uVar24 >> 0x28) ^ (byte)(uStack_68 >> 0x28),
                                        CONCAT14((byte)((ulong)uVar24 >> 0x20) ^
                                                 (byte)(uStack_68 >> 0x20),
                                                 CONCAT13((byte)((ulong)uVar24 >> 0x18) ^
                                                          (byte)(uStack_68 >> 0x18),
                                                          CONCAT12((byte)((ulong)uVar24 >> 0x10) ^
                                                                   (byte)(uStack_68 >> 0x10),
                                                                   CONCAT11((byte)((ulong)uVar24 >>
                                                                                  8) ^
                                                                            (byte)(uStack_68 >> 8),
                                                                            (byte)uVar24 ^
                                                                            (byte)uStack_68)))))));
        param_1[0x10] =
             CONCAT17((byte)((ulong)uVar15 >> 0x38) ^ (byte)(local_70 >> 0x38),
                      CONCAT16((byte)((ulong)uVar15 >> 0x30) ^ (byte)(local_70 >> 0x30),
                               CONCAT15((byte)((ulong)uVar15 >> 0x28) ^ (byte)(local_70 >> 0x28),
                                        CONCAT14((byte)((ulong)uVar15 >> 0x20) ^
                                                 (byte)(local_70 >> 0x20),
                                                 CONCAT13((byte)((ulong)uVar15 >> 0x18) ^
                                                          (byte)(local_70 >> 0x18),
                                                          CONCAT12((byte)((ulong)uVar15 >> 0x10) ^
                                                                   (byte)(local_70 >> 0x10),
                                                                   CONCAT11((byte)((ulong)uVar15 >>
                                                                                  8) ^
                                                                            (byte)(local_70 >> 8),
                                                                            (byte)uVar15 ^
                                                                            (byte)local_70)))))));
      }
      param_1[0xc] = uVar1;
      return 1;
    }
    uVar7 = 0;
    if ((uVar8 & 1) == 0) {
      uVar7 = 0;
      uVar10 = uVar8;
      do {
        uVar5 = (uint)uVar10;
        uVar10 = uVar10 >> 1;
        uVar7 = uVar7 + 1;
      } while ((uVar5 >> 1 & 1) == 0);
    }
    uVar10 = param_1[5];
    uVar11 = (ulong)uVar7;
    if (uVar10 < uVar11) {
      uVar9 = param_1[6];
      if (uVar9 <= uVar11) {
        lVar13 = ((uVar11 + 4) - uVar9 & 0xfffffffffffffffc) + uVar9;
        param_1[6] = lVar13;
        pvVar6 = CRYPTO_realloc((void *)param_1[0xb],(int)lVar13 * 0x10,"crypto/modes/ocb128.c",0x71
                               );
        if (pvVar6 == (void *)0x0) {
          return 0;
        }
        param_1[0xb] = pvVar6;
      }
      lVar12 = uVar11 - uVar10;
      lVar13 = uVar10 << 4;
      do {
        pcVar2 = (char *)(param_1[0xb] + lVar13);
        cVar4 = *pcVar2;
        FUN_00aab930(pcVar2,1,pcVar2 + 0x10);
        lVar12 = lVar12 + -1;
        lVar13 = lVar13 + 0x10;
        pcVar2[0x1f] = pcVar2[0x1f] ^ (byte)((ulong)(long)cVar4 >> 7) & 0x87;
      } while (lVar12 != 0);
      param_1[5] = uVar11;
    }
    puVar3 = (ulong *)(param_1[0xb] + uVar11 * 0x10);
    if (puVar3 == (ulong *)0x0) break;
    local_70 = *puVar3 ^ param_1[0xe];
    param_1[0xe] = local_70;
    uStack_68 = *(ulong *)(param_1[0xb] + uVar11 * 0x10 + 8) ^ param_1[0xf];
    param_1[0xf] = uStack_68;
    local_70 = *param_2 ^ local_70;
    uStack_68 = param_2[1] ^ uStack_68;
    (*(code *)*param_1)(&local_70,&local_70,param_1[2]);
    uVar24 = param_1[0x11];
    uVar15 = param_1[0x10];
    param_1[0x11] =
         CONCAT17((byte)((ulong)uVar24 >> 0x38) ^ (byte)(uStack_68 >> 0x38),
                  CONCAT16((byte)((ulong)uVar24 >> 0x30) ^ (byte)(uStack_68 >> 0x30),
                           CONCAT15((byte)((ulong)uVar24 >> 0x28) ^ (byte)(uStack_68 >> 0x28),
                                    CONCAT14((byte)((ulong)uVar24 >> 0x20) ^
                                             (byte)(uStack_68 >> 0x20),
                                             CONCAT13((byte)((ulong)uVar24 >> 0x18) ^
                                                      (byte)(uStack_68 >> 0x18),
                                                      CONCAT12((byte)((ulong)uVar24 >> 0x10) ^
                                                               (byte)(uStack_68 >> 0x10),
                                                               CONCAT11((byte)((ulong)uVar24 >> 8) ^
                                                                        (byte)(uStack_68 >> 8),
                                                                        (byte)uVar24 ^
                                                                        (byte)uStack_68)))))));
    param_1[0x10] =
         CONCAT17((byte)((ulong)uVar15 >> 0x38) ^ (byte)(local_70 >> 0x38),
                  CONCAT16((byte)((ulong)uVar15 >> 0x30) ^ (byte)(local_70 >> 0x30),
                           CONCAT15((byte)((ulong)uVar15 >> 0x28) ^ (byte)(local_70 >> 0x28),
                                    CONCAT14((byte)((ulong)uVar15 >> 0x20) ^
                                             (byte)(local_70 >> 0x20),
                                             CONCAT13((byte)((ulong)uVar15 >> 0x18) ^
                                                      (byte)(local_70 >> 0x18),
                                                      CONCAT12((byte)((ulong)uVar15 >> 0x10) ^
                                                               (byte)(local_70 >> 0x10),
                                                               CONCAT11((byte)((ulong)uVar15 >> 8) ^
                                                                        (byte)(local_70 >> 8),
                                                                        (byte)uVar15 ^
                                                                        (byte)local_70)))))));
    param_2 = param_2 + 2;
  }
  return 0;
}

