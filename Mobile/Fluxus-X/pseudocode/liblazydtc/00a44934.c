/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a44934
 */

void ossl_x25519_public_from_private(undefined8 param_1,ulong *param_2)

{
  undefined1 auStack_168 [40];
  int local_140;
  int iStack_13c;
  int local_138;
  int iStack_134;
  int local_130;
  int iStack_12c;
  int local_128;
  int iStack_124;
  int local_120;
  int iStack_11c;
  int local_118;
  int iStack_114;
  int local_110;
  int iStack_10c;
  int local_108;
  int iStack_104;
  int local_100;
  int iStack_fc;
  int local_f8;
  int iStack_f4;
  undefined1 auStack_f0 [40];
  int local_c8;
  int iStack_c4;
  int local_c0;
  int iStack_bc;
  int local_b8;
  int iStack_b4;
  int local_b0;
  int iStack_ac;
  int local_a8;
  int iStack_a4;
  int local_a0;
  int iStack_9c;
  int local_98;
  int iStack_94;
  int local_90;
  int iStack_8c;
  int local_88;
  int iStack_84;
  int local_80;
  int iStack_7c;
  ulong local_50;
  ulong uStack_48;
  ulong local_40;
  ulong uStack_38;
  
  uStack_48 = param_2[1];
  local_40 = param_2[2];
  local_50 = *param_2 & 0xfffffffffffffff8;
  uStack_38 = param_2[3] & 0x3fffffffffffffff | 0x4000000000000000;
  FUN_00a3fd34(auStack_f0,&local_50);
  local_118 = local_c8 + local_a0;
  local_140 = local_a0 - local_c8;
  iStack_114 = iStack_c4 + iStack_9c;
  iStack_13c = iStack_9c - iStack_c4;
  local_110 = local_c0 + local_98;
  local_138 = local_98 - local_c0;
  iStack_10c = iStack_bc + iStack_94;
  iStack_134 = iStack_94 - iStack_bc;
  local_108 = local_b8 + local_90;
  local_130 = local_90 - local_b8;
  iStack_104 = iStack_b4 + iStack_8c;
  iStack_12c = iStack_8c - iStack_b4;
  local_100 = local_b0 + local_88;
  local_128 = local_88 - local_b0;
  iStack_fc = iStack_ac + iStack_84;
  iStack_124 = iStack_84 - iStack_ac;
  local_f8 = local_a8 + local_80;
  local_120 = local_80 - local_a8;
  iStack_f4 = iStack_a4 + iStack_7c;
  iStack_11c = iStack_7c - iStack_a4;
  FUN_00a44a70(auStack_168,&local_140);
  FUN_00a44e38(&local_118,&local_118,auStack_168);
  FUN_00a45158(param_1,&local_118);
  OPENSSL_cleanse(&local_50,0x20);
  return;
}

