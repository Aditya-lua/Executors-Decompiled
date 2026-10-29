/* 7ff70c7e96c0 FUN_7ff70c7e96c0 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_7ff70c7e96c0(longlong param_1)

{
  longlong lVar1;
  longlong *plVar2;
  undefined8 *puVar3;
  longlong lVar4;
  code *pcVar5;
  longlong *plVar6;
  longlong lVar7;
  ulonglong uVar8;
  undefined1 auStack_28 [32];
  ulonglong uStack_8;
  
  uStack_8 = _DAT_7ff70cbebd80 ^ (ulonglong)auStack_28;
  lVar7 = (longlong)*(int *)(param_1 + 0x2a0);
  if (lVar7 != 0) {
    plVar2 = *(longlong **)(param_1 + 0x2a8);
    lVar1 = param_1 + 0x88;
    uVar8 = lVar7 * 8 - 8;
    plVar6 = plVar2;
    if ((uVar8 & 8) == 0) {
      puVar3 = (undefined8 *)*plVar2;
      if (puVar3[2] == param_1) {
        *puVar3 = *(undefined8 *)(param_1 + 0x5c);
        puVar3[1] = lVar1;
      }
      plVar6 = plVar2 + 1;
    }
    if (uVar8 != 0) {
      do {
        puVar3 = (undefined8 *)*plVar6;
        if (puVar3[2] == param_1) {
          *puVar3 = *(undefined8 *)(param_1 + 0x5c);
          puVar3[1] = lVar1;
          puVar3 = (undefined8 *)plVar6[1];
          lVar4 = puVar3[2];
        }
        else {
          puVar3 = (undefined8 *)plVar6[1];
          lVar4 = puVar3[2];
        }
        if (lVar4 == param_1) {
          *puVar3 = *(undefined8 *)(param_1 + 0x5c);
          puVar3[1] = lVar1;
        }
        plVar6 = plVar6 + 2;
      } while (plVar6 != plVar2 + lVar7);
    }
  }
  if (_DAT_7ff70cbebd80 == (uStack_8 ^ (ulonglong)auStack_28)) {
    return;
  }
  FUN_7ff70caa97e0(uStack_8 ^ (ulonglong)auStack_28);
  pcVar5 = (code *)swi(3);
  (*pcVar5)();
  return;
}


