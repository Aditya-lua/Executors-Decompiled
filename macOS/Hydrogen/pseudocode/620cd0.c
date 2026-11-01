
void FUN_00620cd0(long param_1,long param_2)

{
  bool in_CY;
  undefined8 *puVar1;
  undefined8 *puVar2;
  undefined8 *puVar3;
  long in_x9;
  undefined8 *puVar4;
  undefined8 *puVar5;
  undefined8 *puVar6;
  long unaff_x29;
  
  if (in_CY) {
    param_1 = in_x9;
  }
  if (param_2 != 0) {
    if (param_1 != 0) {
      do {
        *(undefined8 *)(param_2 + -8 + param_1 * 8) = 0;
        param_1 = param_1 + -1;
      } while (param_1 != 0);
    }
    func_0x00611644();
  }
  if (*(long *)(unaff_x29 + -0x88) != 0) {
    func_0x0064b344(unaff_x29 + -0x88);
    __ZdlPv(*(undefined8 *)(unaff_x29 + -0x88));
  }
  puVar4 = *(undefined8 **)(unaff_x29 + -0x70);
  if (puVar4 != (undefined8 *)0x0) {
    puVar2 = puVar4;
    if (*(undefined8 **)(unaff_x29 + -0x68) != puVar4) {
      puVar2 = *(undefined8 **)(unaff_x29 + -0x68);
      do {
        puVar5 = puVar2 + -3;
        puVar6 = (undefined8 *)*puVar5;
        if (puVar6 != (undefined8 *)0x0) {
          puVar3 = (undefined8 *)puVar2[-2];
          puVar1 = puVar6;
          if (puVar3 != puVar6) {
            do {
              puVar3 = puVar3 + -6;
              (**(code **)*puVar3)(puVar3);
            } while (puVar3 != puVar6);
            puVar1 = (undefined8 *)*puVar5;
          }
          puVar2[-2] = puVar6;
          __ZdlPv(puVar1);
        }
        puVar2 = puVar5;
      } while (puVar5 != puVar4);
      puVar2 = *(undefined8 **)(unaff_x29 + -0x70);
    }
    *(undefined8 **)(unaff_x29 + -0x68) = puVar4;
    __ZdlPv(puVar2);
  }
  return;
}

