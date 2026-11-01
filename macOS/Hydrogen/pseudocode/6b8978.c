
undefined8 FUN_006b8978(uint *param_1,long param_2)

{
  undefined8 uVar1;
  uint in_w8;
  undefined8 uVar2;
  
  if (*(uint *)(param_2 + -8) < in_w8) {
    uVar2 = *(undefined8 *)(param_1 + 4);
    *(undefined8 *)(param_1 + 4) = *(undefined8 *)(param_2 + -8);
    *(undefined8 *)(param_2 + -8) = uVar2;
    if (param_1[4] < param_1[2]) {
      uVar2 = *(undefined8 *)(param_1 + 2);
      uVar1 = *(undefined8 *)(param_1 + 4);
      *(undefined8 *)(param_1 + 2) = uVar1;
      *(undefined8 *)(param_1 + 4) = uVar2;
      if ((uint)uVar1 < *param_1) {
        uVar2 = *(undefined8 *)param_1;
        *(undefined8 *)param_1 = uVar1;
        *(undefined8 *)(param_1 + 2) = uVar2;
        return 1;
      }
    }
  }
  return 1;
}

