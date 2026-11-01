
void FUN_0011e828(void)

{
  int iVar1;
  long unaff_x19;
  int unaff_w20;
  int unaff_w21;
  
  _memcpy();
  *(undefined1 *)(*(long *)(unaff_x19 + 0x20) + (long)*(int *)(unaff_x19 + 0x28) + (long)unaff_w20)
       = 0;
  iVar1 = *(int *)(unaff_x19 + 0x34);
  if (unaff_w21 <= iVar1) {
    iVar1 = iVar1 + unaff_w20;
    *(int *)(unaff_x19 + 0x34) = iVar1;
  }
  *(int *)(unaff_x19 + 0x38) = iVar1;
  *(int *)(unaff_x19 + 0x3c) = iVar1;
  *(undefined1 *)(unaff_x19 + 0x30) = 1;
  *(int *)(unaff_x19 + 0x28) = *(int *)(unaff_x19 + 0x28) + unaff_w20;
  return;
}

