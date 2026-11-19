/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a69284
 */

int EVP_add_cipher(EVP_CIPHER *cipher)

{
  int iVar1;
  char *pcVar2;
  
  if (cipher != (EVP_CIPHER *)0x0) {
    pcVar2 = OBJ_nid2sn(cipher->nid);
    iVar1 = OBJ_NAME_add(pcVar2,2,(char *)cipher);
    if (iVar1 != 0) {
      pcVar2 = OBJ_nid2ln(cipher->nid);
      iVar1 = OBJ_NAME_add(pcVar2,2,(char *)cipher);
      return iVar1;
    }
  }
  return 0;
}

