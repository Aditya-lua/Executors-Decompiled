/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b76248
 */

undefined8
mbedtls_entropy_add_source
          (long param_1,undefined8 param_2,undefined8 param_3,undefined8 param_4,undefined4 param_5)

{
  int iVar1;
  long lVar2;
  
  iVar1 = *(int *)(param_1 + 0x1c);
  if (iVar1 < 0x14) {
    lVar2 = param_1 + (long)iVar1 * 0x28;
    *(undefined8 *)(lVar2 + 0x20) = param_2;
    *(undefined8 *)(lVar2 + 0x28) = param_3;
    *(undefined8 *)(lVar2 + 0x38) = param_4;
    *(undefined4 *)(lVar2 + 0x40) = param_5;
    *(int *)(param_1 + 0x1c) = iVar1 + 1;
    return 0;
  }
  return 0xffffffc2;
}

