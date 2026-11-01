
void FUN_0064fb1c(undefined8 *param_1)

{
  undefined8 *puVar1;
  long extraout_x1;
  long *unaff_x19;
  long unaff_x20;
  undefined8 *puVar2;
  long unaff_x24;
  long unaff_x25;
  undefined8 *unaff_x26;
  long unaff_x27;
  undefined8 unaff_x28;
  long in_stack_00000000;
  long in_stack_00000020;
  
  while( true ) {
    func_0x005fe0b4(param_1);
    func_0x005fe0b4(unaff_x26 + 7);
    *(undefined1 *)(unaff_x25 + unaff_x24 + 0x68) = *(undefined1 *)(unaff_x20 + 0x68);
    unaff_x24 = unaff_x24 + 0x70;
    if (unaff_x27 == unaff_x24) break;
    unaff_x26 = (undefined8 *)(unaff_x25 + unaff_x24);
    param_1 = unaff_x26 + 1;
    *unaff_x26 = unaff_x28;
  }
  func_0x0064fd0c();
  puVar1 = (undefined8 *)*unaff_x19;
  puVar2 = (undefined8 *)unaff_x19[1];
  *unaff_x19 = extraout_x1;
  unaff_x19[1] = in_stack_00000000;
  unaff_x19[2] = in_stack_00000020;
  while (puVar2 != puVar1) {
    puVar2 = puVar2 + -0xe;
    (**(code **)*puVar2)(puVar2);
  }
  if (puVar1 != (undefined8 *)0x0) {
    __ZdlPv(puVar1);
  }
  return;
}

