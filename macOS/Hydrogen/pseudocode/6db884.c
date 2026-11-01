
dword * FUN_006db884(long param_1)

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
  long in_x15;
  long *unaff_x19;
  ulong *unaff_x20;
  
  do {
    if ((bool)in_ZR) {
LAB_006db8a8:
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
    in_x11 = in_x11 + 1;
    if (in_x15 == in_x10 || in_x12 < in_x11) {
      func_0x006db93c();
      param_1 = unaff_x19[1];
      goto LAB_006db8a8;
    }
    in_x14 = in_x11 + in_x14 & in_x12;
    in_x15 = *(long *)(in_x13 + in_x14 * 0x10);
    in_ZR = in_x15 == in_x9;
  } while( true );
}

