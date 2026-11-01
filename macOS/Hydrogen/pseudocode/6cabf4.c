
bool FUN_006cabf4(void)

{
  undefined8 uVar1;
  long lVar2;
  ulong uVar3;
  long lVar4;
  ulong uVar5;
  ulong uVar6;
  ulong uVar7;
  ulong uVar8;
  undefined1 auVar9 [16];
  long in_stack_00000010;
  long in_stack_00000030;
  undefined4 in_stack_00000038;
  
  *(undefined4 *)(in_stack_00000030 + 0x484) = in_stack_00000038;
  __Unwind_Resume();
  *(undefined4 *)(in_stack_00000030 + 0x484) = in_stack_00000038;
  uVar1 = __Unwind_Resume();
  if (in_stack_00000010 != 0) {
    __ZdlPv();
  }
  *(undefined4 *)(in_stack_00000030 + 0x484) = in_stack_00000038;
  auVar9 = __Unwind_Resume(uVar1);
  uVar3 = auVar9._8_8_;
  lVar2 = auVar9._0_8_;
  lVar4 = *(long *)(lVar2 + 0x110);
  do {
    if ((lVar4 != 0) && (*(ulong *)(lVar2 + 0x118) != uVar3)) {
      uVar5 = 0;
      uVar6 = *(long *)(lVar2 + 0x108) - 1;
      uVar7 = uVar3 >> 4 ^ uVar3 >> 9;
      do {
        uVar7 = uVar7 & uVar6;
        uVar8 = *(ulong *)(*(long *)(lVar2 + 0x100) + uVar7 * 0x20);
        if (uVar8 == uVar3) {
          if (*(int *)(*(long *)(lVar2 + 0x100) + uVar7 * 0x20 + 8) != 0) {
            return true;
          }
          break;
        }
        uVar5 = uVar5 + 1;
        uVar7 = uVar5 + uVar7;
      } while (uVar8 != *(ulong *)(lVar2 + 0x118) && uVar5 <= uVar6);
    }
    if ((uVar3 != 0) && (*(int *)(uVar3 + 8) == iRam0000000000a27b28)) {
      return (*(uint *)(uVar3 + 0x1c) & 0xfffffff8) == 8;
    }
    if (*(int *)(uVar3 + 8) != iRam0000000000a27a48) {
      return false;
    }
    uVar3 = *(ulong *)(uVar3 + 0x20);
    lVar4 = *(long *)(lVar2 + 0x110);
  } while( true );
}

