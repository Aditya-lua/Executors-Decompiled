/* 7ff70c788040 FUN_7ff70c788040 */

void FUN_7ff70c788040(longlong *param_1,undefined8 param_2,undefined8 param_3,int param_4)

{
  int iVar1;
  undefined1 *puVar2;
  undefined1 auStack_78 [52];
  int iStack_44;
  longlong *plStack_40;
  undefined8 uStack_38;
  
  puVar2 = auStack_78;
  uStack_38 = 0xfffffffffffffffe;
  iStack_44 = param_4;
  if (param_4 != 0) {
    *param_1 = (longlong)&UNK_7ff70cb75114;
    param_1[2] = (longlong)&UNK_7ff70cb7511c;
    puVar2 = &stack0xffffffffffffff80;
    func_0x7ff70d616cd2(param_1 + 0x13);
    param_1[0x13] = (longlong)&UNK_7ff70cb74180;
    param_1[0x1c] = 0;
    param_1[0x1d] = 0;
    *(undefined1 *)(param_1 + 0x1e) = 0;
  }
  *(undefined **)((longlong)param_1 + (longlong)*(int *)(*param_1 + 4)) = &UNK_7ff70cb74260;
  *(int *)((longlong)param_1 + (longlong)*(int *)(*param_1 + 4) + -4) =
       *(int *)(*param_1 + 4) + -0x98;
  *(undefined **)((longlong)param_1 + (longlong)*(int *)(*param_1 + 4)) = &UNK_7ff70cb74190;
  *(int *)((longlong)param_1 + (longlong)*(int *)(*param_1 + 4) + -4) =
       *(int *)(*param_1 + 4) + -0x18;
  param_1[1] = 0;
  iVar1 = *(int *)(*param_1 + 4);
  *(undefined8 *)(puVar2 + -8) = param_2;
  *(undefined8 *)(puVar2 + -0x10) = 0x7ff70c788119;
  plStack_40 = param_1;
  func_0x7ff70d7d5449((longlong)iVar1 + (longlong)param_1,param_1 + 3,0);
  *(undefined **)((longlong)plStack_40 + (longlong)*(int *)(plStack_40[2] + 4) + 0x10) =
       &UNK_7ff70cb74250;
  *(int *)((longlong)plStack_40 + (longlong)*(int *)(plStack_40[2] + 4) + 0xc) =
       *(int *)(plStack_40[2] + 4) + -0x10;
  *(undefined **)((longlong)plStack_40 + (longlong)*(int *)(*plStack_40 + 4)) = &UNK_7ff70cb74270;
  *(int *)((longlong)plStack_40 + (longlong)*(int *)(*plStack_40 + 4) + -4) =
       *(int *)(*plStack_40 + 4) + -0x20;
  *(undefined **)((longlong)plStack_40 + (longlong)*(int *)(*plStack_40 + 4)) = &UNK_7ff70cb74260;
  *(int *)((longlong)plStack_40 + (longlong)*(int *)(*plStack_40 + 4) + -4) =
       *(int *)(*plStack_40 + 4) + -0x98;
  *(undefined8 *)(puVar2 + -0x10) = 0x7ff70c788185;
  func_0x7ff70da59a9e(param_1 + 3);
  return;
}


