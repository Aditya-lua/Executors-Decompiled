
ulong FUN_002b51a8(undefined8 param_1,long param_2)

{
  ulong uVar1;
  uint *unaff_x19;
  int unaff_w20;
  uint unaff_w21;
  undefined8 in_stack_00000018;
  
  uVar1 = _sscanf(param_1,param_2 + 0x41);
  if ((int)uVar1 == 0) {
    return uVar1;
  }
  if (unaff_w20 == 0x7e || unaff_w21 == 0) {
    if (unaff_w20 == 0x7e) {
      in_stack_00000018._4_4_ = *unaff_x19 & (in_stack_00000018._4_4_ ^ 0xffffffff);
      goto LAB_002b5204;
    }
  }
  else if ((in_stack_00000018._4_4_ & (unaff_w21 ^ 0xffffffff)) != 0) {
    _fprintf(*(undefined8 *)PTR____stderrp_009b01f0,
             "Fatal Error: HW capability found: 0x%02X, but HW capability requested: 0x%02X.\n");
    _abort();
    if (((uRam0000000000a334f8 ^ 0xffffffff) & 0x18000) == 0) {
      uVar1 = UnkSytemRegRead(3,3,4,2,5);
      return uVar1 >> 0x18 & 1;
    }
    return 0;
  }
  if (unaff_w20 == 0x7c) {
    *unaff_x19 = *unaff_x19 | in_stack_00000018._4_4_;
    return uVar1;
  }
LAB_002b5204:
  *unaff_x19 = in_stack_00000018._4_4_;
  return uVar1;
}

