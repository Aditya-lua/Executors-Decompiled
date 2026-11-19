/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00aee3c4
 */

int UI_dup_error_string(UI *ui,char *text)

{
  undefined4 uVar1;
  int iVar2;
  char *pcVar3;
  undefined4 *puVar4;
  long lVar5;
  UI *pUVar6;
  
  if (text == (char *)0x0) {
    ERR_new();
    ERR_set_debug("crypto/ui/ui_lib.c",0x69,"general_allocate_prompt");
    uVar1 = 0xc0102;
  }
  else {
    pcVar3 = CRYPTO_strdup(text,"crypto/ui/ui_lib.c",0x15a);
    if (pcVar3 != (char *)0x0) {
      puVar4 = (undefined4 *)CRYPTO_zalloc(0x48,"crypto/ui/ui_lib.c",0x6d);
      if (puVar4 == (undefined4 *)0x0) {
        return -1;
      }
      *(char **)(puVar4 + 2) = pcVar3;
      puVar4[4] = 0;
      puVar4[0x10] = 1;
      *puVar4 = 5;
      *(undefined8 *)(puVar4 + 6) = 0;
      pUVar6 = ui + 8;
      if (*(long *)pUVar6 == 0) {
        lVar5 = OPENSSL_sk_new_null();
        *(long *)pUVar6 = lVar5;
        if (lVar5 == 0) {
          FUN_00aed930(puVar4);
          return -1;
        }
      }
      *(undefined8 *)(puVar4 + 10) = 0;
      *(undefined8 *)(puVar4 + 0xc) = 0;
      iVar2 = OPENSSL_sk_push(*(undefined8 *)pUVar6,puVar4);
      if (iVar2 < 1) {
        FUN_00aed930(puVar4);
        return iVar2 + -1;
      }
      return iVar2;
    }
    ERR_new();
    ERR_set_debug("crypto/ui/ui_lib.c",0x15c,"UI_dup_error_string");
    uVar1 = 0xc0100;
  }
  ERR_set_error(0x28,uVar1,0);
  return -1;
}

