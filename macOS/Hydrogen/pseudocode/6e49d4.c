
void FUN_006e49d4(void)

{
  undefined8 *puVar1;
  long lVar2;
  long unaff_x19;
  long *unaff_x22;
  long unaff_x23;
  undefined8 uVar3;
  
  puVar1 = (undefined8 *)func_0x006fc03c();
  uVar3 = *(undefined8 *)(unaff_x23 + -0x10);
  puVar1[1] = *(undefined8 *)(unaff_x23 + -8);
  *puVar1 = uVar3;
  lVar2 = *(long *)(unaff_x19 + 8);
  if (((4 < *(int *)(lVar2 + -4)) && ((*(byte *)(*unaff_x22 + 1) >> 2 & 1) != 0)) &&
     ((*(byte *)(*(long *)(lVar2 + -0x10) + 1) & 3) != 0)) {
    func_0x006f0ea0();
    lVar2 = *(long *)(unaff_x19 + 8);
  }
  *(long *)(unaff_x19 + 8) = lVar2 + -0x10;
  return;
}

