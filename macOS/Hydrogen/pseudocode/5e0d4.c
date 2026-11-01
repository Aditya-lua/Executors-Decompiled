
void FUN_0005e0d4(void)

{
  int in_w8;
  undefined8 *unaff_x19;
  undefined8 *unaff_x20;
  undefined8 uVar1;
  undefined8 in_stack_00000008;
  long in_stack_00000018;
  
  if (in_w8 == 0xdd9) {
    *(undefined1 *)((long)unaff_x19 + 0x17) = 0xf;
    *unaff_x19 = CONCAT17(s_text_javascript_008d2035[7],s_text_javascript_008d2035._0_7_);
    *(ulong *)((long)unaff_x19 + 7) =
         CONCAT71(s_text_javascript_008d2035._8_7_,s_text_javascript_008d2035[7]);
    *(undefined1 *)((long)unaff_x19 + 0xf) = 0;
  }
  else if ((in_w8 == 0x1a2c3) || (in_w8 == 0x1a2c6)) {
    func_0x0000a968();
  }
  else if (*(char *)((long)unaff_x20 + 0x17) < '\0') {
    func_0x00017634();
  }
  else {
    uVar1 = *unaff_x20;
    unaff_x19[1] = unaff_x20[1];
    *unaff_x19 = uVar1;
    unaff_x19[2] = unaff_x20[2];
  }
  if (in_stack_00000018 < 0) {
    __ZdlPv(in_stack_00000008);
    return;
  }
  return;
}

