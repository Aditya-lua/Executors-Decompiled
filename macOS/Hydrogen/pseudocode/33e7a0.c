
void FUN_0033e7a0(undefined1 param_1 [16],undefined1 param_2 [16],undefined1 param_3 [16],
                 undefined1 param_4 [16],undefined1 param_5 [16],undefined1 param_6 [16],
                 undefined1 param_7 [16],undefined1 param_8 [16],long param_9)

{
  int iVar1;
  int iVar2;
  int iVar3;
  int iVar4;
  int in_s16;
  int in_register_00005204;
  int in_register_00005208;
  int in_register_0000520c;
  int in_s17;
  int in_register_00005224;
  int in_register_00005228;
  int in_register_0000522c;
  int in_s18;
  int in_register_00005244;
  int in_register_00005248;
  int in_register_0000524c;
  int in_s19;
  int in_register_00005264;
  int in_register_00005268;
  int in_register_0000526c;
  int in_s20;
  int in_register_00005284;
  int in_register_00005288;
  int in_register_0000528c;
  int in_s23;
  int in_register_000052e4;
  int in_register_000052e8;
  int in_register_000052ec;
  int in_s24;
  int in_register_00005304;
  int in_register_00005308;
  int in_register_0000530c;
  int in_s25;
  int in_register_00005324;
  int in_register_00005328;
  int in_register_0000532c;
  int in_s26;
  int in_register_00005344;
  int in_register_00005348;
  int in_register_0000534c;
  
  iVar1 = param_3._0_4_;
  iVar2 = param_3._4_4_;
  iVar3 = param_3._8_4_;
  iVar4 = param_3._12_4_;
  *(ulong *)(param_9 + 0x1c8) =
       CONCAT26((short)((uint)(param_7._12_4_ * iVar4 + in_register_000052ec) >> 0x10),
                CONCAT24((short)((uint)(param_7._8_4_ * iVar3 + in_register_000052e8) >> 0x10),
                         CONCAT22((short)((uint)(param_7._4_4_ * iVar2 + in_register_000052e4) >>
                                         0x10),
                                  (short)((uint)(param_7._0_4_ * iVar1 + in_s23) >> 0x10))));
  *(ulong *)(param_9 + 0x1c0) =
       CONCAT26((short)((uint)(param_8._12_4_ * iVar4 + param_4._12_4_) >> 0x10),
                CONCAT24((short)((uint)(param_8._8_4_ * iVar3 + param_4._8_4_) >> 0x10),
                         CONCAT22((short)((uint)(param_8._4_4_ * iVar2 + param_4._4_4_) >> 0x10),
                                  (short)((uint)(param_8._0_4_ * iVar1 + param_4._0_4_) >> 0x10))));
  *(ulong *)(param_9 + 0x1d8) =
       CONCAT26((short)((uint)(in_register_0000520c * iVar4 + in_register_0000530c) >> 0x10),
                CONCAT24((short)((uint)(in_register_00005208 * iVar3 + in_register_00005308) >> 0x10
                                ),CONCAT22((short)((uint)(in_register_00005204 * iVar2 +
                                                         in_register_00005304) >> 0x10),
                                           (short)((uint)(in_s16 * iVar1 + in_s24) >> 0x10))));
  *(ulong *)(param_9 + 0x1d0) =
       CONCAT26((short)((uint)(in_register_0000522c * iVar4 + param_5._12_4_) >> 0x10),
                CONCAT24((short)((uint)(in_register_00005228 * iVar3 + param_5._8_4_) >> 0x10),
                         CONCAT22((short)((uint)(in_register_00005224 * iVar2 + param_5._4_4_) >>
                                         0x10),
                                  (short)((uint)(in_s17 * iVar1 + param_5._0_4_) >> 0x10))));
  *(ulong *)(param_9 + 0x1e8) =
       CONCAT26((short)((uint)((in_register_0000524c >> 0x10) * iVar4 + in_register_0000532c) >>
                       0x10),
                CONCAT24((short)((uint)((in_register_00005248 >> 0x10) * iVar3 +
                                       in_register_00005328) >> 0x10),
                         CONCAT22((short)((uint)((in_register_00005244 >> 0x10) * iVar2 +
                                                in_register_00005324) >> 0x10),
                                  (short)((uint)((in_s18 >> 0x10) * iVar1 + in_s25) >> 0x10))));
  *(ulong *)(param_9 + 0x1e0) =
       CONCAT26((short)((uint)(in_register_0000526c * iVar4 + param_6._12_4_) >> 0x10),
                CONCAT24((short)((uint)(in_register_00005268 * iVar3 + param_6._8_4_) >> 0x10),
                         CONCAT22((short)((uint)(in_register_00005264 * iVar2 + param_6._4_4_) >>
                                         0x10),
                                  (short)((uint)(in_s19 * iVar1 + param_6._0_4_) >> 0x10))));
  *(ulong *)(param_9 + 0x1f8) =
       CONCAT26((short)((uint)((in_register_0000528c >> 0x10) * iVar4 + in_register_0000534c) >>
                       0x10),
                CONCAT24((short)((uint)((in_register_00005288 >> 0x10) * iVar3 +
                                       in_register_00005348) >> 0x10),
                         CONCAT22((short)((uint)((in_register_00005284 >> 0x10) * iVar2 +
                                                in_register_00005344) >> 0x10),
                                  (short)((uint)((in_s20 >> 0x10) * iVar1 + in_s26) >> 0x10))));
  *(ulong *)(param_9 + 0x1f0) =
       CONCAT26((short)((uint)((param_2._12_4_ >> 0x10) * iVar4 + param_1._12_4_) >> 0x10),
                CONCAT24((short)((uint)((param_2._8_4_ >> 0x10) * iVar3 + param_1._8_4_) >> 0x10),
                         CONCAT22((short)((uint)((param_2._4_4_ >> 0x10) * iVar2 + param_1._4_4_) >>
                                         0x10),
                                  (short)((uint)((param_2._0_4_ >> 0x10) * iVar1 + param_1._0_4_) >>
                                         0x10))));
  return;
}

