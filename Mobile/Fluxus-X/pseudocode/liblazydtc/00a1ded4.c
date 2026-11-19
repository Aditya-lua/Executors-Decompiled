/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a1ded4
 */

undefined8
ossl_bn_gen_dsa_nonce_fixed_top
          (BIGNUM *param_1,BIGNUM *param_2,undefined8 param_3,void *param_4,size_t param_5,
          undefined8 param_6)

{
  uint num;
  int iVar1;
  int iVar2;
  EVP_MD_CTX *ctx;
  undefined8 uVar3;
  uchar *s;
  EVP_MD *type;
  BIGNUM *pBVar4;
  uint uVar5;
  uint uVar6;
  uint uVar7;
  char local_14c [4];
  undefined1 auStack_148 [96];
  uchar auStack_e8 [64];
  undefined1 auStack_a8 [72];
  
  ctx = (EVP_MD_CTX *)EVP_MD_CTX_new();
  iVar1 = BN_num_bits(param_2);
  iVar2 = iVar1 + 0xe;
  if (-1 < iVar1 + 7) {
    iVar2 = iVar1 + 7;
  }
  num = (iVar2 >> 3) + 1;
  uVar3 = ossl_bn_get_libctx(param_6);
  if (ctx == (EVP_MD_CTX *)0x0) {
    s = (uchar *)0x0;
  }
  else {
    s = CRYPTO_malloc(num,"crypto/bn/bn_rand.c",0x142);
    if (s != (uchar *)0x0) {
      *s = 0xff;
      iVar2 = BN_bn2binpad(param_3,auStack_148,0x60);
      if (-1 < iVar2) {
        type = (EVP_MD *)EVP_MD_fetch(uVar3,"SHA512",0);
        if (type == (EVP_MD *)0x0) {
          ERR_new();
          ERR_set_debug("crypto/bn/bn_rand.c",0x155,"ossl_bn_gen_dsa_nonce_fixed_top");
          uVar3 = 0x78;
        }
        else {
          uVar6 = 0;
          do {
            local_14c[0] = '\0';
            if (1 < num) {
              uVar7 = 1;
              do {
                iVar2 = RAND_priv_bytes_ex(uVar3,auStack_a8,0x40,0);
                if ((((iVar2 < 1) || (iVar2 = EVP_DigestInit_ex(ctx,type,(ENGINE *)0x0), iVar2 == 0)
                     ) || (iVar2 = EVP_DigestUpdate(ctx,local_14c,1), iVar2 == 0)) ||
                   (((iVar2 = EVP_DigestUpdate(ctx,auStack_148,0x60), iVar2 == 0 ||
                     (iVar2 = EVP_DigestUpdate(ctx,param_4,param_5), iVar2 == 0)) ||
                    ((iVar2 = EVP_DigestUpdate(ctx,auStack_a8,0x40), iVar2 == 0 ||
                     (iVar2 = EVP_DigestFinal_ex(ctx,auStack_e8,(uint *)0x0), iVar2 == 0))))))
                goto LAB_00a1e160;
                uVar5 = num - uVar7;
                if (0x3f < uVar5) {
                  uVar5 = 0x40;
                }
                memcpy(s + uVar7,auStack_e8,(ulong)uVar5);
                uVar7 = uVar5 + uVar7;
                local_14c[0] = local_14c[0] + '\x01';
              } while (uVar7 < num);
            }
            pBVar4 = BN_bin2bn(s,num,param_1);
            if (pBVar4 == (BIGNUM *)0x0) goto LAB_00a1e160;
            BN_set_flags(param_1,4);
            iVar2 = BN_num_bits(param_2);
            ossl_bn_mask_bits_fixed_top(param_1,iVar2);
            iVar2 = BN_ucmp(param_1,param_2);
            if (iVar2 < 0) {
              uVar3 = 1;
              goto LAB_00a1e164;
            }
            uVar6 = uVar6 + 1;
          } while (uVar6 < 0x40);
          ERR_new();
          ERR_set_debug("crypto/bn/bn_rand.c",0x183,"ossl_bn_gen_dsa_nonce_fixed_top");
          uVar3 = 0xc0103;
        }
        ERR_set_error(3,uVar3,0);
LAB_00a1e160:
        uVar3 = 0;
        goto LAB_00a1e164;
      }
      ERR_new();
      ERR_set_debug("crypto/bn/bn_rand.c",0x14f,"ossl_bn_gen_dsa_nonce_fixed_top");
      ERR_set_error(3,0x75,0);
    }
  }
  uVar3 = 0;
  type = (EVP_MD *)0x0;
LAB_00a1e164:
  EVP_MD_CTX_free(ctx);
  EVP_MD_free(type);
  CRYPTO_clear_free(s,num,"crypto/bn/bn_rand.c",0x188);
  OPENSSL_cleanse(auStack_e8,0x40);
  OPENSSL_cleanse(auStack_a8,0x40);
  OPENSSL_cleanse(auStack_148,0x60);
  return uVar3;
}

