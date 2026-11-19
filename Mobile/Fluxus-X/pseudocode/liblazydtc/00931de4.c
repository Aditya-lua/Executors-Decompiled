/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00931de4
 */

void FUN_00931de4(long param_1)

{
  long lVar1;
  undefined1 auVar2 [16];
  
  *(undefined4 *)(param_1 + 0xc30) = 0;
  auVar2 = FUN_00941cb8();
  *(undefined1 (*) [16])(param_1 + 0xb30) = auVar2;
  *(byte *)(param_1 + 0xc34) = *(byte *)(param_1 + 0xc34) & 0xfd;
  *(undefined8 *)(param_1 + 0xb78) = *(undefined8 *)(param_1 + 0xb38);
  *(undefined8 *)(param_1 + 0xb70) = *(undefined8 *)(param_1 + 0xb30);
  *(undefined8 *)(param_1 + 0xb90) = *(undefined8 *)(param_1 + 0xb38);
  *(undefined8 *)(param_1 + 0xb88) = *(undefined8 *)(param_1 + 0xb30);
  *(undefined8 *)(param_1 + 0xb80) = 0;
  *(undefined8 *)(param_1 + 0xb98) = 0;
  *(undefined8 *)(param_1 + 0xac8) = 0;
  *(undefined8 *)(param_1 + 0xac0) = 0;
  *(uint *)(param_1 + 0xadc) = *(uint *)(param_1 + 0xadc) & 0x90;
  if ((*(long *)(param_1 + 0x330) != 0) &&
     (lVar1 = FUN_00941d54(auVar2._0_8_,auVar2._8_8_,*(undefined8 *)(param_1 + 0xb88),
                           *(undefined8 *)(param_1 + 0xb90)), 2999 < lVar1)) {
    *(undefined1 (*) [16])(param_1 + 0xb88) = auVar2;
    *(undefined8 *)(param_1 + 0xb98) = *(undefined8 *)(param_1 + 0xac0);
  }
  if ((*(long *)(param_1 + 0x328) != 0) &&
     (lVar1 = FUN_00941d54(auVar2._0_8_,auVar2._8_8_,*(undefined8 *)(param_1 + 0xb70),
                           *(undefined8 *)(param_1 + 0xb78)), 2999 < lVar1)) {
    *(undefined1 (*) [16])(param_1 + 0xb70) = auVar2;
    *(undefined8 *)(param_1 + 0xb80) = *(undefined8 *)(param_1 + 0xac8);
  }
  return;
}

