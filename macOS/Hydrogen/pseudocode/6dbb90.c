
dword * FUN_006dbb90(long param_1)

{
  long *plVar1;
  ulong in_x9;
  ulong in_x10;
  long in_x11;
  long in_x12;
  ulong in_x13;
  ulong uVar2;
  long lVar3;
  long unaff_x19;
  
  while( true ) {
    uVar2 = in_x13 & in_x10;
    lVar3 = *(long *)(in_x11 + uVar2 * 0x10);
    if (lVar3 == in_x12) {
      plVar1 = (long *)(in_x11 + uVar2 * 0x10);
      *plVar1 = param_1;
      *(long *)(unaff_x19 + 0x10) = *(long *)(unaff_x19 + 0x10) + 1;
      return (dword *)(plVar1 + 1);
    }
    if (lVar3 == param_1) break;
    in_x9 = in_x9 + 1;
    in_x13 = in_x9 + uVar2;
    if (in_x10 < in_x9) {
      return &MACH_HEADER.cpusubtype;
    }
  }
  return (dword *)(in_x11 + uVar2 * 0x10 + 8);
}

