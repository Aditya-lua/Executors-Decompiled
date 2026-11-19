/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a22cc8
 */

DSO * DSO_dsobyaddr(DSO *param_1,int param_2)

{
  uint num;
  uint uVar1;
  DSO_METHOD *pDVar2;
  char *filename;
  DSO_METHOD *meth;
  DSO *pDVar3;
  
  pDVar2 = DSO_METHOD_openssl();
  if (pDVar2->finish == (_func_3880 *)0x0) {
    ERR_new();
    ERR_set_debug("crypto/dso/dso_lib.c",0x131,"DSO_pathbyaddr");
    ERR_set_error(0x25,0x6c,0);
  }
  else {
    num = (*pDVar2->finish)(param_1);
    if (-1 < (int)num) {
      filename = CRYPTO_malloc(num,"crypto/dso/dso_lib.c",0x140);
      if (filename == (char *)0x0) {
        pDVar3 = (DSO *)0x0;
      }
      else {
        pDVar2 = DSO_METHOD_openssl();
        if (pDVar2->finish == (_func_3880 *)0x0) {
          ERR_new();
          ERR_set_debug("crypto/dso/dso_lib.c",0x131,"DSO_pathbyaddr");
          meth = (DSO_METHOD *)0x0;
          ERR_set_error(0x25,0x6c);
          uVar1 = 0xffffffff;
        }
        else {
          meth = (DSO_METHOD *)(ulong)num;
          uVar1 = (*pDVar2->finish)(param_1);
        }
        pDVar3 = (DSO *)0x0;
        if (uVar1 == num) {
          pDVar3 = DSO_load((DSO *)0x0,filename,meth,param_2);
        }
      }
      CRYPTO_free(filename);
      return pDVar3;
    }
  }
  return (DSO *)0x0;
}

