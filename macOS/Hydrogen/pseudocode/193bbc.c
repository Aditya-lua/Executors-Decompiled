
void FUN_00193bbc(void)

{
  undefined8 uVar1;
  undefined8 *unaff_x21;
  long unaff_x22;
  long unaff_x24;
  long unaff_x25;
  long unaff_x26;
  undefined8 uVar2;
  undefined8 uVar3;
  undefined1 uStack0000000000000010;
  undefined8 in_stack_00000018;
  long in_stack_00000028;
  
  _memcpy(unaff_x24 + unaff_x22);
  uVar1 = in_stack_00000018;
  in_stack_00000028 = unaff_x22 + unaff_x25;
  uVar3 = *(undefined8 *)(unaff_x26 + 0x10);
  uVar2 = *(undefined8 *)(unaff_x26 + 8);
  func_0x0019fb28(&uStack0000000000000010);
  _CFRelease();
  _CFRelease();
  *unaff_x21 = uVar1;
  unaff_x21[2] = uVar3;
  unaff_x21[1] = uVar2;
  return;
}

