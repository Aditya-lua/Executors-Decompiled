
undefined8 FUN_0002889c(void)

{
  undefined4 uVar1;
  ulong uVar2;
  undefined8 *puVar3;
  undefined8 *puVar4;
  undefined8 *puVar5;
  undefined8 *puVar6;
  undefined8 in_stack_00000008;
  long in_stack_00000018;
  
  func_0x006e3af8();
  uVar1 = func_0x006e1c18();
  uVar2 = func_0x006e3790();
  puVar4 = puRam0000000000a33378;
  if (puRam0000000000a33378 == (undefined8 *)0x0) {
    puVar5 = (undefined8 *)0xa33378;
    puVar6 = (undefined8 *)0xa33378;
  }
  else {
    do {
      while (puVar5 = puVar4, (ulong)puVar5[4] <= uVar2) {
        if (uVar2 <= (ulong)puVar5[4]) {
          *(undefined4 *)(puVar5 + 5) = uVar1;
          goto joined_r0x000289a4;
        }
        puVar4 = (undefined8 *)puVar5[1];
        if ((undefined8 *)puVar5[1] == (undefined8 *)0x0) {
          puVar6 = puVar5 + 1;
          goto LAB_00028918;
        }
      }
      puVar4 = (undefined8 *)*puVar5;
      puVar6 = puVar5;
    } while ((undefined8 *)*puVar5 != (undefined8 *)0x0);
  }
LAB_00028918:
  puVar3 = (undefined8 *)__Znwm(0x30);
  puVar3[4] = uVar2;
  *(undefined4 *)(puVar3 + 5) = 0;
  *puVar3 = 0;
  puVar3[1] = 0;
  puVar3[2] = puVar5;
  *puVar6 = puVar3;
  puVar4 = puVar3;
  if ((long *)*plRam0000000000a33370 != (long *)0x0) {
    puVar4 = (undefined8 *)*puVar6;
    plRam0000000000a33370 = (long *)*plRam0000000000a33370;
  }
  func_0x0003767c(puRam0000000000a33378,puVar4);
  lRam0000000000a33380 = lRam0000000000a33380 + 1;
  *(undefined4 *)(puVar3 + 5) = uVar1;
joined_r0x000289a4:
  if (in_stack_00000018 < 0) {
    __ZdlPv(in_stack_00000008);
  }
  return 1;
}

