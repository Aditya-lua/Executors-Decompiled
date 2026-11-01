
undefined8 * FUN_0062ea38(undefined8 *param_1)

{
  undefined8 *puVar1;
  undefined8 *puVar2;
  undefined8 *puVar3;
  undefined8 *puVar4;
  undefined8 *puVar5;
  undefined8 *puVar6;
  
  puVar4 = (undefined8 *)*param_1;
  if (puVar4 != (undefined8 *)0x0) {
    puVar2 = puVar4;
    if ((undefined8 *)param_1[1] != puVar4) {
      puVar2 = (undefined8 *)param_1[1];
      do {
        puVar5 = puVar2 + -3;
        puVar6 = (undefined8 *)*puVar5;
        if (puVar6 != (undefined8 *)0x0) {
          puVar3 = (undefined8 *)puVar2[-2];
          puVar1 = puVar6;
          if (puVar3 != puVar6) {
            do {
              puVar3 = puVar3 + -0xe;
              (**(code **)*puVar3)(puVar3);
            } while (puVar3 != puVar6);
            puVar1 = (undefined8 *)*puVar5;
          }
          puVar2[-2] = puVar6;
          __ZdlPv(puVar1);
        }
        puVar2 = puVar5;
      } while (puVar5 != puVar4);
      puVar2 = (undefined8 *)*param_1;
    }
    param_1[1] = puVar4;
    __ZdlPv(puVar2);
  }
  return param_1;
}

