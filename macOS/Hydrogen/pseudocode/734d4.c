
void FUN_000734d4(void)

{
  long lVar1;
  long *plVar2;
  undefined8 *puVar3;
  long lVar4;
  long lVar5;
  undefined8 uVar6;
  long unaff_x19;
  long unaff_x20;
  long unaff_x21;
  long unaff_x23;
  long unaff_x24;
  
  plVar2 = (long *)__Znwm(0x10);
  lVar5 = *(long *)(unaff_x23 + 8);
  *plVar2 = unaff_x24 + 0x10;
  plVar2[1] = lVar5;
  *(long **)(unaff_x23 + 8) = plVar2;
  *(undefined8 *)(unaff_x20 + 0x38) = *(undefined8 *)(*(long *)(unaff_x20 + 0x38) + 8);
  if (unaff_x21 != unaff_x19) {
    unaff_x21 = unaff_x21 + 1;
  }
  if (unaff_x21 != unaff_x19) {
    lVar5 = *(long *)(unaff_x20 + 0x38);
    do {
      lVar4 = _memchr(unaff_x21,10,unaff_x19 - unaff_x21);
      lVar1 = unaff_x19;
      if (lVar4 != 0) {
        lVar1 = lVar4;
      }
      if (lVar1 == unaff_x21) {
        plVar2 = (long *)__Znwm(0x10);
        lVar4 = *(long *)(lVar5 + 8);
        *plVar2 = unaff_x24 + 0x10;
        plVar2[1] = lVar4;
        *(long **)(lVar5 + 8) = plVar2;
        *(undefined8 *)(unaff_x20 + 0x38) = *(undefined8 *)(*(long *)(unaff_x20 + 0x38) + 8);
      }
      else {
        func_0x00073160();
      }
      puVar3 = (undefined8 *)__Znwm(0x18);
      uVar6 = *(undefined8 *)(lVar5 + 8);
      puVar3[1] = *(undefined8 *)(unaff_x23 + 8);
      puVar3[2] = uVar6;
      *puVar3 = &UNK_009b3548;
      *(undefined8 **)(unaff_x23 + 8) = puVar3;
      *(undefined8 *)(lVar5 + 8) = 0;
      plVar2 = (long *)__Znwm(0x10);
      lVar4 = *(long *)(*(long *)(unaff_x20 + 0x38) + 8);
      *plVar2 = unaff_x24 + 0x10;
      plVar2[1] = lVar4;
      *(long **)(lVar5 + 8) = plVar2;
      *(undefined8 *)(*(long *)(unaff_x20 + 0x38) + 8) = 0;
      puVar3 = (undefined8 *)__Znwm(0x10);
      uVar6 = *(undefined8 *)(lVar5 + 8);
      *puVar3 = &UNK_009b3590;
      puVar3[1] = uVar6;
      *(undefined8 **)(*(long *)(unaff_x20 + 0x38) + 8) = puVar3;
      lVar5 = *(long *)(lVar5 + 8);
      *(long *)(unaff_x20 + 0x38) = lVar5;
      if (lVar1 != unaff_x19) {
        lVar1 = lVar1 + 1;
      }
      unaff_x21 = lVar1;
    } while (lVar1 != unaff_x19);
  }
  return;
}

