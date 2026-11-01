
void FUN_004d671c(undefined8 param_1)

{
  long *plVar1;
  long lVar2;
  undefined8 *extraout_x8;
  ulong uVar3;
  undefined1 auVar4 [12];
  long in_stack_00000010;
  undefined8 in_stack_00000018;
  long in_stack_00000030;
  undefined8 in_stack_00000038;
  undefined8 uStack_58;
  dword *pdStack_50;
  undefined8 uStack_48;
  undefined8 uStack_40;
  undefined8 uStack_38;
  undefined8 uStack_30;
  undefined8 uStack_28;
  
  if (in_stack_00000030 != 0) {
    func_0x00187bd4(in_stack_00000038,in_stack_00000030 << 2,4);
  }
  if (in_stack_00000010 != 0) {
    func_0x00187bd4(in_stack_00000018,in_stack_00000010 << 2,4);
  }
  auVar4 = __Unwind_Resume(param_1);
  uVar3 = *(long *)(auVar4._0_8_ + 0x10) << 5;
  do {
    if (uVar3 == 0) {
      lVar2 = 0;
      goto code_r0x004d67ac;
    }
    plVar1 = (long *)(*(long *)(auVar4._0_8_ + 8) + -0x20 + uVar3);
    uVar3 = uVar3 - 0x20;
  } while (*plVar1 == -0x8000000000000000);
  lVar2 = (uVar3 >> 5 & 0xffffffff) + 1;
code_r0x004d67ac:
  func_0x005e32c0(&uStack_40,lVar2);
  uStack_58 = 0;
  pdStack_50 = &MACH_HEADER.cputype;
  uStack_48 = 0;
  func_0x005bcf2c(&uStack_58,&UNK_009e6e70);
  *pdStack_50 = auVar4._8_4_;
  extraout_x8[6] = uStack_28;
  extraout_x8[1] = pdStack_50;
  *extraout_x8 = uStack_58;
  extraout_x8[3] = uStack_40;
  extraout_x8[2] = 1;
  extraout_x8[5] = uStack_30;
  extraout_x8[4] = uStack_38;
  return;
}

