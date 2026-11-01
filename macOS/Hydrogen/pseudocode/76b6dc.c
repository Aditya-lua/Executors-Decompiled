
void FUN_0076b6dc(long param_1,undefined8 *param_2,undefined8 *param_3)

{
  long lVar1;
  undefined8 uVar2;
  undefined1 auVar3 [16];
  
  if ((*(byte *)(param_1 + 0x271) >> 3 & 1) == 0) {
    if (*(long *)(param_1 + 0xf0) == 0) {
      *param_2 = 0;
      param_2[1] = 0;
      *param_3 = 0xffffffffffffffff;
      return;
    }
    auVar3 = func_0x00782d28();
    lVar1 = func_0x0077e2a4(0,0,*(undefined8 *)(param_1 + 0xf0));
    *(long *)(param_1 + 0xf0) = lVar1;
    if (lVar1 == 0) {
      *param_2 = 0;
      param_2[1] = 0;
      lVar1 = *(long *)(param_1 + 0xf0);
    }
    else {
      uVar2 = *(undefined8 *)(lVar1 + 0x20);
      param_2[1] = *(undefined8 *)(lVar1 + 0x28);
      *param_2 = uVar2;
      lVar1 = *(long *)(param_1 + 0xf0);
    }
    if ((lVar1 != 0) &&
       (lVar1 = func_0x00782ea8(*(undefined8 *)(lVar1 + 0x20),*(undefined8 *)(lVar1 + 0x28),
                                auVar3._0_8_,auVar3._8_8_), 0 < lVar1)) {
      uVar2 = func_0x00782e34(*(undefined8 *)(*(long *)(param_1 + 0xf0) + 0x20),
                              *(undefined8 *)(*(long *)(param_1 + 0xf0) + 0x28),auVar3._0_8_,
                              auVar3._8_8_);
      *param_3 = uVar2;
      return;
    }
  }
  *param_3 = 0;
  return;
}

