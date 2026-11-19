/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009fcf00
 */

BIO * BIO_push(BIO *b,BIO *append)

{
  BIO *pBVar1;
  BIO *parg;
  
  if (b == (BIO *)0x0) {
    b = append;
  }
  else {
    pBVar1 = b;
    do {
      parg = pBVar1;
      pBVar1 = *(BIO **)&parg->references;
    } while (*(BIO **)&parg->references != (BIO *)0x0);
    *(BIO **)&parg->references = append;
    if (append != (BIO *)0x0) {
      append->num_read = (ulong)parg;
    }
    BIO_ctrl(b,6,0,parg);
  }
  return b;
}

