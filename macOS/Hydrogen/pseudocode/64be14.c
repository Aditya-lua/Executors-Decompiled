
long FUN_0064be14(void)

{
  long lVar1;
  undefined8 *puVar2;
  long lVar3;
  long *unaff_x19;
  long lVar4;
  undefined8 *puVar5;
  long in_stack_00000020;
  long in_stack_00000028;
  long in_stack_00000030;
  
  func_0x005fe0b4();
  lVar4 = 0;
  lVar1 = *unaff_x19;
  lVar3 = unaff_x19[1];
  while (lVar3 + lVar4 != lVar1) {
    lVar4 = lVar4 + -0x30;
    func_0x005fe0b4(lVar4 + in_stack_00000020,lVar4 + lVar3);
  }
  puVar2 = (undefined8 *)*unaff_x19;
  puVar5 = (undefined8 *)unaff_x19[1];
  *unaff_x19 = in_stack_00000020 + lVar4;
  unaff_x19[2] = in_stack_00000030;
  unaff_x19[1] = in_stack_00000028 + 0x30;
  while (puVar5 != puVar2) {
    puVar5 = puVar5 + -6;
    (**(code **)*puVar5)(puVar5);
  }
  if (puVar2 != (undefined8 *)0x0) {
    __ZdlPv(puVar2);
  }
  return in_stack_00000028 + 0x30;
}

