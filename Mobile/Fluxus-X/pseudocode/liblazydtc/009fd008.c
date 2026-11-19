/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009fd008
 */

BIO * BIO_find_type(BIO *b,int bio_type)

{
  uint uVar1;
  
  if (b == (BIO *)0x0) {
    ERR_new();
    ERR_set_debug("crypto/bio/bio_lib.c",0x2d0,"BIO_find_type");
    ERR_set_error(0x20,0xc0102,0);
    return (BIO *)0x0;
  }
  do {
    if (b->callback != (_func_603 *)0x0) {
      uVar1 = *(uint *)b->callback;
      if ((bio_type & 0xffU) == 0) {
        if ((uVar1 & bio_type) != 0) {
          return b;
        }
      }
      else if (uVar1 == bio_type) {
        return b;
      }
    }
    b = *(BIO **)&b->references;
  } while (b != (BIO *)0x0);
  return (BIO *)0x0;
}

