
void FUN_0023caec(long param_1)

{
  undefined8 *puVar1;
  code *pcVar2;
  long lVar3;
  long *plVar4;
  undefined8 unaff_x21;
  long unaff_x22;
  long unaff_x23;
  long unaff_x24;
  long unaff_x25;
  long lVar5;
  undefined8 uVar6;
  undefined8 uStack0000000000000008;
  undefined8 *in_stack_00000010;
  undefined8 in_stack_00000018;
  undefined8 in_stack_00000020;
  undefined8 in_stack_00000028;
  undefined8 in_stack_00000030;
  undefined8 in_stack_00000038;
  undefined8 uStack0000000000000040;
  long in_stack_00000048;
  long in_stack_00000050;
  long in_stack_00000058;
  undefined8 in_stack_00000070;
  undefined8 in_stack_00000078;
  undefined8 in_stack_00000080;
  undefined8 uStack0000000000000090;
  undefined8 in_stack_00000098;
  undefined8 in_stack_000000a0;
  undefined8 in_stack_000000a8;
  long in_stack_000000b0;
  long in_stack_000000b8;
  long in_stack_000000c0;
  undefined1 in_stack_00000128;
  undefined8 in_stack_00000130;
  undefined8 in_stack_00000138;
  
  uStack0000000000000008 = 1;
  plVar4 = (long *)(param_1 + 0x10);
  do {
    if (unaff_x22 == 0) break;
    lVar5 = *(long *)(unaff_x24 + 0x10);
    if (lVar5 < 0) {
      uStack0000000000000008 = 0;
LAB_0023cc3c:
      func_0x007a1f00(uStack0000000000000008,lVar5,&UNK_009c24c0);
                    /* WARNING: Does not return */
      pcVar2 = (code *)SoftwareBreakpoint(1,0x23cc8c);
      (*pcVar2)();
    }
    uVar6 = *(undefined8 *)(unaff_x24 + 8);
    if (lVar5 == 0) {
      lVar3 = 1;
    }
    else {
      lVar3 = func_0x00187bd0(lVar5,1);
      if (lVar3 == 0) goto LAB_0023cc3c;
    }
    _memcpy(lVar3,uVar6,lVar5);
    unaff_x25 = unaff_x25 + 1;
    unaff_x24 = unaff_x24 + 0x18;
    plVar4[-2] = lVar5;
    plVar4[-1] = lVar3;
    *plVar4 = lVar5;
    unaff_x22 = unaff_x22 + -0x18;
    plVar4 = plVar4 + 3;
  } while (unaff_x23 != unaff_x25);
  lVar5 = in_stack_00000050;
  in_stack_00000080 = in_stack_00000138;
  in_stack_00000078 = in_stack_00000130;
  in_stack_00000070 = 0x8000000000000002;
  if (in_stack_00000050 == uStack0000000000000040) {
    func_0x001d8840(&uStack0000000000000040,&UNK_009c96f8);
  }
  puVar1 = (undefined8 *)(in_stack_00000048 + lVar5 * 0x20);
  puVar1[1] = in_stack_00000078;
  *puVar1 = in_stack_00000070;
  puVar1[3] = unaff_x21;
  puVar1[2] = in_stack_00000080;
  in_stack_00000050 = lVar5 + 1;
  in_stack_000000a0 = in_stack_00000030;
  in_stack_00000098 = in_stack_00000028;
  in_stack_000000b0 = uStack0000000000000040;
  in_stack_000000a8 = in_stack_00000038;
  in_stack_000000b8 = in_stack_00000048;
  in_stack_00000128 = 10;
  uStack0000000000000090 = 0x8000000000000009;
  in_stack_000000c0 = in_stack_00000050;
  func_0x0024a370(in_stack_00000018,&uStack0000000000000090);
  *(undefined1 *)(in_stack_00000010 + 1) = 1;
  *in_stack_00000010 = 0x8000000000000027;
  if (in_stack_00000058 != 0) {
    func_0x00187bd4(in_stack_00000020,in_stack_00000058 << 2,2);
  }
  return;
}

