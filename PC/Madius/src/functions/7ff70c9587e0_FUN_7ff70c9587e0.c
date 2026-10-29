/* 7ff70c9587e0 FUN_7ff70c9587e0 */

undefined8 FUN_7ff70c9587e0(longlong param_1,undefined4 param_2)

{
  longlong lVar1;
  
  lVar1 = FUN_7ff70c8f1dd0();
  *(longlong *)(param_1 + 0x58) = lVar1;
  if (lVar1 != 0) {
    *(undefined1 *)(lVar1 + 0x13c0) = 1;
    FUN_7ff70c992990(param_1,param_2,&UNK_7ff70c992e90,&UNK_7ff70c992ef0,&UNK_7ff70c958850);
    *(longlong *)(*(longlong *)(param_1 + 0x58) + 0xbf8) = param_1;
    return 0;
  }
  return 1;
}


