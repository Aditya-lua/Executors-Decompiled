
undefined8 FUN_00029160(long param_1,undefined8 param_2)

{
  undefined4 uVar1;
  ulong uVar2;
  undefined8 *puVar3;
  undefined8 *puVar4;
  long lVar5;
  long *in_x9;
  long unaff_x19;
  undefined8 *puVar6;
  undefined8 unaff_x20;
  long unaff_x21;
  undefined8 *puVar7;
  undefined4 unaff_w23;
  undefined4 unaff_w24;
  undefined8 *unaff_x25;
  undefined8 *unaff_x26;
  
  if (*in_x9 != 0) {
    *(long *)(param_1 + 0x358) = *in_x9;
    param_2 = *unaff_x26;
  }
  func_0x0003767c(*unaff_x25,param_2);
  unaff_x25[1] = unaff_x25[1] + 1;
  uVar1 = *(undefined4 *)(unaff_x21 + 0x28);
  uVar2 = func_0x006e3790();
  puVar4 = (undefined8 *)*unaff_x25;
  if ((undefined8 *)*unaff_x25 == (undefined8 *)0x0) {
    puVar6 = unaff_x25;
    puVar7 = unaff_x25;
  }
  else {
    do {
      while (puVar3 = puVar4, puVar6 = puVar3, (ulong)puVar3[4] <= uVar2) {
        if (uVar2 <= (ulong)puVar3[4]) goto LAB_00029234;
        puVar4 = (undefined8 *)puVar3[1];
        if ((undefined8 *)puVar3[1] == (undefined8 *)0x0) {
          puVar7 = puVar3 + 1;
          goto LAB_000291e0;
        }
      }
      puVar4 = (undefined8 *)*puVar3;
      puVar7 = puVar3;
    } while ((undefined8 *)*puVar3 != (undefined8 *)0x0);
  }
LAB_000291e0:
  puVar3 = (undefined8 *)__Znwm(0x38);
  puVar3[5] = 0;
  puVar3[6] = 0;
  puVar3[4] = uVar2;
  *puVar3 = 0;
  puVar3[1] = 0;
  puVar3[2] = puVar6;
  *puVar7 = puVar3;
  puVar4 = puVar3;
  if ((long *)*plRam0000000000a33358 != (long *)0x0) {
    puVar4 = (undefined8 *)*puVar7;
    plRam0000000000a33358 = (long *)*plRam0000000000a33358;
  }
  func_0x0003767c(*unaff_x25,puVar4);
  unaff_x25[1] = unaff_x25[1] + 1;
LAB_00029234:
  *(undefined4 *)(puVar3 + 5) = uVar1;
  *(undefined4 *)((long)puVar3 + 0x2c) = unaff_w24;
  puVar3[6] = 0;
  uVar2 = func_0x006e3790();
  puVar4 = puRam0000000000a33378;
  if (puRam0000000000a33378 == (undefined8 *)0x0) {
    puVar6 = (undefined8 *)0xa33378;
    puVar7 = (undefined8 *)0xa33378;
  }
  else {
    do {
      while (puVar3 = puVar4, puVar6 = puVar3, (ulong)puVar3[4] <= uVar2) {
        if (uVar2 <= (ulong)puVar3[4]) goto LAB_000292ec;
        puVar4 = (undefined8 *)puVar3[1];
        if ((undefined8 *)puVar3[1] == (undefined8 *)0x0) {
          puVar7 = puVar3 + 1;
          goto LAB_00029298;
        }
      }
      puVar4 = (undefined8 *)*puVar3;
      puVar7 = puVar3;
    } while ((undefined8 *)*puVar3 != (undefined8 *)0x0);
  }
LAB_00029298:
  puVar3 = (undefined8 *)__Znwm(0x30);
  puVar3[4] = uVar2;
  *(undefined4 *)(puVar3 + 5) = 0;
  *puVar3 = 0;
  puVar3[1] = 0;
  puVar3[2] = puVar6;
  *puVar7 = puVar3;
  puVar4 = puVar3;
  if ((long *)*plRam0000000000a33370 != (long *)0x0) {
    puVar4 = (undefined8 *)*puVar7;
    plRam0000000000a33370 = (long *)*plRam0000000000a33370;
  }
  func_0x0003767c(puRam0000000000a33378,puVar4);
  lRam0000000000a33380 = lRam0000000000a33380 + 1;
LAB_000292ec:
  *(undefined4 *)(puVar3 + 5) = unaff_w24;
  **(undefined8 **)(unaff_x19 + 8) = unaff_x20;
  lVar5 = *(long *)(unaff_x19 + 8);
  *(undefined4 *)(lVar5 + 0xc) = 7;
  *(long *)(unaff_x19 + 8) = lVar5 + 0x10;
  uVar2 = func_0x006e3790();
  puVar4 = puRam0000000000a33378;
  if (puRam0000000000a33378 == (undefined8 *)0x0) {
    puVar6 = (undefined8 *)0xa33378;
    puVar7 = (undefined8 *)0xa33378;
  }
  else {
    do {
      while (puVar3 = puVar4, puVar6 = puVar3, (ulong)puVar3[4] <= uVar2) {
        if (uVar2 <= (ulong)puVar3[4]) goto LAB_000293b4;
        puVar4 = (undefined8 *)puVar3[1];
        if ((undefined8 *)puVar3[1] == (undefined8 *)0x0) {
          puVar7 = puVar3 + 1;
          goto LAB_00029360;
        }
      }
      puVar4 = (undefined8 *)*puVar3;
      puVar7 = puVar3;
    } while ((undefined8 *)*puVar3 != (undefined8 *)0x0);
  }
LAB_00029360:
  puVar3 = (undefined8 *)__Znwm(0x30);
  puVar3[4] = uVar2;
  *(undefined4 *)(puVar3 + 5) = 0;
  *puVar3 = 0;
  puVar3[1] = 0;
  puVar3[2] = puVar6;
  *puVar7 = puVar3;
  puVar4 = puVar3;
  if ((long *)*plRam0000000000a33370 != (long *)0x0) {
    puVar4 = (undefined8 *)*puVar7;
    plRam0000000000a33370 = (long *)*plRam0000000000a33370;
  }
  func_0x0003767c(puRam0000000000a33378,puVar4);
  lRam0000000000a33380 = lRam0000000000a33380 + 1;
LAB_000293b4:
  *(undefined4 *)(puVar3 + 5) = unaff_w23;
  return 1;
}

