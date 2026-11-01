
undefined8 * FUN_0029bcdc(void)

{
  uint uVar1;
  int iVar2;
  undefined4 uVar3;
  undefined8 *unaff_x19;
  undefined8 *unaff_x20;
  
  iVar2 = func_0x0029afb8();
  if (iVar2 != 0) {
    uVar3 = 0;
    if (*(int *)(unaff_x20 + 1) != 0) {
      _memcpy(*unaff_x19,*unaff_x20,(long)*(int *)(unaff_x20 + 1) << 3);
      uVar3 = *(undefined4 *)(unaff_x20 + 1);
    }
    *(undefined4 *)(unaff_x19 + 1) = uVar3;
    *(undefined4 *)(unaff_x19 + 2) = *(undefined4 *)(unaff_x20 + 2);
    return unaff_x19;
  }
  uVar1 = *(uint *)((long)unaff_x19 + 0x14);
  if ((uVar1 >> 1 & 1) == 0) {
    func_0x0036e3d8(*unaff_x19);
    uVar1 = *(uint *)((long)unaff_x19 + 0x14);
  }
  if ((uVar1 & 1) == 0) {
    *unaff_x19 = 0;
    return (undefined8 *)0x0;
  }
  func_0x0036e3d8();
  return (undefined8 *)0x0;
}

