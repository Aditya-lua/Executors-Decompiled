/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a22c44
 */

int DSO_pathbyaddr(void *addr,char *path,int sz)

{
  int iVar1;
  DSO_METHOD *pDVar2;
  
  pDVar2 = DSO_METHOD_openssl();
  if (pDVar2->finish == (_func_3880 *)0x0) {
    ERR_new();
    ERR_set_debug("crypto/dso/dso_lib.c",0x131,"DSO_pathbyaddr");
    ERR_set_error(0x25,0x6c,0);
    return -1;
  }
                    /* WARNING: Could not recover jumptable at 0x00a22c84. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  iVar1 = (*pDVar2->finish)(addr);
  return iVar1;
}

