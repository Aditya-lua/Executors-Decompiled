
undefined8 FUN_00793c10(void)

{
  long lVar1;
  undefined8 uVar2;
  long unaff_x19;
  long unaff_x21;
  
  func_0x00740a58();
  lVar1 = func_0x00779d84();
  if (lVar1 == 0) {
    func_0x00740678();
    func_0x00779fa4(*(undefined8 *)(*(long *)(&UNK_00001438 + unaff_x19) + unaff_x21 * 8));
    uVar2 = 0x1b;
  }
  else {
    uVar2 = 0;
  }
  *(long *)(*(long *)(&UNK_00001438 + unaff_x19) + unaff_x21 * 8) = lVar1;
  return uVar2;
}

