/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b9ea00
 */

/* WARNING: Type propagation algorithm not settling */

int mbedtls_cipher_cmac_finish(long *param_1,void *param_2)

{
  undefined8 *puVar1;
  undefined1 uVar2;
  long lVar3;
  int iVar4;
  ulong uVar5;
  ulong uVar6;
  byte *pbVar7;
  ulong uVar8;
  long lVar9;
  ulong uVar10;
  byte *pbVar11;
  byte *pbVar12;
  ulong uVar13;
  char cVar14;
  ulong uVar15;
  undefined8 *__src;
  uint uVar16;
  ulong __n;
  undefined8 uVar17;
  undefined8 uVar18;
  undefined8 uVar19;
  undefined8 uVar20;
  undefined8 uVar21;
  undefined8 uVar22;
  undefined8 uVar23;
  undefined8 uVar24;
  undefined1 auStack_98 [8];
  undefined8 local_90;
  undefined8 uStack_88;
  undefined8 local_80;
  undefined8 uStack_78;
  byte local_70 [8];
  long alStack_68 [3];
  
  lVar3 = tpidr_el0;
  alStack_68[2] = *(long *)(lVar3 + 0x28);
  if ((param_1 == (long *)0x0) || (*param_1 == 0)) {
    iVar4 = -0x6100;
    goto LAB_00b9ee3c;
  }
  iVar4 = -0x6100;
  if ((param_2 == (void *)0x0) || (__src = (undefined8 *)param_1[0xb], __src == (undefined8 *)0x0))
  goto LAB_00b9ee3c;
  uVar5 = (ulong)*(uint *)(*param_1 + 8);
  __n = uVar5 & 0x1f;
  mbedtls_platform_zeroize(local_70,0x10);
  mbedtls_platform_zeroize(&local_80,0x10);
  FUN_00b9ee70(param_1,local_70,&local_80);
  uVar6 = __src[4];
  uVar16 = (uint)__n;
  if (uVar6 < __n) {
    uVar8 = 0;
    if (uVar16 < 2) goto LAB_00b9eb84;
    uVar10 = 0;
    uVar8 = uVar5 & 0x1e;
    do {
      uVar5 = uVar10 + 1;
      uVar2 = (uVar5 == uVar6) == uVar5 < uVar6;
      cVar14 = (char)&local_90 + (char)uVar10;
      if ((uVar10 == uVar6) == uVar10 < uVar6) {
        *(undefined1 *)((long)&local_90 + uVar10) = 0;
      }
      if ((bool)uVar2) {
        auStack_98[uVar10 + 9] = 0;
      }
      if (uVar10 == uVar6) {
        *(undefined1 *)((long)&local_90 + uVar10) = 0x80;
      }
      if (uVar5 == uVar6) {
        auStack_98[uVar10 + 9] = 0x80;
      }
      if (uVar10 < uVar6) {
        cVar14 = *(char *)((long)__src + uVar10 + 0x10);
      }
      if (uVar5 < uVar6) {
        uVar2 = *(undefined1 *)((long)__src + uVar10 + 0x11);
      }
      if (uVar10 < uVar6) {
        *(char *)((long)&local_90 + uVar10) = cVar14;
      }
      if (uVar5 < uVar6) {
        auStack_98[uVar10 + 9] = uVar2;
      }
      uVar10 = uVar10 + 2;
    } while (uVar10 != uVar8);
    for (; uVar8 != __n; uVar8 = uVar8 + 1) {
LAB_00b9eb84:
      if (uVar8 < uVar6) {
        auStack_98[uVar8 + 8] = *(undefined1 *)((long)__src + uVar8 + 0x10);
      }
      else if (uVar6 == uVar8) {
        auStack_98[uVar8 + 8] = 0x80;
      }
      else {
        auStack_98[uVar8 + 8] = 0;
      }
    }
    uVar5 = 0;
    if (0xf < uVar16) {
      uVar5 = 0x10;
      uStack_88 = CONCAT17((byte)((ulong)uStack_78 >> 0x38) ^ (byte)((ulong)uStack_88 >> 0x38),
                           CONCAT16((byte)((ulong)uStack_78 >> 0x30) ^
                                    (byte)((ulong)uStack_88 >> 0x30),
                                    CONCAT15((byte)((ulong)uStack_78 >> 0x28) ^
                                             (byte)((ulong)uStack_88 >> 0x28),
                                             CONCAT14((byte)((ulong)uStack_78 >> 0x20) ^
                                                      (byte)((ulong)uStack_88 >> 0x20),
                                                      CONCAT13((byte)((ulong)uStack_78 >> 0x18) ^
                                                               (byte)((ulong)uStack_88 >> 0x18),
                                                               CONCAT12((byte)((ulong)uStack_78 >>
                                                                              0x10) ^
                                                                        (byte)((ulong)uStack_88 >>
                                                                              0x10),
                                                                        CONCAT11((byte)((ulong)
                                                  uStack_78 >> 8) ^ (byte)((ulong)uStack_88 >> 8),
                                                  (byte)uStack_78 ^ (byte)uStack_88)))))));
      local_90 = CONCAT17((byte)((ulong)local_80 >> 0x38) ^ (byte)((ulong)local_90 >> 0x38),
                          CONCAT16((byte)((ulong)local_80 >> 0x30) ^ (byte)((ulong)local_90 >> 0x30)
                                   ,CONCAT15((byte)((ulong)local_80 >> 0x28) ^
                                             (byte)((ulong)local_90 >> 0x28),
                                             CONCAT14((byte)((ulong)local_80 >> 0x20) ^
                                                      (byte)((ulong)local_90 >> 0x20),
                                                      CONCAT13((byte)((ulong)local_80 >> 0x18) ^
                                                               (byte)((ulong)local_90 >> 0x18),
                                                               CONCAT12((byte)((ulong)local_80 >>
                                                                              0x10) ^
                                                                        (byte)((ulong)local_90 >>
                                                                              0x10),
                                                                        CONCAT11((byte)((ulong)
                                                  local_80 >> 8) ^ (byte)((ulong)local_90 >> 8),
                                                  (byte)local_80 ^ (byte)local_90)))))));
    }
    if (uVar5 < __n) {
      uVar6 = __n - uVar5;
      if (uVar6 < 0x20) {
        uVar10 = uVar5;
      }
      else {
        uVar13 = uVar6 & 0xffffffffffffffe0;
        uVar8 = 0;
        uVar10 = uVar5 | uVar13;
        do {
          uVar15 = uVar5 | uVar8;
          uVar18 = *(undefined8 *)(local_70 + (uVar15 - 0x18));
          uVar17 = *(undefined8 *)(auStack_98 + uVar15 + 8);
          uVar20 = *(undefined8 *)(local_70 + (uVar15 - 8));
          uVar19 = *(undefined8 *)((long)&local_80 + uVar15);
          uVar22 = *(undefined8 *)(local_70 + (uVar15 - 8));
          uVar21 = *(undefined8 *)((long)&local_80 + uVar15);
          uVar24 = *(undefined8 *)((long)alStack_68 + uVar15);
          uVar23 = *(undefined8 *)(local_70 + uVar15);
          uVar8 = uVar8 + 0x20;
          *(ulong *)(local_70 + (uVar15 - 0x18)) =
               CONCAT17((byte)((ulong)uVar22 >> 0x38) ^ (byte)((ulong)uVar18 >> 0x38),
                        CONCAT16((byte)((ulong)uVar22 >> 0x30) ^ (byte)((ulong)uVar18 >> 0x30),
                                 CONCAT15((byte)((ulong)uVar22 >> 0x28) ^
                                          (byte)((ulong)uVar18 >> 0x28),
                                          CONCAT14((byte)((ulong)uVar22 >> 0x20) ^
                                                   (byte)((ulong)uVar18 >> 0x20),
                                                   CONCAT13((byte)((ulong)uVar22 >> 0x18) ^
                                                            (byte)((ulong)uVar18 >> 0x18),
                                                            CONCAT12((byte)((ulong)uVar22 >> 0x10) ^
                                                                     (byte)((ulong)uVar18 >> 0x10),
                                                                     CONCAT11((byte)((ulong)uVar22
                                                                                    >> 8) ^
                                                                              (byte)((ulong)uVar18
                                                                                    >> 8),
                                                                              (byte)uVar22 ^
                                                                              (byte)uVar18)))))));
          *(ulong *)(auStack_98 + uVar15 + 8) =
               CONCAT17((byte)((ulong)uVar21 >> 0x38) ^ (byte)((ulong)uVar17 >> 0x38),
                        CONCAT16((byte)((ulong)uVar21 >> 0x30) ^ (byte)((ulong)uVar17 >> 0x30),
                                 CONCAT15((byte)((ulong)uVar21 >> 0x28) ^
                                          (byte)((ulong)uVar17 >> 0x28),
                                          CONCAT14((byte)((ulong)uVar21 >> 0x20) ^
                                                   (byte)((ulong)uVar17 >> 0x20),
                                                   CONCAT13((byte)((ulong)uVar21 >> 0x18) ^
                                                            (byte)((ulong)uVar17 >> 0x18),
                                                            CONCAT12((byte)((ulong)uVar21 >> 0x10) ^
                                                                     (byte)((ulong)uVar17 >> 0x10),
                                                                     CONCAT11((byte)((ulong)uVar21
                                                                                    >> 8) ^
                                                                              (byte)((ulong)uVar17
                                                                                    >> 8),
                                                                              (byte)uVar21 ^
                                                                              (byte)uVar17)))))));
          *(ulong *)(local_70 + (uVar15 - 8)) =
               CONCAT17((byte)((ulong)uVar24 >> 0x38) ^ (byte)((ulong)uVar20 >> 0x38),
                        CONCAT16((byte)((ulong)uVar24 >> 0x30) ^ (byte)((ulong)uVar20 >> 0x30),
                                 CONCAT15((byte)((ulong)uVar24 >> 0x28) ^
                                          (byte)((ulong)uVar20 >> 0x28),
                                          CONCAT14((byte)((ulong)uVar24 >> 0x20) ^
                                                   (byte)((ulong)uVar20 >> 0x20),
                                                   CONCAT13((byte)((ulong)uVar24 >> 0x18) ^
                                                            (byte)((ulong)uVar20 >> 0x18),
                                                            CONCAT12((byte)((ulong)uVar24 >> 0x10) ^
                                                                     (byte)((ulong)uVar20 >> 0x10),
                                                                     CONCAT11((byte)((ulong)uVar24
                                                                                    >> 8) ^
                                                                              (byte)((ulong)uVar20
                                                                                    >> 8),
                                                                              (byte)uVar24 ^
                                                                              (byte)uVar20)))))));
          *(ulong *)((long)&local_80 + uVar15) =
               CONCAT17((byte)((ulong)uVar23 >> 0x38) ^ (byte)((ulong)uVar19 >> 0x38),
                        CONCAT16((byte)((ulong)uVar23 >> 0x30) ^ (byte)((ulong)uVar19 >> 0x30),
                                 CONCAT15((byte)((ulong)uVar23 >> 0x28) ^
                                          (byte)((ulong)uVar19 >> 0x28),
                                          CONCAT14((byte)((ulong)uVar23 >> 0x20) ^
                                                   (byte)((ulong)uVar19 >> 0x20),
                                                   CONCAT13((byte)((ulong)uVar23 >> 0x18) ^
                                                            (byte)((ulong)uVar19 >> 0x18),
                                                            CONCAT12((byte)((ulong)uVar23 >> 0x10) ^
                                                                     (byte)((ulong)uVar19 >> 0x10),
                                                                     CONCAT11((byte)((ulong)uVar23
                                                                                    >> 8) ^
                                                                              (byte)((ulong)uVar19
                                                                                    >> 8),
                                                                              (byte)uVar23 ^
                                                                              (byte)uVar19)))))));
        } while (uVar13 != uVar8);
        if (uVar6 == uVar13) goto LAB_00b9ed30;
      }
      lVar9 = __n - uVar10;
      pbVar7 = (byte *)((long)&local_80 + uVar10);
      pbVar11 = auStack_98 + uVar10 + 8;
      do {
        lVar9 = lVar9 + -1;
        *pbVar11 = *pbVar7 ^ *pbVar11;
        pbVar7 = pbVar7 + 1;
        pbVar11 = pbVar11 + 1;
      } while (lVar9 != 0);
    }
  }
  else {
    uVar5 = 0;
    if (0xf < uVar16) {
      uVar18 = __src[3];
      uVar17 = __src[2];
      uVar5 = 0x10;
      uStack_88 = CONCAT17((byte)((ulong)alStack_68[0] >> 0x38) ^ (byte)((ulong)uVar18 >> 0x38),
                           CONCAT16((byte)((ulong)alStack_68[0] >> 0x30) ^
                                    (byte)((ulong)uVar18 >> 0x30),
                                    CONCAT15((byte)((ulong)alStack_68[0] >> 0x28) ^
                                             (byte)((ulong)uVar18 >> 0x28),
                                             CONCAT14((byte)((ulong)alStack_68[0] >> 0x20) ^
                                                      (byte)((ulong)uVar18 >> 0x20),
                                                      CONCAT13((byte)((ulong)alStack_68[0] >> 0x18)
                                                               ^ (byte)((ulong)uVar18 >> 0x18),
                                                               CONCAT12((byte)((ulong)alStack_68[0]
                                                                              >> 0x10) ^
                                                                        (byte)((ulong)uVar18 >> 0x10
                                                                              ),CONCAT11((byte)((
                                                  ulong)alStack_68[0] >> 8) ^
                                                  (byte)((ulong)uVar18 >> 8),
                                                  (byte)alStack_68[0] ^ (byte)uVar18)))))));
      local_90 = CONCAT17(local_70[7] ^ (byte)((ulong)uVar17 >> 0x38),
                          CONCAT16(local_70[6] ^ (byte)((ulong)uVar17 >> 0x30),
                                   CONCAT15(local_70[5] ^ (byte)((ulong)uVar17 >> 0x28),
                                            CONCAT14(local_70[4] ^ (byte)((ulong)uVar17 >> 0x20),
                                                     CONCAT13(local_70[3] ^
                                                              (byte)((ulong)uVar17 >> 0x18),
                                                              CONCAT12(local_70[2] ^
                                                                       (byte)((ulong)uVar17 >> 0x10)
                                                                       ,CONCAT11(local_70[1] ^
                                                                                 (byte)((ulong)
                                                  uVar17 >> 8),local_70[0] ^ (byte)uVar17)))))));
    }
    if (uVar5 < __n) {
      uVar6 = __n - uVar5;
      if (uVar6 < 0x20) {
        uVar10 = uVar5;
      }
      else {
        uVar13 = uVar6 & 0xffffffffffffffe0;
        uVar8 = 0;
        uVar10 = uVar5 | uVar13;
        do {
          uVar15 = uVar5 | uVar8;
          uVar18 = *(undefined8 *)((long)__src + uVar15 + 0x18);
          uVar17 = *(undefined8 *)((long)__src + uVar15 + 0x10);
          uVar20 = *(undefined8 *)((long)__src + uVar15 + 0x28);
          uVar19 = *(undefined8 *)((long)__src + uVar15 + 0x20);
          uVar22 = *(undefined8 *)((long)alStack_68 + uVar15);
          uVar21 = *(undefined8 *)(local_70 + uVar15);
          uVar24 = *(undefined8 *)((long)alStack_68 + uVar15 + 0x10);
          uVar23 = *(undefined8 *)((long)alStack_68 + uVar15 + 8);
          uVar8 = uVar8 + 0x20;
          *(ulong *)(local_70 + (uVar15 - 0x18)) =
               CONCAT17((byte)((ulong)uVar22 >> 0x38) ^ (byte)((ulong)uVar18 >> 0x38),
                        CONCAT16((byte)((ulong)uVar22 >> 0x30) ^ (byte)((ulong)uVar18 >> 0x30),
                                 CONCAT15((byte)((ulong)uVar22 >> 0x28) ^
                                          (byte)((ulong)uVar18 >> 0x28),
                                          CONCAT14((byte)((ulong)uVar22 >> 0x20) ^
                                                   (byte)((ulong)uVar18 >> 0x20),
                                                   CONCAT13((byte)((ulong)uVar22 >> 0x18) ^
                                                            (byte)((ulong)uVar18 >> 0x18),
                                                            CONCAT12((byte)((ulong)uVar22 >> 0x10) ^
                                                                     (byte)((ulong)uVar18 >> 0x10),
                                                                     CONCAT11((byte)((ulong)uVar22
                                                                                    >> 8) ^
                                                                              (byte)((ulong)uVar18
                                                                                    >> 8),
                                                                              (byte)uVar22 ^
                                                                              (byte)uVar18)))))));
          *(ulong *)(auStack_98 + uVar15 + 8) =
               CONCAT17((byte)((ulong)uVar21 >> 0x38) ^ (byte)((ulong)uVar17 >> 0x38),
                        CONCAT16((byte)((ulong)uVar21 >> 0x30) ^ (byte)((ulong)uVar17 >> 0x30),
                                 CONCAT15((byte)((ulong)uVar21 >> 0x28) ^
                                          (byte)((ulong)uVar17 >> 0x28),
                                          CONCAT14((byte)((ulong)uVar21 >> 0x20) ^
                                                   (byte)((ulong)uVar17 >> 0x20),
                                                   CONCAT13((byte)((ulong)uVar21 >> 0x18) ^
                                                            (byte)((ulong)uVar17 >> 0x18),
                                                            CONCAT12((byte)((ulong)uVar21 >> 0x10) ^
                                                                     (byte)((ulong)uVar17 >> 0x10),
                                                                     CONCAT11((byte)((ulong)uVar21
                                                                                    >> 8) ^
                                                                              (byte)((ulong)uVar17
                                                                                    >> 8),
                                                                              (byte)uVar21 ^
                                                                              (byte)uVar17)))))));
          *(ulong *)(local_70 + (uVar15 - 8)) =
               CONCAT17((byte)((ulong)uVar24 >> 0x38) ^ (byte)((ulong)uVar20 >> 0x38),
                        CONCAT16((byte)((ulong)uVar24 >> 0x30) ^ (byte)((ulong)uVar20 >> 0x30),
                                 CONCAT15((byte)((ulong)uVar24 >> 0x28) ^
                                          (byte)((ulong)uVar20 >> 0x28),
                                          CONCAT14((byte)((ulong)uVar24 >> 0x20) ^
                                                   (byte)((ulong)uVar20 >> 0x20),
                                                   CONCAT13((byte)((ulong)uVar24 >> 0x18) ^
                                                            (byte)((ulong)uVar20 >> 0x18),
                                                            CONCAT12((byte)((ulong)uVar24 >> 0x10) ^
                                                                     (byte)((ulong)uVar20 >> 0x10),
                                                                     CONCAT11((byte)((ulong)uVar24
                                                                                    >> 8) ^
                                                                              (byte)((ulong)uVar20
                                                                                    >> 8),
                                                                              (byte)uVar24 ^
                                                                              (byte)uVar20)))))));
          *(ulong *)((long)&local_80 + uVar15) =
               CONCAT17((byte)((ulong)uVar23 >> 0x38) ^ (byte)((ulong)uVar19 >> 0x38),
                        CONCAT16((byte)((ulong)uVar23 >> 0x30) ^ (byte)((ulong)uVar19 >> 0x30),
                                 CONCAT15((byte)((ulong)uVar23 >> 0x28) ^
                                          (byte)((ulong)uVar19 >> 0x28),
                                          CONCAT14((byte)((ulong)uVar23 >> 0x20) ^
                                                   (byte)((ulong)uVar19 >> 0x20),
                                                   CONCAT13((byte)((ulong)uVar23 >> 0x18) ^
                                                            (byte)((ulong)uVar19 >> 0x18),
                                                            CONCAT12((byte)((ulong)uVar23 >> 0x10) ^
                                                                     (byte)((ulong)uVar19 >> 0x10),
                                                                     CONCAT11((byte)((ulong)uVar23
                                                                                    >> 8) ^
                                                                              (byte)((ulong)uVar19
                                                                                    >> 8),
                                                                              (byte)uVar23 ^
                                                                              (byte)uVar19)))))));
        } while (uVar13 != uVar8);
        if (uVar6 == uVar13) goto LAB_00b9ed30;
      }
      lVar9 = __n - uVar10;
      pbVar7 = auStack_98 + uVar10 + 8;
      pbVar11 = local_70 + uVar10;
      pbVar12 = (byte *)((long)__src + uVar10 + 0x10);
      do {
        lVar9 = lVar9 + -1;
        *pbVar7 = *pbVar11 ^ *pbVar12;
        pbVar7 = pbVar7 + 1;
        pbVar11 = pbVar11 + 1;
        pbVar12 = pbVar12 + 1;
      } while (lVar9 != 0);
    }
  }
LAB_00b9ed30:
  uVar5 = 0;
  if (0xf < uVar16) {
    uVar18 = __src[1];
    uVar17 = *__src;
    uVar5 = 0x10;
    __src[1] = CONCAT17((byte)((ulong)uVar18 >> 0x38) ^ (byte)((ulong)uStack_88 >> 0x38),
                        CONCAT16((byte)((ulong)uVar18 >> 0x30) ^ (byte)((ulong)uStack_88 >> 0x30),
                                 CONCAT15((byte)((ulong)uVar18 >> 0x28) ^
                                          (byte)((ulong)uStack_88 >> 0x28),
                                          CONCAT14((byte)((ulong)uVar18 >> 0x20) ^
                                                   (byte)((ulong)uStack_88 >> 0x20),
                                                   CONCAT13((byte)((ulong)uVar18 >> 0x18) ^
                                                            (byte)((ulong)uStack_88 >> 0x18),
                                                            CONCAT12((byte)((ulong)uVar18 >> 0x10) ^
                                                                     (byte)((ulong)uStack_88 >> 0x10
                                                                           ),CONCAT11((byte)((ulong)
                                                  uVar18 >> 8) ^ (byte)((ulong)uStack_88 >> 8),
                                                  (byte)uVar18 ^ (byte)uStack_88)))))));
    *__src = CONCAT17((byte)((ulong)uVar17 >> 0x38) ^ (byte)((ulong)local_90 >> 0x38),
                      CONCAT16((byte)((ulong)uVar17 >> 0x30) ^ (byte)((ulong)local_90 >> 0x30),
                               CONCAT15((byte)((ulong)uVar17 >> 0x28) ^
                                        (byte)((ulong)local_90 >> 0x28),
                                        CONCAT14((byte)((ulong)uVar17 >> 0x20) ^
                                                 (byte)((ulong)local_90 >> 0x20),
                                                 CONCAT13((byte)((ulong)uVar17 >> 0x18) ^
                                                          (byte)((ulong)local_90 >> 0x18),
                                                          CONCAT12((byte)((ulong)uVar17 >> 0x10) ^
                                                                   (byte)((ulong)local_90 >> 0x10),
                                                                   CONCAT11((byte)((ulong)uVar17 >>
                                                                                  8) ^
                                                                            (byte)((ulong)local_90
                                                                                  >> 8),
                                                                            (byte)uVar17 ^
                                                                            (byte)local_90)))))));
  }
  if (uVar5 < __n) {
    uVar6 = __n - uVar5;
    if (uVar6 < 0x20) {
      uVar10 = uVar5;
    }
    else {
      uVar13 = uVar6 & 0xffffffffffffffe0;
      uVar8 = 0;
      uVar10 = uVar5 | uVar13;
      do {
        uVar15 = uVar5 | uVar8;
        puVar1 = (undefined8 *)((long)__src + uVar15);
        uVar18 = *(undefined8 *)(local_70 + (uVar15 - 0x18));
        uVar17 = *(undefined8 *)(auStack_98 + uVar15 + 8);
        uVar20 = *(undefined8 *)(local_70 + (uVar15 - 8));
        uVar19 = *(undefined8 *)((long)&local_80 + uVar15);
        uVar22 = puVar1[1];
        uVar21 = *puVar1;
        uVar24 = puVar1[3];
        uVar23 = puVar1[2];
        uVar8 = uVar8 + 0x20;
        puVar1[1] = CONCAT17((byte)((ulong)uVar22 >> 0x38) ^ (byte)((ulong)uVar18 >> 0x38),
                             CONCAT16((byte)((ulong)uVar22 >> 0x30) ^ (byte)((ulong)uVar18 >> 0x30),
                                      CONCAT15((byte)((ulong)uVar22 >> 0x28) ^
                                               (byte)((ulong)uVar18 >> 0x28),
                                               CONCAT14((byte)((ulong)uVar22 >> 0x20) ^
                                                        (byte)((ulong)uVar18 >> 0x20),
                                                        CONCAT13((byte)((ulong)uVar22 >> 0x18) ^
                                                                 (byte)((ulong)uVar18 >> 0x18),
                                                                 CONCAT12((byte)((ulong)uVar22 >>
                                                                                0x10) ^
                                                                          (byte)((ulong)uVar18 >>
                                                                                0x10),
                                                                          CONCAT11((byte)((ulong)
                                                  uVar22 >> 8) ^ (byte)((ulong)uVar18 >> 8),
                                                  (byte)uVar22 ^ (byte)uVar18)))))));
        *puVar1 = CONCAT17((byte)((ulong)uVar21 >> 0x38) ^ (byte)((ulong)uVar17 >> 0x38),
                           CONCAT16((byte)((ulong)uVar21 >> 0x30) ^ (byte)((ulong)uVar17 >> 0x30),
                                    CONCAT15((byte)((ulong)uVar21 >> 0x28) ^
                                             (byte)((ulong)uVar17 >> 0x28),
                                             CONCAT14((byte)((ulong)uVar21 >> 0x20) ^
                                                      (byte)((ulong)uVar17 >> 0x20),
                                                      CONCAT13((byte)((ulong)uVar21 >> 0x18) ^
                                                               (byte)((ulong)uVar17 >> 0x18),
                                                               CONCAT12((byte)((ulong)uVar21 >> 0x10
                                                                              ) ^ (byte)((ulong)
                                                  uVar17 >> 0x10),
                                                  CONCAT11((byte)((ulong)uVar21 >> 8) ^
                                                           (byte)((ulong)uVar17 >> 8),
                                                           (byte)uVar21 ^ (byte)uVar17)))))));
        puVar1[3] = CONCAT17((byte)((ulong)uVar24 >> 0x38) ^ (byte)((ulong)uVar20 >> 0x38),
                             CONCAT16((byte)((ulong)uVar24 >> 0x30) ^ (byte)((ulong)uVar20 >> 0x30),
                                      CONCAT15((byte)((ulong)uVar24 >> 0x28) ^
                                               (byte)((ulong)uVar20 >> 0x28),
                                               CONCAT14((byte)((ulong)uVar24 >> 0x20) ^
                                                        (byte)((ulong)uVar20 >> 0x20),
                                                        CONCAT13((byte)((ulong)uVar24 >> 0x18) ^
                                                                 (byte)((ulong)uVar20 >> 0x18),
                                                                 CONCAT12((byte)((ulong)uVar24 >>
                                                                                0x10) ^
                                                                          (byte)((ulong)uVar20 >>
                                                                                0x10),
                                                                          CONCAT11((byte)((ulong)
                                                  uVar24 >> 8) ^ (byte)((ulong)uVar20 >> 8),
                                                  (byte)uVar24 ^ (byte)uVar20)))))));
        puVar1[2] = CONCAT17((byte)((ulong)uVar23 >> 0x38) ^ (byte)((ulong)uVar19 >> 0x38),
                             CONCAT16((byte)((ulong)uVar23 >> 0x30) ^ (byte)((ulong)uVar19 >> 0x30),
                                      CONCAT15((byte)((ulong)uVar23 >> 0x28) ^
                                               (byte)((ulong)uVar19 >> 0x28),
                                               CONCAT14((byte)((ulong)uVar23 >> 0x20) ^
                                                        (byte)((ulong)uVar19 >> 0x20),
                                                        CONCAT13((byte)((ulong)uVar23 >> 0x18) ^
                                                                 (byte)((ulong)uVar19 >> 0x18),
                                                                 CONCAT12((byte)((ulong)uVar23 >>
                                                                                0x10) ^
                                                                          (byte)((ulong)uVar19 >>
                                                                                0x10),
                                                                          CONCAT11((byte)((ulong)
                                                  uVar23 >> 8) ^ (byte)((ulong)uVar19 >> 8),
                                                  (byte)uVar23 ^ (byte)uVar19)))))));
      } while (uVar13 != uVar8);
      if (uVar6 == uVar13) goto LAB_00b9edd8;
    }
    lVar9 = __n - uVar10;
    pbVar7 = (byte *)((long)__src + uVar10);
    pbVar11 = auStack_98 + uVar10 + 8;
    do {
      lVar9 = lVar9 + -1;
      *pbVar7 = *pbVar7 ^ *pbVar11;
      pbVar7 = pbVar7 + 1;
      pbVar11 = pbVar11 + 1;
    } while (lVar9 != 0);
  }
LAB_00b9edd8:
  iVar4 = mbedtls_cipher_update(param_1,__src,__n,__src,auStack_98);
  if (iVar4 == 0) {
    memcpy(param_2,__src,__n);
  }
  mbedtls_platform_zeroize(local_70,0x10);
  mbedtls_platform_zeroize(&local_80,0x10);
  __src[4] = 0;
  mbedtls_platform_zeroize(__src + 2,0x10);
  mbedtls_platform_zeroize(__src,0x10);
LAB_00b9ee3c:
  if (*(long *)(lVar3 + 0x28) != alStack_68[2]) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return iVar4;
}

