
void FUN_005a0fa4(long *param_1,long param_2)

{
  char cVar1;
  long *plVar2;
  bool bVar3;
  char cVar4;
  long lVar5;
  ulong in_x11;
  ulong in_x12;
  long *unaff_x20;
  long *plVar6;
  long unaff_x21;
  long *unaff_x22;
  long *unaff_x23;
  long *unaff_x25;
  ulong unaff_x26;
  long *unaff_x28;
  long *plVar7;
  long *in_stack_00000008;
  ulong in_stack_00000018;
  long *in_stack_00000020;
  undefined8 uStack0000000000000028;
  long in_stack_00000030;
  long in_stack_00000038;
  
code_r0x005a0fa4:
  plVar6 = unaff_x20;
  if (unaff_x22 == (long *)0x0) {
    unaff_x26 = 0;
    unaff_x22 = unaff_x23;
    if ((in_x11 & 1) != 0) goto LAB_005a0fc4;
    goto code_r0x005a0fe4;
  }
  plVar2 = param_1;
LAB_005a1094:
  do {
    param_1 = plVar2;
    if (unaff_x21 == uStack0000000000000028) {
      bVar3 = plVar6 != (long *)0x0;
      cVar1 = bVar3;
      if (unaff_x23 != (long *)0x0) {
        cVar1 = bVar3 + '\x01';
      }
      if ((in_x11 & 1) == 0) {
        cVar1 = bVar3;
      }
      cVar4 = (in_x11 & 1) != 0 && unaff_x23 != (long *)0x0;
      if ((unaff_x26 & 1) != 0) {
        cVar4 = cVar1;
      }
      cVar1 = '\0';
      if (unaff_x26 != 2) {
        cVar1 = cVar4;
      }
      if (in_x12 == 2) {
LAB_005a10e8:
        cVar4 = '\0';
      }
      else if ((in_x12 & 1) == 0) {
        if ((in_stack_00000018 & 0x100000000) == 0) goto LAB_005a10e8;
        cVar4 = param_1 != (long *)0x0;
      }
      else {
        cVar4 = unaff_x28 != (long *)0x0;
        if (((in_stack_00000018 & 0x100000000) != 0) && (param_1 != (long *)0x0)) {
          cVar4 = cVar4 + '\x01';
        }
      }
      func_0x007af5a0(&uStack0000000000000028,unaff_x21,cVar1 + cVar4 + '\x01',8,8);
      param_2 = in_stack_00000030;
    }
    *(long **)(param_2 + unaff_x21 * 8) = unaff_x22;
    unaff_x21 = unaff_x21 + 1;
    in_stack_00000038 = unaff_x21;
    if (unaff_x26 == 2) {
      plVar7 = unaff_x28;
    }
    else {
      if ((unaff_x26 & 1) != 0) break;
      unaff_x22 = unaff_x23;
      if ((in_x11 & 1) == 0) {
code_r0x005a0fe4:
        plVar7 = unaff_x28;
      }
      else {
LAB_005a0fc4:
        unaff_x23 = (long *)0x0;
        plVar7 = unaff_x28;
        if (unaff_x22 != (long *)0x0) {
          plVar2 = param_1;
          goto LAB_005a1094;
        }
      }
    }
    unaff_x28 = plVar7;
    plVar2 = param_1;
    if ((unaff_x25 == (long *)0x0) || (unaff_x25 == in_stack_00000020)) {
      if (in_x12 != 2) {
        if ((in_x12 & 1) != 0) {
          unaff_x28 = (long *)0x0;
          if (plVar7 != (long *)0x0) {
            unaff_x26 = 2;
            unaff_x22 = plVar7;
            goto LAB_005a1094;
          }
          in_x12 = 0;
        }
        if ((in_stack_00000018._4_1_ & param_1 != (long *)0x0) == 1) {
          unaff_x26 = 2;
          plVar2 = (long *)0x0;
          unaff_x22 = param_1;
          goto LAB_005a1094;
        }
      }
      in_stack_00000008[1] = in_stack_00000030;
      *in_stack_00000008 = uStack0000000000000028;
      in_stack_00000008[2] = in_stack_00000038;
      return;
    }
    lVar5 = *unaff_x25;
    unaff_x22 = unaff_x25;
    unaff_x23 = unaff_x25 + 8;
    if (lVar5 == 0xc) {
      unaff_x23 = (long *)0x0;
      unaff_x22 = unaff_x25 + 8;
    }
    unaff_x25 = unaff_x25 + 0x10;
    in_x11 = 1;
    plVar6 = (long *)0x0;
    unaff_x26 = (ulong)(lVar5 != 0xc);
  } while( true );
  unaff_x20 = (long *)0x0;
  unaff_x22 = plVar6;
  goto code_r0x005a0fa4;
}

