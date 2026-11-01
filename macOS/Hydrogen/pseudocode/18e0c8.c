
/* WARNING: Possible PIC construction at 0x0018e15c: Changing call to branch */

void FUN_0018e0c8(long param_1,long param_2)

{
  code *pcVar1;
  undefined8 *unaff_x19;
  ulong *unaff_x20;
  ulong unaff_x21;
  ulong unaff_x22;
  ulong uVar2;
  ulong unaff_x24;
  long unaff_x25;
  long lVar3;
  undefined8 unaff_x29;
  undefined8 uVar4;
  undefined8 in_stack_00000040;
  undefined8 in_stack_00000048;
  undefined8 in_stack_00000050;
  undefined8 in_stack_00000058;
  undefined8 in_stack_00000060;
  undefined8 in_stack_00000068;
  undefined1 uStack0000000000000070;
  
  *unaff_x19 = 8;
  unaff_x19[1] = 8;
  unaff_x19[2] = 0;
  unaff_x19[3] = 8;
  lVar3 = ((ulong)(param_1 - param_2) >> 3) * 0x4ec4ec4ec4ec4ec5 + 1;
  while (lVar3 = lVar3 + -1, lVar3 != 0) {
    func_0x0018b0d4(param_2);
    param_2 = param_2 + 0x68;
  }
  if ((unaff_x25 != 0) && (uVar2 = unaff_x22 & 0xffffffffffffffe0, unaff_x22 != uVar2)) {
    if (uVar2 == 0) {
      if (unaff_x22 != 0) {
        uVar4 = 0x18e160;
        goto code_r0x00187bd4;
      }
      unaff_x21 = 8;
    }
    else {
      unaff_x21 = func_0x00187bd8();
      if (unaff_x21 == 0) {
        func_0x007a1f18(8,uVar2);
                    /* WARNING: Does not return */
        pcVar1 = (code *)SoftwareBreakpoint(1,0x18e14c);
        (*pcVar1)();
      }
    }
  }
  *unaff_x20 = unaff_x22 >> 5;
  unaff_x20[1] = unaff_x21;
  unaff_x20[2] = unaff_x24;
  lVar3 = unaff_x19[1];
  if (unaff_x19[3] - lVar3 != 0) {
    uVar2 = (ulong)(unaff_x19[3] - lVar3) / 0x68;
    do {
      func_0x0018b0d4(lVar3);
      lVar3 = lVar3 + 0x68;
      uVar2 = uVar2 - 1;
    } while (uVar2 != 0);
  }
  if (unaff_x19[2] == 0) {
    return;
  }
  register0x00000008 = (BADSPACEBASE *)&uStack0000000000000070;
  unaff_x29 = in_stack_00000060;
  uVar4 = in_stack_00000068;
code_r0x00187bd4:
  *(undefined8 *)((long)register0x00000008 + -0x10) = unaff_x29;
  *(undefined8 *)((long)register0x00000008 + -8) = uVar4;
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR__free_00a24e58)();
  return;
}

