/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a1ee38
 */

int DH_set_method(DH *dh,DH_METHOD *meth)

{
  code *pcVar1;
  
  pcVar1 = *(code **)&dh[1].priv_key[1].neg;
  if (pcVar1 != (code *)0x0) {
    (*pcVar1)(dh);
  }
  ENGINE_finish((ENGINE *)dh[1].length);
  dh[1].length = 0;
  dh[1].priv_key = (BIGNUM *)meth;
  if (meth->init != (_func_1704 *)0x0) {
    (*meth->init)(dh);
  }
  return 1;
}

