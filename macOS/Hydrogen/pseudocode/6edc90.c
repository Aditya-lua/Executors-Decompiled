
void FUN_006edc90(void)

{
  long lVar1;
  long lVar2;
  undefined8 uVar3;
  int iVar4;
  long lVar5;
  long lVar6;
  long unaff_x20;
  long unaff_x21;
  int unaff_w23;
  long unaff_x25;
  int unaff_w26;
  long unaff_x27;
  long unaff_x29;
  undefined8 in_stack_00000008;
  undefined1 uStack0000000000000018;
  long in_stack_00000038;
  long in_stack_00000048;
  undefined8 in_stack_00000050;
  undefined8 in_stack_00000058;
  
  while( true ) {
    unaff_x21 = unaff_x27 + unaff_x21;
    if ((0x14 < unaff_w23) && (unaff_w26 == 9)) {
      _snprintf(&uStack0000000000000018,0x20,"... (+%d frames)\n");
      lVar6 = _strlen(&uStack0000000000000018);
      lVar1 = unaff_x25 - unaff_x21;
      if ((ulong)(lVar6 + unaff_x21) < 0x1000) {
        lVar1 = lVar6;
      }
      _memcpy(unaff_x20 + unaff_x21,&uStack0000000000000018,lVar1);
      unaff_x21 = lVar1 + unaff_x21;
      unaff_w26 = in_stack_00000008._4_4_;
    }
    unaff_w26 = unaff_w26 + 1;
    iVar4 = func_0x006ecb14();
    uVar3 = in_stack_00000050;
    if (iVar4 == 0) break;
    if (in_stack_00000048 != 0) {
      lVar6 = _strlen(in_stack_00000050);
      lVar1 = unaff_x25 - unaff_x21;
      if ((ulong)(lVar6 + unaff_x21) < 0x1000) {
        lVar1 = lVar6;
      }
      _memcpy(unaff_x20 + unaff_x21,uVar3,lVar1);
      unaff_x21 = lVar1 + unaff_x21;
    }
    if (0 < in_stack_00000058._4_4_) {
      _snprintf(&uStack0000000000000018,0x20,":%d");
      lVar6 = _strlen(&uStack0000000000000018);
      lVar1 = unaff_x25 - unaff_x21;
      if ((ulong)(lVar6 + unaff_x21) < 0x1000) {
        lVar1 = lVar6;
      }
      _memcpy(unaff_x20 + unaff_x21,&uStack0000000000000018,lVar1);
      unaff_x21 = lVar1 + unaff_x21;
    }
    lVar1 = in_stack_00000038;
    if (in_stack_00000038 != 0) {
      lVar6 = unaff_x25 - unaff_x21;
      if (0xffffffffffffefff < unaff_x21 - 0xff6U) {
        lVar6 = 10;
      }
      _memcpy(unaff_x20 + unaff_x21," function ",lVar6);
      lVar6 = lVar6 + unaff_x21;
      lVar5 = _strlen(lVar1);
      lVar2 = unaff_x25 - lVar6;
      if ((ulong)(lVar5 + lVar6) < 0x1000) {
        lVar2 = lVar5;
      }
      _memcpy(unaff_x20 + lVar6,lVar1,lVar2);
      unaff_x21 = lVar2 + lVar6;
    }
    unaff_x27 = unaff_x25 - unaff_x21;
    if (0xffffffffffffefff < unaff_x21 - 0xfffU) {
      unaff_x27 = 1;
    }
    _memcpy(unaff_x20 + unaff_x21);
  }
  *(undefined1 *)(unaff_x20 + unaff_x21) = 0;
  if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x60)) {
    return;
  }
  ___stack_chk_fail();
  if (((bRam0000000000a278d0 & 1) != 0) || (iVar4 = ___cxa_guard_acquire(0xa278d0), iVar4 == 0)) {
    return;
  }
  if (((bRam0000000000a28b60 & 1) == 0) && (iVar4 = ___cxa_guard_acquire(0xa28b60), iVar4 != 0)) {
    lRam0000000000a28b58 = __dyld_get_image_header(0);
    ___cxa_guard_release(0xa28b60);
  }
  lRam0000000000a278c8 = lRam0000000000a28b58 + 0x1560254;
                    /* WARNING: Could not recover jumptable at 0x007b2ff8. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR____cxa_guard_release_00a24b40)(0xa278d0);
  return;
}

