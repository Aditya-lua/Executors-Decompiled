
void FUN_0024e508(long param_1,long *param_2,long param_3,long param_4,ulong param_5,long param_6)

{
  undefined4 uVar1;
  code *pcVar2;
  bool in_ZR;
  ulong in_x9;
  ulong in_x10;
  long lVar3;
  long unaff_x19;
  undefined8 uStack0000000000000018;
  
  if (in_ZR) {
    if (unaff_x19 == 1) {
      lVar3 = *(long *)(param_3 + 0x3e0);
      *(undefined8 *)(param_3 + 0x3e0) = 0;
      in_x9 = *(ulong *)(param_1 + 0x10);
      in_x10 = *(ulong *)(param_1 + 0x18);
    }
    else {
      lVar3 = 0;
    }
    uStack0000000000000018 = 1;
    if (param_5 < in_x10 || in_x10 < in_x9) {
      func_0x007a23bc(&UNK_009c2900);
                    /* WARNING: Does not return */
      pcVar2 = (code *)SoftwareBreakpoint(1,0x24e5cc);
      (*pcVar2)();
    }
    uVar1 = *(undefined4 *)(param_1 + 0x20);
    *param_2 = param_4 + in_x9;
    param_2[1] = in_x10 - in_x9;
    *(undefined1 *)(param_2 + 2) = 2;
    *(undefined4 *)((long)param_2 + 0x12) = uVar1;
    *(long *)(param_6 + 8) = *(long *)(param_6 + 8) + lVar3;
    *(undefined8 *)(param_3 + 0x3d8) = 0;
    unaff_x19 = unaff_x19 + -1;
    if (unaff_x19 == 0) {
      return;
    }
    _memmove(*(long *)(param_3 + 0x3d0),*(long *)(param_3 + 0x3d0) + 0x28,unaff_x19 * 0x28);
  }
  else {
    *(undefined2 *)((long)param_2 + 0x12) = 10;
    *(undefined8 *)(param_3 + 0x3d8) = 0;
  }
  *(long *)(param_3 + 0x3d8) = unaff_x19;
  return;
}

