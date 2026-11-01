
void FUN_006c8538(void)

{
  undefined8 *puVar1;
  code *pcVar2;
  int iVar3;
  ulong uVar4;
  long unaff_x19;
  undefined8 *unaff_x20;
  undefined8 *in_stack_00000008;
  undefined8 *in_stack_00000010;
  
  func_0x006c6028();
  func_0x006b2784(*unaff_x20);
  for (puVar1 = in_stack_00000008; puVar1 != in_stack_00000010; puVar1 = puVar1 + 1) {
    uVar4 = func_0x006b2794(*unaff_x20,*puVar1);
    if ((uVar4 & 1) == 0) goto LAB_006c89ec;
  }
  iVar3 = func_0x006b2794(*unaff_x20);
  if (iVar3 != 0) {
    if (in_stack_00000008 != (undefined8 *)0x0) {
      __ZdlPv();
    }
    return;
  }
LAB_006c89ec:
  func_0x006bc388(unaff_x19 + 0xc,"Exceeded jump distance limit; simplify the code to compile");
                    /* WARNING: Does not return */
  pcVar2 = (code *)SoftwareBreakpoint(1,0x6c8a00);
  (*pcVar2)();
}

