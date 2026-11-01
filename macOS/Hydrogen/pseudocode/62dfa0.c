
undefined8 * FUN_0062dfa0(long param_1,long param_2)

{
  undefined8 *puVar1;
  undefined8 *puVar2;
  undefined8 *puVar3;
  undefined8 *puVar4;
  undefined1 uStack0000000000000048;
  
  if (param_1 != 0) {
    do {
      *(undefined8 *)(param_2 + -8 + param_1 * 8) = 0;
      param_1 = param_1 + -1;
    } while (param_1 != 0);
  }
  func_0x00611644();
  FUN_0062e018(&uStack0000000000000048);
  puVar1 = (undefined8 *)__Unwind_Resume();
  puVar4 = (undefined8 *)*puVar1;
  if (puVar4 != (undefined8 *)0x0) {
    puVar3 = (undefined8 *)puVar1[1];
    puVar2 = puVar4;
    if (puVar3 != puVar4) {
      do {
        puVar3 = puVar3 + -0xe;
        (**(code **)*puVar3)(puVar3);
      } while (puVar3 != puVar4);
      puVar2 = (undefined8 *)*puVar1;
    }
    puVar1[1] = puVar4;
    __ZdlPv(puVar2);
  }
  return puVar1;
}

