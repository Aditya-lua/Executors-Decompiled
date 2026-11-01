
void FUN_004e556c(void)

{
  code *pcVar1;
  long lVar2;
  long *plVar3;
  long unaff_x19;
  long lVar4;
  long lVar5;
  long unaff_x21;
  undefined8 uVar6;
  long unaff_x22;
  undefined8 *unaff_x23;
  undefined8 uVar7;
  long lVar8;
  undefined8 uStack0000000000000008;
  undefined8 in_stack_00000010;
  
  func_0x007a5594();
  lVar4 = *(long *)(unaff_x19 + 0x10);
  if (unaff_x21 == unaff_x22) goto LAB_004e553c;
  lVar8 = *(long *)(unaff_x19 + 8);
  *unaff_x23 = 1;
  if (unaff_x21 != 1) {
    func_0x00509580(&uStack0000000000000008);
    goto code_r0x004e55ac;
  }
  lVar5 = *(long *)(unaff_x23[2] + 0x10);
  if (lVar5 < 0) {
    uVar7 = 0;
code_r0x004e5598:
    func_0x007a1f00(uVar7,lVar5,&UNK_009e8da8);
code_r0x004e55ac:
                    /* WARNING: Does not return */
    pcVar1 = (code *)SoftwareBreakpoint(1,0x4e55b0);
    (*pcVar1)();
  }
  uVar6 = *(undefined8 *)(unaff_x23[2] + 8);
  if (lVar5 == 0) {
    lVar2 = 1;
  }
  else {
    uVar7 = 1;
    lVar2 = func_0x00187bd0(lVar5,1);
    if (lVar2 == 0) goto code_r0x004e5598;
  }
  _memcpy(lVar2,uVar6,lVar5);
  plVar3 = (long *)(lVar8 + lVar4 * 0x18);
  plVar3[1] = lVar2;
  *plVar3 = lVar5;
  plVar3[2] = lVar5;
  lVar4 = lVar4 + 1;
LAB_004e553c:
  *(long *)(unaff_x19 + 0x10) = lVar4;
  return;
}

