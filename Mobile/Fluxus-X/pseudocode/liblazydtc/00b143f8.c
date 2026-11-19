/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b143f8
 */

int X509_VERIFY_PARAM_set_flags(X509_VERIFY_PARAM *param,ulong flags)

{
  ulong uVar1;
  
  uVar1 = param->flags | flags;
  if ((flags & 0x780) != 0) {
    uVar1 = uVar1 | 0x80;
  }
  param->flags = uVar1;
  return 1;
}

