
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_006b171c(long param_1)

{
  undefined8 *puVar1;
  undefined8 *puVar2;
  long lVar3;
  undefined8 *puVar4;
  long unaff_x19;
  long *unaff_x21;
  long unaff_x22;
  long unaff_x23;
  long unaff_x24;
  undefined4 unaff_w25;
  long unaff_x26;
  undefined8 uVar5;
  undefined8 uVar6;
  
  lVar3 = __Znwm(param_1 << 3);
  puVar4 = (undefined8 *)(lVar3 + unaff_x24 * 0x18);
  *puVar4 = 6;
  *(undefined4 *)(puVar4 + 1) = unaff_w25;
  *(undefined8 *)((long)puVar4 + 0xc) = _UNK_008c6dcc;
  *(undefined4 *)((long)puVar4 + 0x14) = _UNK_008c6dd4;
  puVar2 = puVar4 + 3;
  if (unaff_x22 != unaff_x23) {
    do {
      uVar6 = *(undefined8 *)(unaff_x22 + -0x10);
      uVar5 = *(undefined8 *)(unaff_x22 + -0x18);
      puVar1 = (undefined8 *)(unaff_x22 + -8);
      unaff_x22 = unaff_x22 + -0x18;
      puVar4[-1] = *puVar1;
      puVar4[-2] = uVar6;
      puVar4[-3] = uVar5;
      puVar4 = puVar4 + -3;
    } while (unaff_x22 != unaff_x23);
    unaff_x22 = *unaff_x21;
  }
  *(undefined8 **)(unaff_x19 + 0x58) = puVar4;
  *(undefined8 **)(unaff_x19 + 0x60) = puVar2;
  *(long *)(unaff_x19 + 0x68) = lVar3 + unaff_x26 * 0x18;
  if (unaff_x22 != 0) {
    __ZdlPv(unaff_x22);
  }
  *(undefined8 **)(unaff_x19 + 0x60) = puVar2;
  return;
}

