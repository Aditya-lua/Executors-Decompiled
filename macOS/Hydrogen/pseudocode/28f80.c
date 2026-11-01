
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

undefined8 FUN_00028f80(void)

{
  undefined4 uVar1;
  ulong uVar2;
  long lVar3;
  undefined8 *puVar4;
  undefined8 *puVar5;
  undefined8 *puVar6;
  ulong uVar7;
  byte bVar8;
  long unaff_x19;
  undefined8 unaff_x20;
  undefined8 *unaff_x21;
  ulong unaff_x22;
  undefined4 unaff_w23;
  long unaff_x24;
  undefined8 *unaff_x25;
  undefined8 *puVar9;
  undefined4 unaff_w26;
  undefined8 uVar10;
  
  while (puVar5 = (undefined8 *)*unaff_x21, puVar4 = unaff_x21, puVar6 = unaff_x21,
        (undefined8 *)*unaff_x21 != (undefined8 *)0x0) {
    while (unaff_x21 = puVar5, (ulong)unaff_x21[4] <= unaff_x22) {
      if (unaff_x22 <= (ulong)unaff_x21[4]) goto LAB_00029000;
      puVar5 = (undefined8 *)unaff_x21[1];
      if ((undefined8 *)unaff_x21[1] == (undefined8 *)0x0) {
        puVar6 = unaff_x21 + 1;
        puVar4 = unaff_x21;
        goto LAB_00028fb0;
      }
    }
  }
LAB_00028fb0:
  unaff_x21 = (undefined8 *)__Znwm(0x38);
  unaff_x21[5] = 0;
  unaff_x21[6] = 0;
  unaff_x21[4] = unaff_x22;
  *unaff_x21 = 0;
  unaff_x21[1] = 0;
  unaff_x21[2] = puVar4;
  *puVar6 = unaff_x21;
  puVar5 = unaff_x21;
  if (**(long **)(unaff_x24 + 0x358) != 0) {
    *(long *)(unaff_x24 + 0x358) = **(long **)(unaff_x24 + 0x358);
    puVar5 = (undefined8 *)*puVar6;
  }
  func_0x0003767c(*unaff_x25,puVar5);
  unaff_x25[1] = unaff_x25[1] + 1;
LAB_00029000:
  *(undefined4 *)(unaff_x21 + 5) = unaff_w26;
  *(undefined4 *)((long)unaff_x21 + 0x2c) = unaff_w23;
  unaff_x21[6] = _UNK_007fc080;
  uVar2 = func_0x006e3790();
  lVar3 = func_0x006e3790();
  *(undefined **)(uVar2 + 0x18) = &DAT_00037c80;
  *(ulong *)(uVar2 + 0x20) = (long)&DAT_00037c88 - (uVar2 + 0x20);
  *(undefined8 *)(uVar2 + 0x10) = *(undefined8 *)(lVar3 + 0x10);
  *(undefined1 *)(uVar2 + 5) = *(undefined1 *)(lVar3 + 5);
  *(undefined1 *)(uVar2 + 6) = *(undefined1 *)(lVar3 + 6);
  if (*(char *)(lVar3 + 4) == '\0') {
    bVar8 = 0;
  }
  else {
    uVar7 = 0;
    puVar6 = (undefined8 *)(lVar3 + 0x30);
    puVar5 = (undefined8 *)(uVar2 + 0x30);
    do {
      uVar10 = *puVar6;
      puVar5[1] = puVar6[1];
      *puVar5 = uVar10;
      uVar7 = uVar7 + 1;
      bVar8 = *(byte *)(lVar3 + 4);
      puVar6 = puVar6 + 2;
      puVar5 = puVar5 + 2;
    } while (uVar7 < bVar8);
  }
  *(byte *)(uVar2 + 4) = bVar8;
  *(undefined8 *)(uVar2 + 0x18) = *(undefined8 *)(lVar3 + 0x18);
  *(ulong *)(uVar2 + 0x20) = lVar3 + 0x20 + (*(long *)(lVar3 + 0x20) - (uVar2 + 0x20));
  uVar1 = func_0x006e1c18();
  puVar6 = puRam0000000000a33378;
  if (puRam0000000000a33378 == (undefined8 *)0x0) {
    puVar5 = (undefined8 *)0xa33378;
    puVar9 = (undefined8 *)0xa33378;
  }
  else {
    do {
      while (puVar4 = puVar6, puVar5 = puVar4, uVar2 < (ulong)puVar4[4]) {
        puVar6 = (undefined8 *)*puVar4;
        puVar9 = puVar4;
        if ((undefined8 *)*puVar4 == (undefined8 *)0x0) goto code_r0x000295c0;
      }
      if (uVar2 <= (ulong)puVar4[4]) goto code_r0x00029614;
      puVar6 = (undefined8 *)puVar4[1];
    } while ((undefined8 *)puVar4[1] != (undefined8 *)0x0);
    puVar9 = puVar4 + 1;
  }
code_r0x000295c0:
  puVar4 = (undefined8 *)__Znwm(0x30);
  puVar4[4] = uVar2;
  *(undefined4 *)(puVar4 + 5) = 0;
  *puVar4 = 0;
  puVar4[1] = 0;
  puVar4[2] = puVar5;
  *puVar9 = puVar4;
  puVar6 = puVar4;
  if ((long *)*plRam0000000000a33370 != (long *)0x0) {
    puVar6 = (undefined8 *)*puVar9;
    plRam0000000000a33370 = (long *)*plRam0000000000a33370;
  }
  func_0x0003767c(puRam0000000000a33378,puVar6);
  lRam0000000000a33380 = lRam0000000000a33380 + 1;
code_r0x00029614:
  *(undefined4 *)(puVar4 + 5) = uVar1;
  **(undefined8 **)(unaff_x19 + 8) = unaff_x20;
  lVar3 = *(long *)(unaff_x19 + 8);
  *(undefined4 *)(lVar3 + 0xc) = 7;
  *(long *)(unaff_x19 + 8) = lVar3 + 0x10;
  return 1;
}

