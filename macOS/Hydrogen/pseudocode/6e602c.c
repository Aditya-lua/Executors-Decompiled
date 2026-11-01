
void FUN_006e602c(undefined8 param_1)

{
  undefined8 *puVar1;
  long unaff_x19;
  
  puVar1 = *(undefined8 **)(unaff_x19 + 8);
  *puVar1 = param_1;
  *(undefined4 *)((long)puVar1 + 0xc) = 6;
  *(long *)(unaff_x19 + 8) = *(long *)(unaff_x19 + 8) + 0x10;
  return;
}

