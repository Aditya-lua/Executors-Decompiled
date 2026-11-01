
void FUN_006257e4(undefined8 param_1,undefined8 param_2)

{
  ulong uVar1;
  long lVar2;
  long lVar3;
  ulong uVar4;
  ulong unaff_x19;
  long unaff_x20;
  
  uVar1 = func_0x00602310(param_2,0);
  if (uVar1 == 0) {
    lVar2 = 0;
  }
  else {
    lVar2 = func_0x006115d0();
  }
  func_0x00602310();
  func_0x00602560();
  if (uVar1 == unaff_x19) {
    func_0x0003fdb0();
    goto joined_r0x006258a8;
  }
  *(undefined8 *)(unaff_x20 + 8) = 0xffffffffffffffff;
  *(ulong *)(unaff_x20 + 0x10) = unaff_x19;
  if (unaff_x19 == 0) {
    lVar3 = 0;
    *(undefined8 *)(unaff_x20 + 0x18) = 0;
    uVar4 = uVar1;
    if (uVar1 == 0) goto LAB_006258c0;
  }
  else {
    lVar3 = func_0x006115d0();
    *(long *)(unaff_x20 + 0x18) = lVar3;
    uVar4 = uVar1 - unaff_x19;
    if (uVar1 < unaff_x19 || uVar1 - unaff_x19 == 0) {
LAB_006258c0:
      _bzero(lVar3,unaff_x19 - uVar1);
      _memcpy(lVar3 + (unaff_x19 - uVar1),lVar2,uVar1);
      goto joined_r0x006258a8;
    }
  }
  _memcpy(lVar3,lVar2 + uVar4);
joined_r0x006258a8:
  if (lVar2 != 0) {
    if (uVar1 != 0) {
      do {
        *(undefined1 *)(lVar2 + -1 + uVar1) = 0;
        uVar1 = uVar1 - 1;
      } while (uVar1 != 0);
    }
    func_0x00611644(lVar2);
  }
  return;
}

