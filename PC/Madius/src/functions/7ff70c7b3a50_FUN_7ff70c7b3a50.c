/* 7ff70c7b3a50 FUN_7ff70c7b3a50 */

longlong * FUN_7ff70c7b3a50(longlong *param_1,undefined8 *param_2,byte param_3,int param_4)

{
  longlong *plVar1;
  undefined8 *puVar2;
  int iVar3;
  
  if (param_4 != 0) {
    *param_1 = (longlong)&UNK_7ff70cb15290;
    iVar3 = func_0x7ff70d8390d2(param_1 + 0x12);
    param_1[0x12] = (ulonglong)(iVar3 + 0x3c06e7);
    param_1[0x1b] = 0;
    param_1[0x1c] = 0;
    *(undefined1 *)(param_1 + 0x1d) = 0;
  }
  *(undefined **)((longlong)param_1 + (longlong)*(int *)(*param_1 + 4)) = &UNK_7ff70cb15288;
  *(int *)((longlong)param_1 + (longlong)*(int *)(*param_1 + 4) + -4) =
       *(int *)(*param_1 + 4) + -0x90;
  plVar1 = param_1 + 2;
  *(undefined **)((longlong)param_1 + (longlong)*(int *)(*param_1 + 4)) = &UNK_7ff70cb74190;
  *(int *)((longlong)param_1 + (longlong)*(int *)(*param_1 + 4) + -4) =
       *(int *)(*param_1 + 4) + -0x18;
  param_1[1] = 0;
  func_0x7ff70d73c023((longlong)*(int *)(*param_1 + 4) + (longlong)param_1,plVar1,0);
  *(undefined **)((longlong)param_1 + (longlong)*(int *)(*param_1 + 4)) = &UNK_7ff70cb15288;
  *(int *)((longlong)param_1 + (longlong)*(int *)(*param_1 + 4) + -4) =
       *(int *)(*param_1 + 4) + -0x90;
  func_0x7ff70cc54b73(plVar1);
  *plVar1 = (longlong)&UNK_7ff70cb74288;
  puVar2 = param_2 + 2;
  if (0xf < (ulonglong)param_2[3]) {
    param_2 = (undefined8 *)*param_2;
  }
  FUN_7ff70c788870(plVar1,param_2,*puVar2,(param_3 & 8) + (param_3 & 4) * '\x04' | ~param_3 & 2);
  return param_1;
}


