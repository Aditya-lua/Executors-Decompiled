/* 7ff70c929990 FUN_7ff70c929990 */

void FUN_7ff70c929990(ulonglong *param_1,ulonglong param_2)

{
  ulonglong uVar1;
  code *pcVar2;
  longlong lVar3;
  ulonglong uVar4;
  ulonglong uVar5;
  ulonglong uVar6;
  longlong lVar7;
  ulonglong uVar8;
  
  if (param_2 < 0xaaaaaaaaaaaaaab) {
    uVar1 = *param_1;
    uVar6 = ((longlong)(param_1[2] - uVar1) >> 3) * -0x5555555555555555;
    uVar4 = 0xaaaaaaaaaaaaaaa - (uVar6 >> 1);
    uVar8 = (uVar6 >> 1) + uVar6;
    if (uVar8 <= param_2) {
      uVar8 = param_2;
    }
    if (uVar4 <= uVar6 && uVar6 - uVar4 != 0) {
      uVar8 = 0xaaaaaaaaaaaaaaa;
    }
    if (uVar8 < 0xaaaaaaaaaaaaaab) {
      uVar4 = param_1[1];
      if (uVar8 == 0) {
        uVar6 = 0;
      }
      else if (uVar8 < 0xab) {
        uVar6 = FUN_7ff70ca8ff40(uVar8 * 0x18);
      }
      else {
        if (uVar8 == 0xaaaaaaaaaaaaaaa) goto LAB_7ff70c929aee;
        lVar3 = FUN_7ff70ca8ff40(uVar8 * 0x18 + 0x27);
        uVar6 = lVar3 + 0x27U & 0xffffffffffffffe0;
        *(longlong *)(uVar6 - 8) = lVar3;
      }
      lVar7 = uVar4 - uVar1;
      lVar3 = (lVar7 >> 3) * 0x5555555555555555 + param_2;
      if (lVar3 != 0) {
        FUN_7ff70cb12b80(lVar7 + uVar6,0,lVar3 * 0x18);
      }
      FUN_7ff70cb12b60(uVar6,*param_1,param_1[1] - *param_1);
      uVar1 = *param_1;
      if (uVar1 != 0) {
        uVar5 = param_1[2] - uVar1;
        uVar4 = uVar1;
        if (0xfff < uVar5) {
          uVar4 = *(ulonglong *)(uVar1 - 8);
          if (0x1f < (uVar1 - 8) - uVar4) goto LAB_7ff70c929af8;
          uVar5 = uVar5 + 0x27;
        }
        thunk_FUN_7ff70ca90250(uVar4,uVar5);
      }
      *param_1 = uVar6;
      param_1[1] = uVar6 + param_2 * 0x18;
      param_1[2] = uVar6 + uVar8 * 0x18;
      return;
    }
LAB_7ff70c929aee:
    FUN_7ff70ca007a0();
  }
  FUN_7ff70c7ac850();
LAB_7ff70c929af8:
                    /* WARNING: Does not return */
  pcVar2 = (code *)invalidInstructionException();
  (*pcVar2)();
}


