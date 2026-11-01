
undefined8 FUN_00094d30(long *param_1,long param_2,long param_3)

{
  ulong uVar1;
  undefined8 uVar2;
  long lVar3;
  long lVar4;
  undefined8 *puVar5;
  long lVar6;
  
  uVar2 = 0x10;
  if ((param_1 != (long *)0x0) && (param_2 != 0)) {
    if (param_3 == 0) {
      return 0x11;
    }
    lVar3 = _malloc(0x28);
    *param_1 = lVar3;
    if (lVar3 == 0) {
      return 0x100;
    }
    *(long *)(lVar3 + 0x18) = param_3;
    uVar1 = *(ulong *)(param_2 + 0x30);
    if (uVar1 <= *(ulong *)(param_2 + 0x28)) {
      lVar3 = uVar1 << 1;
      if (uVar1 == 0) {
        lVar3 = 1;
      }
      if (*(long *)(param_2 + 0x20) == 0) {
        lVar4 = _malloc(lVar3 << 3);
      }
      else {
        lVar4 = _realloc();
      }
      if (lVar4 != 0) {
        *(long *)(param_2 + 0x20) = lVar4;
        *(long *)(param_2 + 0x30) = lVar3;
        puVar5 = (undefined8 *)*param_1;
        *(undefined1 *)(puVar5 + 4) = 8;
        puVar5[1] = 0;
        puVar5[2] = 0;
        *puVar5 = 0;
        lVar3 = *param_1;
        lVar6 = *(long *)(param_2 + 0x28);
        *(long *)(param_2 + 0x28) = lVar6 + 1;
        *(long *)(lVar4 + lVar6 * 8) = lVar3;
        return 0;
      }
      if (*param_1 != 0) {
        _free();
      }
      *(undefined8 *)(param_2 + 0x20) = 0;
      *(undefined8 *)(param_2 + 0x30) = 0;
      return 0x100;
    }
    uVar2 = 0xffffffff;
  }
  return uVar2;
}

