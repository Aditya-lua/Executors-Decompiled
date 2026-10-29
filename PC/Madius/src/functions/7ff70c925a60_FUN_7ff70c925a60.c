/* 7ff70c925a60 FUN_7ff70c925a60 */

undefined8 FUN_7ff70c925a60(undefined8 param_1,longlong *param_2)

{
  longlong lVar1;
  longlong lVar2;
  undefined4 auStack_48 [4];
  undefined8 uStack_38;
  undefined1 uStack_29;
  undefined8 uStack_28;
  
  uStack_28 = 0xfffffffffffffffe;
  auStack_48[0] = 0;
  uStack_38 = param_1;
  FUN_7ff70c926d80(param_1,auStack_48,&uStack_29);
  lVar2 = *param_2;
  lVar1 = param_2[1];
  if (lVar2 != lVar1) {
    do {
      FUN_7ff70c926ee0(uStack_38,auStack_48,lVar2);
      lVar2 = lVar2 + 0x10;
    } while (lVar2 != lVar1);
  }
  return uStack_38;
}


