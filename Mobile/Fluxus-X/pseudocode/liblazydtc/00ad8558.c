/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ad8558
 */

int RSA_verify_PKCS1_PSS_mgf1
              (RSA *rsa,uchar *mHash,EVP_MD *Hash,EVP_MD *mgf1Hash,uchar *EM,int sLen)

{
  long lVar1;
  uint uVar2;
  EVP_MD *dgst;
  ulong uVar3;
  int iVar4;
  int iVar5;
  bool bVar6;
  int iVar7;
  int iVar8;
  int iVar9;
  int iVar10;
  EVP_MD_CTX *ctx;
  undefined8 uVar11;
  size_t cnt;
  ulong uVar12;
  int iVar13;
  byte *pbVar14;
  byte *pbVar15;
  ulong uVar16;
  byte *mask;
  ulong len;
  long lVar17;
  undefined8 uVar18;
  undefined8 uVar19;
  undefined8 uVar20;
  undefined8 uVar21;
  undefined8 uVar22;
  undefined8 uVar23;
  undefined8 uVar24;
  uchar auStack_a0 [64];
  
  ctx = (EVP_MD_CTX *)EVP_MD_CTX_new();
  if (ctx != (EVP_MD_CTX *)0x0) {
    dgst = Hash;
    if (mgf1Hash != (EVP_MD *)0x0) {
      dgst = mgf1Hash;
    }
    iVar7 = EVP_MD_get_size(Hash);
    if (-1 < iVar7) {
      iVar9 = iVar7;
      if ((sLen == -1) || (iVar9 = sLen, -4 < sLen)) {
        iVar8 = BN_num_bits(rsa->e);
        uVar2 = iVar8 - 1U & 7;
        iVar8 = RSA_size(rsa);
        if ((0xff << (ulong)uVar2 & (uint)*EM) == 0) {
          bVar6 = uVar2 == 0;
          iVar10 = iVar8 - (uint)bVar6;
          if (bVar6) {
            EM = EM + 1;
          }
          if (iVar10 < iVar7 + 2) {
            ERR_new();
            uVar11 = 0x54;
          }
          else {
            iVar5 = iVar10 - iVar7;
            iVar4 = iVar5 + -2;
            iVar13 = iVar4;
            if ((iVar9 == -3) || (iVar13 = iVar9, iVar9 <= iVar4)) {
              if (EM[(long)iVar10 + -1] != 0xbc) {
                ERR_new();
                ERR_set_debug("crypto/rsa/rsa_pss.c",0x5e,"RSA_verify_PKCS1_PSS_mgf1");
                uVar11 = 0x86;
                goto LAB_00ad892c;
              }
              len = (ulong)(iVar5 + -1);
              mask = CRYPTO_malloc(iVar5 + -1,"crypto/rsa/rsa_pss.c",99);
              if (mask == (byte *)0x0) {
                ERR_new();
                ERR_set_debug("crypto/rsa/rsa_pss.c",0x65,"RSA_verify_PKCS1_PSS_mgf1");
                uVar11 = 0xc0100;
LAB_00ad89cc:
                ERR_set_error(4,uVar11,0);
              }
              else {
                cnt = (size_t)iVar7;
                iVar9 = PKCS1_MGF1(mask,len,EM + len,cnt,dgst);
                if (-1 < iVar9) {
                  if (1 < iVar5) {
                    uVar3 = len;
                    if ((long)len < 2) {
                      uVar3 = 1;
                    }
                    uVar12 = 0;
                    if (0x1f < uVar3) {
                      uVar16 = len;
                      if ((long)len < 2) {
                        uVar16 = 1;
                      }
                      if ((EM + uVar16 <= mask) || (uVar12 = 0, mask + uVar16 <= EM)) {
                        uVar12 = uVar3 & 0x7fffffffffffffe0;
                        pbVar14 = EM + 0x10;
                        pbVar15 = mask + 0x10;
                        uVar16 = uVar12;
                        do {
                          uVar18 = *(undefined8 *)(pbVar14 + -8);
                          uVar11 = *(undefined8 *)(pbVar14 + -0x10);
                          uVar20 = *(undefined8 *)(pbVar14 + 8);
                          uVar19 = *(undefined8 *)pbVar14;
                          uVar22 = *(undefined8 *)(pbVar15 + -8);
                          uVar21 = *(undefined8 *)(pbVar15 + -0x10);
                          uVar24 = *(undefined8 *)(pbVar15 + 8);
                          uVar23 = *(undefined8 *)pbVar15;
                          pbVar14 = pbVar14 + 0x20;
                          uVar16 = uVar16 - 0x20;
                          *(ulong *)(pbVar15 + -8) =
                               CONCAT17((byte)((ulong)uVar22 >> 0x38) ^
                                        (byte)((ulong)uVar18 >> 0x38),
                                        CONCAT16((byte)((ulong)uVar22 >> 0x30) ^
                                                 (byte)((ulong)uVar18 >> 0x30),
                                                 CONCAT15((byte)((ulong)uVar22 >> 0x28) ^
                                                          (byte)((ulong)uVar18 >> 0x28),
                                                          CONCAT14((byte)((ulong)uVar22 >> 0x20) ^
                                                                   (byte)((ulong)uVar18 >> 0x20),
                                                                   CONCAT13((byte)((ulong)uVar22 >>
                                                                                  0x18) ^
                                                                            (byte)((ulong)uVar18 >>
                                                                                  0x18),
                                                                            CONCAT12((byte)((ulong)
                                                  uVar22 >> 0x10) ^ (byte)((ulong)uVar18 >> 0x10),
                                                  CONCAT11((byte)((ulong)uVar22 >> 8) ^
                                                           (byte)((ulong)uVar18 >> 8),
                                                           (byte)uVar22 ^ (byte)uVar18)))))));
                          *(ulong *)(pbVar15 + -0x10) =
                               CONCAT17((byte)((ulong)uVar21 >> 0x38) ^
                                        (byte)((ulong)uVar11 >> 0x38),
                                        CONCAT16((byte)((ulong)uVar21 >> 0x30) ^
                                                 (byte)((ulong)uVar11 >> 0x30),
                                                 CONCAT15((byte)((ulong)uVar21 >> 0x28) ^
                                                          (byte)((ulong)uVar11 >> 0x28),
                                                          CONCAT14((byte)((ulong)uVar21 >> 0x20) ^
                                                                   (byte)((ulong)uVar11 >> 0x20),
                                                                   CONCAT13((byte)((ulong)uVar21 >>
                                                                                  0x18) ^
                                                                            (byte)((ulong)uVar11 >>
                                                                                  0x18),
                                                                            CONCAT12((byte)((ulong)
                                                  uVar21 >> 0x10) ^ (byte)((ulong)uVar11 >> 0x10),
                                                  CONCAT11((byte)((ulong)uVar21 >> 8) ^
                                                           (byte)((ulong)uVar11 >> 8),
                                                           (byte)uVar21 ^ (byte)uVar11)))))));
                          *(ulong *)(pbVar15 + 8) =
                               CONCAT17((byte)((ulong)uVar24 >> 0x38) ^
                                        (byte)((ulong)uVar20 >> 0x38),
                                        CONCAT16((byte)((ulong)uVar24 >> 0x30) ^
                                                 (byte)((ulong)uVar20 >> 0x30),
                                                 CONCAT15((byte)((ulong)uVar24 >> 0x28) ^
                                                          (byte)((ulong)uVar20 >> 0x28),
                                                          CONCAT14((byte)((ulong)uVar24 >> 0x20) ^
                                                                   (byte)((ulong)uVar20 >> 0x20),
                                                                   CONCAT13((byte)((ulong)uVar24 >>
                                                                                  0x18) ^
                                                                            (byte)((ulong)uVar20 >>
                                                                                  0x18),
                                                                            CONCAT12((byte)((ulong)
                                                  uVar24 >> 0x10) ^ (byte)((ulong)uVar20 >> 0x10),
                                                  CONCAT11((byte)((ulong)uVar24 >> 8) ^
                                                           (byte)((ulong)uVar20 >> 8),
                                                           (byte)uVar24 ^ (byte)uVar20)))))));
                          *(ulong *)pbVar15 =
                               CONCAT17((byte)((ulong)uVar23 >> 0x38) ^
                                        (byte)((ulong)uVar19 >> 0x38),
                                        CONCAT16((byte)((ulong)uVar23 >> 0x30) ^
                                                 (byte)((ulong)uVar19 >> 0x30),
                                                 CONCAT15((byte)((ulong)uVar23 >> 0x28) ^
                                                          (byte)((ulong)uVar19 >> 0x28),
                                                          CONCAT14((byte)((ulong)uVar23 >> 0x20) ^
                                                                   (byte)((ulong)uVar19 >> 0x20),
                                                                   CONCAT13((byte)((ulong)uVar23 >>
                                                                                  0x18) ^
                                                                            (byte)((ulong)uVar19 >>
                                                                                  0x18),
                                                                            CONCAT12((byte)((ulong)
                                                  uVar23 >> 0x10) ^ (byte)((ulong)uVar19 >> 0x10),
                                                  CONCAT11((byte)((ulong)uVar23 >> 8) ^
                                                           (byte)((ulong)uVar19 >> 8),
                                                           (byte)uVar23 ^ (byte)uVar19)))))));
                          pbVar15 = pbVar15 + 0x20;
                        } while (uVar16 != 0);
                        if (uVar3 == uVar12) goto LAB_00ad87cc;
                      }
                    }
                    do {
                      mask[uVar12] = mask[uVar12] ^ EM[uVar12];
                      uVar12 = uVar12 + 1;
                    } while ((long)uVar12 < (long)len);
                  }
LAB_00ad87cc:
                  if (uVar2 != 0) {
                    *mask = *mask & (byte)(0xff >> (ulong)(8 - uVar2 & 0x1f));
                  }
                  lVar17 = 0;
                  do {
                    pbVar14 = mask + lVar17;
                    lVar1 = lVar17 + 1;
                    if (iVar4 <= lVar17) break;
                    lVar17 = lVar1;
                  } while (*pbVar14 == 0);
                  if (*pbVar14 != 1) {
                    ERR_new();
                    ERR_set_debug("crypto/rsa/rsa_pss.c",0x70,"RSA_verify_PKCS1_PSS_mgf1");
                    uVar11 = 0x87;
                    goto LAB_00ad89cc;
                  }
                  iVar9 = (int)lVar1;
                  if ((iVar13 == -2) ||
                     (uVar2 = (iVar8 + -(uint)bVar6 + -1) - iVar7, uVar2 - iVar13 == iVar9)) {
                    iVar10 = EVP_DigestInit_ex(ctx,Hash,(ENGINE *)0x0);
                    if ((((iVar10 != 0) &&
                         (iVar10 = EVP_DigestUpdate(ctx,&DAT_00774914,8), iVar10 != 0)) &&
                        (iVar10 = EVP_DigestUpdate(ctx,mHash,cnt), iVar10 != 0)) &&
                       (((iVar7 = (iVar8 + -(uint)bVar6 + -1) - iVar7, iVar7 == iVar9 ||
                         (iVar7 = EVP_DigestUpdate(ctx,mask + lVar1,(long)(iVar7 - iVar9)),
                         iVar7 != 0)) &&
                        (iVar7 = EVP_DigestFinal_ex(ctx,auStack_a0,(uint *)0x0), iVar7 != 0)))) {
                      iVar7 = memcmp(auStack_a0,EM + len,cnt);
                      if (iVar7 == 0) {
                        iVar7 = 1;
                        goto LAB_00ad893c;
                      }
                      ERR_new();
                      ERR_set_debug("crypto/rsa/rsa_pss.c",0x84,"RSA_verify_PKCS1_PSS_mgf1");
                      uVar11 = 0x68;
                      goto LAB_00ad89cc;
                    }
                  }
                  else {
                    ERR_new();
                    ERR_set_debug("crypto/rsa/rsa_pss.c",0x74,"RSA_verify_PKCS1_PSS_mgf1");
                    ERR_set_error(4,0x88,"expected: %d retrieved: %d",iVar13,
                                  (ulong)uVar2 - lVar1 & 0xffffffff);
                  }
                }
              }
              iVar7 = 0;
              goto LAB_00ad893c;
            }
            ERR_new();
            uVar11 = 0x5a;
          }
          ERR_set_debug("crypto/rsa/rsa_pss.c",uVar11,"RSA_verify_PKCS1_PSS_mgf1");
          uVar11 = 0x6d;
        }
        else {
          ERR_new();
          ERR_set_debug("crypto/rsa/rsa_pss.c",0x4c,"RSA_verify_PKCS1_PSS_mgf1");
          uVar11 = 0x85;
        }
      }
      else {
        ERR_new();
        ERR_set_debug("crypto/rsa/rsa_pss.c",0x45,"RSA_verify_PKCS1_PSS_mgf1");
        uVar11 = 0x88;
      }
LAB_00ad892c:
      ERR_set_error(4,uVar11,0);
    }
  }
  iVar7 = 0;
  mask = (byte *)0x0;
LAB_00ad893c:
  CRYPTO_free(mask);
  EVP_MD_CTX_free(ctx);
  return iVar7;
}

