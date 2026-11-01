
void FUN_00676a14(long param_1,undefined8 param_2,ulong param_3)

{
  code *pcVar1;
  long lVar2;
  ulong uVar3;
  long lVar4;
  undefined8 uVar5;
  long *plVar6;
  ulong uVar7;
  ulong uVar8;
  undefined1 auVar9 [16];
  byte abStack_58 [24];
  
  ___cxa_guard_abort(param_1 + 0x90);
  auVar9 = __Unwind_Resume();
  plVar6 = auVar9._8_8_;
  lVar2 = auVar9._0_8_;
  uVar3 = (**(code **)(*plVar6 + 0x98))(plVar6);
  if (uVar3 < param_3) {
    uVar5 = ___cxa_allocate_exception(0x28);
    func_0x0000a968(abStack_58,"PolynomialMod2: input length is too small");
    func_0x0002703c(uVar5,abStack_58);
    ___cxa_throw(uVar5,&DAT_009b2ee0,&DAT_000270bc);
                    /* WARNING: Does not return */
    pcVar1 = (code *)SoftwareBreakpoint(1,0x676b84);
    (*pcVar1)();
  }
  uVar3 = param_3 + 7;
  uVar8 = uVar3 >> 3;
  uVar7 = *(ulong *)(lVar2 + 0x10);
  lVar4 = *(long *)(lVar2 + 0x18);
  if (uVar7 != uVar8) {
    if (lVar4 != 0) {
      if (uVar7 != 0) {
        do {
          *(undefined8 *)(lVar4 + -8 + uVar7 * 8) = 0;
          uVar7 = uVar7 - 1;
        } while (uVar7 != 0);
      }
      func_0x00611644();
    }
    func_0x006108a0(uVar8);
    if (uVar3 < 8) {
      *(ulong *)(lVar2 + 0x10) = 0;
      *(undefined8 *)(lVar2 + 0x18) = 0;
      goto code_r0x00676ac4;
    }
    lVar4 = func_0x006115d0(uVar3 & 0xfffffffffffffff8);
  }
  *(ulong *)(lVar2 + 0x10) = uVar8;
  *(long *)(lVar2 + 0x18) = lVar4;
  if (lVar4 != 0) {
    _bzero(lVar4,uVar3 & 0xfffffffffffffff8);
  }
code_r0x00676ac4:
  *(undefined8 *)(lVar2 + 8) = 0x1fffffffffffffff;
  if (param_3 != 0) {
    uVar3 = param_3 * 8;
    do {
      param_3 = param_3 - 1;
      uVar3 = uVar3 - 8;
      (**(code **)(*plVar6 + 0xa8))(plVar6,abStack_58);
      *(ulong *)(*(long *)(lVar2 + 0x18) + (param_3 & 0xfffffffffffffff8)) =
           *(ulong *)(*(long *)(lVar2 + 0x18) + (param_3 & 0xfffffffffffffff8)) |
           (ulong)abStack_58[0] << (uVar3 & 0x38);
    } while (param_3 != 0);
  }
  return;
}

