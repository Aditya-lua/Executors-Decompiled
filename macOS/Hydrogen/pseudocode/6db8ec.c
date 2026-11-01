
dword * FUN_006db8ec(long param_1)

{
  long *plVar1;
  undefined1 in_ZR;
  undefined1 in_CY;
  ulong in_x9;
  ulong in_x10;
  long in_x11;
  long in_x12;
  ulong uVar2;
  ulong in_x13;
  long lVar3;
  long unaff_x19;
  
  while( true ) {
    if ((bool)in_CY && !(bool)in_ZR) {
      return &MACH_HEADER.cpusubtype;
    }
    uVar2 = in_x13 & in_x10;
    lVar3 = *(long *)(in_x11 + uVar2 * 0x10);
    if (lVar3 == in_x12) break;
    if (lVar3 == param_1) {
      return (dword *)(in_x11 + uVar2 * 0x10 + 8);
    }
    in_x9 = in_x9 + 1;
    in_x13 = in_x9 + uVar2;
    in_CY = in_x10 <= in_x9;
    in_ZR = in_x9 == in_x10;
  }
  plVar1 = (long *)(in_x11 + uVar2 * 0x10);
  *plVar1 = param_1;
  *(long *)(unaff_x19 + 0x10) = *(long *)(unaff_x19 + 0x10) + 1;
  return (dword *)(plVar1 + 1);
}

