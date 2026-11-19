/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009fab5c
 */

void FUN_009fab5c(BIO *param_1,int param_2,fp *param_3)

{
  BIO *b;
  
  b = BIO_next(param_1);
  BIO_callback_ctrl(b,param_2,param_3);
  return;
}

