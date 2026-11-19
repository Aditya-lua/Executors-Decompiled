/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009bf6e0
 */

char * SSL_state_string(SSL *s)

{
  int iVar1;
  uint uVar2;
  char *pcVar3;
  
  iVar1 = ossl_statem_in_error();
  if (iVar1 == 0) {
    uVar2 = SSL_get_state(s);
    if (uVar2 < 0x32) {
      pcVar3 = (&PTR_s_PINIT_00c57990)[(int)uVar2];
    }
    else {
      pcVar3 = "UNKWN";
    }
  }
  else {
    pcVar3 = "SSLERR";
  }
  return pcVar3;
}

