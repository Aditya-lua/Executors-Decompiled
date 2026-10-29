/* 7ff70c7a4270 FUN_7ff70c7a4270 */

undefined8 FUN_7ff70c7a4270(longlong param_1,undefined8 param_2)

{
  undefined *puVar1;
  
  puVar1 = (undefined *)0x0;
  FUN_7ff70c8f5030(**(undefined8 **)(param_1 + 0x48),0x2c,0);
  if (1 < (byte)(*(char *)(param_1 + 0x40) - 1U)) {
    puVar1 = (undefined *)0x0;
    if (*(longlong *)(*(longlong *)(param_1 + 0x110) + 0x48) == 0) {
      puVar1 = &UNK_7ff70cb923a7;
    }
    FUN_7ff70c8f5030(**(undefined8 **)(param_1 + 0x48),0x271f,puVar1);
    puVar1 = &UNK_7ff70cb8990f;
  }
  FUN_7ff70c8f5030(**(undefined8 **)(param_1 + 0x48),0x2734,puVar1);
  FUN_7ff70c79fb60(param_1);
  FUN_7ff70c7a0eb0(param_1,param_2);
  return param_2;
}


