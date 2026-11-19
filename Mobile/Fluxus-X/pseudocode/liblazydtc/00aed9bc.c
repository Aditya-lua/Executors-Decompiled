/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00aed9bc
 */

int UI_add_input_string(UI *ui,char *prompt,int flags,char *result_buf,int minsize,int maxsize)

{
  int iVar1;
  long lVar2;
  long lVar3;
  UI *pUVar4;
  
  lVar2 = FUN_00aef184(prompt,0,1,flags,result_buf);
  if (lVar2 == 0) {
LAB_00aeda44:
    iVar1 = -1;
  }
  else {
    pUVar4 = ui + 8;
    if (*(long *)pUVar4 == 0) {
      lVar3 = OPENSSL_sk_new_null();
      *(long *)pUVar4 = lVar3;
      if (lVar3 == 0) {
        FUN_00aed930(lVar2);
        goto LAB_00aeda44;
      }
    }
    *(int *)(lVar2 + 0x28) = minsize;
    *(int *)(lVar2 + 0x2c) = maxsize;
    *(undefined8 *)(lVar2 + 0x30) = 0;
    iVar1 = OPENSSL_sk_push(*(undefined8 *)pUVar4,lVar2);
    if (iVar1 < 1) {
      iVar1 = iVar1 + -1;
      FUN_00aed930(lVar2);
    }
  }
  return iVar1;
}

