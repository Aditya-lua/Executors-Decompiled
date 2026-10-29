/* 7ff70c88fe40 FUN_7ff70c88fe40 */

undefined8 *
FUN_7ff70c88fe40(undefined8 *param_1,undefined8 param_2,undefined8 param_3,undefined8 param_4)

{
  undefined8 uVar1;
  undefined8 uVar2;
  
  uVar2 = 0xfffffffffffffffe;
  param_1[0xc] = 0;
  param_1[0xd] = 0;
  param_1[10] = 0;
  param_1[0xb] = 0;
  param_1[8] = 0;
  param_1[9] = 0;
  param_1[6] = 0;
  param_1[7] = 0;
  param_1[4] = 0;
  param_1[5] = 0;
  param_1[2] = 0;
  param_1[3] = 0;
  *param_1 = 0;
  param_1[1] = 0;
  param_1[0xe] = 0;
  uVar1 = FUN_7ff70c802100(0xa44);
  param_1[1] = uVar1;
  FUN_7ff70cb12b80(uVar1,0,0xa44,param_4,param_1,uVar2);
  return param_1;
}


