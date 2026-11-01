
undefined8 FUN_0005d100(long *param_1)

{
  ulong uVar1;
  undefined1 **ppuVar2;
  undefined8 ***pppuVar3;
  long *plVar4;
  undefined8 uVar5;
  undefined8 uVar6;
  long lVar7;
  undefined8 unaff_x19;
  long unaff_x29;
  undefined1 auVar8 [16];
  undefined1 auVar9 [12];
  long lStack0000000000000008;
  long *in_stack_00000020;
  long lStack0000000000000028;
  long *in_stack_00000040;
  undefined1 *puStack_60;
  ulong uStack_58;
  byte bStack_49;
  undefined8 ***pppuStack_48;
  undefined2 uStack_40;
  undefined6 uStack_3e;
  byte bStack_31;
  
  do {
    if (param_1 == &lStack0000000000000008) {
      lVar7 = 4;
      param_1 = &lStack0000000000000008;
LAB_0005d120:
      (**(code **)(*param_1 + lVar7 * 8))();
    }
    else if (param_1 != (long *)0x0) {
      lVar7 = 5;
      goto LAB_0005d120;
    }
    ___cxa_begin_catch(unaff_x19);
    ___cxa_end_catch();
    if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x28)) {
      return 0;
    }
    auVar9 = ___stack_chk_fail(0);
    unaff_x19 = auVar9._0_8_;
    if (auVar9._8_4_ == 0) {
      auVar8 = __Unwind_Resume(unaff_x19);
      bStack_31 = 9;
      uStack_40 = 0x20;
      pppuStack_48 = (undefined8 ***)s_HTTP_1_1_008d1b99._0_8_;
      __ZNSt3__19to_stringEi(&puStack_60,auVar8._8_8_);
      ppuVar2 = (undefined1 **)puStack_60;
      if (-1 < (char)bStack_49) {
        uStack_58 = (ulong)bStack_49;
        ppuVar2 = &puStack_60;
      }
      __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6appendEPKcm
                (&pppuStack_48,ppuVar2,uStack_58);
      if ((char)bStack_49 < '\0') {
        __ZdlPv(puStack_60);
      }
      __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6appendEPKcm
                (&pppuStack_48," ",1);
      uVar5 = func_0x00067a7c(auVar8._8_8_);
      uVar6 = _strlen();
      __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6appendEPKcm
                (&pppuStack_48,uVar5,uVar6);
      __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6appendEPKcm
                (&pppuStack_48,"\r\n",2);
      uVar1 = CONCAT62(uStack_3e,uStack_40);
      pppuVar3 = pppuStack_48;
      if (-1 < (char)bStack_31) {
        uVar1 = (ulong)bStack_31;
        pppuVar3 = &pppuStack_48;
      }
      uVar5 = (**(code **)(*auVar8._0_8_ + 0x30))(auVar8._0_8_,pppuVar3,uVar1);
      if ((char)bStack_31 < '\0') {
        __ZdlPv(pppuStack_48);
        return uVar5;
      }
      return uVar5;
    }
    if (in_stack_00000040 == &lStack0000000000000028) {
      lVar7 = 4;
      plVar4 = &lStack0000000000000028;
code_r0x0005d0f0:
      (**(code **)(*plVar4 + lVar7 * 8))();
    }
    else if (in_stack_00000040 != (long *)0x0) {
      lVar7 = 5;
      plVar4 = in_stack_00000040;
      goto code_r0x0005d0f0;
    }
    param_1 = in_stack_00000020;
  } while( true );
}

