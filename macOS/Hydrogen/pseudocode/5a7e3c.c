
void FUN_005a7e3c(undefined8 *param_1,long param_2,long param_3,undefined8 param_4)

{
  ushort uVar1;
  ulong uVar2;
  char cVar3;
  long lVar4;
  undefined8 uVar5;
  ulong uVar6;
  long lVar7;
  
  uVar5 = 1;
  while( true ) {
    uVar1 = *(ushort *)(param_2 + 0x21a);
    lVar7 = (ulong)uVar1 * 0x30;
    uVar6 = 0xffffffffffffffff;
    lVar4 = param_2;
    do {
      uVar2 = (ulong)uVar1;
      if (lVar7 == 0) goto joined_r0x005a7ea0;
      cVar3 = func_0x005a86f4(param_4,lVar4);
      lVar7 = lVar7 + -0x30;
      uVar6 = uVar6 + 1;
      lVar4 = lVar4 + 0x30;
    } while (cVar3 == '\x01');
    uVar2 = uVar6;
    if (cVar3 == '\0') break;
joined_r0x005a7ea0:
    uVar6 = uVar2;
    if (param_3 == 0) goto LAB_005a7eb8;
    param_2 = *(long *)(param_2 + uVar6 * 8 + 0x220);
    param_3 = param_3 + -1;
  }
  uVar5 = 0;
LAB_005a7eb8:
  param_1[2] = param_3;
  param_1[3] = uVar6;
  *param_1 = uVar5;
  param_1[1] = param_2;
  return;
}

