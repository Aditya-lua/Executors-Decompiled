/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009ca994
 */

char * SSL_rstate_string(SSL *s)

{
  uint uVar1;
  
  uVar1 = *(int *)((long)&s[4].client_CA + 4) - 0xf0;
  if (uVar1 < 3) {
    return (&PTR_DAT_00c581d0)[(int)uVar1];
  }
  return "unknown";
}

