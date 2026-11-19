/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a487a8
 */

uint ossl_curve448_point_decode_like_eddsa_and_mul_by_ratio(ulong *param_1,undefined8 *param_2)

{
  ulong *puVar1;
  ulong *puVar2;
  ulong *puVar3;
  ulong uVar4;
  uint uVar5;
  uint uVar6;
  ulong uVar7;
  ulong uVar8;
  ulong uVar9;
  undefined1 auStack_1b0 [64];
  undefined1 auStack_170 [64];
  ulong local_130 [8];
  undefined8 local_f0;
  undefined8 uStack_e8;
  undefined8 local_e0;
  undefined8 uStack_d8;
  undefined8 uStack_d0;
  undefined1 uStack_c8;
  undefined7 local_c7;
  undefined1 uStack_c0;
  ulong uStack_bf;
  ulong local_b0;
  ulong local_a8;
  ulong local_a0;
  ulong local_98;
  ulong local_90;
  ulong local_88;
  ulong local_80;
  ulong local_78;
  
  uVar9 = *(ulong *)((long)param_2 + 0x31);
  puVar1 = param_1 + 8;
  uStack_c0 = (undefined1)((ulong)*(undefined8 *)((long)param_2 + 0x29) >> 0x38);
  uStack_d0 = param_2[4];
  uStack_c8 = (undefined1)param_2[5];
  local_c7 = (undefined7)((ulong)param_2[5] >> 8);
  uStack_d8 = param_2[3];
  local_e0 = param_2[2];
  uStack_e8 = param_2[1];
  local_f0 = *param_2;
  uStack_bf = uVar9 & 0x7fffffffffffffff;
  uVar5 = gf_deserialize(puVar1,&local_f0,1,0);
  uVar4 = uStack_bf >> 0x38;
  gf_sqr(param_1,puVar1);
  puVar2 = param_1 + 0x10;
  gf_sub(puVar2,&DAT_00760a00,param_1);
  puVar3 = param_1 + 0x18;
  gf_mulw_unsigned(puVar3,param_1,0x98a9);
  gf_sub(puVar3,&DAT_00760980,puVar3);
  gf_sub(puVar3,&DAT_00760a00,puVar3);
  gf_mul(param_1,puVar2,puVar3);
  uVar6 = gf_isr(puVar3,param_1);
  gf_mul(param_1,puVar3,puVar2);
  uVar7 = gf_lobit(param_1);
  uVar9 = (long)((uVar9 >> 0x38 & 0x80) - 1) >> 0x3f;
  uVar8 = uVar7 ^ uVar9;
  uVar7 = uVar7 ^ uVar9 ^ 0xffffffffffffffff;
  gf_sub(&local_b0,&DAT_00760980,param_1);
  *param_1 = uVar8 & *param_1 | uVar7 & local_b0;
  param_1[1] = uVar8 & param_1[1] | uVar7 & local_a8;
  param_1[2] = uVar8 & param_1[2] | uVar7 & local_a0;
  param_1[3] = uVar8 & param_1[3] | uVar7 & local_98;
  param_1[4] = uVar8 & param_1[4] | uVar7 & local_90;
  param_1[5] = uVar8 & param_1[5] | uVar7 & local_88;
  param_1[6] = uVar8 & param_1[6] | uVar7 & local_80;
  param_1[0x15] = 0;
  param_1[0x14] = 0;
  param_1[0x17] = 0;
  param_1[0x16] = 0;
  param_1[7] = uVar8 & param_1[7] | uVar7 & local_78;
  param_1[0x11] = 0;
  param_1[0x10] = 1;
  param_1[0x13] = 0;
  param_1[0x12] = 0;
  local_130[0] = uVar8;
  gf_sqr(auStack_170,param_1);
  gf_sqr(&local_b0,puVar1);
  gf_add(auStack_1b0,auStack_170,&local_b0);
  gf_add(puVar3,puVar1,param_1);
  gf_sqr(local_130,puVar3);
  gf_sub(local_130,local_130,auStack_1b0);
  gf_sub(puVar3,&local_b0,auStack_170);
  gf_sqr(param_1,puVar2);
  gf_add(puVar2,param_1,param_1);
  gf_sub(&local_b0,puVar2,auStack_1b0);
  gf_mul(param_1,&local_b0,local_130);
  gf_mul(puVar2,puVar3,&local_b0);
  gf_mul(puVar1,puVar3,auStack_1b0);
  gf_mul(puVar3,local_130,auStack_1b0);
  OPENSSL_cleanse(&local_b0,0x40);
  OPENSSL_cleanse(local_130,0x40);
  OPENSSL_cleanse(auStack_170,0x40);
  OPENSSL_cleanse(auStack_1b0,0x40);
  OPENSSL_cleanse(&local_f0,0x39);
  return (uint)((long)(uVar4 - 1) >> 0x3f) & uVar5 & uVar6;
}

