
undefined8 FUN_0002a00c(undefined8 param_1,long param_2)

{
  ulong uVar1;
  long *plVar2;
  undefined8 *puVar3;
  undefined8 *puVar4;
  long unaff_x19;
  ulong unaff_x20;
  undefined8 *unaff_x23;
  undefined8 *puVar5;
  undefined8 uVar6;
  
  *(undefined8 *)(param_2 + 0x28) = param_1;
  if (*(char *)(unaff_x20 + 4) != '\0') {
    uVar1 = 0;
    puVar3 = (undefined8 *)(unaff_x20 + 0x30);
    puVar4 = (undefined8 *)(param_2 + 0x30);
    do {
      uVar6 = *puVar3;
      puVar4[1] = puVar3[1];
      *puVar4 = uVar6;
      uVar1 = uVar1 + 1;
      puVar3 = puVar3 + 2;
      puVar4 = puVar4 + 2;
    } while (uVar1 < *(byte *)(unaff_x20 + 4));
  }
  *(undefined8 *)(param_2 + 0x18) = *(undefined8 *)(unaff_x20 + 0x18);
  *(long *)(param_2 + 0x20) =
       (long)(unaff_x20 + 0x20) + (*(long *)(unaff_x20 + 0x20) - (param_2 + 0x20));
  plVar2 = *(long **)(unaff_x19 + 8);
  *plVar2 = param_2;
  *(undefined4 *)((long)plVar2 + 0xc) = 7;
  *(long *)(unaff_x19 + 8) = *(long *)(unaff_x19 + 8) + 0x10;
  uVar1 = func_0x006e3790();
  if (puRam0000000000a33378 != (undefined8 *)0x0) {
    puVar3 = (undefined8 *)0xa33378;
    puVar4 = puRam0000000000a33378;
    do {
      puVar5 = puVar4 + 1;
      if (unaff_x20 <= (ulong)puVar4[4]) {
        puVar3 = puVar4;
        puVar5 = puVar4;
      }
      puVar4 = (undefined8 *)*puVar5;
    } while (puVar4 != (undefined8 *)0x0);
    if ((puVar3 != (undefined8 *)0xa33378) && ((ulong)puVar3[4] <= unaff_x20)) {
      puVar3 = puRam0000000000a33378;
      do {
        while ((ulong)puVar3[4] <= unaff_x20) {
          puVar4 = puRam0000000000a33378;
          if (unaff_x20 <= (ulong)puVar3[4]) goto LAB_0002a114;
          puVar3 = (undefined8 *)puVar3[1];
          if (puVar3 == (undefined8 *)0x0) goto LAB_0002a100;
        }
        puVar3 = (undefined8 *)*puVar3;
      } while (puVar3 != (undefined8 *)0x0);
LAB_0002a100:
      func_0x0002a824("map::at:  key not found");
      while (puVar4 = (undefined8 *)*unaff_x23, (undefined8 *)*unaff_x23 != (undefined8 *)0x0) {
LAB_0002a114:
        while( true ) {
          unaff_x23 = puVar4;
          if (uVar1 < (ulong)unaff_x23[4]) break;
          if (uVar1 <= (ulong)unaff_x23[4]) goto code_r0x0002a1a8;
          puVar4 = (undefined8 *)unaff_x23[1];
          if ((undefined8 *)unaff_x23[1] == (undefined8 *)0x0) {
            puVar4 = unaff_x23;
            puVar5 = unaff_x23 + 1;
            goto LAB_0002a150;
          }
        }
      }
      puVar4 = unaff_x23;
      puVar5 = unaff_x23;
LAB_0002a150:
      unaff_x23 = (undefined8 *)__Znwm(0x30);
      unaff_x23[4] = uVar1;
      *(undefined4 *)(unaff_x23 + 5) = 0;
      *unaff_x23 = 0;
      unaff_x23[1] = 0;
      unaff_x23[2] = puVar4;
      *puVar5 = unaff_x23;
      puVar4 = unaff_x23;
      if ((long *)*plRam0000000000a33370 != (long *)0x0) {
        puVar4 = (undefined8 *)*puVar5;
        plRam0000000000a33370 = (long *)*plRam0000000000a33370;
      }
      func_0x0003767c(puRam0000000000a33378,puVar4);
      lRam0000000000a33380 = lRam0000000000a33380 + 1;
code_r0x0002a1a8:
      *(undefined4 *)(unaff_x23 + 5) = *(undefined4 *)(puVar3 + 5);
    }
  }
  return 1;
}

