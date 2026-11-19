/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009fbe3c
 */

BIO * BIO_new(BIO_METHOD *type)

{
  BIO *pBVar1;
  
  pBVar1 = (BIO *)BIO_new_ex(0,type);
  return pBVar1;
}

