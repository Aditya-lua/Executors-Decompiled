
void FUN_0064fb38(void)

{
  undefined8 *puVar1;
  long extraout_x1;
  long *unaff_x19;
  long unaff_x20;
  undefined8 *puVar2;
  long unaff_x24;
  long unaff_x25;
  long unaff_x27;
  undefined8 unaff_x28;
  long in_stack_00000000;
  long in_stack_00000020;
  
  while (unaff_x24 = unaff_x24 + 0x70, unaff_x27 != unaff_x24) {
    puVar1 = (undefined8 *)(unaff_x25 + unaff_x24);
    *puVar1 = unaff_x28;
    func_0x005fe0b4(puVar1 + 1);
    func_0x005fe0b4(puVar1 + 7);
    *(undefined1 *)(unaff_x25 + unaff_x24 + 0x68) = *(undefined1 *)(unaff_x20 + 0x68);
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

