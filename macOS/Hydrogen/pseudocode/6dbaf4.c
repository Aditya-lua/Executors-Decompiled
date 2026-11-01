
dword * FUN_006dbaf4(long *param_1,ulong *param_2)

{
  ulong *puVar1;
  long lVar2;
  ulong uVar3;
  ulong uVar4;
  long lVar5;
  ulong uVar6;
  ulong uVar7;
  
  lVar2 = param_1[1];
  if ((ulong)(lVar2 * 3) >> 2 <= (ulong)param_1[2]) {
    if (param_1[2] != 0) {
      uVar3 = *param_2;
      if (uVar3 != param_1[3]) {
        uVar4 = 0;
        uVar6 = uVar3 >> 4 ^ uVar3 >> 9;
        do {
          uVar6 = uVar6 & lVar2 - 1U;
          uVar7 = *(ulong *)(*param_1 + uVar6 * 0x10);
          if (uVar7 == uVar3) goto LAB_006dbb74;
          uVar4 = uVar4 + 1;
          uVar6 = uVar4 + uVar6;
        } while (uVar7 != param_1[3] && uVar4 <= lVar2 - 1U);
      }
    }
    func_0x006d3810(param_1);
    lVar2 = param_1[1];
  }
LAB_006dbb74:
  uVar3 = 0;
  uVar6 = *param_2;
  uVar4 = uVar6 >> 4 ^ uVar6 >> 9;
  lVar5 = *param_1;
  while( true ) {
    uVar4 = uVar4 & lVar2 - 1U;
    uVar7 = *(ulong *)(lVar5 + uVar4 * 0x10);
    if (uVar7 == param_1[3]) {
      puVar1 = (ulong *)(lVar5 + uVar4 * 0x10);
      *puVar1 = uVar6;
      param_1[2] = param_1[2] + 1;
      return (dword *)(puVar1 + 1);
    }
    if (uVar7 == uVar6) break;
    uVar3 = uVar3 + 1;
    uVar4 = uVar3 + uVar4;
    if (lVar2 - 1U < uVar3) {
      return &MACH_HEADER.cpusubtype;
    }
  }
  return (dword *)(lVar5 + uVar4 * 0x10 + 8);
}

