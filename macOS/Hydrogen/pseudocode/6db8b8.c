
dword * FUN_006db8b8(ulong param_1)

{
  ulong *puVar1;
  ulong in_x9;
  ulong in_x10;
  ulong in_x11;
  long lVar2;
  ulong uVar3;
  ulong uVar4;
  long *unaff_x19;
  
  uVar3 = in_x11 ^ param_1 >> 9;
  lVar2 = *unaff_x19;
  while( true ) {
    uVar3 = uVar3 & in_x10;
    uVar4 = *(ulong *)(lVar2 + uVar3 * 0x10);
    if (uVar4 == unaff_x19[3]) {
      puVar1 = (ulong *)(lVar2 + uVar3 * 0x10);
      *puVar1 = param_1;
      unaff_x19[2] = unaff_x19[2] + 1;
      return (dword *)(puVar1 + 1);
    }
    if (uVar4 == param_1) break;
    in_x9 = in_x9 + 1;
    uVar3 = in_x9 + uVar3;
    if (in_x10 < in_x9) {
      return &MACH_HEADER.cpusubtype;
    }
  }
  return (dword *)(lVar2 + uVar3 * 0x10 + 8);
}

