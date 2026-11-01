
void FUN_005ceed0(undefined1 param_1 [16])

{
  code *pcVar1;
  undefined8 *puVar2;
  long unaff_x19;
  undefined8 unaff_x20;
  undefined8 *unaff_x21;
  undefined8 *unaff_x22;
  long unaff_x23;
  long unaff_x29;
  undefined8 uVar3;
  undefined8 uVar4;
  undefined8 uVar5;
  undefined8 in_stack_00000048;
  undefined1 uStack0000000000000050;
  undefined7 uStack0000000000000051;
  undefined1 uStack0000000000000058;
  undefined7 uStack0000000000000059;
  undefined8 uStack0000000000000060;
  
  uStack0000000000000058 = param_1[8];
  uStack0000000000000059 = param_1._9_7_;
  uStack0000000000000050 = param_1[0];
  uStack0000000000000051 = param_1._1_7_;
  uStack0000000000000060 = *(undefined8 *)(unaff_x19 + 0x10);
  *(undefined8 *)(unaff_x29 + -0x58) = 1;
  *(undefined1 *)(unaff_x29 + -0x50) = 0;
  *(long *)(unaff_x29 + -0x47) = param_1._1_8_;
  *(ulong *)(unaff_x29 + -0x4f) = CONCAT17(uStack0000000000000050,in_stack_00000048._1_7_);
  *(undefined8 *)(unaff_x23 + 0x20) = uStack0000000000000060;
  *(long *)(unaff_x23 + 0x18) = param_1._8_8_;
  puVar2 = (undefined8 *)func_0x00187bd0(0x28,8);
  if (puVar2 == (undefined8 *)0x0) {
    func_0x007a1f18(8,0x28);
                    /* WARNING: Does not return */
    pcVar1 = (code *)SoftwareBreakpoint(1,0x5cef6c);
    (*pcVar1)();
  }
  uVar3 = *(undefined8 *)(unaff_x29 + -0x58);
  uVar5 = *(undefined8 *)(unaff_x29 + -0x40);
  uVar4 = *(undefined8 *)(unaff_x29 + -0x48);
  puVar2[1] = *(undefined8 *)(unaff_x29 + -0x50);
  *puVar2 = uVar3;
  puVar2[3] = uVar5;
  puVar2[2] = uVar4;
  puVar2[4] = *(undefined8 *)(unaff_x29 + -0x38);
  uVar3 = *unaff_x22;
  uVar5 = unaff_x22[3];
  uVar4 = unaff_x22[2];
  unaff_x21[1] = unaff_x22[1];
  *unaff_x21 = uVar3;
  unaff_x21[3] = uVar5;
  unaff_x21[2] = uVar4;
  uVar3 = unaff_x22[4];
  uVar5 = unaff_x22[7];
  uVar4 = unaff_x22[6];
  unaff_x21[5] = unaff_x22[5];
  unaff_x21[4] = uVar3;
  unaff_x21[7] = uVar5;
  unaff_x21[6] = uVar4;
  unaff_x21[8] = unaff_x20;
  unaff_x21[9] = puVar2;
  return;
}

