
undefined * FUN_001867ac(undefined8 param_1,undefined8 param_2,ulong param_3)

{
  ulong uVar1;
  code *pcVar2;
  long *plVar3;
  undefined8 uVar4;
  long lVar5;
  long unaff_x20;
  undefined1 auVar6 [16];
  long lStack_a0;
  undefined8 uStack_98;
  ulong uStack_90;
  undefined8 uStack_88;
  undefined8 uStack_80;
  undefined4 uStack_78;
  undefined4 uStack_74;
  undefined8 uStack_70;
  undefined8 uStack_68;
  undefined8 uStack_60;
  undefined8 uStack_58;
  undefined8 uStack_50;
  undefined8 uStack_48;
  undefined4 uStack_3c;
  undefined2 uStack_38;
  undefined4 uStack_36;
  undefined2 uStack_32;
  
  if (*(long *)(unaff_x20 + 8) != 0) {
    param_3 = *(ulong *)(unaff_x20 + 0x10);
    func_0x00187bd4();
  }
  func_0x007a2650();
  auVar6 = func_0x007a2650();
  lVar5 = auVar6._8_8_;
  plVar3 = auVar6._0_8_;
  if (plVar3 != (long *)0x0) {
    if (*plVar3 == -0x8000000000000000) {
      return &UNK_00001b65;
    }
    if (lVar5 != 0) {
      uVar4 = _strlen(lVar5);
      func_0x0046b8d0(&uStack_70,lVar5,uVar4);
      if ((int)uStack_70 != 1) {
        uStack_3c = 0;
        uStack_38 = 0x1b6;
        uStack_32 = 0;
        uStack_36 = 1;
        func_0x00416de4(&uStack_70,&uStack_3c,uStack_68,uStack_60);
        if ((uStack_70 & 1) == 0) {
          lStack_a0 = func_0x00187bd0(0x2000,1);
          if (lStack_a0 == 0) {
            func_0x007a1f00(1,0x2000,&UNK_009beca8);
                    /* WARNING: Does not return */
            pcVar2 = (code *)SoftwareBreakpoint(1,0x1869f4);
            (*pcVar2)();
          }
          uStack_98 = 0x2000;
          uStack_88 = 0;
          uStack_80 = 0;
          uStack_90 = 0;
          uStack_78 = uStack_70._4_4_;
          uStack_68 = 0x2000;
          uStack_58 = 0;
          uStack_60 = 0;
          uStack_48 = CONCAT44(uStack_74,uStack_70._4_4_);
          uStack_50 = 0;
          uStack_70 = lStack_a0;
          func_0x001746d8(&lStack_a0,&uStack_70);
          if (lStack_a0 == 5) {
            uStack_68 = uStack_90;
            uStack_70 = uStack_98;
            uStack_60 = uStack_88;
            lStack_a0 = 0;
            uStack_98 = 8;
            uStack_90 = 0;
            auVar6 = func_0x0018183c(&lStack_a0,&uStack_70);
            uVar1 = uStack_90;
            uVar4 = uStack_98;
            if (((param_3 & 1) == 0) || ((auVar6._8_8_ == 0 && (auVar6._0_8_ != 0)))) {
              lVar5 = plVar3[2];
              if ((ulong)(*plVar3 - lVar5) < uStack_90) {
                func_0x0079a190(plVar3,lVar5,uStack_90,8,0x48);
                lVar5 = plVar3[2];
              }
              _memcpy(plVar3[1] + lVar5 * 0x48,uVar4,uVar1 * 0x48);
              plVar3[2] = plVar3[2] + uVar1;
              uStack_90 = 0;
              if (lStack_a0 != 0) {
                func_0x00187bd4(uStack_98,lStack_a0 * 0x48,8);
              }
              return &UNK_00001b58;
            }
            func_0x0018523c(&lStack_a0);
          }
          else {
            func_0x0018504c(&lStack_a0);
          }
          return &UNK_00001b5d;
        }
        lStack_a0 = 0;
        uStack_98 = 3;
        func_0x0018504c(&uStack_98);
      }
      return &UNK_00001b59;
    }
  }
  return &UNK_00001b5a;
}

