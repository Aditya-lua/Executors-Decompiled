/* 7ff70c788870 FUN_7ff70c788870 */

void FUN_7ff70c788870(longlong param_1,undefined8 param_2,ulonglong param_3,uint param_4)

{
  ulonglong uVar1;
  code *pcVar2;
  longlong lVar3;
  ulonglong uVar4;
  uint uVar5;
  ulonglong uVar6;
  
  if (param_3 >> 0x1f == 0) {
    uVar5 = param_4 & 0xffffffdf;
    if ((param_3 == 0) || ((param_4 & 6) == 6)) {
      *(undefined8 *)(param_1 + 0x68) = 0;
    }
    else {
      if (param_3 < 0x1000) {
        uVar6 = FUN_7ff70ca8ff40(param_3);
      }
      else {
        lVar3 = FUN_7ff70ca8ff40(param_3 + 0x27);
        uVar6 = lVar3 + 0x27U & 0xffffffffffffffe0;
        *(longlong *)(uVar6 - 8) = lVar3;
      }
      FUN_7ff70cb12b60(uVar6,param_2,param_3);
      *(ulonglong *)(param_1 + 0x68) = uVar6 + param_3;
      if ((param_4 & 4) == 0) {
        **(ulonglong **)(param_1 + 0x18) = uVar6;
        **(ulonglong **)(param_1 + 0x38) = uVar6;
        **(undefined4 **)(param_1 + 0x50) = (int)param_3;
      }
      if ((param_4 & 2) == 0) {
        uVar1 = *(ulonglong *)(param_1 + 0x68);
        uVar4 = uVar1;
        if ((param_4 & 0x18) == 0) {
          uVar4 = uVar6;
        }
        **(ulonglong **)(param_1 + 0x20) = uVar6;
        **(ulonglong **)(param_1 + 0x40) = uVar4;
        **(int **)(param_1 + 0x58) = (int)uVar1 - (int)uVar4;
        if ((param_4 & 4) != 0) {
          **(ulonglong **)(param_1 + 0x18) = uVar6;
          **(ulonglong **)(param_1 + 0x38) = uVar6;
          **(undefined4 **)(param_1 + 0x50) = 0;
        }
      }
      uVar5 = uVar5 | 1;
    }
    *(uint *)(param_1 + 0x70) = uVar5;
    return;
  }
  FUN_7ff70cb124f0();
  pcVar2 = (code *)swi(3);
  (*pcVar2)();
  return;
}


