/* 7ff70c9ea3b0 Catch_All@7ff70c9ea3b0 */

undefined8 Catch_All_7ff70c9ea3b0(undefined8 param_1,longlong param_2)

{
  undefined8 *puVar1;
  
  puVar1 = (undefined8 *)(param_2 + 0x80);
  *puVar1 = 0;
  *(undefined8 *)(param_2 + 0x88) = 0;
  func_0x7ff70cb12820(puVar1);
  func_0x7ff70cb128d0(puVar1);
  func_0x7ff70c99b850(puVar1);
  *(undefined8 *)(param_2 + 0x28) = 0;
  *(undefined8 *)(param_2 + 0x30) = 0xffffffffffffffff;
  *(undefined8 *)(param_2 + 0x38) = 0;
  *(undefined8 *)(param_2 + 0x40) = 0;
  *(undefined8 *)(param_2 + 0x48) = 0;
  *(undefined8 *)(param_2 + 0x50) = 0xf;
  *(undefined8 *)(param_2 + 0x58) = 0;
  *(undefined8 *)(param_2 + 0x60) = 0;
  *(undefined8 *)(param_2 + 0x68) = 0;
  *(undefined8 *)(param_2 + 0x70) = 0xf;
  *(undefined1 *)(param_2 + 0x78) = 0;
  *(undefined8 *)(param_2 + 0x20) = *(undefined8 *)(param_2 + 0x128);
  func_0x7ff70c9ecc20(*(undefined8 *)(param_2 + 0x130),param_2 + 0x20);
  func_0x7ff70c9a2470(param_2 + 0x20);
  return 0x7ff70c9ea1df;
}


