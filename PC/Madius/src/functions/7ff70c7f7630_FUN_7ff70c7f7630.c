/* 7ff70c7f7630 FUN_7ff70c7f7630 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_7ff70c7f7630(uint *param_1,uint param_2)

{
  code *pcVar1;
  undefined8 uVar2;
  ulonglong uVar3;
  ulonglong uVar4;
  ulonglong uVar5;
  ulonglong uVar6;
  uint uVar7;
  undefined1 auStack_58 [40];
  ulonglong uStack_30;
  
  uStack_30 = _DAT_7ff70cbebd80 ^ (ulonglong)auStack_58;
  if ((int)param_1[8] < (int)param_2) {
    uVar6 = (ulonglong)param_2;
    uVar7 = param_1[1];
    if ((int)uVar7 < (int)param_2) {
      if (uVar7 == 0) {
        uVar7 = 8;
      }
      else {
        uVar7 = (int)uVar7 / 2 + uVar7;
      }
      uVar4 = (ulonglong)uVar7;
      if ((int)uVar7 <= (int)param_2) {
        uVar4 = uVar6;
      }
      uVar2 = FUN_7ff70c802100(uVar4 * 4);
      if (*(longlong *)(param_1 + 2) != 0) {
        FUN_7ff70cb12b60(uVar2,*(longlong *)(param_1 + 2),(longlong)(int)*param_1 << 2);
        FUN_7ff70c802510(*(undefined8 *)(param_1 + 2));
      }
      *(undefined8 *)(param_1 + 2) = uVar2;
      param_1[1] = (uint)uVar4;
    }
    uVar7 = *param_1;
    uVar4 = (ulonglong)(int)uVar7;
    if ((int)uVar7 < (int)param_2) {
      uVar7 = param_2 - uVar7 & 3;
      uVar5 = (ulonglong)uVar7;
      uVar3 = uVar4;
      if (uVar7 != 0) {
        do {
          *(undefined4 *)(*(longlong *)(param_1 + 2) + uVar3 * 4) = 0xbf800000;
          uVar3 = uVar3 + 1;
          uVar5 = uVar5 - 1;
        } while (uVar5 != 0);
      }
      if (uVar4 - uVar6 < 0xfffffffffffffffd) {
        do {
          *(undefined4 *)(*(longlong *)(param_1 + 2) + uVar3 * 4) = 0xbf800000;
          *(undefined4 *)(*(longlong *)(param_1 + 2) + 4 + uVar3 * 4) = 0xbf800000;
          *(undefined4 *)(*(longlong *)(param_1 + 2) + 8 + uVar3 * 4) = 0xbf800000;
          *(undefined4 *)(*(longlong *)(param_1 + 2) + 0xc + uVar3 * 4) = 0xbf800000;
          uVar3 = uVar3 + 4;
        } while (uVar6 != uVar3);
      }
    }
    *param_1 = param_2;
    uVar7 = param_1[9];
    if ((int)uVar7 < (int)param_2) {
      if (uVar7 == 0) {
        uVar7 = 8;
      }
      else {
        uVar7 = (int)uVar7 / 2 + uVar7;
      }
      if ((int)uVar7 <= (int)param_2) {
        uVar7 = param_2;
      }
      uVar2 = FUN_7ff70c802100(uVar7 * 2);
      if (*(longlong *)(param_1 + 10) != 0) {
        FUN_7ff70cb12b60(uVar2,*(longlong *)(param_1 + 10),(longlong)(int)param_1[8] * 2);
        FUN_7ff70c802510(*(undefined8 *)(param_1 + 10));
      }
      *(undefined8 *)(param_1 + 10) = uVar2;
      param_1[9] = uVar7;
    }
    uVar7 = param_1[8];
    uVar4 = (ulonglong)(int)uVar7;
    if ((int)uVar7 < (int)param_2) {
      uVar7 = param_2 - uVar7 & 3;
      uVar5 = (ulonglong)uVar7;
      uVar3 = uVar4;
      if (uVar7 != 0) {
        do {
          *(undefined2 *)(*(longlong *)(param_1 + 10) + uVar3 * 2) = 0xffff;
          uVar3 = uVar3 + 1;
          uVar5 = uVar5 - 1;
        } while (uVar5 != 0);
      }
      if (uVar4 - uVar6 < 0xfffffffffffffffd) {
        do {
          *(undefined2 *)(*(longlong *)(param_1 + 10) + uVar3 * 2) = 0xffff;
          *(undefined2 *)(*(longlong *)(param_1 + 10) + 2 + uVar3 * 2) = 0xffff;
          *(undefined2 *)(*(longlong *)(param_1 + 10) + 4 + uVar3 * 2) = 0xffff;
          *(undefined2 *)(*(longlong *)(param_1 + 10) + 6 + uVar3 * 2) = 0xffff;
          uVar3 = uVar3 + 4;
        } while (uVar6 != uVar3);
      }
    }
    param_1[8] = param_2;
  }
  if (_DAT_7ff70cbebd80 != (uStack_30 ^ (ulonglong)auStack_58)) {
    FUN_7ff70caa97e0(uStack_30 ^ (ulonglong)auStack_58);
    pcVar1 = (code *)swi(3);
    (*pcVar1)();
    return;
  }
  return;
}


