
void FUN_00056334(void)

{
  long unaff_x19;
  undefined8 *unaff_x20;
  long unaff_x21;
  undefined8 uVar1;
  undefined8 uVar2;
  
  uVar2 = *(undefined8 *)(unaff_x21 + 0x20);
  uVar1 = *(undefined8 *)(unaff_x21 + 0x18);
  unaff_x20[2] = *(undefined8 *)(unaff_x21 + 0x28);
  unaff_x20[1] = uVar2;
  *unaff_x20 = uVar1;
  if (*(char *)(unaff_x21 + 0x47) < '\0') {
    func_0x00017634((undefined8 *)(unaff_x19 + 0x30),*(undefined8 *)(unaff_x21 + 0x30),
                    *(undefined8 *)(unaff_x21 + 0x38));
  }
  else {
    uVar2 = *(undefined8 *)(unaff_x21 + 0x38);
    uVar1 = *(undefined8 *)(unaff_x21 + 0x30);
    *(undefined8 *)(unaff_x19 + 0x40) = *(undefined8 *)(unaff_x21 + 0x40);
    *(undefined8 *)(unaff_x19 + 0x38) = uVar2;
    *(undefined8 *)(unaff_x19 + 0x30) = uVar1;
  }
  *(undefined8 *)(unaff_x19 + 0x50) = 0;
  *(undefined8 *)(unaff_x19 + 0x48) = (undefined8 *)(unaff_x19 + 0x50);
  *(undefined8 *)(unaff_x19 + 0x58) = 0;
  func_0x00056498((undefined8 *)(unaff_x19 + 0x48),*(undefined8 *)(unaff_x21 + 0x48),
                  unaff_x21 + 0x50);
  *(undefined8 *)(unaff_x19 + 0x68) = 0;
  *(undefined8 *)(unaff_x19 + 0x60) = (undefined8 *)(unaff_x19 + 0x68);
  *(undefined8 *)(unaff_x19 + 0x70) = 0;
  func_0x00056498((undefined8 *)(unaff_x19 + 0x60),*(undefined8 *)(unaff_x21 + 0x60),
                  unaff_x21 + 0x68);
  return;
}

