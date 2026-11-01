
/* WARNING: Removing unreachable block (ram,0x00725600) */

void FUN_007253ec(undefined8 param_1)

{
  undefined8 *puVar1;
  long lVar2;
  undefined8 *puVar3;
  long unaff_x19;
  long lVar4;
  undefined8 *puVar5;
  long lVar6;
  
  *(undefined8 *)(unaff_x19 + 0x3d8) = param_1;
  __ZdlPv();
  if (*(long *)(unaff_x19 + 0x3b8) != 0) {
    *(long *)(unaff_x19 + 0x3c0) = *(long *)(unaff_x19 + 0x3b8);
    __ZdlPv();
  }
  if (*(long *)(unaff_x19 + 0x3a0) != 0) {
    *(long *)(unaff_x19 + 0x3a8) = *(long *)(unaff_x19 + 0x3a0);
    __ZdlPv();
  }
  if (*(long *)(unaff_x19 + 0x388) != 0) {
    *(long *)(unaff_x19 + 0x390) = *(long *)(unaff_x19 + 0x388);
    __ZdlPv();
  }
  if (*(long *)(unaff_x19 + 0x370) != 0) {
    *(long *)(unaff_x19 + 0x378) = *(long *)(unaff_x19 + 0x370);
    __ZdlPv();
  }
  if (*(long *)(unaff_x19 + 0x358) != 0) {
    *(long *)(unaff_x19 + 0x360) = *(long *)(unaff_x19 + 0x358);
    __ZdlPv();
  }
  if (*(long *)(unaff_x19 + 0x340) != 0) {
    *(long *)(unaff_x19 + 0x348) = *(long *)(unaff_x19 + 0x340);
    __ZdlPv();
  }
  if (*(long *)(unaff_x19 + 0x328) != 0) {
    *(long *)(unaff_x19 + 0x330) = *(long *)(unaff_x19 + 0x328);
    __ZdlPv();
  }
  if (*(long *)(unaff_x19 + 0x310) != 0) {
    *(long *)(unaff_x19 + 0x318) = *(long *)(unaff_x19 + 0x310);
    __ZdlPv();
  }
  if (*(long *)(unaff_x19 + 0x2f8) != 0) {
    *(long *)(unaff_x19 + 0x300) = *(long *)(unaff_x19 + 0x2f8);
    __ZdlPv();
  }
  if (*(long *)(unaff_x19 + 0x2e0) != 0) {
    *(long *)(unaff_x19 + 0x2e8) = *(long *)(unaff_x19 + 0x2e0);
    __ZdlPv();
  }
  if (*(long *)(unaff_x19 + 0x2c8) != 0) {
    *(long *)(unaff_x19 + 0x2d0) = *(long *)(unaff_x19 + 0x2c8);
    __ZdlPv();
  }
  if (*(long *)(unaff_x19 + 0x2b0) != 0) {
    *(long *)(unaff_x19 + 0x2b8) = *(long *)(unaff_x19 + 0x2b0);
    __ZdlPv();
  }
  if (*(long *)(unaff_x19 + 0x298) != 0) {
    *(long *)(unaff_x19 + 0x2a0) = *(long *)(unaff_x19 + 0x298);
    __ZdlPv();
  }
  if (*(long *)(unaff_x19 + 0x280) != 0) {
    *(long *)(unaff_x19 + 0x288) = *(long *)(unaff_x19 + 0x280);
    __ZdlPv();
  }
  if (*(long *)(unaff_x19 + 0x268) != 0) {
    *(long *)(unaff_x19 + 0x270) = *(long *)(unaff_x19 + 0x268);
    __ZdlPv();
  }
  if (*(long *)(unaff_x19 + 0x250) != 0) {
    *(long *)(unaff_x19 + 600) = *(long *)(unaff_x19 + 0x250);
    __ZdlPv();
  }
  if (*(long *)(unaff_x19 + 0x238) != 0) {
    *(long *)(unaff_x19 + 0x240) = *(long *)(unaff_x19 + 0x238);
    __ZdlPv();
  }
  if (*(long *)(unaff_x19 + 0x220) != 0) {
    *(long *)(unaff_x19 + 0x228) = *(long *)(unaff_x19 + 0x220);
    __ZdlPv();
  }
  if (*(long *)(unaff_x19 + 0x208) != 0) {
    *(long *)(unaff_x19 + 0x210) = *(long *)(unaff_x19 + 0x208);
    __ZdlPv();
  }
  if (*(long *)(unaff_x19 + 0x1f0) != 0) {
    *(long *)(unaff_x19 + 0x1f8) = *(long *)(unaff_x19 + 0x1f0);
    __ZdlPv();
  }
  if (*(long *)(unaff_x19 + 0x1d8) != 0) {
    *(long *)(unaff_x19 + 0x1e0) = *(long *)(unaff_x19 + 0x1d8);
    __ZdlPv();
  }
  if (*(long *)(unaff_x19 + 0x1c0) != 0) {
    *(long *)(unaff_x19 + 0x1c8) = *(long *)(unaff_x19 + 0x1c0);
    __ZdlPv();
  }
  puVar5 = *(undefined8 **)(unaff_x19 + 0x1a8);
  if (puVar5 != (undefined8 *)0x0) {
    puVar3 = *(undefined8 **)(unaff_x19 + 0x1b0);
    puVar1 = puVar5;
    if (puVar3 != puVar5) {
      do {
        puVar3 = puVar3 + -6;
        (**(code **)*puVar3)(puVar3);
      } while (puVar3 != puVar5);
      puVar1 = *(undefined8 **)(unaff_x19 + 0x1a8);
    }
    *(undefined8 **)(unaff_x19 + 0x1b0) = puVar5;
    __ZdlPv(puVar1);
  }
  if (*(long *)(unaff_x19 + 400) != 0) {
    *(long *)(unaff_x19 + 0x198) = *(long *)(unaff_x19 + 400);
    __ZdlPv();
  }
  if (*(long *)(unaff_x19 + 0x168) != 0) {
    __ZdlPv();
    *(undefined8 *)(unaff_x19 + 0x168) = 0;
    *(undefined8 *)(unaff_x19 + 0x170) = 0;
  }
  if (*(long *)(unaff_x19 + 0x148) != 0) {
    *(long *)(unaff_x19 + 0x150) = *(long *)(unaff_x19 + 0x148);
    __ZdlPv();
  }
  lVar4 = *(long *)(unaff_x19 + 0xf8);
  if (lVar4 != 0) {
    lVar6 = *(long *)(unaff_x19 + 0x100);
    lVar2 = lVar4;
    if (lVar6 != lVar4) {
      do {
        lVar6 = lVar6 + -0x30;
      } while (lVar6 != lVar4);
      lVar2 = *(long *)(unaff_x19 + 0xf8);
    }
    *(long *)(unaff_x19 + 0x100) = lVar4;
    __ZdlPv(lVar2);
  }
  if (*(long *)(unaff_x19 + 0xe0) != 0) {
    *(long *)(unaff_x19 + 0xe8) = *(long *)(unaff_x19 + 0xe0);
    __ZdlPv();
  }
  if (*(long *)(unaff_x19 + 0xc0) != 0) {
    *(long *)(unaff_x19 + 200) = *(long *)(unaff_x19 + 0xc0);
    __ZdlPv();
  }
  if (*(char *)(unaff_x19 + 0x50) != '\0') {
    if (*(long *)(unaff_x19 + 0x30) != 0) {
      *(long *)(unaff_x19 + 0x38) = *(long *)(unaff_x19 + 0x30);
      __ZdlPv();
    }
    if (*(long *)(unaff_x19 + 8) != 0) {
      __ZdlPv();
      *(long *)(unaff_x19 + 8) = 0;
      *(undefined8 *)(unaff_x19 + 0x10) = 0;
    }
  }
  return;
}

