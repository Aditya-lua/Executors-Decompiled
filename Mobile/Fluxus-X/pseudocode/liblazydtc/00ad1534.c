/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ad1534
 */

int RSA_set_method(RSA *rsa,RSA_METHOD *meth)

{
  if (*(code **)(rsa->engine + 0x40) != (code *)0x0) {
    (**(code **)(rsa->engine + 0x40))(rsa);
  }
  ENGINE_finish((ENGINE *)rsa->n);
  rsa->engine = (ENGINE *)meth;
  rsa->n = (BIGNUM *)0x0;
  if (meth->init != (_func_1624 *)0x0) {
    (*meth->init)(rsa);
  }
  return 1;
}

