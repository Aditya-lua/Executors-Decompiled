/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a77b14
 */

int EVP_PKEY_CTX_md(EVP_PKEY_CTX *param_1,int param_2,int param_3,char *param_4)

{
  int iVar1;
  EVP_MD *p2;
  
  if (param_4 != (char *)0x0) {
    p2 = EVP_get_digestbyname(param_4);
    if (p2 != (EVP_MD *)0x0) {
      iVar1 = EVP_PKEY_CTX_ctrl(param_1,-1,param_2,param_3,0,p2);
      return iVar1;
    }
  }
  ERR_new();
  ERR_set_debug("crypto/evp/pmeth_lib.c",0x699,"EVP_PKEY_CTX_md");
  ERR_set_error(6,0x98,0);
  return 0;
}

