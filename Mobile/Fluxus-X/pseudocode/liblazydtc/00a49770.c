/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a49770
 */

void ossl_x448_derive_public_key(undefined8 param_1,ulong *param_2)

{
  undefined1 auStack_340 [264];
  undefined1 auStack_238 [56];
  ulong local_200;
  ulong uStack_1f8;
  ulong local_1f0;
  ulong uStack_1e8;
  ulong local_1e0;
  ulong uStack_1d8;
  ulong local_1d0;
  undefined1 auStack_1c0 [64];
  undefined1 auStack_180 [64];
  undefined1 auStack_140 [64];
  undefined8 local_100;
  undefined8 uStack_f8;
  undefined8 uStack_f0;
  undefined8 uStack_e8;
  undefined8 local_e0;
  undefined8 uStack_d8;
  undefined8 uStack_d0;
  undefined8 uStack_c8;
  undefined8 local_c0;
  undefined8 uStack_b8;
  undefined8 uStack_b0;
  undefined8 uStack_a8;
  undefined8 local_a0;
  undefined8 uStack_98;
  undefined8 uStack_90;
  undefined8 uStack_88;
  undefined1 auStack_80 [64];
  
  uStack_1f8 = param_2[1];
  uStack_1d8 = param_2[5];
  local_1e0 = param_2[4];
  uStack_1e8 = param_2[3];
  local_1f0 = param_2[2];
  local_200 = *param_2 & 0xfffffffffffffffc;
  local_1d0 = param_2[6] | 0x8000000000000000;
  ossl_curve448_scalar_decode_long(auStack_238,&local_200,0x38);
  ossl_curve448_scalar_halve(auStack_238,auStack_238);
  ossl_curve448_precomputed_scalarmul(auStack_340,ossl_curve448_precomputed_base,auStack_238);
  memcpy(auStack_1c0,auStack_340,0x100);
  gf_sqr(auStack_80,auStack_1c0);
  gf_isr(&local_c0,auStack_80);
  gf_sqr(auStack_80,&local_c0);
  gf_mul(&local_c0,auStack_80,auStack_1c0);
  uStack_d8 = uStack_98;
  local_e0 = local_a0;
  uStack_c8 = uStack_88;
  uStack_d0 = uStack_90;
  uStack_f8 = uStack_b8;
  local_100 = local_c0;
  uStack_e8 = uStack_a8;
  uStack_f0 = uStack_b0;
  gf_mul(auStack_140,&local_100,auStack_180);
  gf_sqr(auStack_180,auStack_140);
  gf_serialize(param_1,auStack_180,1);
  OPENSSL_cleanse(auStack_1c0,0x100);
  OPENSSL_cleanse(auStack_340,0x100);
  return;
}

