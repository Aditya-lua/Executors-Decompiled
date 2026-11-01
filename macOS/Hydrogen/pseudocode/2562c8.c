
void FUN_002562c8(long param_1)

{
  ulong uVar1;
  code *pcVar2;
  ulong uVar3;
  long *plVar4;
  long *plVar5;
  long extraout_x1;
  ulong uVar6;
  ulong uVar7;
  ulong uVar8;
  ulong *unaff_x19;
  ulong uVar9;
  ulong unaff_x20;
  ulong unaff_x22;
  ulong uVar10;
  long lVar11;
  undefined8 uVar12;
  ulong unaff_x25;
  ulong *puVar13;
  long unaff_x26;
  long lVar14;
  undefined1 auVar15 [16];
  undefined8 uStack0000000000000008;
  ulong in_stack_00000010;
  ulong uStack0000000000000018;
  
  if ((long)unaff_x22 < 0) {
    uVar12 = 0;
LAB_00256454:
    uVar12 = func_0x007a1f00(uVar12);
    if (uStack0000000000000008 != 0) {
      func_0x00187bd4(in_stack_00000010,uStack0000000000000008,1);
    }
    auVar15 = __Unwind_Resume(uVar12);
    plVar5 = auVar15._8_8_;
    plVar4 = auVar15._0_8_;
    uVar3 = plVar4[2];
    if (*plVar4 == 0) {
      lVar14 = plVar4[1];
      uVar10 = plVar5[2];
      if (*plVar5 - uVar10 < uVar3) {
LAB_002565c8:
        func_0x0079b61c(plVar5,uVar10,uVar3,1,1);
        uVar10 = plVar5[2];
      }
      _memcpy(plVar5[1] + uVar10,lVar14,uVar3);
      plVar5[2] = uVar10 + uVar3;
    }
    else if (plVar4[1] != 0) {
      uVar9 = plVar4[3];
      puVar13 = (ulong *)(*plVar4 + 8);
      lVar14 = plVar4[1] << 4;
      uVar6 = 0;
      do {
        uVar8 = *puVar13;
        uVar7 = uVar9 - uVar6;
        if ((uVar6 <= uVar9 && uVar7 != 0) && (uVar3 < uVar8 + uVar6)) {
          uVar10 = 0;
          if (uVar6 <= uVar3) {
            uVar10 = uVar3 - uVar6;
          }
          if (uVar8 <= uVar7) {
            uVar7 = uVar8;
          }
          uVar1 = uVar7 - uVar10;
          if (uVar7 < uVar10) {
            func_0x007a28bc(uVar10,uVar7,&UNK_009ca940);
            lVar14 = extraout_x1;
            goto LAB_002565c8;
          }
          uVar7 = puVar13[-1];
          lVar11 = plVar5[2];
          if ((ulong)(*plVar5 - lVar11) < uVar1) {
            func_0x0079b61c(plVar5,lVar11,uVar1,1,1);
            lVar11 = plVar5[2];
          }
          _memcpy(plVar5[1] + lVar11,uVar7 + uVar10,uVar1);
          plVar5[2] = lVar11 + uVar1;
        }
        puVar13 = puVar13 + 2;
        lVar14 = lVar14 + -0x10;
        uVar6 = uVar8 + uVar6;
      } while (lVar14 != 0);
    }
    return;
  }
  if (unaff_x22 == 0) {
    in_stack_00000010 = 1;
    uVar3 = in_stack_00000010;
  }
  else {
    uVar12 = 1;
    uVar3 = func_0x00187bd0();
    if (uVar3 == 0) goto LAB_00256454;
  }
  uStack0000000000000008 = unaff_x22;
  if (unaff_x26 == 0) {
    uVar12 = *(undefined8 *)(param_1 + 8);
    if (unaff_x22 < unaff_x20) {
      func_0x0079b61c(&uStack0000000000000008,0);
    }
    _memcpy(uVar3,uVar12);
    uStack0000000000000018 = unaff_x20;
  }
  else {
    uStack0000000000000018 = 0;
    if (*(long *)(param_1 + 8) != 0) {
      uVar10 = 0;
      puVar13 = (ulong *)(unaff_x26 + 8);
      lVar14 = *(long *)(param_1 + 8) << 4;
      uVar6 = 0;
      do {
        uVar7 = *puVar13;
        uVar9 = unaff_x25 - uVar6;
        if ((uVar6 <= unaff_x25 && uVar9 != 0) && (unaff_x20 < uVar7 + uVar6)) {
          uVar8 = 0;
          if (uVar6 <= unaff_x20) {
            uVar8 = unaff_x20 - uVar6;
          }
          if (uVar7 <= uVar9) {
            uVar9 = uVar7;
          }
          uVar1 = uVar9 - uVar8;
          if (uVar9 < uVar8) {
            func_0x007a28bc(uVar8,uVar9,&UNK_009ca940);
                    /* WARNING: Does not return */
            pcVar2 = (code *)SoftwareBreakpoint(1,0x256430);
            (*pcVar2)();
          }
          uVar9 = puVar13[-1];
          if (uStack0000000000000008 - uVar10 < uVar1) {
            func_0x0079b61c(&uStack0000000000000008,uVar10,uVar1,1,1);
            uVar10 = uStack0000000000000018;
          }
          _memcpy(uVar3 + uVar10,uVar9 + uVar8,uVar1);
          uVar10 = uVar10 + uVar1;
          uStack0000000000000018 = uVar10;
        }
        puVar13 = puVar13 + 2;
        lVar14 = lVar14 + -0x10;
        uVar6 = uVar7 + uVar6;
      } while (lVar14 != 0);
    }
  }
  unaff_x19[1] = uVar3;
  *unaff_x19 = uStack0000000000000008;
  unaff_x19[2] = uStack0000000000000018;
  return;
}

