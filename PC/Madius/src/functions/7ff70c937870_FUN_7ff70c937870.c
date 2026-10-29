/* 7ff70c937870 FUN_7ff70c937870 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

undefined1 (*) [16] FUN_7ff70c937870(undefined1 (*param_1) [16],ulonglong param_2)

{
  code *pcVar1;
  int iVar2;
  int iVar3;
  ulonglong uVar4;
  longlong lVar5;
  undefined1 (*pauVar6) [16];
  undefined *puVar7;
  ulonglong uVar8;
  undefined1 *puVar9;
  undefined1 *puVar10;
  undefined1 (*pauVar11) [16];
  ulonglong uVar12;
  ulonglong uVar13;
  code *unaff_R14;
  undefined8 extraout_XMM0_Qa;
  undefined8 extraout_XMM0_Qa_00;
  undefined1 auVar14 [16];
  undefined8 extraout_XMM0_Qb;
  undefined8 extraout_XMM0_Qb_00;
  undefined1 in_XMM1 [16];
  undefined1 auStack_b8 [24];
  undefined1 auStack_a0 [8];
  undefined1 auStack_98 [16];
  undefined1 auStack_88 [16];
  undefined1 auStack_78 [16];
  undefined1 auStack_68 [16];
  undefined1 auStack_58 [16];
  undefined1 auStack_48 [16];
  undefined4 uStack_38;
  
  puVar10 = auStack_b8;
  puVar9 = auStack_b8;
  uVar8 = _DAT_7ff70cbec7a8;
  if (_DAT_7ff70cbec7a8 == 0) {
    auStack_48 = (undefined1  [16])0x0;
    auStack_58 = (undefined1  [16])0x0;
    auStack_68 = (undefined1  [16])0x0;
    auStack_78 = (undefined1  [16])0x0;
    auStack_88 = (undefined1  [16])0x0;
    auStack_98 = (undefined1  [16])0x0;
    uStack_38 = 0;
    puVar9 = &stack0xffffffffffffff40;
    puVar10 = &stack0xffffffffffffff40;
    iVar2 = func_0x7ff70da3cc31();
    if (-10 < iVar2 % 0x14) {
      uVar8 = 0;
      func_0x7ff70da047c9();
      param_2 = param_2 & 0xffffffff;
      do {
        iVar3 = (*unaff_R14)(param_2);
        param_2 = (ulonglong)(longlong)iVar3 % 0x34;
        auStack_a0[uVar8] = (&UNK_7ff70cb47310)[param_2];
        uVar8 = uVar8 + 1;
      } while (iVar2 % 0x14 + 10 != uVar8);
    }
    uVar8 = FUN_7ff70cb12e80(auStack_a0);
    if (_DAT_7ff70cbec7b0 < uVar8) {
      FUN_7ff70ca005a0(&DAT_7ff70cbec798,uVar8);
      uVar8 = _DAT_7ff70cbec7a8;
      puVar9 = &stack0xffffffffffffff40;
      puVar10 = &stack0xffffffffffffff40;
    }
    else {
      puVar7 = _DAT_7ff70cbec798;
      if (_DAT_7ff70cbec7b0 < 0x10) {
        puVar7 = &DAT_7ff70cbec798;
      }
      _DAT_7ff70cbec7a8 = uVar8;
      FUN_7ff70cb12b70(puVar7,auStack_a0,uVar8);
      puVar7[uVar8] = 0;
      uVar8 = _DAT_7ff70cbec7a8;
    }
  }
  puVar7 = _DAT_7ff70cbec798;
  if (_DAT_7ff70cbec7b0 < 0x10) {
    puVar7 = &DAT_7ff70cbec798;
    puVar10 = puVar9;
  }
  auVar14 = (undefined1  [16])0x0;
  _DAT_7ff70cbec7a8 = uVar8;
  param_1[1] = (undefined1  [16])0x0;
  *param_1 = (undefined1  [16])0x0;
  if (uVar8 == 0) {
    *(undefined8 *)(param_1[1] + 8) = 7;
    return param_1;
  }
  *(undefined8 *)(param_1[1] + 8) = 7;
  if (0x7ffffffffffffffe < uVar8) {
    *(undefined8 *)(puVar10 + -8) = 0x7ff70c937c41;
    FUN_7ff70ca00780();
LAB_7ff70c937c41:
    *(undefined8 *)(puVar10 + -8) = 0x7ff70c937c46;
    FUN_7ff70ca007a0();
    pcVar1 = (code *)swi(3);
    pauVar6 = (undefined1 (*) [16])(*pcVar1)();
    return pauVar6;
  }
  pauVar6 = param_1;
  if (7 < uVar8) {
    uVar4 = uVar8 | 7;
    if (0x7ffffffffffffffe < uVar4) goto LAB_7ff70c937c41;
    uVar12 = 10;
    if (10 < uVar4) {
      uVar12 = uVar4;
    }
    if (uVar4 < 0x7ff) {
      *(undefined8 *)(puVar10 + -8) = 0x7ff70c937a9a;
      pauVar6 = (undefined1 (*) [16])FUN_7ff70ca8ff40(uVar12 * 2 + 2);
      auVar14._8_8_ = extraout_XMM0_Qb_00;
      auVar14._0_8_ = extraout_XMM0_Qa_00;
    }
    else {
      if (0x7fffffffffffffeb < uVar4) goto LAB_7ff70c937c41;
      *(undefined8 *)(puVar10 + -8) = 0x7ff70c937a73;
      lVar5 = FUN_7ff70ca8ff40(uVar12 * 2 + 0x29);
      auVar14._8_8_ = extraout_XMM0_Qb;
      auVar14._0_8_ = extraout_XMM0_Qa;
      pauVar6 = (undefined1 (*) [16])(lVar5 + 0x27U & 0xffffffffffffffe0);
      *(longlong *)(pauVar6[-1] + 8) = lVar5;
    }
    *(undefined1 (**) [16])*param_1 = pauVar6;
    *(ulonglong *)(param_1[1] + 8) = uVar12;
  }
  uVar4 = uVar8;
  pauVar11 = pauVar6;
  if ((3 < uVar8) &&
     (((undefined1 (*) [16])(puVar7 + uVar8) <= pauVar6 || (*pauVar6 + uVar8 * 2 <= puVar7)))) {
    if (uVar8 < 0x10) {
      uVar12 = 0;
    }
    else {
      uVar12 = uVar8 & 0x7ffffffffffffff0;
      uVar4 = 0;
      do {
        auVar14 = pmovsxbw(auVar14,*(undefined8 *)(puVar7 + uVar4));
        in_XMM1 = pmovsxbw(in_XMM1,*(undefined8 *)(puVar7 + uVar4 + 8));
        *(undefined1 (*) [16])(*pauVar6 + uVar4 * 2) = auVar14;
        *(undefined1 (*) [16])(pauVar6[1] + uVar4 * 2) = in_XMM1;
        uVar4 = uVar4 + 0x10;
      } while (uVar12 != uVar4);
      if (uVar8 == uVar12) goto LAB_7ff70c937b77;
      if ((uVar8 & 0xc) == 0) {
        puVar7 = puVar7 + uVar12;
        uVar4 = (ulonglong)((uint)uVar8 & 0xf);
        pauVar11 = (undefined1 (*) [16])(*pauVar6 + uVar12 * 2);
        goto LAB_7ff70c937aca;
      }
    }
    uVar13 = uVar8 & 0x7ffffffffffffffc;
    do {
      auVar14 = pmovsxbw(ZEXT416(*(uint *)(puVar7 + uVar12)),ZEXT416(*(uint *)(puVar7 + uVar12)));
      *(longlong *)(*pauVar6 + uVar12 * 2) = auVar14._0_8_;
      uVar12 = uVar12 + 4;
    } while (uVar13 != uVar12);
    puVar7 = puVar7 + uVar13;
    uVar4 = (ulonglong)((uint)uVar8 & 3);
    pauVar11 = (undefined1 (*) [16])(*pauVar6 + uVar13 * 2);
    if (uVar8 == uVar13) goto LAB_7ff70c937b77;
  }
LAB_7ff70c937aca:
  uVar12 = uVar4 - 1;
  if ((uVar4 & 7) != 0) {
    uVar13 = 0;
    do {
      *(short *)*pauVar11 = (short)(char)puVar7[uVar13];
      pauVar11 = (undefined1 (*) [16])(*pauVar11 + 2);
      uVar13 = uVar13 + 1;
    } while ((uVar4 & 7) != uVar13);
    puVar7 = puVar7 + uVar13;
    uVar4 = uVar4 - uVar13;
  }
  if (6 < uVar12) {
    uVar12 = 0;
    do {
      *(short *)(*pauVar11 + uVar12 * 2) = (short)(char)puVar7[uVar12];
      *(short *)(*pauVar11 + uVar12 * 2 + 2) = (short)(char)puVar7[uVar12 + 1];
      *(short *)(*pauVar11 + uVar12 * 2 + 4) = (short)(char)puVar7[uVar12 + 2];
      *(short *)(*pauVar11 + uVar12 * 2 + 6) = (short)(char)puVar7[uVar12 + 3];
      *(short *)(*pauVar11 + uVar12 * 2 + 8) = (short)(char)puVar7[uVar12 + 4];
      *(short *)(*pauVar11 + uVar12 * 2 + 10) = (short)(char)puVar7[uVar12 + 5];
      *(short *)(*pauVar11 + uVar12 * 2 + 0xc) = (short)(char)puVar7[uVar12 + 6];
      *(short *)(*pauVar11 + uVar12 * 2 + 0xe) = (short)(char)puVar7[uVar12 + 7];
      uVar12 = uVar12 + 8;
    } while (uVar4 != uVar12);
  }
LAB_7ff70c937b77:
  *(ulonglong *)param_1[1] = uVar8;
  *(undefined2 *)(*pauVar6 + uVar8 * 2) = 0;
  return param_1;
}


