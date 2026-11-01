
void FUN_006e5ff8(void)

{
  undefined8 uVar1;
  undefined8 *puVar2;
  long unaff_x19;
  
  uVar1 = func_0x006fc344();
  puVar2 = *(undefined8 **)(unaff_x19 + 8);
  *puVar2 = uVar1;
  *(undefined4 *)((long)puVar2 + 0xc) = 6;
  *(long *)(unaff_x19 + 8) = *(long *)(unaff_x19 + 8) + 0x10;
  return;
}

