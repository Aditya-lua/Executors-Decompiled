
undefined8 FUN_00279024(long param_1,long param_2,long param_3)

{
  ulong uVar1;
  code *pcVar2;
  int iVar3;
  undefined8 *puVar4;
  undefined8 uVar5;
  long lVar6;
  long lVar7;
  undefined1 *puVar8;
  undefined1 *puVar9;
  ulong uVar10;
  long *plVar11;
  undefined1 auVar12 [16];
  
  while (param_1 = param_1 + 1, param_3 != param_1) {
    *(undefined1 *)(param_2 + param_1) = 0;
  }
  lVar6 = 1;
  func_0x00187bd4();
  auVar12 = __Unwind_Resume();
  puVar4 = auVar12._0_8_;
  uVar1 = puVar4[2];
  puVar9 = (undefined1 *)puVar4[1];
  if (lVar6 == *(long *)(puVar4[3] + 8)) {
    uVar10 = puVar4[4];
    if (uVar1 < uVar10) {
      func_0x007a28b0(uVar10,uVar1,&UNK_009cd268);
                    /* WARNING: Does not return */
      pcVar2 = (code *)SoftwareBreakpoint(1,0x279178);
      (*pcVar2)();
    }
    plVar11 = (long *)*puVar4;
    uVar5 = func_0x00273ea8(*plVar11 + 0x28);
    lVar7 = plVar11[1];
    if (lVar7 == 0) {
      iVar3 = func_0x002dd0c0(auVar12._8_8_,lVar6,uVar5,plVar11 + 2,plVar11[10],puVar9,uVar10);
    }
    else {
      iVar3 = func_0x002dcf44(auVar12._8_8_,lVar6,uVar5,*(undefined8 *)(lVar7 + 0x10),
                              *(undefined8 *)(lVar7 + 0x18),plVar11 + 2,plVar11[0xc],puVar9,uVar10);
    }
    if (iVar3 == 1) {
      if (uVar1 == 0) {
        return 0;
      }
      uVar10 = uVar1;
      puVar8 = puVar9;
      do {
        *puVar8 = 0;
        uVar10 = uVar10 - 1;
        puVar8 = puVar8 + 1;
      } while (uVar10 != 0);
      uVar5 = 0;
      goto code_r0x00279124;
    }
  }
  if (uVar1 == 0) {
    return 1;
  }
  uVar10 = uVar1;
  puVar8 = puVar9;
  do {
    *puVar8 = 0;
    uVar10 = uVar10 - 1;
    puVar8 = puVar8 + 1;
  } while (uVar10 != 0);
  uVar5 = 1;
code_r0x00279124:
  func_0x00187bd4(puVar9,uVar1,1);
  return uVar5;
}

