/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009fcb54
 */

long BIO_ctrl(BIO *bp,int cmd,long larg,void *parg)

{
  code *pcVar1;
  long lVar2;
  code *UNRECOVERED_JUMPTABLE;
  
  if (bp == (BIO *)0x0) {
    return -1;
  }
  if ((bp->callback == (_func_603 *)0x0) ||
     (UNRECOVERED_JUMPTABLE = *(code **)(bp->callback + 0x40), UNRECOVERED_JUMPTABLE == (code *)0x0)
     ) {
    ERR_new();
    ERR_set_debug("crypto/bio/bio_lib.c",0x23a,"BIO_ctrl");
    ERR_set_error(0x20,0x79,0);
    return -2;
  }
  pcVar1 = *(code **)&bp->init;
  if ((code *)bp->cb_arg == (code *)0x0) {
    if (pcVar1 == (code *)0x0) goto LAB_009fcc3c;
LAB_009fcc04:
    lVar2 = (*pcVar1)(bp,6,parg,0,cmd,larg,1,0);
  }
  else {
    if (pcVar1 != (code *)0x0) goto LAB_009fcc04;
    lVar2 = (*(code *)bp->cb_arg)(bp,6,parg,cmd,larg,1);
  }
  if (lVar2 < 1) {
    return lVar2;
  }
  UNRECOVERED_JUMPTABLE = *(code **)(bp->callback + 0x40);
LAB_009fcc3c:
  lVar2 = (*UNRECOVERED_JUMPTABLE)(bp,cmd,larg,parg);
  UNRECOVERED_JUMPTABLE = *(code **)&bp->init;
  if ((code *)bp->cb_arg == (code *)0x0) {
    if (UNRECOVERED_JUMPTABLE == (code *)0x0) {
      return lVar2;
    }
  }
  else if (UNRECOVERED_JUMPTABLE == (code *)0x0) {
                    /* WARNING: Could not recover jumptable at 0x009fcc84. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    lVar2 = (*(code *)bp->cb_arg)(bp,0x86,parg,cmd,larg,lVar2);
    return lVar2;
  }
                    /* WARNING: Could not recover jumptable at 0x009fccb4. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  lVar2 = (*UNRECOVERED_JUMPTABLE)(bp,0x86,parg,0,cmd,larg,lVar2,0);
  return lVar2;
}

