/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a777c0
 */

ulong FUN_00a777c0(EVP_PKEY_CTX *param_1,char *param_2,char *param_3)

{
  uint uVar1;
  int iVar2;
  code *UNRECOVERED_JUMPTABLE;
  ulong uVar3;
  EVP_MD *p2;
  undefined8 uVar4;
  
  if (param_1 == (EVP_PKEY_CTX *)0x0) {
    ERR_new();
    uVar4 = 0x5a6;
  }
  else {
    uVar1 = evp_pkey_ctx_state();
    if (1 < uVar1) {
      if (uVar1 == 2) {
        uVar3 = evp_pkey_ctx_ctrl_str_to_param(param_1,param_2,param_3);
        return uVar3;
      }
      return 0;
    }
    if ((*(long *)(param_1 + 0x78) != 0) &&
       (UNRECOVERED_JUMPTABLE = *(code **)(*(long *)(param_1 + 0x78) + 200),
       UNRECOVERED_JUMPTABLE != (code *)0x0)) {
      iVar2 = strcmp(param_2,"digest");
      if (iVar2 != 0) {
                    /* WARNING: Could not recover jumptable at 0x00a77830. Too many branches */
                    /* WARNING: Treating indirect jump as call */
        uVar3 = (*UNRECOVERED_JUMPTABLE)(param_1,param_2,param_3);
        return uVar3;
      }
      if ((param_3 == (char *)0x0) || (p2 = EVP_get_digestbyname(param_3), p2 == (EVP_MD *)0x0)) {
        ERR_new();
        ERR_set_debug("crypto/evp/pmeth_lib.c",0x699,"EVP_PKEY_CTX_md");
        ERR_set_error(6,0x98,0);
        return 0;
      }
      uVar1 = EVP_PKEY_CTX_ctrl(param_1,-1,0x7f0,1,0,p2);
      return (ulong)uVar1;
    }
    ERR_new();
    uVar4 = 0x5b0;
  }
  ERR_set_debug("crypto/evp/pmeth_lib.c",uVar4,"evp_pkey_ctx_ctrl_str_int");
  ERR_set_error(6,0x93,0);
  return 0xfffffffe;
}

