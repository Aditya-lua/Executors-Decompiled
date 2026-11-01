
void FUN_00717044(void)

{
  undefined8 uVar1;
  char cVar2;
  undefined8 uVar3;
  int in_w8;
  undefined8 *unaff_x19;
  long unaff_x20;
  undefined8 unaff_x21;
  undefined8 unaff_x22;
  undefined4 unaff_w24;
  undefined8 in_stack_00000000;
  undefined8 in_stack_00000008;
  
  if (in_w8 != 0x7c) {
    func_0x0071f5c8();
    *(undefined4 *)(unaff_x20 + 0x114) = unaff_w24;
  }
  uVar3 = func_0x0071cf0c();
  *(undefined4 *)(unaff_x20 + 0x114) = unaff_w24;
  cVar2 = *(char *)(unaff_x20 + 0x58);
  unaff_x19[2] = in_stack_00000008;
  unaff_x19[1] = in_stack_00000000;
  uVar1 = 0;
  if (cVar2 != '\0') {
    uVar1 = unaff_x22;
  }
  *unaff_x19 = unaff_x21;
  unaff_x19[3] = uVar3;
  unaff_x19[4] = uVar1;
  return;
}

