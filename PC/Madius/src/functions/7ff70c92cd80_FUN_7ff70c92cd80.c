/* 7ff70c92cd80 FUN_7ff70c92cd80 */

void FUN_7ff70c92cd80(longlong *param_1,undefined8 param_2,undefined8 param_3,uint param_4)

{
  int *piVar1;
  undefined8 *puVar2;
  code *pcVar3;
  int iVar4;
  longlong lVar5;
  undefined8 *puVar6;
  ulonglong uVar7;
  uint uVar8;
  undefined8 uStack_b8;
  undefined8 uStack_b0;
  undefined8 uStack_a8;
  longlong lStack_a0;
  undefined8 uStack_98;
  longlong lStack_90;
  undefined8 uStack_88;
  undefined8 *puStack_80;
  undefined8 *puStack_78;
  uint uStack_70;
  longlong *plStack_68;
  longlong *plStack_60;
  undefined8 uStack_58;
  uint uStack_50;
  undefined1 uStack_44;
  undefined8 uStack_40;
  
  uStack_40 = 0xfffffffffffffffe;
  uStack_a8 = 0;
  lStack_a0 = 0;
  uStack_98 = 0;
  lStack_90 = 0;
  uStack_88 = 0;
  uStack_b8 = param_2;
  uStack_b0 = param_3;
  puStack_80 = (undefined8 *)FUN_7ff70ca8ff40(0x30);
  plStack_68 = param_1 + 1;
  *(undefined4 *)(puStack_80 + 1) = 0x14;
  *(undefined8 *)((longlong)puStack_80 + 0xc) = 0;
  *(undefined8 *)((longlong)puStack_80 + 0x14) = 0;
  *(undefined4 *)((longlong)puStack_80 + 0x1c) = 0;
  *puStack_80 = &UNK_7ff70cb46660;
  puStack_80[4] = 0;
  puStack_80[5] = 0;
  uStack_44 = 0;
  uVar8 = param_4 & 0x3f;
  if (uVar8 < 2) {
    uStack_58 = 0x43baefb;
  }
  else {
    if ((uVar8 & uVar8 - 1) == 0) {
      iVar4 = 0;
      for (; (uVar8 & 1) == 0; uVar8 = uVar8 >> 1 | 0x80000000) {
        iVar4 = iVar4 + 1;
      }
      if (iVar4 - 1U < 5) {
        uStack_58 = *(undefined8 *)(&UNK_7ff70cb462b8 + (ulonglong)(iVar4 - 1U) * 8);
        *(undefined4 *)((longlong)puStack_80 + 0xc) = 8;
        goto LAB_7ff70c92ce52;
      }
    }
    uStack_58 = 0;
  }
LAB_7ff70c92ce52:
  puStack_78 = puStack_80;
  uStack_70 = param_4;
  plStack_60 = plStack_68;
  uStack_50 = param_4;
  FUN_7ff70c92d1b0(&uStack_b8);
  lVar5 = FUN_7ff70c92cf70(&uStack_b8);
  if (lVar5 != 0) {
    LOCK();
    *(int *)(lVar5 + 0x2c) = *(int *)(lVar5 + 0x2c) + 1;
    UNLOCK();
  }
  if (*param_1 != 0) {
    LOCK();
    piVar1 = (int *)(*param_1 + 0x2c);
    *piVar1 = *piVar1 + -1;
    UNLOCK();
    puVar6 = (undefined8 *)*param_1;
    if (puVar6 != (undefined8 *)0x0 && *piVar1 == 0) {
      do {
        puVar2 = (undefined8 *)puVar6[2];
        puVar6[2] = 0;
        (**(code **)*puVar6)(puVar6,1);
        puVar6 = puVar2;
      } while (puVar2 != (undefined8 *)0x0);
    }
  }
  *param_1 = lVar5;
  if (lStack_a0 != 0) {
    uVar7 = lStack_90 - lStack_a0;
    lVar5 = lStack_a0;
    if (0xfff < uVar7) {
      lVar5 = *(longlong *)(lStack_a0 + -8);
      if (0x1f < (ulonglong)((lStack_a0 + -8) - lVar5)) {
                    /* WARNING: Does not return */
        pcVar3 = (code *)invalidInstructionException();
        (*pcVar3)();
      }
      uVar7 = uVar7 + 0x27;
    }
    thunk_FUN_7ff70ca90250(lVar5,uVar7);
  }
  return;
}


