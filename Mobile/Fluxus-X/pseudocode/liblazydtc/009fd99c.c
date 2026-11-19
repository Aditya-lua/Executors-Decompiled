/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009fd99c
 */

int BIO_vprintf(BIO *bio,char *format,va_list args)

{
  int iVar1;
  undefined8 local_870;
  undefined8 uStack_868;
  undefined8 local_860;
  undefined8 uStack_858;
  undefined1 auStack_844 [4];
  void *local_840;
  undefined8 local_838;
  undefined1 *puStack_830;
  undefined1 auStack_828 [2048];
  int local_28 [2];
  
  puStack_830 = auStack_828;
  local_838 = 0x800;
  local_840 = (void *)0x0;
  uStack_858 = *(undefined8 *)((long)args + 0x18);
  local_860 = *(undefined8 *)((long)args + 0x10);
  uStack_868 = *(undefined8 *)((long)args + 8);
  local_870 = *(undefined8 *)args;
  iVar1 = FUN_009fda6c(&puStack_830,&local_840,&local_838,local_28,auStack_844,format,&local_870);
  if (iVar1 == 0) {
    CRYPTO_free(local_840);
    iVar1 = -1;
  }
  else if (local_840 == (void *)0x0) {
    iVar1 = BIO_write(bio,auStack_828,local_28[0]);
  }
  else {
    iVar1 = BIO_write(bio,local_840,local_28[0]);
    CRYPTO_free(local_840);
  }
  return iVar1;
}

