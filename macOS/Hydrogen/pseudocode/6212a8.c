
void FUN_006212a8(undefined8 param_1)

{
  undefined8 *puVar1;
  undefined8 *puVar2;
  undefined8 *unaff_x19;
  undefined8 *unaff_x21;
  undefined8 *puVar3;
  undefined8 *unaff_x23;
  undefined8 *puVar4;
  
  if (unaff_x23 != unaff_x21) {
    do {
      puVar3 = unaff_x23 + -3;
      puVar4 = (undefined8 *)*puVar3;
      if (puVar4 != (undefined8 *)0x0) {
        puVar2 = (undefined8 *)unaff_x23[-2];
        puVar1 = puVar4;
        if (puVar2 != puVar4) {
          do {
            puVar2 = puVar2 + -6;
            (**(code **)*puVar2)(puVar2);
          } while (puVar2 != puVar4);
          puVar1 = (undefined8 *)*puVar3;
        }
        unaff_x23[-2] = puVar4;
        __ZdlPv(puVar1);
      }
      unaff_x23 = puVar3;
    } while (puVar3 != unaff_x21);
    param_1 = *unaff_x19;
  }
  unaff_x19[1] = unaff_x21;
  __ZdlPv(param_1);
  return;
}

