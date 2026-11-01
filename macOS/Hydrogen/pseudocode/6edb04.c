
undefined8 FUN_006edb04(long param_1)

{
  int iVar1;
  int iVar2;
  int iVar3;
  long lVar4;
  long lVar5;
  undefined8 uVar6;
  long lVar7;
  long unaff_x22;
  long lVar8;
  long unaff_x29;
  undefined1 uStack0000000000000018;
  undefined8 uStack0000000000000038;
  long in_stack_00000048;
  undefined8 in_stack_00000050;
  undefined8 in_stack_00000058;
  
  lVar8 = *(long *)(param_1 + 0x40);
  iVar2 = func_0x006ecb14(param_1,0,"sln",&uStack0000000000000038);
  if (iVar2 == 0) {
    lVar7 = 0;
  }
  else {
    iVar2 = 0;
    lVar7 = 0;
    iVar1 = (int)((ulong)(unaff_x22 - lVar8) >> 3) * -0x33333333;
    do {
      uVar6 = in_stack_00000050;
      if (in_stack_00000048 != 0) {
        lVar4 = _strlen(in_stack_00000050);
        lVar8 = 0xfff - lVar7;
        if ((ulong)(lVar4 + lVar7) < 0x1000) {
          lVar8 = lVar4;
        }
        _memcpy(lVar7 + 0xa3f1b8,uVar6,lVar8);
        lVar7 = lVar8 + lVar7;
      }
      if (0 < in_stack_00000058._4_4_) {
        _snprintf(&uStack0000000000000018,0x20,":%d");
        lVar4 = _strlen(&uStack0000000000000018);
        lVar8 = 0xfff - lVar7;
        if ((ulong)(lVar4 + lVar7) < 0x1000) {
          lVar8 = lVar4;
        }
        _memcpy(lVar7 + 0xa3f1b8,&uStack0000000000000018,lVar8);
        lVar7 = lVar8 + lVar7;
      }
      lVar8 = uStack0000000000000038;
      if (uStack0000000000000038 != 0) {
        lVar4 = 0xfff - lVar7;
        if (0xffffffffffffefff < lVar7 - 0xff6U) {
          lVar4 = 10;
        }
        _memcpy(lVar7 + 0xa3f1b8," function ",lVar4);
        lVar4 = lVar4 + lVar7;
        lVar5 = _strlen(lVar8);
        lVar7 = 0xfff - lVar4;
        if ((ulong)(lVar5 + lVar4) < 0x1000) {
          lVar7 = lVar5;
        }
        _memcpy(lVar4 + 0xa3f1b8,lVar8,lVar7);
        lVar7 = lVar7 + lVar4;
      }
      lVar8 = 0xfff - lVar7;
      if (0xffffffffffffefff < lVar7 - 0xfffU) {
        lVar8 = 1;
      }
      _memcpy(lVar7 + 0xa3f1b8,"\n",lVar8);
      lVar7 = lVar8 + lVar7;
      if ((0x14 < iVar1) && (iVar2 == 9)) {
        _snprintf(&uStack0000000000000018,0x20,"... (+%d frames)\n");
        lVar4 = _strlen(&uStack0000000000000018);
        lVar8 = 0xfff - lVar7;
        if ((ulong)(lVar4 + lVar7) < 0x1000) {
          lVar8 = lVar4;
        }
        _memcpy(lVar7 + 0xa3f1b8,&uStack0000000000000018,lVar8);
        lVar7 = lVar8 + lVar7;
        iVar2 = iVar1 + -0xb;
      }
      iVar2 = iVar2 + 1;
      iVar3 = func_0x006ecb14();
    } while (iVar3 != 0);
  }
  *(undefined1 *)(lVar7 + 0xa3f1b8) = 0;
  if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x60)) {
    return 0xa3f1b8;
  }
  uVar6 = ___stack_chk_fail();
  if (((bRam0000000000a278d0 & 1) != 0) || (uVar6 = ___cxa_guard_acquire(0xa278d0), (int)uVar6 == 0)
     ) {
    return uVar6;
  }
  if (((bRam0000000000a28b60 & 1) == 0) && (iVar2 = ___cxa_guard_acquire(0xa28b60), iVar2 != 0)) {
    lRam0000000000a28b58 = __dyld_get_image_header(0);
    ___cxa_guard_release(0xa28b60);
  }
  lRam0000000000a278c8 = lRam0000000000a28b58 + 0x1560254;
                    /* WARNING: Could not recover jumptable at 0x007b2ff8. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  uVar6 = (*(code *)PTR____cxa_guard_release_00a24b40)(0xa278d0);
  return uVar6;
}

