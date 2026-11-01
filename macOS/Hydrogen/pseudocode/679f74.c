
void FUN_00679f74(void)

{
  bool in_CY;
  long *unaff_x21;
  uint uVar1;
  
  if (in_CY) {
    uVar1 = 0;
    do {
      (**(code **)(*unaff_x21 + 0x90))();
      (**(code **)(*unaff_x21 + 0x90))();
      (**(code **)(*unaff_x21 + 0x20))();
      func_0x006771a4();
      uVar1 = uVar1 + 1;
    } while (uVar1 < (int)unaff_x21[0x12] - 1U >> 1);
  }
  return;
}

