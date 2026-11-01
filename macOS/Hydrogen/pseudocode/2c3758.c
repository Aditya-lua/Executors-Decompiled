
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

long * FUN_002c3758(undefined8 param_1,undefined8 param_2,long *param_3)

{
  long *plVar1;
  long lVar2;
  long *unaff_x19;
  long unaff_x29;
  undefined1 auVar3 [16];
  undefined8 uStack_1a0;
  undefined8 uStack_198;
  undefined8 uStack_190;
  undefined8 uStack_188;
  undefined8 uStack_180;
  undefined8 uStack_178;
  undefined8 uStack_170;
  undefined8 uStack_168;
  undefined8 uStack_160;
  undefined8 uStack_158;
  undefined8 uStack_d0;
  long lStack_c8;
  long lStack_a0;
  undefined8 uStack_98;
  undefined8 uStack_90;
  undefined8 uStack_88;
  undefined8 uStack_80;
  undefined8 uStack_78;
  undefined8 uStack_70;
  undefined8 uStack_68;
  undefined8 uStack_60;
  undefined8 uStack_58;
  undefined8 uStack_50;
  undefined4 uStack_48;
  undefined4 uStack_44;
  undefined4 uStack_40;
  undefined8 uStack_3c;
  undefined4 uStack_34;
  long lStack_28;
  
  func_0x0036e464();
  if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x18)) {
    return unaff_x19;
  }
  auVar3 = ___stack_chk_fail();
  plVar1 = &lStack_a0;
  lStack_28 = *(long *)PTR____stack_chk_guard_009b01e8;
  uStack_3c = 0;
  uStack_40 = 0;
  uStack_58 = 0;
  uStack_60 = 0;
  uStack_48 = 0;
  uStack_44 = 0;
  uStack_50 = 0;
  uStack_78 = 0;
  uStack_80 = 0;
  uStack_68 = 0;
  uStack_70 = 0;
  uStack_98 = _UNK_0082fb58;
  lStack_a0 = _UNK_0082fb50;
  uStack_88 = _UNK_0082fb68;
  uStack_90 = _UNK_0082fb60;
  uStack_34 = 0x20;
  func_0x00300040(&lStack_a0,auVar3._0_8_,auVar3._8_8_);
  func_0x003001c4(param_3,0x20);
  func_0x0036e464(&lStack_a0,0x70);
  if (*(long *)PTR____stack_chk_guard_009b01e8 == lStack_28) {
    return param_3;
  }
  auVar3 = ___stack_chk_fail();
  lStack_c8 = *(long *)PTR____stack_chk_guard_009b01e8;
  uStack_198 = _UNK_0082fb18;
  uStack_1a0 = _UNK_0082fb10;
  uStack_188 = _UNK_0082fb28;
  uStack_190 = _UNK_0082fb20;
  uStack_178 = _UNK_0082fb38;
  uStack_180 = _UNK_0082fb30;
  uStack_168 = _UNK_0082fb48;
  uStack_170 = _UNK_0082fb40;
  uStack_160 = 0;
  uStack_158 = 0;
  uStack_d0 = _UNK_00830228;
  func_0x002b603c(&uStack_1a0,auVar3._0_8_,auVar3._8_8_);
  if (uStack_d0._4_4_ == 0x30) {
    func_0x00300ef8(plVar1,0x30,&uStack_1a0);
    func_0x0036e464(&uStack_1a0,0xd8);
    if (*(long *)PTR____stack_chk_guard_009b01e8 == lStack_c8) {
      return plVar1;
    }
  }
  else {
    func_0x0079e7f4();
  }
  ___stack_chk_fail();
  plVar1 = (long *)func_0x0036e274(0x10);
  if (plVar1 == (long *)0x0) {
    return (long *)0x0;
  }
  lVar2 = func_0x0036e31c(0x18);
  if (lVar2 != 0) {
    *(undefined4 *)(lVar2 + 0x14) = 1;
  }
  *plVar1 = lVar2;
  lVar2 = func_0x0036e31c(0x18);
  if (lVar2 == 0) {
    plVar1[1] = 0;
  }
  else {
    *(undefined4 *)(lVar2 + 0x14) = 1;
    plVar1[1] = lVar2;
    if (*plVar1 != 0) {
      return plVar1;
    }
  }
  func_0x002c398c(plVar1);
  return (long *)0x0;
}

