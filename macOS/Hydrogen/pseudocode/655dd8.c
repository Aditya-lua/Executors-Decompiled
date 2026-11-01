
void FUN_00655dd8(void)

{
  long lVar1;
  long lVar2;
  undefined8 uVar3;
  long unaff_x19;
  long unaff_x21;
  long unaff_x22;
  long unaff_x25;
  long unaff_x26;
  
  while (unaff_x25 = unaff_x25 + 0x50, unaff_x26 != unaff_x25) {
    lVar1 = unaff_x21 + unaff_x25;
    lVar2 = unaff_x22 + unaff_x25;
    func_0x00677180(lVar1 + 8,lVar2 + 8);
    func_0x00677180(lVar1 + 0x28,lVar2 + 0x28);
    *(undefined1 *)(lVar1 + 0x48) = *(undefined1 *)(lVar2 + 0x48);
  }
  uVar3 = FUN_00655eb0();
  *(undefined8 *)(unaff_x19 + 8) = uVar3;
  return;
}

