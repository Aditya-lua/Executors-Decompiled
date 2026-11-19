/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b63ad0
 */

undefined8
ssl3_cbc_digest_record
          (EVP_MD *param_1,uchar *param_2,ulong *param_3,undefined8 *param_4,void *param_5,
          long param_6,ulong param_7,void *param_8,ulong param_9,char param_10)

{
  uint uVar1;
  size_t __n;
  bool bVar2;
  uint uVar3;
  byte bVar4;
  byte bVar5;
  byte bVar6;
  byte bVar7;
  int iVar8;
  EVP_MD_CTX *ctx;
  uint uVar9;
  ulong *puVar10;
  byte *pbVar11;
  ulong uVar12;
  ulong uVar13;
  ulong uVar14;
  ulong uVar15;
  ulong uVar16;
  undefined8 *puVar17;
  byte *pbVar18;
  undefined8 *puVar19;
  long lVar20;
  size_t __n_00;
  ulong uVar21;
  ulong uVar22;
  ulong cnt;
  ulong uVar23;
  byte bVar24;
  size_t __n_01;
  undefined8 uVar25;
  ulong uVar26;
  ulong uVar27;
  size_t __n_02;
  long lVar28;
  undefined8 uVar29;
  undefined8 uVar30;
  undefined8 uVar31;
  undefined8 uVar32;
  undefined8 uVar33;
  undefined8 uVar34;
  undefined8 uVar35;
  code *local_348;
  code *local_338;
  undefined4 local_318;
  undefined8 auStack_308 [14];
  byte local_298 [16];
  undefined8 local_288;
  undefined8 uStack_280;
  undefined8 local_278;
  undefined8 uStack_270;
  undefined8 local_268;
  undefined8 uStack_260;
  undefined5 uStack_258;
  undefined3 local_253;
  undefined5 uStack_250;
  undefined1 auStack_24b [115];
  ulong local_1d8 [15];
  byte abStack_160 [24];
  SHA512_CTX SStack_148;
  uint local_6c;
  
  if (param_7 >> 0x14 != 0) {
    return 0;
  }
  iVar8 = EVP_MD_is_a(param_1,&DAT_002d53fd);
  if (iVar8 == 0) {
    iVar8 = EVP_MD_is_a(param_1,&DAT_002d142e);
    if (iVar8 == 0) {
      iVar8 = EVP_MD_is_a(param_1,"SHA2-224");
      if (iVar8 != 0) {
        iVar8 = SHA224_Init((SHA256_CTX *)&SStack_148);
        if (iVar8 < 1) {
          return 0;
        }
        local_348 = (code *)&LAB_00b644f0;
        local_338 = SHA256_Transform;
        cnt = 0x1c;
        goto LAB_00b63c34;
      }
      iVar8 = EVP_MD_is_a(param_1,"SHA2-256");
      if (iVar8 != 0) {
        iVar8 = SHA256_Init((SHA256_CTX *)&SStack_148);
        if (iVar8 < 1) {
          return 0;
        }
        local_348 = (code *)&LAB_00b644f0;
        local_338 = SHA256_Transform;
        cnt = 0x20;
        goto LAB_00b63c34;
      }
      iVar8 = EVP_MD_is_a(param_1,"SHA2-384");
      if (iVar8 == 0) {
        iVar8 = EVP_MD_is_a(param_1,"SHA2-512");
        if (iVar8 == 0) {
          if (param_3 == (ulong *)0x0) {
            return 0;
          }
          *param_3 = 0;
          return 0;
        }
        iVar8 = SHA512_Init(&SStack_148);
        if (iVar8 < 1) {
          return 0;
        }
        cnt = 0x40;
      }
      else {
        iVar8 = SHA384_Init(&SStack_148);
        if (iVar8 < 1) {
          return 0;
        }
        cnt = 0x30;
      }
      local_348 = (code *)&LAB_00b64614;
      local_338 = SHA512_Transform;
      __n_02 = 0x80;
      __n_01 = 0x10;
    }
    else {
      iVar8 = SHA1_Init((SHA_CTX *)&SStack_148);
      if (iVar8 < 1) {
        return 0;
      }
      local_348 = (code *)&LAB_00b64438;
      local_338 = SHA1_Transform;
      cnt = 0x14;
LAB_00b63c34:
      __n_02 = 0x40;
      __n_01 = 8;
    }
    bVar2 = true;
    __n_00 = 0x28;
  }
  else {
    iVar8 = MD5_Init((MD5_CTX *)&SStack_148);
    if (iVar8 < 1) {
      return 0;
    }
    local_348 = FUN_00b643a4;
    bVar2 = false;
    cnt = 0x10;
    __n_02 = 0x40;
    __n_01 = 8;
    __n_00 = 0x30;
    local_338 = MD5_Transform;
  }
  uVar12 = param_9 + __n_00 + 0xb;
  if (param_10 == '\0') {
    uVar12 = 0xd;
    uVar21 = 0;
    if (__n_02 != 0) {
      uVar21 = ((__n_02 + (cnt | 0x100)) - 1) / __n_02;
    }
    uVar21 = uVar21 + 1;
  }
  else {
    uVar21 = 2;
  }
  param_7 = uVar12 + param_7;
  lVar28 = __n_01 - 1;
  uVar14 = 0;
  if (__n_02 != 0) {
    uVar14 = ((lVar28 + param_7 + __n_02) - cnt) / __n_02;
  }
  uVar26 = uVar21;
  if (param_10 != '\0') {
    uVar26 = uVar21 + 1;
  }
  uVar22 = uVar14 - uVar21;
  uVar16 = uVar12 + param_6;
  uVar13 = uVar22 * __n_02;
  if (uVar14 <= uVar26) {
    uVar22 = 0;
    uVar13 = 0;
  }
  iVar8 = (int)uVar16 * 8;
  if (param_10 == '\0') {
    memset(local_1d8,0,__n_02);
    if (0x80 < param_9) {
      return 0;
    }
    iVar8 = iVar8 + (int)__n_02 * 8;
    memcpy(local_1d8,param_8,param_9);
    puVar10 = local_1d8 + 2;
    uVar14 = __n_02;
    do {
      uVar14 = uVar14 - 0x20;
      puVar10[-1] = puVar10[-1] ^ 0x3636363636363636;
      puVar10[-2] = puVar10[-2] ^ 0x3636363636363636;
      puVar10[1] = puVar10[1] ^ 0x3636363636363636;
      *puVar10 = *puVar10 ^ 0x3636363636363636;
      puVar10 = puVar10 + 4;
    } while (uVar14 != 0);
    (*local_338)(&SStack_148,local_1d8);
    if (bVar2) goto LAB_00b63ce8;
LAB_00b63da0:
    memset(abStack_160 + 8,0,__n_01);
    lVar28 = __n_01 - 8;
    abStack_160[__n_01 + 3] = (byte)((uint)iVar8 >> 0x18);
    abStack_160[__n_01 + 2] = (byte)((uint)iVar8 >> 0x10);
    abStack_160[__n_01 + 1] = (byte)((uint)iVar8 >> 8);
  }
  else {
    if (!bVar2) goto LAB_00b63da0;
LAB_00b63ce8:
    memset(abStack_160 + 8,0,__n_01 - 4);
    abStack_160[__n_01 + 4] = (byte)((uint)iVar8 >> 0x18);
    abStack_160[__n_01 + 5] = (byte)((uint)iVar8 >> 0x10);
    abStack_160[__n_01 + 6] = (byte)((uint)iVar8 >> 8);
  }
  abStack_160[lVar28 + 8] = (byte)iVar8;
  if (uVar13 != 0) {
    if (param_10 == '\0') {
      uStack_250 = (undefined5)((ulong)*(undefined8 *)((long)param_4 + 5) >> 0x18);
      uStack_258 = (undefined5)*param_4;
      local_253 = (undefined3)((ulong)*param_4 >> 0x28);
      memcpy(auStack_24b,param_5,__n_02 - 0xd);
      (*local_338)(&SStack_148,&uStack_258);
      uVar14 = 0;
      if (__n_02 != 0) {
        uVar14 = uVar13 / __n_02;
      }
      if (1 < uVar14) {
        uVar26 = 1;
        lVar28 = (long)param_5 + (__n_02 - 0xd);
        do {
          (*local_338)(&SStack_148,lVar28);
          uVar26 = uVar26 + 1;
          lVar28 = lVar28 + __n_02;
        } while (uVar26 < uVar14);
      }
    }
    else {
      __n = uVar12 - __n_02;
      if (uVar12 < __n_02 || __n == 0) {
        return 0;
      }
      (*local_338)(&SStack_148,param_4);
      memcpy(&uStack_258,(void *)((long)param_4 + __n_02),__n);
      memcpy(auStack_24b + (__n - 0xd),param_5,__n_02 - __n);
      (*local_338)(&SStack_148,&uStack_258);
      uVar14 = 0;
      if (__n_02 != 0) {
        uVar14 = uVar13 / __n_02;
      }
      if (1 < uVar14 - 1) {
        uVar26 = 1;
        lVar28 = (long)param_5 + (__n_02 * 2 - uVar12);
        do {
          (*local_338)(&SStack_148,lVar28);
          uVar26 = uVar26 + 1;
          lVar28 = lVar28 + __n_02;
        } while (uVar26 < uVar14 - 1);
      }
    }
  }
  uVar14 = uVar22 + uVar21;
  uStack_260 = 0;
  local_268 = 0;
  uStack_270 = 0;
  local_278 = 0;
  uStack_280 = 0;
  local_288 = 0;
  local_298[8] = 0;
  local_298[9] = 0;
  local_298[10] = 0;
  local_298[0xb] = 0;
  local_298[0xc] = 0;
  local_298[0xd] = 0;
  local_298[0xe] = 0;
  local_298[0xf] = 0;
  local_298[0] = 0;
  local_298[1] = 0;
  local_298[2] = 0;
  local_298[3] = 0;
  local_298[4] = 0;
  local_298[5] = 0;
  local_298[6] = 0;
  local_298[7] = 0;
  if (!CARRY8(uVar22,uVar21)) {
    uVar21 = 0;
    if (__n_02 != 0) {
      uVar21 = uVar16 / __n_02;
    }
    uVar27 = __n_02 - __n_01;
    uVar26 = 0;
    if (__n_02 != 0) {
      uVar26 = (uVar16 + __n_01) / __n_02;
    }
    uVar15 = cnt & 0x60;
    lVar28 = uVar16 - uVar21 * __n_02;
    do {
      uVar3 = (uint)((uVar22 ^ uVar21) - 1 >> 0x20) &
              ((uint)((uVar22 ^ uVar21) >> 0x20) ^ 0x80000000);
      uVar16 = (uVar22 ^ uVar26) - 1 & (uVar22 ^ uVar26 ^ 0x8000000000000000);
      bVar7 = (byte)((long)uVar16 >> 0x3f);
      uVar9 = (int)uVar3 >> 0x1f;
      bVar6 = (byte)((int)uVar3 >> 0x1f);
      bVar5 = bVar6 | bVar7 ^ 0xff;
      if (uVar13 < uVar12) {
        pbVar11 = (byte *)((long)param_4 + uVar13);
LAB_00b63ff4:
        bVar24 = *pbVar11;
      }
      else {
        bVar24 = 0;
        if (uVar13 < param_7) {
          pbVar11 = (byte *)((long)param_5 + (uVar13 - uVar12));
          goto LAB_00b63ff4;
        }
      }
      uVar23 = uVar13 | 1;
      uVar3 = ~(uint)(-lVar28 >> 0x3f) & uVar9;
      local_6c = ~(uVar3 & 0xff);
      uVar1 = ~((uint)((long)uVar16 >> 0x3f) & 0xff);
      bVar24 = bVar5 & ((byte)local_6c & bVar24 | (byte)uVar3 & 0x80);
      bVar4 = (byte)uVar1;
      if (uVar27 == 0) {
        bVar24 = bVar4 & bVar24 | bVar7 & abStack_160[8];
      }
      local_318 = CONCAT31(local_318._1_3_,bVar24);
      uVar16 = 1;
      do {
        if (uVar23 < uVar12) {
          pbVar11 = (byte *)((long)param_4 + uVar23);
LAB_00b64088:
          bVar24 = *pbVar11;
        }
        else {
          bVar24 = 0;
          if (uVar23 < param_7) {
            pbVar11 = (byte *)((long)param_5 + (uVar23 - uVar12));
            goto LAB_00b64088;
          }
        }
        uVar3 = uVar9 & ((uint)((long)(uVar16 - lVar28) >> 0x3f) ^ 0xffffffff);
        local_6c = ~(uVar3 & 0xff);
        uVar23 = uVar23 + 1;
        bVar24 = ((byte)((long)(uVar16 - (lVar28 + 1)) >> 0x3f) | ~bVar6) & bVar5 &
                 ((byte)local_6c & bVar24 | (byte)uVar3 & 0x80);
        if (uVar27 <= uVar16) {
          bVar24 = bVar4 & bVar24 | bVar7 & abStack_160[(uVar16 - uVar27) + 8];
          local_6c = uVar1;
        }
        *(byte *)((long)auStack_308 + (uVar16 - 0x10)) = bVar24;
        uVar16 = uVar16 + 1;
      } while (uVar16 != __n_02);
      (*local_338)(&SStack_148,&local_318);
      (*local_348)(&SStack_148,&local_318);
      uVar16 = 0;
      if (cnt < 0x20) {
LAB_00b64184:
        lVar20 = cnt - uVar16;
        pbVar11 = (byte *)((long)auStack_308 + (uVar16 - 0x10));
        pbVar18 = local_298 + uVar16;
        do {
          lVar20 = lVar20 + -1;
          *pbVar18 = *pbVar18 | *pbVar11 & bVar7;
          pbVar11 = pbVar11 + 1;
          pbVar18 = pbVar18 + 1;
        } while (lVar20 != 0);
      }
      else {
        uVar16 = uVar15;
        puVar17 = &local_288;
        puVar19 = auStack_308;
        do {
          uVar29 = puVar19[-1];
          uVar25 = puVar19[-2];
          uVar31 = puVar19[1];
          uVar30 = *puVar19;
          uVar33 = puVar17[-1];
          uVar32 = puVar17[-2];
          uVar35 = puVar17[1];
          uVar34 = *puVar17;
          puVar19 = puVar19 + 4;
          uVar16 = uVar16 - 0x20;
          puVar17[-1] = CONCAT17((byte)((ulong)uVar33 >> 0x38) |
                                 (byte)((ulong)uVar29 >> 0x38) & bVar7,
                                 CONCAT16((byte)((ulong)uVar33 >> 0x30) |
                                          (byte)((ulong)uVar29 >> 0x30) & bVar7,
                                          CONCAT15((byte)((ulong)uVar33 >> 0x28) |
                                                   (byte)((ulong)uVar29 >> 0x28) & bVar7,
                                                   CONCAT14((byte)((ulong)uVar33 >> 0x20) |
                                                            (byte)((ulong)uVar29 >> 0x20) & bVar7,
                                                            CONCAT13((byte)((ulong)uVar33 >> 0x18) |
                                                                     (byte)((ulong)uVar29 >> 0x18) &
                                                                     bVar7,CONCAT12((byte)((ulong)
                                                  uVar33 >> 0x10) |
                                                  (byte)((ulong)uVar29 >> 0x10) & bVar7,
                                                  CONCAT11((byte)((ulong)uVar33 >> 8) |
                                                           (byte)((ulong)uVar29 >> 8) & bVar7,
                                                           (byte)uVar33 | (byte)uVar29 & bVar7))))))
                                );
          puVar17[-2] = CONCAT17((byte)((ulong)uVar32 >> 0x38) |
                                 (byte)((ulong)uVar25 >> 0x38) & bVar7,
                                 CONCAT16((byte)((ulong)uVar32 >> 0x30) |
                                          (byte)((ulong)uVar25 >> 0x30) & bVar7,
                                          CONCAT15((byte)((ulong)uVar32 >> 0x28) |
                                                   (byte)((ulong)uVar25 >> 0x28) & bVar7,
                                                   CONCAT14((byte)((ulong)uVar32 >> 0x20) |
                                                            (byte)((ulong)uVar25 >> 0x20) & bVar7,
                                                            CONCAT13((byte)((ulong)uVar32 >> 0x18) |
                                                                     (byte)((ulong)uVar25 >> 0x18) &
                                                                     bVar7,CONCAT12((byte)((ulong)
                                                  uVar32 >> 0x10) |
                                                  (byte)((ulong)uVar25 >> 0x10) & bVar7,
                                                  CONCAT11((byte)((ulong)uVar32 >> 8) |
                                                           (byte)((ulong)uVar25 >> 8) & bVar7,
                                                           (byte)uVar32 | (byte)uVar25 & bVar7))))))
                                );
          puVar17[1] = CONCAT17((byte)((ulong)uVar35 >> 0x38) |
                                (byte)((ulong)uVar31 >> 0x38) & bVar7,
                                CONCAT16((byte)((ulong)uVar35 >> 0x30) |
                                         (byte)((ulong)uVar31 >> 0x30) & bVar7,
                                         CONCAT15((byte)((ulong)uVar35 >> 0x28) |
                                                  (byte)((ulong)uVar31 >> 0x28) & bVar7,
                                                  CONCAT14((byte)((ulong)uVar35 >> 0x20) |
                                                           (byte)((ulong)uVar31 >> 0x20) & bVar7,
                                                           CONCAT13((byte)((ulong)uVar35 >> 0x18) |
                                                                    (byte)((ulong)uVar31 >> 0x18) &
                                                                    bVar7,CONCAT12((byte)((ulong)
                                                  uVar35 >> 0x10) |
                                                  (byte)((ulong)uVar31 >> 0x10) & bVar7,
                                                  CONCAT11((byte)((ulong)uVar35 >> 8) |
                                                           (byte)((ulong)uVar31 >> 8) & bVar7,
                                                           (byte)uVar35 | (byte)uVar31 & bVar7))))))
                               );
          *puVar17 = CONCAT17((byte)((ulong)uVar34 >> 0x38) | (byte)((ulong)uVar30 >> 0x38) & bVar7,
                              CONCAT16((byte)((ulong)uVar34 >> 0x30) |
                                       (byte)((ulong)uVar30 >> 0x30) & bVar7,
                                       CONCAT15((byte)((ulong)uVar34 >> 0x28) |
                                                (byte)((ulong)uVar30 >> 0x28) & bVar7,
                                                CONCAT14((byte)((ulong)uVar34 >> 0x20) |
                                                         (byte)((ulong)uVar30 >> 0x20) & bVar7,
                                                         CONCAT13((byte)((ulong)uVar34 >> 0x18) |
                                                                  (byte)((ulong)uVar30 >> 0x18) &
                                                                  bVar7,CONCAT12((byte)((ulong)
                                                  uVar34 >> 0x10) |
                                                  (byte)((ulong)uVar30 >> 0x10) & bVar7,
                                                  CONCAT11((byte)((ulong)uVar34 >> 8) |
                                                           (byte)((ulong)uVar30 >> 8) & bVar7,
                                                           (byte)uVar34 | (byte)uVar30 & bVar7))))))
                             );
          puVar17 = puVar17 + 4;
        } while (uVar16 != 0);
        uVar16 = uVar15;
        if (cnt != uVar15) goto LAB_00b64184;
      }
      uVar13 = __n_02 + uVar13;
      uVar22 = uVar22 + 1;
    } while (uVar22 <= uVar14);
  }
  ctx = (EVP_MD_CTX *)EVP_MD_CTX_new();
  if ((ctx != (EVP_MD_CTX *)0x0) &&
     (iVar8 = EVP_DigestInit_ex(ctx,param_1,(ENGINE *)0x0), 0 < iVar8)) {
    if (param_10 == '\0') {
      uVar12 = 0;
      do {
        uVar21 = uVar12 + 0x20;
        *(ulong *)((long)local_1d8 + uVar12 + 8) =
             *(ulong *)((long)local_1d8 + uVar12 + 8) ^ 0x6a6a6a6a6a6a6a6a;
        *(ulong *)((long)local_1d8 + uVar12) =
             *(ulong *)((long)local_1d8 + uVar12) ^ 0x6a6a6a6a6a6a6a6a;
        *(ulong *)((long)local_1d8 + uVar12 + 0x18) =
             *(ulong *)((long)local_1d8 + uVar12 + 0x18) ^ 0x6a6a6a6a6a6a6a6a;
        *(ulong *)((long)local_1d8 + uVar12 + 0x10) =
             *(ulong *)((long)local_1d8 + uVar12 + 0x10) ^ 0x6a6a6a6a6a6a6a6a;
        uVar12 = uVar21;
      } while (__n_02 != uVar21);
    }
    else {
      memset(local_1d8,0x5c,__n_00);
      iVar8 = EVP_DigestUpdate(ctx,param_8,param_9);
      if (iVar8 < 1) goto LAB_00b642c4;
      __n_02 = __n_00;
    }
    iVar8 = EVP_DigestUpdate(ctx,local_1d8,__n_02);
    if ((0 < iVar8) && (iVar8 = EVP_DigestUpdate(ctx,local_298,cnt), 0 < iVar8)) {
      iVar8 = EVP_DigestFinal(ctx,param_2,&local_318);
      uVar25 = 1;
      if ((param_3 != (ulong *)0x0) && (iVar8 != 0)) {
        uVar25 = 1;
        *param_3 = (ulong)local_318;
      }
      goto LAB_00b642c8;
    }
  }
LAB_00b642c4:
  uVar25 = 0;
LAB_00b642c8:
  EVP_MD_CTX_free(ctx);
  return uVar25;
}

