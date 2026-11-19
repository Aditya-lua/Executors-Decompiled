/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a82e80
 */

void FUN_00a82e80(void)

{
  byte *pbVar1;
  
  pbVar1 = (byte *)ossl_namemap_new();
  if (pbVar1 != (byte *)0x0) {
    *pbVar1 = *pbVar1 | 1;
  }
  return;
}

