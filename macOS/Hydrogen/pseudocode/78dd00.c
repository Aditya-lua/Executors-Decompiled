
undefined8
FUN_0078dd00(long param_1,undefined8 param_2,undefined8 param_3,undefined4 param_4,
            undefined4 param_5,undefined8 param_6,long param_7)

{
  int iVar1;
  long in_x9;
  undefined8 unaff_x19;
  int *unaff_x20;
  
  if (param_7 == in_x9) {
    *(undefined4 *)(param_1 + 0xd8) = param_4;
    *(undefined4 *)(param_1 + 0xdc) = param_5;
    *(undefined8 *)(param_1 + 0xe0) = param_6;
    *(long *)(param_1 + 0xe8) = param_7 - in_x9;
    *(undefined8 *)(param_1 + 0xf0) = unaff_x19;
    iVar1 = func_0x00773be4();
    *unaff_x20 = iVar1;
    if (iVar1 != 0) {
      return 0xffffffffffffffff;
    }
  }
  *unaff_x20 = 0;
  return unaff_x19;
}

