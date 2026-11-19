/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b613bc
 */

undefined8 FUN_00b613bc(undefined8 *param_1,char *param_2)

{
  int iVar1;
  size_t sVar2;
  long lVar3;
  
  lVar3 = param_1[0x2c];
  if (lVar3 == 0) {
    lVar3 = EVP_MD_fetch(*param_1,(long)param_1 + 0x19,param_1[1]);
    param_1[0x2c] = lVar3;
    if (lVar3 == 0) {
      return 0;
    }
  }
  if (param_2 != (char *)0x0) {
    sVar2 = strlen(param_2);
    if ((0x31 < sVar2) || (iVar1 = EVP_MD_is_a(lVar3,param_2), iVar1 == 0)) {
      ERR_new();
      ERR_set_debug("providers/implementations/signature/sm2_sig.c",0x6a,"sm2sig_set_mdname");
      ERR_set_error(0x39,0x7a,"digest=%s",param_2);
      return 0;
    }
    OPENSSL_strlcpy((long)param_1 + 0x19,param_2,0x32);
  }
  return 1;
}

