
void FUN_0002b8bc(long param_1)

{
  long lVar1;
  long *plVar2;
  undefined8 *puVar3;
  long lVar4;
  undefined8 uVar5;
  long unaff_x19;
  long unaff_x20;
  long unaff_x21;
  long unaff_x23;
  long unaff_x24;
  long unaff_x25;
  undefined8 unaff_x26;
  undefined8 unaff_x27;
  undefined8 unaff_x28;
  
  while( true ) {
    *(undefined8 *)(param_1 + 8) = 0;
    puVar3 = (undefined8 *)__Znwm(0x10);
    uVar5 = *(undefined8 *)(unaff_x25 + 8);
    *puVar3 = unaff_x28;
    puVar3[1] = uVar5;
    *(undefined8 **)(*(long *)(unaff_x20 + 0x38) + 8) = puVar3;
    unaff_x25 = *(long *)(unaff_x25 + 8);
    *(long *)(unaff_x20 + 0x38) = unaff_x25;
    if (unaff_x21 != unaff_x19) {
      unaff_x21 = unaff_x21 + 1;
    }
    if (unaff_x21 == unaff_x19) break;
    lVar4 = _memchr(unaff_x21,10,unaff_x19 - unaff_x21);
    lVar1 = unaff_x19;
    if (lVar4 != 0) {
      lVar1 = lVar4;
    }
    if (lVar1 == unaff_x21) {
      puVar3 = (undefined8 *)__Znwm(0x10);
      uVar5 = *(undefined8 *)(unaff_x25 + 8);
      *puVar3 = unaff_x26;
      puVar3[1] = uVar5;
      *(undefined8 **)(unaff_x25 + 8) = puVar3;
      *(undefined8 *)(unaff_x20 + 0x38) = *(undefined8 *)(*(long *)(unaff_x20 + 0x38) + 8);
    }
    else {
      func_0x0002b468();
    }
    puVar3 = (undefined8 *)__Znwm(0x18);
    uVar5 = *(undefined8 *)(unaff_x25 + 8);
    puVar3[1] = *(undefined8 *)(unaff_x23 + 8);
    puVar3[2] = uVar5;
    *puVar3 = unaff_x27;
    *(undefined8 **)(unaff_x23 + 8) = puVar3;
    *(undefined8 *)(unaff_x25 + 8) = 0;
    plVar2 = (long *)__Znwm(0x10);
    lVar4 = *(long *)(*(long *)(unaff_x20 + 0x38) + 8);
    *plVar2 = unaff_x24 + 0x10;
    plVar2[1] = lVar4;
    *(long **)(unaff_x25 + 8) = plVar2;
    param_1 = *(long *)(unaff_x20 + 0x38);
    unaff_x21 = lVar1;
  }
  return;
}

