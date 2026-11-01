
void FUN_004e8e58(undefined8 param_1)

{
  undefined8 uVar1;
  undefined8 uVar2;
  undefined8 *puVar3;
  long *unaff_x19;
  long unaff_x20;
  long unaff_x21;
  long unaff_x22;
  long unaff_x23;
  undefined8 uStack0000000000000008;
  long in_stack_00000010;
  long in_stack_00000018;
  undefined1 uStack0000000000000020;
  undefined1 uStack0000000000000040;
  undefined1 uStack0000000000000048;
  undefined8 uStack0000000000000050;
  
  uStack0000000000000050 = *(undefined8 *)(unaff_x22 + 0x30);
  _uStack0000000000000040 = param_1;
  while (puVar3 = (undefined8 *)
                  func_0x005203a4(&uStack0000000000000020,&uStack0000000000000040,
                                  &uStack0000000000000048), puVar3 != (undefined8 *)0x0) {
    uVar1 = *puVar3;
    uVar2 = puVar3[1];
    if (unaff_x20 == uStack0000000000000008) {
      func_0x007a5594(&uStack0000000000000008,unaff_x20,1,8,0x10);
      unaff_x21 = in_stack_00000010;
    }
    *(undefined8 *)(unaff_x21 + unaff_x23 + 0x10) = uVar1;
    *(undefined8 *)(unaff_x21 + unaff_x23 + 0x18) = uVar2;
    unaff_x20 = unaff_x20 + 1;
    unaff_x23 = unaff_x23 + 0x10;
    in_stack_00000018 = unaff_x20;
  }
  unaff_x19[1] = in_stack_00000010;
  *unaff_x19 = uStack0000000000000008;
  unaff_x19[2] = in_stack_00000018;
  return;
}

