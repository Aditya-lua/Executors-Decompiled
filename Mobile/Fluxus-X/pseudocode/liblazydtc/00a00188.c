/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a00188
 */

BIO * BIO_new_file(char *filename,char *mode)

{
  long larg;
  FILE *__stream;
  char *pcVar1;
  BIO *b;
  uint *puVar2;
  undefined8 uVar3;
  
  __stream = openssl_fopen(filename,mode);
  pcVar1 = strchr(mode,0x62);
  larg = 0x11;
  if (pcVar1 != (char *)0x0) {
    larg = 1;
  }
  if (__stream == (FILE *)0x0) {
    ERR_new();
    ERR_set_debug("crypto/bio/bss_file.c",0x43,"BIO_new_file");
    puVar2 = (uint *)__errno();
    ERR_set_error(2,*puVar2,"calling fopen(%s, %s)",filename,mode);
    if ((*puVar2 | 4) == 6) {
      ERR_new();
      ERR_set_debug("crypto/bio/bss_file.c",0x4b,"BIO_new_file");
      uVar3 = 0x80;
    }
    else {
      ERR_new();
      ERR_set_debug("crypto/bio/bss_file.c",0x4d,"BIO_new_file");
      uVar3 = 0x80002;
    }
    ERR_set_error(0x20,uVar3,0);
    b = (BIO *)0x0;
  }
  else {
    b = BIO_new((BIO_METHOD *)&DAT_00c594e8);
    if (b == (BIO *)0x0) {
      fclose(__stream);
    }
    else {
      BIO_clear_flags(b,0);
      BIO_ctrl(b,0x6a,larg,__stream);
    }
  }
  return b;
}

