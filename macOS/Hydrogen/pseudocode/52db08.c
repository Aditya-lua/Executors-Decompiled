
void FUN_0052db08(void)

{
  code *pcVar1;
  int iVar2;
  long lVar3;
  undefined2 *puVar4;
  undefined1 *unaff_x19;
  undefined8 *puVar5;
  long lVar6;
  long unaff_x22;
  undefined8 uVar7;
  undefined8 uVar8;
  long unaff_x29;
  long in_stack_00000008;
  long in_stack_00000010;
  long in_stack_00000018;
  undefined8 uStack0000000000000040;
  undefined2 *in_stack_00000048;
  undefined8 in_stack_00000050;
  undefined8 uStack0000000000000060;
  undefined2 *in_stack_00000068;
  undefined8 in_stack_00000070;
  
  func_0x0045b558();
  if (*(long *)(unaff_x29 + -0x58) == -0x8000000000000000) {
    lVar6 = *(long *)(unaff_x29 + -0x48);
    if (lVar6 < 0) {
      uVar8 = 0;
LAB_0052dcdc:
      func_0x007a1f00(uVar8,lVar6,&UNK_009eaac8);
      goto code_r0x0052dd08;
    }
    uVar7 = *(undefined8 *)(unaff_x29 + -0x50);
    if (lVar6 == 0) {
      lVar3 = 1;
    }
    else {
      uVar8 = 1;
      lVar3 = func_0x00187bd0(lVar6,1);
      if (lVar3 == 0) goto LAB_0052dcdc;
    }
    _memcpy(lVar3,uVar7,lVar6);
  }
  if (unaff_x22 == 0) {
    puVar4 = (undefined2 *)func_0x00187bd0(3,1);
    if (puVar4 == (undefined2 *)0x0) {
      func_0x007a1f00(1,3,&UNK_009eaac8);
      goto code_r0x0052dd08;
    }
    *(undefined1 *)(puVar4 + 1) = 0x2e;
    *puVar4 = 0x2e2e;
    uStack0000000000000040 = 3;
    in_stack_00000050 = 3;
    in_stack_00000048 = puVar4;
  }
  else {
    uStack0000000000000060 = 0;
    in_stack_00000068 = (undefined2 *)((long)&MACH_HEADER.magic + 1);
    in_stack_00000070 = 0;
    *(undefined8 *)(unaff_x29 + -0x48) = 0xe0000020;
    *(undefined8 **)(unaff_x29 + -0x58) = &uStack0000000000000060;
    *(undefined **)(unaff_x29 + -0x50) = &UNK_009ea9f0;
    iVar2 = func_0x0050f9f0();
    if (iVar2 != 0) {
      func_0x007a2810(&UNK_008a7f30,0x37,&uStack0000000000000040,&UNK_009eaa50,&UNK_009eaa20);
code_r0x0052dd08:
                    /* WARNING: Does not return */
      pcVar1 = (code *)SoftwareBreakpoint(1,0x52dd0c);
      (*pcVar1)();
    }
    in_stack_00000048 = in_stack_00000068;
    uStack0000000000000040 = uStack0000000000000060;
    in_stack_00000050 = in_stack_00000070;
  }
  uVar8 = func_0x0051ba54();
  *(undefined8 *)(unaff_x19 + 8) = uVar8;
  *unaff_x19 = 1;
  if (in_stack_00000018 != 0) {
    puVar5 = (undefined8 *)(in_stack_00000010 + 8);
    do {
      if (puVar5[-1] != 0) {
        func_0x00187bd4(*puVar5,puVar5[-1],1);
      }
      puVar5 = puVar5 + 3;
      in_stack_00000018 = in_stack_00000018 + -1;
    } while (in_stack_00000018 != 0);
  }
  if (in_stack_00000008 != 0) {
    func_0x00187bd4(in_stack_00000010,in_stack_00000008 * 0x18,8);
  }
  return;
}

