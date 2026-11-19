/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b761dc
 */

void mbedtls_entropy_init(long param_1)

{
  int iVar1;
  long lVar2;
  
  memset((void *)(param_1 + 0x18),0,0x328);
  mbedtls_md_init(param_1);
  iVar1 = *(int *)(param_1 + 0x1c);
  if (iVar1 < 0x14) {
    lVar2 = param_1 + (long)iVar1 * 0x28;
    *(code **)(lVar2 + 0x20) = mbedtls_platform_entropy_poll;
    *(undefined8 *)(lVar2 + 0x28) = 0;
    *(undefined8 *)(lVar2 + 0x38) = 0x20;
    *(undefined4 *)(lVar2 + 0x40) = 1;
    *(int *)(param_1 + 0x1c) = iVar1 + 1;
  }
  return;
}

