/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a14900
 */

void SCT_CTX_set1_issuer(long param_1,undefined8 param_2)

{
  undefined8 uVar1;
  
  uVar1 = X509_get_X509_PUBKEY(param_2);
  FUN_00a14940(param_1,uVar1,param_1 + 0x18,param_1 + 0x20);
  return;
}

