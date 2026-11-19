/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009fc014
 */

int BIO_read(BIO *b,void *data,int len)

{
  int iVar1;
  int local_18 [2];
  
  if (len < 0) {
    return 0;
  }
  iVar1 = FUN_009fc050(b,data,(long)len,local_18);
  if (iVar1 < 1) {
    local_18[0] = iVar1;
  }
  return local_18[0];
}

