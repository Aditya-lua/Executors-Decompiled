
long * FUN_00520730(long param_1)

{
  undefined8 uVar1;
  long lVar2;
  int iVar3;
  long *plVar4;
  long in_x9;
  long lVar5;
  long *in_x10;
  undefined8 *unaff_x19;
  long lVar6;
  long lVar7;
  undefined8 *puVar8;
  undefined8 *unaff_x23;
  undefined8 *unaff_x24;
  long *plVar9;
  long *unaff_x26;
  long unaff_x27;
  long *unaff_x28;
  long lStack0000000000000000;
  long *plStack0000000000000008;
  long *plStack0000000000000010;
  long *in_stack_00000018;
  long *in_stack_00000020;
  long in_stack_00000028;
  
  plStack0000000000000010 = unaff_x26;
code_r0x00520730:
  if (param_1 == 0) {
    if (in_x10[2] == 0) {
      *unaff_x19 = unaff_x23;
      plVar4 = unaff_x28 + 4;
code_r0x005208ac:
      *plStack0000000000000010 = (long)plVar4;
      return unaff_x28 + 2;
    }
    lVar5 = in_x10[1];
    lStack0000000000000000 = in_x10[2] << 4;
    do {
      plStack0000000000000008 = unaff_x28 + 4;
      lVar2 = unaff_x28[2];
      lVar6 = unaff_x28[3];
      lVar7 = lStack0000000000000000;
      plVar4 = (long *)(lVar5 + 8);
      while ((*plVar4 != lVar6 || (iVar3 = _memcmp(plVar4[-1],lVar2,lVar6), iVar3 != 0))) {
        plVar4 = plVar4 + 2;
        lVar7 = lVar7 + -0x10;
        if (lVar7 == 0) {
          plVar4 = plStack0000000000000008;
          goto code_r0x00520860;
        }
      }
      unaff_x28 = plStack0000000000000008;
    } while (plStack0000000000000008 != in_stack_00000018);
  }
  else {
    plStack0000000000000008 = (long *)(*(long *)(in_x9 + 8) + 8);
    lStack0000000000000000 = param_1 << 4;
    do {
      plVar4 = unaff_x28 + 4;
      lVar5 = unaff_x28[2];
      lVar2 = unaff_x28[3];
      lVar6 = lStack0000000000000000;
      plVar9 = plStack0000000000000008;
      do {
        if ((*plVar9 == lVar2) && (iVar3 = _memcmp(plVar9[-1],lVar5,lVar2), iVar3 == 0))
        goto LAB_005207d0;
        plVar9 = plVar9 + 2;
        lVar6 = lVar6 + -0x10;
      } while (lVar6 != 0);
      if (in_stack_00000020[2] == 0) {
        *unaff_x19 = unaff_x23;
        goto code_r0x005208ac;
      }
      plVar9 = (long *)(in_stack_00000020[1] + 8);
      lVar6 = in_stack_00000020[2] << 4;
      while ((*plVar9 != lVar2 || (iVar3 = _memcmp(plVar9[-1],lVar5,lVar2), iVar3 != 0))) {
        plVar9 = plVar9 + 2;
        lVar6 = lVar6 + -0x10;
        if (lVar6 == 0) {
code_r0x00520860:
          *unaff_x19 = unaff_x23;
          *plStack0000000000000010 = (long)plVar4;
          return unaff_x28 + 2;
        }
      }
LAB_005207d0:
      unaff_x28 = plVar4;
    } while (plVar4 != in_stack_00000018);
  }
  *plStack0000000000000010 = (long)in_stack_00000018;
  puVar8 = unaff_x23;
  do {
    if (puVar8 == unaff_x24) {
      *unaff_x19 = puVar8;
      return (long *)0x0;
    }
    unaff_x23 = puVar8 + 2;
    uVar1 = *puVar8;
    lVar2 = puVar8[1];
    lVar6 = unaff_x27;
    lVar5 = in_stack_00000028;
    do {
      puVar8 = unaff_x23;
      if ((*(long *)(lVar5 + 0x220) == lVar2) &&
         (iVar3 = _memcmp(*(undefined8 *)(lVar5 + 0x218),uVar1,lVar2), iVar3 == 0)) {
        unaff_x28 = *(long **)(lVar5 + 0xb8);
        lVar5 = *(long *)(lVar5 + 0xc0);
        in_stack_00000018 = unaff_x28 + lVar5 * 4;
        *plStack0000000000000010 = (long)unaff_x28;
        plStack0000000000000010[1] = (long)in_stack_00000018;
        if (lVar5 != 0) {
          in_x9 = *in_stack_00000020;
          param_1 = *(long *)(in_x9 + 0x10);
          in_x10 = in_stack_00000020;
          goto code_r0x00520730;
        }
        break;
      }
      lVar5 = lVar5 + 600;
      lVar6 = lVar6 + -600;
    } while (lVar6 != 0);
  } while( true );
}

