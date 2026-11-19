/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00aedb64
 */

int UI_add_verify_string
              (UI *ui,char *prompt,int flags,char *result_buf,int minsize,int maxsize,char *test_buf
              )

{
  int iVar1;
  long lVar2;
  long lVar3;
  UI *pUVar4;
  
  lVar2 = FUN_00aef184(prompt,0,2,flags,result_buf);
  if (lVar2 == 0) {
LAB_00aedbf4:
    iVar1 = -1;
  }
  else {
    pUVar4 = ui + 8;
    if (*(long *)pUVar4 == 0) {
      lVar3 = OPENSSL_sk_new_null();
      *(long *)pUVar4 = lVar3;
      if (lVar3 == 0) {
        FUN_00aed930(lVar2);
        goto LAB_00aedbf4;
      }
    }
    *(int *)(lVar2 + 0x28) = minsize;
    *(int *)(lVar2 + 0x2c) = maxsize;
    *(char **)(lVar2 + 0x30) = test_buf;
    iVar1 = OPENSSL_sk_push(*(undefined8 *)pUVar4,lVar2);
    if (iVar1 < 1) {
      iVar1 = iVar1 + -1;
      FUN_00aed930(lVar2);
    }
  }
  return iVar1;
}

