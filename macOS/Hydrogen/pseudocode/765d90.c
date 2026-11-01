
ulong FUN_00765d90(long param_1)

{
  uint uVar1;
  uint uVar2;
  int iVar3;
  ulong uVar4;
  long lVar5;
  int iVar6;
  ulong unaff_x19;
  uint uVar7;
  int iVar8;
  long lVar9;
  char *pcVar10;
  long unaff_x25;
  long unaff_x29;
  long lStack0000000000000018;
  long lStack0000000000000028;
  undefined8 in_stack_00000048;
  undefined1 uStack00000000000001c0;
  undefined1 uStack00000000000001c8;
  uint uStack_7ffffffc;
  long alStack_7ffffff8 [268435451];
  
  lStack0000000000000018 = param_1 + 1;
  lStack0000000000000028 = param_1 + 0x144;
  do {
    lVar5 = unaff_x25 * 0x20;
    lVar9 = *(long *)((long)register0x00000008 + lVar5 + 0x9d8);
    uVar7 = *(uint *)((long)register0x00000008 + lVar5 + 0x9c8);
    if (lVar9 != 0) {
      pcVar10 = *(char **)((long)register0x00000008 + lVar5 + 0x9d0);
      iVar8 = (int)lVar9;
      iVar6 = (int)unaff_x19;
      do {
        if (*pcVar10 == '\0') goto LAB_00765e18;
        iVar3 = _fputc();
        if (iVar3 == -1) goto LAB_00766898;
        pcVar10 = pcVar10 + 1;
        unaff_x19 = (ulong)((int)unaff_x19 + 1);
        lVar9 = lVar9 + -1;
      } while (lVar9 != 0);
      unaff_x19 = (ulong)(uint)(iVar6 + iVar8);
LAB_00765e18:
      if ((uVar7 >> 0x14 & 1) != 0) goto LAB_00765dc4;
    }
    uVar2 = uVar7;
    if ((uVar7 >> 0xe & 1) == 0) {
joined_r0x00765f9c:
      uVar1 = uVar7 >> 0x10;
      uVar7 = uVar2;
      if ((uVar1 & 1) != 0) goto code_r0x00765e34;
LAB_00765e80:
      if ((uVar7 >> 0xf & 1) == 0) {
        uVar7 = *(uint *)(&uStack00000000000001c0 +
                         (ulong)*(uint *)((long)register0x00000008 + unaff_x25 * 0x20 + 0x9cc) *
                         0x10);
      }
      else {
        uVar7 = *(uint *)(&uStack00000000000001c0 +
                         (ulong)*(uint *)((long)register0x00000008 + unaff_x25 * 0x20 + 0x9cc) *
                         0x10);
      }
    }
    else {
      if (*(int *)(&uStack00000000000001c8 +
                  (long)*(int *)((long)register0x00000008 + lVar5 + 0x9c0) * 0x10) < 0) {
        uVar2 = uVar7 & 0xfffffeff;
        goto joined_r0x00765f9c;
      }
      if ((uVar7 >> 0x10 & 1) == 0) goto LAB_00765e80;
code_r0x00765e34:
      uVar7 = *(uint *)(&uStack00000000000001c0 +
                       (ulong)*(uint *)((long)register0x00000008 + unaff_x25 * 0x20 + 0x9cc) * 0x10)
      ;
    }
    if (uVar7 < 10) {
                    /* WARNING: Could not recover jumptable at 0x00765edc. Too many branches */
                    /* WARNING: Treating indirect jump as call */
      uVar4 = (*(code *)(&UNK_00765ee0 + (ulong)(byte)(&UNK_008cd859)[uVar7] * 4))();
      return uVar4;
    }
LAB_00765dc4:
    unaff_x25 = unaff_x25 + 1;
    if (in_stack_00000048._4_4_ <= unaff_x25) {
LAB_00766898:
      if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x70)) {
        return unaff_x19;
      }
      lVar5 = ___stack_chk_fail();
      lVar9 = (*pcRam0000000000a2b608)(1,0x50);
      if (lVar9 == 0) {
        return 0x1b;
      }
      func_0x0074066c(lVar9 + 0x28,0x10000);
      *(long *)(lVar5 + 0x1b0) = lVar9;
      return 0;
    }
  } while( true );
}

