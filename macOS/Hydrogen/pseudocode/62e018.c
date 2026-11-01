
undefined8 * FUN_0062e018(undefined8 *param_1)

{
  undefined8 *puVar1;
  undefined8 *puVar2;
  undefined8 *puVar3;
  
  puVar3 = (undefined8 *)*param_1;
  if (puVar3 != (undefined8 *)0x0) {
    puVar2 = (undefined8 *)param_1[1];
    puVar1 = puVar3;
    if (puVar2 != puVar3) {
      do {
        puVar2 = puVar2 + -0xe;
        (**(code **)*puVar2)(puVar2);
      } while (puVar2 != puVar3);
      puVar1 = (undefined8 *)*param_1;
    }
    param_1[1] = puVar3;
    __ZdlPv(puVar1);
  }
  return param_1;
}

