
dword * FUN_006dbb28(long param_1)

{
  ulong *puVar1;
  bool in_ZR;
  ulong in_x9;
  ulong in_x10;
  ulong uVar2;
  long lVar3;
  ulong uVar4;
  ulong uVar5;
  ulong uVar6;
  long *unaff_x19;
  ulong *unaff_x20;
  
  if (!in_ZR) {
    uVar2 = 0;
    uVar4 = in_x9 >> 4 ^ in_x9 >> 9;
    do {
      uVar4 = uVar4 & param_1 - 1U;
      uVar6 = *(ulong *)(*unaff_x19 + uVar4 * 0x10);
      if (uVar6 == in_x9) goto LAB_006dbb74;
      uVar2 = uVar2 + 1;
      uVar4 = uVar2 + uVar4;
    } while (uVar6 != in_x10 && uVar2 <= param_1 - 1U);
  }
  func_0x006d3810();
  param_1 = unaff_x19[1];
LAB_006dbb74:
  uVar2 = 0;
  uVar6 = *unaff_x20;
  uVar4 = uVar6 >> 4 ^ uVar6 >> 9;
  lVar3 = *unaff_x19;
  while( true ) {
    uVar4 = uVar4 & param_1 - 1U;
    uVar5 = *(ulong *)(lVar3 + uVar4 * 0x10);
    if (uVar5 == unaff_x19[3]) {
      puVar1 = (ulong *)(lVar3 + uVar4 * 0x10);
      *puVar1 = uVar6;
      unaff_x19[2] = unaff_x19[2] + 1;
      return (dword *)(puVar1 + 1);
    }
    if (uVar5 == uVar6) break;
    uVar2 = uVar2 + 1;
    uVar4 = uVar2 + uVar4;
    if (param_1 - 1U < uVar2) {
      return &MACH_HEADER.cpusubtype;
    }
  }
  return (dword *)(lVar3 + uVar4 * 0x10 + 8);
}

