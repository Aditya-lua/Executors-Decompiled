
/* WARNING: Possible PIC construction at 0x00458cb8: Changing call to branch */
/* WARNING: Possible PIC construction at 0x00458dd0: Changing call to branch */
/* WARNING: Possible PIC construction at 0x00458bc4: Changing call to branch */

void FUN_00458ae4(void)

{
  undefined1 *puVar1;
  long lVar2;
  code *pcVar3;
  ulong uVar4;
  ulong *puVar5;
  ulong uVar6;
  ulong *puVar7;
  undefined *puVar8;
  ulong unaff_x19;
  ulong *unaff_x20;
  ulong unaff_x21;
  ulong unaff_x22;
  ulong uVar9;
  ulong uVar10;
  ulong uVar11;
  undefined8 uVar12;
  undefined1 *unaff_x29;
  undefined1 auVar13 [16];
  undefined8 uStack0000000000000008;
  ulong in_stack_00000010;
  ulong in_stack_00000018;
  undefined1 auStack_70 [8];
  ulong uStack_68;
  ulong uStack_60;
  ulong uStack_58;
  undefined8 uStack_8;
  
  if (unaff_x22 == 0) {
    uVar10 = *unaff_x20;
    if ((uVar10 | 0x8000000000000000) != 0x8000000000000000) {
      uVar9 = unaff_x20[1];
      uStack_8 = 0x458bc8;
      goto code_r0x00187bd4;
    }
    *unaff_x20 = 0x8000000000000000;
    unaff_x20[1] = unaff_x21;
    goto LAB_00458c3c;
  }
  if (unaff_x19 == 0) {
    return;
  }
  uVar10 = *unaff_x20;
  if (*unaff_x20 == 0x8000000000000000) {
    uVar10 = unaff_x22 + unaff_x19;
    if ((long)uVar10 < 0) {
      uVar12 = 0;
LAB_00458c78:
      func_0x007a1f00(uVar12,uVar10,&UNK_009df708);
LAB_00458c8c:
      uVar12 = 0;
LAB_00458c90:
      uVar12 = func_0x007a1f00(uVar12,unaff_x22,&UNK_009df848);
      if (uStack0000000000000008 != 0) {
        uStack_8 = 0x458cbc;
        uVar9 = in_stack_00000010;
        uVar10 = uStack0000000000000008;
        goto code_r0x00187bd4;
      }
      auVar13 = __Unwind_Resume(uVar12);
      puVar7 = auVar13._8_8_;
      puVar5 = auVar13._0_8_;
      uStack_8 = 0x458cc4;
      puVar1 = auStack_70;
      uVar10 = puVar5[2];
      if (uVar10 == 0) {
        uVar10 = *puVar5;
        if ((uVar10 | 0x8000000000000000) == 0x8000000000000000) {
          uVar10 = *puVar7;
          puVar5[1] = puVar7[1];
          *puVar5 = uVar10;
          puVar5[2] = puVar7[2];
          return;
        }
        uVar9 = puVar5[1];
        uStack_8 = 0x458dd4;
        register0x00000008 = (BADSPACEBASE *)auStack_70;
        unaff_x29 = puVar1 + 0x60;
        goto code_r0x00187bd4;
      }
      uVar9 = puVar7[2];
      if (uVar9 != 0) {
        uVar4 = *puVar5;
        if (uVar4 == 0x8000000000000000) {
          uVar4 = uVar9 + uVar10;
          if ((long)uVar4 < 0) {
            uVar12 = 0;
LAB_00458edc:
            puVar8 = &UNK_009df708;
            goto LAB_00458ef4;
          }
          uVar11 = puVar5[1];
          if (uVar4 == 0) {
            uStack_60 = 1;
            if (uVar10 == 0) goto LAB_00458d48;
LAB_00458e80:
            uStack_58 = 0;
            uStack_68 = uVar4;
            func_0x007a1e50(&uStack_68,0,uVar10);
          }
          else {
            uVar12 = 1;
            uVar6 = func_0x00187bd0(uVar4,1);
            if (uVar6 == 0) goto LAB_00458edc;
            uStack_60 = uVar6;
            if (uVar4 < uVar10) goto LAB_00458e80;
LAB_00458d48:
            uStack_58 = 0;
            uStack_68 = uVar4;
          }
          uVar4 = uStack_58;
          _memcpy(uStack_60 + uStack_58,uVar11,uVar10);
          uVar10 = uVar4 + uVar10;
          puVar5[1] = uStack_60;
          *puVar5 = uStack_68;
          puVar5[2] = uVar10;
          uVar4 = *puVar5;
          uStack_58 = uVar10;
          if (uVar4 != 0x8000000000000000) goto LAB_00458dec;
          if ((long)uVar10 < 0) {
            uVar12 = 0;
LAB_00458eec:
            puVar8 = &UNK_009df848;
            uVar4 = uVar10;
LAB_00458ef4:
            func_0x007a1f00(uVar12,uVar4,puVar8);
                    /* WARNING: Does not return */
            pcVar3 = (code *)SoftwareBreakpoint(1,0x458f04);
            (*pcVar3)();
          }
          uVar4 = puVar5[1];
          if (uVar10 == 0) {
            uVar11 = 1;
          }
          else {
            uVar12 = 1;
            uVar11 = func_0x00187bd0(uVar10,1);
            if (uVar11 == 0) goto LAB_00458eec;
          }
          _memcpy(uVar11,uVar4,uVar10);
          *puVar5 = uVar10;
          puVar5[1] = uVar11;
          uVar11 = puVar7[1];
          if (uVar9 != 0) goto LAB_00458ec0;
        }
        else {
LAB_00458dec:
          uVar11 = puVar7[1];
          if (uVar4 - uVar10 < uVar9) {
LAB_00458ec0:
            func_0x007a1e50(puVar5,uVar10,uVar9);
            uVar10 = puVar5[2];
          }
        }
        _memcpy(puVar5[1] + uVar10,uVar11,uVar9);
        puVar5[2] = uVar10 + uVar9;
      }
      uVar10 = *puVar7;
      if ((uVar10 | 0x8000000000000000) == 0x8000000000000000) {
        return;
      }
      uVar9 = puVar7[1];
code_r0x00187bd4:
      *(undefined1 **)((long)register0x00000008 + -0x10) = unaff_x29;
      *(undefined8 *)((long)register0x00000008 + -8) = uStack_8;
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
      (*(code *)PTR__free_00a24e58)(uVar9,uVar10,1);
      return;
    }
    uVar9 = unaff_x20[1];
    if (uVar10 == 0) {
      in_stack_00000010 = 1;
      if (unaff_x22 == 0) goto LAB_00458b3c;
LAB_00458be4:
      in_stack_00000018 = 0;
      uStack0000000000000008 = uVar10;
      func_0x007a1e50(&uStack0000000000000008,0);
    }
    else {
      uVar12 = 1;
      uVar4 = func_0x00187bd0(uVar10,1);
      if (uVar4 == 0) goto LAB_00458c78;
      in_stack_00000010 = uVar4;
      if (uVar10 < unaff_x22) goto LAB_00458be4;
LAB_00458b3c:
      in_stack_00000018 = 0;
      uStack0000000000000008 = uVar10;
    }
    lVar2 = in_stack_00000018;
    _memcpy(in_stack_00000010 + in_stack_00000018,uVar9);
    unaff_x22 = lVar2 + unaff_x22;
    unaff_x20[1] = in_stack_00000010;
    *unaff_x20 = uStack0000000000000008;
    unaff_x20[2] = unaff_x22;
    uVar10 = *unaff_x20;
    in_stack_00000018 = unaff_x22;
    if (*unaff_x20 == 0x8000000000000000) {
      if ((long)unaff_x22 < 0) goto LAB_00458c8c;
      uVar10 = unaff_x20[1];
      if (unaff_x22 == 0) {
        uVar9 = 1;
      }
      else {
        uVar12 = 1;
        uVar9 = func_0x00187bd0(unaff_x22,1);
        if (uVar9 == 0) goto LAB_00458c90;
      }
      _memcpy(uVar9,uVar10,unaff_x22);
      *unaff_x20 = unaff_x22;
      unaff_x20[1] = uVar9;
      uVar10 = unaff_x22;
    }
  }
  if (uVar10 - unaff_x22 < unaff_x19) {
    func_0x007a1e50();
    unaff_x22 = unaff_x20[2];
  }
  _memcpy(unaff_x20[1] + unaff_x22);
  unaff_x19 = unaff_x22 + unaff_x19;
LAB_00458c3c:
  unaff_x20[2] = unaff_x19;
  return;
}

