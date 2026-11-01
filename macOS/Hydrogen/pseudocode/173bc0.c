
void FUN_00173bc0(void)

{
  code *pcVar1;
  long lVar2;
  long *unaff_x19;
  int iStack0000000000000000;
  undefined4 uStack0000000000000004;
  undefined8 in_stack_00000008;
  undefined1 uStack0000000000000014;
  
  func_0x00416de4(&uStack0000000000000014);
  if (iStack0000000000000000 == 1) {
    *(int *)(unaff_x19 + 2) = (int)in_stack_00000008;
    *(int *)((long)unaff_x19 + 0x14) = (int)((ulong)in_stack_00000008 >> 0x20);
    *unaff_x19 = 0;
    unaff_x19[1] = 3;
  }
  else {
    lVar2 = func_0x00187bd0(0x2000,1);
    if (lVar2 == 0) {
      func_0x007a1f00(1,0x2000,&UNK_009beca8);
                    /* WARNING: Does not return */
      pcVar1 = (code *)SoftwareBreakpoint(1,0x173c50);
      (*pcVar1)();
    }
    *unaff_x19 = lVar2;
    unaff_x19[1] = 0x2000;
    unaff_x19[3] = 0;
    unaff_x19[4] = 0;
    unaff_x19[2] = 0;
    *(undefined4 *)(unaff_x19 + 5) = uStack0000000000000004;
  }
  return;
}

