
void FUN_001340b4(long param_1,long param_2)

{
  int iVar1;
  int *in_x9;
  int *piVar2;
  int in_w10;
  undefined1 in_w11;
  undefined4 in_w12;
  long lVar3;
  
  while (param_1 = param_1 + -1, param_1 != 0) {
    piVar2 = in_x9 + 4;
    iVar1 = *in_x9;
    in_x9 = piVar2;
    if ((iVar1 != -1) && (*(long *)(&UNK_00004e40 + param_2) != 0)) {
      lVar3 = *(long *)(&UNK_00004e40 + param_2) + (long)iVar1 * (long)in_w10;
      *(undefined1 *)(lVar3 + 0x23d) = in_w11;
      *(undefined4 *)(lVar3 + 100) = in_w12;
    }
  }
  return;
}

