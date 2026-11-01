
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_0018a910(void)

{
  code *pcVar1;
  int iVar2;
  long lVar3;
  undefined8 *puVar4;
  long unaff_x19;
  undefined8 *unaff_x20;
  long unaff_x22;
  long unaff_x23;
  undefined8 *unaff_x24;
  undefined8 *unaff_x25;
  undefined *unaff_x27;
  undefined *puVar5;
  long unaff_x29;
  undefined8 uVar6;
  undefined8 uVar7;
  undefined8 uVar8;
  undefined1 auVar9 [16];
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
  undefined8 uStack0000000000000078;
  undefined8 uStack0000000000000080;
  undefined8 uStack0000000000000088;
  undefined8 uStack0000000000000090;
  undefined8 *in_stack_00000098;
  undefined8 *in_stack_000000a0;
  long in_stack_000000a8;
  undefined8 in_stack_000000b0;
  undefined8 in_stack_000000b8;
  undefined8 in_stack_000000c0;
  
  lVar3 = _CFDateCreate();
  if (lVar3 == 0) {
    func_0x007a11c0(&UNK_0081993a,0x22,&UNK_009c0480);
code_r0x0018acb4:
                    /* WARNING: Does not return */
    pcVar1 = (code *)SoftwareBreakpoint(1,0x18acb8);
    (*pcVar1)();
  }
  uStack0000000000000080 = lVar3;
  iVar2 = _SecTrustSetVerifyDate(uStack0000000000000078,lVar3);
  if (iVar2 == 0) {
    if ((unaff_x24 != (undefined8 *)0x0) &&
       (iVar2 = func_0x001894c8(&uStack0000000000000078), iVar2 != 0)) {
      uStack0000000000000090 = (undefined *)CONCAT44(uStack0000000000000090._4_4_,iVar2);
      func_0x0079a3d8(unaff_x29 + -0x98,&uStack0000000000000090);
      puVar4 = (undefined8 *)func_0x00187bd0(0x18,8);
      if (puVar4 == (undefined8 *)0x0) {
        func_0x007a1f18(8,0x18);
        goto code_r0x0018acb4;
      }
      uVar6 = *(undefined8 *)(unaff_x29 + -0x98);
      puVar4[1] = *(undefined8 *)(unaff_x29 + -0x90);
      *puVar4 = uVar6;
      puVar4[2] = *(undefined8 *)(unaff_x29 + -0x88);
      auVar9 = func_0x00188630(puVar4,&UNK_009c03c0);
      goto code_r0x0018a974;
    }
    if (*(long *)(unaff_x19 + 0x10) == 0) {
code_r0x0018abc4:
      auVar9 = func_0x001990d8(&uStack0000000000000078);
      if ((auVar9._0_8_ & 1) != 0) {
        uStack0000000000000088 = auVar9._8_8_;
        uStack0000000000000040 = func_0x0019e38c(&uStack0000000000000088);
        if ((uStack0000000000000040 == (int)uStack0000000000000040) &&
           (func_0x0018a5d4(unaff_x29 + -0x98), *(undefined **)(unaff_x29 + -0x98) != unaff_x27)) {
          in_stack_00000098 = *(undefined8 **)(unaff_x29 + -0x90);
          uStack0000000000000090 = *(undefined **)(unaff_x29 + -0x98);
          in_stack_000000a8 = *(long *)(unaff_x29 + -0x80);
          in_stack_000000a0 = *(undefined8 **)(unaff_x29 + -0x88);
          in_stack_000000b8 = *(undefined8 *)(unaff_x29 + -0x70);
          in_stack_000000b0 = *(undefined8 *)(unaff_x29 + -0x78);
          in_stack_000000c0 = *(undefined8 *)(unaff_x29 + -0x68);
        }
        else {
          func_0x0018a6c8(&uStack0000000000000090,&uStack0000000000000088,&uStack0000000000000040);
        }
        unaff_x19 = in_stack_000000a8;
        unaff_x24 = in_stack_000000a0;
        unaff_x25 = in_stack_00000098;
        puVar5 = uStack0000000000000090;
        in_stack_00000028 = in_stack_000000b8;
        in_stack_00000020 = in_stack_000000b0;
        in_stack_00000030 = in_stack_000000c0;
        func_0x0019e6a4(&uStack0000000000000088);
        func_0x0019e6a4(&uStack0000000000000080);
        func_0x001992fc(&uStack0000000000000078);
        func_0x0018a2dc(&uStack0000000000000050);
        goto LAB_0018a9c4;
      }
      puVar5 = (undefined *)0x8000000000000027;
    }
    else {
      unaff_x24 = (undefined8 *)
                  func_0x00198f54(&uStack0000000000000078,*(undefined8 *)(unaff_x19 + 8));
      if ((int)unaff_x24 == 0) {
        puVar4 = (undefined8 *)_SecTrustSetAnchorCertificatesOnly(uStack0000000000000078,0);
        if ((int)puVar4 == 0) goto code_r0x0018abc4;
        unaff_x25 = (undefined8 *)func_0x0018a59c();
      }
      else {
        unaff_x25 = (undefined8 *)func_0x00187bd0(0x18,8);
        puVar4 = unaff_x24;
        if (unaff_x25 == (undefined8 *)0x0) {
          func_0x007a1f18(8,0x18);
          goto code_r0x0018acb4;
        }
      }
      unaff_x25[1] = 1;
      *unaff_x25 = 1;
      *(int *)(unaff_x25 + 2) = (int)puVar4;
      puVar5 = unaff_x27 + -1;
      unaff_x24 = (undefined8 *)&UNK_009c04b8;
    }
  }
  else {
    uStack0000000000000090 = (undefined *)CONCAT44(uStack0000000000000090._4_4_,iVar2);
    func_0x0079a3d8(unaff_x29 + -0x98,&uStack0000000000000090);
    puVar4 = (undefined8 *)func_0x00187bd0(0x18,8);
    if (puVar4 == (undefined8 *)0x0) {
      func_0x007a1f18(8,0x18);
      goto code_r0x0018acb4;
    }
    uVar6 = *(undefined8 *)(unaff_x29 + -0x98);
    puVar4[1] = *(undefined8 *)(unaff_x29 + -0x90);
    *puVar4 = uVar6;
    puVar4[2] = *(undefined8 *)(unaff_x29 + -0x88);
    auVar9 = func_0x00188630(puVar4,&UNK_009c03c0);
code_r0x0018a974:
    unaff_x24 = auVar9._8_8_;
    unaff_x25 = auVar9._0_8_;
    puVar5 = unaff_x27 + -0x17;
  }
  func_0x0019e6a4(&uStack0000000000000080);
  func_0x001992fc(&uStack0000000000000078);
  lVar3 = unaff_x22 + 1;
  while (lVar3 = lVar3 + -1, lVar3 != 0) {
    func_0x00194828();
  }
  if (unaff_x23 != 0) {
    func_0x00187bd4();
  }
LAB_0018a9c4:
  if (puVar5 == unaff_x27) {
    *unaff_x20 = unaff_x27;
  }
  else {
    *(undefined **)(unaff_x29 + -0x98) = puVar5;
    *(undefined8 **)(unaff_x29 + -0x90) = unaff_x25;
    *(undefined8 **)(unaff_x29 + -0x88) = unaff_x24;
    *(long *)(unaff_x29 + -0x80) = unaff_x19;
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
      in_stack_00000098 = (undefined8 *)((long)&MACH_HEADER.magic + 1);
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
    uVar6 = *(undefined8 *)(unaff_x29 + -0x98);
    uVar8 = *(undefined8 *)(unaff_x29 + -0x80);
    uVar7 = *(undefined8 *)(unaff_x29 + -0x88);
    unaff_x20[1] = *(undefined8 *)(unaff_x29 + -0x90);
    *unaff_x20 = uVar6;
    unaff_x20[3] = uVar8;
    unaff_x20[2] = uVar7;
    uVar6 = *(undefined8 *)(unaff_x29 + -0x78);
    unaff_x20[5] = *(undefined8 *)(unaff_x29 + -0x70);
    unaff_x20[4] = uVar6;
    unaff_x20[6] = *(undefined8 *)(unaff_x29 + -0x68);
  }
  if ((in_stack_00000008 | 0x8000000000000000) != 0x8000000000000000) {
    func_0x00187bd4(in_stack_00000000,in_stack_00000008,1);
  }
  return;
}

