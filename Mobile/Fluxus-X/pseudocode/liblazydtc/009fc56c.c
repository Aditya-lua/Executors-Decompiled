/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009fc56c
 */

/* WARNING: Removing unreachable block (ram,0x009fc704) */

int BIO_puts(BIO *bp,char *buf)

{
  ulong uVar1;
  ulong uVar2;
  undefined8 uVar3;
  code *pcVar4;
  code *pcVar5;
  ulong local_28;
  
  local_28 = 0;
  if (bp == (BIO *)0x0) {
    ERR_new();
    ERR_set_debug("crypto/bio/bio_lib.c",0x197,"BIO_puts");
    uVar3 = 0xc0102;
  }
  else {
    if ((bp->callback == (_func_603 *)0x0) || (*(long *)(bp->callback + 0x30) == 0)) {
      ERR_new();
      ERR_set_debug("crypto/bio/bio_lib.c",0x19b,"BIO_puts");
      ERR_set_error(0x20,0x79,0);
      uVar1 = 0xfffffffe;
      goto LAB_009fc630;
    }
    pcVar5 = *(code **)&bp->init;
    if ((code *)bp->cb_arg == (code *)0x0) {
      if (pcVar5 != (code *)0x0) goto LAB_009fc648;
    }
    else {
      if (pcVar5 == (code *)0x0) {
        uVar1 = (*(code *)bp->cb_arg)(bp,4,buf,0,0,1);
      }
      else {
LAB_009fc648:
        uVar1 = (*pcVar5)(bp,4,buf,0,0,0,1,0);
      }
      if ((int)uVar1 < 1) goto LAB_009fc630;
    }
    if (bp->num == 0) {
      ERR_new();
      ERR_set_debug("crypto/bio/bio_lib.c",0x1a6,"BIO_puts");
      uVar3 = 0x78;
    }
    else {
      uVar2 = (**(code **)(bp->callback + 0x30))(bp,buf);
      uVar1 = uVar2 & 0xffffffff;
      if ((int)uVar2 < 1) {
        uVar2 = 0;
        pcVar5 = (code *)bp->cb_arg;
        pcVar4 = *(code **)&bp->init;
        if (pcVar5 != (code *)0x0) goto LAB_009fc6c0;
LAB_009fc73c:
        if (pcVar4 != (code *)0x0) {
LAB_009fc740:
          uVar1 = (*pcVar4)(bp,0x84,buf,0,0,0,uVar1,&local_28);
        }
LAB_009fc764:
        if ((int)uVar1 < 1) goto LAB_009fc630;
      }
      else {
        uVar2 = (ulong)(int)uVar2;
        uVar1 = 1;
        *(ulong *)&(bp->ex_data).dummy = *(long *)&(bp->ex_data).dummy + uVar2;
        pcVar5 = (code *)bp->cb_arg;
        pcVar4 = *(code **)&bp->init;
        local_28 = uVar2;
        if (pcVar5 == (code *)0x0) goto LAB_009fc73c;
LAB_009fc6c0:
        if (pcVar4 != (code *)0x0) goto LAB_009fc740;
        if ((int)uVar1 < 1) {
          uVar2 = (long)(int)uVar1;
        }
        uVar1 = (*pcVar5)(bp,0x84,buf,0,0,uVar2);
        if ((long)uVar1 < 1) goto LAB_009fc764;
        local_28 = uVar1;
      }
      uVar1 = local_28;
      if (local_28 >> 0x1f == 0) goto LAB_009fc630;
      ERR_new();
      ERR_set_debug("crypto/bio/bio_lib.c",0x1b8,"BIO_puts");
      uVar3 = 0x66;
    }
  }
  ERR_set_error(0x20,uVar3,0);
  uVar1 = 0xffffffff;
LAB_009fc630:
  return (int)uVar1;
}

