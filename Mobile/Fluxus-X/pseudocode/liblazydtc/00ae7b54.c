/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ae7b54
 */

bool SRP_VBASE_add0_user(undefined8 *param_1)

{
  int iVar1;
  
  iVar1 = OPENSSL_sk_push(*param_1);
  return 0 < iVar1;
}

