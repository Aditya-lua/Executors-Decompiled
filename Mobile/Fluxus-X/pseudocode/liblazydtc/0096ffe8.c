/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0096ffe8
 */

undefined8 FUN_0096ffe8(long param_1)

{
  int iVar1;
  SSL *s;
  
  s = *(SSL **)(*(long *)(*(long *)(param_1 + 0x10) + 0x30) + 8);
  if (s != (SSL *)0x0) {
    iVar1 = SSL_pending(s);
    if (iVar1 != 0) {
      return 1;
    }
  }
  return 0;
}

