/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c37ef0
 */

stack_st_X509_ATTRIBUTE * X509at_add1_attr(stack_st_X509_ATTRIBUTE **x,X509_ATTRIBUTE *attr)

{
  stack_st_X509_ATTRIBUTE *psVar1;
  
  psVar1 = X509at_add1_attr(x,attr);
  return psVar1;
}

