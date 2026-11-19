/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00aee0c8
 */

int UI_add_info_string(UI *ui,char *text)

{
  int iVar1;
  undefined4 *puVar2;
  long lVar3;
  UI *pUVar4;
  
  if (text == (char *)0x0) {
    ERR_new();
    ERR_set_debug("crypto/ui/ui_lib.c",0x69,"general_allocate_prompt");
    ERR_set_error(0x28,0xc0102,0);
  }
  else {
    puVar2 = (undefined4 *)CRYPTO_zalloc(0x48,"crypto/ui/ui_lib.c",0x6d);
    if (puVar2 != (undefined4 *)0x0) {
      *(char **)(puVar2 + 2) = text;
      puVar2[0x10] = 0;
      puVar2[4] = 0;
      *puVar2 = 4;
      *(undefined8 *)(puVar2 + 6) = 0;
      pUVar4 = ui + 8;
      if (*(long *)pUVar4 == 0) {
        lVar3 = OPENSSL_sk_new_null();
        *(long *)pUVar4 = lVar3;
        if (lVar3 == 0) {
          FUN_00aed930(puVar2);
          return -1;
        }
      }
      *(undefined8 *)(puVar2 + 10) = 0;
      *(undefined8 *)(puVar2 + 0xc) = 0;
      iVar1 = OPENSSL_sk_push(*(undefined8 *)pUVar4,puVar2);
      if (iVar1 < 1) {
        FUN_00aed930(puVar2);
        return iVar1 + -1;
      }
      return iVar1;
    }
  }
  return -1;
}

