
int * FUN_006bb4f4(long *param_1,undefined8 *param_2)

{
  int *piVar1;
  uint uVar2;
  uint uVar3;
  ulong uVar4;
  ulong in_x9;
  int in_w10;
  long lVar5;
  ulong uVar6;
  undefined8 uVar7;
  undefined8 uVar8;
  
  lVar5 = param_2[1];
  uVar2 = in_w10 * 0x5bd1e995 ^ (uint)((ulong)lVar5 >> 0x20);
  uVar3 = ((uint)lVar5 ^ uVar2 >> 0x12) * 0x5bd1e995;
  uVar2 = (uVar2 ^ uVar3 >> 0x16) * 0x5bd1e995;
  uVar6 = 0;
  uVar4 = (ulong)((uVar2 ^ (uVar3 ^ uVar2 >> 0x11) * 0x5bd1e995 >> 0x13) * 0x5bd1e995);
  while( true ) {
    piVar1 = (int *)(*param_1 + (in_x9 & uVar4) * 0x20);
    if (((*piVar1 == (int)param_1[3]) && (*(long *)(piVar1 + 2) == param_1[4])) &&
       (*(long *)(piVar1 + 4) == param_1[5])) {
      uVar8 = param_2[1];
      uVar7 = *param_2;
      *(undefined8 *)(piVar1 + 4) = param_2[2];
      *(undefined8 *)(piVar1 + 2) = uVar8;
      *(undefined8 *)piVar1 = uVar7;
      param_1[2] = param_1[2] + 1;
      return piVar1;
    }
    if (((*piVar1 == in_w10) && (*(long *)(piVar1 + 2) == lVar5)) &&
       (*(long *)(piVar1 + 4) == param_2[2])) break;
    uVar6 = uVar6 + 1;
    uVar4 = uVar6 + (in_x9 & uVar4);
    if (in_x9 < uVar6) {
      return (int *)0x0;
    }
  }
  return piVar1;
}

