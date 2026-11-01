
/* WARNING: Removing unreachable block (ram,0x004963bc) */

void FUN_004961ac(undefined1 param_1 [16])

{
  long unaff_x22;
  long unaff_x25;
  long in_stack_00000008;
  undefined8 in_stack_000005b8;
  undefined8 in_stack_000005c0;
  undefined8 in_stack_000005d0;
  undefined8 in_stack_000005f8;
  undefined8 in_stack_00000600;
  undefined8 in_stack_00000ab8;
  undefined8 in_stack_00000ac0;
  undefined8 in_stack_00000acc;
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
  
  *(long *)(unaff_x25 + 0x250) = param_1._8_8_;
  *(long *)(unaff_x25 + 0x248) = param_1._0_8_;
  func_0x0049fe30(auStack_7ffffffe + 0x8000087e,auStack_7ffffffe + 0x80000dae,
                  auStack_7ffffffe + 0x80000b4e);
  _memcpy(auStack_7ffffffe + 0x80000dae,auStack_7ffffffe + 0x8000087e,0x228);
  *(undefined8 *)(unaff_x25 + 0x240) = in_stack_00000ac0;
  *(undefined8 *)(unaff_x25 + 0x238) = in_stack_00000ab8;
  *(undefined8 *)(unaff_x25 + 0x24c) = in_stack_00000acc;
  func_0x004fe4a4(auStack_7ffffffe + 0x8000059e,auStack_7ffffffe + 0x80000dae);
  _memcpy(auStack_7ffffffe + 0x8000087e,auStack_7ffffffe + 0x8000059e,0x2c8);
  func_0x0048fb5c(auStack_7ffffffe + 0x80000b4e,auStack_7ffffffe + 0x80000dae,&UNK_009e2ee8);
  *(undefined8 *)(unaff_x22 + 0x20) = in_stack_000005c0;
  *(undefined8 *)(unaff_x22 + 0x18) = in_stack_000005b8;
  *(undefined8 *)(unaff_x22 + 0x60) = in_stack_00000600;
  *(undefined8 *)(unaff_x22 + 0x58) = in_stack_000005f8;
  *(undefined8 *)(unaff_x22 + 0x80) = 0;
  *(undefined8 *)(unaff_x22 + 0x78) = 0;
  *(undefined8 *)(unaff_x22 + 0xb0) = 0;
  *(undefined8 *)(unaff_x22 + 0xa8) = 0;
  *(undefined8 *)(unaff_x22 + 0xe0) = 0;
  *(undefined8 *)(unaff_x22 + 0xd8) = 0;
  *(undefined8 *)(unaff_x22 + 0x30) = in_stack_000005d0;
  *(undefined8 *)(unaff_x22 + 0x28) = 0;
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

