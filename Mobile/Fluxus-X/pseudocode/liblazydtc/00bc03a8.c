/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bc03a8
 */

void FSE_getErrorName(ulong param_1)

{
  int iVar1;
  
  iVar1 = 0;
  if (0xffffffffffffff88 < param_1) {
    iVar1 = -(int)param_1;
  }
  ERR_getErrorString(iVar1);
  return;
}

