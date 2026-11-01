
void FUN_004e8834(void)

{
  long lVar1;
  long lVar2;
  code *pcVar3;
  undefined8 *puVar4;
  long lVar5;
  int *piVar6;
  long *plVar7;
  undefined8 *unaff_x19;
  int *unaff_x20;
  undefined8 unaff_x21;
  undefined8 unaff_x24;
  undefined8 unaff_x25;
  long unaff_x26;
  undefined8 uVar8;
  long lVar9;
  int *piVar10;
  long lStack0000000000000010;
  undefined8 uStack0000000000000018;
  long in_stack_00000020;
  long in_stack_00000028;
  
  puVar4 = (undefined8 *)func_0x00187bd0();
  if (puVar4 == (undefined8 *)0x0) {
    func_0x007a1f00(8,0x60);
code_r0x004e89bc:
                    /* WARNING: Does not return */
    pcVar3 = (code *)SoftwareBreakpoint(1,0x4e89c0);
    (*pcVar3)();
  }
  piVar10 = (int *)(unaff_x26 + 0x20);
  *puVar4 = unaff_x25;
  puVar4[1] = unaff_x21;
  puVar4[2] = unaff_x24;
  lStack0000000000000010 = 1;
  do {
    if (piVar10 == unaff_x20) {
LAB_004e8948:
      unaff_x19[1] = puVar4;
      *unaff_x19 = 4;
      unaff_x19[2] = lStack0000000000000010;
      return;
    }
    while (piVar6 = piVar10 + 8, *piVar10 != 1) {
      piVar10 = piVar6;
      if (piVar6 == unaff_x20) goto LAB_004e8948;
    }
    func_0x0045b558(&uStack0000000000000018,*(undefined8 *)(piVar10 + 2),
                    *(undefined8 *)(piVar10 + 4));
    lVar2 = in_stack_00000028;
    lVar1 = in_stack_00000020;
    lVar5 = in_stack_00000020;
    lVar9 = uStack0000000000000018;
    if (uStack0000000000000018 == -0x8000000000000000) {
      if (in_stack_00000028 < 0) {
        uVar8 = 0;
LAB_004e89a8:
        func_0x007a1f00(uVar8,lVar2,&UNK_009e80a0);
        goto code_r0x004e89bc;
      }
      uVar8 = 1;
      if (in_stack_00000028 == 0) {
        lVar5 = 1;
      }
      else {
        lVar5 = func_0x00187bd0(in_stack_00000028,1);
        if (lVar5 == 0) goto LAB_004e89a8;
      }
      _memcpy(lVar5,lVar1,lVar2);
      lVar9 = lVar2;
    }
    if (lStack0000000000000010 == 4) {
      func_0x007a5594();
    }
    piVar10 = piVar10 + 8;
    plVar7 = puVar4 + lStack0000000000000010 * 3;
    *plVar7 = lVar9;
    plVar7[1] = lVar5;
    plVar7[2] = lVar2;
    lStack0000000000000010 = lStack0000000000000010 + 1;
  } while( true );
}

