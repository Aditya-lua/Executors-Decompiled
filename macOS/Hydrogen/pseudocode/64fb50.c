
void FUN_0064fb50(void)

{
  undefined8 *puVar1;
  long extraout_x1;
  long *unaff_x19;
  undefined8 *puVar2;
  long unaff_x22;
  long in_stack_00000020;
  
  func_0x0064fd0c();
  puVar1 = (undefined8 *)*unaff_x19;
  puVar2 = (undefined8 *)unaff_x19[1];
  *unaff_x19 = extraout_x1;
  unaff_x19[1] = unaff_x22;
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

