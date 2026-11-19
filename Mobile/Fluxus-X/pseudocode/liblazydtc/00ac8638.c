/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ac8638
 */

int RAND_bytes(uchar *buf,int num)

{
  int iVar1;
  
  if (num < 0) {
    return 0;
  }
  iVar1 = RAND_bytes_ex(0,buf,(long)num,0);
  return iVar1;
}

