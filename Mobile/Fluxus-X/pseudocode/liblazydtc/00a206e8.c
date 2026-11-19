/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a206e8
 */

int DSA_set_method(DSA *dsa,DSA_METHOD *param_2)

{
  code *pcVar1;
  
  pcVar1 = *(code **)&dsa[1].p[2].top;
  if (pcVar1 != (code *)0x0) {
    (*pcVar1)(dsa);
  }
  ENGINE_finish((ENGINE *)dsa[1].q);
  dsa[1].p = (BIGNUM *)param_2;
  dsa[1].q = (BIGNUM *)0x0;
  if (param_2->init != (_func_1738 *)0x0) {
    (*param_2->init)(dsa);
  }
  return 1;
}

