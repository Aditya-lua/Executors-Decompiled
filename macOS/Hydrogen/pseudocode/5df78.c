
void FUN_0005df78(void)

{
  uint in_w8;
  uint in_w9;
  undefined8 *unaff_x19;
  undefined8 *unaff_x20;
  undefined8 uVar1;
  undefined8 in_stack_00000008;
  long in_stack_00000018;
  
  if (in_w8 == (in_w9 & 0xffff | 0x10000)) {
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

