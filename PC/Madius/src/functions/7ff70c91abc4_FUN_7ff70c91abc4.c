/* 7ff70c91abc4 FUN_7ff70c91abc4 */

void FUN_7ff70c91abc4(longlong param_1)

{
  undefined8 *puVar1;
  
  puVar1 = *(undefined8 **)(param_1 + 0x130);
  if (puVar1 != (undefined8 *)0x0) {
    (**(code **)*puVar1)(puVar1,1);
  }
  FUN_7ff70c91db10(param_1 + 0x128);
  FUN_7ff70c91d040(param_1 + 0x108);
  if (*(char *)(param_1 + 0x100) == '\x01') {
    FUN_7ff70c91a44a(param_1 + 0x78);
  }
  FUN_7ff70ca1c420(param_1 + 0x50);
  return;
}


