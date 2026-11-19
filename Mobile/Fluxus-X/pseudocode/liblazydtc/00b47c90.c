/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b47c90
 */

undefined8 FUN_00b47c90(undefined8 *param_1,long param_2,undefined4 param_3,undefined8 param_4)

{
  byte *pbVar1;
  uint *puVar2;
  uint *puVar3;
  uint uVar4;
  byte bVar5;
  ulong uVar6;
  ushort uVar7;
  uint3 uVar8;
  int iVar9;
  void *pvVar10;
  undefined8 uVar11;
  undefined8 uVar12;
  ulong uVar13;
  uint *puVar14;
  ulong uVar15;
  byte *pbVar16;
  uint *puVar17;
  uint *puVar18;
  uint *puVar19;
  long lVar20;
  ulong uVar21;
  undefined8 uVar22;
  ulong uVar23;
  long lVar24;
  long lVar25;
  long lVar26;
  ulong uVar27;
  long lVar28;
  byte *pbVar29;
  long lVar30;
  ulong uVar31;
  ulong uVar32;
  ulong uVar33;
  undefined8 uVar34;
  undefined8 uVar35;
  undefined8 uVar36;
  undefined8 uVar37;
  undefined8 uVar38;
  undefined8 uVar39;
  undefined8 uVar40;
  undefined8 uVar41;
  
  iVar9 = ossl_prov_is_running();
  if (iVar9 == 0) {
    return 0;
  }
  iVar9 = FUN_00b4828c(param_1,param_4);
  if (iVar9 == 0) {
    return 0;
  }
  lVar26 = param_1[2];
  if (lVar26 == 0) {
    ERR_new();
    ERR_set_debug("providers/implementations/kdfs/scrypt.c",0xa1,"kdf_scrypt_derive");
    uVar11 = 0x39;
    uVar12 = 0x82;
  }
  else {
    lVar28 = param_1[4];
    if (lVar28 == 0) {
      ERR_new();
      ERR_set_debug("providers/implementations/kdfs/scrypt.c",0xa6,"kdf_scrypt_derive");
      uVar11 = 0x39;
      uVar12 = 0x83;
      goto LAB_00b47ebc;
    }
    lVar25 = param_1[10];
    if (lVar25 == 0) {
      iVar9 = FUN_00b484c8(param_1);
      if (iVar9 == 0) {
        return 0;
      }
      lVar26 = param_1[2];
      lVar28 = param_1[4];
      lVar25 = param_1[10];
    }
    uVar32 = param_1[6];
    if (uVar32 < 2) {
      return 0;
    }
    uVar27 = param_1[7];
    if (uVar27 == 0) {
      return 0;
    }
    uVar21 = param_1[8];
    if (uVar21 == 0) {
      return 0;
    }
    if ((uVar32 - 1 & uVar32) != 0) {
      return 0;
    }
    uVar33 = 0;
    if (uVar27 != 0) {
      uVar33 = 0x3fffffff / uVar27;
    }
    if (uVar33 < uVar21) {
      ERR_new();
      uVar11 = 0x1ab;
    }
    else {
      uVar22 = param_1[3];
      uVar33 = param_1[5];
      uVar11 = *param_1;
      uVar12 = param_1[1];
      if ((uVar27 * 0x10 < 0x40) && ((ulong)(1L << (uVar27 * 0x10 & 0x3f)) <= uVar32)) {
        ERR_new();
        uVar11 = 0x1b6;
      }
      else {
        lVar30 = uVar21 * 0x80;
        uVar23 = lVar30 * uVar27;
        if (uVar23 >> 0x1f == 0) {
          uVar15 = 0;
          if (uVar27 != 0) {
            uVar15 = 0x1ffffffffffffff / uVar27;
          }
          if (uVar15 < uVar32 + 2) {
            ERR_new();
            uVar11 = 0x1d2;
          }
          else {
            lVar24 = uVar27 * 0x20;
            uVar15 = (uVar32 + 2) * lVar24 * 4;
            if (~uVar15 < uVar23) {
              ERR_new();
              uVar11 = 0x1d9;
            }
            else {
              uVar15 = uVar23 + uVar15;
              if (uVar15 <= (ulong)param_1[9]) {
                if (param_2 == 0) {
                  return 1;
                }
                pvVar10 = CRYPTO_malloc((int)uVar15,"providers/implementations/kdfs/scrypt.c",0x1ea)
                ;
                if (pvVar10 == (void *)0x0) {
                  ERR_new();
                  ERR_set_debug("providers/implementations/kdfs/scrypt.c",0x1ec,"scrypt_alg");
                  uVar11 = 6;
                  uVar12 = 0xc0100;
                  goto LAB_00b47ebc;
                }
                iVar9 = ossl_pkcs5_pbkdf2_hmac_ex
                                  (lVar26,uVar22,lVar28,uVar33 & 0xffffffff,1,lVar25,
                                   uVar23 & 0xffffffff,pvVar10,uVar11,uVar12);
                if (iVar9 != 0) {
                  puVar2 = (uint *)((long)pvVar10 + uVar23);
                  puVar3 = puVar2 + uVar27 * 0x20 + uVar27 * 0x20;
                  puVar18 = (uint *)((long)pvVar10 + uVar27 * (lVar30 + 0x80));
                  uVar33 = 0;
                  do {
                    pbVar29 = (byte *)((long)pvVar10 + uVar27 * 0x80 * uVar33);
                    puVar14 = puVar3;
                    if (lVar24 != 0) {
                      lVar28 = lVar24;
                      pbVar16 = pbVar29;
                      do {
                        bVar5 = *pbVar16;
                        lVar28 = lVar28 + -1;
                        *puVar14 = (uint)bVar5;
                        uVar7 = CONCAT11(pbVar16[1],bVar5);
                        *puVar14 = (uint)uVar7;
                        uVar8 = CONCAT12(pbVar16[2],uVar7);
                        *puVar14 = (uint)uVar8;
                        pbVar1 = pbVar16 + 3;
                        pbVar16 = pbVar16 + 4;
                        *puVar14 = CONCAT13(*pbVar1,uVar8);
                        puVar14 = puVar14 + 1;
                      } while (lVar28 != 0);
                      puVar14 = puVar3 + uVar27 * 0x20;
                    }
                    uVar31 = 1;
                    do {
                      FUN_00b48550(puVar14,puVar14 + uVar27 * -0x20,uVar27);
                      uVar31 = uVar31 + 1;
                      puVar14 = puVar14 + uVar27 * 0x20;
                    } while (uVar32 != uVar31);
                    FUN_00b48550(puVar2,puVar3 + (uVar32 * 0x20 + -0x20) * uVar27,uVar27);
                    uVar31 = 0;
                    do {
                      if (lVar24 != 0) {
                        uVar13 = (ulong)puVar2[lVar24 + -0x10];
                        uVar6 = 0;
                        if (uVar32 != 0) {
                          uVar6 = uVar13 / uVar32;
                        }
                        lVar28 = uVar32 * 0x80 * uVar6;
                        if ((puVar18 < (uint *)((long)pvVar10 +
                                               uVar27 * ((lVar30 + 0x180 + uVar13 * 0x80) - lVar28))
                            ) && (puVar14 = puVar3 + (uVar13 - uVar6 * uVar32) * lVar24,
                                 puVar17 = puVar2, puVar19 = puVar18, lVar20 = lVar24,
                                 (void *)((long)pvVar10 +
                                         uVar27 * ((lVar30 + 0x100 + uVar13 * 0x80) - lVar28)) <
                                 (void *)((long)pvVar10 + uVar27 * (lVar30 + 0x100)))) {
                          do {
                            lVar20 = lVar20 + -1;
                            *puVar19 = *puVar14 ^ *puVar17;
                            puVar14 = puVar14 + 1;
                            puVar17 = puVar17 + 1;
                            puVar19 = puVar19 + 1;
                          } while (lVar20 != 0);
                        }
                        else {
                          lVar28 = 0;
                          lVar20 = lVar24;
                          puVar17 = puVar18 + 4;
                          puVar14 = puVar2 + 4;
                          do {
                            puVar19 = puVar3 + (uVar13 - uVar6 * uVar32) * lVar24 + lVar28;
                            uVar35 = *(undefined8 *)(puVar14 + -2);
                            uVar34 = *(undefined8 *)(puVar14 + -4);
                            uVar37 = *(undefined8 *)(puVar14 + 2);
                            uVar36 = *(undefined8 *)puVar14;
                            uVar39 = *(undefined8 *)(puVar19 + 2);
                            uVar38 = *(undefined8 *)puVar19;
                            uVar41 = *(undefined8 *)(puVar19 + 6);
                            uVar40 = *(undefined8 *)(puVar19 + 4);
                            lVar28 = lVar28 + 8;
                            puVar14 = puVar14 + 8;
                            lVar20 = lVar20 + -8;
                            *(ulong *)(puVar17 + -2) =
                                 CONCAT17((byte)((ulong)uVar39 >> 0x38) ^
                                          (byte)((ulong)uVar35 >> 0x38),
                                          CONCAT16((byte)((ulong)uVar39 >> 0x30) ^
                                                   (byte)((ulong)uVar35 >> 0x30),
                                                   CONCAT15((byte)((ulong)uVar39 >> 0x28) ^
                                                            (byte)((ulong)uVar35 >> 0x28),
                                                            CONCAT14((byte)((ulong)uVar39 >> 0x20) ^
                                                                     (byte)((ulong)uVar35 >> 0x20),
                                                                     CONCAT13((byte)((ulong)uVar39
                                                                                    >> 0x18) ^
                                                                              (byte)((ulong)uVar35
                                                                                    >> 0x18),
                                                                              CONCAT12((byte)((ulong
                                                  )uVar39 >> 0x10) ^ (byte)((ulong)uVar35 >> 0x10),
                                                  CONCAT11((byte)((ulong)uVar39 >> 8) ^
                                                           (byte)((ulong)uVar35 >> 8),
                                                           (byte)uVar39 ^ (byte)uVar35)))))));
                            *(ulong *)(puVar17 + -4) =
                                 CONCAT17((byte)((ulong)uVar38 >> 0x38) ^
                                          (byte)((ulong)uVar34 >> 0x38),
                                          CONCAT16((byte)((ulong)uVar38 >> 0x30) ^
                                                   (byte)((ulong)uVar34 >> 0x30),
                                                   CONCAT15((byte)((ulong)uVar38 >> 0x28) ^
                                                            (byte)((ulong)uVar34 >> 0x28),
                                                            CONCAT14((byte)((ulong)uVar38 >> 0x20) ^
                                                                     (byte)((ulong)uVar34 >> 0x20),
                                                                     CONCAT13((byte)((ulong)uVar38
                                                                                    >> 0x18) ^
                                                                              (byte)((ulong)uVar34
                                                                                    >> 0x18),
                                                                              CONCAT12((byte)((ulong
                                                  )uVar38 >> 0x10) ^ (byte)((ulong)uVar34 >> 0x10),
                                                  CONCAT11((byte)((ulong)uVar38 >> 8) ^
                                                           (byte)((ulong)uVar34 >> 8),
                                                           (byte)uVar38 ^ (byte)uVar34)))))));
                            *(ulong *)(puVar17 + 2) =
                                 CONCAT17((byte)((ulong)uVar41 >> 0x38) ^
                                          (byte)((ulong)uVar37 >> 0x38),
                                          CONCAT16((byte)((ulong)uVar41 >> 0x30) ^
                                                   (byte)((ulong)uVar37 >> 0x30),
                                                   CONCAT15((byte)((ulong)uVar41 >> 0x28) ^
                                                            (byte)((ulong)uVar37 >> 0x28),
                                                            CONCAT14((byte)((ulong)uVar41 >> 0x20) ^
                                                                     (byte)((ulong)uVar37 >> 0x20),
                                                                     CONCAT13((byte)((ulong)uVar41
                                                                                    >> 0x18) ^
                                                                              (byte)((ulong)uVar37
                                                                                    >> 0x18),
                                                                              CONCAT12((byte)((ulong
                                                  )uVar41 >> 0x10) ^ (byte)((ulong)uVar37 >> 0x10),
                                                  CONCAT11((byte)((ulong)uVar41 >> 8) ^
                                                           (byte)((ulong)uVar37 >> 8),
                                                           (byte)uVar41 ^ (byte)uVar37)))))));
                            *(ulong *)puVar17 =
                                 CONCAT17((byte)((ulong)uVar40 >> 0x38) ^
                                          (byte)((ulong)uVar36 >> 0x38),
                                          CONCAT16((byte)((ulong)uVar40 >> 0x30) ^
                                                   (byte)((ulong)uVar36 >> 0x30),
                                                   CONCAT15((byte)((ulong)uVar40 >> 0x28) ^
                                                            (byte)((ulong)uVar36 >> 0x28),
                                                            CONCAT14((byte)((ulong)uVar40 >> 0x20) ^
                                                                     (byte)((ulong)uVar36 >> 0x20),
                                                                     CONCAT13((byte)((ulong)uVar40
                                                                                    >> 0x18) ^
                                                                              (byte)((ulong)uVar36
                                                                                    >> 0x18),
                                                                              CONCAT12((byte)((ulong
                                                  )uVar40 >> 0x10) ^ (byte)((ulong)uVar36 >> 0x10),
                                                  CONCAT11((byte)((ulong)uVar40 >> 8) ^
                                                           (byte)((ulong)uVar36 >> 8),
                                                           (byte)uVar40 ^ (byte)uVar36)))))));
                            puVar17 = puVar17 + 8;
                          } while (lVar20 != 0);
                        }
                      }
                      FUN_00b48550(puVar2,puVar2 + uVar27 * 0x20,uVar27);
                      uVar31 = uVar31 + 1;
                      lVar28 = lVar24;
                      puVar14 = puVar2;
                    } while (uVar31 != uVar32);
                    for (; lVar28 != 0; lVar28 = lVar28 + -1) {
                      uVar4 = *puVar14;
                      *pbVar29 = (byte)uVar4;
                      pbVar29[1] = (byte)(uVar4 >> 8);
                      pbVar29[2] = (byte)(uVar4 >> 0x10);
                      pbVar29[3] = (byte)(uVar4 >> 0x18);
                      pbVar29 = pbVar29 + 4;
                      puVar14 = puVar14 + 1;
                    }
                    uVar33 = uVar33 + 1;
                  } while (uVar33 != uVar21);
                  uVar34 = 1;
                  iVar9 = ossl_pkcs5_pbkdf2_hmac_ex
                                    (lVar26,uVar22,pvVar10,uVar23,1,lVar25,param_3,param_2,uVar11,
                                     uVar12);
                  if (iVar9 != 0) goto LAB_00b48230;
                }
                ERR_new();
                ERR_set_debug("providers/implementations/kdfs/scrypt.c",0x1ff,"scrypt_alg");
                ERR_set_error(6,0xb5,0);
                uVar34 = 0;
LAB_00b48230:
                CRYPTO_clear_free(pvVar10,uVar15,"providers/implementations/kdfs/scrypt.c",0x201);
                return uVar34;
              }
              ERR_new();
              uVar11 = 0x1e2;
            }
          }
        }
        else {
          ERR_new();
          uVar11 = 0x1c8;
        }
      }
    }
    ERR_set_debug("providers/implementations/kdfs/scrypt.c",uVar11,"scrypt_alg");
    uVar11 = 6;
    uVar12 = 0xac;
  }
LAB_00b47ebc:
  ERR_set_error(uVar11,uVar12,0);
  return 0;
}

