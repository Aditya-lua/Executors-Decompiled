
undefined8 * FUN_0064a9d0(undefined8 *param_1)

{
  undefined8 *puVar1;
  undefined8 *puVar2;
  undefined8 *puVar3;
  undefined8 *puVar4;
  
  if (*(char *)(param_1 + 1) == '\0') {
    puVar3 = (undefined8 *)*param_1;
    puVar4 = (undefined8 *)*puVar3;
    if (puVar4 != (undefined8 *)0x0) {
      puVar2 = (undefined8 *)puVar3[1];
      puVar1 = puVar4;
      if (puVar2 != puVar4) {
        do {
          puVar2 = puVar2 + -6;
          (**(code **)*puVar2)(puVar2);
        } while (puVar2 != puVar4);
        puVar1 = *(undefined8 **)*param_1;
      }
      puVar3[1] = puVar4;
      __ZdlPv(puVar1);
      return param_1;
    }
  }
  return param_1;
}

