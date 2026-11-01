
undefined8 FUN_006ec444(ulong param_1)

{
  int iVar1;
  undefined8 uVar2;
  ulong in_x9;
  long unaff_x24;
  ulong unaff_x25;
  char unaff_w26;
  long unaff_x27;
  char unaff_w28;
  long unaff_x29;
  long in_stack_00000028;
  undefined8 in_stack_00000030;
  long in_stack_00000038;
  undefined8 in_stack_00000040;
  undefined8 in_stack_00000048;
  undefined8 uStack0000000000000160;
  char *in_stack_00000168;
  
  do {
    *(byte *)(unaff_x27 + unaff_x24 + 0x1f) = (char)param_1 - (char)in_x9 * unaff_w26 | 0x30;
    unaff_x24 = unaff_x24 + -1;
    if ((uint)param_1 < 10) {
      if (in_stack_00000168 <= uStack0000000000000160) {
        func_0x006e7288(&uStack0000000000000160,1);
      }
      *uStack0000000000000160 = unaff_w28;
      uStack0000000000000160 = uStack0000000000000160 + 1;
      func_0x006e7378(&uStack0000000000000160,unaff_x27 + unaff_x24 + 0x20,-unaff_x24);
      do {
        if (in_stack_00000028 != 0) {
          func_0x006e7378(&uStack0000000000000160);
          uVar2 = _strlen(in_stack_00000028);
          func_0x006e7378(&uStack0000000000000160,in_stack_00000028,uVar2);
        }
        if (in_stack_00000168 <= uStack0000000000000160) {
          func_0x006e7288(&uStack0000000000000160,1);
        }
        *uStack0000000000000160 = unaff_w26;
        uStack0000000000000160 = uStack0000000000000160 + 1;
        do {
          iVar1 = func_0x006ecb14();
          if (iVar1 == 0) {
            func_0x006e79b0(&uStack0000000000000160);
            if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x60)) {
              return 1;
            }
            uVar2 = ___stack_chk_fail();
            if (((bRam0000000000a278d0 & 1) != 0) ||
               (uVar2 = ___cxa_guard_acquire(0xa278d0), (int)uVar2 == 0)) {
              return uVar2;
            }
            if (((bRam0000000000a28b60 & 1) == 0) &&
               (iVar1 = ___cxa_guard_acquire(0xa28b60), iVar1 != 0)) {
              lRam0000000000a28b58 = __dyld_get_image_header(0);
              ___cxa_guard_release(0xa28b60);
            }
            lRam0000000000a278c8 = lRam0000000000a28b58 + 0x1560254;
                    /* WARNING: Could not recover jumptable at 0x007b2ff8. Too many branches */
                    /* WARNING: Treating indirect jump as call */
            uVar2 = (*(code *)PTR____cxa_guard_release_00a24b40)(0xa278d0);
            return uVar2;
          }
          iVar1 = _strcmp(in_stack_00000030);
        } while (iVar1 == 0);
        if (in_stack_00000038 != 0) {
          uVar2 = _strlen(in_stack_00000040);
          func_0x006e7378(&uStack0000000000000160,in_stack_00000040,uVar2);
        }
        in_x9 = (ulong)in_stack_00000048._4_4_;
      } while ((int)in_stack_00000048._4_4_ < 1);
      unaff_x24 = 0;
    }
    param_1 = in_x9;
    in_x9 = (in_x9 & 0xffffffff) * (unaff_x25 & 0xffffffff) >> 0x23;
  } while( true );
}

