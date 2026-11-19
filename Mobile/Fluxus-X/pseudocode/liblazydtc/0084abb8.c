/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0084abb8
 */

undefined8 FUN_0084abb8(long param_1,long param_2,long param_3,long *param_4,uint param_5)

{
  int iVar1;
  ulong uVar2;
  undefined8 uVar3;
  long lVar4;
  long lVar5;
  long *plVar6;
  
  iVar1 = *(int *)(param_1 + 0x1c);
  plVar6 = param_4 + 3;
  *plVar6 = param_3;
  param_4[4] = param_3;
  if ((param_5 & 0x80) != 0) {
    param_5 = param_5 & 0xffa;
  }
  *(undefined1 *)(param_4 + 5) = 0;
  FUN_008442b8(param_4,iVar1 + 1,plVar6);
  param_4[6] = param_2;
  param_4[7] = param_2;
  *(undefined1 *)(param_4 + 8) = 0;
  param_4[10] = param_4[4];
  param_4[9] = *plVar6;
  *(char *)(param_4 + 0xb) = (char)param_4[5];
  if ((param_5 >> 0xb & 1) == 0) {
    param_4[0xd] = param_2;
  }
  *(undefined1 *)(param_4 + 0xc) = 1;
  if ((*(ushort *)(param_1 + 0x18) & 0x1f0) == 0) {
    uVar2 = FUN_00843df0(param_1,param_2,param_3,param_4,param_5,(param_5 & 0x800) == 0);
  }
  else if (*(int *)(param_1 + 0x1c) == 0) {
    uVar2 = FUN_0084b038(param_1,param_2,param_3,param_4,param_5,(param_5 & 0x800) == 0);
  }
  else {
    uVar2 = FUN_0084b7e4(param_1,param_2,param_3,param_4,param_5,(param_5 & 0x800) == 0);
  }
  if ((uVar2 & 1) == 0) {
    if ((param_2 != param_3) && ((param_5 >> 6 & 1) == 0)) {
      while (param_2 = param_2 + 1, param_2 != param_3) {
        FUN_008442b8(param_4,(param_4[1] - *param_4 >> 3) * -0x5555555555555555,plVar6);
        if ((*(ushort *)(param_1 + 0x18) & 0x1f0) == 0) {
          uVar2 = FUN_00843df0(param_1,param_2,param_3,param_4,param_5 | 0x80,0);
        }
        else if (*(int *)(param_1 + 0x1c) == 0) {
          uVar2 = FUN_0084b038(param_1,param_2,param_3,param_4,param_5 | 0x80,0);
        }
        else {
          uVar2 = FUN_0084b7e4(param_1,param_2,param_3,param_4,param_5 | 0x80,0);
        }
        if ((uVar2 & 1) != 0) goto LAB_0084ae00;
        FUN_008442b8(param_4,(param_4[1] - *param_4 >> 3) * -0x5555555555555555,plVar6);
      }
      FUN_008442b8(param_4,(param_4[1] - *param_4 >> 3) * -0x5555555555555555,plVar6);
      if ((*(ushort *)(param_1 + 0x18) & 0x1f0) == 0) {
        uVar2 = FUN_00843df0(param_1,param_2,param_3,param_4,param_5 | 0x80,0);
      }
      else if (*(int *)(param_1 + 0x1c) == 0) {
        uVar2 = FUN_0084b038(param_1,param_2,param_3,param_4,param_5 | 0x80,0);
      }
      else {
        uVar2 = FUN_0084b7e4(param_1,param_2,param_3,param_4,param_5 | 0x80,0);
      }
      if ((uVar2 & 1) != 0) goto LAB_0084ae00;
    }
    uVar3 = 0;
    param_4[1] = *param_4;
  }
  else {
LAB_0084ae00:
    uVar3 = 1;
    if ((long *)param_4[1] != (long *)*param_4) {
      plVar6 = (long *)*param_4;
    }
    lVar5 = *plVar6;
    param_4[7] = lVar5;
    lVar4 = plVar6[1];
    *(bool *)(param_4 + 8) = param_4[6] != lVar5;
    param_4[9] = lVar4;
    *(bool *)(param_4 + 0xb) = lVar4 != param_4[10];
  }
  return uVar3;
}

