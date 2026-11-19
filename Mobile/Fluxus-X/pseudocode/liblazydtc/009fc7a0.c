/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009fc7a0
 */

/* WARNING: Removing unreachable block (ram,0x009fc960) */

int BIO_gets(BIO *bp,char *buf,int size)

{
  int iVar1;
  ulong uVar2;
  undefined8 uVar3;
  ulong uVar4;
  code *pcVar5;
  code *pcVar6;
  ulong local_28;
  
  local_28 = 0;
  if (bp == (BIO *)0x0) {
    ERR_new();
    ERR_set_debug("crypto/bio/bio_lib.c",0x1c8,"BIO_gets");
    uVar3 = 0xc0102;
    goto LAB_009fc860;
  }
  if ((bp->callback == (_func_603 *)0x0) || (*(long *)(bp->callback + 0x38) == 0)) {
    ERR_new();
    ERR_set_debug("crypto/bio/bio_lib.c",0x1cc,"BIO_gets");
    ERR_set_error(0x20,0x79,0);
    return -2;
  }
  if (size < 0) {
    ERR_new();
    ERR_set_debug("crypto/bio/bio_lib.c",0x1d1,"BIO_gets");
    uVar3 = 0x7d;
    goto LAB_009fc860;
  }
  pcVar6 = *(code **)&bp->init;
  if ((code *)bp->cb_arg == (code *)0x0) {
    if (pcVar6 != (code *)0x0) goto LAB_009fc8ac;
  }
  else {
    if (pcVar6 == (code *)0x0) {
      iVar1 = (*(code *)bp->cb_arg)(bp,5,buf,size,0,1);
    }
    else {
LAB_009fc8ac:
      iVar1 = (*pcVar6)(bp,5,buf,(long)size,0,0,1,0);
    }
    if (iVar1 < 1) {
      return iVar1;
    }
  }
  if (bp->num == 0) {
    ERR_new();
    ERR_set_debug("crypto/bio/bio_lib.c",0x1dc,"BIO_gets");
    uVar3 = 0x78;
LAB_009fc860:
    ERR_set_error(0x20,uVar3,0);
    return -1;
  }
  uVar2 = (**(code **)(bp->callback + 0x38))(bp,buf,size);
  uVar4 = uVar2 & 0xffffffff;
  if ((int)uVar2 < 1) {
    uVar2 = 0;
    pcVar6 = (code *)bp->cb_arg;
    pcVar5 = *(code **)&bp->init;
    if (pcVar6 == (code *)0x0) goto LAB_009fc998;
LAB_009fc91c:
    if (pcVar5 == (code *)0x0) {
      if ((int)uVar4 < 1) {
        uVar2 = (long)(int)uVar4;
      }
      uVar4 = (*pcVar6)(bp,0x85,buf,size,0,uVar2);
      if (0 < (long)uVar4) {
        local_28 = uVar4;
        goto LAB_009fc9c8;
      }
    }
    else {
LAB_009fc99c:
      uVar4 = (*pcVar5)(bp,0x85,buf,(long)size,0,0,uVar4,&local_28);
    }
  }
  else {
    uVar2 = (ulong)(int)uVar2;
    uVar4 = 1;
    pcVar6 = (code *)bp->cb_arg;
    pcVar5 = *(code **)&bp->init;
    local_28 = uVar2;
    if (pcVar6 != (code *)0x0) goto LAB_009fc91c;
LAB_009fc998:
    if (pcVar5 != (code *)0x0) goto LAB_009fc99c;
  }
  if ((int)uVar4 < 1) {
    return (int)uVar4;
  }
LAB_009fc9c8:
  iVar1 = (int)local_28;
  if ((ulong)(long)size < local_28) {
    iVar1 = -1;
  }
  return iVar1;
}

