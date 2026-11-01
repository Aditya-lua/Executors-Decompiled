
void FUN_0007353c(long param_1)

{
  long lVar1;
  long *plVar2;
  undefined8 *puVar3;
  long lVar4;
  undefined8 uVar5;
  long unaff_x19;
  long unaff_x20;
  long unaff_x22;
  long unaff_x23;
  long unaff_x24;
  long unaff_x25;
  undefined8 unaff_x26;
  
  do {
    lVar4 = _memchr(unaff_x22,10,unaff_x19 - unaff_x22);
    lVar1 = unaff_x19;
    if (lVar4 != 0) {
      lVar1 = lVar4;
    }
    if (lVar1 == unaff_x22) {
      puVar3 = (undefined8 *)__Znwm(0x10);
      uVar5 = *(undefined8 *)(unaff_x25 + 8);
      *puVar3 = unaff_x26;
      puVar3[1] = uVar5;
      *(undefined8 **)(unaff_x25 + 8) = puVar3;
      *(undefined8 *)(unaff_x20 + 0x38) = *(undefined8 *)(*(long *)(unaff_x20 + 0x38) + 8);
    }
    else {
      func_0x00073160();
    }
    plVar2 = (long *)__Znwm(0x18);
    lVar4 = *(long *)(unaff_x25 + 8);
    plVar2[1] = *(long *)(unaff_x23 + 8);
    plVar2[2] = lVar4;
    *plVar2 = param_1 + 0x10;
    *(long **)(unaff_x23 + 8) = plVar2;
    *(undefined8 *)(unaff_x25 + 8) = 0;
    plVar2 = (long *)__Znwm(0x10);
    lVar4 = *(long *)(*(long *)(unaff_x20 + 0x38) + 8);
    *plVar2 = unaff_x24 + 0x10;
    plVar2[1] = lVar4;
    *(long **)(unaff_x25 + 8) = plVar2;
    *(undefined8 *)(*(long *)(unaff_x20 + 0x38) + 8) = 0;
    puVar3 = (undefined8 *)__Znwm(0x10);
    uVar5 = *(undefined8 *)(unaff_x25 + 8);
    *puVar3 = &UNK_009b3590;
    puVar3[1] = uVar5;
    *(undefined8 **)(*(long *)(unaff_x20 + 0x38) + 8) = puVar3;
    unaff_x25 = *(long *)(unaff_x25 + 8);
    *(long *)(unaff_x20 + 0x38) = unaff_x25;
    if (lVar1 != unaff_x19) {
      lVar1 = lVar1 + 1;
    }
    unaff_x22 = lVar1;
  } while (lVar1 != unaff_x19);
  return;
}

