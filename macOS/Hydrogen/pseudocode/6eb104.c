
undefined8 FUN_006eb104(void)

{
  uint uVar1;
  int iVar2;
  long lVar3;
  undefined8 uVar4;
  ulong uVar5;
  double dVar6;
  long in_stack_00000008;
  
  lVar3 = func_0x006e6914();
  dVar6 = (double)func_0x006e6a4c();
  uVar5 = (ulong)dVar6;
  uVar1 = func_0x006e6bc0();
  func_0x006e6c78();
  if (-1 < (long)uVar5) {
    if (0x20 < uVar1) goto LAB_006eb1f0;
    if (uVar1 + uVar5 <= (ulong)(in_stack_00000008 * 8)) {
      _memcpy();
      _memcpy(lVar3 + (uVar5 >> 3 & 0xffffffff));
      return 0;
    }
  }
  func_0x006e644c();
LAB_006eb1f0:
  uVar4 = func_0x006e644c();
  if (((bRam0000000000a278d0 & 1) != 0) || (uVar4 = ___cxa_guard_acquire(0xa278d0), (int)uVar4 == 0)
     ) {
    return uVar4;
  }
  if (((bRam0000000000a28b60 & 1) == 0) && (iVar2 = ___cxa_guard_acquire(0xa28b60), iVar2 != 0)) {
    lRam0000000000a28b58 = __dyld_get_image_header(0);
    ___cxa_guard_release(0xa28b60);
  }
  lRam0000000000a278c8 = lRam0000000000a28b58 + 0x1560254;
                    /* WARNING: Could not recover jumptable at 0x007b2ff8. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  uVar4 = (*(code *)PTR____cxa_guard_release_00a24b40)(0xa278d0);
  return uVar4;
}

