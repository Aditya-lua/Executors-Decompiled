
void FUN_002738b4(undefined8 param_1,undefined8 param_2,ulong param_3,long param_4,ulong param_5)

{
  code *pcVar1;
  int iVar2;
  long *plVar3;
  long lVar4;
  uint *puVar5;
  long *extraout_x8;
  long *extraout_x8_00;
  uint *puVar6;
  ulong uVar7;
  long lVar8;
  undefined1 auVar9 [16];
  uint uStack_d4;
  undefined *puStack_d0;
  undefined8 uStack_c8;
  undefined8 uStack_c0;
  undefined8 uStack_b8;
  undefined8 uStack_b0;
  uint uStack_64;
  undefined *puStack_60;
  undefined8 uStack_58;
  undefined8 uStack_50;
  undefined8 uStack_48;
  undefined8 uStack_40;
  
  func_0x0023fb18();
  func_0x001be910();
  __Unwind_Resume();
  auVar9 = func_0x007a2668();
  uStack_64 = 0;
  if (((param_3 >> 0x1f == 0) && (uVar7 = *(ulong *)(*auVar9._0_8_ + 8), !CARRY8(param_3,uVar7))) &&
     (uVar7 + param_3 <= param_5)) {
    puVar5 = &uStack_64;
    iVar2 = func_0x002b355c(auVar9._0_8_[1],param_4,puVar5,auVar9._8_8_,param_3);
    if ((iVar2 == 1) && (uVar7 = (ulong)uStack_64, -1 < (int)uStack_64)) {
      if (uVar7 <= param_5) {
        *extraout_x8 = param_4;
        extraout_x8[1] = uVar7;
        extraout_x8[2] = param_4 + uVar7;
        extraout_x8[3] = param_5 - uVar7;
        return;
      }
      puStack_60 = &UNK_009cc6f8;
      uStack_58 = 1;
      uStack_48 = 0;
      uStack_40 = 0;
      uStack_50 = 8;
      auVar9 = func_0x007a2420(&puStack_60,&UNK_009cc708);
      lVar4 = auVar9._8_8_;
      plVar3 = auVar9._0_8_;
      if (puVar5 < *(uint **)(*plVar3 + 8)) {
        *extraout_x8_00 = 0;
        lVar8 = plVar3[1];
      }
      else {
        uStack_d4 = 0;
        lVar8 = plVar3[1];
        iVar2 = func_0x002b3798(lVar8,lVar4,&uStack_d4);
        if ((iVar2 == 1) && (puVar6 = (uint *)(ulong)uStack_d4, -1 < (int)uStack_d4)) {
          if (puVar5 < puVar6) {
            puStack_d0 = &UNK_009cc6f8;
            uStack_c8 = 1;
            uStack_b8 = 0;
            uStack_b0 = 0;
            uStack_c0 = 8;
            func_0x007a2420(&puStack_d0,&UNK_009cc708);
                    /* WARNING: Does not return */
            pcVar1 = (code *)SoftwareBreakpoint(1,0x273a6c);
            (*pcVar1)();
          }
          *extraout_x8_00 = lVar4;
          extraout_x8_00[1] = (long)puVar6;
          extraout_x8_00[2] = lVar4 + (long)puVar6;
          extraout_x8_00[3] = (long)puVar5 - (long)puVar6;
        }
        else {
          *extraout_x8_00 = 0;
        }
      }
      func_0x002b292c(lVar8);
      return;
    }
  }
  *extraout_x8 = 0;
  return;
}

