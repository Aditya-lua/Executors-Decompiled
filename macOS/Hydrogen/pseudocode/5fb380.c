
void FUN_005fb380(undefined8 param_1)

{
  byte in_CY;
  long in_x10;
  long in_x12;
  long in_x16;
  
  *(undefined8 *)(in_x16 + 0x70) = param_1;
  *(ulong *)(in_x16 + 0x78) = in_x12 + in_x10 + (ulong)in_CY;
  return;
}

