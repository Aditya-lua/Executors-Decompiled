/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c3efc0
 */

stack_st_X509_EXTENSION * X509v3_add_ext(stack_st_X509_EXTENSION **x,X509_EXTENSION *ex,int loc)

{
  stack_st_X509_EXTENSION *psVar1;
  
  psVar1 = X509v3_add_ext(x,ex,loc);
  return psVar1;
}

