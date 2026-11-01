
undefined8 FUN_0002906c(long param_1,long param_2)

{
  undefined4 uVar1;
  undefined8 *puVar2;
  undefined8 *puVar3;
  long lVar4;
  ulong in_x9;
  undefined8 *puVar5;
  long unaff_x19;
  undefined8 unaff_x20;
  ulong unaff_x21;
  undefined8 *puVar6;
  undefined8 uVar7;
  
  puVar3 = (undefined8 *)(param_2 + 0x30);
  puVar5 = (undefined8 *)(unaff_x21 + 0x30);
  do {
    uVar7 = *puVar3;
    puVar5[1] = puVar3[1];
    *puVar5 = uVar7;
    in_x9 = in_x9 + 1;
    puVar3 = puVar3 + 2;
    puVar5 = puVar5 + 2;
  } while (in_x9 < *(byte *)(param_2 + 4));
  *(byte *)(unaff_x21 + 4) = *(byte *)(param_2 + 4);
  *(undefined8 *)(unaff_x21 + 0x18) = *(undefined8 *)(param_2 + 0x18);
  *(long *)(unaff_x21 + 0x20) = param_2 + 0x20 + (*(long *)(param_2 + 0x20) - param_1);
  uVar1 = func_0x006e1c18();
  puVar3 = puRam0000000000a33378;
  if (puRam0000000000a33378 == (undefined8 *)0x0) {
    puVar5 = (undefined8 *)0xa33378;
    puVar6 = (undefined8 *)0xa33378;
  }
  else {
    do {
      while (puVar2 = puVar3, puVar5 = puVar2, (ulong)puVar2[4] <= unaff_x21) {
        if (unaff_x21 <= (ulong)puVar2[4]) goto code_r0x00029614;
        puVar3 = (undefined8 *)puVar2[1];
        if ((undefined8 *)puVar2[1] == (undefined8 *)0x0) {
          puVar6 = puVar2 + 1;
          goto code_r0x000295c0;
        }
      }
      puVar3 = (undefined8 *)*puVar2;
      puVar6 = puVar2;
    } while ((undefined8 *)*puVar2 != (undefined8 *)0x0);
  }
code_r0x000295c0:
  puVar2 = (undefined8 *)__Znwm(0x30);
  puVar2[4] = unaff_x21;
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
  func_0x0003767c(puRam0000000000a33378,puVar3);
  lRam0000000000a33380 = lRam0000000000a33380 + 1;
code_r0x00029614:
  *(undefined4 *)(puVar2 + 5) = uVar1;
  **(undefined8 **)(unaff_x19 + 8) = unaff_x20;
  lVar4 = *(long *)(unaff_x19 + 8);
  *(undefined4 *)(lVar4 + 0xc) = 7;
  *(long *)(unaff_x19 + 8) = lVar4 + 0x10;
  return 1;
}

