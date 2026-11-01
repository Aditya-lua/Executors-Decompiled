
void FUN_0027bd9c(long param_1)

{
  int iVar1;
  long lVar2;
  undefined8 uVar3;
  undefined8 *unaff_x19;
  undefined8 unaff_x20;
  undefined8 unaff_x21;
  long unaff_x22;
  undefined *puVar4;
  int unaff_w23;
  long in_stack_00000000;
  undefined8 in_stack_00000008;
  undefined8 in_stack_00000010;
  undefined8 in_stack_00000018;
  undefined8 uStack0000000000000020;
  
  puVar4 = (undefined *)(unaff_x22 + 0x4ad);
  if (param_1 == 0) {
    uVar3 = 0xf;
  }
  else {
    lVar2 = func_0x002c2900();
    if (lVar2 == 0) {
      puVar4 = &UNK_0082c8be;
      uVar3 = 0xf;
    }
    else {
      iVar1 = func_0x002c7494();
      if (iVar1 == unaff_w23) {
        func_0x0026fec8(&uStack0000000000000020);
        if (in_stack_00000000 == 0) {
          func_0x002d8de8();
          unaff_x19[1] = puVar4;
          unaff_x19[2] = 0xf;
          *unaff_x19 = 0;
          return;
        }
        unaff_x19[2] = in_stack_00000008;
        unaff_x19[1] = in_stack_00000000;
        unaff_x19[4] = in_stack_00000018;
        unaff_x19[3] = in_stack_00000010;
        *unaff_x19 = unaff_x21;
        unaff_x19[5] = unaff_x20;
        return;
      }
      puVar4 = &UNK_0082c8cd;
      uVar3 = 0xe;
    }
  }
  unaff_x19[1] = puVar4;
  unaff_x19[2] = uVar3;
  *unaff_x19 = 0;
  func_0x002d8de8();
  return;
}

