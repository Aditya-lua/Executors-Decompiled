
undefined * FUN_00176c54(undefined8 param_1,undefined8 param_2,undefined8 param_3)

{
  bool bVar1;
  long lVar2;
  long lVar3;
  long lVar4;
  ulong uVar5;
  long *plVar6;
  long lVar7;
  long lVar8;
  undefined1 auVar9 [16];
  long lStack_60;
  long lStack_58;
  long lStack_50;
  ulong uStack_48;
  
  func_0x007a2668();
  auVar9 = func_0x007a2650();
  plVar6 = auVar9._0_8_;
  if (plVar6 != (long *)0x0) {
    if (*plVar6 == -0x8000000000000000) {
      return &UNK_00001b65;
    }
    if (auVar9._8_8_ != 0) {
      func_0x001745d4(&lStack_60,auVar9._8_8_,param_3);
      uVar5 = uStack_48;
      lVar4 = lStack_50;
      lVar3 = lStack_58;
      if (lStack_60 == 5) {
        if (uStack_48 != 0) {
          lVar7 = uStack_48 * 0x18;
          lVar2 = lStack_50 + lVar7;
          lStack_60 = lStack_50;
          lStack_58 = lStack_50;
          lStack_50 = lVar3;
          lVar8 = plVar6[2];
          bVar1 = (ulong)(*plVar6 - lVar8) < uStack_48;
          uStack_48 = lVar2;
          if (bVar1) {
            func_0x0079a190(plVar6,lVar8,uVar5,8,0x18);
            lVar8 = plVar6[2];
          }
          _memcpy(plVar6[1] + lVar8 * 0x18,lVar4,lVar7);
          plVar6[2] = lVar8 + uVar5;
          if (lVar3 != 0) {
            func_0x00187bd4(lVar4,lVar3 * 0x18,8);
          }
          return &UNK_00001b58;
        }
        if (lStack_58 != 0) {
          func_0x00187bd4(lStack_50,lStack_58 * 0x18,8);
        }
      }
      else {
        func_0x001751c0(&lStack_60);
      }
      return &UNK_00001b66;
    }
  }
  return &UNK_00001b5a;
}

