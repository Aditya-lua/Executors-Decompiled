
void FUN_00435a2c(undefined8 param_1,undefined8 param_2,int param_3,undefined8 param_4,int param_5)

{
  int *piVar1;
  int *piVar2;
  int *piVar3;
  int *piVar4;
  int iVar5;
  int iVar6;
  int iVar7;
  int iVar8;
  uint uVar9;
  uint uVar10;
  ulong uVar11;
  ulong uVar12;
  bool bVar13;
  undefined8 uVar14;
  undefined4 *puVar15;
  long lVar16;
  ulong uVar17;
  ulong uVar18;
  ulong unaff_x27;
  long unaff_x29;
  undefined1 auVar19 [16];
  undefined1 uStack0000000000000040;
  undefined1 uStack00000000000000b0;
  int iStack_78;
  int iStack_74;
  int iStack_70;
  uint uStack_6c;
  ulong uStack_68;
  
  func_0x00187bd4();
  if (((unaff_x27 & 1) != 0) && (*(long *)(unaff_x29 + -0x70) != 0)) {
    param_3 = 1;
    func_0x00187bd4(*(undefined8 *)(unaff_x29 + -0x68));
  }
  func_0x003f53f4(unaff_x29 + -0xc0);
  func_0x003f7224(&uStack00000000000000b0);
  __Unwind_Resume();
  uVar14 = func_0x007a2668();
  func_0x0018d654(unaff_x29 + -0xf0);
  func_0x003f533c(&uStack0000000000000040);
  __Unwind_Resume(uVar14);
  auVar19 = func_0x007a2668();
  lVar16 = auVar19._8_8_;
  puVar15 = auVar19._0_8_;
  iStack_78 = (int)param_4;
  iVar6 = *(int *)(lVar16 + 0x60);
  iVar7 = *(int *)(lVar16 + 0x68);
  piVar4 = (int *)0x0;
  if (iVar7 != 5) {
    piVar4 = (int *)(lVar16 + 0x68);
  }
  iVar8 = *(int *)(lVar16 + 0x70);
  piVar1 = (int *)0x0;
  if (iVar8 != 5) {
    piVar1 = (int *)(lVar16 + 0x70);
  }
  piVar3 = &iStack_78;
  iVar5 = param_3;
  if (param_5 == 0) {
    iVar5 = 1;
    piVar3 = &iStack_74;
  }
  bVar13 = iVar6 != 5;
  if (bVar13) {
    iVar5 = iVar6;
  }
  piVar2 = (int *)0x0;
  if (bVar13) {
    piVar2 = (int *)(lVar16 + 0x60);
  }
  if (bVar13) {
    piVar3 = piVar2 + 1;
  }
  func_0x00435de8(&iStack_70,iVar5,*piVar3,1);
  uVar11 = uStack_68;
  uVar9 = uStack_6c;
  if (iStack_70 == 1) {
    *(ulong *)(puVar15 + 2) = uStack_68;
    *puVar15 = 1;
  }
  else {
    uVar17 = uStack_68 >> 0x20;
    piVar3 = &iStack_78;
    iVar6 = param_3;
    if (iVar7 != 5) {
      piVar3 = piVar4 + 1;
      iVar6 = iVar7;
    }
    func_0x00435de8(&iStack_70,iVar6,*piVar3,0);
    uVar12 = uStack_68;
    uVar10 = uStack_6c;
    if (iStack_70 == 1) {
      *(ulong *)(puVar15 + 2) = uStack_68;
      *puVar15 = 1;
    }
    else {
      uVar18 = uStack_68 >> 0x20;
      piVar4 = &iStack_78;
      iVar6 = param_3;
      if (iVar8 != 5) {
        piVar4 = piVar1 + 1;
        iVar6 = iVar8;
      }
      func_0x00435de8(&iStack_70,iVar6,*piVar4,0);
      if (iStack_70 != 1) {
        puVar15[2] = (int)(uVar12 >> 0x20);
        puVar15[3] = (int)(uStack_68 >> 0x20);
        puVar15[4] = uVar9;
        puVar15[5] = (int)uVar11;
        puVar15[6] = uVar10;
        puVar15[7] = (int)uVar12;
        puVar15[8] = uStack_6c;
        puVar15[9] = (int)uStack_68;
        *puVar15 = 0;
        puVar15[1] = (int)(uVar11 >> 0x20);
        goto joined_r0x00435d08;
      }
      *(ulong *)(puVar15 + 2) = uStack_68;
      *puVar15 = 1;
      if (uVar18 != 0xffffffff) {
        _close(uVar18);
      }
      if (1 < uVar10) {
        _close(uVar12);
      }
    }
    if (uVar17 != 0xffffffff) {
      _close(uVar17);
    }
    if (1 < uVar9) {
      _close(uVar11);
    }
  }
joined_r0x00435d08:
  if (param_3 == 3) {
                    /* WARNING: Could not recover jumptable at 0x007b322c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    (*(code *)PTR__close_00a24cb8)(param_4);
    return;
  }
  return;
}

