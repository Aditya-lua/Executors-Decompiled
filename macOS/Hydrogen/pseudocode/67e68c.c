
ulong FUN_0067e68c(undefined8 param_1,undefined8 param_2,long param_3,long *param_4)

{
  bool bVar1;
  int iVar2;
  uint uVar3;
  undefined8 uVar4;
  ulong uVar5;
  undefined8 uVar6;
  undefined8 uVar7;
  undefined8 uVar8;
  long *plVar9;
  long *plVar10;
  ulong uVar11;
  code *pcVar12;
  uint uVar13;
  uint uVar14;
  undefined1 auVar15 [12];
  undefined1 uStack0000000000000030;
  undefined *apuStack_f0 [2];
  ulong uStack_e0;
  ulong uStack_d8;
  long lStack_d0;
  undefined *apuStack_c0 [2];
  ulong uStack_b0;
  ulong uStack_a8;
  long lStack_a0;
  undefined *apuStack_90 [2];
  ulong uStack_80;
  ulong uStack_78;
  long lStack_70;
  
  uVar8 = __Unwind_Resume();
  func_0x00087574(&uStack0000000000000030);
  auVar15 = __Unwind_Resume(uVar8);
  uVar13 = auVar15._8_4_;
  plVar9 = auVar15._0_8_;
  plVar10 = plVar9 + -1;
  uVar8 = (**(code **)(*plVar10 + 0xa0))();
  uVar4 = (**(code **)(*plVar10 + 0x50))(plVar10);
  iVar2 = (**(code **)(*plVar10 + 0xb0))(plVar10);
  if (iVar2 == 1) {
    if ((*(int *)(param_3 + 0x28) == 1) || (uVar5 = func_0x005ffc7c(param_3), (uVar5 & 1) != 0))
    goto code_r0x0067e320;
code_r0x0067e310:
    iVar2 = func_0x00609ec8(param_3,uVar8);
    if (-1 < iVar2) goto code_r0x0067e320;
    uVar3 = (**(code **)(*plVar9 + 0xf8))(plVar9,param_3);
    bVar1 = param_4 == (long *)0x0;
    uVar14 = (uint)(uVar13 == 0);
    if (bVar1) {
      uVar14 = 1;
    }
    uVar5 = (ulong)(uVar14 & (uVar3 ^ 1));
    if ((uVar14 == 0) && ((uVar3 & 1) == 0)) {
      uVar6 = (**(code **)(*plVar9 + 0x88))(plVar9);
      uVar7 = func_0x00604ce4();
      (**(code **)(*param_4 + 0x40))(apuStack_90,param_4,uVar6,uVar7);
      iVar2 = func_0x00609ec8(apuStack_90,param_3);
      uVar5 = (ulong)(iVar2 == 0);
      apuStack_90[0] = &UNK_009f5d60;
      uVar11 = uStack_80;
      if (uStack_78 <= uStack_80) {
        uVar11 = uStack_78;
      }
      if (lStack_70 != 0) {
        if (uVar11 != 0) {
          do {
            *(undefined8 *)(lStack_70 + -8 + uVar11 * 8) = 0;
            uVar11 = uVar11 - 1;
          } while (uVar11 != 0);
        }
        func_0x00611644();
      }
      bVar1 = false;
    }
  }
  else {
    if (*(int *)(param_3 + 0x28) != 1) goto code_r0x0067e310;
code_r0x0067e320:
    uVar5 = 0;
    bVar1 = param_4 == (long *)0x0;
  }
  if (uVar13 < 2) {
    return uVar5;
  }
  iVar2 = (**(code **)(*plVar10 + 0xb0))(plVar10);
  uVar14 = 0;
  if (iVar2 == 2) {
    if ((uint)uVar5 == 1) {
      func_0x00608730(apuStack_c0,param_3,param_3);
      func_0x005fe1e8(apuStack_f0,4);
      func_0x00607398(apuStack_90,apuStack_c0,apuStack_f0);
      iVar2 = func_0x0068c6f4(apuStack_90,uVar8);
      uVar14 = (uint)(iVar2 == -1);
      apuStack_90[0] = &UNK_009f5d60;
      uVar5 = uStack_80;
      if (uStack_78 <= uStack_80) {
        uVar5 = uStack_78;
      }
      if (lStack_70 != 0) {
        if (uVar5 != 0) {
          do {
            *(undefined8 *)(lStack_70 + -8 + uVar5 * 8) = 0;
            uVar5 = uVar5 - 1;
          } while (uVar5 != 0);
        }
        func_0x00611644();
      }
      apuStack_f0[0] = &UNK_009f5d60;
      if (uStack_d8 <= uStack_e0) {
        uStack_e0 = uStack_d8;
      }
      if (lStack_d0 != 0) {
        if (uStack_e0 != 0) {
          do {
            *(undefined8 *)(lStack_d0 + -8 + uStack_e0 * 8) = 0;
            uStack_e0 = uStack_e0 - 1;
          } while (uStack_e0 != 0);
        }
        func_0x00611644();
      }
      apuStack_c0[0] = &UNK_009f5d60;
      if (uStack_a8 <= uStack_b0) {
        uStack_b0 = uStack_a8;
      }
      if (lStack_a0 != 0) {
        if (uStack_b0 != 0) {
          do {
            *(undefined8 *)(lStack_a0 + -8 + uStack_b0 * 8) = 0;
            uStack_b0 = uStack_b0 - 1;
          } while (uStack_b0 != 0);
        }
        func_0x00611644();
      }
    }
  }
  else {
    uVar14 = (uint)uVar5;
  }
  iVar2 = (**(code **)(*plVar10 + 0xb0))(plVar10);
  if ((uVar13 < 3) || (iVar2 != 2)) {
    uVar5 = (**(code **)(*plVar10 + 0x70))(plVar10);
    uVar13 = uVar14 ^ 1;
    if (((uVar5 & 1) == 0) && (uVar13 == 0)) goto code_r0x0067e480;
  }
  else {
    if (uVar14 != 0) {
code_r0x0067e480:
      if (bVar1) {
        pcVar12 = *(code **)(*plVar9 + 0x80);
        param_4 = plVar9;
      }
      else {
        param_3 = (**(code **)(*plVar9 + 0x88))(plVar9);
        pcVar12 = *(code **)(*param_4 + 0x40);
      }
      (*pcVar12)(apuStack_90,param_4,param_3,uVar4);
      uVar5 = (**(code **)(*plVar9 + 0xf8))(plVar9,apuStack_90);
      apuStack_90[0] = &UNK_009f5d60;
      if (uStack_78 <= uStack_80) {
        uStack_80 = uStack_78;
      }
      if (lStack_70 == 0) {
        return uVar5;
      }
      if (uStack_80 != 0) {
        do {
          *(undefined8 *)(lStack_70 + -8 + uStack_80 * 8) = 0;
          uStack_80 = uStack_80 - 1;
        } while (uStack_80 != 0);
      }
      func_0x00611644();
      return uVar5;
    }
    uVar13 = 1;
  }
  iVar2 = (**(code **)(*plVar10 + 0xb0))(plVar10);
  uVar3 = 0;
  if (iVar2 != 1) {
    uVar3 = uVar14;
  }
  uVar5 = (ulong)uVar3;
  if ((iVar2 == 1) && (uVar13 == 0)) {
    iVar2 = func_0x0068c6f4(param_3,uVar8);
    uVar5 = (ulong)(iVar2 == 1);
  }
  return uVar5;
}

