
void FUN_0052a844(void)

{
  undefined8 *puVar1;
  long *plVar2;
  undefined *puVar3;
  undefined8 uVar4;
  long lVar5;
  undefined8 *unaff_x19;
  undefined1 auVar6 [16];
  undefined *puStack_70;
  undefined8 uStack_68;
  undefined8 **ppuStack_60;
  undefined8 uStack_58;
  undefined8 uStack_50;
  undefined8 *puStack_40;
  undefined *puStack_38;
  undefined1 auStack_30 [16];
  
  puVar1 = (undefined8 *)func_0x00187bd0(0x20,8);
  if (puVar1 != (undefined8 *)0x0) {
    *puVar1 = 2;
    puVar1[2] = 2;
    *unaff_x19 = 4;
    unaff_x19[1] = puVar1;
    unaff_x19[2] = &UNK_009eabe0;
    return;
  }
  auVar6 = func_0x007a1f18(8,0x20);
  puVar1 = auVar6._8_8_;
  plVar2 = auVar6._0_8_;
  lVar5 = *plVar2;
  if (lVar5 < 2) {
    if (lVar5 == 0) {
      puVar3 = &UNK_008a81eb;
      uVar4 = 0x11;
    }
    else {
      puVar3 = &UNK_008a81fc;
      uVar4 = 0x13;
    }
  }
  else if (lVar5 == 2) {
    puVar3 = &UNK_008a820f;
    uVar4 = 0x16;
  }
  else {
    if (lVar5 != 3) {
      auStack_30 = (**(code **)(plVar2[2] + 0x28))(plVar2[1]);
      puStack_40 = (undefined8 *)auStack_30;
      puStack_38 = &
                   __ZN78__LT_clap_builder__util__any_value__AnyValueId_u20_as_u20_core__fmt__Debug_GT_3fmt17h12da365eb6e93536E
      ;
      puStack_70 = &UNK_009eac20;
      uStack_68 = 2;
      ppuStack_60 = &puStack_40;
      uStack_58 = 1;
      uStack_50 = 0;
      func_0x0046849c(*puVar1,puVar1[1],&puStack_70);
      return;
    }
    puVar3 = &UNK_008a8225;
    uVar4 = 0x15;
  }
  func_0x00469240(&puStack_70,puVar1,puVar3,uVar4);
  func_0x00465628(&puStack_70);
  return;
}

