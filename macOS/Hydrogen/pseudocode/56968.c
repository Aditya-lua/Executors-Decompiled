
void FUN_00056968(void)

{
  long lVar1;
  long *unaff_x19;
  long unaff_x21;
  undefined8 *unaff_x22;
  undefined8 uVar2;
  
  lVar1 = __Znwm();
  *unaff_x19 = lVar1;
  unaff_x19[1] = unaff_x21;
  *(undefined1 *)(unaff_x19 + 2) = 0;
  if (*(char *)((long)unaff_x22 + 0x17) < '\0') {
    func_0x00017634((undefined8 *)(lVar1 + 0x20),*unaff_x22,unaff_x22[1]);
  }
  else {
    uVar2 = *unaff_x22;
    *(undefined8 *)(lVar1 + 0x28) = unaff_x22[1];
    *(undefined8 *)(lVar1 + 0x20) = uVar2;
    *(undefined8 *)(lVar1 + 0x30) = unaff_x22[2];
  }
  if (*(char *)((long)unaff_x22 + 0x2f) < '\0') {
    func_0x00017634((undefined8 *)(lVar1 + 0x38),unaff_x22[3],unaff_x22[4]);
    *(undefined1 *)(unaff_x19 + 2) = 1;
    return;
  }
  uVar2 = unaff_x22[3];
  *(undefined8 *)(lVar1 + 0x40) = unaff_x22[4];
  *(undefined8 *)(lVar1 + 0x38) = uVar2;
  *(undefined8 *)(lVar1 + 0x48) = unaff_x22[5];
  *(undefined1 *)(unaff_x19 + 2) = 1;
  return;
}

