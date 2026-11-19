/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009fd5e4
 */

int BIO_get_new_index(void)

{
  char cVar1;
  bool bVar2;
  int iVar3;
  
  iVar3 = CRYPTO_THREAD_run_once(&DAT_00d218f8,FUN_009fd66c);
  if ((iVar3 == 0) || (DAT_00d218fc == 0)) {
    ERR_new();
    ERR_set_debug("crypto/bio/bio_meth.c",0x1c,"BIO_get_new_index");
    ERR_set_error(0x20,0xc0100,0);
    return -1;
  }
  do {
    iVar3 = DAT_00cc8708 + 1;
    cVar1 = '\x01';
    bVar2 = (bool)ExclusiveMonitorPass(0xcc8708,0x10);
    if (bVar2) {
      cVar1 = ExclusiveMonitorsStatus();
      DAT_00cc8708 = iVar3;
    }
  } while (cVar1 != '\0');
  return iVar3;
}

