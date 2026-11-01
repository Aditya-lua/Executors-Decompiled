
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

ushort FUN_0046ecf0(undefined1 param_1 [16],undefined1 param_2 [16],uint param_3)

{
  undefined1 auVar1 [16];
  bool in_ZR;
  int in_w8;
  ushort uVar2;
  
  auVar1._2_2_ = -(ushort)((uint)((ulong)_UNK_00891300 >> 0x20) < param_2._4_4_);
  auVar1._0_2_ = -(ushort)((uint)_UNK_00891300 < param_2._0_4_);
  auVar1._4_2_ = -(ushort)((uint)_UNK_00891308 < param_2._8_4_);
  auVar1._6_2_ = -(ushort)((uint)((ulong)_UNK_00891308 >> 0x20) < param_2._12_4_);
  auVar1._8_2_ = -(ushort)((uint)_UNK_00891310 < (uint)(param_1._0_4_ + (int)_UNK_00891370));
  auVar1._10_2_ =
       -(ushort)((uint)((ulong)_UNK_00891310 >> 0x20) <
                (uint)(param_1._4_4_ + (int)((ulong)_UNK_00891370 >> 0x20)));
  auVar1._12_2_ = -(ushort)((uint)_UNK_00891318 < param_3 - 0xe0100);
  auVar1._14_2_ = -(ushort)((uint)((ulong)_UNK_00891318 >> 0x20) < param_3);
  uVar2 = NEON_umaxv(auVar1,2);
  return (ushort)(!in_ZR && in_w8 != 0x2b81e) & (uVar2 ^ 1);
}

