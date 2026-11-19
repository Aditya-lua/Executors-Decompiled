/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00aeda5c
 */

int UI_dup_input_string(UI *ui,char *prompt,int flags,char *result_buf,int minsize,int maxsize)

{
  int iVar1;
  char *pcVar2;
  long lVar3;
  long lVar4;
  UI *pUVar5;
  
  if (prompt == (char *)0x0) {
    pcVar2 = (char *)0x0;
  }
  else {
    pcVar2 = CRYPTO_strdup(prompt,"crypto/ui/ui_lib.c",0xd4);
    if (pcVar2 == (char *)0x0) {
      ERR_new();
      ERR_set_debug("crypto/ui/ui_lib.c",0xd6,"UI_dup_input_string");
      ERR_set_error(0x28,0xc0100,0);
      return 0;
    }
  }
  lVar3 = FUN_00aef184(pcVar2,1,1,flags,result_buf);
  if (lVar3 == 0) {
LAB_00aedb48:
    iVar1 = -1;
  }
  else {
    pUVar5 = ui + 8;
    if (*(long *)pUVar5 == 0) {
      lVar4 = OPENSSL_sk_new_null();
      *(long *)pUVar5 = lVar4;
      if (lVar4 == 0) {
        FUN_00aed930(lVar3);
        goto LAB_00aedb48;
      }
    }
    *(int *)(lVar3 + 0x28) = minsize;
    *(int *)(lVar3 + 0x2c) = maxsize;
    *(undefined8 *)(lVar3 + 0x30) = 0;
    iVar1 = OPENSSL_sk_push(*(undefined8 *)pUVar5,lVar3);
    if (iVar1 < 1) {
      iVar1 = iVar1 + -1;
      FUN_00aed930(lVar3);
    }
  }
  return iVar1;
}

