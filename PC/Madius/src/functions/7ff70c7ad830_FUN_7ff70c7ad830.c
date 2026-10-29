/* 7ff70c7ad830 FUN_7ff70c7ad830 */

void FUN_7ff70c7ad830(undefined8 param_1,undefined8 param_2,longlong *param_3)

{
  char cVar1;
  longlong *plVar2;
  ulonglong uVar3;
  longlong lVar4;
  code *pcVar5;
  ulonglong uVar6;
  longlong lVar7;
  
  cVar1 = *(char *)((longlong)param_3 + 0x19);
  do {
    if (cVar1 != '\0') {
      return;
    }
    FUN_7ff70c7ad830(param_1,param_2,param_3[2]);
    plVar2 = (longlong *)*param_3;
    FUN_7ff70c7b0fe0(param_3 + 8);
    uVar3 = param_3[7];
    if (0xf < uVar3) {
      lVar4 = param_3[4];
      uVar6 = uVar3 + 1;
      lVar7 = lVar4;
      if (0xfff < uVar6) {
        lVar7 = *(longlong *)(lVar4 + -8);
        if (0x1f < (ulonglong)((lVar4 + -8) - lVar7)) {
                    /* WARNING: Does not return */
          pcVar5 = (code *)invalidInstructionException();
          (*pcVar5)();
        }
        uVar6 = uVar3 + 0x28;
      }
      thunk_FUN_7ff70ca90250(lVar7,uVar6);
    }
    param_3[6] = 0;
    param_3[7] = 0xf;
    *(undefined1 *)(param_3 + 4) = 0;
    thunk_FUN_7ff70ca90250(param_3,0x88);
    cVar1 = *(char *)((longlong)plVar2 + 0x19);
    param_3 = plVar2;
  } while( true );
}


