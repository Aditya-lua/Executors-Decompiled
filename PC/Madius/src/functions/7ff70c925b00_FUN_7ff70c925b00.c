/* 7ff70c925b00 FUN_7ff70c925b00 */

longlong * FUN_7ff70c925b00(longlong param_1,longlong param_2,longlong *param_3,undefined8 param_4)

{
  code *pcVar1;
  ulonglong uVar2;
  ulonglong uVar3;
  longlong lVar4;
  longlong lVar5;
  undefined8 uStack_50;
  undefined4 uStack_48;
  undefined4 uStack_44;
  undefined4 uStack_40;
  undefined4 uStack_3c;
  longlong lStack_38;
  ulonglong uStack_30;
  
  if (param_1 != param_2) {
    uStack_50 = param_4;
    do {
      FUN_7ff70c9283a0(&uStack_50,&uStack_48,param_1);
      if (param_3 == (longlong *)&uStack_48) {
        if (0xf < uStack_30) {
          lVar4 = CONCAT44(uStack_44,uStack_48);
          uVar3 = uStack_30 + 1;
          lVar5 = lVar4;
          if (0xfff < uVar3) {
            lVar5 = *(longlong *)(lVar4 + -8);
            if (0x1f < (ulonglong)((lVar4 + -8) - lVar5)) goto LAB_7ff70c925c01;
            uVar3 = uStack_30 + 0x28;
          }
          thunk_FUN_7ff70ca90250(lVar5,uVar3);
        }
      }
      else {
        uVar3 = param_3[3];
        if (0xf < uVar3) {
          lVar5 = *param_3;
          uVar2 = uVar3 + 1;
          lVar4 = lVar5;
          if (0xfff < uVar2) {
            lVar4 = *(longlong *)(lVar5 + -8);
            if (0x1f < (ulonglong)((lVar5 + -8) - lVar4)) {
LAB_7ff70c925c01:
                    /* WARNING: Does not return */
              pcVar1 = (code *)invalidInstructionException();
              (*pcVar1)();
            }
            uVar2 = uVar3 + 0x28;
          }
          thunk_FUN_7ff70ca90250(lVar4,uVar2);
        }
        param_3[2] = lStack_38;
        param_3[3] = uStack_30;
        *(undefined4 *)param_3 = uStack_48;
        *(undefined4 *)((longlong)param_3 + 4) = uStack_44;
        *(undefined4 *)(param_3 + 1) = uStack_40;
        *(undefined4 *)((longlong)param_3 + 0xc) = uStack_3c;
      }
      param_1 = param_1 + 0x20;
      param_3 = param_3 + 4;
    } while (param_1 != param_2);
  }
  return param_3;
}


