/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a472d4
 */

undefined8
ossl_c448_ed448_verify
          (undefined8 param_1,void *param_2,void *param_3,void *param_4,size_t param_5,
          undefined4 param_6,undefined8 param_7,undefined1 param_8,undefined8 param_9)

{
  byte bVar1;
  bool bVar2;
  int iVar3;
  undefined8 uVar4;
  EVP_MD_CTX *ctx;
  long lVar5;
  undefined1 auStack_320 [120];
  undefined1 auStack_2a8 [56];
  undefined1 auStack_270 [256];
  undefined1 auStack_170 [272];
  
  lVar5 = 0;
  while( true ) {
    bVar1 = *(byte *)((long)param_2 + lVar5 + 0x71);
    if ((byte)(&DAT_002a7e9f)[lVar5] < bVar1) {
      return 0;
    }
    if (bVar1 < (byte)(&DAT_002a7e9f)[lVar5]) break;
    bVar2 = lVar5 == -0x38;
    lVar5 = lVar5 + -1;
    if (bVar2) {
      return 0;
    }
  }
  uVar4 = ossl_curve448_point_decode_like_eddsa_and_mul_by_ratio(auStack_170,param_3);
  if ((int)uVar4 != -1) {
    return uVar4;
  }
  uVar4 = ossl_curve448_point_decode_like_eddsa_and_mul_by_ratio(auStack_270,param_2);
  if ((int)uVar4 != -1) {
    return uVar4;
  }
  ctx = (EVP_MD_CTX *)EVP_MD_CTX_new();
  if ((((ctx == (EVP_MD_CTX *)0x0) ||
       (iVar3 = FUN_00a471b0(param_1,ctx,param_6,param_7,param_8,param_9), iVar3 == 0)) ||
      (iVar3 = EVP_DigestUpdate(ctx,param_2,0x39), iVar3 == 0)) ||
     (((iVar3 = EVP_DigestUpdate(ctx,param_3,0x39), iVar3 == 0 ||
       (iVar3 = EVP_DigestUpdate(ctx,param_4,param_5), iVar3 == 0)) ||
      (iVar3 = EVP_DigestFinalXOF(ctx,auStack_320,0x72), iVar3 == 0)))) {
    EVP_MD_CTX_free(ctx);
    return 0;
  }
  EVP_MD_CTX_free(ctx);
  ossl_curve448_scalar_decode_long(auStack_2a8,auStack_320,0x72);
  OPENSSL_cleanse(auStack_320,0x72);
  ossl_curve448_scalar_sub(auStack_2a8,ossl_curve448_scalar_zero,auStack_2a8);
  ossl_curve448_scalar_decode_long(auStack_320,(long)param_2 + 0x39,0x39);
  ossl_curve448_base_double_scalarmul_non_secret(auStack_170,auStack_320,auStack_170,auStack_2a8);
  uVar4 = ossl_curve448_point_eq(auStack_170,auStack_270);
  return uVar4;
}

