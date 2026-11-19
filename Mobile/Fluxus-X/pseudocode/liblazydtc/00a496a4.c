/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a496a4
 */

void ossl_curve448_point_mul_by_ratio_and_encode_like_x448(undefined8 param_1,void *param_2)

{
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
  
  memcpy(auStack_1c0,param_2,0x100);
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
  return;
}

