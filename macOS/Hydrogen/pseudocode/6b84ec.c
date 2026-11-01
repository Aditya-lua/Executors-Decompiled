
void FUN_006b84ec(void)

{
  undefined8 uVar1;
  undefined8 uVar2;
  long unaff_x19;
  uint *unaff_x20;
  
  uVar2 = *(undefined8 *)(unaff_x20 + 4);
  *(undefined8 *)(unaff_x20 + 4) = *(undefined8 *)(unaff_x19 + -8);
  *(undefined8 *)(unaff_x19 + -8) = uVar2;
  if (unaff_x20[4] < unaff_x20[2]) {
    uVar2 = *(undefined8 *)(unaff_x20 + 2);
    uVar1 = *(undefined8 *)(unaff_x20 + 4);
    *(undefined8 *)(unaff_x20 + 2) = uVar1;
    *(undefined8 *)(unaff_x20 + 4) = uVar2;
    if ((uint)uVar1 < *unaff_x20) {
      uVar2 = *(undefined8 *)unaff_x20;
      *(undefined8 *)unaff_x20 = uVar1;
      *(undefined8 *)(unaff_x20 + 2) = uVar2;
      return;
    }
  }
  return;
}

