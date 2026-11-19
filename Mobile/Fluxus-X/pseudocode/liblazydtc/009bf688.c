/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009bf688
 */

char * SSL_state_string_long(SSL *s)

{
  int iVar1;
  uint uVar2;
  char *pcVar3;
  
  iVar1 = ossl_statem_in_error();
  if (iVar1 == 0) {
    uVar2 = SSL_get_state(s);
    if (uVar2 < 0x32) {
      pcVar3 = (&PTR_s_before_SSL_initialization_00c57800)[(int)uVar2];
    }
    else {
      pcVar3 = "unknown state";
    }
  }
  else {
    pcVar3 = "error";
  }
  return pcVar3;
}

