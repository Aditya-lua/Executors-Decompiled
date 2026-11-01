
undefined8 FUN_006eb138(void)

{
  int iVar1;
  undefined8 uVar2;
  long unaff_x20;
  uint unaff_w22;
  ulong unaff_x23;
  long in_stack_00000008;
  
  if (-1 < (long)unaff_x23) {
    if (0x20 < unaff_w22) goto LAB_006eb1f0;
    if (unaff_w22 + unaff_x23 <= (ulong)(in_stack_00000008 * 8)) {
      _memcpy();
      _memcpy(unaff_x20 + (unaff_x23 >> 3 & 0xffffffff));
      return 0;
    }
  }
  func_0x006e644c();
LAB_006eb1f0:
  uVar2 = func_0x006e644c();
  if (((bRam0000000000a278d0 & 1) != 0) || (uVar2 = ___cxa_guard_acquire(0xa278d0), (int)uVar2 == 0)
     ) {
    return uVar2;
  }
  if (((bRam0000000000a28b60 & 1) == 0) && (iVar1 = ___cxa_guard_acquire(0xa28b60), iVar1 != 0)) {
    lRam0000000000a28b58 = __dyld_get_image_header(0);
    ___cxa_guard_release(0xa28b60);
  }
  lRam0000000000a278c8 = lRam0000000000a28b58 + 0x1560254;
                    /* WARNING: Could not recover jumptable at 0x007b2ff8. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  uVar2 = (*(code *)PTR____cxa_guard_release_00a24b40)(0xa278d0);
  return uVar2;
}

