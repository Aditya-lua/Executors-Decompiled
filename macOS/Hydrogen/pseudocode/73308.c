
void FUN_00073308(long param_1)

{
  long lVar1;
  bool in_ZR;
  undefined8 *puVar2;
  long lVar3;
  undefined8 uVar4;
  long unaff_x19;
  long unaff_x20;
  long unaff_x22;
  long lVar5;
  long unaff_x23;
  long lVar6;
  
  lVar5 = unaff_x19;
  if (!in_ZR) {
    lVar5 = param_1;
  }
  if (lVar5 == unaff_x22) {
    puVar2 = (undefined8 *)__Znwm(0x10);
    uVar4 = *(undefined8 *)(unaff_x23 + 8);
    *puVar2 = &UNK_009b2fd8;
    puVar2[1] = uVar4;
    *(undefined8 **)(unaff_x23 + 8) = puVar2;
    *(undefined8 *)(unaff_x20 + 0x38) = *(undefined8 *)(*(long *)(unaff_x20 + 0x38) + 8);
    if (lVar5 != unaff_x19) {
      lVar5 = lVar5 + 1;
    }
  }
  else {
    func_0x00072fe8();
    if (lVar5 != unaff_x19) {
      lVar5 = lVar5 + 1;
    }
  }
  if (lVar5 != unaff_x19) {
    lVar6 = *(long *)(unaff_x20 + 0x38);
    do {
      lVar3 = _memchr(lVar5,10,unaff_x19 - lVar5);
      lVar1 = unaff_x19;
      if (lVar3 != 0) {
        lVar1 = lVar3;
      }
      if (lVar1 == lVar5) {
        puVar2 = (undefined8 *)__Znwm(0x10);
        uVar4 = *(undefined8 *)(lVar6 + 8);
        *puVar2 = &UNK_009b2fd8;
        puVar2[1] = uVar4;
        *(undefined8 **)(lVar6 + 8) = puVar2;
        *(undefined8 *)(unaff_x20 + 0x38) = *(undefined8 *)(*(long *)(unaff_x20 + 0x38) + 8);
      }
      else {
        func_0x00072fe8();
      }
      puVar2 = (undefined8 *)__Znwm(0x18);
      uVar4 = *(undefined8 *)(lVar6 + 8);
      puVar2[1] = *(undefined8 *)(unaff_x23 + 8);
      puVar2[2] = uVar4;
      *puVar2 = &UNK_009b3548;
      *(undefined8 **)(unaff_x23 + 8) = puVar2;
      *(undefined8 *)(lVar6 + 8) = 0;
      puVar2 = (undefined8 *)__Znwm(0x10);
      uVar4 = *(undefined8 *)(*(long *)(unaff_x20 + 0x38) + 8);
      *puVar2 = &UNK_009b2fd8;
      puVar2[1] = uVar4;
      *(undefined8 **)(lVar6 + 8) = puVar2;
      *(undefined8 *)(*(long *)(unaff_x20 + 0x38) + 8) = 0;
      puVar2 = (undefined8 *)__Znwm(0x10);
      uVar4 = *(undefined8 *)(lVar6 + 8);
      *puVar2 = &UNK_009b3590;
      puVar2[1] = uVar4;
      *(undefined8 **)(*(long *)(unaff_x20 + 0x38) + 8) = puVar2;
      lVar6 = *(long *)(lVar6 + 8);
      *(long *)(unaff_x20 + 0x38) = lVar6;
      if (lVar1 != unaff_x19) {
        lVar1 = lVar1 + 1;
      }
      lVar5 = lVar1;
    } while (lVar1 != unaff_x19);
  }
  return;
}

