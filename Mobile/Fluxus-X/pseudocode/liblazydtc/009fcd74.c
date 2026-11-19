/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009fcd74
 */

long BIO_callback_ctrl(BIO *b,int cmd,fp *fp)

{
  code *pcVar1;
  long lVar2;
  code *pcVar3;
  fp *local_18;
  
  if (b == (BIO *)0x0) {
    return -2;
  }
  local_18 = fp;
  if (((b->callback == (_func_603 *)0x0) || (cmd != 0xe)) ||
     (pcVar3 = *(code **)(b->callback + 0x58), pcVar3 == (code *)0x0)) {
    ERR_new();
    ERR_set_debug("crypto/bio/bio_lib.c",0x255,"BIO_callback_ctrl");
    ERR_set_error(0x20,0x79,0);
    return -2;
  }
  pcVar1 = *(code **)&b->init;
  if ((code *)b->cb_arg == (code *)0x0) {
    if (pcVar1 == (code *)0x0) goto LAB_009fce50;
LAB_009fce14:
    lVar2 = (*pcVar1)(b,6,&local_18,0,0xe,0,1,0);
  }
  else {
    if (pcVar1 != (code *)0x0) goto LAB_009fce14;
    lVar2 = (*(code *)b->cb_arg)(b,6,&local_18,0xe,0,1);
  }
  if (lVar2 < 1) {
    return lVar2;
  }
  pcVar3 = *(code **)(b->callback + 0x58);
LAB_009fce50:
  lVar2 = (*pcVar3)(b,0xe,local_18);
  pcVar3 = *(code **)&b->init;
  if ((code *)b->cb_arg == (code *)0x0) {
    if (pcVar3 == (code *)0x0) {
      return lVar2;
    }
  }
  else if (pcVar3 == (code *)0x0) {
    lVar2 = (*(code *)b->cb_arg)(b,0x86,&local_18,0xe,0,lVar2);
    return lVar2;
  }
  lVar2 = (*pcVar3)(b,0x86,&local_18,0,0xe,0,lVar2,0);
  return lVar2;
}

