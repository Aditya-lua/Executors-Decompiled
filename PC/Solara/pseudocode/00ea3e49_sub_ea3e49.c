/* WARNING: Removing unreachable block (ram,0x000180ea3e9f) */

void sub_ea3e49(void)

{
  int iVar1;
  undefined4 uVar2;
  longlong unaff_RBX;
  ulonglong uVar3;
  longlong unaff_RBP;
  uint unaff_EDI;
  undefined8 in_stack_00000050;
  ulonglong in_stack_00000160;
  
  uVar3 = 0;
  if (unaff_RBX != 0) {
    uVar3 = (ulonglong)unaff_EDI;
    iVar1 = ReadFile();
    if (iVar1 == 0) {
      uVar2 = GetLastError();
      FUN_180e90b40(uVar2,&stack0x00000060,0x100);
      FUN_180e64c00();
      goto code_r0x000180ea3ec6;
    }
  }
  *(undefined1 *)(uVar3 + unaff_RBP) = 0;
  FUN_180ea3a40(in_stack_00000050);
code_r0x000180ea3ec6:
  CloseHandle();
  (*pcRam00000001810c2500)();
  func_0x000180e1d9d0();
  FUN_180e155e0(in_stack_00000160 ^ (ulonglong)&stack0x00000000);
  return;
}


