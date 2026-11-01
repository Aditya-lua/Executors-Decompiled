
ulong FUN_006eba54(void)

{
  int iVar1;
  uint uVar2;
  long lVar3;
  long lVar4;
  ulong unaff_x21;
  ulong uVar5;
  undefined1 auVar6 [16];
  
  uVar5 = unaff_x21;
  func_0x006e190c();
  if (-1 < (int)unaff_x21) {
    return unaff_x21;
  }
  iVar1 = func_0x006e24a4();
  if (iVar1 != 0) {
    func_0x006e6594();
    func_0x006e1ee0();
    func_0x006e5524();
  }
  func_0x006e52d0();
  auVar6 = func_0x006e644c();
  lVar4 = auVar6._8_8_;
  lVar3 = auVar6._0_8_;
  if ((*(char *)(lVar4 + 3) != '\x01') && (iVar1 = func_0x006e4fd4(lVar3,lVar4), iVar1 != 1)) {
    func_0x006e3a84(lVar3,"cannot resume %s coroutine");
    return 0xffffffff;
  }
  if ((int)uVar5 == 0) {
    if (0x1f400 < *(long *)(lVar4 + 8) - *(long *)(lVar4 + 0x10)) goto code_r0x006ebc40;
  }
  else {
    iVar1 = func_0x006e17a8(lVar4,uVar5);
    if (iVar1 == 0) {
code_r0x006ebc40:
      func_0x006e644c(lVar3,"too many arguments to resume");
      goto code_r0x006ebc50;
    }
    func_0x006e190c(lVar3,lVar4,uVar5);
  }
  *(undefined1 *)(lVar4 + 6) = *(undefined1 *)(lVar3 + 6);
  uVar2 = func_0x006ee720(lVar4,lVar3,uVar5);
  if (1 < uVar2) {
    if (uVar2 == 6) {
      return 0xfffffffe;
    }
    func_0x006e190c(lVar4,lVar3,1);
    return 0xffffffff;
  }
  uVar5 = (ulong)(*(long *)(lVar4 + 8) - *(long *)(lVar4 + 0x10)) >> 4;
  iVar1 = (int)uVar5;
  if (iVar1 != 0) {
    if ((0x13 < iVar1) && (iVar1 = func_0x006e17a8(lVar3,iVar1 + 1), iVar1 == 0)) {
code_r0x006ebc50:
      uVar5 = func_0x006e644c(lVar3,"too many results to resume");
      if (((bRam0000000000a278d0 & 1) != 0) ||
         (uVar5 = ___cxa_guard_acquire(0xa278d0), (int)uVar5 == 0)) {
        return uVar5;
      }
      if (((bRam0000000000a28b60 & 1) == 0) && (iVar1 = ___cxa_guard_acquire(0xa28b60), iVar1 != 0))
      {
        lRam0000000000a28b58 = __dyld_get_image_header(0);
        ___cxa_guard_release(0xa28b60);
      }
      lRam0000000000a278c8 = lRam0000000000a28b58 + 0x1560254;
                    /* WARNING: Could not recover jumptable at 0x007b2ff8. Too many branches */
                    /* WARNING: Treating indirect jump as call */
      uVar5 = (*(code *)PTR____cxa_guard_release_00a24b40)(0xa278d0);
      return uVar5;
    }
    func_0x006e190c(lVar4,lVar3,uVar5);
  }
  return uVar5;
}

