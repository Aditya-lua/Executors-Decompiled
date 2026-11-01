
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void thunk_FUN_004348ec(undefined8 param_1)

{
  code *pcVar1;
  long lVar2;
  undefined8 *puVar3;
  long *plVar4;
  long lVar5;
  undefined8 *extraout_x8;
  char *pcVar6;
  undefined8 uVar7;
  undefined1 uVar8;
  undefined1 uVar9;
  undefined1 auVar10 [16];
  undefined1 auVar11 [16];
  long in_stack_00000048;
  undefined8 in_stack_00000050;
  long lStack_80;
  undefined8 uStack_78;
  undefined8 uStack_70;
  
  if (in_stack_00000048 != 0) {
    func_0x00187bd4(in_stack_00000050,in_stack_00000048,1);
  }
  auVar10 = __Unwind_Resume(param_1);
  auVar10._8_8_ = auVar10._8_8_;
  auVar10._0_8_ = auVar10._0_8_;
  if (auVar10._8_8_ == 0) {
LAB_00434a08:
    uVar8 = 0;
    func_0x00459450(&lStack_80,auVar10._0_8_,auVar10._8_8_);
    uVar7 = uStack_78;
    lVar2 = lStack_80;
    if (lStack_80 != -0x8000000000000000) goto code_r0x0043495c;
LAB_00434a24:
    auVar11._8_8_ = uStack_70;
    auVar11._0_8_ = uStack_78;
    uVar9 = 0;
  }
  else {
    if (*auVar10._0_8_ != '/') {
      if (auVar10._8_8_ < 0x10) {
        do {
          pcVar6 = auVar10._0_8_;
          if (*pcVar6 == '/') goto code_r0x004349e8;
          lVar2 = auVar10._8_8_ + -1;
          auVar10._8_8_ = lVar2;
          auVar10._0_8_ = pcVar6 + 1;
        } while (lVar2 != 0);
      }
      else {
        lVar2 = func_0x0046b0fc(0x2f,auVar10._0_8_,auVar10._8_8_);
        if (lVar2 == 1) {
code_r0x004349e8:
          uVar8 = 1;
          func_0x00459450(&lStack_80,auVar10._0_8_,auVar10._8_8_);
          goto joined_r0x00434a00;
        }
      }
      goto LAB_00434a08;
    }
    uVar8 = 2;
    func_0x00459450(&lStack_80);
joined_r0x00434a00:
    uVar7 = uStack_78;
    lVar2 = lStack_80;
    if (lStack_80 == -0x8000000000000000) goto LAB_00434a24;
code_r0x0043495c:
    auVar11 = func_0x00459b94("<string-with-nul>",0x12);
    if (lVar2 != 0) {
      func_0x00187bd4(uVar7,lVar2,1);
    }
    uVar9 = 1;
  }
  lVar2 = auVar11._8_8_;
  puVar3 = (undefined8 *)func_0x00187bd0(0x10,8);
  if (puVar3 == (undefined8 *)0x0) {
    func_0x007a1f18(8,0x10);
  }
  else {
    *puVar3 = auVar11._0_8_;
    puVar3[1] = 0;
    plVar4 = (long *)func_0x00187bd0(0x10,8);
    if (plVar4 == (long *)0x0) {
      func_0x007a1f18(8,0x10);
    }
    else {
      if (lVar2 < 0) {
        uVar7 = 0;
      }
      else {
        if (lVar2 == 0) {
          lVar5 = 1;
code_r0x00434a94:
          _memcpy(lVar5,auVar11._0_8_,lVar2);
          *plVar4 = lVar5;
          plVar4[1] = lVar2;
          *(undefined1 (*) [16])(extraout_x8 + 0x13) = auVar11;
          *extraout_x8 = 1;
          extraout_x8[1] = plVar4;
          uVar7 = _UNK_00884150;
          extraout_x8[3] = _UNK_00884158;
          extraout_x8[2] = uVar7;
          extraout_x8[4] = puVar3;
          extraout_x8[0xf] = 0;
          extraout_x8[0x11] = 0;
          *(undefined2 *)(extraout_x8 + 0x12) = 0;
          *(undefined1 *)((long)extraout_x8 + 0xc9) = uVar8;
          extraout_x8[0x15] = 0;
          *(undefined4 *)(extraout_x8 + 9) = 0;
          *(undefined4 *)(extraout_x8 + 10) = 0;
          *(undefined1 *)(extraout_x8 + 0x19) = uVar9;
          uVar7 = _UNK_00829c20;
          extraout_x8[6] = _UNK_00829c28;
          extraout_x8[5] = uVar7;
          extraout_x8[7] = 8;
          extraout_x8[8] = 0;
          extraout_x8[0x17] = 0;
          *(undefined4 *)(extraout_x8 + 0xc) = 5;
          *(undefined4 *)(extraout_x8 + 0xd) = 5;
          *(undefined4 *)(extraout_x8 + 0xe) = 5;
          *(undefined4 *)(extraout_x8 + 0xb) = 0;
          return;
        }
        uVar7 = 1;
        lVar5 = func_0x00187bd0(lVar2,1);
        if (lVar5 != 0) goto code_r0x00434a94;
      }
      func_0x007a1f00(uVar7,lVar2,&UNK_009d9be8);
    }
  }
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x434b6c);
  (*pcVar1)();
}

