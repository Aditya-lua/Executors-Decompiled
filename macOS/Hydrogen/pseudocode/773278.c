
ulong FUN_00773278(ulong param_1,undefined8 param_2,long param_3)

{
  ushort uVar1;
  char in_NG;
  char in_OV;
  long lVar2;
  undefined8 uVar3;
  int *piVar4;
  undefined4 *puVar5;
  int iVar6;
  ulong uVar7;
  long lVar8;
  ushort *puVar9;
  ushort uVar10;
  uint uVar11;
  int unaff_w19;
  int unaff_w20;
  ulong uVar12;
  int unaff_w21;
  undefined1 auVar13 [16];
  ulong in_stack_00000000;
  long in_stack_00000018;
  undefined1 auStack_30 [16];
  
  if (in_NG == in_OV) {
    if (unaff_w21 == -1) {
      uVar7 = 0;
      param_1 = 0;
    }
    else {
      uVar11 = (uint)((in_stack_00000000 & 0x59000000000000) != 0);
      if ((in_stack_00000000 & 0x22000000000000) != 0) {
        uVar11 = uVar11 | 4;
      }
      param_1 = (ulong)uVar11;
      uVar7 = 1;
    }
    if (unaff_w20 != -1) {
      uVar11 = (uint)param_1;
      if ((*(ushort *)(auStack_30 + uVar7 * 8 + 0x36) & 0x59) != 0) {
        uVar11 = (uint)param_1 | 8;
      }
      if ((*(ushort *)(auStack_30 + uVar7 * 8 + 0x36) & 0x22) != 0) {
        uVar11 = uVar11 | 4;
      }
      param_1 = (ulong)uVar11;
      uVar7 = (ulong)((int)uVar7 + 1);
    }
    if (unaff_w19 != -1) {
      uVar11 = (uint)param_1 | *(ushort *)(auStack_30 + uVar7 * 8 + 0x36) >> 1 & 2;
      if ((*(ushort *)(auStack_30 + uVar7 * 8 + 0x36) & 0x3a) != 0) {
        uVar11 = uVar11 | 4;
      }
      param_1 = (ulong)uVar11;
    }
  }
  if (*(long *)PTR____stack_chk_guard_009b01e8 == in_stack_00000018) {
    return param_1;
  }
  auVar13 = ___stack_chk_fail(param_1);
  uVar7 = auVar13._8_8_;
  lVar2 = auVar13._0_8_;
  if ((lVar2 != 0) && (auVar13._8_4_ != 0)) {
    lVar8 = 0;
    uVar12 = uVar7 & 0xffffffff;
    do {
      if (*(int *)(lVar2 + lVar8) != -1) {
        lVar8 = param_3;
        if (0x7ffffffe < param_3) {
          lVar8 = 0x7fffffff;
        }
        iVar6 = (int)lVar8;
        if (param_3 < 1) {
          iVar6 = (int)(lVar8 >> 0x3f);
        }
        uVar7 = _poll(lVar2,uVar7,iVar6);
        if ((int)uVar7 < 1) {
          if ((int)uVar7 == -1) {
            piVar4 = (int *)___error();
            return (ulong)-(uint)(*piVar4 != 4);
          }
          return uVar7;
        }
        puVar9 = (ushort *)(lVar2 + 6);
        do {
          if ((*(int *)(puVar9 + -3) != -1) && (uVar1 = *puVar9, (uVar1 & 0x18) != 0)) {
            uVar10 = uVar1 >> 4 & 1;
            if ((uVar1 & 8) != 0) {
              uVar10 = 5;
            }
            *puVar9 = uVar10 | uVar1;
          }
          puVar9 = puVar9 + 4;
          uVar12 = uVar12 - 1;
        } while (uVar12 != 0);
        return uVar7;
      }
      lVar8 = lVar8 + 8;
    } while ((uVar7 & 0xffffffff) * 8 != lVar8);
  }
  if (param_3 == 0) {
    return 0;
  }
  if (param_3 < 0) {
    puVar5 = (undefined4 *)___error();
    *puVar5 = 0x16;
  }
  else {
    uVar3 = func_0x00782ca0(auStack_30,param_3);
    uVar7 = _select(0,0,0,0,uVar3);
    if ((int)uVar7 == 0) {
      return uVar7;
    }
    if (((int)uVar7 == -1) && (piVar4 = (int *)___error(), *piVar4 == 4)) {
      return 0;
    }
  }
  return 0xffffffff;
}

