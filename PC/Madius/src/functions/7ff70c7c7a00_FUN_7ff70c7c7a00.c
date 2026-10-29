/* 7ff70c7c7a00 FUN_7ff70c7c7a00 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

longlong FUN_7ff70c7c7a00(longlong param_1)

{
  undefined8 uVar1;
  
  FUN_7ff70cb12b80(param_1,0,0x2f8);
  uVar1 = _UNK_7ff70cb1bb78;
  *(undefined8 *)(param_1 + 8) = _DAT_7ff70cb1bb70;
  *(undefined8 *)(param_1 + 0x10) = uVar1;
  *(undefined4 *)(param_1 + 0x18) = 0x2000;
  *(undefined8 *)(param_1 + 0x298) = 0x100000001;
  return param_1;
}


