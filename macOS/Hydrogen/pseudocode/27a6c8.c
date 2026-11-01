
void FUN_0027a6c8(void)

{
  int iVar1;
  undefined8 unaff_x19;
  undefined8 *unaff_x22;
  undefined1 unaff_w23;
  
  iVar1 = func_0x002b1e34();
  if (iVar1 == 1) {
    *unaff_x22 = 7;
    unaff_x22[1] = unaff_x19;
    unaff_x22[2] = &UNK_009cd448;
    *(undefined1 *)(unaff_x22 + 3) = unaff_w23;
  }
  else {
    func_0x002b1dc4();
    *unaff_x22 = 0xc;
  }
  return;
}

