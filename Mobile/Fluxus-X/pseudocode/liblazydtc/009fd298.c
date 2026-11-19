/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009fd298
 */

int BIO_wait(void)

{
  int iVar1;
  undefined4 uVar2;
  
  iVar1 = FUN_009fd2f8();
  if (iVar1 < 1) {
    ERR_new();
    ERR_set_debug("crypto/bio/bio_lib.c",0x38f,"BIO_wait");
    uVar2 = 0x68;
    if (iVar1 == 0) {
      uVar2 = 0x69;
    }
    ERR_set_error(0x20,uVar2,0);
  }
  return iVar1;
}

