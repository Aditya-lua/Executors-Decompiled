
void FUN_006f4084(long param_1,undefined8 param_2,code *param_3)

{
  long lVar1;
  int iVar2;
  int in_w9;
  long unaff_x22;
  long lVar3;
  int iVar4;
  long lVar5;
  
  lVar3 = param_1 + 0x40 + (long)(int)unaff_x22 * (long)in_w9;
  if (param_1 + 0x40 + (long)*(int *)(param_1 + 0x30) + unaff_x22 != lVar3) {
    iVar4 = *(int *)(param_1 + 0x34);
    lVar1 = (long)*(int *)(param_1 + 0x30) + 0x40;
    lVar5 = param_1 + unaff_x22;
    do {
      if (((*(char *)(lVar5 + lVar1) != '\0') && (iVar2 = (*param_3)(param_2,param_1), iVar2 != 0))
         && (iVar4 = iVar4 + -1, iVar4 == 0)) {
        return;
      }
      lVar5 = lVar5 + unaff_x22;
    } while (lVar5 + lVar1 != lVar3);
  }
  return;
}

