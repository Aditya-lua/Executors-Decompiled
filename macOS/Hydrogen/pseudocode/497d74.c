
void FUN_00497d74(long param_1)

{
  long in_stack_00000008;
  undefined8 in_stack_00000020;
  undefined8 in_stack_00000028;
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

