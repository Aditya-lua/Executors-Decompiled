/* 7ff70c8c6f30 FUN_7ff70c8c6f30 */

void FUN_7ff70c8c6f30(longlong *param_1,undefined8 param_2,char param_3,char param_4)

{
  undefined8 *puVar1;
  undefined8 *puVar2;
  undefined4 *puVar3;
  code *pcVar4;
  longlong *plVar5;
  int iVar6;
  longlong lVar7;
  ulonglong uVar8;
  ulonglong uVar9;
  ulonglong uVar10;
  longlong lVar11;
  longlong lVar12;
  uint *puVar13;
  undefined4 uStack_b8;
  undefined4 uStack_b4;
  undefined4 uStack_b0;
  undefined4 uStack_ac;
  undefined4 uStack_a8;
  undefined4 uStack_a4;
  undefined4 uStack_a0;
  undefined4 uStack_9c;
  undefined4 uStack_98;
  undefined4 uStack_94;
  undefined4 uStack_90;
  undefined4 uStack_8c;
  undefined4 uStack_88;
  undefined4 uStack_84;
  undefined4 uStack_80;
  undefined4 uStack_7c;
  undefined8 uStack_78;
  undefined8 uStack_70;
  undefined8 uStack_68;
  undefined8 uStack_60;
  uint uStack_58;
  undefined4 uStack_54;
  undefined4 uStack_50;
  undefined4 uStack_4c;
  undefined8 uStack_48;
  ulonglong uStack_40;
  longlong *plStack_38;
  undefined8 uStack_30;
  
  if (param_3 != '\0') {
    uStack_40 = 0x7ff70c8c6f4b;
    (**(code **)(*param_1 + 0x10))();
  }
  if (param_4 == '\0') {
    return;
  }
  uStack_30 = 0xfffffffffffffffe;
  iVar6 = FUN_7ff70cb12570();
  if (iVar6 == 0) {
    plStack_38 = param_1 + 0x11;
    if (*(int *)((longlong)param_1 + 0xd4) != 0x7fffffff) {
      FUN_7ff70c8c1630(&uStack_b8,param_2);
      plVar5 = plStack_38;
      if (plStack_38[0xb] != 0) {
        lVar12 = plStack_38[0xf];
        lVar7 = plStack_38[0xd] * 0x80;
        puVar1 = (undefined8 *)(lVar12 + lVar7);
        puVar2 = (undefined8 *)(lVar12 + 0x50 + lVar7);
        *puVar2 = uStack_68;
        puVar2[1] = uStack_60;
        puVar2 = (undefined8 *)(lVar12 + 0x40 + lVar7);
        *puVar2 = uStack_78;
        puVar2[1] = uStack_70;
        puVar3 = (undefined4 *)(lVar12 + 0x30 + lVar7);
        *puVar3 = uStack_88;
        puVar3[1] = uStack_84;
        puVar3[2] = uStack_80;
        puVar3[3] = uStack_7c;
        puVar3 = (undefined4 *)(lVar12 + 0x20 + lVar7);
        *puVar3 = uStack_98;
        puVar3[1] = uStack_94;
        puVar3[2] = uStack_90;
        puVar3[3] = uStack_8c;
        puVar3 = (undefined4 *)(lVar12 + 0x10 + lVar7);
        *puVar3 = uStack_a8;
        puVar3[1] = uStack_a4;
        puVar3[2] = uStack_a0;
        puVar3[3] = uStack_9c;
        puVar3 = (undefined4 *)(lVar12 + lVar7);
        *puVar3 = uStack_b8;
        puVar3[1] = uStack_b4;
        puVar3[2] = uStack_b0;
        puVar3[3] = uStack_ac;
        lVar12 = lVar12 + lVar7;
        puVar13 = (uint *)(lVar12 + 0x60);
        if (puVar1 != (undefined8 *)&uStack_b8) {
          uVar10 = puVar1[0xf];
          if (0xf < uVar10) {
            lVar7 = *(longlong *)puVar13;
            uVar8 = uVar10 + 1;
            lVar11 = lVar7;
            if (0xfff < uVar8) {
              lVar11 = *(longlong *)(lVar7 + -8);
              if (0x1f < (ulonglong)((lVar7 + -8) - lVar11)) goto LAB_7ff70c8c15fb;
              uVar8 = uVar10 + 0x28;
            }
            thunk_FUN_7ff70ca90250(lVar11,uVar8);
          }
          puVar1[0xe] = 0;
          puVar1[0xf] = 0xf;
          *(undefined1 *)(puVar1 + 0xc) = 0;
          *(undefined8 *)(lVar12 + 0x70) = uStack_48;
          *(ulonglong *)(lVar12 + 0x78) = uStack_40;
          *puVar13 = uStack_58;
          *(undefined4 *)(lVar12 + 100) = uStack_54;
          *(undefined4 *)(lVar12 + 0x68) = uStack_50;
          *(undefined4 *)(lVar12 + 0x6c) = uStack_4c;
          uStack_48 = 0;
          uStack_40 = 0xf;
          uStack_58 = uStack_58 & 0xffffff00;
        }
        if (0xf < (ulonglong)puVar1[0xf]) {
          puVar13 = (uint *)puVar1[0xc];
        }
        *puVar1 = puVar13;
        puVar1[10] = (longlong)puVar13 + puVar1[1];
        uVar10 = plVar5[0xb];
        uVar8 = plVar5[0xd] + 1;
        if ((uVar8 | uVar10) >> 0x20 == 0) {
          uVar8 = (uVar8 & 0xffffffff) % (uVar10 & 0xffffffff);
          plVar5[0xd] = uVar8;
          if (uVar8 == plVar5[0xc]) goto LAB_7ff70c8c1566;
        }
        else {
          uVar8 = uVar8 % uVar10;
          plVar5[0xd] = uVar8;
          if (uVar8 == plVar5[0xc]) {
LAB_7ff70c8c1566:
            uVar9 = 0;
            if (uVar8 + 1 != uVar10) {
              uVar9 = uVar8 + 1;
            }
            plVar5[0xc] = uVar9;
            plVar5[0xe] = plVar5[0xe] + 1;
          }
        }
      }
      if (0xf < uStack_40) {
        lVar7 = CONCAT44(uStack_54,uStack_58);
        uVar10 = uStack_40 + 1;
        lVar12 = lVar7;
        if (0xfff < uVar10) {
          lVar12 = *(longlong *)(lVar7 + -8);
          if (0x1f < (ulonglong)((lVar7 + -8) - lVar12)) goto LAB_7ff70c8c15fb;
          uVar10 = uStack_40 + 0x28;
        }
        thunk_FUN_7ff70ca90250(lVar12,uVar10);
      }
      FUN_7ff70cb12580(plVar5);
      return;
    }
  }
  else {
    FUN_7ff70cb124d0(5);
  }
  *(undefined4 *)((longlong)plStack_38 + 0x4c) = 0x7ffffffe;
  FUN_7ff70cb124d0(6);
LAB_7ff70c8c15fb:
                    /* WARNING: Does not return */
  pcVar4 = (code *)invalidInstructionException();
  (*pcVar4)();
}


