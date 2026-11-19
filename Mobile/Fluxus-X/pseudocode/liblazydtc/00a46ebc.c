/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a46ebc
 */

undefined8
ossl_c448_ed448_sign
          (undefined8 param_1,undefined8 *param_2,undefined8 param_3,void *param_4,void *param_5,
          size_t param_6,undefined4 param_7,undefined8 param_8,undefined8 param_9,
          undefined8 param_10)

{
  int iVar1;
  EVP_MD_CTX *ctx;
  undefined8 uVar2;
  byte local_250 [55];
  byte local_219;
  undefined1 local_218;
  undefined1 auStack_217 [199];
  undefined1 auStack_150 [56];
  undefined8 local_118;
  undefined8 uStack_110;
  undefined8 local_108;
  undefined8 uStack_100;
  undefined8 local_f8;
  undefined1 uStack_f0;
  undefined7 uStack_ef;
  undefined1 local_e8;
  undefined7 uStack_e7;
  undefined1 local_e0;
  undefined1 auStack_d8 [56];
  undefined1 auStack_a0 [64];
  
  ctx = (EVP_MD_CTX *)EVP_MD_CTX_new();
  uStack_f0 = 0;
  uStack_ef = 0;
  local_f8 = 0;
  uStack_100 = 0;
  local_108 = 0;
  local_e0 = 0;
  local_e8 = 0;
  uStack_e7 = 0;
  uStack_110 = 0;
  local_118 = 0;
  if (ctx == (EVP_MD_CTX *)0x0) {
    return 0;
  }
  iVar1 = FUN_00a46d30(param_1,local_250,0x72,param_3,param_10);
  if (iVar1 != 0) {
    local_250[0] = local_250[0] & 0xfc;
    local_219 = local_219 | 0x80;
    local_218 = 0;
    ossl_curve448_scalar_decode_long(auStack_a0,local_250,0x39);
    iVar1 = FUN_00a471b0(param_1,ctx,param_7,param_8,param_9,param_10);
    if (((iVar1 == 0) || (iVar1 = EVP_DigestUpdate(ctx,auStack_217,0x39), iVar1 == 0)) ||
       (iVar1 = EVP_DigestUpdate(ctx,param_5,param_6), iVar1 == 0)) {
      OPENSSL_cleanse(local_250,0x72);
    }
    else {
      OPENSSL_cleanse(local_250,0x72);
      iVar1 = EVP_DigestFinalXOF(ctx,local_250,0x72);
      if (iVar1 != 0) {
        ossl_curve448_scalar_decode_long(auStack_d8,local_250,0x72);
        OPENSSL_cleanse(local_250,0x72);
        ossl_curve448_scalar_halve(auStack_150,auStack_d8);
        ossl_curve448_scalar_halve(auStack_150,auStack_150);
        ossl_curve448_precomputed_scalarmul(local_250,ossl_curve448_precomputed_base,auStack_150);
        ossl_curve448_point_mul_by_ratio_and_encode_like_eddsa(&local_118,local_250);
        ossl_curve448_point_destroy(local_250);
        ossl_curve448_scalar_destroy(auStack_150);
        iVar1 = FUN_00a471b0(param_1,ctx,param_7,param_8,param_9,param_10);
        if (((iVar1 != 0) && (iVar1 = EVP_DigestUpdate(ctx,&local_118,0x39), iVar1 != 0)) &&
           ((iVar1 = EVP_DigestUpdate(ctx,param_4,0x39), iVar1 != 0 &&
            ((iVar1 = EVP_DigestUpdate(ctx,param_5,param_6), iVar1 != 0 &&
             (iVar1 = EVP_DigestFinalXOF(ctx,local_250,0x72), iVar1 != 0)))))) {
          ossl_curve448_scalar_decode_long(auStack_150,local_250,0x72);
          OPENSSL_cleanse(local_250,0x72);
          ossl_curve448_scalar_mul(auStack_150,auStack_150,auStack_a0);
          ossl_curve448_scalar_add(auStack_150,auStack_150,auStack_d8);
          OPENSSL_cleanse(param_2,0x72);
          *(ulong *)((long)param_2 + 0x31) = CONCAT17(local_e0,uStack_e7);
          *(ulong *)((long)param_2 + 0x29) = CONCAT17(local_e8,uStack_ef);
          param_2[5] = CONCAT71(uStack_ef,uStack_f0);
          param_2[4] = local_f8;
          param_2[3] = uStack_100;
          param_2[2] = local_108;
          param_2[1] = uStack_110;
          *param_2 = local_118;
          ossl_curve448_scalar_encode((long)param_2 + 0x39,auStack_150);
          ossl_curve448_scalar_destroy(auStack_a0);
          ossl_curve448_scalar_destroy(auStack_d8);
          ossl_curve448_scalar_destroy(auStack_150);
          uVar2 = 0xffffffff;
          goto LAB_00a47184;
        }
      }
    }
  }
  uVar2 = 0;
LAB_00a47184:
  EVP_MD_CTX_free(ctx);
  return uVar2;
}

