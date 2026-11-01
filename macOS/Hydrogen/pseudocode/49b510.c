
void FUN_0049b510(void)

{
  undefined8 uVar1;
  code *pcVar2;
  int iVar3;
  long lVar4;
  undefined8 *puVar5;
  undefined8 uVar6;
  undefined1 *unaff_x19;
  long unaff_x22;
  undefined8 uVar7;
  long unaff_x23;
  undefined1 *puVar8;
  undefined8 unaff_x24;
  undefined *puVar9;
  uint unaff_w28;
  long unaff_x29;
  undefined1 uStack0000000000000010;
  undefined1 uStack0000000000000018;
  undefined8 uStack0000000000000030;
  undefined8 uStack0000000000000050;
  undefined *in_stack_00000058;
  undefined8 *in_stack_00000060;
  undefined8 in_stack_00000068;
  undefined8 in_stack_00000070;
  undefined8 uStack0000000000000080;
  undefined *in_stack_00000088;
  undefined8 *in_stack_00000090;
  undefined *in_stack_00000098;
  undefined8 uStack00000000000000a0;
  undefined8 in_stack_000000a8;
  undefined8 in_stack_000000b0;
  
  lVar4 = func_0x00187bd0();
  if (lVar4 == 0) {
    func_0x007a1f00(1);
  }
  else {
    _memcpy(lVar4);
    uStack0000000000000030 = unaff_x24;
    if (unaff_x22 == 2) {
      uStack0000000000000080 = (undefined1 *)0x0;
      in_stack_00000088 = (undefined *)0x1;
      in_stack_00000090 = (undefined8 *)0x0;
      in_stack_00000060 = (undefined8 *)(ulong)unaff_w28;
      uStack0000000000000050 = &uStack0000000000000080;
      in_stack_00000058 = &UNK_009e2ad8;
      iVar3 = func_0x00476694(&UNK_0089f3a0,&uStack0000000000000050);
      if (iVar3 != 0) {
        func_0x007a2810(&UNK_0089f5a4,0x37,unaff_x29 + -0x59,&UNK_009e2b20,&UNK_009e2b08);
        goto code_r0x0049bc94;
      }
    }
    else if (unaff_x22 == 1) {
      uStack00000000000000a0 = 0x7fffffffffffffff;
      if (!SCARRY8(*(long *)(unaff_x23 + 8),1)) {
        uStack00000000000000a0 = *(long *)(unaff_x23 + 8) + 1;
      }
      uStack0000000000000080 = (undefined1 *)0x0;
      in_stack_00000088 = (undefined *)0x1;
      in_stack_00000090 = (undefined8 *)0x0;
      in_stack_00000060 = (undefined8 *)(ulong)unaff_w28;
      uStack0000000000000050 = &uStack0000000000000080;
      in_stack_00000058 = &UNK_009e2ad8;
      iVar3 = func_0x00476694(&uStack00000000000000a0,&uStack0000000000000050);
      if (iVar3 != 0) {
        func_0x007a2810(&UNK_0089f5a4,0x37,unaff_x29 + -0x59,&UNK_009e2b20,&UNK_009e2b08);
        goto code_r0x0049bc94;
      }
    }
    else {
      uStack00000000000000a0 = *(long *)(unaff_x23 + 8);
      uStack0000000000000080 = (undefined1 *)0x0;
      in_stack_00000088 = (undefined *)0x1;
      in_stack_00000090 = (undefined8 *)0x0;
      in_stack_00000060 = (undefined8 *)(ulong)unaff_w28;
      uStack0000000000000050 = &uStack0000000000000080;
      in_stack_00000058 = &UNK_009e2ad8;
      iVar3 = func_0x00476694(&uStack00000000000000a0,&uStack0000000000000050);
      if (iVar3 != 0) {
        func_0x007a2810(&UNK_0089f5a4,0x37,unaff_x29 + -0x59,&UNK_009e2b20,&UNK_009e2b08);
        goto code_r0x0049bc94;
      }
    }
    *(undefined **)(unaff_x29 + -0x78) = in_stack_00000088;
    *(undefined1 **)(unaff_x29 + -0x80) = uStack0000000000000080;
    *(undefined8 **)(unaff_x29 + -0x70) = in_stack_00000090;
    puVar5 = in_stack_00000090;
    if ((ulong)(*(long *)(unaff_x29 + -0x80) - (long)in_stack_00000090) < 2) {
      func_0x007a4b4c(unaff_x29 + -0x80,in_stack_00000090,2,1,1);
      puVar5 = *(undefined8 **)(unaff_x29 + -0x70);
    }
    *(undefined2 *)(*(long *)(unaff_x29 + -0x78) + (long)puVar5) = 0x2e2e;
    lVar4 = (long)puVar5 + 2;
    *(long *)(unaff_x29 + -0x70) = lVar4;
    if (*(long *)(unaff_x23 + 0x10) == 2) {
      uStack0000000000000080 = (undefined1 *)0x0;
      in_stack_00000088 = (undefined *)0x1;
      in_stack_00000090 = (undefined8 *)0x0;
      in_stack_00000060 = (undefined8 *)(ulong)unaff_w28;
      uStack0000000000000050 = &uStack0000000000000080;
      in_stack_00000058 = &UNK_009e2ad8;
      iVar3 = func_0x00476694(&UNK_0089f3a8,&uStack0000000000000050);
      puVar9 = in_stack_00000088;
      puVar8 = uStack0000000000000080;
      if (iVar3 != 0) {
        func_0x007a2810(&UNK_0089f5a4,0x37,unaff_x29 + -0x59,&UNK_009e2b20,&UNK_009e2b08);
        goto code_r0x0049bc94;
      }
      func_0x00487450(unaff_x29 + -0x80,in_stack_00000088,
                      in_stack_00000088 + (long)in_stack_00000090,&UNK_009e2850);
    }
    else if (*(long *)(unaff_x23 + 0x10) == 1) {
      uStack00000000000000a0 = *(long *)(unaff_x23 + 0x18);
      uStack0000000000000080 = (undefined1 *)0x0;
      in_stack_00000088 = (undefined *)0x1;
      in_stack_00000090 = (undefined8 *)0x0;
      in_stack_00000060 = (undefined8 *)(ulong)unaff_w28;
      uStack0000000000000050 = &uStack0000000000000080;
      in_stack_00000058 = &UNK_009e2ad8;
      iVar3 = func_0x00476694(&uStack00000000000000a0,&uStack0000000000000050);
      puVar9 = in_stack_00000088;
      puVar8 = uStack0000000000000080;
      if (iVar3 != 0) {
        func_0x007a2810(&UNK_0089f5a4,0x37,unaff_x29 + -0x59,&UNK_009e2b20,&UNK_009e2b08);
        goto code_r0x0049bc94;
      }
      func_0x00487450(unaff_x29 + -0x80,in_stack_00000088,
                      in_stack_00000088 + (long)in_stack_00000090,&UNK_009e2850);
    }
    else {
      uStack00000000000000a0 = *(long *)(unaff_x23 + 0x18);
      if (*(long *)(unaff_x29 + -0x80) == lVar4) {
        func_0x007a4b4c(unaff_x29 + -0x80,lVar4,1,1,1);
        lVar4 = *(long *)(unaff_x29 + -0x70);
      }
      *(undefined1 *)(*(long *)(unaff_x29 + -0x78) + lVar4) = 0x3d;
      *(long *)(unaff_x29 + -0x70) = (long)puVar5 + 3;
      uStack0000000000000080 = (undefined1 *)0x0;
      in_stack_00000088 = (undefined *)0x1;
      in_stack_00000090 = (undefined8 *)0x0;
      in_stack_00000060 = (undefined8 *)(ulong)unaff_w28;
      uStack0000000000000050 = &uStack0000000000000080;
      in_stack_00000058 = &UNK_009e2ad8;
      iVar3 = func_0x00476694(&uStack00000000000000a0,&uStack0000000000000050);
      puVar9 = in_stack_00000088;
      puVar8 = uStack0000000000000080;
      if (iVar3 != 0) {
        func_0x007a2810(&UNK_0089f5a4,0x37,unaff_x29 + -0x59,&UNK_009e2b20,&UNK_009e2b08);
        goto code_r0x0049bc94;
      }
      func_0x00487450(unaff_x29 + -0x80,in_stack_00000088,
                      in_stack_00000088 + (long)in_stack_00000090,&UNK_009e2850);
    }
    if (puVar8 != (undefined1 *)0x0) {
      func_0x00187bd4(puVar9,puVar8,1);
    }
    in_stack_000000a8 = *(undefined8 *)(unaff_x29 + -0x78);
    uStack00000000000000a0 = *(long *)(unaff_x29 + -0x80);
    in_stack_000000b0 = *(undefined8 *)(unaff_x29 + -0x70);
    uStack0000000000000080 = &uStack0000000000000010;
    in_stack_00000088 =
         &
         __ZN4core3fmt3num3imp54__LT_impl_u20_core__fmt__Display_u20_for_u20_isize_GT_3fmt17h68e25695447251e8E
    ;
    in_stack_00000090 = &uStack00000000000000a0;
    in_stack_00000098 = &DAT_0049cf48;
    uStack0000000000000050 = (undefined8 *)&UNK_009e2868;
    in_stack_00000058 = (undefined *)0x2;
    in_stack_00000068 = 2;
    in_stack_00000070 = 0;
    in_stack_00000060 = &uStack0000000000000080;
    func_0x00459f08(unaff_x29 + -0x80,&uStack0000000000000050);
    if (uStack00000000000000a0 != 0) {
      func_0x00187bd4(in_stack_000000a8,uStack00000000000000a0,1);
    }
    uVar6 = *(undefined8 *)(unaff_x29 + -0x80);
    uVar1 = *(undefined8 *)(unaff_x29 + -0x78);
    uVar7 = *(undefined8 *)(unaff_x29 + -0x70);
    puVar5 = (undefined8 *)func_0x00187bd0(0x18,8);
    if (puVar5 != (undefined8 *)0x0) {
      *puVar5 = uVar6;
      puVar5[1] = uVar1;
      puVar5[2] = uVar7;
      func_0x0049aabc(&uStack0000000000000018,&uStack0000000000000030,puVar5,&UNK_009e28a8);
      uVar6 = func_0x0049af4c();
      *(undefined8 *)(unaff_x19 + 8) = uVar6;
      *unaff_x19 = 1;
      return;
    }
    func_0x007a1f18(8,0x18);
  }
code_r0x0049bc94:
                    /* WARNING: Does not return */
  pcVar2 = (code *)SoftwareBreakpoint(1,0x49bc98);
  (*pcVar2)();
}

