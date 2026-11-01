
void FUN_0064b1e0(void)

{
  long lVar1;
  undefined8 *puVar2;
  long lVar3;
  long *unaff_x19;
  long unaff_x21;
  undefined8 *puVar4;
  long unaff_x22;
  long lVar5;
  long lVar6;
  long in_stack_00000010;
  long in_stack_00000020;
  
  lVar6 = unaff_x21 * 0x30;
  lVar1 = unaff_x22 + lVar6;
  do {
    func_0x005fe0b4(unaff_x22);
    unaff_x22 = unaff_x22 + 0x30;
    lVar6 = lVar6 + -0x30;
  } while (lVar6 != 0);
  lVar5 = 0;
  lVar6 = *unaff_x19;
  lVar3 = unaff_x19[1];
  while (lVar3 + lVar5 != lVar6) {
    lVar5 = lVar5 + -0x30;
    func_0x005fe0b4(lVar5 + in_stack_00000010,lVar5 + lVar3);
  }
  puVar2 = (undefined8 *)*unaff_x19;
  puVar4 = (undefined8 *)unaff_x19[1];
  *unaff_x19 = in_stack_00000010 + lVar5;
  unaff_x19[2] = in_stack_00000020;
  unaff_x19[1] = lVar1;
  while (puVar4 != puVar2) {
    puVar4 = puVar4 + -6;
    (**(code **)*puVar4)(puVar4);
  }
  if (puVar2 == (undefined8 *)0x0) {
    return;
  }
  __ZdlPv(puVar2);
  return;
}

