/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ac22c8
 */

void FUN_00ac22c8(BIO *param_1,int param_2,fp *param_3)

{
  BIO *b;
  
  b = BIO_next(param_1);
  if (b == (BIO *)0x0) {
    return;
  }
  BIO_callback_ctrl(b,param_2,param_3);
  return;
}

