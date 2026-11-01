
void FUN_0070d320(undefined4 *param_1,long param_2,undefined8 *param_3,uint param_4)

{
  undefined4 uVar1;
  int iVar2;
  char cVar3;
  bool in_ZR;
  bool in_CY;
  long in_x9;
  ulong in_x10;
  undefined8 uVar4;
  ulong in_x11;
  uint uVar5;
  int in_w12;
  ulong uVar6;
  long in_x13;
  
  if ((in_CY && !in_ZR) &&
     ((*(char *)(in_x9 + in_x13) == '+' || (*(char *)(in_x9 + in_x13) == '-')))) {
    in_x11 = (ulong)(in_w12 + 2U);
    *(uint *)(param_2 + 0x10) = in_w12 + 2U;
  }
  uVar5 = (uint)in_x11;
  uVar6 = in_x11 & 0xffffffff;
  if ((in_x11 & 0xffffffff) < in_x10) {
    do {
      uVar5 = (uint)in_x11;
      cVar3 = *(char *)(in_x9 + uVar6);
      if (((0x19 < ((int)cVar3 | 0x20U) - 0x61) && (9 < (int)cVar3 - 0x30U)) && (cVar3 != '_'))
      break;
      uVar5 = uVar5 + 1;
      in_x11 = (ulong)uVar5;
      *(uint *)(param_2 + 0x10) = uVar5;
      uVar6 = in_x11;
    } while (in_x11 < in_x10);
  }
  uVar1 = *(undefined4 *)(param_2 + 0x14);
  iVar2 = *(int *)(param_2 + 0x18);
  uVar4 = *param_3;
  *param_1 = 0x118;
  *(undefined8 *)(param_1 + 1) = uVar4;
  *(ulong *)(param_1 + 3) = CONCAT44(uVar5 - iVar2,uVar1);
  param_1[5] = uVar5 - param_4;
  *(ulong *)(param_1 + 6) = in_x9 + (ulong)param_4;
  return;
}

