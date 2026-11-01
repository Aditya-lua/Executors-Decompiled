
dword * FUN_006dbb5c(long param_1)

{
  ulong *puVar1;
  undefined1 in_ZR;
  ulong uVar2;
  long in_x9;
  ulong uVar3;
  long in_x10;
  ulong in_x11;
  long lVar4;
  ulong in_x12;
  long in_x13;
  ulong uVar5;
  ulong in_x14;
  ulong uVar6;
  long *unaff_x19;
  ulong *unaff_x20;
  
  while (!(bool)in_ZR && in_x11 <= in_x12) {
    in_x14 = in_x11 + in_x14 & in_x12;
    lVar4 = *(long *)(in_x13 + in_x14 * 0x10);
    if (lVar4 == in_x9) goto code_r0x006dbb74;
    in_x11 = in_x11 + 1;
    in_ZR = lVar4 == in_x10;
  }
  func_0x006d3810();
  param_1 = unaff_x19[1];
code_r0x006dbb74:
  uVar3 = 0;
  uVar2 = *unaff_x20;
  uVar5 = uVar2 >> 4 ^ uVar2 >> 9;
  lVar4 = *unaff_x19;
  while( true ) {
    uVar5 = uVar5 & param_1 - 1U;
    uVar6 = *(ulong *)(lVar4 + uVar5 * 0x10);
    if (uVar6 == unaff_x19[3]) {
      puVar1 = (ulong *)(lVar4 + uVar5 * 0x10);
      *puVar1 = uVar2;
      unaff_x19[2] = unaff_x19[2] + 1;
      return (dword *)(puVar1 + 1);
    }
    if (uVar6 == uVar2) break;
    uVar3 = uVar3 + 1;
    uVar5 = uVar3 + uVar5;
    if (param_1 - 1U < uVar3) {
      return &MACH_HEADER.cpusubtype;
    }
  }
  return (dword *)(lVar4 + uVar5 * 0x10 + 8);
}

