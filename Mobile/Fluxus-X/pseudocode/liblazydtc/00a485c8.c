/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a485c8
 */

void ossl_curve448_point_mul_by_ratio_and_encode_like_eddsa(long param_1,void *param_2)

{
  byte bVar1;
  undefined1 auStack_2b0 [64];
  undefined1 auStack_270 [64];
  undefined1 auStack_230 [128];
  undefined1 auStack_1b0 [64];
  undefined8 local_170;
  undefined8 uStack_168;
  undefined8 uStack_160;
  undefined8 uStack_158;
  undefined8 local_150;
  undefined8 uStack_148;
  undefined8 uStack_140;
  undefined8 uStack_138;
  undefined1 auStack_130 [64];
  undefined1 auStack_f0 [64];
  undefined8 local_b0;
  undefined8 uStack_a8;
  undefined8 uStack_a0;
  undefined8 uStack_98;
  undefined8 local_90;
  undefined8 uStack_88;
  undefined8 uStack_80;
  undefined8 uStack_78;
  undefined1 auStack_70 [64];
  
  memcpy(auStack_2b0,param_2,0x100);
  gf_sqr(auStack_f0,auStack_2b0);
  gf_sqr(auStack_1b0,auStack_270);
  gf_add(auStack_70,auStack_f0,auStack_1b0);
  gf_add(&local_170,auStack_270,auStack_2b0);
  gf_sqr(auStack_130,&local_170);
  gf_sub(auStack_130,auStack_130,auStack_70);
  gf_sub(&local_170,auStack_1b0,auStack_f0);
  gf_sqr(auStack_f0,auStack_230);
  gf_add(auStack_1b0,auStack_f0,auStack_f0);
  gf_sub(auStack_1b0,auStack_1b0,&local_170);
  gf_mul(auStack_f0,auStack_1b0,auStack_130);
  gf_mul(auStack_130,&local_170,auStack_70);
  gf_mul(&local_170,auStack_70,auStack_1b0);
  OPENSSL_cleanse(auStack_70,0x40);
  gf_sqr(auStack_70,&local_170);
  gf_isr(&local_b0,auStack_70);
  gf_sqr(auStack_70,&local_b0);
  gf_mul(&local_b0,auStack_70,&local_170);
  uStack_148 = uStack_88;
  local_150 = local_90;
  uStack_138 = uStack_78;
  uStack_140 = uStack_80;
  uStack_168 = uStack_a8;
  local_170 = local_b0;
  uStack_158 = uStack_98;
  uStack_160 = uStack_a0;
  gf_mul(auStack_1b0,auStack_f0,&local_170);
  gf_mul(auStack_f0,auStack_130,&local_170);
  *(undefined1 *)(param_1 + 0x38) = 0;
  gf_serialize(param_1,auStack_f0,1);
  bVar1 = gf_lobit(auStack_1b0);
  *(byte *)(param_1 + 0x38) = bVar1 & 0x80 | *(byte *)(param_1 + 0x38);
  OPENSSL_cleanse(auStack_f0,0x40);
  OPENSSL_cleanse(auStack_130,0x40);
  OPENSSL_cleanse(&local_170,0x40);
  OPENSSL_cleanse(auStack_1b0,0x40);
  OPENSSL_cleanse(auStack_2b0,0x100);
  return;
}

