
void FUN_00070198(void)

{
  long unaff_x19;
  long unaff_x21;
  undefined8 uVar1;
  undefined8 uVar2;
  
  func_0x00017634();
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
  if (*(char *)(unaff_x21 + 0x5f) < '\0') {
    func_0x00017634((undefined8 *)(unaff_x19 + 0x48),*(undefined8 *)(unaff_x21 + 0x48),
                    *(undefined8 *)(unaff_x21 + 0x50));
    return;
  }
  uVar2 = *(undefined8 *)(unaff_x21 + 0x50);
  uVar1 = *(undefined8 *)(unaff_x21 + 0x48);
  *(undefined8 *)(unaff_x19 + 0x58) = *(undefined8 *)(unaff_x21 + 0x58);
  *(undefined8 *)(unaff_x19 + 0x50) = uVar2;
  *(undefined8 *)(unaff_x19 + 0x48) = uVar1;
  return;
}

