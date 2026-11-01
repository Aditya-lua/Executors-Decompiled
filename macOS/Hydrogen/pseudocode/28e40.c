
undefined8 FUN_00028e40(undefined8 param_1)

{
  uint uVar1;
  long lVar2;
  long lVar3;
  undefined8 *puVar4;
  undefined8 *puVar5;
  ulong uVar6;
  undefined8 *puVar7;
  byte bVar8;
  long unaff_x19;
  undefined8 unaff_x20;
  undefined8 *puVar9;
  undefined8 *unaff_x25;
  undefined8 uVar10;
  
  func_0x006e4c80(param_1,1,1);
  lVar2 = func_0x006e3790();
  lVar3 = func_0x006e3790();
  *(undefined8 *)(lVar2 + 0x10) = *(undefined8 *)(lVar3 + 0x10);
  *(undefined2 *)(lVar2 + 5) = *(undefined2 *)(lVar3 + 5);
  if (*(char *)(lVar3 + 4) == '\0') {
    bVar8 = 0;
  }
  else {
    uVar6 = 0;
    puVar5 = (undefined8 *)(lVar3 + 0x20);
    puVar7 = (undefined8 *)(lVar2 + 0x20);
    do {
      uVar10 = *puVar5;
      puVar7[1] = puVar5[1];
      *puVar7 = uVar10;
      uVar6 = uVar6 + 1;
      bVar8 = *(byte *)(lVar3 + 4);
      puVar5 = puVar5 + 2;
      puVar7 = puVar7 + 2;
    } while (uVar6 < bVar8);
  }
  *(byte *)(lVar2 + 4) = bVar8;
  *(undefined8 *)(lVar2 + 0x18) = *(undefined8 *)(lVar3 + 0x18);
  uVar6 = func_0x006e3790();
  puVar5 = (undefined8 *)*unaff_x25;
  if ((undefined8 *)*unaff_x25 == (undefined8 *)0x0) {
    puVar7 = unaff_x25;
    puVar9 = unaff_x25;
  }
  else {
    do {
      while (puVar4 = puVar5, puVar7 = puVar4, uVar6 < (ulong)puVar4[4]) {
        puVar5 = (undefined8 *)*puVar4;
        puVar9 = puVar4;
        if ((undefined8 *)*puVar4 == (undefined8 *)0x0) goto LAB_00029420;
      }
      if (uVar6 <= (ulong)puVar4[4]) goto LAB_00029474;
      puVar5 = (undefined8 *)puVar4[1];
    } while ((undefined8 *)puVar4[1] != (undefined8 *)0x0);
    puVar9 = puVar4 + 1;
  }
LAB_00029420:
  puVar4 = (undefined8 *)__Znwm(0x38);
  puVar4[5] = 0;
  puVar4[6] = 0;
  puVar4[4] = uVar6;
  *puVar4 = 0;
  puVar4[1] = 0;
  puVar4[2] = puVar7;
  *puVar9 = puVar4;
  puVar5 = puVar4;
  if ((long *)*plRam0000000000a33358 != (long *)0x0) {
    puVar5 = (undefined8 *)*puVar9;
    plRam0000000000a33358 = (long *)*plRam0000000000a33358;
  }
  func_0x0003767c(*unaff_x25,puVar5);
  unaff_x25[1] = unaff_x25[1] + 1;
LAB_00029474:
  uVar1 = *(uint *)(puVar4 + 5);
  lVar2 = func_0x006e1c18();
  uVar6 = func_0x006e3790();
  puVar5 = (undefined8 *)*unaff_x25;
  if ((undefined8 *)*unaff_x25 == (undefined8 *)0x0) {
    puVar7 = unaff_x25;
    puVar9 = unaff_x25;
  }
  else {
    do {
      while (puVar4 = puVar5, puVar7 = puVar4, uVar6 < (ulong)puVar4[4]) {
        puVar5 = (undefined8 *)*puVar4;
        puVar9 = puVar4;
        if ((undefined8 *)*puVar4 == (undefined8 *)0x0) goto LAB_000294dc;
      }
      if (uVar6 <= (ulong)puVar4[4]) goto LAB_00029530;
      puVar5 = (undefined8 *)puVar4[1];
    } while ((undefined8 *)puVar4[1] != (undefined8 *)0x0);
    puVar9 = puVar4 + 1;
  }
LAB_000294dc:
  puVar4 = (undefined8 *)__Znwm(0x38);
  puVar4[5] = 0;
  puVar4[6] = 0;
  puVar4[4] = uVar6;
  *puVar4 = 0;
  puVar4[1] = 0;
  puVar4[2] = puVar7;
  *puVar9 = puVar4;
  puVar5 = puVar4;
  if ((long *)*plRam0000000000a33358 != (long *)0x0) {
    puVar5 = (undefined8 *)*puVar9;
    plRam0000000000a33358 = (long *)*plRam0000000000a33358;
  }
  func_0x0003767c(*unaff_x25,puVar5);
  unaff_x25[1] = unaff_x25[1] + 1;
LAB_00029530:
  puVar4[5] = (ulong)uVar1 | lVar2 << 0x20;
  puVar4[6] = 0x200000002;
  **(undefined8 **)(unaff_x19 + 8) = unaff_x20;
  lVar2 = *(long *)(unaff_x19 + 8);
  *(undefined4 *)(lVar2 + 0xc) = 7;
  *(long *)(unaff_x19 + 8) = lVar2 + 0x10;
  return 1;
}

