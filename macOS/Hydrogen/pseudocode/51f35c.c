
void FUN_0051f35c(long *param_1,long param_2)

{
  undefined8 *puVar1;
  long lVar2;
  code *pcVar3;
  int iVar4;
  long unaff_x19;
  long unaff_x20;
  long *plVar6;
  long *plVar5;
  long unaff_x21;
  long lVar7;
  long unaff_x24;
  long unaff_x26;
  long lVar8;
  long *in_stack_00000000;
  long in_stack_00000008;
  long in_stack_00000010;
  long in_stack_00000018;
  undefined8 uStack0000000000000028;
  long *in_stack_00000030;
  long in_stack_00000038;
  
code_r0x0051f35c:
  func_0x00187bd4(param_1,param_2,8);
LAB_0051f26c:
  *(long *)(in_stack_00000010 + unaff_x24 * 8) = unaff_x20;
  unaff_x24 = unaff_x24 + 1;
  unaff_x26 = unaff_x26 + 1;
  if (unaff_x26 == in_stack_00000008) {
    *in_stack_00000000 = unaff_x24;
    return;
  }
  unaff_x20 = *(long *)(unaff_x19 + 0x88);
  lVar8 = *(long *)(unaff_x19 + 0x90);
  func_0x004ffcac(&uStack0000000000000028);
  lVar2 = in_stack_00000038;
  param_1 = in_stack_00000030;
  puVar1 = (undefined8 *)(unaff_x21 + unaff_x26 * 0x10);
  if (lVar8 != 0) {
    lVar7 = puVar1[1];
    lVar8 = lVar8 * 600;
    do {
      if ((*(long *)(unaff_x20 + 0x220) == lVar7) &&
         (iVar4 = _memcmp(*(undefined8 *)(unaff_x20 + 0x218),*puVar1,lVar7), iVar4 == 0))
      goto code_r0x0051f348;
      unaff_x20 = unaff_x20 + 600;
      lVar8 = lVar8 + -600;
    } while (lVar8 != 0);
  }
  if (lVar2 != 0) {
    plVar5 = param_1;
    do {
      plVar6 = plVar5 + 1;
      lVar8 = *(long *)(*plVar5 + 0x90);
      if (lVar8 != 0) {
        unaff_x20 = *(long *)(*plVar5 + 0x88);
        lVar7 = puVar1[1];
        lVar8 = lVar8 * 600;
        do {
          if ((*(long *)(unaff_x20 + 0x220) == lVar7) &&
             (iVar4 = _memcmp(*(undefined8 *)(unaff_x20 + 0x218),*puVar1,lVar7), iVar4 == 0))
          goto code_r0x0051f348;
          unaff_x20 = unaff_x20 + 600;
          lVar8 = lVar8 + -600;
        } while (lVar8 != 0);
      }
      plVar5 = plVar6;
    } while (plVar6 != param_1 + lVar2);
  }
  func_0x007a23d8(&UNK_008a76bd,0x58,&UNK_009ea3e8);
                    /* WARNING: Does not return */
  pcVar3 = (code *)SoftwareBreakpoint(1,0x51f3ac);
  (*pcVar3)();
code_r0x0051f348:
  unaff_x21 = in_stack_00000018;
  if (uStack0000000000000028 != 0) goto code_r0x0051f354;
  goto LAB_0051f26c;
code_r0x0051f354:
  param_2 = uStack0000000000000028 << 3;
  goto code_r0x0051f35c;
}

