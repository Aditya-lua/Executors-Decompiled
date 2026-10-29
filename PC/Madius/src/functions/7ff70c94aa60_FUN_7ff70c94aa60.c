/* 7ff70c94aa60 FUN_7ff70c94aa60 */

undefined8 FUN_7ff70c94aa60(int *param_1,int *param_2)

{
  int iVar1;
  undefined8 uVar2;
  longlong lVar3;
  longlong *plVar4;
  longlong lStack_20;
  
  uVar2 = 1;
  if ((((param_1 != (int *)0x0) && (*param_1 == 0xbab1e)) && (uVar2 = 2, param_2 != (int *)0x0)) &&
     (*param_2 == -0x3f212453)) {
    if (*(int **)(param_2 + 0x36) == (int *)0x0) {
      uVar2 = 0;
    }
    else if ((*(int **)(param_2 + 0x36) == param_1) &&
            (uVar2 = 8, *(char *)((longlong)param_1 + 0x1b3) == '\0')) {
      iVar1 = param_2[0x16];
      if (iVar1 < 0xf) {
        param_1[7] = param_1[7] + -1;
      }
      if ((*(longlong *)(param_2 + 8) != 0) &&
         ((5 < param_2[0x16] - 9U ||
          (FUN_7ff70c956760(*(longlong *)(param_2 + 8),2), *(longlong *)(param_2 + 8) != 0)))) {
        FUN_7ff70c94acb0(param_2,param_2[0x17],iVar1 < 0xf);
      }
      FUN_7ff70c94b050(param_2);
      if (*(longlong *)(param_2 + 10) != 0) {
        FUN_7ff70c991030(param_1 + (ulonglong)(param_2[0x16] != 1) * 8 + 0x10,param_2 + 10,0);
      }
      if ((param_2[0x16] != 1) && (param_2[0x16] != 0x10)) {
        lVar3 = *(longlong *)(param_2 + 4);
        if (*(longlong *)(param_2 + 6) == 0) {
          *(longlong *)(param_1 + 2) = lVar3;
        }
        else {
          *(longlong *)(*(longlong *)(param_2 + 6) + 0x10) = lVar3;
        }
        if (lVar3 == 0) {
          *(undefined8 *)(param_1 + 4) = *(undefined8 *)(param_2 + 6);
        }
        else {
          *(undefined8 *)(lVar3 + 0x18) = *(undefined8 *)(param_2 + 6);
        }
        param_2[4] = 0;
        param_2[5] = 0;
        param_2[6] = 0;
        param_2[7] = 0;
      }
      if (param_2[0x34] == 1) {
        param_2[0x32] = 0;
        param_2[0x33] = 0;
        param_2[0x34] = 0;
      }
      param_2[0x16] = 0xf;
      FUN_7ff70c94b110(param_1,param_2);
      FUN_7ff70c94b5b0(param_2);
      if (((*(char *)((longlong)param_2 + 0xa22) != '\0') && (*(longlong *)(param_2 + 0x38) == 0))
         && (lVar3 = FUN_7ff70c956670(param_2,&lStack_20), lStack_20 != 0 && lVar3 != -1)) {
        FUN_7ff70c958b40(param_2,lStack_20,1);
        FUN_7ff70c945f70(param_2,lStack_20,1);
      }
      if (*(longlong *)(param_2 + 0x304) != -1) {
        FUN_7ff70c958c70(param_2,*(undefined8 *)(param_2 + 0x2fe),0,&UNK_7ff70c94b600);
      }
      param_2[0x2fe] = 0;
      param_2[0x2ff] = 0;
      param_2[0x36] = 0;
      param_2[0x37] = 0;
      plVar4 = *(longlong **)(param_1 + 8);
      if (plVar4 != (longlong *)0x0) {
        do {
          if (*(int **)(*plVar4 + 0x20) == param_2) {
            FUN_7ff70c991030(param_1 + 8,plVar4,0);
            break;
          }
          plVar4 = (longlong *)plVar4[2];
        } while (plVar4 != (longlong *)0x0);
      }
      param_1[6] = param_1[6] + -1;
      FUN_7ff70c94b640(param_1);
      uVar2 = FUN_7ff70c94a8f0(param_1);
    }
  }
  return uVar2;
}


