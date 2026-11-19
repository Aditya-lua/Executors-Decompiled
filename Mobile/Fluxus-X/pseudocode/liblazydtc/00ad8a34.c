/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ad8a34
 */

int RSA_padding_add_PKCS1_PSS_mgf1
              (RSA *rsa,uchar *EM,uchar *mHash,EVP_MD *Hash,EVP_MD *mgf1Hash,int sLen)

{
  uint uVar1;
  EVP_MD *dgst;
  uint uVar2;
  uint uVar3;
  int iVar4;
  int iVar5;
  undefined8 uVar6;
  byte *pbVar7;
  long lVar8;
  byte *pbVar9;
  byte *pbVar10;
  ulong uVar11;
  ulong uVar12;
  byte *mask;
  byte *d;
  EVP_MD_CTX *ctx;
  ulong uVar13;
  undefined8 uVar14;
  undefined8 uVar15;
  undefined8 uVar16;
  undefined8 uVar17;
  undefined8 uVar18;
  undefined8 uVar19;
  undefined8 uVar20;
  
  dgst = Hash;
  if (mgf1Hash != (EVP_MD *)0x0) {
    dgst = mgf1Hash;
  }
  uVar3 = EVP_MD_get_size(Hash);
  uVar13 = (ulong)uVar3;
  if ((int)uVar3 < 0) {
LAB_00ad8ad4:
    iVar4 = 0;
    d = (byte *)0x0;
    ctx = (EVP_MD_CTX *)0x0;
    goto LAB_00ad8cd4;
  }
  if (sLen != -1) {
    if (sLen == -2) {
      uVar13 = 0xfffffffd;
    }
    else {
      if (sLen < -3) {
        ERR_new();
        ERR_set_debug("crypto/rsa/rsa_pss.c",0xb6,"RSA_padding_add_PKCS1_PSS_mgf1");
        ERR_set_error(4,0x88,0);
        goto LAB_00ad8ad4;
      }
      uVar13 = (ulong)(uint)sLen;
    }
  }
  sLen = (int)uVar13;
  iVar4 = BN_num_bits(rsa->e);
  uVar1 = iVar4 - 1U & 7;
  iVar5 = RSA_size(rsa);
  mask = EM;
  if (uVar1 == 0) {
    mask = EM + 1;
    *EM = '\0';
    iVar5 = iVar5 + -1;
  }
  if (iVar5 < (int)(uVar3 + 2)) {
    ERR_new();
    uVar6 = 0xc1;
LAB_00ad8b34:
    ERR_set_debug("crypto/rsa/rsa_pss.c",uVar6,"RSA_padding_add_PKCS1_PSS_mgf1");
    ERR_set_error(4,0x6e,0);
    iVar4 = 0;
    d = (byte *)0x0;
    ctx = (EVP_MD_CTX *)0x0;
    goto LAB_00ad8cd4;
  }
  lVar8 = (long)iVar5 - (long)(int)uVar3;
  uVar2 = (int)lVar8 - 2;
  uVar12 = (ulong)uVar2;
  if (sLen != 0xfffffffd) {
    if ((int)uVar2 < sLen) {
      ERR_new();
      uVar6 = 199;
      goto LAB_00ad8b34;
    }
    uVar12 = uVar13;
  }
  sLen = (int)uVar12;
  if (0 < sLen) {
    d = CRYPTO_malloc(sLen,"crypto/rsa/rsa_pss.c",0xcb);
    if (d == (byte *)0x0) {
      ERR_new();
      ERR_set_debug("crypto/rsa/rsa_pss.c",0xcd,"RSA_padding_add_PKCS1_PSS_mgf1");
      ERR_set_error(4,0xc0100,0);
    }
    else {
      iVar4 = RAND_bytes_ex(rsa->version,d,(long)sLen,0);
      if (0 < iVar4) goto LAB_00ad8bf0;
    }
    iVar4 = 0;
    ctx = (EVP_MD_CTX *)0x0;
    goto LAB_00ad8cd4;
  }
  d = (byte *)0x0;
LAB_00ad8bf0:
  ctx = (EVP_MD_CTX *)EVP_MD_CTX_new();
  if (((ctx != (EVP_MD_CTX *)0x0) && (iVar4 = EVP_DigestInit_ex(ctx,Hash,(ENGINE *)0x0), iVar4 != 0)
      ) && (iVar4 = EVP_DigestUpdate(ctx,&DAT_00774914,8), iVar4 != 0)) {
    iVar4 = EVP_DigestUpdate(ctx,mHash,(long)(int)uVar3);
    if ((iVar4 != 0) && ((sLen == 0 || (iVar4 = EVP_DigestUpdate(ctx,d,(long)sLen), iVar4 != 0)))) {
      lVar8 = lVar8 + -1;
      iVar4 = EVP_DigestFinal_ex(ctx,mask + lVar8,(uint *)0x0);
      if ((iVar4 != 0) &&
         (iVar4 = PKCS1_MGF1(mask,lVar8,mask + lVar8,(long)(int)uVar3,dgst), iVar4 == 0)) {
        lVar8 = (long)(int)(((-2 - uVar3) + iVar5) - sLen);
        pbVar7 = mask + lVar8;
        *pbVar7 = *pbVar7 ^ 1;
        if (0 < sLen) {
          if ((uint)sLen < 0x20) {
            uVar13 = 0;
          }
          else if ((d + uVar12 <= mask + lVar8 + 1) || (uVar13 = 0, mask + lVar8 + uVar12 + 1 <= d))
          {
            uVar13 = uVar12 & 0xffffffe0;
            pbVar9 = mask + lVar8 + 0x11;
            pbVar7 = pbVar7 + uVar13;
            pbVar10 = d + 0x10;
            uVar11 = uVar13;
            do {
              uVar14 = *(undefined8 *)(pbVar10 + -8);
              uVar6 = *(undefined8 *)(pbVar10 + -0x10);
              uVar16 = *(undefined8 *)(pbVar10 + 8);
              uVar15 = *(undefined8 *)pbVar10;
              uVar18 = *(undefined8 *)(pbVar9 + -8);
              uVar17 = *(undefined8 *)(pbVar9 + -0x10);
              uVar20 = *(undefined8 *)(pbVar9 + 8);
              uVar19 = *(undefined8 *)pbVar9;
              uVar11 = uVar11 - 0x20;
              pbVar10 = pbVar10 + 0x20;
              *(ulong *)(pbVar9 + -8) =
                   CONCAT17((byte)((ulong)uVar18 >> 0x38) ^ (byte)((ulong)uVar14 >> 0x38),
                            CONCAT16((byte)((ulong)uVar18 >> 0x30) ^ (byte)((ulong)uVar14 >> 0x30),
                                     CONCAT15((byte)((ulong)uVar18 >> 0x28) ^
                                              (byte)((ulong)uVar14 >> 0x28),
                                              CONCAT14((byte)((ulong)uVar18 >> 0x20) ^
                                                       (byte)((ulong)uVar14 >> 0x20),
                                                       CONCAT13((byte)((ulong)uVar18 >> 0x18) ^
                                                                (byte)((ulong)uVar14 >> 0x18),
                                                                CONCAT12((byte)((ulong)uVar18 >>
                                                                               0x10) ^
                                                                         (byte)((ulong)uVar14 >>
                                                                               0x10),
                                                                         CONCAT11((byte)((ulong)
                                                  uVar18 >> 8) ^ (byte)((ulong)uVar14 >> 8),
                                                  (byte)uVar18 ^ (byte)uVar14)))))));
              *(ulong *)(pbVar9 + -0x10) =
                   CONCAT17((byte)((ulong)uVar17 >> 0x38) ^ (byte)((ulong)uVar6 >> 0x38),
                            CONCAT16((byte)((ulong)uVar17 >> 0x30) ^ (byte)((ulong)uVar6 >> 0x30),
                                     CONCAT15((byte)((ulong)uVar17 >> 0x28) ^
                                              (byte)((ulong)uVar6 >> 0x28),
                                              CONCAT14((byte)((ulong)uVar17 >> 0x20) ^
                                                       (byte)((ulong)uVar6 >> 0x20),
                                                       CONCAT13((byte)((ulong)uVar17 >> 0x18) ^
                                                                (byte)((ulong)uVar6 >> 0x18),
                                                                CONCAT12((byte)((ulong)uVar17 >>
                                                                               0x10) ^
                                                                         (byte)((ulong)uVar6 >> 0x10
                                                                               ),CONCAT11((byte)((
                                                  ulong)uVar17 >> 8) ^ (byte)((ulong)uVar6 >> 8),
                                                  (byte)uVar17 ^ (byte)uVar6)))))));
              *(ulong *)(pbVar9 + 8) =
                   CONCAT17((byte)((ulong)uVar20 >> 0x38) ^ (byte)((ulong)uVar16 >> 0x38),
                            CONCAT16((byte)((ulong)uVar20 >> 0x30) ^ (byte)((ulong)uVar16 >> 0x30),
                                     CONCAT15((byte)((ulong)uVar20 >> 0x28) ^
                                              (byte)((ulong)uVar16 >> 0x28),
                                              CONCAT14((byte)((ulong)uVar20 >> 0x20) ^
                                                       (byte)((ulong)uVar16 >> 0x20),
                                                       CONCAT13((byte)((ulong)uVar20 >> 0x18) ^
                                                                (byte)((ulong)uVar16 >> 0x18),
                                                                CONCAT12((byte)((ulong)uVar20 >>
                                                                               0x10) ^
                                                                         (byte)((ulong)uVar16 >>
                                                                               0x10),
                                                                         CONCAT11((byte)((ulong)
                                                  uVar20 >> 8) ^ (byte)((ulong)uVar16 >> 8),
                                                  (byte)uVar20 ^ (byte)uVar16)))))));
              *(ulong *)pbVar9 =
                   CONCAT17((byte)((ulong)uVar19 >> 0x38) ^ (byte)((ulong)uVar15 >> 0x38),
                            CONCAT16((byte)((ulong)uVar19 >> 0x30) ^ (byte)((ulong)uVar15 >> 0x30),
                                     CONCAT15((byte)((ulong)uVar19 >> 0x28) ^
                                              (byte)((ulong)uVar15 >> 0x28),
                                              CONCAT14((byte)((ulong)uVar19 >> 0x20) ^
                                                       (byte)((ulong)uVar15 >> 0x20),
                                                       CONCAT13((byte)((ulong)uVar19 >> 0x18) ^
                                                                (byte)((ulong)uVar15 >> 0x18),
                                                                CONCAT12((byte)((ulong)uVar19 >>
                                                                               0x10) ^
                                                                         (byte)((ulong)uVar15 >>
                                                                               0x10),
                                                                         CONCAT11((byte)((ulong)
                                                  uVar19 >> 8) ^ (byte)((ulong)uVar15 >> 8),
                                                  (byte)uVar19 ^ (byte)uVar15)))))));
              pbVar9 = pbVar9 + 0x20;
            } while (uVar11 != 0);
            if (uVar13 == uVar12) goto LAB_00ad8de8;
          }
          lVar8 = uVar12 - uVar13;
          pbVar9 = d + uVar13;
          do {
            pbVar7 = pbVar7 + 1;
            lVar8 = lVar8 + -1;
            *pbVar7 = *pbVar7 ^ *pbVar9;
            pbVar9 = pbVar9 + 1;
          } while (lVar8 != 0);
        }
LAB_00ad8de8:
        if (uVar1 != 0) {
          *mask = *mask & (byte)(0xff >> (ulong)(8 - uVar1 & 0x1f));
        }
        iVar4 = 1;
        mask[(long)iVar5 + -1] = 0xbc;
        goto LAB_00ad8cd4;
      }
    }
  }
  iVar4 = 0;
LAB_00ad8cd4:
  EVP_MD_CTX_free(ctx);
  CRYPTO_clear_free(d,(long)sLen,"crypto/rsa/rsa_pss.c",0xfc);
  return iVar4;
}

