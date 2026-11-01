
void FUN_00638a28(code *param_1)

{
  long lVar1;
  undefined8 *unaff_x19;
  
  lVar1 = (*param_1)();
  *unaff_x19 = &UNK_00a09a40;
  func_0x005fe0b4(unaff_x19 + 1,lVar1 + 8);
  func_0x005fe0b4(unaff_x19 + 7,lVar1 + 0x38);
  *(undefined1 *)(unaff_x19 + 0xd) = *(undefined1 *)(lVar1 + 0x68);
  return;
}

