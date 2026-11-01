
undefined8 FUN_006d9950(long param_1,long param_2)

{
  ulong uVar1;
  long *plVar2;
  ulong uVar3;
  long lVar4;
  ulong uVar5;
  undefined1 auVar6 [16];
  
  if (*(long *)(param_2 + 0x38) != 0) {
    lVar4 = 0;
    uVar5 = 0;
    do {
      auVar6 = func_0x006da0e0(param_1,*(undefined8 *)(*(long *)(param_2 + 0x30) + uVar5 * 8));
      if ((auVar6._8_8_ != 0) && (uVar5 < *(ulong *)(param_2 + 0x28))) {
        plVar2 = (long *)func_0x006d9030(param_1 + 0x18,*(long *)(param_2 + 0x20) + lVar4);
        *plVar2 = auVar6._8_8_;
      }
      uVar1 = *(long *)(param_1 + 0x40) + auVar6._0_8_;
      uVar3 = uVar1 & 0x8080808080808080;
      *(ulong *)(param_1 + 0x40) = uVar3 - (uVar3 >> 7) | uVar1 & 0x7f7f7f7f7f7f7f7f;
      *(undefined8 *)(param_1 + 0x48) = 0;
      uVar5 = uVar5 + 1;
      lVar4 = lVar4 + 8;
    } while (uVar5 < *(ulong *)(param_2 + 0x38));
  }
  return 0;
}

