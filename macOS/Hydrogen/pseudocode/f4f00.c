
void FUN_000f4f00(undefined1 param_1 [16],undefined1 param_2 [16],undefined4 param_3,
                 undefined1 param_4 [16])

{
  uint uStack0000000000000000;
  uint uStack0000000000000004;
  uint uStack0000000000000008;
  uint uStack000000000000000c;
  
  uStack0000000000000000 = param_1._0_4_ ^ (param_1._0_4_ ^ param_2._0_4_) & ~(int)(short)param_3;
  uStack0000000000000004 =
       param_1._4_4_ ^ (param_1._4_4_ ^ param_2._4_4_) & ~(int)(short)((uint)param_3 >> 0x10);
  uStack0000000000000008 = param_1._8_4_ ^ (param_1._8_4_ ^ param_2._8_4_) & ~(int)param_4._4_2_;
  uStack000000000000000c = param_1._12_4_ ^ (param_1._12_4_ ^ param_2._12_4_) & ~(int)param_4._6_2_;
  func_0x000f4f58();
  return;
}

