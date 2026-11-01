
bool FUN_0050fa80(undefined8 param_1)

{
  undefined8 uVar1;
  long lVar2;
  ulong uVar3;
  long unaff_x29;
  undefined1 uStack000000000000000e;
  
  func_0x0050d6e0(param_1,&uStack000000000000000e,2);
  uVar1 = *(undefined8 *)(unaff_x29 + -0x48);
  *(undefined8 *)(unaff_x29 + -0x38) = uVar1;
  *(undefined8 *)(unaff_x29 + -0x30) = *(undefined8 *)(unaff_x29 + -0x40);
  *(undefined1 *)(unaff_x29 + -0x28) = 0xc;
  do {
    lVar2 = func_0x0051110c(unaff_x29 + -0x38,unaff_x29 + -0x28);
    if (lVar2 == 0) break;
    uVar3 = func_0x0046adc0(lVar2);
  } while ((uVar3 & 1) == 0);
  if (*(long *)(unaff_x29 + -0x50) != 0) {
    func_0x00187bd4(uVar1,*(long *)(unaff_x29 + -0x50),1);
  }
  return lVar2 != 0;
}

