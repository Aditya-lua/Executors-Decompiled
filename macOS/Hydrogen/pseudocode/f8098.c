
undefined8 FUN_000f8098(undefined4 param_1,undefined8 param_2,char *param_3)

{
  int iVar1;
  int *piVar2;
  undefined8 uVar3;
  int iVar4;
  int iVar5;
  int iVar6;
  int iVar7;
  int *piVar8;
  char cVar9;
  
  iVar1 = _strlen(param_3);
  piVar2 = (int *)func_0x000b810c((long)(int)(((uint)((ulong)((long)(iVar1 + 4) * 0x66666667) >>
                                                     0x21) - (iVar1 + 4 >> 0x1f)) * 4));
  cVar9 = *param_3;
  if (cVar9 != '\0') {
    piVar8 = piVar2;
    do {
      iVar1 = -0x24;
      if (cVar9 < 0x5c) {
        iVar1 = -0x23;
      }
      iVar4 = -0x24;
      if ((byte)param_3[1] < 0x5c) {
        iVar4 = -0x23;
      }
      iVar5 = -0x24;
      if ((byte)param_3[2] < 0x5c) {
        iVar5 = -0x23;
      }
      iVar6 = -0x24;
      if ((byte)param_3[3] < 0x5c) {
        iVar6 = -0x23;
      }
      iVar7 = -0x24;
      if ((byte)param_3[4] < 0x5c) {
        iVar7 = -0x23;
      }
      *piVar8 = iVar1 + cVar9 +
                (iVar4 + (uint)(byte)param_3[1] +
                (iVar5 + (uint)(byte)param_3[2] +
                (iVar6 + (uint)(byte)param_3[3] + (iVar7 + (uint)(byte)param_3[4]) * 0x55) * 0x55) *
                0x55) * 0x55;
      cVar9 = param_3[5];
      piVar8 = piVar8 + 1;
      param_3 = param_3 + 5;
    } while (cVar9 != '\0');
  }
  uVar3 = func_0x000f8490(param_1,param_2,piVar2);
  func_0x000b83d4(piVar2);
  return uVar3;
}

