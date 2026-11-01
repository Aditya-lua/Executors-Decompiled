
undefined1  [16] FUN_005b0e90(long param_1)

{
  long lVar1;
  long *plVar2;
  long lVar3;
  long *plVar4;
  undefined1 auVar5 [16];
  
  lVar1 = *(long *)(param_1 + 8);
  plVar2 = *(long **)(param_1 + 0x10);
  plVar4 = plVar2;
  for (lVar3 = *(long *)(param_1 + 0x18); lVar3 != 0; lVar3 = lVar3 + -1) {
    if (*plVar4 != 0xc) {
      func_0x0059ce88(plVar4);
    }
    func_0x0059ce88(plVar4 + 8);
    plVar4 = plVar4 + 0x10;
  }
  if (lVar1 != 0) {
    func_0x00187bd4(plVar2,lVar1 << 7,8);
  }
  auVar5._8_8_ = 0x28;
  auVar5._0_8_ = &UNK_008af8ee;
  return auVar5;
}

