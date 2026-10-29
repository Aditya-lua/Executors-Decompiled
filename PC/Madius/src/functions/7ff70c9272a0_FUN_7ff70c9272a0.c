/* 7ff70c9272a0 FUN_7ff70c9272a0 */

void FUN_7ff70c9272a0(longlong param_1,longlong param_2,ulonglong param_3)

{
  code *pcVar1;
  longlong lVar2;
  ulonglong uVar3;
  ulonglong uVar4;
  ulonglong uVar5;
  longlong lVar6;
  undefined4 *puVar7;
  undefined4 *puVar8;
  ulonglong uVar9;
  undefined4 uStack_68;
  undefined4 uStack_64;
  undefined4 uStack_60;
  undefined4 uStack_5c;
  undefined4 uStack_58;
  undefined4 uStack_54;
  undefined4 uStack_50;
  undefined4 uStack_4c;
  undefined8 uStack_40;
  
  uStack_40 = 0xfffffffffffffffe;
  uVar4 = param_2 - param_1;
  if (0x400 < (longlong)uVar4) {
    do {
      while( true ) {
        uVar5 = uVar4 >> 6;
        if ((longlong)param_3 < 1) {
          uVar9 = uVar5 + 1;
          puVar8 = (undefined4 *)(uVar5 * 0x20 + param_1);
          do {
            puVar7 = puVar8 + -8;
            uStack_68 = *puVar7;
            uStack_64 = puVar8[-7];
            uStack_60 = puVar8[-6];
            uStack_5c = puVar8[-5];
            uStack_58 = puVar8[-4];
            uStack_54 = puVar8[-3];
            uStack_50 = puVar8[-2];
            uStack_4c = puVar8[-1];
            *(undefined8 *)(puVar8 + -4) = 0;
            *(undefined8 *)(puVar8 + -2) = 0xf;
            *(undefined1 *)puVar7 = 0;
            FUN_7ff70c927780(param_1,uVar9 - 2,uVar4 >> 5,&uStack_68);
            uVar5 = CONCAT44(uStack_4c,uStack_50);
            if (0xf < uVar5) {
              lVar2 = CONCAT44(uStack_64,uStack_68);
              uVar3 = uVar5 + 1;
              lVar6 = lVar2;
              if (0xfff < uVar3) {
                lVar6 = *(longlong *)(lVar2 + -8);
                if (0x1f < (ulonglong)((lVar2 + -8) - lVar6)) {
                    /* WARNING: Does not return */
                  pcVar1 = (code *)invalidInstructionException();
                  (*pcVar1)();
                }
                uVar3 = uVar5 + 0x28;
              }
              thunk_FUN_7ff70ca90250(lVar6,uVar3);
            }
            uVar9 = uVar9 - 1;
            puVar8 = puVar7;
          } while (1 < uVar9);
          lVar6 = param_2 - param_1;
          do {
            FUN_7ff70c927b80(param_1,param_2);
            param_2 = param_2 + -0x20;
            lVar6 = lVar6 + -0x20;
          } while (0x20 < lVar6);
          return;
        }
        lVar6 = uVar5 * 0x20 + param_1;
        FUN_7ff70c927c80(param_1,lVar6,param_2 + -0x20);
        FUN_7ff70c927d10(&uStack_68,param_1,lVar6,param_2);
        param_3 = (param_3 >> 2) + (param_3 >> 1);
        if (param_2 - CONCAT44(uStack_5c,uStack_60) <= CONCAT44(uStack_64,uStack_68) - param_1)
        break;
        FUN_7ff70c9272a0(param_1,CONCAT44(uStack_64,uStack_68),param_3);
        param_1 = CONCAT44(uStack_5c,uStack_60);
        uVar4 = param_2 - param_1;
        if ((longlong)uVar4 < 0x401) goto LAB_7ff70c9272d0;
      }
      FUN_7ff70c9272a0(CONCAT44(uStack_5c,uStack_60),param_2,param_3);
      param_2 = CONCAT44(uStack_64,uStack_68);
      uVar4 = param_2 - param_1;
    } while (0x400 < (longlong)uVar4);
  }
LAB_7ff70c9272d0:
  FUN_7ff70c9274a0(param_1,param_2);
  return;
}


