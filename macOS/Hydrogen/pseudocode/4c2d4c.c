
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

undefined8 FUN_004c2d4c(undefined8 param_1,undefined8 *param_2)

{
  code *pcVar1;
  long *plVar2;
  long in_x10;
  long lVar3;
  long unaff_x21;
  undefined8 in_stack_000000f8;
  undefined8 in_stack_00000118;
  long in_stack_00000120;
  undefined8 in_stack_00000128;
  undefined8 in_stack_000001f8;
  ulong in_stack_00000200;
  long in_stack_00000530;
  undefined8 in_stack_00000538;
  long in_stack_00000648;
  long in_stack_00000650;
  undefined1 auStack_7ffffffe [2147483646];
  
  *param_2 = 0;
  param_2[1] = param_1;
  param_2[2] = 0;
  if ((ulong)(*(long *)(in_x10 + 0x110) - unaff_x21) < in_stack_00000200) {
    func_0x007a535c(auStack_7ffffffe + 0x8000063e);
    unaff_x21 = in_stack_00000650;
  }
  _memcpy(in_stack_00000648 + unaff_x21 * 0x108,in_stack_000001f8,in_stack_00000200 * 0x108);
  func_0x004d3808(auStack_7ffffffe + 0x8000066e);
  plVar2 = (long *)func_0x005847cc(in_stack_000000f8,in_stack_00000118._4_4_);
  if (plVar2 == (long *)0x0) {
    func_0x007a23bc(&UNK_009e6588);
                    /* WARNING: Does not return */
    pcVar1 = (code *)SoftwareBreakpoint(1,0x4c5944);
    (*pcVar1)();
  }
  func_0x005cf78c(auStack_7ffffffe + 0x8000052e,auStack_7ffffffe + 0x8000066e,
                  auStack_7ffffffe + 0x8000063e);
  lVar3 = plVar2[2];
  if (lVar3 == *plVar2) {
    func_0x005bd0a4(plVar2,&UNK_009e65a0);
  }
  _memcpy(plVar2[1] + lVar3 * 0x108,auStack_7ffffffe + 0x8000066e,0x108);
  plVar2[2] = lVar3 + 1;
  func_0x00584c34(auStack_7ffffffe + 0x8000052e,in_stack_000000f8,in_stack_00000118._4_4_,
                  auStack_7ffffffe + 0x8000066e);
  func_0x004ce364(auStack_7ffffffe + 0x8000052e);
  if (in_stack_00000530 != 0) {
    func_0x00187bd4(in_stack_00000538,in_stack_00000530 * 0x28,8);
  }
  if (in_stack_00000120 != 0) {
    func_0x00187bd4(in_stack_00000128,in_stack_00000120 << 2,4);
  }
  return 1;
}

