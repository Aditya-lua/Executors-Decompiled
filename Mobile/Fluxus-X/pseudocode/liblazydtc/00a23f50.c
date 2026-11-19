/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a23f50
 */

int FUN_00a23f50(EVP_PKEY *param_1,int *param_2)

{
  int iVar1;
  EC_KEY *key;
  
  if (*(EC_KEY **)(param_2 + 8) == (EC_KEY *)0x0) {
    iVar1 = EVP_PKEY_set_type(param_1,*param_2);
    return iVar1;
  }
  key = EC_KEY_dup(*(EC_KEY **)(param_2 + 8));
  iVar1 = 0;
  if (key != (EC_KEY *)0x0) {
    iVar1 = EVP_PKEY_assign(param_1,0x198,key);
    if (iVar1 == 0) {
      EC_KEY_free(key);
      iVar1 = 0;
    }
  }
  return iVar1;
}

