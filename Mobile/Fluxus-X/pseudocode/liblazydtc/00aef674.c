/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00aef674
 */

void ERR_add_error_mem_bio(undefined8 param_1,BIO *param_2)

{
  int iVar1;
  long lVar2;
  long local_28;
  
  if ((param_2 != (BIO *)0x0) && (lVar2 = BIO_ctrl(param_2,3,0,&local_28), 0 < lVar2)) {
    if (*(char *)(local_28 + lVar2 + -1) != '\0') {
      iVar1 = BIO_write(param_2,&DAT_002ab32c,1);
      if (iVar1 < 1) {
        return;
      }
      lVar2 = BIO_ctrl(param_2,3,0,&local_28);
    }
    if (1 < lVar2) {
      ERR_add_error_txt(param_1,local_28);
    }
  }
  return;
}

