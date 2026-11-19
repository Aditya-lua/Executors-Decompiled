/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009fc2cc
 */

int BIO_write(BIO *b,void *data,int len)

{
  int iVar1;
  int local_18 [2];
  
  if (len < 1) {
    return 0;
  }
  iVar1 = FUN_009fc30c(b,data,(long)len,local_18);
  if (iVar1 < 1) {
    local_18[0] = iVar1;
  }
  return local_18[0];
}

