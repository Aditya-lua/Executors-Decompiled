/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a75b64
 */

undefined * EVP_PKEY_meth_get0(long param_1)

{
  int iVar1;
  undefined *puVar2;
  
  switch(param_1) {
  case 0:
    return &DAT_00c7d888;
  case 1:
    return &DAT_00c60d08;
  case 2:
    return &DAT_00c60f08;
  case 3:
    return &DAT_00c61008;
  case 4:
    return &DAT_00c7d988;
  case 5:
    return &DAT_00c60e08;
  case 6:
    return &DAT_00c5cbc0;
  case 7:
    return &DAT_00c5ccc0;
  case 8:
    return &DAT_00c5cdc0;
  case 9:
    return &DAT_00c5cec0;
  }
  if (DAT_00d21b48 == 0) {
    puVar2 = (undefined *)0x0;
  }
  else {
    iVar1 = OPENSSL_sk_num(DAT_00d21b48);
    puVar2 = (undefined *)0x0;
    if (param_1 - 10U < (ulong)(long)iVar1) {
      puVar2 = (undefined *)OPENSSL_sk_value(DAT_00d21b48,param_1 - 10U & 0xffffffff);
    }
  }
  return puVar2;
}

