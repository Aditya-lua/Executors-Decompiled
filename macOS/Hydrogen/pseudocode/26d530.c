
void FUN_0026d530(long *param_1,long *param_2)

{
  long lVar1;
  long lVar2;
  long lVar3;
  long *plVar4;
  long *plVar5;
  long *plVar6;
  int iVar7;
  long lVar8;
  long lVar9;
  long lVar10;
  long lVar11;
  long *plVar12;
  long *plStack0000000000000008;
  long lStack0000000000000010;
  long *plStack0000000000000018;
  long lStack0000000000000020;
  long lStack0000000000000028;
  long lStack0000000000000030;
  long in_stack_00000040;
  long in_stack_00000048;
  long in_stack_00000050;
  long in_stack_00000058;
  long in_stack_00000060;
  long in_stack_00000068;
  long in_stack_00000070;
  long in_stack_00000078;
  long in_stack_00000080;
  
  lVar8 = param_2[3];
  plStack0000000000000018 = (long *)param_2[0xd];
  plVar12 = (long *)param_2[0xb];
  plStack0000000000000008 = param_1;
  while( true ) {
    param_2[3] = 3;
    lVar11 = lVar8;
    plVar4 = param_2 + 4;
    plVar6 = plVar12;
    plVar5 = param_2;
    if (lVar8 == 3) {
      if (plVar12 == plStack0000000000000018) break;
      lVar11 = plVar12[3];
      param_2[0xb] = (long)(plVar12 + 10);
      plVar4 = plVar12 + 4;
      plVar6 = plVar12 + 10;
      plVar5 = plVar12;
    }
    plVar12 = plVar6;
    if (lVar11 == 2) break;
    lVar1 = plVar5[1];
    lVar3 = plVar5[2];
    lVar10 = *plVar5;
    lVar9 = plVar5[4];
    lVar2 = plVar4[1];
    lStack0000000000000010 = plVar4[2];
    lStack0000000000000028 = plVar4[4];
    lStack0000000000000020 = plVar4[3];
    lStack0000000000000030 = plVar4[5];
    if (plVar12 == plStack0000000000000018) {
      lVar8 = 2;
    }
    else {
      in_stack_00000078 = plVar12[1];
      in_stack_00000070 = *plVar12;
      in_stack_00000080 = plVar12[2];
      lVar8 = plVar12[3];
      in_stack_00000058 = plVar12[7];
      in_stack_00000050 = plVar12[6];
      in_stack_00000068 = plVar12[9];
      in_stack_00000060 = plVar12[8];
      in_stack_00000048 = plVar12[5];
      in_stack_00000040 = plVar12[4];
      plVar12 = plVar12 + 10;
      param_2[0xb] = (long)plVar12;
    }
    param_2[1] = in_stack_00000078;
    *param_2 = in_stack_00000070;
    param_2[2] = in_stack_00000080;
    param_2[3] = lVar8;
    param_2[5] = in_stack_00000048;
    param_2[4] = in_stack_00000040;
    param_2[7] = in_stack_00000058;
    param_2[6] = in_stack_00000050;
    param_2[9] = in_stack_00000068;
    param_2[8] = in_stack_00000060;
    if (((lVar8 == 2) || (lVar3 != param_2[2])) ||
       (iVar7 = _memcmp(lVar1,param_2[1],lVar3), iVar7 != 0)) {
      *plStack0000000000000008 = lVar10;
      plStack0000000000000008[1] = lVar1;
      plStack0000000000000008[2] = lVar3;
      plStack0000000000000008[3] = lVar11;
      plStack0000000000000008[4] = lVar9;
      plStack0000000000000008[5] = lVar2;
      plStack0000000000000008[6] = lStack0000000000000010;
      plStack0000000000000008[8] = lStack0000000000000028;
      plStack0000000000000008[7] = lStack0000000000000020;
      plStack0000000000000008[9] = lStack0000000000000030;
      return;
    }
    if (lVar10 != 0) {
      func_0x00187bd4(lVar1,lVar10,1);
    }
    if (lVar2 != 0) {
      func_0x00187bd4(lStack0000000000000010,lVar2,1);
    }
  }
  plStack0000000000000008[3] = 2;
  return;
}

