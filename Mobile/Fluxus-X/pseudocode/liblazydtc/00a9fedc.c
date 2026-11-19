/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a9fedc
 */

undefined8
OSSL_PARAM_allocate_from_text
          (undefined8 *param_1,long param_2,char *param_3,char *param_4,ulong param_5,uint *param_6)

{
  char *pcVar1;
  BIGNUM *pBVar2;
  int iVar3;
  int iVar4;
  undefined8 *puVar5;
  size_t sVar6;
  byte *__dest;
  undefined8 uVar7;
  ulong uVar8;
  ulong uVar9;
  byte *pbVar10;
  ulong uVar11;
  ulong __n;
  undefined8 uVar12;
  undefined8 uVar13;
  undefined8 uVar14;
  BIGNUM *local_58;
  undefined8 local_48;
  
  local_58 = (BIGNUM *)0x0;
  if (param_1 == (undefined8 *)0x0) {
    return 0;
  }
  if (param_2 == 0) {
    return 0;
  }
  iVar3 = strncmp(param_3,"hex",3);
  pcVar1 = param_3 + 3;
  if (iVar3 != 0) {
    pcVar1 = param_3;
  }
  puVar5 = (undefined8 *)OSSL_PARAM_locate_const(param_2,pcVar1);
  if (param_6 != (uint *)0x0) {
    *param_6 = (uint)(puVar5 != (undefined8 *)0x0);
  }
  if (puVar5 == (undefined8 *)0x0) goto LAB_00aa0188;
  iVar4 = *(int *)(puVar5 + 1);
  if (iVar4 - 1U < 2) {
    if (iVar3 == 0) {
      iVar4 = BN_hex2bn(&local_58,param_4);
    }
    else {
      iVar4 = BN_asc2bn(&local_58,param_4);
    }
    if ((iVar4 == 0) || (local_58 == (BIGNUM *)0x0)) goto LAB_00aa0188;
    iVar4 = *(int *)(puVar5 + 1);
    if (iVar4 == 2) {
      iVar4 = BN_is_negative();
      if (iVar4 != 0) {
        ERR_new();
        ERR_set_debug("crypto/params_from_text.c",0x3e,"prepare_from_text");
        uVar7 = 0x7a;
        goto LAB_00aa0180;
      }
      iVar4 = *(int *)(puVar5 + 1);
    }
    if (((iVar4 == 1) && (iVar4 = BN_is_negative(local_58), iVar4 != 0)) &&
       (iVar4 = BN_add_word(local_58,1), iVar4 == 0)) goto LAB_00aa0188;
    iVar4 = BN_num_bits(local_58);
    uVar9 = (ulong)iVar4;
    __n = puVar5[3];
    uVar8 = uVar9 + 8;
    if ((uVar9 & 7) != 0 || *(int *)(puVar5 + 1) != 1) {
      uVar8 = uVar9;
    }
    if (__n == 0) {
      __n = uVar8 + 7 >> 3;
    }
    else if (__n * 8 < uVar8) {
      ERR_new();
      ERR_set_debug("crypto/params_from_text.c",0x68,"prepare_from_text");
      uVar7 = 0x74;
      goto LAB_00aa0180;
    }
LAB_00aa00fc:
    uVar8 = __n;
    if (__n == 0) {
      uVar8 = 1;
    }
    __dest = (byte *)CRYPTO_zalloc(uVar8,"crypto/params_from_text.c",0xde);
    pBVar2 = local_58;
    if (__dest != (byte *)0x0) {
      if (__n != 0) {
        iVar4 = *(int *)(puVar5 + 1);
        if (iVar4 - 1U < 2) {
          BN_bn2nativepad(local_58,__dest,__n & 0xffffffff);
          if ((*(int *)(puVar5 + 1) == 1) && (iVar3 = BN_is_negative(pBVar2), iVar3 != 0)) {
            uVar8 = __n;
            pbVar10 = __dest;
            if (0x1f < __n) {
              uVar11 = __n & 0xffffffffffffffe0;
              uVar8 = __n - uVar11;
              pbVar10 = __dest + 0x10;
              uVar9 = uVar11;
              do {
                uVar12 = *(undefined8 *)(pbVar10 + -8);
                uVar7 = *(undefined8 *)(pbVar10 + -0x10);
                uVar14 = *(undefined8 *)(pbVar10 + 8);
                uVar13 = *(undefined8 *)pbVar10;
                uVar9 = uVar9 - 0x20;
                *(ulong *)(pbVar10 + -8) =
                     CONCAT17(~(byte)((ulong)uVar12 >> 0x38),
                              CONCAT16(~(byte)((ulong)uVar12 >> 0x30),
                                       CONCAT15(~(byte)((ulong)uVar12 >> 0x28),
                                                CONCAT14(~(byte)((ulong)uVar12 >> 0x20),
                                                         CONCAT13(~(byte)((ulong)uVar12 >> 0x18),
                                                                  CONCAT12(~(byte)((ulong)uVar12 >>
                                                                                  0x10),
                                                                           CONCAT11(~(byte)((ulong)
                                                  uVar12 >> 8),~(byte)uVar12)))))));
                *(ulong *)(pbVar10 + -0x10) =
                     CONCAT17(~(byte)((ulong)uVar7 >> 0x38),
                              CONCAT16(~(byte)((ulong)uVar7 >> 0x30),
                                       CONCAT15(~(byte)((ulong)uVar7 >> 0x28),
                                                CONCAT14(~(byte)((ulong)uVar7 >> 0x20),
                                                         CONCAT13(~(byte)((ulong)uVar7 >> 0x18),
                                                                  CONCAT12(~(byte)((ulong)uVar7 >>
                                                                                  0x10),
                                                                           CONCAT11(~(byte)((ulong)
                                                  uVar7 >> 8),~(byte)uVar7)))))));
                *(ulong *)(pbVar10 + 8) =
                     CONCAT17(~(byte)((ulong)uVar14 >> 0x38),
                              CONCAT16(~(byte)((ulong)uVar14 >> 0x30),
                                       CONCAT15(~(byte)((ulong)uVar14 >> 0x28),
                                                CONCAT14(~(byte)((ulong)uVar14 >> 0x20),
                                                         CONCAT13(~(byte)((ulong)uVar14 >> 0x18),
                                                                  CONCAT12(~(byte)((ulong)uVar14 >>
                                                                                  0x10),
                                                                           CONCAT11(~(byte)((ulong)
                                                  uVar14 >> 8),~(byte)uVar14)))))));
                *(ulong *)pbVar10 =
                     CONCAT17(~(byte)((ulong)uVar13 >> 0x38),
                              CONCAT16(~(byte)((ulong)uVar13 >> 0x30),
                                       CONCAT15(~(byte)((ulong)uVar13 >> 0x28),
                                                CONCAT14(~(byte)((ulong)uVar13 >> 0x20),
                                                         CONCAT13(~(byte)((ulong)uVar13 >> 0x18),
                                                                  CONCAT12(~(byte)((ulong)uVar13 >>
                                                                                  0x10),
                                                                           CONCAT11(~(byte)((ulong)
                                                  uVar13 >> 8),~(byte)uVar13)))))));
                pbVar10 = pbVar10 + 0x20;
              } while (uVar9 != 0);
              pbVar10 = __dest + uVar11;
              if (__n == uVar11) goto LAB_00aa0238;
            }
            do {
              uVar8 = uVar8 - 1;
              *pbVar10 = ~*pbVar10;
              pbVar10 = pbVar10 + 1;
            } while (uVar8 != 0);
          }
        }
        else if (iVar4 == 4) {
          strncpy((char *)__dest,param_4,__n);
          __n = __n - 1;
        }
        else if (iVar4 == 5) {
          if (iVar3 == 0) {
            local_48 = 0;
            iVar3 = OPENSSL_hexstr2buf_ex(__dest,__n,&local_48,param_4,0x3a);
            if (iVar3 == 0) {
              BN_free(local_58);
              CRYPTO_free(__dest);
              return 0;
            }
          }
          else {
            memcpy(__dest,param_4,__n);
          }
        }
      }
LAB_00aa0238:
      uVar12 = puVar5[1];
      uVar7 = *puVar5;
      param_1[2] = __dest;
      param_1[3] = __n;
      param_1[4] = 0xffffffffffffffff;
      param_1[1] = uVar12;
      *param_1 = uVar7;
      BN_free(local_58);
      return 1;
    }
    ERR_new();
    ERR_set_debug("crypto/params_from_text.c",0xdf,"OSSL_PARAM_allocate_from_text");
    uVar7 = 0xc0100;
  }
  else {
    if (iVar4 != 4) {
      __n = 0;
      if ((iVar4 == 5) && (__n = param_5, iVar3 == 0)) {
        sVar6 = strlen(param_4);
        if ((sVar6 & 1) != 0) {
          ERR_new();
          ERR_set_debug("crypto/params_from_text.c",0x7c,"prepare_from_text");
          uVar7 = 0x67;
          goto LAB_00aa0180;
        }
        __n = sVar6 >> 1;
      }
      goto LAB_00aa00fc;
    }
    if (iVar3 != 0) {
      sVar6 = strlen(param_4);
      __n = sVar6 + 1;
      goto LAB_00aa00fc;
    }
    ERR_new();
    ERR_set_debug("crypto/params_from_text.c",0x72,"prepare_from_text");
    uVar7 = 0x80106;
  }
LAB_00aa0180:
  ERR_set_error(0xf,uVar7,0);
LAB_00aa0188:
  BN_free(local_58);
  return 0;
}

