
long * FUN_00086f5c(undefined8 param_1,long param_2,long param_3)

{
  long lVar1;
  undefined8 *puVar2;
  ulong uVar3;
  undefined8 uVar4;
  long *plVar5;
  long *unaff_x19;
  long unaff_x20;
  long unaff_x21;
  long unaff_x22;
  ulong unaff_x23;
  undefined8 uStack0000000000000008;
  undefined7 uStack0000000000000018;
  
  if ((param_3 - param_2 < 1) ||
     (lVar1 = (**(code **)(*unaff_x19 + 0x60))(), lVar1 == param_3 - param_2)) {
    if (0 < (long)unaff_x23) {
      if (0x7ffffffffffffff7 < unaff_x23) {
        uVar4 = func_0x0001748c(&uStack0000000000000008);
        if ((long)_uStack0000000000000018 < 0) {
          __ZdlPv(uStack0000000000000008);
        }
        plVar5 = (long *)__Unwind_Resume(uVar4);
        *(undefined2 *)((long)plVar5 + 4) = 0;
        *(undefined4 *)plVar5 = 0;
        return plVar5;
      }
      if (unaff_x23 < 0x17) {
        _uStack0000000000000018 = CONCAT17((char)unaff_x23,uStack0000000000000018);
        puVar2 = &uStack0000000000000008;
      }
      else {
        uVar3 = (unaff_x23 & 0xfffffffffffffff8) + 8;
        if ((unaff_x23 | 7) != 0x17) {
          uVar3 = unaff_x23 | 7;
        }
        puVar2 = (undefined8 *)__Znwm(uVar3 + 1);
        _uStack0000000000000018 = uVar3 + 1 | 0x8000000000000000;
        uStack0000000000000008 = puVar2;
      }
      _memset(puVar2);
      *(undefined1 *)((long)puVar2 + unaff_x23) = 0;
      uVar3 = (**(code **)(*unaff_x19 + 0x60))();
      if ((long)_uStack0000000000000018 < 0) {
        __ZdlPv(uStack0000000000000008);
      }
      if (uVar3 != unaff_x23) {
        return (long *)0x0;
      }
    }
    if ((unaff_x22 - unaff_x21 < 1) ||
       (lVar1 = (**(code **)(*unaff_x19 + 0x60))(), lVar1 == unaff_x22 - unaff_x21)) {
      *(undefined8 *)(unaff_x20 + 0x18) = 0;
      return unaff_x19;
    }
  }
  return (long *)0x0;
}

