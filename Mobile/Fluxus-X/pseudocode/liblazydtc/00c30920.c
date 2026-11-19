/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c30920
 */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

double modf(double __x,double *__iptr)

{
  double dVar1;
  
  dVar1 = modf(__x,__iptr);
  return dVar1;
}

