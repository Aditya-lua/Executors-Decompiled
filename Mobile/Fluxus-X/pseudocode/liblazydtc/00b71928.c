/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b71928
 */

void mbedtls_camellia_setkey_enc(undefined4 *param_1,void *param_2,uint param_3)

{
  uint uVar1;
  uint uVar2;
  uint uVar3;
  uint uVar4;
  uint uVar5;
  uint uVar6;
  long lVar7;
  undefined8 uVar8;
  long lVar9;
  long lVar10;
  uint uVar11;
  long lVar12;
  uint local_150 [20];
  uint local_100;
  uint local_fc;
  uint local_f8;
  uint uStack_f4;
  uint local_f0;
  uint uStack_ec;
  uint local_e8;
  uint uStack_e4;
  uint local_e0;
  uint uStack_dc;
  uint local_d8;
  uint uStack_d4;
  undefined8 local_d0;
  undefined8 local_c8;
  undefined8 local_c0;
  undefined8 uStack_b8;
  undefined8 local_b0;
  undefined8 uStack_a8;
  undefined8 local_a0;
  undefined8 uStack_98;
  undefined8 local_88;
  undefined8 uStack_80;
  undefined8 local_78;
  undefined8 local_70;
  undefined8 local_68;
  undefined8 uStack_60;
  undefined8 uStack_58;
  undefined8 uStack_50;
  
  lVar7 = tpidr_el0;
  lVar9 = *(long *)(lVar7 + 0x28);
  uStack_60 = 0;
  local_68 = 0;
  uStack_50 = 0;
  uStack_58 = 0;
  uStack_80 = 0;
  local_88 = 0;
  local_70 = 0;
  local_78 = 0;
  memset(param_1 + 1,0,0x110);
  if ((param_3 == 0x100) || (param_3 == 0xc0)) {
    uVar11 = param_3 >> 3;
    lVar12 = 1;
    *param_1 = 4;
    if (uVar11 != 0) goto LAB_00b719b8;
  }
  else {
    if (param_3 != 0x80) {
      uVar8 = 0xffffffdc;
      goto LAB_00b72154;
    }
    lVar12 = 0;
    *param_1 = 3;
    uVar11 = 0x10;
LAB_00b719b8:
    memcpy(&local_88,param_2,(ulong)uVar11);
  }
  if (param_3 == 0xc0) {
    local_70 = CONCAT17(~(byte)((ulong)local_78 >> 0x38),
                        CONCAT16(~(byte)((ulong)local_78 >> 0x30),
                                 CONCAT15(~(byte)((ulong)local_78 >> 0x28),
                                          CONCAT14(~(byte)((ulong)local_78 >> 0x20),
                                                   CONCAT13(~(byte)((ulong)local_78 >> 0x18),
                                                            CONCAT12(~(byte)((ulong)local_78 >> 0x10
                                                                            ),CONCAT11(~(byte)((
                                                  ulong)local_78 >> 8),~(byte)local_78)))))));
  }
  uStack_b8 = 0x4caa73b2b67ae858;
  local_c0 = 0x3bcc908ba09e667f;
  uStack_a8 = 0xf1d36f1c54ff53a5;
  local_b0 = 0xe94f82bec6ef372f;
  uVar11 = ((uint)local_88 & 0xff00ff00) >> 8 | ((uint)local_88 & 0xff00ff) << 8;
  local_100 = uVar11 >> 0x10 | uVar11 << 0x10;
  uVar11 = (local_88._4_4_ & 0xff00ff00) >> 8 | (local_88._4_4_ & 0xff00ff) << 8;
  local_fc = uVar11 >> 0x10 | uVar11 << 0x10;
  uVar11 = ((uint)uStack_80 & 0xff00ff00) >> 8 | ((uint)uStack_80 & 0xff00ff) << 8;
  local_f8 = uVar11 >> 0x10 | uVar11 << 0x10;
  uVar11 = (uStack_80._4_4_ & 0xff00ff00) >> 8 | (uStack_80._4_4_ & 0xff00ff) << 8;
  uStack_f4 = uVar11 >> 0x10 | uVar11 << 0x10;
  uVar11 = (((uint)local_78 ^ (uint)local_88) & 0xff00ff00) >> 8 |
           (((uint)local_78 ^ (uint)local_88) & 0xff00ff) << 8;
  uVar2 = uVar11 >> 0x10 | uVar11 << 0x10;
  uVar11 = ((uint)local_78 & 0xff00ff00) >> 8 | ((uint)local_78 & 0xff00ff) << 8;
  local_f0 = uVar11 >> 0x10 | uVar11 << 0x10;
  uVar11 = (local_78._4_4_ & 0xff00ff00) >> 8 | (local_78._4_4_ & 0xff00ff) << 8;
  uStack_ec = uVar11 >> 0x10 | uVar11 << 0x10;
  uVar11 = ((local_78._4_4_ ^ local_88._4_4_) & 0xff00ff00) >> 8 |
           ((local_78._4_4_ ^ local_88._4_4_) & 0xff00ff) << 8;
  uVar3 = uVar11 >> 0x10 | uVar11 << 0x10;
  uVar4 = (((uint)local_70 ^ (uint)uStack_80) & 0xff00ff00) >> 8 |
          (((uint)local_70 ^ (uint)uStack_80) & 0xff00ff) << 8;
  uVar11 = uVar2 ^ 0xa09e667f;
  uVar5 = ((uint)local_70 & 0xff00ff00) >> 8 | ((uint)local_70 & 0xff00ff) << 8;
  local_e8 = uVar5 >> 0x10 | uVar5 << 0x10;
  uVar5 = (local_70._4_4_ & 0xff00ff00) >> 8 | (local_70._4_4_ & 0xff00ff) << 8;
  uStack_e4 = uVar5 >> 0x10 | uVar5 << 0x10;
  uVar6 = ((local_70._4_4_ ^ uStack_80._4_4_) & 0xff00ff00) >> 8 |
          ((local_70._4_4_ ^ uStack_80._4_4_) & 0xff00ff) << 8;
  uVar5 = uVar3 ^ 0x3bcc908b;
  uVar1 = ((uint)(byte)(&DAT_0077e310)[uVar5 >> 0x18] |
          ((uint)(byte)(&DAT_0077e410)[uVar5 >> 0x10 & 0xff] << 0x10 |
           (uint)(byte)(&DAT_0077e510)[uVar5 >> 8 & 0xff] << 8 |
          (uint)(byte)(&DAT_0077e210)[uVar5 & 0xff]) << 8) ^
          ((uint)(byte)(&DAT_0077e210)[uVar11 >> 0x18] << 0x18 |
           (uint)(byte)(&DAT_0077e310)[uVar11 >> 0x10 & 0xff] << 0x10 |
           (uint)(byte)(&DAT_0077e410)[uVar11 >> 8 & 0xff] << 8 |
          (uint)(byte)(&DAT_0077e510)[uVar11 & 0xff]);
  uVar11 = ((uint)(byte)(&DAT_0077e310)[uVar5 >> 0x18] << 0x18 |
            (uint)(byte)(&DAT_0077e410)[uVar5 >> 0x10 & 0xff] << 0x10 |
            (uint)(byte)(&DAT_0077e510)[uVar5 >> 8 & 0xff] << 8 |
           (uint)(byte)(&DAT_0077e210)[uVar5 & 0xff]) ^ (uVar1 >> 0x10 | uVar1 << 0x10);
  uVar1 = uVar1 ^ (uVar11 >> 8 | uVar11 << 0x18);
  uVar11 = uVar11 ^ (uVar4 >> 0x10 | uVar4 << 0x10) ^ (uVar1 >> 8 | uVar1 << 0x18);
  uVar1 = uVar1 ^ (uVar6 >> 0x10 | uVar6 << 0x10);
  uVar5 = uVar11 ^ 0xb67ae858;
  uVar4 = uVar1 ^ 0x4caa73b2;
  uVar6 = ((uint)(byte)(&DAT_0077e310)[uVar4 >> 0x18] |
          ((uint)(byte)(&DAT_0077e410)[uVar4 >> 0x10 & 0xff] << 0x10 |
           (uint)(byte)(&DAT_0077e510)[uVar4 >> 8 & 0xff] << 8 |
          (uint)(byte)(&DAT_0077e210)[uVar4 & 0xff]) << 8) ^
          ((uint)(byte)(&DAT_0077e210)[uVar5 >> 0x18] << 0x18 |
           (uint)(byte)(&DAT_0077e310)[uVar5 >> 0x10 & 0xff] << 0x10 |
           (uint)(byte)(&DAT_0077e410)[uVar5 >> 8 & 0xff] << 8 |
          (uint)(byte)(&DAT_0077e510)[uVar5 & 0xff]);
  uVar5 = ((uint)(byte)(&DAT_0077e310)[uVar4 >> 0x18] << 0x18 |
           (uint)(byte)(&DAT_0077e410)[uVar4 >> 0x10 & 0xff] << 0x10 |
           (uint)(byte)(&DAT_0077e510)[uVar4 >> 8 & 0xff] << 8 |
          (uint)(byte)(&DAT_0077e210)[uVar4 & 0xff]) ^ (uVar6 >> 0x10 | uVar6 << 0x10);
  uVar6 = uVar6 ^ (uVar5 >> 8 | uVar5 << 0x18);
  uVar5 = uVar5 ^ uVar2 ^ (uVar6 >> 8 | uVar6 << 0x18) ^ local_100;
  uVar4 = uVar5 ^ 0xc6ef372f;
  uVar6 = uVar6 ^ uVar3 ^ local_fc;
  uVar2 = uVar6 ^ 0xe94f82be;
  uStack_d4 = ((uint)(byte)(&DAT_0077e310)[uVar2 >> 0x18] |
              ((uint)(byte)(&DAT_0077e410)[uVar2 >> 0x10 & 0xff] << 0x10 |
               (uint)(byte)(&DAT_0077e510)[uVar2 >> 8 & 0xff] << 8 |
              (uint)(byte)(&DAT_0077e210)[uVar2 & 0xff]) << 8) ^
              ((uint)(byte)(&DAT_0077e210)[uVar4 >> 0x18] << 0x18 |
               (uint)(byte)(&DAT_0077e310)[uVar4 >> 0x10 & 0xff] << 0x10 |
               (uint)(byte)(&DAT_0077e410)[uVar4 >> 8 & 0xff] << 8 |
              (uint)(byte)(&DAT_0077e510)[uVar4 & 0xff]);
  uVar4 = ((uint)(byte)(&DAT_0077e310)[uVar2 >> 0x18] << 0x18 |
           (uint)(byte)(&DAT_0077e410)[uVar2 >> 0x10 & 0xff] << 0x10 |
           (uint)(byte)(&DAT_0077e510)[uVar2 >> 8 & 0xff] << 8 |
          (uint)(byte)(&DAT_0077e210)[uVar2 & 0xff]) ^ (uStack_d4 >> 0x10 | uStack_d4 << 0x10);
  uStack_d4 = uStack_d4 ^ (uVar4 >> 8 | uVar4 << 0x18);
  local_d8 = uVar4 ^ uVar11 ^ local_f8 ^ (uStack_d4 >> 8 | uStack_d4 << 0x18);
  uStack_d4 = uStack_d4 ^ uVar1 ^ uStack_f4;
  uVar11 = local_d8 ^ 0x54ff53a5;
  uVar1 = uStack_d4 ^ 0xf1d36f1c;
  uStack_dc = ((uint)(byte)(&DAT_0077e310)[uVar1 >> 0x18] |
              ((uint)(byte)(&DAT_0077e410)[uVar1 >> 0x10 & 0xff] << 0x10 |
               (uint)(byte)(&DAT_0077e510)[uVar1 >> 8 & 0xff] << 8 |
              (uint)(byte)(&DAT_0077e210)[uVar1 & 0xff]) << 8) ^
              ((uint)(byte)(&DAT_0077e210)[uVar11 >> 0x18] << 0x18 |
               (uint)(byte)(&DAT_0077e310)[uVar11 >> 0x10 & 0xff] << 0x10 |
               (uint)(byte)(&DAT_0077e410)[uVar11 >> 8 & 0xff] << 8 |
              (uint)(byte)(&DAT_0077e510)[uVar11 & 0xff]);
  uVar11 = ((uint)(byte)(&DAT_0077e310)[uVar1 >> 0x18] << 0x18 |
            (uint)(byte)(&DAT_0077e410)[uVar1 >> 0x10 & 0xff] << 0x10 |
            (uint)(byte)(&DAT_0077e510)[uVar1 >> 8 & 0xff] << 8 |
           (uint)(byte)(&DAT_0077e210)[uVar1 & 0xff]) ^ (uStack_dc >> 0x10 | uStack_dc << 0x10);
  uStack_dc = uStack_dc ^ (uVar11 >> 8 | uVar11 << 0x18);
  local_e0 = uVar11 ^ uVar5 ^ (uStack_dc >> 8 | uStack_dc << 0x18);
  uStack_dc = uStack_dc ^ uVar6;
  local_d0 = 0;
  local_c8 = 0;
  uStack_98 = 0xb3e6c1fdb05688c2;
  local_a0 = 0xde682d1d10e527fa;
  if (0x80 < param_3) {
    uVar11 = local_e0 ^ local_f0 ^ 0x10e527fa;
    uVar5 = uStack_dc ^ uStack_ec ^ 0xde682d1d;
    uVar1 = ((uint)(byte)(&DAT_0077e310)[uVar5 >> 0x18] |
            ((uint)(byte)(&DAT_0077e410)[uVar5 >> 0x10 & 0xff] << 0x10 |
             (uint)(byte)(&DAT_0077e510)[uVar5 >> 8 & 0xff] << 8 |
            (uint)(byte)(&DAT_0077e210)[uVar5 & 0xff]) << 8) ^
            ((uint)(byte)(&DAT_0077e210)[uVar11 >> 0x18] << 0x18 |
             (uint)(byte)(&DAT_0077e310)[uVar11 >> 0x10 & 0xff] << 0x10 |
             (uint)(byte)(&DAT_0077e410)[uVar11 >> 8 & 0xff] << 8 |
            (uint)(byte)(&DAT_0077e510)[uVar11 & 0xff]);
    uVar11 = ((uint)(byte)(&DAT_0077e310)[uVar5 >> 0x18] << 0x18 |
              (uint)(byte)(&DAT_0077e410)[uVar5 >> 0x10 & 0xff] << 0x10 |
              (uint)(byte)(&DAT_0077e510)[uVar5 >> 8 & 0xff] << 8 |
             (uint)(byte)(&DAT_0077e210)[uVar5 & 0xff]) ^ (uVar1 >> 0x10 | uVar1 << 0x10);
    uVar1 = uVar1 ^ (uVar11 >> 8 | uVar11 << 0x18);
    uVar11 = uVar11 ^ local_d8 ^ local_e8 ^ (uVar1 >> 8 | uVar1 << 0x18);
    uVar1 = uVar1 ^ uStack_d4 ^ uStack_e4;
    local_c8 = CONCAT44(uVar1,uVar11);
    uVar11 = uVar11 ^ 0xb05688c2;
    uVar1 = uVar1 ^ 0xb3e6c1fd;
    uVar5 = ((uint)(byte)(&DAT_0077e310)[uVar1 >> 0x18] |
            ((uint)(byte)(&DAT_0077e410)[uVar1 >> 0x10 & 0xff] << 0x10 |
             (uint)(byte)(&DAT_0077e510)[uVar1 >> 8 & 0xff] << 8 |
            (uint)(byte)(&DAT_0077e210)[uVar1 & 0xff]) << 8) ^
            ((uint)(byte)(&DAT_0077e210)[uVar11 >> 0x18] << 0x18 |
             (uint)(byte)(&DAT_0077e310)[uVar11 >> 0x10 & 0xff] << 0x10 |
             (uint)(byte)(&DAT_0077e410)[uVar11 >> 8 & 0xff] << 8 |
            (uint)(byte)(&DAT_0077e510)[uVar11 & 0xff]);
    uVar11 = ((uint)(byte)(&DAT_0077e310)[uVar1 >> 0x18] << 0x18 |
              (uint)(byte)(&DAT_0077e410)[uVar1 >> 0x10 & 0xff] << 0x10 |
              (uint)(byte)(&DAT_0077e510)[uVar1 >> 8 & 0xff] << 8 |
             (uint)(byte)(&DAT_0077e210)[uVar1 & 0xff]) ^ (uVar5 >> 0x10 | uVar5 << 0x10);
    uVar5 = uVar5 ^ (uVar11 >> 8 | uVar11 << 0x18);
    local_d0 = CONCAT44(uVar5 ^ uStack_dc ^ uStack_ec,
                        uVar11 ^ local_e0 ^ local_f0 ^ (uVar5 >> 8 | uVar5 << 0x18));
  }
  local_150[4] = (int)(CONCAT44(local_100,local_fc) >> 0x11);
  local_150[5] = (int)(CONCAT44(local_fc,local_f8) >> 0x11);
  local_150[6] = (int)(CONCAT44(local_f8,uStack_f4) >> 0x11);
  local_150[0] = local_100;
  local_150[1] = local_fc;
  local_150[2] = local_f8;
  local_150[3] = uStack_f4;
  local_150[7] = (int)(CONCAT44(uStack_f4,local_100) >> 0x11);
  uVar11 = (uint)lVar12;
  if (uVar11 == 0) {
    local_150[8] = (int)(CONCAT44(local_100,local_fc) >> 2);
    local_150[9] = (int)(CONCAT44(local_fc,local_f8) >> 2);
    local_150[10] = (int)(CONCAT44(local_f8,uStack_f4) >> 2);
    local_150[0xb] = (int)(CONCAT44(uStack_f4,local_100) >> 2);
  }
  local_150[0xc] = (int)(CONCAT44(local_100,local_fc) >> 0x13);
  local_150[0xd] = (int)(CONCAT44(local_fc,local_f8) >> 0x13);
  lVar10 = 0;
  local_150[0x10] = (int)(CONCAT44(local_100,local_fc) >> 4);
  local_150[0x11] = (int)(CONCAT44(local_fc,local_f8) >> 4);
  local_150[0x12] = (int)(CONCAT44(local_f8,uStack_f4) >> 4);
  local_150[0x13] = (int)(CONCAT44(uStack_f4,local_100) >> 4);
  local_150[0xe] = (int)(CONCAT44(local_f8,uStack_f4) >> 0x13);
  local_150[0xf] = (int)(CONCAT44(uStack_f4,local_100) >> 0x13);
  do {
    if ((long)(char)(&DAT_0077dd7c)[lVar10 + lVar12 * 0x50] != -1) {
      param_1[(long)(char)(&DAT_0077dd7c)[lVar10 + lVar12 * 0x50] + 1] = local_150[lVar10];
    }
    lVar10 = lVar10 + 1;
  } while (lVar10 != 0x14);
  if (0x80 < param_3) {
    local_150[0] = local_f0;
    local_150[1] = uStack_ec;
    local_150[2] = local_e8;
    local_150[3] = uStack_e4;
    if (uVar11 != 0) {
      local_150[4] = (int)(CONCAT44(local_f0,uStack_ec) >> 0x11);
      local_150[5] = (int)(CONCAT44(uStack_ec,local_e8) >> 0x11);
      local_150[6] = (int)(CONCAT44(local_e8,uStack_e4) >> 0x11);
      local_150[7] = (int)(CONCAT44(uStack_e4,local_f0) >> 0x11);
      local_150[8] = (int)(CONCAT44(local_f0,uStack_ec) >> 2);
      local_150[9] = (int)(CONCAT44(uStack_ec,local_e8) >> 2);
      local_150[10] = (int)(CONCAT44(local_e8,uStack_e4) >> 2);
      local_150[0xb] = (int)(CONCAT44(uStack_e4,local_f0) >> 2);
      local_150[0x10] = (int)(CONCAT44(local_f0,uStack_ec) >> 4);
      local_150[0x11] = (int)(CONCAT44(uStack_ec,local_e8) >> 4);
      local_150[0x12] = (int)(CONCAT44(local_e8,uStack_e4) >> 4);
      local_150[0x13] = (int)(CONCAT44(uStack_e4,local_f0) >> 4);
    }
    lVar10 = 0;
    do {
      if ((long)(char)(&DAT_0077dd90)[lVar10 + lVar12 * 0x50] != -1) {
        param_1[(long)(char)(&DAT_0077dd90)[lVar10 + lVar12 * 0x50] + 1] = local_150[lVar10];
      }
      lVar10 = lVar10 + 1;
    } while (lVar10 != 0x14);
  }
  local_150[4] = (int)(CONCAT44(local_e0,uStack_dc) >> 0x11);
  local_150[5] = (int)(CONCAT44(uStack_dc,local_d8) >> 0x11);
  local_150[6] = (int)(CONCAT44(local_d8,uStack_d4) >> 0x11);
  local_150[7] = (int)(CONCAT44(uStack_d4,local_e0) >> 0x11);
  local_150[8] = (int)(CONCAT44(local_e0,uStack_dc) >> 2);
  local_150[9] = (int)(CONCAT44(uStack_dc,local_d8) >> 2);
  local_150[10] = (int)(CONCAT44(local_d8,uStack_d4) >> 2);
  local_150[0xb] = (int)(CONCAT44(uStack_d4,local_e0) >> 2);
  local_150[0xc] = (int)(CONCAT44(local_e0,uStack_dc) >> 0x13);
  local_150[0xd] = (int)(CONCAT44(uStack_dc,local_d8) >> 0x13);
  local_150[0xe] = (int)(CONCAT44(local_d8,uStack_d4) >> 0x13);
  local_150[0] = local_e0;
  local_150[1] = uStack_dc;
  local_150[2] = local_d8;
  local_150[3] = uStack_d4;
  local_150[0xf] = (int)(CONCAT44(uStack_d4,local_e0) >> 0x13);
  if (uVar11 == 0) {
    local_150[0x10] = (int)(CONCAT44(local_e0,uStack_dc) >> 4);
    local_150[0x11] = (int)(CONCAT44(uStack_dc,local_d8) >> 4);
    local_150[0x12] = (int)(CONCAT44(local_d8,uStack_d4) >> 4);
    local_150[0x13] = (int)(CONCAT44(uStack_d4,local_e0) >> 4);
  }
  lVar10 = 0;
  do {
    if ((long)(char)(&DAT_0077dda4)[lVar10 + lVar12 * 0x50] != -1) {
      param_1[(long)(char)(&DAT_0077dda4)[lVar10 + lVar12 * 0x50] + 1] = local_150[lVar10];
    }
    lVar10 = lVar10 + 1;
  } while (lVar10 != 0x14);
  if (0x80 < param_3) {
    local_150[0] = (uint)local_d0;
    local_150[1] = local_d0._4_4_;
    local_150[2] = (uint)local_c8;
    local_150[3] = local_c8._4_4_;
    if (uVar11 != 0) {
      local_150[4] = (int)(CONCAT44((uint)local_d0,local_d0._4_4_) >> 0x11);
      local_150[5] = (int)(CONCAT44(local_d0._4_4_,(uint)local_c8) >> 0x11);
      local_150[6] = (int)(CONCAT44((uint)local_c8,local_c8._4_4_) >> 0x11);
      local_150[7] = (int)(CONCAT44(local_c8._4_4_,(uint)local_d0) >> 0x11);
      local_150[8] = (int)(CONCAT44((uint)local_d0,local_d0._4_4_) >> 2);
      local_150[9] = (int)(CONCAT44(local_d0._4_4_,(uint)local_c8) >> 2);
      local_150[10] = (int)(CONCAT44((uint)local_c8,local_c8._4_4_) >> 2);
      local_150[0xb] = (int)(CONCAT44(local_c8._4_4_,(uint)local_d0) >> 2);
      local_150[0x10] = (int)(CONCAT44((uint)local_d0,local_d0._4_4_) >> 4);
      local_150[0x11] = (int)(CONCAT44(local_d0._4_4_,(uint)local_c8) >> 4);
      local_150[0x12] = (int)(CONCAT44((uint)local_c8,local_c8._4_4_) >> 4);
      local_150[0x13] = (int)(CONCAT44(local_c8._4_4_,(uint)local_d0) >> 4);
    }
    lVar10 = 0;
    do {
      if ((long)(char)(&DAT_0077ddb8)[lVar10 + lVar12 * 0x50] != -1) {
        param_1[(long)(char)(&DAT_0077ddb8)[lVar10 + lVar12 * 0x50] + 1] = local_150[lVar10];
      }
      lVar10 = lVar10 + 1;
    } while (lVar10 != 0x14);
  }
  lVar10 = 0;
  do {
    if ((long)(char)(&DAT_0077de1c)[lVar10 + lVar12 * 0x14] != -1) {
      param_1[(ulong)((uVar11 | uVar11 << 1) << 2 | 0x20) + lVar10 + 1] =
           param_1[(long)(char)(&DAT_0077de1c)[lVar10 + lVar12 * 0x14] + 1];
    }
    lVar10 = lVar10 + 1;
  } while (lVar10 != 0x14);
  uVar8 = 0;
LAB_00b72154:
  if (*(long *)(lVar7 + 0x28) != lVar9) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail(uVar8);
  }
  return;
}

