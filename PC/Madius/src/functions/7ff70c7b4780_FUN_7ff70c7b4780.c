/* 7ff70c7b4780 FUN_7ff70c7b4780 */

void FUN_7ff70c7b4780(longlong param_1)

{
  int iVar1;
  longlong lVar2;
  code *pcVar3;
  longlong lVar4;
  longlong lVar5;
  ulonglong uVar6;
  
  *(undefined **)(param_1 + -0x90 + (longlong)*(int *)(*(longlong *)(param_1 + -0x90) + 4)) =
       &UNK_7ff70cb15288;
  iVar1 = *(int *)(*(longlong *)(param_1 + -0x90) + 4);
  *(int *)(param_1 + -0x94 + (longlong)iVar1) = iVar1 + -0x90;
  *(undefined **)(param_1 + -0x80) = &UNK_7ff70cb74288;
  if ((*(byte *)(param_1 + -0x10) & 1) != 0) {
    lVar4 = **(longlong **)(param_1 + -0x40);
    lVar5 = 0x58;
    if (lVar4 == 0) {
      lVar4 = **(longlong **)(param_1 + -0x48);
      lVar5 = 0x50;
    }
    lVar2 = **(longlong **)(param_1 + -0x68);
    uVar6 = (**(int **)(param_1 + -0x80 + lVar5) + lVar4) - lVar2;
    lVar4 = lVar2;
    if (0xfff < uVar6) {
      lVar4 = *(longlong *)(lVar2 + -8);
      if (0x1f < (ulonglong)((lVar2 + -8) - lVar4)) goto LAB_7ff70c7b487f;
      uVar6 = uVar6 + 0x27;
    }
    thunk_FUN_7ff70ca90250(lVar4,uVar6);
  }
  **(undefined8 **)(param_1 + -0x68) = 0;
  **(undefined8 **)(param_1 + -0x48) = 0;
  **(undefined4 **)(param_1 + -0x30) = 0;
  **(undefined8 **)(param_1 + -0x60) = 0;
  **(undefined8 **)(param_1 + -0x40) = 0;
  **(undefined4 **)(param_1 + -0x28) = 0;
  *(undefined8 *)(param_1 + -0x18) = 0;
  *(byte *)(param_1 + -0x10) = *(byte *)(param_1 + -0x10) & 0xfe;
  func_0x7ff70d609141(param_1 + -0x80);
LAB_7ff70c7b487f:
                    /* WARNING: Does not return */
  pcVar3 = (code *)invalidInstructionException();
  (*pcVar3)();
}


