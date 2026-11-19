/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a5400c
 */

void ERR_load_strings(int lib,ERR_STRING_DATA *str)

{
  ERR_STRING_DATA *pEVar1;
  int iVar2;
  ulong uVar3;
  ulong uVar4;
  
  iVar2 = ossl_err_load_ERR_strings();
  if (iVar2 != 0) {
    uVar3 = str->error;
    if (uVar3 != 0) {
      pEVar1 = str;
      do {
        uVar4 = uVar3 | (lib & 0xffU) << 0x17;
        uVar3 = pEVar1[1].error;
        pEVar1->error = uVar4;
        pEVar1 = pEVar1 + 1;
      } while (uVar3 != 0);
    }
    iVar2 = CRYPTO_THREAD_write_lock(DAT_00d21a20);
    if (iVar2 != 0) {
      uVar3 = str->error;
      while (uVar3 != 0) {
        OPENSSL_LH_insert(DAT_00d21a28,str);
        str = str + 1;
        uVar3 = str->error;
      }
      CRYPTO_THREAD_unlock(DAT_00d21a20);
    }
  }
  return;
}

