/* 7ff70c8f9170 FUN_7ff70c8f9170 */

undefined8 * FUN_7ff70c8f9170(undefined8 *param_1,undefined8 *param_2)

{
  undefined8 *puStack_28;
  undefined1 uStack_20;
  undefined8 uStack_18;
  
  uStack_18 = 0xfffffffffffffffe;
  if (0xf < (ulonglong)param_2[3]) {
    param_2 = (undefined8 *)*param_2;
  }
  *param_1 = &UNK_7ff70cb740d8;
  param_1[1] = 0;
  param_1[2] = 0;
  uStack_20 = 1;
  puStack_28 = param_2;
  FUN_7ff70cb12ad0(&puStack_28,param_1 + 1);
  *param_1 = &UNK_7ff70cb14cc8;
  return param_1;
}


