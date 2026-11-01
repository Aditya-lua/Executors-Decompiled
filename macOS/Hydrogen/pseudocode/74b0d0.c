
undefined8 FUN_0074b0d0(long param_1)

{
  char in_NG;
  char in_OV;
  long unaff_x21;
  undefined8 uStack0000000000000000;
  char *pcStack0000000000000008;
  
  if ((in_NG == in_OV) && (0 < iRam0000000000a2b570)) {
    uStack0000000000000000 = *(undefined8 *)(&UNK_00a1e570 + param_1 * 8);
    pcStack0000000000000008 = "LIST";
    func_0x0073cfbc();
  }
  *(undefined1 *)(unaff_x21 + 0x4f6) = 0x1f;
  return 0;
}

