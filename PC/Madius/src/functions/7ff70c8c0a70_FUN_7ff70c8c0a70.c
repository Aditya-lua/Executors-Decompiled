/* 7ff70c8c0a70 FUN_7ff70c8c0a70 */

void FUN_7ff70c8c0a70(undefined8 param_1,undefined4 param_2)

{
  code *pcVar1;
  undefined1 auStack_40 [56];
  
  FUN_7ff70c8c08b0(auStack_40,param_1,param_2);
  FUN_7ff70cb12a50(auStack_40,&UNK_7ff70cbad1e0);
  pcVar1 = (code *)swi(3);
  (*pcVar1)();
  return;
}


