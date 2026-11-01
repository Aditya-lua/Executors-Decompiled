
void FUN_00651418(void)

{
  undefined8 uVar1;
  undefined8 *unaff_x20;
  long unaff_x21;
  
  uVar1 = *(undefined8 *)(unaff_x21 + 0x10);
  *(undefined8 *)(unaff_x21 + 0x10) = unaff_x20[3];
  unaff_x20[3] = uVar1;
  *unaff_x20 = unaff_x20[1];
  return;
}

