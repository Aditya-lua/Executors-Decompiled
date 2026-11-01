
void FUN_00496454(long param_1,undefined1 param_2 [16])

{
  undefined8 *in_x13;
  undefined8 *unaff_x21;
  long unaff_x22;
  undefined8 *unaff_x23;
  undefined8 *unaff_x24;
  undefined8 uVar1;
  long in_stack_00000008;
  undefined8 in_stack_00000020;
  undefined8 in_stack_00000028;
  undefined8 in_stack_000005c8;
  undefined8 in_stack_000005d0;
  undefined8 in_stack_00000af0;
  undefined8 in_stack_00000af8;
  undefined8 in_stack_00000b00;
  undefined8 in_stack_00000b08;
  undefined8 in_stack_00000b10;
  undefined8 in_stack_00000b18;
  undefined8 in_stack_00000b20;
  undefined8 in_stack_00000b28;
  undefined8 in_stack_00000b30;
  undefined8 in_stack_00000b38;
  undefined8 in_stack_00000b40;
  undefined1 auStack_7ffffffe [2147483646];
  
  in_x13[1] = param_2._8_8_;
  *in_x13 = param_2._0_8_;
  uVar1 = *unaff_x23;
  *(undefined8 *)(param_1 + 0x1a0) = unaff_x23[1];
  *(undefined8 *)(param_1 + 0x198) = uVar1;
  uVar1 = *unaff_x21;
  *(undefined8 *)(param_1 + 0x1d0) = unaff_x21[1];
  *(undefined8 *)(param_1 + 0x1c8) = uVar1;
  uVar1 = *unaff_x24;
  *(undefined8 *)(param_1 + 0x210) = unaff_x24[1];
  *(undefined8 *)(param_1 + 0x208) = uVar1;
  *(undefined8 *)(unaff_x22 + 0x30) = in_stack_000005d0;
  *(undefined8 *)(unaff_x22 + 0x28) = in_stack_000005c8;
  *(undefined8 *)(param_1 + 0x250) = in_stack_00000028;
  *(undefined8 *)(param_1 + 0x248) = in_stack_00000020;
  func_0x0049fe30(auStack_7ffffffe + 0x80000b4e,auStack_7ffffffe + 0x80000dae,
                  auStack_7ffffffe + 0x80000866);
  _memcpy(auStack_7ffffffe + 0x8000059e,auStack_7ffffffe + 0x80000b4e,0x228);
  func_0x004fe4a4(auStack_7ffffffe + 0x8000087e,auStack_7ffffffe + 0x8000059e);
  _memcpy(in_stack_00000008,auStack_7ffffffe + 0x8000087e,0x260);
  *(undefined8 *)(in_stack_00000008 + 0x298) = in_stack_00000b18;
  *(undefined8 *)(in_stack_00000008 + 0x290) = in_stack_00000b10;
  *(undefined8 *)(in_stack_00000008 + 0x2a8) = in_stack_00000b28;
  *(undefined8 *)(in_stack_00000008 + 0x2a0) = in_stack_00000b20;
  *(undefined8 *)(in_stack_00000008 + 0x2b8) = in_stack_00000b38;
  *(undefined8 *)(in_stack_00000008 + 0x2b0) = in_stack_00000b30;
  *(undefined8 *)(in_stack_00000008 + 0x2c0) = in_stack_00000b40;
  *(undefined8 *)(in_stack_00000008 + 0x278) = in_stack_00000af8;
  *(undefined8 *)(in_stack_00000008 + 0x270) = in_stack_00000af0;
  *(undefined8 *)(in_stack_00000008 + 0x288) = in_stack_00000b08;
  *(undefined8 *)(in_stack_00000008 + 0x280) = in_stack_00000b00;
  *(undefined **)(in_stack_00000008 + 0x260) = &UNK_0089f1a5;
  *(undefined8 *)(in_stack_00000008 + 0x268) = 5;
  return;
}

