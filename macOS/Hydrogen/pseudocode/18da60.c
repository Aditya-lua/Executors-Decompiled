
undefined1  [16] FUN_0018da60(undefined8 *param_1,long param_2)

{
  code *pcVar1;
  undefined8 uVar2;
  undefined8 *puVar3;
  long lVar4;
  undefined8 *puVar5;
  long lVar6;
  undefined8 extraout_x1;
  long lVar7;
  undefined1 auVar8 [16];
  undefined1 auVar9 [16];
  undefined1 auVar10 [16];
  undefined1 auVar11 [16];
  char *pcStack_a8;
  long ***ppplStack_a0;
  undefined *puStack_98;
  long ***ppplStack_70;
  undefined *puStack_68;
  long lStack_60;
  undefined8 *puStack_58;
  long **pplStack_50;
  undefined8 uStack_48;
  long lStack_40;
  undefined8 *puStack_38;
  long *plStack_30;
  long lStack_28;
  
  lVar6 = param_1[1];
  if (lVar6 < (long)param_1[2]) {
    param_2 = _CFArrayGetValueAtIndex(*(undefined8 *)*param_1,lVar6);
    if (param_2 == 0) {
      auVar9 = func_0x007a11c0(&UNK_0081c0f7,0x22,&UNK_009c1978);
      lVar4 = auVar9._8_8_;
      puVar3 = auVar9._0_8_;
      lStack_28 = 0x18dacc;
      lVar7 = puVar3[1];
      if (lVar7 < (long)puVar3[2]) {
        lStack_40 = lVar6;
        puStack_38 = param_1;
        plStack_30 = (long *)((long)register0x00000008 + -0x10);
        lVar4 = _CFArrayGetValueAtIndex(*(undefined8 *)*puVar3,lVar7);
        if (lVar4 == 0) {
          auVar9 = func_0x007a11c0(&UNK_0081a021,0x22,&UNK_009c0778);
          lVar4 = auVar9._8_8_;
          puVar5 = auVar9._0_8_;
          uStack_48 = 0x18db38;
          lVar6 = puVar5[1];
          if (lVar6 < (long)puVar5[2]) {
            lStack_60 = lVar7;
            puStack_58 = puVar3;
            pplStack_50 = &plStack_30;
            lVar4 = _CFArrayGetValueAtIndex(*(undefined8 *)*puVar5,lVar6);
            if (lVar4 == 0) {
              auVar9 = func_0x007a11c0(&UNK_0081b7f0,0x22,&UNK_009c14c8);
              lVar6 = auVar9._8_8_;
              puStack_68 = &DAT_0018dba4;
              lVar7 = lVar6 << 3;
              ppplStack_70 = &pplStack_50;
              if (lVar6 == 0) {
                lVar4 = 8;
              }
              else {
                lVar4 = func_0x00187bd0(lVar7,8);
                if (lVar4 == 0) {
                  uVar2 = func_0x007a1f00(8,lVar7,&UNK_009c0760);
                  if (lVar6 != 0) {
                    func_0x00187bd4();
                  }
                  auVar9 = __Unwind_Resume(uVar2);
                  puVar3 = auVar9._8_8_;
                  ppplStack_a0 = (long ***)&ppplStack_70;
                  if (*(char *)*auVar9._0_8_ == '\x01') {
                    puStack_98 = &DAT_0018dc98;
                    pcStack_a8 = (char *)*auVar9._0_8_ + 1;
                    auVar9 = func_0x004699b0(puVar3,&UNK_008151ac,4,&pcStack_a8,&UNK_009c0740);
                    return auVar9;
                  }
                  puStack_98 = &DAT_0018dc98;
                    /* WARNING: Could not recover jumptable at 0x00469224. Too many branches */
                    /* WARNING: Treating indirect jump as call */
                  auVar9 = (**(code **)(puVar3[1] + 0x18))(*puVar3,&UNK_008151a8,4);
                  return auVar9;
                }
                _memcpy(lVar4,auVar9._0_8_,lVar7);
              }
              auVar9 = _CFArrayCreate(*(undefined8 *)PTR__kCFAllocatorDefault_009b0238,lVar4,lVar6,
                                      PTR__kCFTypeArrayCallBacks_009b0258);
              uVar2 = auVar9._8_8_;
              if (auVar9._0_8_ == 0) {
                func_0x007a11c0(&UNK_00819f20,0x22,&UNK_009c0728);
                    /* WARNING: Does not return */
                pcVar1 = (code *)SoftwareBreakpoint(1,0x18dc64);
                (*pcVar1)();
              }
              if (lVar6 != 0) {
                func_0x00187bd4(lVar4,lVar7,8);
                uVar2 = extraout_x1;
              }
              auVar9._8_8_ = uVar2;
              return auVar9;
            }
            puVar5[1] = lVar6 + 1;
            uVar2 = 1;
          }
          else {
            uVar2 = 0;
          }
          auVar11._8_8_ = lVar4;
          auVar11._0_8_ = uVar2;
          return auVar11;
        }
        puVar3[1] = lVar7 + 1;
        uVar2 = 1;
      }
      else {
        uVar2 = 0;
      }
      auVar10._8_8_ = lVar4;
      auVar10._0_8_ = uVar2;
      return auVar10;
    }
    param_1[1] = lVar6 + 1;
    uVar2 = 1;
  }
  else {
    uVar2 = 0;
  }
  auVar8._8_8_ = param_2;
  auVar8._0_8_ = uVar2;
  return auVar8;
}

