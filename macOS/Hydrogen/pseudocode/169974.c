
void FUN_00169974(void)

{
  undefined8 extraout_x1;
  long unaff_x19;
  undefined1 auStack_20 [16];
  
  *(undefined1 *)(unaff_x19 + 0x1c) = 0;
  *(undefined1 *)(unaff_x19 + 0x1d) = 0;
  *(undefined1 *)(unaff_x19 + 0x1e) = 0;
  *(undefined1 *)(unaff_x19 + 0x1f) = 0;
  __Unwind_Resume();
  func_0x00469240(auStack_20,extraout_x1,&UNK_008148d4,6);
  func_0x00465628(auStack_20);
  return;
}

