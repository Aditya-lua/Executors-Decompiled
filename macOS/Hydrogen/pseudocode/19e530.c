
void FUN_0019e530(void)

{
  code *pcVar1;
  long lVar2;
  long lVar3;
  undefined8 *puVar4;
  undefined8 *puVar5;
  undefined *puVar6;
  long *unaff_x20;
  long unaff_x23;
  undefined8 uVar7;
  undefined8 uStack0000000000000008;
  long in_stack_00000010;
  undefined8 uStack0000000000000018;
  undefined8 uStack0000000000000020;
  undefined8 uStack0000000000000028;
  undefined8 uStack0000000000000030;
  
  _CFStringGetBytes();
  lVar3 = in_stack_00000010;
  if (in_stack_00000010 < 0) {
    uVar7 = 0;
LAB_0019e634:
    uVar7 = func_0x007a1f00(uVar7,lVar3,&UNK_009c20d8);
    if (lVar3 != 0) {
      func_0x00187bd4();
    }
    __Unwind_Resume(uVar7);
    lVar3 = _CFUUIDCreate(*(undefined8 *)PTR__kCFAllocatorDefault_009b0238);
    if (lVar3 == 0) {
      puVar4 = (undefined8 *)func_0x007a11c0(&UNK_0081cb73,0x22,&UNK_009c2120);
                    /* WARNING: Could not recover jumptable at 0x007b2170. Too many branches */
                    /* WARNING: Treating indirect jump as call */
      (*(code *)PTR__CFRelease_00a241b0)(*puVar4);
      return;
    }
    return;
  }
  if (in_stack_00000010 == 0) {
    lVar2 = 1;
  }
  else {
    uVar7 = 1;
    lVar2 = func_0x00187bdc(in_stack_00000010,1);
    if (lVar2 == 0) goto LAB_0019e634;
  }
  uStack0000000000000018 = 0;
  uStack0000000000000020 = _CFStringGetBytes();
  if (uStack0000000000000020 == unaff_x23) {
    uStack0000000000000028 = lVar3;
    if (uStack0000000000000018 == lVar3) {
      *unaff_x20 = lVar3;
      unaff_x20[1] = lVar2;
      unaff_x20[2] = lVar3;
      return;
    }
    puVar4 = &uStack0000000000000028;
    puVar5 = &uStack0000000000000018;
    puVar6 = &UNK_009c2108;
  }
  else {
    puVar4 = &uStack0000000000000008;
    puVar5 = &uStack0000000000000020;
    puVar6 = &UNK_009c20f0;
  }
  uStack0000000000000030 = 0;
  func_0x0079b314(0,puVar5,puVar4,&uStack0000000000000030,puVar6);
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x19e630);
  (*pcVar1)();
}

