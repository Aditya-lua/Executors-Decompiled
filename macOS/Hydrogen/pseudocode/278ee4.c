
/* WARNING: Possible PIC construction at 0x00278f9c: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x00278fa0) */
/* WARNING: Removing unreachable block (ram,0x00278fe8) */
/* WARNING: Removing unreachable block (ram,0x00279014) */
/* WARNING: Removing unreachable block (ram,0x00279020) */
/* WARNING: Removing unreachable block (ram,0x00279030) */
/* WARNING: Removing unreachable block (ram,0x0027903c) */
/* WARNING: Removing unreachable block (ram,0x00278fa4) */

undefined8
FUN_00278ee4(undefined8 *param_1,undefined8 param_2,undefined8 param_3,undefined8 param_4)

{
  ulong uVar1;
  code *pcVar2;
  bool in_CY;
  int iVar3;
  undefined8 uVar4;
  undefined8 *puVar5;
  long lVar6;
  undefined1 *puVar7;
  ulong uVar8;
  undefined1 *puVar9;
  ulong uVar10;
  long *plVar11;
  long unaff_x29;
  undefined8 uStack_80;
  undefined8 uStack_78;
  undefined8 uStack_70;
  undefined8 uStack_68;
  undefined8 uStack_60;
  undefined8 uStack_58;
  undefined8 uStack_50;
  undefined8 uStack_48;
  
  if (!in_CY) {
    uVar4 = _memcpy();
    *param_1 = param_2;
    param_1[1] = 0;
    param_1[3] = 0;
    param_1[2] = 0;
    param_1[5] = 0;
    param_1[4] = 0;
    param_1[7] = 0;
    param_1[6] = 0;
    param_1[9] = 0;
    param_1[8] = 0;
    param_1[10] = param_4;
    return uVar4;
  }
  puVar5 = (undefined8 *)
           func_0x007a2810(&UNK_0082df9c,0x1a,unaff_x29 + -0x21,&UNK_009ccdc0,&UNK_009cd220);
  uVar8 = *(ulong *)(puVar5[3] + 8);
  uStack_58 = 0;
  uStack_60 = 0;
  uStack_48 = 0;
  uStack_50 = 0;
  uStack_78 = 0;
  uStack_80 = 0;
  uStack_68 = 0;
  uStack_70 = 0;
  if (0x40 < uVar8) {
    func_0x007a28b0(uVar8,0x40,&UNK_009cd238);
                    /* WARNING: Does not return */
    pcVar2 = (code *)SoftwareBreakpoint(1,0x278fe8);
    (*pcVar2)();
  }
  uVar1 = puVar5[2];
  puVar9 = (undefined1 *)puVar5[1];
  if (uVar8 == *(ulong *)(puVar5[3] + 8)) {
    uVar10 = puVar5[4];
    if (uVar1 < uVar10) {
      func_0x007a28b0(uVar10,uVar1,&UNK_009cd268);
                    /* WARNING: Does not return */
      pcVar2 = (code *)SoftwareBreakpoint(1,0x279178);
      (*pcVar2)();
    }
    plVar11 = (long *)*puVar5;
    uVar4 = func_0x00273ea8(*plVar11 + 0x28);
    lVar6 = plVar11[1];
    if (lVar6 == 0) {
      iVar3 = func_0x002dd0c0(&uStack_80,uVar8,uVar4,plVar11 + 2,plVar11[10],puVar9,uVar10);
    }
    else {
      iVar3 = func_0x002dcf44(&uStack_80,uVar8,uVar4,*(undefined8 *)(lVar6 + 0x10),
                              *(undefined8 *)(lVar6 + 0x18),plVar11 + 2,plVar11[0xc],puVar9,uVar10);
    }
    if (iVar3 == 1) {
      if (uVar1 == 0) {
        return 0;
      }
      uVar8 = uVar1;
      puVar7 = puVar9;
      do {
        *puVar7 = 0;
        uVar8 = uVar8 - 1;
        puVar7 = puVar7 + 1;
      } while (uVar8 != 0);
      uVar4 = 0;
      goto code_r0x00279124;
    }
  }
  if (uVar1 == 0) {
    return 1;
  }
  uVar8 = uVar1;
  puVar7 = puVar9;
  do {
    *puVar7 = 0;
    uVar8 = uVar8 - 1;
    puVar7 = puVar7 + 1;
  } while (uVar8 != 0);
  uVar4 = 1;
code_r0x00279124:
  func_0x00187bd4(puVar9,uVar1,1);
  return uVar4;
}

