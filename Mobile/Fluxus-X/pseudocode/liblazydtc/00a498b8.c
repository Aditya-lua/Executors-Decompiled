/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a498b8
 */

void ossl_curve448_base_double_scalarmul_non_secret
               (void *param_1,undefined8 param_2,long param_3,undefined8 param_4)

{
  bool bVar1;
  undefined1 *puVar2;
  long lVar3;
  undefined8 *puVar4;
  uint uVar5;
  uint uVar6;
  uint uVar7;
  uint uVar8;
  undefined *puVar9;
  ulong uVar10;
  ulong uVar11;
  long lVar12;
  undefined1 auStack_10b0 [64];
  undefined1 auStack_1070 [64];
  undefined1 auStack_1030 [64];
  undefined1 auStack_ff0 [64];
  undefined1 auStack_fb0 [64];
  undefined1 auStack_f70 [64];
  undefined1 auStack_f30 [64];
  undefined1 auStack_ef0 [1600];
  undefined1 auStack_8b0 [8];
  uint local_8a8 [14];
  undefined1 auStack_870 [64];
  undefined1 auStack_830 [64];
  undefined1 auStack_7f0 [432];
  uint local_640 [228];
  undefined1 auStack_2b0 [64];
  undefined1 auStack_270 [64];
  undefined1 auStack_230 [64];
  undefined1 auStack_1f0 [64];
  undefined1 auStack_1b0 [64];
  undefined1 auStack_170 [64];
  undefined8 local_130;
  undefined8 uStack_128;
  undefined8 local_120;
  undefined8 uStack_118;
  undefined8 local_110;
  undefined8 uStack_108;
  undefined8 local_100;
  undefined8 uStack_f8;
  undefined1 auStack_f0 [64];
  undefined8 local_b0;
  undefined8 uStack_a8;
  undefined8 local_a0;
  undefined8 uStack_98;
  undefined8 local_90;
  undefined8 uStack_88;
  undefined8 local_80;
  undefined8 uStack_78;
  
  FUN_00a49f0c(local_8a8,param_2,5);
  FUN_00a49f0c(local_640,param_4,3);
  gf_sub(auStack_10b0,param_3 + 0x40,param_3);
  gf_add(auStack_1070,param_3,param_3 + 0x40);
  gf_mulw_unsigned(auStack_1030,param_3 + 0xc0,0x13154);
  gf_sub(auStack_1030,&DAT_00760980,auStack_1030);
  gf_add(auStack_ff0,param_3 + 0x80,param_3 + 0x80);
  FUN_00a4761c(auStack_1b0,param_3,0);
  gf_sub(auStack_2b0,auStack_170,auStack_1b0);
  gf_add(auStack_270,auStack_1b0,auStack_170);
  gf_mulw_unsigned(auStack_230,auStack_f0,0x13154);
  gf_sub(auStack_230,&DAT_00760980,auStack_230);
  gf_add(auStack_1f0,&local_130,&local_130);
  gf_mul(&local_b0,&local_130,auStack_ff0);
  uStack_f8 = uStack_78;
  local_100 = local_80;
  uStack_108 = uStack_88;
  local_110 = local_90;
  uStack_118 = uStack_98;
  local_120 = local_a0;
  uStack_128 = uStack_a8;
  local_130 = local_b0;
  FUN_00a4812c(auStack_1b0,auStack_10b0,0);
  gf_sub(auStack_fb0,auStack_170,auStack_1b0);
  gf_add(auStack_f70,auStack_1b0,auStack_170);
  gf_mulw_unsigned(auStack_f30,auStack_f0,0x13154);
  gf_sub(auStack_f30,&DAT_00760980,auStack_f30);
  gf_add(auStack_ef0,&local_130,&local_130);
  lVar12 = -0x600;
  do {
    gf_mul(&local_b0,&local_130,auStack_1f0);
    uStack_108 = uStack_88;
    local_110 = local_90;
    uStack_f8 = uStack_78;
    local_100 = local_80;
    uStack_128 = uStack_a8;
    local_130 = local_b0;
    uStack_118 = uStack_98;
    local_120 = local_a0;
    FUN_00a4812c(auStack_1b0,auStack_2b0,0);
    gf_sub(auStack_8b0 + lVar12,auStack_170,auStack_1b0);
    gf_add(auStack_870 + lVar12,auStack_1b0,auStack_170);
    puVar2 = auStack_830 + lVar12;
    gf_mulw_unsigned(puVar2,auStack_f0,0x13154);
    gf_sub(puVar2,&DAT_00760980,puVar2);
    gf_add(auStack_7f0 + lVar12,&local_130,&local_130);
    lVar12 = lVar12 + 0x100;
  } while (lVar12 != 0);
  OPENSSL_cleanse(auStack_1b0,0x100);
  OPENSSL_cleanse(auStack_2b0,0x100);
  if ((int)local_640[0] < 0) {
    memcpy(param_1,ossl_curve448_point_identity,0x100);
  }
  else {
    if ((int)local_8a8[0] < (int)local_640[0]) {
      lVar12 = ((long)((ulong)local_640[1] << 0x20) >> 0x21) * 0x100;
      gf_add(&local_b0,auStack_1070 + lVar12,auStack_10b0 + lVar12);
      lVar3 = (long)param_1 + 0x40;
      gf_sub(lVar3,auStack_1070 + lVar12,auStack_10b0 + lVar12);
      gf_mul((long)param_1 + 0xc0,lVar3,&local_b0);
      puVar2 = auStack_ff0 + lVar12;
      gf_mul(param_1,puVar2,lVar3);
      gf_mul(lVar3,puVar2,&local_b0);
      gf_sqr((long)param_1 + 0x80,puVar2);
      uVar11 = 0;
      uVar10 = 1;
    }
    else if (local_640[0] == local_8a8[0]) {
      lVar12 = ((long)((ulong)local_640[1] << 0x20) >> 0x21) * 0x100;
      gf_add(&local_b0,auStack_1070 + lVar12,auStack_10b0 + lVar12);
      lVar3 = (long)param_1 + 0x40;
      gf_sub(lVar3,auStack_1070 + lVar12,auStack_10b0 + lVar12);
      gf_mul((long)param_1 + 0xc0,lVar3,&local_b0);
      puVar2 = auStack_ff0 + lVar12;
      gf_mul(param_1,puVar2,lVar3);
      gf_mul(lVar3,puVar2,&local_b0);
      gf_sqr((long)param_1 + 0x80,puVar2);
      FUN_00a4812c(param_1,ossl_curve448_wnaf_base + (long)((int)local_8a8[1] >> 1) * 0xc0,
                   local_640[0]);
      uVar10 = 1;
      uVar11 = 1;
    }
    else {
      puVar9 = ossl_curve448_wnaf_base + (long)((int)local_8a8[1] >> 1) * 0xc0;
      gf_add((long)param_1 + 0x40,puVar9 + 0x40,puVar9);
      gf_sub(param_1,puVar9 + 0x40,puVar9);
      gf_mul((long)param_1 + 0xc0,(long)param_1 + 0x40,param_1);
      uVar10 = 0;
      uVar11 = 1;
      *(undefined8 *)((long)param_1 + 0xa8) = 0;
      *(undefined8 *)((long)param_1 + 0xa0) = 0;
      *(undefined8 *)((long)param_1 + 0xb8) = 0;
      *(undefined8 *)((long)param_1 + 0xb0) = 0;
      *(undefined8 *)((long)param_1 + 0x88) = 0;
      *(undefined8 *)((long)param_1 + 0x80) = 1;
      *(undefined8 *)((long)param_1 + 0x98) = 0;
      *(undefined8 *)((long)param_1 + 0x90) = 0;
      local_640[0] = local_8a8[0];
    }
    if (0 < (int)local_640[0]) {
      puVar4 = (undefined8 *)((long)param_1 + 0x80);
      uVar7 = local_640[0];
      do {
        uVar8 = uVar7 - 1;
        uVar5 = *(uint *)((long)local_640 + (-(uVar10 >> 0x1f) & 0xfffffff800000000 | uVar10 << 3));
        uVar6 = *(uint *)((long)local_8a8 + (-(uVar11 >> 0x1f) & 0xfffffff800000000 | uVar11 << 3));
        FUN_00a4761c(param_1,param_1,uVar8 != 0 && (uVar8 != uVar5 && uVar8 != uVar6));
        if (uVar8 == uVar5) {
          uVar5 = local_640[(long)(int)uVar10 * 2 + 1];
          if ((int)uVar5 < 1) {
            lVar12 = ((long)((ulong)-uVar5 << 0x20) >> 0x21) * 0x100;
            gf_mul(&local_b0,puVar4,auStack_ff0 + lVar12);
            *(undefined8 *)((long)param_1 + 0xb8) = uStack_78;
            *(undefined8 *)((long)param_1 + 0xb0) = local_80;
            *(undefined8 *)((long)param_1 + 0xa8) = uStack_88;
            *(undefined8 *)((long)param_1 + 0xa0) = local_90;
            *(undefined8 *)((long)param_1 + 0x98) = uStack_98;
            *(undefined8 *)((long)param_1 + 0x90) = local_a0;
            *(undefined8 *)((long)param_1 + 0x88) = uStack_a8;
            *puVar4 = local_b0;
            FUN_00a4a084(param_1,auStack_10b0 + lVar12,uVar8 != 0 && uVar8 != uVar6);
          }
          else {
            lVar12 = (ulong)(uVar5 >> 1) * 0x100;
            gf_mul(&local_b0,puVar4,auStack_ff0 + lVar12);
            *(undefined8 *)((long)param_1 + 0xb8) = uStack_78;
            *(undefined8 *)((long)param_1 + 0xb0) = local_80;
            *(undefined8 *)((long)param_1 + 0xa8) = uStack_88;
            *(undefined8 *)((long)param_1 + 0xa0) = local_90;
            *(undefined8 *)((long)param_1 + 0x98) = uStack_98;
            *(undefined8 *)((long)param_1 + 0x90) = local_a0;
            *(undefined8 *)((long)param_1 + 0x88) = uStack_a8;
            *puVar4 = local_b0;
            FUN_00a4812c(param_1,auStack_10b0 + lVar12,uVar8 != 0 && uVar8 != uVar6);
          }
          uVar10 = (ulong)((int)uVar10 + 1);
        }
        if (uVar8 == uVar6) {
          uVar5 = local_8a8[(long)(int)uVar11 * 2 + 1];
          if ((int)uVar5 < 1) {
            FUN_00a4a084(param_1,ossl_curve448_wnaf_base + (long)((int)-uVar5 >> 1) * 0xc0,uVar8);
          }
          else {
            FUN_00a4812c(param_1,ossl_curve448_wnaf_base + (ulong)(uVar5 >> 1) * 0xc0,uVar8);
          }
          uVar11 = (ulong)((int)uVar11 + 1);
        }
        bVar1 = 1 < (int)uVar7;
        uVar7 = uVar8;
      } while (bVar1);
    }
    OPENSSL_cleanse(local_640,0x390);
    OPENSSL_cleanse(local_8a8,0x268);
    OPENSSL_cleanse(auStack_10b0,0x800);
  }
  return;
}

