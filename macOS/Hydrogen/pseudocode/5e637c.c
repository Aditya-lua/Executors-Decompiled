
void FUN_005e637c(void)

{
  long lVar1;
  undefined8 uVar2;
  long lVar3;
  undefined8 in_stack_00000008;
  undefined1 uStack0000000000000010;
  
  func_0x00187bd4();
  uVar2 = __Unwind_Resume(in_stack_00000008);
  func_0x005e67e0(&uStack0000000000000010);
  __Unwind_Resume(uVar2);
  lVar3 = func_0x007a2668();
  *(undefined1 *)(lVar3 + 0x28) = 2;
  if (*(long *)(lVar3 + 8) != 2 && *(long *)(lVar3 + 8) != 0) {
    lVar1 = **(long **)(lVar3 + 0x10);
    **(long **)(lVar3 + 0x10) = lVar1 + -1;
    LORelease();
    if (lVar1 == 1) {
      DataMemoryBarrier(2,1);
      func_0x005e80f0();
    }
  }
  return;
}

