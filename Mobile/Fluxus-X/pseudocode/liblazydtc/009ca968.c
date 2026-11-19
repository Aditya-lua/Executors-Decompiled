/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009ca968
 */

char * SSL_rstate_string_long(SSL *s)

{
  uint uVar1;
  
  uVar1 = *(int *)((long)&s[4].client_CA + 4) - 0xf0;
  if (uVar1 < 3) {
    return (&PTR_s_read_header_00c581b0)[(int)uVar1];
  }
  return "unknown";
}

