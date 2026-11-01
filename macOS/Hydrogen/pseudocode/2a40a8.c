
ulong FUN_002a40a8(undefined8 param_1,undefined1 *param_2,undefined1 *param_3,ulong param_4,
                  long param_5)

{
  int iVar1;
  ulong uVar2;
  long unaff_x29;
  undefined1 auVar3 [16];
  undefined1 uStack0000000000000008;
  undefined1 uStack0000000000000098;
  
  if ((long)*(int *)(param_5 + 0x20) == param_4) {
    if (param_4 < 2) {
      if (param_2 == param_3) {
        func_0x002ac3fc(&uStack0000000000000008,param_2,param_4,&uStack0000000000000098);
        func_0x0036e464(&uStack0000000000000098,param_4 << 4);
      }
      else {
        func_0x002abe4c(&uStack0000000000000008,param_2,param_4,param_3,param_4);
      }
      param_3 = &uStack0000000000000008;
      iVar1 = func_0x002ab2b0(param_1,param_4,param_3,param_4 << 1,param_5);
      if (iVar1 != 0) {
        uVar2 = func_0x0036e464(&uStack0000000000000008,param_4 << 4);
        goto LAB_002a4150;
      }
    }
    else {
      uVar2 = func_0x00381a00(param_1,param_2,param_3,*(undefined8 *)(param_5 + 0x18),param_5 + 0x30
                              ,param_4);
      if ((int)uVar2 != 0) {
LAB_002a4150:
        if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x38)) {
          return uVar2;
        }
        goto LAB_002a4184;
      }
    }
  }
  _abort();
LAB_002a4184:
  auVar3 = ___stack_chk_fail();
  if ((ulong)param_3 >> 6 < auVar3._8_8_) {
    return (ulong)((uint)(*(ulong *)(auVar3._0_8_ + ((ulong)param_3 >> 6) * 8) >>
                         ((ulong)param_3 & 0x3f)) & 1);
  }
  return 0;
}

