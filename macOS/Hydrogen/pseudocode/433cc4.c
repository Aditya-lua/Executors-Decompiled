
bool FUN_00433cc4(undefined8 param_1,undefined4 *param_2,undefined8 param_3,undefined8 param_4)

{
  long lVar1;
  undefined1 uStack0000000000000004;
  undefined8 uStack000000000000000c;
  
  uStack000000000000000c = param_1;
  lVar1 = _sendto(*param_2,param_3,param_4,0,&uStack0000000000000004);
  if (lVar1 == -1) {
    ___error();
  }
  return lVar1 == -1;
}

