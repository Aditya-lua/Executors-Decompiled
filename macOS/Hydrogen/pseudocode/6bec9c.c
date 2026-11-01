
void FUN_006bec9c(void)

{
  int iVar1;
  int iVar2;
  int unaff_w19;
  undefined8 *unaff_x20;
  undefined1 unaff_w21;
  undefined8 unaff_x22;
  undefined8 *unaff_x23;
  
  *unaff_x23 = unaff_x22;
  unaff_x20[0x13] = unaff_x20[0x13] + 1;
  *(undefined1 *)(unaff_x23 + 1) = unaff_w21;
  *(undefined1 *)((long)unaff_x23 + 9) = 1;
  iVar2 = func_0x006b3150(*unaff_x20);
  iVar1 = iVar2;
  if (unaff_w19 != -1) {
    iVar1 = unaff_w19;
  }
  *(int *)((long)unaff_x23 + 0xc) = iVar2;
  *(int *)(unaff_x23 + 2) = iVar1;
  return;
}

