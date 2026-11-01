
undefined8 thunk_FUN_006ec310(void)

{
  int iVar1;
  long lVar2;
  undefined8 uVar3;
  undefined8 uVar4;
  uint uVar5;
  ulong uVar6;
  long lVar7;
  long unaff_x29;
  undefined1 uStack0000000000000027;
  long in_stack_00000028;
  undefined8 in_stack_00000030;
  long in_stack_00000038;
  undefined8 in_stack_00000040;
  undefined8 in_stack_00000048;
  undefined8 uStack0000000000000160;
  undefined1 *in_stack_00000168;
  
  lVar2 = func_0x006e671c();
  iVar1 = func_0x006e6c08();
  if (iVar1 < 0) {
    func_0x006e63b0();
  }
  else {
    func_0x006e7258();
    if (lVar2 != 0) {
      uVar3 = _strlen(lVar2);
      func_0x006e7378(&uStack0000000000000160,lVar2,uVar3);
      func_0x006e7378(&uStack0000000000000160,"\n",1);
    }
    iVar1 = func_0x006ecb14();
    while (iVar1 != 0) {
      iVar1 = _strcmp(in_stack_00000030,"C");
      uVar3 = in_stack_00000040;
      if (iVar1 != 0) {
        if (in_stack_00000038 != 0) {
          uVar4 = _strlen(in_stack_00000040);
          func_0x006e7378(&uStack0000000000000160,uVar3,uVar4);
        }
        if (0 < (int)in_stack_00000048._4_4_) {
          uVar6 = (ulong)in_stack_00000048._4_4_;
          lVar2 = 0;
          do {
            lVar7 = lVar2;
            uVar5 = (uint)uVar6;
            (&uStack0000000000000027)[lVar7] = (char)uVar6 + (char)(uVar6 / 10) * -10 | 0x30;
            uVar6 = uVar6 / 10;
            lVar2 = lVar7 + -1;
          } while (9 < uVar5);
          if (in_stack_00000168 <= uStack0000000000000160) {
            func_0x006e7288(&uStack0000000000000160,1);
          }
          *uStack0000000000000160 = 0x3a;
          uStack0000000000000160 = uStack0000000000000160 + 1;
          func_0x006e7378(&uStack0000000000000160,&uStack0000000000000027 + lVar7,-(lVar7 + -1));
        }
        if (in_stack_00000028 != 0) {
          func_0x006e7378(&uStack0000000000000160," function ",10);
          lVar2 = in_stack_00000028;
          uVar3 = _strlen(in_stack_00000028);
          func_0x006e7378(&uStack0000000000000160,lVar2,uVar3);
        }
        if (in_stack_00000168 <= uStack0000000000000160) {
          func_0x006e7288(&uStack0000000000000160,1);
        }
        *uStack0000000000000160 = 10;
        uStack0000000000000160 = uStack0000000000000160 + 1;
      }
      iVar1 = func_0x006ecb14();
    }
    func_0x006e79b0(&uStack0000000000000160);
    if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x60)) {
      return 1;
    }
  }
  uVar3 = ___stack_chk_fail();
  if (((bRam0000000000a278d0 & 1) != 0) || (uVar3 = ___cxa_guard_acquire(0xa278d0), (int)uVar3 == 0)
     ) {
    return uVar3;
  }
  if (((bRam0000000000a28b60 & 1) == 0) && (iVar1 = ___cxa_guard_acquire(0xa28b60), iVar1 != 0)) {
    lRam0000000000a28b58 = __dyld_get_image_header(0);
    ___cxa_guard_release(0xa28b60);
  }
  lRam0000000000a278c8 = lRam0000000000a28b58 + 0x1560254;
                    /* WARNING: Could not recover jumptable at 0x007b2ff8. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  uVar3 = (*(code *)PTR____cxa_guard_release_00a24b40)(0xa278d0);
  return uVar3;
}

