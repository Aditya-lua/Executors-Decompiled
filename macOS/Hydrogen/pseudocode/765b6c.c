
ulong FUN_00765b6c(ulong param_1,undefined8 param_2,long param_3,long param_4)

{
  int *piVar1;
  uint uVar2;
  uint uVar3;
  int iVar4;
  int iVar5;
  int in_w9;
  long lVar6;
  uint in_w10;
  char *pcVar7;
  undefined1 *in_x11;
  long in_x17;
  long *unaff_x19;
  int iVar8;
  int unaff_w20;
  ulong uVar9;
  undefined1 unaff_w21;
  uint uVar10;
  long lVar11;
  long unaff_x25;
  long unaff_x29;
  undefined1 auVar12 [16];
  undefined8 in_stack_00000048;
  undefined8 uStack_19f8;
  uint auStack_1880 [512];
  uint auStack_1080 [4];
  long alStack_1070 [510];
  long lStack_80;
  
  do {
    *in_x11 = unaff_w21;
    in_x11 = (undefined1 *)(*unaff_x19 + 1);
    *unaff_x19 = (long)in_x11;
    in_w10 = in_w10 - 1;
  } while (1 < in_w10);
  uVar9 = (ulong)(uint)(in_w9 + unaff_w20);
  if ((param_1 & 1) == 0) {
    *(undefined1 *)*unaff_x19 = 0x22;
    *unaff_x19 = *unaff_x19 + 1;
    uVar9 = (ulong)(in_w9 + unaff_w20 + 1);
  }
LAB_00765200:
  do {
    unaff_x25 = unaff_x25 + 1;
    if (in_stack_00000048._4_4_ <= unaff_x25) {
      if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x70)) {
        return uVar9;
      }
      ___stack_chk_fail();
      auVar12 = (*(code *)PTR____chkstk_darwin_009b01d8)();
      lStack_80 = *(long *)PTR____stack_chk_guard_009b01e8;
      uStack_19f8 = 0;
      iVar4 = func_0x0076489c(auVar12._8_8_,auStack_1080,auStack_1880,(long)&uStack_19f8 + 4,
                              &uStack_19f8,param_4);
      uVar9 = 0;
      if ((iVar4 != 0) || (uStack_19f8._4_4_ < 1)) goto LAB_00766898;
      lVar6 = 0;
      uVar9 = 0;
      break;
    }
    piVar1 = (int *)(in_x17 + unaff_x25 * 0x20);
    lVar6 = *(long *)(piVar1 + 6);
    uVar10 = piVar1[2];
    if (lVar6 != 0) {
      pcVar7 = *(char **)(piVar1 + 4);
      iVar4 = (int)lVar6;
      iVar8 = (int)uVar9;
      do {
        if (*pcVar7 == '\0') goto code_r0x00765258;
        *(char *)*unaff_x19 = *pcVar7;
        *unaff_x19 = *unaff_x19 + 1;
        pcVar7 = pcVar7 + 1;
        uVar9 = (ulong)((int)uVar9 + 1);
        lVar6 = lVar6 + -1;
      } while (lVar6 != 0);
      uVar9 = (ulong)(uint)(iVar8 + iVar4);
code_r0x00765258:
      if ((uVar10 >> 0x14 & 1) != 0) goto LAB_00765200;
    }
    uVar3 = uVar10;
    if ((uVar10 >> 0xe & 1) == 0) {
joined_r0x007653dc:
      uVar2 = uVar10 >> 0x10;
      uVar10 = uVar3;
      if ((uVar2 & 1) != 0) goto code_r0x0076526c;
code_r0x007652b4:
      if ((uVar10 >> 0xf & 1) == 0) {
        uVar10 = *(uint *)(param_4 + (ulong)*(uint *)(in_x17 + unaff_x25 * 0x20 + 0xc) * 0x10);
      }
      else {
        uVar10 = *(uint *)(param_4 + (ulong)*(uint *)(in_x17 + unaff_x25 * 0x20 + 0xc) * 0x10);
      }
    }
    else {
      if (*(int *)(param_4 + (long)*piVar1 * 0x10 + 8) < 0) {
        uVar3 = uVar10 & 0xfffffeff;
        goto joined_r0x007653dc;
      }
      if ((uVar10 >> 0x10 & 1) == 0) goto code_r0x007652b4;
code_r0x0076526c:
      uVar10 = *(uint *)(param_4 + (ulong)*(uint *)(in_x17 + unaff_x25 * 0x20 + 0xc) * 0x10);
    }
    if (uVar10 < 10) {
                    /* WARNING: Could not recover jumptable at 0x00765308. Too many branches */
                    /* WARNING: Treating indirect jump as call */
      uVar9 = (*(code *)(&UNK_0076530c + (ulong)*(byte *)(param_3 + (ulong)uVar10) * 4))();
      return uVar9;
    }
  } while( true );
