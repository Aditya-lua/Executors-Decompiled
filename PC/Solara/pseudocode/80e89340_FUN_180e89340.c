/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_180e89340(longlong param_1,undefined8 param_2)

{
  longlong *plVar1;
  longlong *plVar2;
  char cVar3;
  undefined1 uVar4;
  int iVar5;
  longlong lVar6;
  longlong lVar7;
  undefined8 uVar8;
  longlong lVar9;
  ulonglong uVar10;
  undefined1 auStack_2a8 [32];
  int *piStack_288;
  undefined4 uStack_280;
  undefined4 *puStack_278;
  undefined4 uStack_270;
  longlong lStack_268;
  undefined4 *puStack_260;
  longlong *plStack_258;
  longlong lStack_250;
  int aiStack_248 [2];
  undefined8 uStack_240;
  int *piStack_238;
  ulonglong uStack_230;
  undefined8 uStack_228;
  undefined4 uStack_220;
  undefined4 uStack_21c;
  undefined8 *puStack_218;
  longlong lStack_210;
  undefined4 uStack_208;
  undefined4 uStack_204;
  ulonglong *puStack_200;
  undefined1 auStack_1f8 [36];
  int iStack_1d4;
  int aiStack_1c8 [2];
  ushort uStack_1c0;
  undefined1 auStack_1be [118];
  undefined1 auStack_148 [256];
  ulonglong uStack_48;
  
  uStack_48 = _DAT_1810c1700 ^ (ulonglong)auStack_2a8;
  plVar1 = *(longlong **)(param_1 + 0x10);
  plVar2 = (longlong *)plVar1[6];
  lVar6 = func_0x000180e66830();
  lVar7 = func_0x000180e66810(param_1,param_2);
  piStack_288 = (int *)CONCAT44(piStack_288._4_4_,1);
  lStack_210 = 0;
  cVar3 = FUN_180e94290(5,1,0,2);
  if (cVar3 != '\0') {
    FUN_180e64ce0(param_2,&UNK_18104b0a0);
  }
  if (plVar1[5] == 0) {
LAB_180e8941e:
    uVar4 = 0;
  }
  else {
    uVar8 = GetModuleHandleW(&UNK_181038598);
    lVar9 = GetProcAddress(uVar8,&UNK_18104b118);
    if (lVar9 != 0) goto LAB_180e8941e;
    piStack_288 = (int *)CONCAT44(piStack_288._4_4_,3);
    cVar3 = FUN_180e94290(6,3,0,2);
    if (cVar3 == '\0') goto LAB_180e8941e;
    uVar4 = 1;
  }
  *(undefined1 *)((longlong)plVar2 + 0x6b) = uVar4;
  if ((*(longlong *)(lVar6 + 8) == 0) && (*(longlong *)(lVar6 + 0x48) == 0)) {
    uVar4 = 0;
  }
  else {
    piStack_288 = (int *)CONCAT44(piStack_288._4_4_,3);
    cVar3 = FUN_180e94290(6,1,0,2);
    if (cVar3 == '\0') {
      FUN_180e64c00(param_2,&UNK_18104b130);
      goto code_r0x000180e897c6;
    }
    uVar4 = 1;
  }
  *(undefined1 *)((longlong)plVar2 + 0x6c) = uVar4;
  *plVar2 = 0;
  if (*(char *)(lVar7 + 0x7c) == '\0') {
code_r0x000180e894a4:
    aiStack_248[0] = FUN_180e88130(param_1,param_2);
    if (aiStack_248[0] != 0) goto code_r0x000180e897c6;
    lVar6 = plVar1[2];
    if (lVar6 == 0) {
      lVar6 = *plVar1;
    }
    lVar9 = *plVar2;
    uVar8 = FUN_180e62c90(lVar6);
    *(undefined8 *)(lVar9 + 0x18) = uVar8;
    if (*(longlong *)(*plVar2 + 0x18) == 0) goto code_r0x000180e897c6;
  }
  else {
    func_0x000180e67640(param_2);
    piStack_288 = (int *)0x0;
    cVar3 = FUN_180e66f70(param_1,param_2,plVar1,&lStack_210);
    if (cVar3 == '\0') {
      *plVar2 = lStack_210;
      *(int *)(lStack_210 + 0x28) = *(int *)(lStack_210 + 0x28) + 1;
    }
    func_0x000180e67670(param_2);
    if (*plVar2 == 0) goto code_r0x000180e894a4;
  }
  if ((int)plVar1[3] != 0) {
    FUN_180e64ce0(param_2,&UNK_18104b198);
  }
  if (*(char *)((longlong)plVar2 + 0x6b) == '\0') {
    puStack_218 = &uStack_240;
    uStack_240 = 0;
    piStack_238 = (int *)0x0;
    uStack_220 = 0;
    uStack_21c = 1;
  }
  else {
    aiStack_1c8[1] = 2;
    aiStack_248[0] = FUN_180e65fd0(auStack_1f8,plVar1[5]);
    if (aiStack_248[0] != 0) {
      FUN_180e64c00(param_2,&UNK_18104b1d0);
      goto code_r0x000180e897c6;
    }
    FUN_180f29110(auStack_1be,auStack_1f8,(longlong)iStack_1d4);
    uStack_1c0 = func_0x000180e64860(iStack_1d4);
    aiStack_1c8[0] = uStack_1c0 + 6;
    piStack_238 = aiStack_1c8;
    puStack_218 = &uStack_240;
    uStack_240 = CONCAT44(0x12,iStack_1d4 + 10);
    uStack_220 = 0;
    uStack_21c = 1;
    FUN_180e66080(auStack_1f8,plVar1[5]);
    FUN_180e64ce0(param_2,&UNK_18104b1e8,auStack_1f8);
  }
  uStack_230 = 0;
  puStack_200 = &uStack_230;
  uStack_228 = 0;
  uStack_208 = 0;
  uStack_204 = 1;
  *(undefined4 *)((longlong)plVar2 + 0x5c) = 0x811c;
  if (*(char *)(lVar7 + 199) == '\0') {
    *(undefined4 *)((longlong)plVar2 + 0x5c) = 0x819c;
  }
  lVar6 = (*pcRam00000001810c2518)(1,0x18);
  plVar2[1] = lVar6;
  if (lVar6 == 0) {
    FUN_180e64c00(param_2,&UNK_18104ad30);
  }
  else {
    lStack_250 = lVar6 + 0x10;
    plStack_258 = plVar2 + 0xc;
    puStack_278 = &uStack_220;
    if (*(char *)((longlong)plVar2 + 0x6b) == '\0') {
      puStack_278 = (undefined4 *)0x0;
    }
    puStack_260 = &uStack_208;
    uStack_270 = 0;
    uStack_280 = 0;
    piStack_288 = (int *)((ulonglong)piStack_288 & 0xffffffff00000000);
    lStack_268 = lVar6;
    iVar5 = (**(code **)(lRam00000001810d5350 + 0x30))
                      (*plVar2,0,*(undefined8 *)(*plVar2 + 0x18),
                       *(undefined4 *)((longlong)plVar2 + 0x5c));
    if (iVar5 == 0x90312) {
      piStack_288 = aiStack_248;
      uVar10 = func_0x000180e7c3e0(*(undefined8 *)(param_1 + 8),param_2,uStack_228,
                                   uStack_230 & 0xffffffff);
      (**(code **)(lRam00000001810d5350 + 0x80))(uStack_228);
      if ((aiStack_248[0] == 0) && ((uStack_230 & 0xffffffff) == uVar10)) {
        *(undefined4 *)((longlong)plVar2 + 100) = 0;
        *(undefined2 *)(plVar2 + 0xd) = 0;
        *(undefined1 *)((longlong)plVar2 + 0x6a) = 0;
        *(undefined1 *)(plVar2 + 0xb) = 0;
        *(undefined4 *)((longlong)plVar1 + 0x54) = 1;
      }
      else {
        FUN_180e64c00(param_2,&UNK_18104b270,uVar10);
      }
    }
    else {
      (*pcRam00000001810c2500)(plVar2[1]);
      plVar2[1] = 0;
      if (iVar5 == -0x7ff6fd00) {
        uVar8 = FUN_180e90290(0x80090300,auStack_148,0x100);
        FUN_180e64c00(param_2,&UNK_18104b200,uVar8);
      }
      else if (iVar5 == -0x7ff6fcde) {
        uVar8 = FUN_180e90290(0x80090322,auStack_148,0x100);
        FUN_180e64c00(param_2,&UNK_18104b238,uVar8);
      }
      else {
        uVar8 = FUN_180e90290(iVar5,auStack_148,0x100);
        FUN_180e64c00(param_2,&UNK_18104b200,uVar8);
      }
    }
  }
code_r0x000180e897c6:
  FUN_180e155e0(uStack_48 ^ (ulonglong)auStack_2a8);
  return;
}

