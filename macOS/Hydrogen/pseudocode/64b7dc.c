
long FUN_0064b7dc(long param_1)

{
  bool in_ZR;
  undefined1 *puVar1;
  ulong in_x9;
  undefined1 *puVar3;
  undefined1 *puVar2;
  long in_x11;
  long lVar4;
  ulong uVar5;
  undefined8 *puVar6;
  undefined8 *puVar7;
  undefined8 *unaff_x19;
  long unaff_x20;
  undefined1 *unaff_x21;
  long unaff_x22;
  long unaff_x24;
  
  if (!in_ZR) {
    if ((in_x9 & 0x38) == 0) {
      puVar1 = (undefined1 *)(param_1 + in_x11);
      puVar3 = (undefined1 *)(unaff_x22 + in_x11);
    }
    else {
      uVar5 = in_x9 & 0xfffffffffffffff8;
      lVar4 = in_x11 - uVar5;
      puVar6 = (undefined8 *)(unaff_x24 + in_x11 + unaff_x20);
      puVar7 = (undefined8 *)(unaff_x22 + in_x11);
      do {
        *puVar6 = *puVar7;
        lVar4 = lVar4 + 8;
        puVar6 = puVar6 + 1;
        puVar7 = puVar7 + 1;
      } while (lVar4 != 0);
      puVar1 = (undefined1 *)(param_1 + uVar5);
      puVar3 = (undefined1 *)(unaff_x22 + uVar5);
      if (in_x9 == uVar5) goto LAB_0064b838;
    }
    do {
      puVar2 = puVar3 + 1;
      *puVar1 = *puVar3;
      puVar1 = puVar1 + 1;
      puVar3 = puVar2;
    } while (puVar2 != unaff_x21);
  }
LAB_0064b838:
  if (*(char *)((long)unaff_x19 + 0x17) < '\0') {
    unaff_x19 = (undefined8 *)*unaff_x19;
  }
  return (long)unaff_x19 + unaff_x20;
}

