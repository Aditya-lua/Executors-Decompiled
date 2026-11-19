/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00abb360
 */

PKCS7 * PKCS12_pack_p7encdata
                  (int pbe_nid,char *pass,int passlen,uchar *salt,int saltlen,int iter,
                  stack_st_PKCS12_SAFEBAG *bags)

{
  PKCS7 *pPVar1;
  
  pPVar1 = (PKCS7 *)PKCS12_pack_p7encdata_ex(pbe_nid,pass,passlen,salt,saltlen,iter,bags,0,0);
  return pPVar1;
}

