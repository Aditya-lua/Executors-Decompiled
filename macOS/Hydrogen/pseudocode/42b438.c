
void FUN_0042b438(void)

{
  code *pcVar1;
  long lVar2;
  long unaff_x20;
  long unaff_x21;
  undefined8 uVar3;
  undefined8 uStack0000000000000008;
  undefined8 in_stack_00000010;
  
  *(undefined1 *)(unaff_x21 + 0x19) = 1;
  if (unaff_x20 < 0) {
    uVar3 = 0;
LAB_0042b51c:
    func_0x007a1f00(uVar3);
                    /* WARNING: Does not return */
    pcVar1 = (code *)SoftwareBreakpoint(1,0x42b534);
    (*pcVar1)();
  }
  if (unaff_x20 == 0) {
    lVar2 = 1;
  }
  else {
    uVar3 = 1;
    lVar2 = func_0x00187bd0();
    if (lVar2 == 0) goto LAB_0042b51c;
  }
  _memcpy(lVar2);
  func_0x00400bec(&uStack0000000000000008);
  if ((uStack0000000000000008 < -0x7ffffffffffffffe) || (uStack0000000000000008 == 0)) {
    return;
  }
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR__free_00a24e58)(in_stack_00000010,uStack0000000000000008,1);
  return;
}

