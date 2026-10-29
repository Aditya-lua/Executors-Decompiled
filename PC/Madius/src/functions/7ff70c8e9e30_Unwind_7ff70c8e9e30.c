/* 7ff70c8e9e30 Unwind@7ff70c8e9e30 */

void Unwind_7ff70c8e9e30(undefined8 param_1,longlong param_2)

{
  undefined8 *puVar1;
  
  puVar1 = *(undefined8 **)(param_2 + 0x50);
  *puVar1 = &UNK_7ff70cb745f8;
  puVar1 = (undefined8 *)puVar1[2];
  if (puVar1 != (undefined8 *)0x0) {
    (**(code **)*puVar1)(puVar1,1);
  }
  return;
}


