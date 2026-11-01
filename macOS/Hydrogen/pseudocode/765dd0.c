
ulong FUN_00765dd0(void)

{
  int *piVar1;
  uint uVar2;
  uint uVar3;
  char in_NG;
  char in_OV;
  int iVar4;
  ulong uVar5;
  long lVar6;
  undefined1 *in_x13;
  int iVar7;
  ulong unaff_x19;
  uint uVar8;
  int iVar9;
  long lVar10;
  char *pcVar11;
  long unaff_x25;
  long unaff_x27;
  long unaff_x29;
  undefined8 in_stack_00000048;
  undefined1 uStack00000000000001c0;
  
  do {
    if (in_NG == in_OV) {
LAB_00766898:
      if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x70)) {
        return unaff_x19;
      }
      lVar10 = ___stack_chk_fail();
      lVar6 = (*pcRam0000000000a2b608)(1,0x50);
      if (lVar6 == 0) {
        return 0x1b;
      }
      func_0x0074066c(lVar6 + 0x28,0x10000);
      *(long *)(lVar10 + 0x1b0) = lVar6;
      return 0;
    }
    piVar1 = (int *)(unaff_x27 + unaff_x25 * 0x20);
    lVar10 = *(long *)(piVar1 + 6);
    uVar8 = piVar1[2];
    if (lVar10 == 0) {
LAB_00765e20:
      uVar3 = uVar8;
      if ((uVar8 >> 0xe & 1) == 0) {
joined_r0x00765f9c:
        uVar2 = uVar8 >> 0x10;
        uVar8 = uVar3;
        if ((uVar2 & 1) != 0) goto code_r0x00765e34;
LAB_00765e80:
        if ((uVar8 >> 0xf & 1) == 0) {
          uVar8 = *(uint *)(in_x13 + (ulong)*(uint *)(unaff_x27 + unaff_x25 * 0x20 + 0xc) * 0x10);
        }
        else {
          uVar8 = *(uint *)(in_x13 + (ulong)*(uint *)(unaff_x27 + unaff_x25 * 0x20 + 0xc) * 0x10);
        }
      }
      else {
        if (*(int *)(in_x13 + (long)*piVar1 * 0x10 + 8) < 0) {
          uVar3 = uVar8 & 0xfffffeff;
          goto joined_r0x00765f9c;
        }
        if ((uVar8 >> 0x10 & 1) == 0) goto LAB_00765e80;
code_r0x00765e34:
        uVar8 = *(uint *)(in_x13 + (ulong)*(uint *)(unaff_x27 + unaff_x25 * 0x20 + 0xc) * 0x10);
      }
      if (uVar8 < 10) {
                    /* WARNING: Could not recover jumptable at 0x00765edc. Too many branches */
                    /* WARNING: Treating indirect jump as call */
        uVar5 = (*(code *)(&UNK_00765ee0 + (ulong)(byte)(&UNK_008cd859)[uVar8] * 4))();
        return uVar5;
      }
    }
    else {
      pcVar11 = *(char **)(piVar1 + 4);
      iVar9 = (int)lVar10;
      iVar7 = (int)unaff_x19;
      do {
        if (*pcVar11 == '\0') goto LAB_00765e18;
        iVar4 = _fputc();
        if (iVar4 == -1) goto LAB_00766898;
        pcVar11 = pcVar11 + 1;
        unaff_x19 = (ulong)((int)unaff_x19 + 1);
        lVar10 = lVar10 + -1;
      } while (lVar10 != 0);
      unaff_x19 = (ulong)(uint)(iVar7 + iVar9);
LAB_00765e18:
      in_x13 = &uStack00000000000001c0;
      if ((uVar8 >> 0x14 & 1) == 0) goto LAB_00765e20;
    }
    unaff_x25 = unaff_x25 + 1;
    in_OV = SBORROW8(unaff_x25,(long)in_stack_00000048._4_4_);
    in_NG = unaff_x25 - in_stack_00000048._4_4_ < 0;
  } while( true );
}

