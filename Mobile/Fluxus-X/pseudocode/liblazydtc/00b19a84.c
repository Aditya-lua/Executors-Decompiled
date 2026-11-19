/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b19a84
 */

BIO * BIO_new_connect(char *host_port)

{
  BIO *bp;
  long lVar1;
  
  bp = BIO_new((BIO_METHOD *)&DAT_00c81f70);
  if ((bp != (BIO *)0x0) && (lVar1 = BIO_ctrl(bp,100,0,host_port), lVar1 == 0)) {
    BIO_free(bp);
    bp = (BIO *)0x0;
  }
  return bp;
}

