
undefined8
FUN_00155ed0(undefined8 param_1,long param_2,undefined8 param_3,undefined8 param_4,
            undefined8 *param_5,undefined8 param_6,undefined8 param_7,long param_8,
            undefined1 *param_9)

{
  long in_x9;
  long in_x10;
  undefined8 *puVar1;
  long in_x11;
  long in_x12;
  undefined1 *puVar2;
  undefined1 *puVar3;
  long in_x13;
  long in_x14;
  undefined8 *puVar4;
  long in_x15;
  long lVar5;
  long in_x16;
  undefined8 unaff_x19;
  long unaff_x20;
  undefined1 *unaff_x21;
  long unaff_x22;
  undefined1 *puVar6;
  
  lVar5 = in_x15 - in_x16;
  puVar1 = (undefined8 *)(in_x15 + in_x14 + (in_x10 - param_2));
  puVar4 = (undefined8 *)(in_x15 + in_x14);
  do {
    *puVar4 = *puVar1;
    lVar5 = lVar5 + 8;
    puVar1 = puVar1 + 1;
    puVar4 = puVar4 + 1;
  } while (lVar5 != 0);
  puVar6 = (undefined1 *)(in_x11 + in_x16);
  puVar2 = (undefined1 *)(in_x12 + in_x16);
  if (in_x13 != in_x16) {
    do {
      puVar3 = puVar2 + 1;
      *puVar2 = *puVar6;
      puVar6 = puVar6 + 1;
      puVar2 = puVar3;
    } while (puVar3 < unaff_x21);
  }
  *param_5 = param_1;
  if ((ulong)((long)unaff_x21 - unaff_x20) < *(ulong *)(unaff_x22 + 0x10)) {
    if ((ulong)((long)unaff_x21 - param_8) < *(ulong *)(unaff_x22 + 0x10)) {
      return 0xffffffffffffffec;
    }
    puVar6 = unaff_x21 + (-unaff_x20 - in_x9);
    if (puVar6 + (long)(param_9 + *(long *)(unaff_x22 + 8)) <= param_9) {
      _memmove();
      return unaff_x19;
    }
    _memmove();
    unaff_x21 = unaff_x21 + -(long)puVar6;
    *(undefined1 **)(unaff_x22 + 8) = puVar6 + *(long *)(unaff_x22 + 8);
  }
  func_0x00155fe8(unaff_x21);
  return unaff_x19;
}

