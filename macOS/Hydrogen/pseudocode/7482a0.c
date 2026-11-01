
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void thunk_FUN_007483e4(undefined8 param_1,undefined8 param_2,int param_3,int param_4)

{
  long lVar1;
  undefined8 uVar2;
  ulong *unaff_x20;
  ulong uVar3;
  undefined1 auVar4 [16];
  undefined8 uStack_50;
  undefined8 uStack_48;
  undefined8 uStack_40;
  long lStack_38;
  
  auVar4 = ___stack_chk_fail();
  lVar1 = auVar4._0_8_;
  lStack_38 = *(long *)PTR____stack_chk_guard_009b01e8;
  if (param_4 == 0x1b) {
    if (param_3 != 0x15e) {
      func_0x0073c9e4(lVar1,"Couldn\'t use REST");
      uVar2 = 0x1f;
      if (*(long *)PTR____stack_chk_guard_009b01e8 == lStack_38) {
        return;
      }
      goto LAB_007485a0;
    }
    uVar2 = func_0x0076e34c(lVar1,auVar4._8_8_ + 1000,"RETR %s");
    if ((int)uVar2 == 0) {
      unaff_x20 = *(ulong **)(lVar1 + 0x18);
      if (lVar1 == 0) goto LAB_007484b0;
      if (*(char *)((long)unaff_x20 + 0x4f6) == ' ') goto LAB_007484b0;
      if (-1 < *(char *)(lVar1 + 0xa1d)) goto LAB_007484b0;
      if (*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                   lVar1 + 0x18) == 0) goto LAB_007485a4;
      if (*(int *)(*(long *)(
                            "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                            + lVar1 + 0x18) + 8) < 1) goto LAB_007484b0;
      if (iRam0000000000a2b570 < 1) goto LAB_007484b0;
      goto LAB_00748488;
    }
  }
  else {
    if (param_3 == 0x15e) {
      uStack_40 = 0xa0d73657479;
      uStack_48 = _UNK_008cd214;
      uStack_50 = _UNK_008cd20c;
      uVar2 = _strlen(&uStack_50);
      unaff_x20 = (ulong *)(lVar1 + 0xa1a);
      uVar3 = *unaff_x20;
      *unaff_x20 = uVar3 | 0x8000000;
      uVar2 = func_0x007738a0(lVar1,4,&uStack_50,uVar2);
      *unaff_x20 = *unaff_x20 & 0xfffffffff0000000 | *unaff_x20 & 0x7ffffff | uVar3 & 0x8000000;
      if ((int)uVar2 != 0) goto LAB_00748548;
    }
    uVar2 = func_0x0074a344(lVar1);
  }
LAB_00748548:
  if (*(long *)PTR____stack_chk_guard_009b01e8 == lStack_38) {
    return;
  }
LAB_007485a0:
  do {
    ___stack_chk_fail(uVar2);
LAB_007485a4:
    if (0 < iRam0000000000a2b570) {
LAB_00748488:
      func_0x0073cfbc(lVar1,"[%s] -> [%s]");
    }
LAB_007484b0:
    uVar2 = 0;
    *(undefined1 *)((long)unaff_x20 + 0x4f6) = 0x20;
  } while (*(long *)PTR____stack_chk_guard_009b01e8 != lStack_38);
  return;
}

