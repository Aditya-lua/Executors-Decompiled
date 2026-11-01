
dword * FUN_006db850(long param_1)

{
  ulong *puVar1;
  ulong uVar2;
  ulong uVar3;
  long lVar4;
  ulong uVar5;
  ulong uVar6;
  long *unaff_x19;
  ulong *unaff_x20;
  
  uVar2 = *unaff_x20;
  if (uVar2 != unaff_x19[3]) {
    uVar3 = 0;
    uVar5 = uVar2 >> 4 ^ uVar2 >> 9;
    do {
      uVar5 = uVar5 & param_1 - 1U;
      uVar6 = *(ulong *)(*unaff_x19 + uVar5 * 0x10);
      if (uVar6 == uVar2) goto LAB_006db8a8;
      uVar3 = uVar3 + 1;
      uVar5 = uVar3 + uVar5;
    } while (uVar6 != unaff_x19[3] && uVar3 <= param_1 - 1U);
  }
  func_0x006db93c();
  param_1 = unaff_x19[1];
LAB_006db8a8:
  uVar2 = 0;
  uVar5 = *unaff_x20;
  uVar3 = uVar5 >> 4 ^ uVar5 >> 9;
  lVar4 = *unaff_x19;
  while( true ) {
    uVar3 = uVar3 & param_1 - 1U;
    uVar6 = *(ulong *)(lVar4 + uVar3 * 0x10);
    if (uVar6 == unaff_x19[3]) {
      puVar1 = (ulong *)(lVar4 + uVar3 * 0x10);
      *puVar1 = uVar5;
      unaff_x19[2] = unaff_x19[2] + 1;
      return (dword *)(puVar1 + 1);
    }
    if (uVar6 == uVar5) break;
    uVar2 = uVar2 + 1;
    uVar3 = uVar2 + uVar3;
    if (param_1 - 1U < uVar2) {
      return &MACH_HEADER.cpusubtype;
    }
  }
  return (dword *)(lVar4 + uVar3 * 0x10 + 8);
}

