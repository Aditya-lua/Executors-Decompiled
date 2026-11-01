
void FUN_006206b8(void)

{
  undefined8 *puVar1;
  long unaff_x19;
  undefined8 *unaff_x21;
  
  puVar1 = *(undefined8 **)(unaff_x19 + 8);
  while (puVar1 != unaff_x21) {
    puVar1 = puVar1 + -6;
    (**(code **)*puVar1)(puVar1);
  }
  *(undefined8 **)(unaff_x19 + 8) = unaff_x21;
  __ZdlPv();
  return;
}

