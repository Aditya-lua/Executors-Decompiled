
void FUN_0042b3d8(long param_1,undefined8 param_2)

{
  code *pcVar1;
  int *piVar2;
  long lVar3;
  long unaff_x19;
  long unaff_x20;
  undefined8 uVar4;
  undefined8 uStack0000000000000008;
  undefined8 in_stack_00000010;
  undefined8 uStack0000000000000020;
  undefined8 uStack0000000000000038;
  
  if (unaff_x19 == 0) {
LAB_0042b448:
    uStack0000000000000020 = unaff_x19;
    if (-1 < unaff_x20) {
      if (unaff_x20 == 0) {
        lVar3 = 1;
LAB_0042b47c:
        _memcpy(lVar3);
        func_0x00400bec(&uStack0000000000000008,param_1,&uStack0000000000000020,
                        &uStack0000000000000038);
        if ((uStack0000000000000008 < -0x7ffffffffffffffe) || (uStack0000000000000008 == 0)) {
          return;
        }
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
        (*(code *)PTR__free_00a24e58)(in_stack_00000010,uStack0000000000000008,1);
        return;
      }
      uVar4 = 1;
      lVar3 = func_0x00187bd0();
      if (lVar3 != 0) goto LAB_0042b47c;
      goto LAB_0042b51c;
    }
  }
  else {
    piVar2 = (int *)func_0x00187bd0();
    if (piVar2 != (int *)0x0) {
      _memcpy(piVar2,param_2);
      if (((unaff_x19 == 4) && ((*(byte *)(param_1 + 0x19) & 1) == 0)) && (*piVar2 == 0x48544150)) {
        *(undefined1 *)(param_1 + 0x19) = 1;
      }
      goto LAB_0042b448;
    }
    func_0x007a1f00(1);
  }
  uVar4 = 0;
LAB_0042b51c:
  func_0x007a1f00(uVar4);
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x42b534);
  (*pcVar1)();
}

