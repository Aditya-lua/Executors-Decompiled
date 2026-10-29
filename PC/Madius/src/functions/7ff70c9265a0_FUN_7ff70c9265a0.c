/* 7ff70c9265a0 FUN_7ff70c9265a0 */

undefined4 * FUN_7ff70c9265a0(undefined4 *param_1,undefined4 *param_2)

{
  longlong lVar1;
  code *pcVar2;
  longlong lVar3;
  longlong *plVar4;
  longlong lVar5;
  ulonglong uVar6;
  
  *param_1 = *param_2;
  *(undefined8 *)(param_1 + 2) = 0;
  *(undefined8 *)(param_1 + 4) = 0;
  lVar3 = FUN_7ff70ca8ff40(0x30);
  *(longlong *)lVar3 = lVar3;
  *(longlong *)(lVar3 + 8) = lVar3;
  *(longlong *)(param_1 + 2) = lVar3;
  *(undefined8 *)(param_1 + 6) = 0;
  *(undefined8 *)(param_1 + 8) = 0;
  *(undefined8 *)(param_1 + 10) = 0;
  *(undefined8 *)(param_1 + 0xc) = 7;
  *(undefined8 *)(param_1 + 0xe) = 8;
  *param_1 = 0x3f800000;
  plVar4 = (longlong *)FUN_7ff70ca8ff40(0x80);
  lVar1 = *(longlong *)(param_1 + 6);
  uVar6 = *(longlong *)(param_1 + 10) - lVar1;
  if (uVar6 != 0) {
    lVar5 = lVar1;
    if (0xfff < uVar6) {
      lVar5 = *(longlong *)(lVar1 + -8);
      if (0x1f < (ulonglong)((lVar1 + -8) - lVar5)) {
                    /* WARNING: Does not return */
        pcVar2 = (code *)invalidInstructionException();
        (*pcVar2)();
      }
      uVar6 = uVar6 + 0x27;
    }
    thunk_FUN_7ff70ca90250(lVar5,uVar6);
  }
  *(longlong **)(param_1 + 6) = plVar4;
  *(longlong **)(param_1 + 8) = plVar4 + 0x10;
  *(longlong **)(param_1 + 10) = plVar4 + 0x10;
  *plVar4 = lVar3;
  plVar4[1] = lVar3;
  plVar4[2] = lVar3;
  plVar4[3] = lVar3;
  plVar4[4] = lVar3;
  plVar4[5] = lVar3;
  plVar4[6] = lVar3;
  plVar4[7] = lVar3;
  plVar4[8] = lVar3;
  plVar4[9] = lVar3;
  plVar4[10] = lVar3;
  plVar4[0xb] = lVar3;
  plVar4[0xc] = lVar3;
  plVar4[0xd] = lVar3;
  plVar4[0xe] = lVar3;
  plVar4[0xf] = lVar3;
  return param_1;
}


