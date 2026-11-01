
long FUN_0014cb4c(long *param_1)

{
  ulong uVar1;
  undefined8 uVar2;
  undefined8 uVar3;
  undefined8 uVar4;
  undefined8 extraout_x1;
  undefined8 extraout_x1_00;
  undefined8 extraout_x1_01;
  undefined1 *puVar5;
  undefined8 unaff_x19;
  ulong unaff_x20;
  long unaff_x23;
  long unaff_x25;
  long lVar6;
  long unaff_x27;
  long unaff_x28;
  long unaff_x29;
  double dVar7;
  double dVar8;
  undefined1 auVar9 [16];
  undefined1 auVar10 [16];
  long in_stack_00000008;
  long *in_stack_00000010;
  undefined1 uStack0000000000000080;
  long lStack_48;
  
  do {
    if (*param_1 != unaff_x27) {
      _objc_enumerationMutation();
    }
    lVar6 = *(long *)(in_stack_00000008 + unaff_x28 * 8);
    func_0x007b6400(lVar6);
    uVar1 = func_0x007b6e40();
    if (unaff_x20 <= uVar1) {
      if (unaff_x23 != 0) {
        dVar7 = (double)func_0x007b6d20(unaff_x23);
        dVar8 = (double)func_0x007b6d20(lVar6);
        if (dVar7 <= dVar8) goto LAB_0014cb3c;
      }
      unaff_x23 = lVar6;
    }
LAB_0014cb3c:
    unaff_x28 = unaff_x28 + 1;
    if (unaff_x25 == unaff_x28) {
      puVar5 = &uStack0000000000000080;
      unaff_x25 = func_0x007b6720();
      if (unaff_x25 == 0) {
        if (unaff_x23 == 0) {
          _objc_sync_exit();
          puVar5 = (undefined1 *)0x0;
          unaff_x19 = func_0x007b6f40();
          auVar9 = _objc_alloc(uRam0000000000a27560);
          unaff_x23 = func_0x007b6b00(auVar9._0_8_,auVar9._8_8_,unaff_x19);
        }
        else {
          auVar9 = func_0x007b6420();
          func_0x007b7240(auVar9._0_8_,auVar9._8_8_,unaff_x23);
          func_0x007b7880(unaff_x23);
          _objc_sync_exit();
        }
        if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x70)) {
          return unaff_x23;
        }
        uVar2 = ___stack_chk_fail();
        _objc_sync_exit(unaff_x19);
        uVar2 = __Unwind_Resume(uVar2);
        _objc_sync_exit(unaff_x19);
        uVar2 = __Unwind_Resume(uVar2);
        _objc_sync_exit(unaff_x19);
        __Unwind_Resume(uVar2);
        uVar2 = __Unwind_Resume();
        _objc_sync_exit(unaff_x19);
        uVar2 = __Unwind_Resume(uVar2);
        _objc_sync_exit(unaff_x19);
        uVar2 = __Unwind_Resume(uVar2);
        _objc_sync_exit(unaff_x19);
        uVar2 = __Unwind_Resume(uVar2);
        _objc_sync_exit(unaff_x19);
        uVar2 = __Unwind_Resume(uVar2);
        _objc_sync_exit(unaff_x19);
        uVar2 = __Unwind_Resume(uVar2);
        _objc_sync_exit(unaff_x19);
        auVar9 = __Unwind_Resume(uVar2);
        uVar2 = auVar9._0_8_;
        lStack_48 = 0;
        auVar9 = func_0x007b6fc0(puVar5,auVar9._8_8_,0xa20830,0,&lStack_48);
        lVar6 = auVar9._0_8_;
        if (lVar6 == 0) {
          uVar2 = 0xa20850;
        }
        else {
          auVar9 = func_0x007b6fa0(lVar6,auVar9._8_8_,0xa20870);
          lVar6 = func_0x007b6fa0(lVar6,auVar9._8_8_,0xa20890);
          if ((auVar9._0_8_ != 0) && (lVar6 != 0)) {
            uVar3 = func_0x007b7ec0(uRam0000000000a27568);
            auVar10 = func_0x007b6380();
            auVar10 = func_0x007b7060(auVar10._0_8_,auVar10._8_8_,0);
            func_0x007b7900(auVar10._0_8_,auVar10._8_8_,0);
            auVar10 = func_0x007b6380(uVar3);
            auVar10 = func_0x007b7060(auVar10._0_8_,auVar10._8_8_,0);
            func_0x007b7760(auVar10._0_8_,auVar10._8_8_,0x1d);
            auVar10 = func_0x007b6380(uVar3);
            auVar10 = func_0x007b7060(auVar10._0_8_,auVar10._8_8_,0);
            func_0x007b7560(auVar10._0_8_,auVar10._8_8_,0);
            auVar10 = func_0x007b6380(uVar3);
            auVar10 = func_0x007b7060(auVar10._0_8_,auVar10._8_8_,1);
            func_0x007b7900(auVar10._0_8_,auVar10._8_8_,8);
            auVar10 = func_0x007b6380(uVar3);
            auVar10 = func_0x007b7060(auVar10._0_8_,auVar10._8_8_,1);
            func_0x007b7760(auVar10._0_8_,auVar10._8_8_,0x1d);
            auVar10 = func_0x007b6380(uVar3);
            auVar10 = func_0x007b7060(auVar10._0_8_,auVar10._8_8_,1);
            func_0x007b7560(auVar10._0_8_,auVar10._8_8_,0);
            auVar10 = func_0x007b6380(uVar3);
            auVar10 = func_0x007b7060(auVar10._0_8_,auVar10._8_8_,2);
            func_0x007b7900(auVar10._0_8_,auVar10._8_8_,0x10);
            auVar10 = func_0x007b6380(uVar3);
            auVar10 = func_0x007b7060(auVar10._0_8_,auVar10._8_8_,2);
            func_0x007b7760(auVar10._0_8_,auVar10._8_8_,3);
            auVar10 = func_0x007b6380(uVar3);
            auVar10 = func_0x007b7060(auVar10._0_8_,auVar10._8_8_,2);
            func_0x007b7560(auVar10._0_8_,auVar10._8_8_,0);
            auVar10 = func_0x007b6d80(uVar3);
            auVar10 = func_0x007b7060(auVar10._0_8_,auVar10._8_8_,0);
            func_0x007b7ae0(auVar10._0_8_,auVar10._8_8_,1);
            auVar10 = func_0x007b6d80(uVar3);
            auVar10 = func_0x007b7060(auVar10._0_8_,auVar10._8_8_,0);
            func_0x007b7ac0(auVar10._0_8_,auVar10._8_8_,1);
            auVar10 = func_0x007b6d80(uVar3);
            auVar10 = func_0x007b7060(auVar10._0_8_,auVar10._8_8_,0);
            func_0x007b7b20(auVar10._0_8_,auVar10._8_8_,0x14);
            auVar10 = _objc_alloc_init(uRam0000000000a27570);
            uVar4 = auVar10._0_8_;
            func_0x007b7c20(uVar4,auVar10._8_8_,auVar9._0_8_);
            func_0x007b7780(uVar4,extraout_x1,lVar6);
            func_0x007b7c00(uVar4,extraout_x1_00,uVar3);
            func_0x007b6a60(uVar2);
            auVar9 = func_0x007b73e0();
            func_0x007b7980(uVar4,auVar9._8_8_,auVar9._0_8_);
            func_0x007b6a60(uVar2);
            uVar3 = func_0x007b65c0();
            auVar9 = func_0x007b65a0(uVar4);
            auVar9 = func_0x007b7060(auVar9._0_8_,auVar9._8_8_,0);
            func_0x007b7960(auVar9._0_8_,auVar9._8_8_,uVar3);
            auVar9 = func_0x007b65a0(uVar4);
            auVar9 = func_0x007b7060(auVar9._0_8_,auVar9._8_8_,0);
            func_0x007b7520(auVar9._0_8_,auVar9._8_8_,1);
            auVar9 = func_0x007b65a0(uVar4);
            auVar9 = func_0x007b7060(auVar9._0_8_,auVar9._8_8_,0);
            func_0x007b79e0(auVar9._0_8_,auVar9._8_8_,0);
            auVar9 = func_0x007b65a0(uVar4);
            auVar9 = func_0x007b7060(auVar9._0_8_,auVar9._8_8_,0);
            func_0x007b7a60(auVar9._0_8_,auVar9._8_8_,4);
            auVar9 = func_0x007b65a0(uVar4);
            auVar9 = func_0x007b7060(auVar9._0_8_,auVar9._8_8_,0);
            func_0x007b76e0(auVar9._0_8_,auVar9._8_8_,5);
            auVar9 = func_0x007b65a0(uVar4);
            auVar9 = func_0x007b7060(auVar9._0_8_,auVar9._8_8_,0);
            func_0x007b74c0(auVar9._0_8_,auVar9._8_8_,0);
            auVar9 = func_0x007b65a0(uVar4);
            auVar9 = func_0x007b7060(auVar9._0_8_,auVar9._8_8_,0);
            func_0x007b7a40(auVar9._0_8_,auVar9._8_8_,1);
            auVar9 = func_0x007b65a0(uVar4);
            auVar9 = func_0x007b7060(auVar9._0_8_,auVar9._8_8_,0);
            func_0x007b76c0(auVar9._0_8_,auVar9._8_8_,5);
            func_0x007b6a60(uVar2);
            auVar9 = func_0x007b68a0();
            func_0x007b7620(uVar4,auVar9._8_8_,auVar9._0_8_);
            func_0x007b6a60(uVar2);
            auVar9 = func_0x007b7d00();
            func_0x007b7a80(uVar4,auVar9._8_8_,auVar9._0_8_);
            lVar6 = func_0x007b6fe0(puVar5,extraout_x1_01,uVar4,&lStack_48);
            if (lStack_48 == 0) {
              return lVar6;
            }
            _NSLog(0xa208d0);
            return lVar6;
          }
          uVar2 = 0xa208b0;
        }
        _NSLog(uVar2);
        return 0;
      }
      unaff_x28 = 0;
    }
    param_1 = in_stack_00000010;
  } while( true );
}

