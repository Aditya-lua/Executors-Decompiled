
void FUN_002357f8(long param_1,undefined8 *param_2)

{
  undefined8 uVar1;
  undefined8 *puVar2;
  undefined1 auVar3 [16];
  
  auVar3 = func_0x0023715c(*(undefined8 *)(param_1 + 0x10),param_1 + 0xf0);
  uVar1 = param_2[4];
  puVar2 = (undefined8 *)param_2[5];
  if ((code *)*puVar2 != (code *)0x0) {
    (*(code *)*puVar2)(uVar1);
  }
  if (puVar2[1] != 0) {
    func_0x00187bd4(uVar1,puVar2[1],puVar2[2]);
  }
  *(undefined1 (*) [16])(param_2 + 4) = auVar3;
  param_2[8] = 0;
  *(undefined1 *)((long)param_2 + 0x4a) = 2;
  *param_2 = 0;
  return;
}

