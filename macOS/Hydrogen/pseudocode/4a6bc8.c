
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void thunk_FUN_004a6bfc(void)

{
  undefined1 auVar1 [16];
  code *pcVar2;
  undefined8 uVar3;
  undefined8 *extraout_x8;
  long *plVar4;
  long *extraout_x9;
  long lVar5;
  long *extraout_x9_00;
  long *extraout_x9_01;
  long *plVar6;
  long *plVar7;
  undefined1 auVar8 [16];
  undefined1 uStack0000000000000150;
  long lStack_268;
  long *plStack_260;
  long *plStack_258;
  long *plStack_250;
  long *plStack_248;
  long *plStack_240;
  long lStack_238;
  long *plStack_230;
  long lStack_228;
  long *plStack_220;
  undefined8 uStack_218;
  undefined8 uStack_210;
  undefined8 uStack_208;
  long lStack_200;
  long lStack_1f8;
  long lStack_1f0;
  long lStack_1e0;
  long lStack_1d8;
  long lStack_1d0;
  long lStack_1c8;
  long lStack_1c0;
  long *plStack_1b8;
  long *plStack_1b0;
  long *plStack_1a8;
  long *plStack_1a0;
  long *plStack_198;
  long lStack_190;
  long *plStack_188;
  long lStack_180;
  long *plStack_178;
  undefined8 uStack_170;
  undefined8 uStack_168;
  undefined8 uStack_160;
  long lStack_150;
  long *plStack_148;
  long *plStack_140;
  long *plStack_138;
  long *plStack_130;
  long *plStack_128;
  long *plStack_120;
  long *plStack_118;
  long lStack_110;
  long *plStack_108;
  long lStack_100;
  long *plStack_f8;
  undefined8 uStack_f0;
  undefined8 uStack_e8;
  undefined8 uStack_e0;
  long lStack_d0;
  long *plStack_c8;
  long *plStack_c0;
  long *plStack_b8;
  
  func_0x004a8a78(&uStack0000000000000150);
  __Unwind_Resume();
  func_0x007a2668();
  uVar3 = func_0x007a2668();
  func_0x0049f9a0(&lStack_150);
  plVar4 = plStack_148;
  lVar5 = lStack_150;
  if (plStack_140 == (long *)0x2) {
code_r0x004a6c54:
    uVar3 = _UNK_00829c20;
    extraout_x8[1] = _UNK_00829c28;
    *extraout_x8 = uVar3;
  }
  else {
    plStack_178 = plStack_f8;
    lStack_180 = lStack_100;
    uStack_168 = uStack_e8;
    uStack_170 = uStack_f0;
    uStack_160 = uStack_e0;
    plStack_1b8 = plStack_138;
    lStack_1c0 = (long)plStack_140;
    plStack_1a8 = plStack_128;
    plStack_1b0 = plStack_130;
    plStack_198 = plStack_118;
    plStack_1a0 = plStack_120;
    plStack_188 = plStack_108;
    lStack_190 = lStack_110;
    plVar6 = (long *)0x763d199bccd31989;
    auVar8 = func_0x00512f18(&lStack_1c0,0x763d199bccd31989,0x9208909ed1a860c6);
    auVar1._8_8_ = plStack_1a8;
    auVar1._0_8_ = plStack_1b0;
    plVar7 = (long *)0x9208909ed1a860c6;
    if ((auVar8._0_8_ == 0x763d199bccd31989) && (auVar8._8_8_ == -0x6df76f612e579f3a)) {
      if (lStack_1c0 == 2) goto code_r0x004a6c54;
      plVar6 = plStack_1a0;
      plVar7 = plStack_198;
      auVar8 = auVar1;
      if (lStack_1c0 != 3) {
        lStack_268 = lStack_1c0;
        plStack_260 = plStack_1b8;
        plStack_258 = plStack_1b0;
        plStack_250 = plStack_1a8;
        plStack_248 = plStack_1a0;
        plStack_240 = plStack_198;
        plStack_230 = plStack_188;
        lStack_238 = lStack_190;
        plStack_220 = plStack_178;
        lStack_228 = lStack_180;
        uStack_210 = uStack_168;
        uStack_218 = uStack_170;
        uStack_208 = uStack_160;
        func_0x005129bc(&lStack_150,&lStack_268);
        plVar4 = extraout_x9;
        if (plStack_130 == (long *)0x0) goto code_r0x004a6e14;
        if (plStack_128 != plStack_118) goto code_r0x004a6df8;
        while( true ) {
          func_0x004b7fe4(&plStack_130);
          plStack_130 = (long *)0x0;
          plVar4 = extraout_x9_00;
code_r0x004a6e14:
          plVar6 = plStack_148;
          if ((lStack_150 == 0) || (plVar4 = plStack_148, plStack_148 == plStack_138)) break;
          plVar6 = plStack_148 + 3;
          plVar7 = (long *)*plStack_148;
          if (plVar7 == (long *)0x8000000000000000) break;
          plStack_128 = (long *)plStack_148[1];
          plStack_118 = plStack_128 + plStack_148[2] * 4;
          plStack_148 = plVar6;
          plStack_130 = plStack_128;
          plStack_120 = plVar7;
          if (plStack_128 != plStack_118) {
code_r0x004a6df8:
            plVar6 = plStack_128 + 4;
            lVar5 = *plStack_128;
            plVar4 = plStack_128;
            plStack_128 = plVar6;
            if (lVar5 != 0) {
code_r0x004a6e88:
              lStack_1f8 = plVar4[2];
              lStack_200 = plVar4[1];
              lStack_1f0 = plVar4[3];
              lStack_1e0 = lVar5;
              lStack_1d8 = lStack_200;
              lStack_1d0 = lStack_1f8;
              lStack_1c8 = lStack_1f0;
              func_0x004ad8b8(&lStack_1c0,&lStack_1e0);
              if (lStack_1c0 != 0) {
                plStack_c8 = plStack_1b8;
                lStack_d0 = lStack_1c0;
                plStack_b8 = plStack_1a8;
                plStack_c0 = plStack_1b0;
                func_0x007a2810(&UNK_008a04ac,99,&lStack_d0,&UNK_009e3ad8,&UNK_009e3928);
                    /* WARNING: Does not return */
                pcVar2 = (code *)SoftwareBreakpoint(1,0x4a6f20);
                (*pcVar2)();
              }
              uVar3 = 1;
              plVar4 = plStack_1b8;
code_r0x004a6ed8:
              extraout_x8[1] = uVar3;
              extraout_x8[2] = plVar4;
              *extraout_x8 = 2;
              func_0x004a8a78(&lStack_150);
              return;
            }
          }
        }
        plStack_148 = plVar6;
        uVar3 = 0;
        if (lStack_110 == 0) goto code_r0x004a6ed8;
        if (plStack_108 != plStack_f8) {
          plVar6 = plStack_108 + 4;
          lVar5 = *plStack_108;
          plVar4 = plStack_108;
          plStack_108 = plVar6;
          if (lVar5 != 0) goto code_r0x004a6e88;
        }
        func_0x004b7fe4(&lStack_110);
        uVar3 = 0;
        lStack_110 = 0;
        plVar4 = extraout_x9_01;
        goto code_r0x004a6ed8;
      }
    }
    else {
      plStack_108 = plStack_178;
      lStack_110 = lStack_180;
      plStack_f8 = (long *)uStack_168;
      lStack_100 = uStack_170;
      uStack_f0 = uStack_160;
      plStack_148 = plStack_1b8;
      lStack_150 = lStack_1c0;
      plStack_138 = plStack_1a8;
      plStack_140 = plStack_1b0;
      plStack_128 = plStack_198;
      plStack_130 = plStack_1a0;
      plStack_118 = plStack_188;
      plStack_120 = (long *)lStack_190;
      func_0x0049fb7c(&lStack_d0,uVar3,lVar5,plVar4,&lStack_150);
      if (lStack_d0 != 2) {
        func_0x004a9838(&lStack_d0);
      }
      plStack_1b8 = (long *)0x0;
    }
    *extraout_x8 = plStack_1b8;
    *(undefined1 (*) [16])(extraout_x8 + 1) = auVar8;
    extraout_x8[3] = plVar6;
    extraout_x8[4] = plVar7;
  }
  return;
}

