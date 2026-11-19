/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a47c54
 */

void ossl_curve448_precomputed_scalarmul(long param_1,long param_2,undefined8 param_3)

{
  uint uVar1;
  uint uVar2;
  long lVar3;
  ulong uVar4;
  long lVar5;
  ulong uVar6;
  long lVar7;
  long lVar8;
  long lVar9;
  long lVar10;
  ulong local_1a8 [7];
  ulong local_170;
  ulong local_168;
  ulong local_160;
  ulong local_158;
  ulong local_150;
  ulong local_148;
  ulong local_140;
  ulong local_138;
  ulong local_130;
  ulong local_128;
  ulong local_120;
  ulong local_118;
  ulong local_110;
  ulong local_108;
  ulong local_100;
  ulong local_f8;
  ulong local_f0;
  ulong local_e8;
  ulong local_e0;
  ulong local_d8;
  ulong local_d0;
  ulong local_c8;
  ulong local_c0;
  ulong local_b8;
  uint local_b0;
  undefined4 uStack_ac;
  ulong local_a8;
  ulong local_a0;
  ulong local_98;
  ulong local_90;
  ulong local_88;
  ulong local_80;
  ulong local_78;
  ulong local_70;
  
  ossl_curve448_scalar_add(local_1a8,param_3,&DAT_007609c0);
  ossl_curve448_scalar_halve(local_1a8,local_1a8);
  lVar9 = 0x12;
  do {
    if (lVar9 != 0x12) {
      FUN_00a4761c(param_1,param_1,0);
    }
    lVar8 = 0;
    lVar7 = lVar9 + -1;
    do {
      uVar4 = lVar7 + lVar8 * 0x5a;
      uVar6 = uVar4 + 0x48;
      uVar2 = (uint)(local_1a8[uVar4 >> 6 & 0x3ffffff] >> (uVar4 & 0x3f)) & 1 |
              ((uint)(local_1a8[uVar4 + 0x12 >> 6 & 0x3ffffff] >> (uVar4 + 0x12 & 0x3f)) & 1) << 1 |
              ((uint)(local_1a8[uVar4 + 0x24 >> 6 & 0x3ffffff] >> (uVar4 + 0x24 & 0x3f)) & 1) << 2 |
              ((uint)(local_1a8[uVar4 + 0x36 >> 6 & 0x3ffffff] >> (uVar4 + 0x36 & 0x3f)) & 1) << 3;
      if (uVar6 < 0x1be) {
        uVar2 = uVar2 | ((uint)(local_1a8[uVar6 >> 6 & 0x3ffffff] >> (uVar6 & 0x3f)) & 1) << 4;
      }
      uVar1 = ((int)uVar2 >> 4) - 1;
      lVar10 = param_2 + lVar8 * 0xc00;
      memset(&local_170,0,0xc0);
      lVar3 = 0;
      uVar6 = (ulong)((uVar1 ^ uVar2) & 0xf);
      do {
        uVar2 = (uint)(uVar6 - 1 >> 0x20) & ((uint)(uVar6 >> 0x20) ^ 0xffffffff);
        lVar5 = 0;
        do {
          local_b0 = ~((int)uVar2 >> 0x1f & 0xffU);
          *(byte *)((long)local_1a8 + lVar5 + 0x38) =
               *(byte *)((long)local_1a8 + lVar5 + 0x38) |
               *(byte *)(lVar10 + lVar5) & (byte)((int)uVar2 >> 0x1f);
          lVar5 = lVar5 + 1;
        } while (lVar5 != 0xc0);
        lVar3 = lVar3 + 1;
        lVar10 = lVar10 + 0xc0;
        uVar6 = uVar6 - 1;
      } while (lVar3 != 0x10);
      uVar4 = (ulong)(int)uVar1;
      uVar6 = (local_130 ^ local_170) & uVar4;
      local_170 = uVar6 ^ local_170;
      local_130 = uVar6 ^ local_130;
      uVar6 = (local_128 ^ local_168) & uVar4;
      local_168 = uVar6 ^ local_168;
      local_128 = uVar6 ^ local_128;
      uVar6 = (local_120 ^ local_160) & uVar4;
      local_160 = uVar6 ^ local_160;
      local_120 = uVar6 ^ local_120;
      uVar6 = (local_118 ^ local_158) & uVar4;
      local_158 = uVar6 ^ local_158;
      local_118 = uVar6 ^ local_118;
      uVar6 = (local_110 ^ local_150) & uVar4;
      local_150 = uVar6 ^ local_150;
      local_110 = uVar6 ^ local_110;
      uVar6 = (local_108 ^ local_148) & uVar4;
      local_148 = uVar6 ^ local_148;
      local_108 = uVar6 ^ local_108;
      uVar6 = (local_100 ^ local_140) & uVar4;
      local_140 = uVar6 ^ local_140;
      local_100 = uVar6 ^ local_100;
      uVar6 = (local_f8 ^ local_138) & uVar4;
      local_138 = uVar6 ^ local_138;
      local_f8 = uVar6 ^ local_f8;
      gf_sub(&local_b0,&DAT_00760980,&local_f0);
      local_70 = ~uVar4;
      local_f0 = local_70 & local_f0 | uVar4 & CONCAT44(uStack_ac,local_b0);
      local_e8 = local_70 & local_e8 | uVar4 & local_a8;
      local_e0 = local_70 & local_e0 | uVar4 & local_a0;
      local_d8 = local_70 & local_d8 | uVar4 & local_98;
      local_d0 = local_70 & local_d0 | uVar4 & local_90;
      local_c8 = local_70 & local_c8 | uVar4 & local_88;
      local_c0 = local_70 & local_c0 | uVar4 & local_80;
      local_b8 = local_70 & local_b8 | uVar4 & local_78;
      if ((lVar9 == 0x12) && (lVar8 == 0)) {
        gf_add(param_1 + 0x40,&local_130,&local_170);
        gf_sub(param_1,&local_130,&local_170);
        gf_mul(param_1 + 0xc0,param_1 + 0x40,param_1);
        *(undefined8 *)(param_1 + 0xa8) = 0;
        *(undefined8 *)(param_1 + 0xa0) = 0;
        *(undefined8 *)(param_1 + 0xb8) = 0;
        *(undefined8 *)(param_1 + 0xb0) = 0;
        *(undefined8 *)(param_1 + 0x88) = 0;
        *(undefined8 *)(param_1 + 0x80) = 1;
        *(undefined8 *)(param_1 + 0x98) = 0;
        *(undefined8 *)(param_1 + 0x90) = 0;
      }
      else {
        FUN_00a4812c(param_1,&local_170,lVar9 != 1 && lVar8 == 4);
      }
      lVar8 = lVar8 + 1;
    } while (lVar8 != 5);
    lVar9 = lVar7;
  } while (lVar7 != 0);
  OPENSSL_cleanse(&local_170,0xc0);
  OPENSSL_cleanse(local_1a8,0x38);
  return;
}

