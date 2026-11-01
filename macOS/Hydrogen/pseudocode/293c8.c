
undefined8 FUN_000293c8(undefined8 param_1)

{
  uint uVar1;
  ulong uVar2;
  undefined8 *puVar3;
  long lVar4;
  undefined8 *puVar5;
  long unaff_x19;
  undefined8 unaff_x20;
  long unaff_x22;
  undefined8 *puVar6;
  undefined8 *puVar7;
  undefined8 *unaff_x25;
  
  *(undefined8 *)(unaff_x22 + 0x18) = param_1;
  uVar2 = func_0x006e3790();
  puVar5 = (undefined8 *)*unaff_x25;
  if ((undefined8 *)*unaff_x25 == (undefined8 *)0x0) {
    puVar6 = unaff_x25;
    puVar7 = unaff_x25;
  }
  else {
    do {
      while (puVar3 = puVar5, puVar6 = puVar3, (ulong)puVar3[4] <= uVar2) {
        if (uVar2 <= (ulong)puVar3[4]) goto LAB_00029474;
        puVar5 = (undefined8 *)puVar3[1];
        if ((undefined8 *)puVar3[1] == (undefined8 *)0x0) {
          puVar7 = puVar3 + 1;
          goto LAB_00029420;
        }
      }
      puVar5 = (undefined8 *)*puVar3;
      puVar7 = puVar3;
    } while ((undefined8 *)*puVar3 != (undefined8 *)0x0);
  }
LAB_00029420:
  puVar3 = (undefined8 *)__Znwm(0x38);
  puVar3[5] = 0;
  puVar3[6] = 0;
  puVar3[4] = uVar2;
  *puVar3 = 0;
  puVar3[1] = 0;
  puVar3[2] = puVar6;
  *puVar7 = puVar3;
  puVar5 = puVar3;
  if ((long *)*plRam0000000000a33358 != (long *)0x0) {
    puVar5 = (undefined8 *)*puVar7;
    plRam0000000000a33358 = (long *)*plRam0000000000a33358;
  }
  func_0x0003767c(*unaff_x25,puVar5);
  unaff_x25[1] = unaff_x25[1] + 1;
LAB_00029474:
  uVar1 = *(uint *)(puVar3 + 5);
  lVar4 = func_0x006e1c18();
  uVar2 = func_0x006e3790();
  puVar5 = (undefined8 *)*unaff_x25;
  if ((undefined8 *)*unaff_x25 == (undefined8 *)0x0) {
    puVar6 = unaff_x25;
    puVar7 = unaff_x25;
  }
  else {
    do {
      while (puVar3 = puVar5, puVar6 = puVar3, (ulong)puVar3[4] <= uVar2) {
        if (uVar2 <= (ulong)puVar3[4]) goto LAB_00029530;
        puVar5 = (undefined8 *)puVar3[1];
        if ((undefined8 *)puVar3[1] == (undefined8 *)0x0) {
          puVar7 = puVar3 + 1;
          goto LAB_000294dc;
        }
      }
      puVar5 = (undefined8 *)*puVar3;
      puVar7 = puVar3;
    } while ((undefined8 *)*puVar3 != (undefined8 *)0x0);
  }
LAB_000294dc:
  puVar3 = (undefined8 *)__Znwm(0x38);
  puVar3[5] = 0;
  puVar3[6] = 0;
  puVar3[4] = uVar2;
  *puVar3 = 0;
  puVar3[1] = 0;
  puVar3[2] = puVar6;
  *puVar7 = puVar3;
  puVar5 = puVar3;
  if ((long *)*plRam0000000000a33358 != (long *)0x0) {
    puVar5 = (undefined8 *)*puVar7;
    plRam0000000000a33358 = (long *)*plRam0000000000a33358;
  }
  func_0x0003767c(*unaff_x25,puVar5);
  unaff_x25[1] = unaff_x25[1] + 1;
LAB_00029530:
  puVar3[5] = (ulong)uVar1 | lVar4 << 0x20;
  puVar3[6] = 0x200000002;
  **(undefined8 **)(unaff_x19 + 8) = unaff_x20;
  lVar4 = *(long *)(unaff_x19 + 8);
  *(undefined4 *)(lVar4 + 0xc) = 7;
  *(long *)(unaff_x19 + 8) = lVar4 + 0x10;
  return 1;
}