LAB_00765dd4:
  lVar11 = alStack_1070[lVar6 * 4 + 1];
  uVar10 = auStack_1080[lVar6 * 8 + 2];
  if (lVar11 != 0) {
    pcVar7 = (char *)alStack_1070[lVar6 * 4];
    iVar8 = (int)lVar11;
    iVar4 = (int)uVar9;
    do {
      if (*pcVar7 == '\0') goto LAB_00765e18;
      iVar5 = _fputc(*pcVar7,auVar12._0_8_);
      if (iVar5 == -1) goto LAB_00766898;
      pcVar7 = pcVar7 + 1;
      uVar9 = (ulong)((int)uVar9 + 1);
      lVar11 = lVar11 + -1;
    } while (lVar11 != 0);
    uVar9 = (ulong)(uint)(iVar4 + iVar8);
LAB_00765e18:
    if ((uVar10 >> 0x14 & 1) != 0) goto LAB_00765dc4;
  }
  uVar3 = uVar10;
  if ((uVar10 >> 0xe & 1) == 0) {
joined_r0x00765f9c:
    uVar2 = uVar10 >> 0x10;
    uVar10 = uVar3;
    if ((uVar2 & 1) != 0) goto code_r0x00765e34;
LAB_00765e80:
    if ((uVar10 >> 0xf & 1) == 0) {
      uVar10 = auStack_1880[(ulong)auStack_1080[lVar6 * 8 + 3] * 4];
    }
    else {
      uVar10 = auStack_1880[(ulong)auStack_1080[lVar6 * 8 + 3] * 4];
    }
  }
  else {
    if ((int)auStack_1880[(long)(int)auStack_1080[lVar6 * 8] * 4 + 2] < 0) {
      uVar3 = uVar10 & 0xfffffeff;
      goto joined_r0x00765f9c;
    }
    if ((uVar10 >> 0x10 & 1) == 0) goto LAB_00765e80;
code_r0x00765e34:
    uVar10 = auStack_1880[(ulong)auStack_1080[lVar6 * 8 + 3] * 4];
  }
  if (uVar10 < 10) {
                    /* WARNING: Could not recover jumptable at 0x00765edc. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    uVar9 = (*(code *)(&UNK_00765ee0 + (ulong)(byte)(&UNK_008cd859)[uVar10] * 4))();
    return uVar9;
  }
LAB_00765dc4:
  lVar6 = lVar6 + 1;
  if (uStack_19f8._4_4_ <= lVar6) {
LAB_00766898:
    if (*(long *)PTR____stack_chk_guard_009b01e8 == lStack_80) {
      return uVar9;
    }
    lVar6 = ___stack_chk_fail();
    lVar11 = (*pcRam0000000000a2b608)(1,0x50);
    if (lVar11 == 0) {
      return 0x1b;
    }
    func_0x0074066c(lVar11 + 0x28,0x10000);
    *(long *)(lVar6 + 0x1b0) = lVar11;
    return 0;
  }
  goto LAB_00765dd4;
}

