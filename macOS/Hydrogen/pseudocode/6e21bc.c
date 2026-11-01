
void FUN_006e21bc(void)

{
  undefined8 *puVar1;
  undefined8 *puVar2;
  long unaff_x19;
  int unaff_w20;
  undefined8 uVar3;
  
  puVar1 = (undefined8 *)(*(long *)(unaff_x19 + 8) + (long)unaff_w20 * 0x10);
  puVar2 = *(undefined8 **)(unaff_x19 + 8);
  uVar3 = *puVar1;
  puVar2[1] = puVar1[1];
  *puVar2 = uVar3;
  *(long *)(unaff_x19 + 8) = *(long *)(unaff_x19 + 8) + 0x10;
  return;
}

