
void FUN_00650274(undefined8 param_1,long param_2)

{
  undefined8 *puVar1;
  long *unaff_x19;
  undefined8 *puVar2;
  long unaff_x22;
  long in_stack_00000020;
  
  puVar1 = (undefined8 *)*unaff_x19;
  puVar2 = (undefined8 *)unaff_x19[1];
  *unaff_x19 = param_2;
  unaff_x19[1] = unaff_x22;
  unaff_x19[2] = in_stack_00000020;
  while (puVar2 != puVar1) {
    puVar2 = puVar2 + -10;
    (**(code **)*puVar2)(puVar2);
  }
  if (puVar1 != (undefined8 *)0x0) {
    __ZdlPv(puVar1);
  }
  return;
}

