
ulong FUN_006ebafc(undefined8 param_1,long param_2)

{
  int iVar1;
  uint uVar2;
  long unaff_x19;
  long unaff_x20;
  int unaff_w21;
  ulong uVar3;
  
  if ((*(char *)(param_2 + 3) != '\x01') && (iVar1 = func_0x006e4fd4(), iVar1 != 1)) {
    func_0x006e3a84();
    return 0xffffffff;
  }
  if (unaff_w21 == 0) {
    if (0x1f400 < *(long *)(unaff_x20 + 8) - *(long *)(unaff_x20 + 0x10)) goto LAB_006ebc40;
  }
  else {
    iVar1 = func_0x006e17a8();
    if (iVar1 == 0) {
LAB_006ebc40:
      func_0x006e644c();
      goto LAB_006ebc50;
    }
    func_0x006e190c();
  }
  *(undefined1 *)(unaff_x20 + 6) = *(undefined1 *)(unaff_x19 + 6);
  uVar2 = func_0x006ee720();
  if (1 < uVar2) {
    if (uVar2 == 6) {
      return 0xfffffffe;
    }
    func_0x006e190c();
    return 0xffffffff;
  }
  uVar3 = (ulong)(*(long *)(unaff_x20 + 8) - *(long *)(unaff_x20 + 0x10)) >> 4;
  iVar1 = (int)uVar3;
  if (iVar1 != 0) {
    if ((0x13 < iVar1) && (iVar1 = func_0x006e17a8(), iVar1 == 0)) {
LAB_006ebc50:
      uVar3 = func_0x006e644c();
      if (((bRam0000000000a278d0 & 1) != 0) ||
         (uVar3 = ___cxa_guard_acquire(0xa278d0), (int)uVar3 == 0)) {
        return uVar3;
      }
      if (((bRam0000000000a28b60 & 1) == 0) && (iVar1 = ___cxa_guard_acquire(0xa28b60), iVar1 != 0))
      {
        lRam0000000000a28b58 = __dyld_get_image_header(0);
        ___cxa_guard_release(0xa28b60);
      }
      lRam0000000000a278c8 = lRam0000000000a28b58 + 0x1560254;
                    /* WARNING: Could not recover jumptable at 0x007b2ff8. Too many branches */
                    /* WARNING: Treating indirect jump as call */
      uVar3 = (*(code *)PTR____cxa_guard_release_00a24b40)(0xa278d0);
      return uVar3;
    }
    func_0x006e190c();
  }
  return uVar3;
}

