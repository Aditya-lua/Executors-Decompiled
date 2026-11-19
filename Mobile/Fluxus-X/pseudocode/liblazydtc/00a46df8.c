/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a46df8
 */

undefined8
ossl_c448_ed448_derive_public_key
          (undefined8 param_1,undefined8 param_2,undefined8 param_3,undefined8 param_4)

{
  undefined8 uVar1;
  undefined1 auStack_1a0 [264];
  undefined1 auStack_98 [60];
  byte local_5c [55];
  byte local_25;
  undefined1 local_24;
  
  uVar1 = FUN_00a46d30(param_1,local_5c,0x39,param_3,param_4);
  if ((int)uVar1 != 0) {
    local_5c[0] = local_5c[0] & 0xfc;
    local_24 = 0;
    local_25 = local_25 | 0x80;
    ossl_curve448_scalar_decode_long(auStack_98,local_5c,0x39);
    ossl_curve448_scalar_halve(auStack_98,auStack_98);
    ossl_curve448_scalar_halve(auStack_98,auStack_98);
    ossl_curve448_precomputed_scalarmul(auStack_1a0,ossl_curve448_precomputed_base,auStack_98);
    ossl_curve448_point_mul_by_ratio_and_encode_like_eddsa(param_2,auStack_1a0);
    ossl_curve448_scalar_destroy(auStack_98);
    ossl_curve448_point_destroy(auStack_1a0);
    OPENSSL_cleanse(local_5c,0x39);
    uVar1 = 0xffffffff;
  }
  return uVar1;
}

