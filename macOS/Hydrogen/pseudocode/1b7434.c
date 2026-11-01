
void FUN_001b7434(void)

{
  undefined8 uVar1;
  long *unaff_x19;
  long unaff_x20;
  long unaff_x21;
  long lVar2;
  ulong unaff_x22;
  long unaff_x23;
  
  func_0x00458a18();
  *(char *)(unaff_x19[1] + unaff_x23) = (char)unaff_x22;
  lVar2 = unaff_x21 + 3;
  unaff_x19[2] = lVar2;
  uVar1 = *(undefined8 *)(unaff_x20 + 0x10);
  if ((ulong)(*unaff_x19 - lVar2) < unaff_x22) {
    func_0x0079b61c();
    lVar2 = unaff_x19[2];
  }
  _memcpy(unaff_x19[1] + lVar2,uVar1);
  unaff_x19[2] = lVar2 + unaff_x22;
  return;
}

