
void FUN_001b86d4(void)

{
  undefined8 uVar1;
  ulong uVar2;
  long *unaff_x19;
  long unaff_x20;
  long unaff_x21;
  undefined1 uStack0000000000000000;
  
  uStack0000000000000000 = 0x16;
  uVar1 = *(undefined8 *)(unaff_x20 + 8);
  uVar2 = *(ulong *)(unaff_x20 + 0x10);
  if ((ulong)(*unaff_x19 - unaff_x21) < uVar2) {
    func_0x0079b61c();
    unaff_x21 = unaff_x19[2];
  }
  _memcpy(unaff_x19[1] + unaff_x21,uVar1,uVar2);
  unaff_x19[2] = unaff_x21 + uVar2;
  func_0x0024031c();
  return;
}

