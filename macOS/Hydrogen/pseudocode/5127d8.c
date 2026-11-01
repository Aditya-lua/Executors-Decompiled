
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_005127d8(void)

{
  undefined8 *unaff_x19;
  undefined1 auVar1 [16];
  
  auVar1 = (*_UNK_009eab08)(1);
  unaff_x19[3] = 0;
  unaff_x19[4] = 8;
  *unaff_x19 = 1;
  *(undefined1 (*) [16])(unaff_x19 + 1) = auVar1;
  unaff_x19[6] = 0;
  unaff_x19[5] = 0;
  unaff_x19[7] = 8;
  unaff_x19[9] = 0;
  unaff_x19[8] = 0;
  unaff_x19[10] = 8;
  unaff_x19[0xb] = 0;
  *(undefined2 *)(unaff_x19 + 0xc) = 0x300;
  return;
}

