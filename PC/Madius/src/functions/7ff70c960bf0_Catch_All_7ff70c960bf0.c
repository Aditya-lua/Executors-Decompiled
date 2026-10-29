/* 7ff70c960bf0 Catch_All@7ff70c960bf0 */

undefined1 * Catch_All_7ff70c960bf0(undefined8 param_1,longlong param_2)

{
  longlong lVar1;
  undefined8 *puVar2;
  
  *(undefined8 *)(param_2 + 0x20) = 0;
  *(undefined8 *)(param_2 + 0x28) = 0;
  lVar1 = param_2 + 0x20;
  func_0x7ff70cb12820(lVar1);
  func_0x7ff70cb128d0(lVar1);
  func_0x7ff70c99b850(lVar1);
  puVar2 = *(undefined8 **)(param_2 + 0x90);
  *puVar2 = 0;
  puVar2[1] = 0;
  puVar2[2] = 0;
  return &LAB_7ff70c960b75;
}


