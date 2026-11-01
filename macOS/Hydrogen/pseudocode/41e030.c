
undefined8 FUN_0041e030(ulong param_1)

{
  long lVar1;
  long *plVar2;
  ulong uVar3;
  ulong unaff_x20;
  long unaff_x21;
  undefined8 uVar4;
  long unaff_x23;
  code *unaff_x24;
  long unaff_x25;
  undefined8 *puVar5;
  undefined8 uStack0000000000000008;
  
  if ((param_1 & 3) == 1) {
    uVar4 = *(undefined8 *)(unaff_x21 + -1);
    puVar5 = *(undefined8 **)(unaff_x21 + 7);
    if ((code *)*puVar5 != (code *)0x0) {
      (*(code *)*puVar5)(uVar4);
    }
    if (puVar5[1] != 0) {
      func_0x00187bd4(uVar4,puVar5[1],puVar5[2]);
    }
    func_0x00187bd4((undefined8 *)(unaff_x21 + -1),0x18,8);
  }
  if ((((unaff_x20 & 1) == 0) && ((*(ulong *)(unaff_x25 + 0x548) & 0x7fffffffffffffff) != 0)) &&
     (uVar3 = func_0x007a1140(), (uVar3 & 1) == 0)) {
    *(undefined1 *)(unaff_x23 + 0x18) = 1;
  }
  _pthread_mutex_unlock(*(undefined8 *)(unaff_x23 + 0x10));
  plVar2 = (long *)(*unaff_x24)();
  uStack0000000000000008 = (long *)*plVar2;
  *plVar2 = unaff_x23;
  if (uStack0000000000000008 != (long *)0x0) {
    lVar1 = *uStack0000000000000008;
    *uStack0000000000000008 = lVar1 + -1;
    LORelease();
    if (lVar1 == 1) {
      DataMemoryBarrier(2,1);
      func_0x00403ba4(&uStack0000000000000008);
    }
  }
  return 1;
}

