
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_0018ab18(void)

{
  code *pcVar1;
  undefined8 *puVar2;
  undefined8 unaff_x19;
  long *unaff_x20;
  long unaff_x22;
  long unaff_x23;
  long unaff_x27;
  long unaff_x29;
  long lVar3;
  undefined8 uVar4;
  long lVar5;
  long lVar6;
  undefined1 auVar7 [16];
  undefined8 in_stack_00000000;
  ulong in_stack_00000008;
  undefined8 in_stack_00000020;
  undefined8 in_stack_00000028;
  undefined8 in_stack_00000030;
  undefined8 uStack0000000000000040;
  undefined *in_stack_00000048;
  undefined8 uStack0000000000000050;
  undefined8 in_stack_00000058;
  undefined *in_stack_00000060;
  undefined8 in_stack_00000068;
  undefined8 in_stack_00000070;
  undefined1 uStack0000000000000078;
  undefined1 uStack0000000000000080;
  undefined8 uStack0000000000000090;
  undefined8 in_stack_00000098;
  undefined8 *in_stack_000000a0;
  undefined8 in_stack_000000a8;
  undefined8 in_stack_000000b0;
  
  puVar2 = (undefined8 *)func_0x00187bd0();
  if (puVar2 == (undefined8 *)0x0) {
    func_0x007a1f18(8,0x18);
                    /* WARNING: Does not return */
    pcVar1 = (code *)SoftwareBreakpoint(1,0x18acb8);
    (*pcVar1)();
  }
  uVar4 = *(undefined8 *)(unaff_x29 + -0x98);
  puVar2[1] = *(undefined8 *)(unaff_x29 + -0x90);
  *puVar2 = uVar4;
  puVar2[2] = *(undefined8 *)(unaff_x29 + -0x88);
  auVar7 = func_0x00188630(puVar2,&UNK_009c03c0);
  func_0x0019e6a4(&uStack0000000000000080);
  func_0x001992fc(&uStack0000000000000078);
  lVar3 = unaff_x22 + 1;
  while (lVar3 = lVar3 + -1, lVar3 != 0) {
    func_0x00194828();
  }
  if (unaff_x23 != 0) {
    func_0x00187bd4();
  }
  if (unaff_x27 + -0x17 == unaff_x27) {
    *unaff_x20 = unaff_x27;
  }
  else {
    *(long *)(unaff_x29 + -0x98) = unaff_x27 + -0x17;
    *(undefined1 (*) [16])(unaff_x29 + -0x90) = auVar7;
    *(undefined8 *)(unaff_x29 + -0x80) = unaff_x19;
    *(undefined8 *)(unaff_x29 + -0x70) = in_stack_00000028;
    *(undefined8 *)(unaff_x29 + -0x78) = in_stack_00000020;
    *(undefined8 *)(unaff_x29 + -0x68) = in_stack_00000030;
    if (___ZN3log20MAX_LOG_LEVEL_FILTER17heb0eaa79d3ac986dE != 0) {
      uStack0000000000000040 = unaff_x29 + -0x98;
      in_stack_00000048 =
           &
           __ZN59__LT_rustls__error__Error_u20_as_u20_core__fmt__Display_GT_3fmt17h27743a4cbed75577E
      ;
      uStack0000000000000090 = &UNK_009c05a8;
      in_stack_00000098 = 1;
      in_stack_000000a8 = 1;
      in_stack_000000b0 = 0;
      in_stack_000000a0 = &uStack0000000000000040;
      in_stack_00000070 = func_0x001a03c4(&UNK_009c05b8);
      uStack0000000000000050 = &UNK_00819a5e;
      in_stack_00000058 = 0x2d;
      in_stack_00000060 = &UNK_00819a5e;
      in_stack_00000068 = 0x2d;
      func_0x001a0298(&uStack0000000000000090,1,&uStack0000000000000050,0);
    }
    lVar3 = *(long *)(unaff_x29 + -0x98);
    lVar6 = *(long *)(unaff_x29 + -0x80);
    lVar5 = *(long *)(unaff_x29 + -0x88);
    unaff_x20[1] = *(long *)(unaff_x29 + -0x90);
    *unaff_x20 = lVar3;
    unaff_x20[3] = lVar6;
    unaff_x20[2] = lVar5;
    lVar3 = *(long *)(unaff_x29 + -0x78);
    unaff_x20[5] = *(long *)(unaff_x29 + -0x70);
    unaff_x20[4] = lVar3;
    unaff_x20[6] = *(long *)(unaff_x29 + -0x68);
  }
  if ((in_stack_00000008 | 0x8000000000000000) != 0x8000000000000000) {
    func_0x00187bd4(in_stack_00000000,in_stack_00000008,1);
  }
  return;
}

