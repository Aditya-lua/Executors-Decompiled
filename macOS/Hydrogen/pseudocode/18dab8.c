
long FUN_0018dab8(long param_1)

{
  code *pcVar1;
  undefined8 *puVar2;
  long lVar3;
  long lVar4;
  undefined8 *puVar5;
  long lVar6;
  long lVar7;
  undefined8 uVar8;
  undefined1 auVar9 [16];
  char *pcStack_88;
  undefined1 ***pppuStack_80;
  undefined *puStack_78;
  undefined1 **ppuStack_50;
  undefined *puStack_48;
  long lStack_40;
  undefined8 *puStack_38;
  undefined1 *puStack_30;
  undefined8 uStack_28;
  undefined1 auStack_6 [6];
  
  puVar2 = (undefined8 *)func_0x007a11c0(param_1 + 0xf7,0x22,&UNK_009c1978);
  lVar4 = puVar2[1];
  if (lVar4 < (long)puVar2[2]) {
    lVar3 = _CFArrayGetValueAtIndex(*(undefined8 *)*puVar2,lVar4);
    if (lVar3 == 0) {
      puVar5 = (undefined8 *)func_0x007a11c0(&UNK_0081a021,0x22,&UNK_009c0778);
      uStack_28 = 0x18db38;
      lVar3 = puVar5[1];
      if (lVar3 < (long)puVar5[2]) {
        lStack_40 = lVar4;
        puStack_38 = puVar2;
        puStack_30 = auStack_6 + -10;
        lVar4 = _CFArrayGetValueAtIndex(*(undefined8 *)*puVar5,lVar3);
        if (lVar4 == 0) {
          auVar9 = func_0x007a11c0(&UNK_0081b7f0,0x22,&UNK_009c14c8);
          lVar4 = auVar9._8_8_;
          puStack_48 = &DAT_0018dba4;
          lVar3 = lVar4 << 3;
          ppuStack_50 = &puStack_30;
          if (lVar4 == 0) {
            lVar6 = 8;
          }
          else {
            lVar6 = func_0x00187bd0(lVar3,8);
            if (lVar6 == 0) {
              uVar8 = func_0x007a1f00(8,lVar3,&UNK_009c0760);
              if (lVar4 != 0) {
                func_0x00187bd4();
              }
              auVar9 = __Unwind_Resume(uVar8);
              puVar2 = auVar9._8_8_;
              pppuStack_80 = &ppuStack_50;
              if (*(char *)*auVar9._0_8_ == '\x01') {
                puStack_78 = &DAT_0018dc98;
                pcStack_88 = (char *)*auVar9._0_8_ + 1;
                lVar4 = func_0x004699b0(puVar2,&UNK_008151ac,4,&pcStack_88,&UNK_009c0740);
                return lVar4;
              }
              puStack_78 = &DAT_0018dc98;
                    /* WARNING: Could not recover jumptable at 0x00469224. Too many branches */
                    /* WARNING: Treating indirect jump as call */
              lVar4 = (**(code **)(puVar2[1] + 0x18))(*puVar2,&UNK_008151a8,4);
              return lVar4;
            }
            _memcpy(lVar6,auVar9._0_8_,lVar3);
          }
          lVar7 = _CFArrayCreate(*(undefined8 *)PTR__kCFAllocatorDefault_009b0238,lVar6,lVar4,
                                 PTR__kCFTypeArrayCallBacks_009b0258);
          if (lVar7 == 0) {
            func_0x007a11c0(&UNK_00819f20,0x22,&UNK_009c0728);
                    /* WARNING: Does not return */
            pcVar1 = (code *)SoftwareBreakpoint(1,0x18dc64);
            (*pcVar1)();
          }
          if (lVar4 != 0) {
            func_0x00187bd4(lVar6,lVar3,8);
          }
          return lVar7;
        }
        puVar5[1] = lVar3 + 1;
        lVar4 = 1;
      }
      else {
        lVar4 = 0;
      }
      return lVar4;
    }
    puVar2[1] = lVar4 + 1;
    lVar4 = 1;
  }
  else {
    lVar4 = 0;
  }
  return lVar4;
}

