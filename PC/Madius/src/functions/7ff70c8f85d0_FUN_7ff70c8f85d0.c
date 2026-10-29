/* 7ff70c8f85d0 FUN_7ff70c8f85d0 */

void FUN_7ff70c8f85d0(longlong param_1,undefined8 *param_2)

{
  code *pcVar1;
  longlong lVar2;
  undefined8 *puVar3;
  ulonglong uVar4;
  longlong lVar5;
  uint *puVar6;
  ulonglong uVar7;
  ulonglong uVar8;
  uint *puVar9;
  undefined8 *puVar10;
  longlong *plVar11;
  ulonglong *puVar12;
  longlong *plVar13;
  undefined4 uStack_118;
  undefined4 uStack_114;
  undefined4 uStack_110;
  undefined4 uStack_10c;
  ulonglong uStack_108;
  ulonglong uStack_100;
  uint uStack_f8;
  uint uStack_f4;
  uint uStack_f0;
  uint uStack_ec;
  uint uStack_e8;
  uint uStack_e4;
  uint uStack_e0;
  uint uStack_dc;
  longlong *plStack_d8;
  undefined8 *puStack_d0;
  ulonglong uStack_c8;
  ulonglong uStack_c0;
  ulonglong uStack_b8;
  ulonglong uStack_b0;
  uint uStack_a8;
  undefined4 uStack_a4;
  undefined4 uStack_a0;
  undefined4 uStack_9c;
  ulonglong uStack_98;
  ulonglong uStack_90;
  undefined8 uStack_88;
  undefined8 uStack_80;
  ulonglong uStack_78;
  ulonglong uStack_70;
  undefined8 uStack_60;
  
  uStack_60 = 0xfffffffffffffffe;
  plVar11 = *(longlong **)(param_1 + 8);
  puVar3 = (undefined8 *)*plVar11;
  uStack_78 = 0;
  uStack_70 = 0;
  uStack_88 = (uint *)0x0;
  uStack_80 = 0;
  uVar8 = puVar3[4];
  if ((ulonglong)puVar3[5] < 0x10) {
    puVar10 = puVar3 + 2;
  }
  else {
    puVar10 = (undefined8 *)puVar3[2];
  }
  if (-1 < (longlong)uVar8) {
    puStack_d0 = param_2;
    if (uVar8 < 0x10) {
      uStack_70 = 0xf;
      uStack_88 = (uint *)*puVar10;
      uStack_80 = puVar10[1];
      uStack_78 = uVar8;
    }
    else {
      uVar4 = uVar8 | 0xf;
      uVar7 = 0x16;
      if (0x16 < uVar4) {
        uVar7 = uVar4;
      }
      if (uVar4 < 0xfff) {
        uStack_88 = (uint *)FUN_7ff70ca8ff40(uVar7 + 1);
      }
      else {
        lVar5 = FUN_7ff70ca8ff40(uVar7 + 0x28);
        uStack_88 = (uint *)(lVar5 + 0x27U & 0xffffffffffffffe0);
        *(longlong *)(uStack_88 + -2) = lVar5;
      }
      uStack_78 = uVar8;
      uStack_70 = uVar7;
      FUN_7ff70cb12b60(uStack_88,puVar10,uVar8 + 1);
      plVar11 = *(longlong **)(param_1 + 8);
      puVar3 = (undefined8 *)*plVar11;
    }
    plVar13 = (longlong *)*puVar3;
    plStack_d8 = plVar11;
    while( true ) {
      if (plVar13 == plVar11) {
        puStack_d0[2] = uStack_78;
        puStack_d0[3] = uStack_70;
        *puStack_d0 = uStack_88;
        puStack_d0[1] = uStack_80;
        return;
      }
      uStack_c8 = 0;
      uStack_c0 = 0;
      uStack_b8 = 0;
      uStack_b0 = 0;
      if ((ulonglong)plVar13[5] < 0x10) {
        puVar12 = (ulonglong *)(plVar13 + 2);
      }
      else {
        puVar12 = (ulonglong *)plVar13[2];
      }
      uVar8 = plVar13[4];
      if ((longlong)uVar8 < 0) break;
      if (uVar8 < 0x10) {
        uStack_b0 = 0xf;
        uStack_c8 = *puVar12;
        uStack_c0 = puVar12[1];
        uStack_b8 = uVar8;
      }
      else {
        uVar4 = uVar8 | 0xf;
        uVar7 = 0x16;
        if (0x16 < uVar4) {
          uVar7 = uVar4;
        }
        if (uVar4 < 0xfff) {
          uStack_c8 = FUN_7ff70ca8ff40(uVar7 + 1);
        }
        else {
          lVar5 = FUN_7ff70ca8ff40(uVar7 + 0x28);
          uStack_c8 = lVar5 + 0x27U & 0xffffffffffffffe0;
          *(longlong *)(uStack_c8 - 8) = lVar5;
        }
        uStack_b8 = uVar8;
        uStack_b0 = uVar7;
        FUN_7ff70cb12b60(uStack_c8,puVar12,uVar8 + 1);
        plVar11 = plStack_d8;
      }
      uVar7 = uStack_70;
      uVar8 = uStack_78;
      puVar6 = uStack_88;
      uStack_98 = uStack_78;
      uStack_90 = uStack_70;
      uStack_a8 = (uint)uStack_88;
      uStack_a4 = uStack_88._4_4_;
      uStack_a0 = (undefined4)uStack_80;
      uStack_9c = uStack_80._4_4_;
      uStack_78 = 0;
      uStack_70 = 0xf;
      uStack_88 = (uint *)((ulonglong)uStack_88 & 0xffffffffffffff00);
      if (uVar7 - uVar8 < 2) {
        puVar6 = (uint *)FUN_7ff70ca00b60(&uStack_a8,2);
      }
      else {
        uStack_98 = uVar8 + 2;
        puVar9 = &uStack_a8;
        if (0xf < uVar7) {
          puVar9 = puVar6;
        }
        *(undefined2 *)((longlong)puVar9 + uVar8) = 0x202c;
        *(undefined1 *)((longlong)puVar9 + uVar8 + 2) = 0;
        puVar6 = &uStack_a8;
      }
      uStack_f8 = *puVar6;
      uStack_f4 = puVar6[1];
      uStack_f0 = puVar6[2];
      uStack_ec = puVar6[3];
      uStack_e8 = puVar6[4];
      uStack_e4 = puVar6[5];
      uStack_e0 = puVar6[6];
      uStack_dc = puVar6[7];
      puVar6[4] = 0;
      puVar6[5] = 0;
      puVar6[6] = 0xf;
      puVar6[7] = 0;
      *(undefined1 *)puVar6 = 0;
      FUN_7ff70ca77b00(&uStack_118,uStack_e8,&uStack_f8,&uStack_c8);
      uVar8 = CONCAT44(uStack_dc,uStack_e0);
      if (0xf < uVar8) {
        lVar2 = CONCAT44(uStack_f4,uStack_f8);
        uVar7 = uVar8 + 1;
        lVar5 = lVar2;
        if (0xfff < uVar7) {
          lVar5 = *(longlong *)(lVar2 + -8);
          if (0x1f < (ulonglong)((lVar2 + -8) - lVar5)) goto LAB_7ff70c8f894a;
          uVar7 = uVar8 + 0x28;
        }
        thunk_FUN_7ff70ca90250(lVar5,uVar7);
      }
      if (0xf < uStack_90) {
        lVar2 = CONCAT44(uStack_a4,uStack_a8);
        uVar8 = uStack_90 + 1;
        lVar5 = lVar2;
        if (0xfff < uVar8) {
          lVar5 = *(longlong *)(lVar2 + -8);
          if (0x1f < (ulonglong)((lVar2 + -8) - lVar5)) goto LAB_7ff70c8f894a;
          uVar8 = uStack_90 + 0x28;
        }
        thunk_FUN_7ff70ca90250(lVar5,uVar8);
      }
      uStack_98 = 0;
      uStack_90 = 0xf;
      uStack_a8 = uStack_a8 & 0xffffff00;
      if (0xf < uStack_b0) {
        uVar8 = uStack_b0 + 1;
        uVar7 = uStack_c8;
        if (0xfff < uVar8) {
          uVar7 = *(ulonglong *)(uStack_c8 - 8);
          if (0x1f < (uStack_c8 - 8) - uVar7) {
LAB_7ff70c8f894a:
                    /* WARNING: Does not return */
            pcVar1 = (code *)invalidInstructionException();
            (*pcVar1)();
          }
          uVar8 = uStack_b0 + 0x28;
        }
        thunk_FUN_7ff70ca90250(uVar7,uVar8);
      }
      uStack_78 = uStack_108;
      uStack_70 = uStack_100;
      uStack_88 = (uint *)CONCAT44(uStack_114,uStack_118);
      uStack_80 = CONCAT44(uStack_10c,uStack_110);
      plVar13 = (longlong *)*plVar13;
    }
    FUN_7ff70ca00780();
  }
  FUN_7ff70ca00780();
  pcVar1 = (code *)swi(3);
  (*pcVar1)();
  return;
}


