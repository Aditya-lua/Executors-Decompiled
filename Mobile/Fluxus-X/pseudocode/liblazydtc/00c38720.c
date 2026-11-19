/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c38720
 */

int BIO_vsnprintf(char *buf,size_t n,char *format,va_list args)

{
  int iVar1;
  
  iVar1 = BIO_vsnprintf(buf,n,format,args);
  return iVar1;
}

