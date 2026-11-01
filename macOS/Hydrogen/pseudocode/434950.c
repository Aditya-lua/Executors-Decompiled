
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_00434950(void)

{
  code *pcVar1;
  undefined8 *puVar2;
  long *plVar3;
  long lVar4;
  undefined8 *unaff_x19;
  undefined8 unaff_x20;
  long lVar5;
  long unaff_x22;
  undefined8 uVar6;
  undefined1 unaff_w26;
  undefined1 uVar7;
  undefined1 auVar8 [16];
  undefined8 in_stack_00000010;
  
  auVar8._8_8_ = in_stack_00000010;
  auVar8._0_8_ = unaff_x20;
  if (unaff_x22 == -0x8000000000000000) {
    uVar7 = 0;
  }
  else {
    auVar8 = func_0x00459b94("<string-with-nul>",0x12);
    if (unaff_x22 != 0) {
      func_0x00187bd4();
    }
    uVar7 = 1;
  }
  lVar5 = auVar8._8_8_;
  puVar2 = (undefined8 *)func_0x00187bd0(0x10,8);
  if (puVar2 == (undefined8 *)0x0) {
    func_0x007a1f18(8,0x10);
  }
  else {
    *puVar2 = auVar8._0_8_;
    puVar2[1] = 0;
    plVar3 = (long *)func_0x00187bd0(0x10,8);
    if (plVar3 == (long *)0x0) {
      func_0x007a1f18(8,0x10);
    }
    else {
      if (lVar5 < 0) {
        uVar6 = 0;
      }
      else {
        if (lVar5 == 0) {
          lVar4 = 1;
code_r0x00434a94:
          _memcpy(lVar4,auVar8._0_8_,lVar5);
          *plVar3 = lVar4;
          plVar3[1] = lVar5;
          *(undefined1 (*) [16])(unaff_x19 + 0x13) = auVar8;
          *unaff_x19 = 1;
          unaff_x19[1] = plVar3;
          uVar6 = _UNK_00884150;
          unaff_x19[3] = _UNK_00884158;
          unaff_x19[2] = uVar6;
          unaff_x19[4] = puVar2;
          unaff_x19[0xf] = 0;
          unaff_x19[0x11] = 0;
          *(undefined2 *)(unaff_x19 + 0x12) = 0;
          *(undefined1 *)((long)unaff_x19 + 0xc9) = unaff_w26;
          unaff_x19[0x15] = 0;
          *(undefined4 *)(unaff_x19 + 9) = 0;
          *(undefined4 *)(unaff_x19 + 10) = 0;
          *(undefined1 *)(unaff_x19 + 0x19) = uVar7;
          uVar6 = _UNK_00829c20;
          unaff_x19[6] = _UNK_00829c28;
          unaff_x19[5] = uVar6;
          unaff_x19[7] = 8;
          unaff_x19[8] = 0;
          unaff_x19[0x17] = 0;
          *(undefined4 *)(unaff_x19 + 0xc) = 5;
          *(undefined4 *)(unaff_x19 + 0xd) = 5;
          *(undefined4 *)(unaff_x19 + 0xe) = 5;
          *(undefined4 *)(unaff_x19 + 0xb) = 0;
          return;
        }
        uVar6 = 1;
        lVar4 = func_0x00187bd0(lVar5,1);
        if (lVar4 != 0) goto code_r0x00434a94;
      }
      func_0x007a1f00(uVar6,lVar5,&UNK_009d9be8);
    }
  }
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x434b6c);
  (*pcVar1)();
}

