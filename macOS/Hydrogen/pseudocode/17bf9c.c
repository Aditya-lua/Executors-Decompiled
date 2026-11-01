
/* WARNING: Type propagation algorithm not settling */

undefined * FUN_0017bf9c(undefined8 param_1,undefined8 param_2,ulong param_3)

{
  ulong uVar1;
  code *pcVar2;
  int iVar3;
  uint uVar4;
  undefined *puVar5;
  undefined8 *puVar6;
  long lVar7;
  undefined8 uVar8;
  undefined8 *puVar9;
  undefined1 auVar10 [16];
  undefined8 uStack_120;
  undefined *puStack_118;
  undefined *puStack_110;
  undefined8 uStack_108;
  undefined8 uStack_100;
  undefined8 uStack_f8;
  undefined8 uStack_f0;
  undefined8 uStack_e0;
  undefined *puStack_d8;
  long lStack_d0;
  undefined *puStack_c8;
  undefined1 **ppuStack_c0;
  undefined *puStack_b8;
  undefined *puStack_a8;
  undefined1 *puStack_70;
  undefined *puStack_68;
  long lStack_58;
  ulong uStack_50;
  ulong uStack_48;
  undefined1 auStack_6 [6];
  
  func_0x0017c868();
  __Unwind_Resume();
  auVar10 = func_0x007a2668();
  lVar7 = auVar10._8_8_;
  if (param_3 != 0) {
    pcVar2 = (code *)*auVar10._0_8_;
    uVar8 = auVar10._0_8_[1];
    do {
      while( true ) {
        uStack_48 = 0;
        lStack_58 = lVar7;
        uStack_50 = param_3;
        uVar4 = (*pcVar2)(uVar8,&lStack_58,1,&uStack_48);
        if (uVar4 != 0) break;
        if (uStack_48 == 0) {
          return &UNK_009beb98;
        }
        uVar1 = param_3 - uStack_48;
        if (param_3 < uStack_48) {
          puVar5 = &UNK_009bebb0;
          auVar10 = func_0x007a28a4(uStack_48,param_3);
          lVar7 = auVar10._8_8_;
          puStack_68 = &DAT_0017c068;
          if (puVar5 != (undefined *)0x0) {
            pcVar2 = (code *)*auVar10._0_8_;
            uVar8 = auVar10._0_8_[1];
            puStack_70 = auStack_6 + -10;
            do {
              puStack_a8 = (undefined *)0x0;
              uVar4 = (*pcVar2)(uVar8,lVar7,puVar5,&puStack_a8);
              if (uVar4 == 0) {
                if (puStack_a8 == (undefined *)0x0) {
                  return &UNK_009beb98;
                }
                if (puVar5 < puStack_a8) {
                  auVar10 = func_0x007a28a4(puStack_a8,puVar5,&UNK_009bebb0);
                  uStack_120 = auVar10._0_8_;
                  puStack_c8 = &UNK_009beb98;
                  puStack_b8 = &DAT_0017c11c;
                  puStack_118 = (undefined *)0x0;
                  uStack_e0 = uVar8;
                  puStack_d8 = puVar5;
                  lStack_d0 = lVar7;
                  ppuStack_c0 = &puStack_70;
                  iVar3 = func_0x0046849c(&uStack_120,&UNK_009bead8,auVar10._8_8_);
                  if (iVar3 == 0) {
                    if (((ulong)puStack_118 & 3) == 1) {
                      puVar6 = (undefined8 *)(puStack_118 + -1);
                      uVar8 = *puVar6;
                      puVar9 = *(undefined8 **)(puStack_118 + 7);
                      if ((code *)*puVar9 != (code *)0x0) {
                        (*(code *)*puVar9)(uVar8);
                      }
                      if (puVar9[1] != 0) {
                        func_0x00187bd4(uVar8,puVar9[1],puVar9[2]);
                      }
                      func_0x00187bd4(puVar6,0x18,8);
                    }
                    puStack_118 = (undefined *)0x0;
                  }
                  else if (puStack_118 == (undefined *)0x0) {
                    puStack_110 = &UNK_009bea80;
                    uStack_108 = 1;
                    uStack_f8 = 0;
                    uStack_f0 = 0;
                    uStack_100 = 8;
                    func_0x007a2420(&puStack_110,&UNK_009bea90);
                    /* WARNING: Does not return */
                    pcVar2 = (code *)SoftwareBreakpoint(1,0x17a290);
                    (*pcVar2)();
                  }
                  return puStack_118;
                }
                lVar7 = lVar7 + (long)puStack_a8;
                puVar5 = puVar5 + -(long)puStack_a8;
              }
              else if (uVar4 != 4) {
                return (undefined *)((ulong)uVar4 << 0x20 | 2);
              }
            } while (puVar5 != (undefined *)0x0);
          }
          return (undefined *)0x0;
        }
        lVar7 = lVar7 + uStack_48;
        param_3 = uVar1;
        if (uVar1 == 0) {
          return (undefined *)0x0;
        }
      }
      if (uVar4 != 4) {
        return (undefined *)((ulong)uVar4 << 0x20 | 2);
      }
    } while (param_3 != 0);
  }
  return (undefined *)0x0;
}

