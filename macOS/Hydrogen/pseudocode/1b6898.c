
void FUN_001b6898(void)

{
  undefined8 uVar1;
  long *unaff_x19;
  long unaff_x20;
  long unaff_x21;
  long lVar2;
  ulong uVar3;
  
  lVar2 = unaff_x21 + 2;
  unaff_x19[2] = lVar2;
  uVar3 = *(ulong *)(unaff_x20 + 0x10);
  if (lVar2 == *unaff_x19) {
    func_0x00458a18();
  }
  *(char *)(unaff_x19[1] + lVar2) = (char)uVar3;
  lVar2 = unaff_x21 + 3;
  unaff_x19[2] = lVar2;
  uVar1 = *(undefined8 *)(unaff_x20 + 8);
  if ((ulong)(*unaff_x19 - lVar2) < uVar3) {
    func_0x0079b61c();
    lVar2 = unaff_x19[2];
  }
  _memcpy(unaff_x19[1] + lVar2,uVar1,uVar3);
  unaff_x19[2] = lVar2 + uVar3;
  return;
}

