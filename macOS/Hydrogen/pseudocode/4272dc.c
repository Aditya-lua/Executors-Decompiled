
void FUN_004272dc(undefined8 param_1)

{
  uint uVar1;
  int iVar2;
  undefined8 uVar3;
  uint *puVar4;
  long extraout_x1;
  long lVar5;
  undefined4 *extraout_x8;
  undefined1 uStack000000000000000c;
  long in_stack_00000018;
  undefined8 in_stack_00000020;
  long in_stack_00000030;
  undefined8 in_stack_00000038;
  uint uStack_58;
  uint uStack_54;
  undefined4 uStack_50;
  int iStack_4c;
  int iStack_48;
  int iStack_44;
  
  _close();
  lVar5 = in_stack_00000030;
  if (in_stack_00000030 != 0) goto LAB_0042734c;
  while (in_stack_00000018 == 0) {
    func_0x003f7050(&uStack000000000000000c);
    __Unwind_Resume(param_1);
    lVar5 = extraout_x1;
LAB_0042734c:
    func_0x00187bd4(in_stack_00000038,lVar5,1);
  }
  func_0x00187bd4(in_stack_00000020,in_stack_00000018,1);
  func_0x003f7050(&uStack000000000000000c);
  __Unwind_Resume(param_1);
  uVar3 = func_0x007a2668();
  func_0x00436720(&uStack_58,uVar3,0,1);
  uVar1 = uStack_58;
  if (uStack_58 == 2) {
    *(ulong *)(extraout_x8 + 2) = CONCAT44(iStack_4c,uStack_50);
    *extraout_x8 = 1;
  }
  else {
    if (iStack_4c != -1) {
      _close();
    }
    if ((uVar1 & 1) == 0) {
      uStack_58 = 0;
      do {
        iVar2 = _waitpid(uStack_50,&uStack_58,0);
        if (iVar2 != -1) {
          uStack_54 = uStack_58;
          goto LAB_00427440;
        }
        puVar4 = (uint *)___error();
      } while (*puVar4 == 4);
      *(ulong *)(extraout_x8 + 2) = (ulong)*puVar4 << 0x20 | 2;
      *extraout_x8 = 1;
    }
    else {
LAB_00427440:
      *extraout_x8 = 0;
      extraout_x8[1] = uStack_54;
    }
    if (iStack_48 != -1) {
      _close(iStack_48);
    }
    if (iStack_44 != -1) {
      _close(iStack_44);
    }
  }
  return;
}

