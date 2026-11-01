
undefined8 FUN_000f8f10(undefined1 param_1 [16],undefined8 param_2,long param_3)

{
  undefined8 *in_x4;
  undefined8 *in_x5;
  long in_x10;
  float fVar1;
  float fVar2;
  float fVar3;
  float fVar4;
  
  fVar2 = param_1._4_4_;
  fVar1 = param_1._0_4_;
  *in_x4 = CONCAT44(fVar2 * (float)((ulong)param_2 >> 0x20),fVar1 * (float)param_2);
  fVar3 = (float)*(undefined8 *)(in_x10 + 8);
  fVar4 = fVar2 + (float)((ulong)*(undefined8 *)(in_x10 + 8) >> 0x20);
  in_x4[1] = CONCAT44(fVar4 * (float)((ulong)*(undefined8 *)(param_3 + 0x48) >> 0x20),
                      (fVar1 + fVar3) * (float)*(undefined8 *)(param_3 + 0x48));
  *in_x5 = CONCAT44(fVar2 * (float)((ulong)*(undefined8 *)(param_3 + 0x48) >> 0x20),
                    (fVar1 + 123.0) * (float)*(undefined8 *)(param_3 + 0x48));
  in_x5[1] = CONCAT44(fVar4 * (float)((ulong)*(undefined8 *)(param_3 + 0x48) >> 0x20),
                      (fVar1 + 123.0 + fVar3) * (float)*(undefined8 *)(param_3 + 0x48));
  return 1;
}

