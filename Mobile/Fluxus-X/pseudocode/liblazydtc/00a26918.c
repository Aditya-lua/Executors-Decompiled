/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a26918
 */

undefined8 ossl_ec_set_check_group_type_from_name(EC_KEY *param_1,long param_2)

{
  int iVar1;
  long lVar2;
  
  iVar1 = 0;
  if (param_2 != 0) {
    iVar1 = OPENSSL_strcasecmp(param_2,"default");
    if (iVar1 == 0) {
      lVar2 = 0;
    }
    else {
      iVar1 = OPENSSL_strcasecmp(param_2,"named");
      if (iVar1 == 0) {
        lVar2 = 1;
      }
      else {
        iVar1 = OPENSSL_strcasecmp(param_2,"named-nist");
        if (iVar1 != 0) {
          return 0;
        }
        lVar2 = 2;
      }
    }
    iVar1 = (&DAT_00c5b3d8)[lVar2 * 4];
  }
  EC_KEY_clear_flags(param_1,0x6000);
  EC_KEY_set_flags(param_1,iVar1);
  return 1;
}

