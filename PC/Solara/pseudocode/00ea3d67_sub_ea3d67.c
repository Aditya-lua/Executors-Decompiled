/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void sub_ea3d67(void)

{
  undefined4 uVar1;
  int iVar2;
  longlong lVar3;
  ulonglong uVar4;
  ulonglong uVar5;
  longlong unaff_RBP;
  ulonglong unaff_RDI;
  int in_stack_00000040;
  ulonglong in_stack_00000048;
  undefined8 in_stack_00000050;
  ulonglong in_stack_00000160;
  
  lVar3 = CreateFileW();
  if (lVar3 == -1) {
    uVar1 = GetLastError();
    FUN_180e90b40(uVar1,&stack0x00000060,0x100);
    FUN_180e64c00();
    unaff_RBP = 0;
  }
  else {
    iVar2 = GetFileSizeEx(lVar3,&stack0x00000048);
    uVar5 = in_stack_00000048;
    if (iVar2 == 0) {
      uVar1 = GetLastError();
      FUN_180e90b40(uVar1,&stack0x00000060,0x100);
      FUN_180e64c00();
    }
    else if ((longlong)in_stack_00000048 < 0x100001) {
      unaff_RBP = (*_DAT_1810c24f8)(in_stack_00000048 + 1);
      if (unaff_RBP != 0) {
        uVar4 = uVar5;
        if (uVar5 != 0) {
          do {
            in_stack_00000040 = 0;
            uVar5 = unaff_RDI & 0xffffffff;
            iVar2 = ReadFile(lVar3,unaff_RDI + unaff_RBP,(int)uVar4 - (int)unaff_RDI,
                             &stack0x00000040,0);
            if (iVar2 == 0) {
              uVar1 = GetLastError();
              FUN_180e90b40(uVar1,&stack0x00000060,0x100);
              FUN_180e64c00();
              goto LAB_180ea3ece;
            }
            if (in_stack_00000040 != 0) {
              unaff_RDI = (ulonglong)(uint)((int)unaff_RDI + in_stack_00000040);
              uVar5 = uVar4;
            }
            uVar4 = uVar5;
          } while ((unaff_RDI & 0xffffffff) < uVar5);
        }
        *(undefined1 *)(uVar5 + unaff_RBP) = 0;
        FUN_180ea3a40(in_stack_00000050,unaff_RBP,uVar5);
      }
    }
    else {
      FUN_180e64c00();
    }
LAB_180ea3ece:
    CloseHandle(lVar3);
  }
  (*pcRam00000001810c2500)(unaff_RBP);
  func_0x000180e1d9d0();
  FUN_180e155e0(in_stack_00000160 ^ (ulonglong)&stack0x00000000);
  return;
}


