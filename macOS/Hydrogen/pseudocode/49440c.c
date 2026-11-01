
void FUN_0049440c(void)

{
  code *pcVar1;
  undefined8 *puVar2;
  undefined8 uVar3;
  undefined8 *unaff_x19;
  long unaff_x21;
  long unaff_x29;
  undefined8 uVar4;
  undefined8 uVar5;
  undefined8 uVar6;
  undefined8 uVar7;
  undefined8 uVar8;
  undefined8 in_stack_00000000;
  undefined8 in_stack_00000008;
  undefined8 in_stack_00000010;
  undefined8 in_stack_00000018;
  undefined8 in_stack_00000020;
  undefined8 in_stack_00000028;
  undefined8 uStack0000000000000080;
  undefined8 in_stack_00000088;
  undefined8 in_stack_00000090;
  
  puVar2 = (undefined8 *)func_0x00187bd0();
  if (puVar2 == (undefined8 *)0x0) {
    func_0x007a1f18(8,0x50);
                    /* WARNING: Does not return */
    pcVar1 = (code *)SoftwareBreakpoint(1,0x4944c0);
    (*pcVar1)();
  }
  func_0x0045cd08(&uStack0000000000000080);
  func_0x00494290(unaff_x29 + -0x88,unaff_x21 + 0x18);
  uVar6 = *(undefined8 *)(unaff_x29 + -0x80);
  uVar4 = *(undefined8 *)(unaff_x29 + -0x88);
  uVar8 = *(undefined8 *)(unaff_x29 + -0x70);
  uVar3 = *(undefined8 *)(unaff_x29 + -0x58);
  uVar7 = *(undefined8 *)(unaff_x29 + -0x60);
  uVar5 = *(undefined8 *)(unaff_x29 + -0x68);
  puVar2[5] = *(undefined8 *)(unaff_x29 + -0x78);
  puVar2[4] = uVar6;
  puVar2[7] = uVar5;
  puVar2[6] = uVar8;
  puVar2[9] = uVar3;
  puVar2[8] = uVar7;
  puVar2[1] = in_stack_00000088;
  *puVar2 = uStack0000000000000080;
  puVar2[3] = uVar4;
  puVar2[2] = in_stack_00000090;
  unaff_x19[1] = in_stack_00000008;
  *unaff_x19 = in_stack_00000000;
  unaff_x19[3] = in_stack_00000018;
  unaff_x19[2] = in_stack_00000010;
  unaff_x19[5] = in_stack_00000028;
  unaff_x19[4] = in_stack_00000020;
  unaff_x19[6] = puVar2;
  return;
}

