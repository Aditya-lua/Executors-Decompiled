/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ad152c
 */

RSA_METHOD * RSA_get_method(RSA *rsa)

{
  return (RSA_METHOD *)rsa->engine;
}

