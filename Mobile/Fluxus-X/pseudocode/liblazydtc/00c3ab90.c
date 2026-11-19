/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c3ab90
 */

size_t EC_POINT_point2oct(EC_GROUP *group,EC_POINT *p,point_conversion_form_t form,uchar *buf,
                         size_t len,BN_CTX *ctx)

{
  size_t sVar1;
  
  sVar1 = EC_POINT_point2oct(group,p,form,buf,len,ctx);
  return sVar1;
}

