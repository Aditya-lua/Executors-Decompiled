
bool FUN_0003b094(undefined8 param_1)

{
  int iVar1;
  ulong *unaff_x20;
  undefined8 uStack0000000000000018;
  undefined8 uStack0000000000000028;
  undefined8 uStack0000000000000038;
  undefined8 uStack0000000000000048;
  undefined8 uStack0000000000000058;
  undefined8 in_stack_00000060;
  undefined8 in_stack_00000068;
  undefined8 uStack0000000000000070;
  ulong in_stack_00000078;
  undefined7 uStack0000000000000080;
  long in_stack_000000a0;
  long in_stack_000000a8;
  char cStack00000000000000c0;
  undefined2 uStack00000000000000c8;
  
  uStack0000000000000070 = uStack0000000000000070 & 0xffffffffffff0000;
  in_stack_00000078 = in_stack_00000078 & 0xffffffffffffff00;
  cStack00000000000000c0 = '\0';
  uStack00000000000000c8 = 0;
  uStack0000000000000018 = param_1;
  uStack0000000000000028 = param_1;
  uStack0000000000000038 = param_1;
  uStack0000000000000048 = param_1;
  func_0x006bd97c(&uStack0000000000000058);
  if (cStack00000000000000c0 != '\0') {
    if (in_stack_000000a0 != 0) {
      in_stack_000000a8 = in_stack_000000a0;
      __ZdlPv();
    }
    if (in_stack_00000078 != 0) {
      __ZdlPv();
    }
  }
  if ((char)unaff_x20[3] == '\0') {
    _uStack0000000000000080 = CONCAT17(0xc,uStack0000000000000080);
    uStack0000000000000070._0_1_ = s__LocalScript_008cee6d[0];
    uStack0000000000000070._1_1_ = s__LocalScript_008cee6d[1];
    uStack0000000000000070._2_1_ = s__LocalScript_008cee6d[2];
    uStack0000000000000070._3_1_ = s__LocalScript_008cee6d[3];
    uStack0000000000000070._4_1_ = s__LocalScript_008cee6d[4];
    uStack0000000000000070._5_1_ = s__LocalScript_008cee6d[5];
    uStack0000000000000070._6_1_ = s__LocalScript_008cee6d[6];
    uStack0000000000000070._7_1_ = s__LocalScript_008cee6d[7];
    in_stack_00000078 = CONCAT35(in_stack_00000078._5_3_,0x74706972);
  }
  else if (*(char *)((long)unaff_x20 + 0x17) < '\0') {
    func_0x00017634(&uStack0000000000000070,*unaff_x20,unaff_x20[1]);
  }
  else {
    in_stack_00000078 = unaff_x20[1];
    uStack0000000000000070 = *unaff_x20;
    _uStack0000000000000080 = unaff_x20[2];
  }
  iVar1 = func_0x00700e1c();
  if ((long)_uStack0000000000000080 < 0) {
    __ZdlPv(uStack0000000000000070);
  }
  if (in_stack_00000068._7_1_ < '\0') {
    __ZdlPv(uStack0000000000000058);
    return iVar1 == 0;
  }
  s__LocalScript_008cee6d[0] = s__LocalScript_008cee6d[0];
  s__LocalScript_008cee6d[1] = s__LocalScript_008cee6d[1];
  s__LocalScript_008cee6d[2] = s__LocalScript_008cee6d[2];
  s__LocalScript_008cee6d[3] = s__LocalScript_008cee6d[3];
  s__LocalScript_008cee6d[4] = s__LocalScript_008cee6d[4];
  s__LocalScript_008cee6d[5] = s__LocalScript_008cee6d[5];
  s__LocalScript_008cee6d[6] = s__LocalScript_008cee6d[6];
  s__LocalScript_008cee6d[7] = s__LocalScript_008cee6d[7];
  return iVar1 == 0;
}

