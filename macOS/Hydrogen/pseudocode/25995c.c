
void FUN_0025995c(undefined8 *param_1,undefined8 param_2,undefined8 param_3)

{
  undefined8 uVar1;
  undefined8 *puVar2;
  undefined8 unaff_x22;
  
  uVar1 = param_1[4];
  puVar2 = (undefined8 *)param_1[5];
  if ((code *)*puVar2 != (code *)0x0) {
    (*(code *)*puVar2)(uVar1);
  }
  if (puVar2[1] != 0) {
    func_0x00187bd4(uVar1,puVar2[1],puVar2[2]);
  }
  param_1[4] = param_2;
  param_1[5] = param_3;
  param_1[8] = 0;
  *(undefined1 *)((long)param_1 + 0x4a) = 2;
  *param_1 = 1;
  param_1[1] = unaff_x22;
  return;
}

