
undefined8 FUN_00754c68(void)

{
  int iVar1;
  long lVar2;
  undefined8 uVar3;
  undefined *puVar4;
  uint in_w8;
  long unaff_x19;
  int unaff_w22;
  uint unaff_w23;
  undefined8 uStack0000000000000008;
  
  if (((in_w8 >> 0xf & 1) == 0) &&
     ((((in_w8 >> 0x12 & 1) != 0 || (lVar2 = func_0x00782efc(), lVar2 == 0)) &&
      (uVar3 = func_0x00740a18(), (int)uVar3 != 0)))) {
    return uVar3;
  }
  if (((unaff_w23 & 0xfffffffe) == 2) &&
     (*(long *)("/System/Library/Frameworks/Foundation.framework/Versions/C/Foundation" +
               unaff_x19 + 0x40) != 0)) {
    lVar2 = *(long *)(*(long *)(
                               "/System/Library/Frameworks/Foundation.framework/Versions/C/Foundation"
                               + unaff_x19 + 0x40) + 0x48);
    if (lVar2 != 0) {
      do {
        uVar3 = func_0x00740a18();
        if ((int)uVar3 != 0) {
          return uVar3;
        }
        lVar2 = *(long *)(lVar2 + 8);
      } while (lVar2 != 0);
      goto LAB_00754ce8;
    }
  }
  else {
LAB_00754ce8:
    if (((unaff_w23 == 1) && (lVar2 = func_0x00782efc(), lVar2 == 0)) &&
       (uVar3 = func_0x0074075c(), (int)uVar3 != 0)) {
      return uVar3;
    }
  }
  if (*(int *)(unaff_x19 + 0x13c) == 0) {
    lVar2 = func_0x00782efc();
    if (lVar2 != 0) {
      iVar1 = func_0x007537a0(lVar2,"Expect:",7,"100-continue",0xc);
      goto LAB_00754d14;
    }
    iVar1 = 0;
    if ((unaff_w22 != 0xb) || ((*(uint *)(&UNK_00001344 + unaff_x19) >> 9 & 1) != 0))
    goto LAB_00754d14;
    puVar4 = (undefined *)func_0x00774c40();
    if (&UNK_00100001 <= puVar4) {
      uVar3 = func_0x0074075c();
      if ((int)uVar3 != 0) {
        return uVar3;
      }
      iVar1 = 1;
      goto LAB_00754d14;
    }
  }
  iVar1 = 0;
LAB_00754d14:
  uVar3 = func_0x0074075c();
  if ((int)uVar3 == 0) {
    func_0x00770580();
    if (iVar1 != 0) {
      uStack0000000000000008 = 0;
      uVar3 = func_0x00774234(&uStack0000000000000008);
      if (((int)uVar3 != 0) || (uVar3 = func_0x00774738(), (int)uVar3 != 0)) {
        if (uStack0000000000000008 == 0) {
          return uVar3;
        }
        func_0x007742f4();
        return uVar3;
      }
      *(undefined4 *)(*(long *)(uStack0000000000000008 + 0x10) + 0x30) = 2;
    }
    func_0x00783e98();
    uVar3 = 0;
  }
  return uVar3;
}

