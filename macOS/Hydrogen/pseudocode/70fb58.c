
void FUN_0070fb58(undefined8 *param_1,undefined8 param_2,undefined8 *param_3)

{
  bool in_CY;
  undefined8 *unaff_x19;
  int unaff_w20;
  int unaff_w21;
  undefined8 uVar1;
  long in_stack_00000008;
  long in_stack_00000030;
  char in_stack_00000050;
  undefined1 uStack0000000000000080;
  undefined8 in_stack_00000160;
  undefined8 in_stack_00000168;
  undefined8 in_stack_00000170;
  undefined8 in_stack_00000178;
  undefined8 in_stack_00000180;
  undefined8 in_stack_00000188;
  undefined8 in_stack_00000228;
  undefined8 in_stack_00000238;
  undefined8 in_stack_00000498;
  undefined8 in_stack_000004a0;
  undefined8 in_stack_000004a8;
  undefined8 in_stack_000004b0;
  undefined1 auStack_7ffffffe [2147483646];
  
  if (in_CY) {
    param_1 = (undefined8 *)
              func_0x00725d54(auStack_7ffffffe + 0x80000226,param_3,"Expected end of file");
  }
  else {
    *param_1 = &UNK_00a1df28;
    uVar1 = *param_3;
    param_1[2] = param_3[1];
    param_1[1] = uVar1;
    *(undefined4 *)(param_1 + 5) = 0x656c6966;
    uVar1 = s_Expected_end_of_file_008ed510._0_8_;
    param_1[4] = s_Expected_end_of_file_008ed510._8_8_;
    param_1[3] = uVar1;
    *(undefined1 *)((long)param_1 + 0x2c) = 0;
    *(undefined1 *)((long)param_1 + 0x2f) = 0x14;
    param_1 = param_1 + 6;
  }
  uVar1 = in_stack_00000170;
  *unaff_x19 = 0;
  unaff_x19[1] = (ulong)(uint)(unaff_w20 + unaff_w21);
  unaff_x19[3] = in_stack_00000180;
  unaff_x19[2] = in_stack_00000178;
  unaff_x19[4] = in_stack_00000188;
  in_stack_00000180 = 0;
  in_stack_00000188 = 0;
  unaff_x19[6] = param_1;
  unaff_x19[5] = in_stack_00000228;
  unaff_x19[7] = in_stack_00000238;
  unaff_x19[9] = in_stack_00000168;
  unaff_x19[8] = in_stack_00000160;
  in_stack_00000160 = 0;
  in_stack_00000168 = 0;
  in_stack_00000170 = 0;
  in_stack_00000178 = 0;
  unaff_x19[10] = uVar1;
  unaff_x19[0xb] = in_stack_00000498;
  unaff_x19[0xd] = in_stack_000004a8;
  unaff_x19[0xc] = in_stack_000004a0;
  unaff_x19[0xe] = in_stack_000004b0;
  func_0x007253a4(&uStack0000000000000080);
  if (in_stack_00000050 != '\0') {
    if (in_stack_00000030 != 0) {
      __ZdlPv();
    }
    if (in_stack_00000008 != 0) {
      __ZdlPv();
    }
  }
  return;
}

