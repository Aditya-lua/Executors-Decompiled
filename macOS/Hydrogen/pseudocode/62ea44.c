
void FUN_0062ea44(void)

{
  undefined8 *puVar1;
  undefined8 *puVar2;
  long unaff_x19;
  undefined8 *unaff_x21;
  undefined8 *puVar3;
  undefined8 *puVar4;
  undefined8 *puVar5;
  
  if (unaff_x21 != (undefined8 *)0x0) {
    if (*(undefined8 **)(unaff_x19 + 8) != unaff_x21) {
      puVar4 = *(undefined8 **)(unaff_x19 + 8);
      do {
        puVar3 = puVar4 + -3;
        puVar5 = (undefined8 *)*puVar3;
        if (puVar5 != (undefined8 *)0x0) {
          puVar2 = (undefined8 *)puVar4[-2];
          puVar1 = puVar5;
          if (puVar2 != puVar5) {
            do {
              puVar2 = puVar2 + -0xe;
              (**(code **)*puVar2)(puVar2);
            } while (puVar2 != puVar5);
            puVar1 = (undefined8 *)*puVar3;
          }
          puVar4[-2] = puVar5;
          __ZdlPv(puVar1);
        }
        puVar4 = puVar3;
      } while (puVar3 != unaff_x21);
    }
    *(undefined8 **)(unaff_x19 + 8) = unaff_x21;
    __ZdlPv();
  }
  return;
}

