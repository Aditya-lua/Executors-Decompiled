/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ae7390
 */

bool SRP_user_pwd_set1_ids(undefined8 *param_1,char *param_2,char *param_3)

{
  bool bVar1;
  char *pcVar2;
  
  CRYPTO_free((void *)*param_1);
  CRYPTO_free((void *)param_1[5]);
  if (param_2 != (char *)0x0) {
    pcVar2 = CRYPTO_strdup(param_2,"crypto/srp/srp_vfy.c",0xdb);
    *param_1 = pcVar2;
    if (pcVar2 == (char *)0x0) {
      return false;
    }
  }
  if (param_3 == (char *)0x0) {
    bVar1 = true;
  }
  else {
    pcVar2 = CRYPTO_strdup(param_3,"crypto/srp/srp_vfy.c",0xdd);
    bVar1 = pcVar2 != (char *)0x0;
    param_1[5] = pcVar2;
  }
  return bVar1;
}

