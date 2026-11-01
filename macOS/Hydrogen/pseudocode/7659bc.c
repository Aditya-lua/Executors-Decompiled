
ulong FUN_007659bc(undefined8 param_1,long param_2)

{
  int *piVar1;
  uint uVar2;
  uint uVar3;
  int iVar4;
  int iVar5;
  ulong uVar6;
  undefined1 *puVar7;
  long lVar8;
  char *pcVar9;
  long in_x17;
  long *unaff_x19;
  int iVar10;
  ulong unaff_x20;
  uint uVar11;
  long lVar12;
  long unaff_x25;
  long unaff_x29;
  undefined1 auVar13 [16];
  undefined8 in_stack_00000048;
  undefined1 uStack00000000000001c0;
  undefined1 uStack00000000000001c8;
  undefined8 uStack_19f8;
  uint auStack_1880 [512];
  uint auStack_1080 [4];
  long alStack_1070 [510];
  long lStack_80;
  
  puVar7 = &uStack00000000000001c0;
LAB_00765200:
  do {
    unaff_x25 = unaff_x25 + 1;
    if (in_stack_00000048._4_4_ <= unaff_x25) {
      if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x70)) {
        return unaff_x20;
      }
      ___stack_chk_fail();
      auVar13 = (*(code *)PTR____chkstk_darwin_009b01d8)();
      lStack_80 = *(long *)PTR____stack_chk_guard_009b01e8;
      uStack_19f8 = 0;
      iVar4 = func_0x0076489c(auVar13._8_8_,auStack_1080,auStack_1880,(long)&uStack_19f8 + 4,
                              &uStack_19f8,puVar7);
      uVar6 = 0;
      if ((iVar4 != 0) || (uStack_19f8._4_4_ < 1)) goto code_r0x00766898;
      lVar8 = 0;
      uVar6 = 0;
      break;
    }
    piVar1 = (int *)(in_x17 + unaff_x25 * 0x20);
    lVar8 = *(long *)(piVar1 + 6);
    uVar11 = piVar1[2];
    if (lVar8 != 0) {
      pcVar9 = *(char **)(piVar1 + 4);
      iVar4 = (int)lVar8;
      iVar10 = (int)unaff_x20;
      do {
        if (*pcVar9 == '\0') goto code_r0x00765258;
        *(char *)*unaff_x19 = *pcVar9;
        *unaff_x19 = *unaff_x19 + 1;
        pcVar9 = pcVar9 + 1;
        unaff_x20 = (ulong)((int)unaff_x20 + 1);
        lVar8 = lVar8 + -1;
      } while (lVar8 != 0);
      unaff_x20 = (ulong)(uint)(iVar10 + iVar4);
code_r0x00765258:
      if ((uVar11 >> 0x14 & 1) != 0) goto LAB_00765200;
    }
    uVar3 = uVar11;
    if ((uVar11 >> 0xe & 1) == 0) {
joined_r0x007653dc:
      uVar2 = uVar11 >> 0x10;
      uVar11 = uVar3;
      if ((uVar2 & 1) != 0) goto code_r0x0076526c;
code_r0x007652b4:
      if ((uVar11 >> 0xf & 1) == 0) {
        uVar11 = *(uint *)(puVar7 + (ulong)*(uint *)(in_x17 + unaff_x25 * 0x20 + 0xc) * 0x10);
      }
      else {
        uVar11 = *(uint *)(puVar7 + (ulong)*(uint *)(in_x17 + unaff_x25 * 0x20 + 0xc) * 0x10);
      }
    }
    else {
      if (*(int *)(&uStack00000000000001c8 + (long)*piVar1 * 0x10) < 0) {
        uVar3 = uVar11 & 0xfffffeff;
        goto joined_r0x007653dc;
      }
      if ((uVar11 >> 0x10 & 1) == 0) goto code_r0x007652b4;
code_r0x0076526c:
      uVar11 = *(uint *)(puVar7 + (ulong)*(uint *)(in_x17 + unaff_x25 * 0x20 + 0xc) * 0x10);
    }
    if (uVar11 < 10) {
                    /* WARNING: Could not recover jumptable at 0x00765308. Too many branches */
                    /* WARNING: Treating indirect jump as call */
      uVar6 = (*(code *)(&UNK_0076530c + (ulong)*(byte *)(param_2 + (ulong)uVar11) * 4))();
      return uVar6;
    }
  } while( true );
code_r0x00765dd4:
  lVar12 = alStack_1070[lVar8 * 4 + 1];
  uVar11 = auStack_1080[lVar8 * 8 + 2];
  if (lVar12 != 0) {
    pcVar9 = (char *)alStack_1070[lVar8 * 4];
    iVar10 = (int)lVar12;
    iVar4 = (int)uVar6;
    do {
      if (*pcVar9 == '\0') goto code_r0x00765e18;
      iVar5 = _fputc(*pcVar9,auVar13._0_8_);
      if (iVar5 == -1) goto code_r0x00766898;
      pcVar9 = pcVar9 + 1;
      uVar6 = (ulong)((int)uVar6 + 1);
      lVar12 = lVar12 + -1;
    } while (lVar12 != 0);
    uVar6 = (ulong)(uint)(iVar4 + iVar10);
code_r0x00765e18:
    if ((uVar11 >> 0x14 & 1) != 0) goto code_r0x00765dc4;
  }
  uVar3 = uVar11;
  if ((uVar11 >> 0xe & 1) == 0) {
joined_r0x00765f9c:
    uVar2 = uVar11 >> 0x10;
    uVar11 = uVar3;
    if ((uVar2 & 1) != 0) goto code_r0x00765e34;
code_r0x00765e80:
    if ((uVar11 >> 0xf & 1) == 0) {
      uVar11 = auStack_1880[(ulong)auStack_1080[lVar8 * 8 + 3] * 4];
    }
    else {
      uVar11 = auStack_1880[(ulong)auStack_1080[lVar8 * 8 + 3] * 4];
    }
  }
  else {
    if ((int)auStack_1880[(long)(int)auStack_1080[lVar8 * 8] * 4 + 2] < 0) {
      uVar3 = uVar11 & 0xfffffeff;
      goto joined_r0x00765f9c;
    }
    if ((uVar11 >> 0x10 & 1) == 0) goto code_r0x00765e80;
code_r0x00765e34:
    uVar11 = auStack_1880[(ulong)auStack_1080[lVar8 * 8 + 3] * 4];
  }
  if (uVar11 < 10) {
                    /* WARNING: Could not recover jumptable at 0x00765edc. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    uVar6 = (*(code *)(&UNK_00765ee0 + (ulong)(byte)(&UNK_008cd859)[uVar11] * 4))();
    return uVar6;
  }
code_r0x00765dc4:
  lVar8 = lVar8 + 1;
  if (uStack_19f8._4_4_ <= lVar8) {
code_r0x00766898:
    if (*(long *)PTR____stack_chk_guard_009b01e8 == lStack_80) {
      return uVar6;
    }
    lVar8 = ___stack_chk_fail();
    lVar12 = (*pcRam0000000000a2b608)(1,0x50);
    if (lVar12 == 0) {
      return 0x1b;
    }
    func_0x0074066c(lVar12 + 0x28,0x10000);
    *(long *)(lVar8 + 0x1b0) = lVar12;
    return 0;
  }
  goto code_r0x00765dd4;
}

