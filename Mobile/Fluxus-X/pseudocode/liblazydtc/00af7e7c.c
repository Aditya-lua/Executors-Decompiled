/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00af7e7c
 */

undefined8 X509v3_addr_validate_path(long param_1)

{
  int iVar1;
  undefined8 uVar2;
  
  if (((*(long *)(param_1 + 0x98) == 0) || (iVar1 = OPENSSL_sk_num(), iVar1 == 0)) ||
     (*(long *)(param_1 + 0x38) == 0)) {
    *(undefined4 *)(param_1 + 0xb0) = 1;
    return 0;
  }
  uVar2 = FUN_00af7ed4(param_1,*(undefined8 *)(param_1 + 0x98),0);
  return uVar2;
}

