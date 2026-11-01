
void FUN_001f0068(void)

{
  code *pcVar1;
  ulong uVar2;
  long lVar3;
  undefined8 *unaff_x19;
  undefined8 *puVar4;
  long unaff_x21;
  undefined8 uVar5;
  long unaff_x22;
  uint unaff_w23;
  long *plVar6;
  long unaff_x25;
  long unaff_x26;
  ulong *unaff_x28;
  uint uStack0000000000000014;
  undefined8 uStack0000000000000018;
  undefined8 in_stack_00000020;
  undefined8 uStack0000000000000028;
  undefined8 *in_stack_00000030;
  undefined *in_stack_00000038;
  undefined8 uStack0000000000000040;
  
  if (*(char *)(unaff_x19 + 1) != '\0') {
    func_0x007a2810(&UNK_00820225,0x2b,&uStack0000000000000040,&UNK_009c4350,&UNK_009c45d0);
                    /* WARNING: Does not return */
    pcVar1 = (code *)SoftwareBreakpoint(1,0x1f00a0);
    (*pcVar1)();
  }
  if (*(int *)(unaff_x19 + 5) != -1) {
    plVar6 = unaff_x19 + 2;
    unaff_x19[4] = 0;
    in_stack_00000030 = &uStack0000000000000018;
    in_stack_00000038 = &DAT_00241554;
    uStack0000000000000040 = &UNK_009c4590;
    uStack0000000000000014 = unaff_w23;
    uVar2 = func_0x0022fc74(plVar6,&uStack0000000000000040);
    if (uVar2 == 0) {
      if (unaff_x25 != 0) {
        do {
          in_stack_00000038 = &DAT_0024156c;
          uStack0000000000000040 = &UNK_007fc120;
          uStack0000000000000028 = unaff_x26;
          in_stack_00000030 = &uStack0000000000000028;
          uVar2 = func_0x0022fc74(plVar6,&uStack0000000000000040);
          if (uVar2 != 0) goto code_r0x001efe90;
          unaff_x26 = unaff_x26 + 1;
          unaff_x25 = unaff_x25 + -1;
        } while (unaff_x25 != 0);
      }
      lVar3 = unaff_x19[4];
      if (unaff_x19[2] == lVar3) {
        func_0x0079b61c(plVar6,lVar3,1,1,1);
        lVar3 = unaff_x19[4];
        *(undefined1 *)(unaff_x19[3] + lVar3) = 0x20;
        lVar3 = lVar3 + 1;
        unaff_x19[4] = lVar3;
      }
      else {
        *(undefined1 *)(unaff_x19[3] + lVar3) = 0x20;
        lVar3 = lVar3 + 1;
        unaff_x19[4] = lVar3;
      }
      if (unaff_x21 != 0) {
        do {
          in_stack_00000038 = &DAT_0024156c;
          uStack0000000000000040 = &UNK_007fc120;
          uStack0000000000000028 = unaff_x22;
          in_stack_00000030 = &uStack0000000000000028;
          uVar2 = func_0x0022fc74(plVar6,&uStack0000000000000040);
          if (uVar2 != 0) goto code_r0x001efe90;
          unaff_x22 = unaff_x22 + 1;
          unaff_x21 = unaff_x21 + -1;
        } while (unaff_x21 != 0);
        lVar3 = unaff_x19[4];
      }
      if (*plVar6 == lVar3) {
        func_0x0079b61c(plVar6,lVar3,1,1,1);
        lVar3 = unaff_x19[4];
      }
      unaff_x28 = (ulong *)&__ZN3std9panicking11panic_count18GLOBAL_PANIC_COUNT17h44f8b48277a7bf95E;
      *(undefined1 *)(unaff_x19[3] + lVar3) = 10;
      unaff_x19[4] = lVar3 + 1;
      uVar2 = func_0x00207e08(unaff_x19 + 5,unaff_x19[3]);
      unaff_w23 = uStack0000000000000014;
      if (uVar2 == 0) goto code_r0x001f0008;
    }
    else {
code_r0x001efe90:
      unaff_w23 = uStack0000000000000014;
    }
    unaff_x28 = (ulong *)&__ZN3std9panicking11panic_count18GLOBAL_PANIC_COUNT17h44f8b48277a7bf95E;
    if ((uVar2 & 3) == 1) {
      uVar5 = *(undefined8 *)(uVar2 - 1);
      puVar4 = *(undefined8 **)(uVar2 + 7);
      if ((code *)*puVar4 != (code *)0x0) {
        (*(code *)*puVar4)(uVar5);
      }
      if (puVar4[1] != 0) {
        func_0x00187bd4(uVar5,puVar4[1],puVar4[2]);
      }
      func_0x00187bd4((undefined8 *)(uVar2 - 1),0x18,8);
    }
  }
code_r0x001f0008:
  if ((((unaff_w23 & 1) == 0) && ((*unaff_x28 & 0x7fffffffffffffff) != 0)) &&
     (uVar2 = func_0x007a1140(), (uVar2 & 1) == 0)) {
    *(undefined1 *)(unaff_x19 + 1) = 1;
  }
  func_0x00430048(*unaff_x19);
  return;
}

