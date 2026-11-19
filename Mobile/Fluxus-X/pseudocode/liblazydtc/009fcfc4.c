/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009fcfc4
 */

BIO * BIO_get_retry_BIO(BIO *bio,int *reason)

{
  BIO *pBVar1;
  BIO *pBVar2;
  
  pBVar1 = bio;
  do {
    pBVar2 = bio;
    if ((*(byte *)&pBVar2->ptr >> 3 & 1) == 0) break;
    pBVar1 = pBVar2;
    bio = *(BIO **)&pBVar2->references;
  } while (*(BIO **)&pBVar2->references != (BIO *)0x0);
  if (reason != (int *)0x0) {
    *reason = *(int *)((long)&pBVar1->ptr + 4);
  }
  return pBVar1;
}

