
void FUN_0049b9ec(void)

{
  long lVar1;
  long lVar2;
  code *pcVar3;
  undefined2 *puVar4;
  long lVar5;
  undefined1 *unaff_x19;
  undefined8 uVar6;
  long unaff_x29;
  undefined8 uStack0000000000000050;
  long in_stack_00000058;
  long in_stack_00000060;
  undefined8 uStack0000000000000080;
  long in_stack_00000088;
  long in_stack_00000090;
  
  puVar4 = (undefined2 *)func_0x00187bd0(3,1);
  if (puVar4 == (undefined2 *)0x0) {
    func_0x007a1f00(1,3,&UNK_009e2c18);
    func_0x007a1f00(0);
    goto code_r0x0049bc94;
  }
  *(undefined1 *)(puVar4 + 1) = 0x2e;
  *puVar4 = 0x2e2e;
  *(undefined8 *)(unaff_x29 + -0x80) = 3;
  *(undefined2 **)(unaff_x29 + -0x78) = puVar4;
  *(undefined8 *)(unaff_x29 + -0x70) = 3;
  func_0x0045b558(&uStack0000000000000050);
  lVar2 = in_stack_00000060;
  lVar1 = in_stack_00000058;
  if (uStack0000000000000050 != -0x8000000000000000) {
    in_stack_00000088 = in_stack_00000058;
    uStack0000000000000080 = uStack0000000000000050;
    goto code_r0x0049b9a8;
  }
  if (in_stack_00000060 < 0) {
    uVar6 = 0;
LAB_0049bc80:
    func_0x007a1f00(uVar6,lVar2,&UNK_009e2c18);
code_r0x0049bc94:
                    /* WARNING: Does not return */
    pcVar3 = (code *)SoftwareBreakpoint(1,0x49bc98);
    (*pcVar3)();
  }
  if (in_stack_00000060 == 0) {
    lVar5 = 1;
  }
  else {
    uVar6 = 1;
    lVar5 = func_0x00187bd0(in_stack_00000060,1);
    if (lVar5 == 0) goto LAB_0049bc80;
  }
  _memcpy(lVar5,lVar1,lVar2);
  uStack0000000000000080 = lVar2;
  in_stack_00000088 = lVar5;
code_r0x0049b9a8:
  in_stack_00000090 = lVar2;
  func_0x0049aabc(unaff_x29 + -0x80,&uStack0000000000000080,1,&UNK_009e2920);
  uVar6 = func_0x0049af4c();
  *(undefined8 *)(unaff_x19 + 8) = uVar6;
  *unaff_x19 = 1;
  return;
}

