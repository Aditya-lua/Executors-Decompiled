
undefined8 FUN_0002928c(void)

{
  ulong uVar1;
  undefined8 *puVar2;
  undefined8 *puVar3;
  long lVar4;
  long unaff_x19;
  undefined8 *puVar5;
  undefined8 unaff_x20;
  undefined8 *unaff_x21;
  undefined8 *puVar6;
  ulong unaff_x22;
  undefined4 unaff_w23;
  undefined4 unaff_w24;
  undefined8 *unaff_x25;
  
  do {
    puVar3 = (undefined8 *)unaff_x21[1];
    if ((undefined8 *)unaff_x21[1] == (undefined8 *)0x0) {
      puVar5 = unaff_x21;
      puVar2 = unaff_x21 + 1;
code_r0x00029298:
      unaff_x21 = (undefined8 *)__Znwm(0x30);
      unaff_x21[4] = unaff_x22;
      *(undefined4 *)(unaff_x21 + 5) = 0;
      *unaff_x21 = 0;
      unaff_x21[1] = 0;
      unaff_x21[2] = puVar5;
      *puVar2 = unaff_x21;
      puVar3 = unaff_x21;
      if ((long *)*plRam0000000000a33370 != (long *)0x0) {
        puVar3 = (undefined8 *)*puVar2;
        plRam0000000000a33370 = (long *)*plRam0000000000a33370;
      }
      func_0x0003767c(*unaff_x25,puVar3);
      unaff_x25[1] = unaff_x25[1] + 1;
      break;
    }
    while (unaff_x21 = puVar3, unaff_x22 < (ulong)unaff_x21[4]) {
      puVar3 = (undefined8 *)*unaff_x21;
      puVar5 = unaff_x21;
      puVar2 = unaff_x21;
      if ((undefined8 *)*unaff_x21 == (undefined8 *)0x0) goto code_r0x00029298;
    }
  } while ((ulong)unaff_x21[4] < unaff_x22);
  *(undefined4 *)(unaff_x21 + 5) = unaff_w24;
  **(undefined8 **)(unaff_x19 + 8) = unaff_x20;
  lVar4 = *(long *)(unaff_x19 + 8);
  *(undefined4 *)(lVar4 + 0xc) = 7;
  *(long *)(unaff_x19 + 8) = lVar4 + 0x10;
  uVar1 = func_0x006e3790();
  puVar3 = (undefined8 *)*unaff_x25;
  if ((undefined8 *)*unaff_x25 == (undefined8 *)0x0) {
    puVar5 = unaff_x25;
    puVar6 = unaff_x25;
  }
  else {
    do {
      while (puVar2 = puVar3, puVar5 = puVar2, (ulong)puVar2[4] <= uVar1) {
        if (uVar1 <= (ulong)puVar2[4]) goto LAB_000293b4;
        puVar3 = (undefined8 *)puVar2[1];
        if ((undefined8 *)puVar2[1] == (undefined8 *)0x0) {
          puVar6 = puVar2 + 1;
          goto LAB_00029360;
        }
      }
      puVar3 = (undefined8 *)*puVar2;
      puVar6 = puVar2;
    } while ((undefined8 *)*puVar2 != (undefined8 *)0x0);
  }
LAB_00029360:
  puVar2 = (undefined8 *)__Znwm(0x30);
  puVar2[4] = uVar1;
  *(undefined4 *)(puVar2 + 5) = 0;
  *puVar2 = 0;
  puVar2[1] = 0;
  puVar2[2] = puVar5;
  *puVar6 = puVar2;
  puVar3 = puVar2;
  if ((long *)*plRam0000000000a33370 != (long *)0x0) {
    puVar3 = (undefined8 *)*puVar6;
    plRam0000000000a33370 = (long *)*plRam0000000000a33370;
  }
  func_0x0003767c(*unaff_x25,puVar3);
  unaff_x25[1] = unaff_x25[1] + 1;
LAB_000293b4:
  *(undefined4 *)(puVar2 + 5) = unaff_w23;
  return 1;
}

