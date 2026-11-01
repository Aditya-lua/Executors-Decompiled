
void FUN_00423704(ulong param_1,undefined8 param_2,ulong param_3)

{
  bool bVar1;
  undefined1 *puVar2;
  long lVar3;
  undefined1 in_ZR;
  ulong in_x9;
  ulong uVar4;
  ulong *unaff_x20;
  long *plVar5;
  long in_stack_00000008;
  long in_stack_00000010;
  long in_stack_00000018;
  long in_stack_00000020;
  undefined8 in_stack_00000028;
  ulong in_stack_00000038;
  int iStack0000000000000040;
  int iStack0000000000000044;
  
  while( true ) {
    uVar4 = 0;
    if (!(bool)in_ZR) {
      uVar4 = in_x9 | 1;
    }
    bVar1 = *unaff_x20 == param_3;
    param_3 = *unaff_x20;
    if (bVar1) break;
    while (((uint)param_3 >> 1 & 1) != 0) {
      if (((uint)param_3 >> 3 & 1) == 0) {
        func_0x007a1a98();
        goto LAB_00423740;
      }
      uVar4 = param_3 & param_1;
      bVar1 = *unaff_x20 == param_3;
      param_3 = *unaff_x20;
      if (bVar1) {
        *unaff_x20 = uVar4;
        goto LAB_00423740;
      }
    }
    in_x9 = param_3 - 0x11;
    in_ZR = in_x9 == 0;
  }
  *unaff_x20 = uVar4;
LAB_00423740:
  if ((in_stack_00000038 & 1) == 0) {
    if (in_stack_00000038._4_4_ != -1) {
      _close();
    }
    if (iStack0000000000000040 != -1) {
      _close();
    }
    if (iStack0000000000000044 != -1) {
      _close();
    }
  }
  if (in_stack_00000008 != -0x8000000000000000) {
    if (in_stack_00000018 != 0) {
      plVar5 = (long *)(in_stack_00000010 + 8);
      do {
        puVar2 = (undefined1 *)plVar5[-1];
        lVar3 = *plVar5;
        *puVar2 = 0;
        if (lVar3 != 0) {
          func_0x00187bd4(puVar2,lVar3,1);
        }
        plVar5 = plVar5 + 2;
        in_stack_00000018 = in_stack_00000018 + -1;
      } while (in_stack_00000018 != 0);
    }
    if (in_stack_00000008 != 0) {
      func_0x00187bd4(in_stack_00000010,in_stack_00000008 << 4,8);
    }
    if (in_stack_00000020 != 0) {
      func_0x00187bd4(in_stack_00000028,in_stack_00000020 << 3,8);
    }
  }
  return;
}

