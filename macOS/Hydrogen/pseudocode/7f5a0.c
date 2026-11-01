
/* WARNING: Removing unreachable block (ram,0x0007fa54) */

undefined8 FUN_0007f5a0(void)

{
  uint uVar1;
  long lVar2;
  code *pcVar3;
  int iVar4;
  undefined4 uVar5;
  ulong uVar6;
  undefined8 *puVar7;
  long lVar8;
  long unaff_x19;
  undefined8 uVar9;
  long unaff_x20;
  undefined8 *unaff_x22;
  undefined1 unaff_w24;
  long unaff_x28;
  long unaff_x29;
  undefined8 in_stack_00000000;
  long in_stack_00000010;
  undefined8 uStack0000000000000018;
  undefined8 in_stack_00000028;
  undefined8 uStack0000000000000030;
  undefined8 in_stack_00000038;
  undefined8 in_stack_00000040;
  undefined8 uStack0000000000000050;
  undefined4 in_stack_00000058;
  undefined1 uStack0000000000000060;
  undefined8 in_stack_00000070;
  undefined8 uStack0000000000000078;
  undefined8 in_stack_00000088;
  
  while( true ) {
    uVar6 = func_0x000824e0();
    while( true ) {
      if ((uVar6 & 1) == 0) goto LAB_0007fa3c;
      lVar8 = *(long *)(unaff_x29 + -0x68);
      lVar2 = lVar8 + -1;
      *(long *)(unaff_x29 + -0x68) = lVar2;
      if (lVar2 == 0) {
        uVar9 = 1;
        goto code_r0x0007f7a0;
      }
      uVar6 = lVar8 - 2;
      if ((*(ulong *)(*(long *)(unaff_x29 + -0x70) + (uVar6 >> 3 & 0x1ffffffffffffff8)) >>
           (uVar6 & 0x3f) & 1) != 0) break;
      iVar4 = func_0x0007d25c();
      *(int *)(unaff_x20 + 0x20) = iVar4;
      if (iVar4 == 0xd) {
        iVar4 = func_0x0007d25c();
        *(int *)(unaff_x20 + 0x20) = iVar4;
        if (iVar4 != 4) {
          func_0x000801a4(&uStack0000000000000078);
          in_stack_00000038 = *(undefined8 *)(unaff_x20 + 0x50);
          uStack0000000000000030 = *(undefined8 *)(unaff_x20 + 0x48);
          in_stack_00000040 = *(undefined8 *)(unaff_x20 + 0x58);
          func_0x0000a968();
          func_0x000804dc(&uStack0000000000000018);
          func_0x00080294(&uStack0000000000000050,0x65,&uStack0000000000000030,
                          &uStack0000000000000018,0);
          uVar9 = func_0x00080150();
          goto code_r0x0007fc5c;
        }
        if ((*(int *)(unaff_x20 + 0xb0) != 0x2e) && (*(long *)(unaff_x20 + 0xb8) != -1)) {
          if (*(char *)(unaff_x20 + 0x8f) < '\0') {
            unaff_x22 = (undefined8 *)*unaff_x22;
          }
          *(undefined1 *)((long)unaff_x22 + *(long *)(unaff_x20 + 0xb8)) = unaff_w24;
        }
        iVar4 = func_0x00081f40();
        if (iVar4 == 0) goto LAB_0007fa3c;
        iVar4 = func_0x0007d25c();
        *(int *)(unaff_x20 + 0x20) = iVar4;
        if (iVar4 == 0xc) {
          uVar5 = func_0x0007d25c();
          *(undefined4 *)(unaff_x20 + 0x20) = uVar5;
          goto code_r0x0007f3c4;
        }
        func_0x000801a4(&uStack0000000000000078);
        in_stack_00000038 = *(undefined8 *)(unaff_x20 + 0x50);
        uStack0000000000000030 = *(undefined8 *)(unaff_x20 + 0x48);
        in_stack_00000040 = *(undefined8 *)(unaff_x20 + 0x58);
        func_0x0000a968();
        func_0x000804dc(&uStack0000000000000018);
        func_0x00080294(&uStack0000000000000050,0x65,&uStack0000000000000030,&uStack0000000000000018
                        ,0);
        uVar9 = func_0x00080150();
        goto code_r0x0007fc5c;
      }
      if (iVar4 != 0xb) {
        func_0x000801a4(&uStack0000000000000078);
        in_stack_00000038 = *(undefined8 *)(unaff_x20 + 0x50);
        uStack0000000000000030 = *(undefined8 *)(unaff_x20 + 0x48);
        in_stack_00000040 = *(undefined8 *)(unaff_x20 + 0x58);
        func_0x0000a968();
        func_0x000804dc(&uStack0000000000000018);
        func_0x00080294(&uStack0000000000000050,0x65,&uStack0000000000000030,&uStack0000000000000018
                        ,0);
        uVar9 = func_0x00080150();
        goto code_r0x0007fc5c;
      }
      uVar6 = func_0x00081cb4();
    }
    iVar4 = func_0x0007d25c();
    *(int *)(unaff_x20 + 0x20) = iVar4;
    if (iVar4 == 0xd) break;
    if (iVar4 != 10) {
      func_0x000801a4(&uStack0000000000000078);
      in_stack_00000038 = *(undefined8 *)(unaff_x20 + 0x50);
      uStack0000000000000030 = *(undefined8 *)(unaff_x20 + 0x48);
      in_stack_00000040 = *(undefined8 *)(unaff_x20 + 0x58);
      func_0x0000a968();
      func_0x000804dc(&uStack0000000000000018);
      func_0x00080294(&uStack0000000000000050,0x65,&uStack0000000000000030,&uStack0000000000000018,0
                     );
      uVar9 = func_0x00080150();
code_r0x0007fc5c:
      uStack0000000000000050 = &UNK_009b9460;
      __ZNSt13runtime_errorD1Ev(&uStack0000000000000060);
      __ZNSt9exceptionD2Ev(&uStack0000000000000050);
      if (in_stack_00000028._7_1_ < '\0') {
        __ZdlPv(uStack0000000000000018);
      }
      if (in_stack_00000010 < 0) {
        __ZdlPv(in_stack_00000000);
      }
      if (in_stack_00000088._7_1_ < '\0') {
        __ZdlPv(uStack0000000000000078);
      }
code_r0x0007f7a0:
      if (*(long *)(unaff_x29 + -0x70) != 0) {
        __ZdlPv();
      }
      return uVar9;
    }
  }
  uVar5 = func_0x0007d25c();
  *(undefined4 *)(unaff_x20 + 0x20) = uVar5;
code_r0x0007f3c4:
  uVar1 = *(int *)(unaff_x20 + 0x20) - 1;
  if (uVar1 < 0xf) {
                    /* WARNING: Could not recover jumptable at 0x0007f3e0. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    uVar9 = (*(code *)(&UNK_0007f3e4 + (ulong)*(ushort *)(unaff_x28 + (ulong)uVar1 * 2) * 4))();
    return uVar9;
  }
  func_0x000801a4(&uStack0000000000000078);
  in_stack_00000038 = *(undefined8 *)(unaff_x20 + 0x50);
  uStack0000000000000030 = *(undefined8 *)(unaff_x20 + 0x48);
  in_stack_00000040 = *(undefined8 *)(unaff_x20 + 0x58);
  func_0x000804dc(&uStack0000000000000018);
  func_0x00080294(&uStack0000000000000050,0x65,&uStack0000000000000030,&uStack0000000000000018,0);
  *(undefined1 *)(unaff_x19 + 0x58) = 1;
  if (*(char *)(unaff_x19 + 0x80) != '\0') {
    puVar7 = (undefined8 *)___cxa_allocate_exception(0x28);
    *puVar7 = &UNK_009b9460;
    *(undefined4 *)(puVar7 + 1) = in_stack_00000058;
    __ZNSt13runtime_errorC1ERKS_(puVar7 + 2,&uStack0000000000000060);
    *puVar7 = &UNK_009b95c8;
    puVar7[4] = in_stack_00000070;
    ___cxa_throw(puVar7,&UNK_009b95a0,&DAT_0008084c);
                    /* WARNING: Does not return */
    pcVar3 = (code *)SoftwareBreakpoint(1,0x7ff54);
    (*pcVar3)();
  }
  uStack0000000000000050 = &UNK_009b9460;
  __ZNSt13runtime_errorD1Ev(&uStack0000000000000060);
  __ZNSt9exceptionD2Ev(&uStack0000000000000050);
  if (in_stack_00000028._7_1_ < '\0') {
    __ZdlPv(uStack0000000000000018);
  }
  if (in_stack_00000088._7_1_ < '\0') {
    __ZdlPv(uStack0000000000000078);
  }
LAB_0007fa3c:
  uVar9 = 0;
  goto code_r0x0007f7a0;
}

