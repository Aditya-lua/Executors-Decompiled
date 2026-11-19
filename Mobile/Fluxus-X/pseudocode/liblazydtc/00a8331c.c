/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a8331c
 */

bool ossl_ctype_check(uint param_1,ushort param_2)

{
  bool bVar1;
  
  bVar1 = false;
  if (param_1 < 0x80) {
    bVar1 = (*(ushort *)(&DAT_00766c40 + (long)(int)param_1 * 2) & param_2) != 0;
  }
  return bVar1;
}

