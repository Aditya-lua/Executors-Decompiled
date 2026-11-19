/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a228d8
 */

int DSO_set_filename(DSO *dso,char *filename)

{
  char *pcVar1;
  undefined8 uVar2;
  
  if ((dso == (DSO *)0x0) || (filename == (char *)0x0)) {
    ERR_new();
    ERR_set_debug("crypto/dso/dso_lib.c",0xeb,"DSO_set_filename");
    uVar2 = 0xc0102;
  }
  else if (dso->loaded_filename == (char *)0x0) {
    pcVar1 = CRYPTO_strdup(filename,"crypto/dso/dso_lib.c",0xf3);
    if (pcVar1 != (char *)0x0) {
      CRYPTO_free(dso->filename);
      dso->filename = pcVar1;
      return 1;
    }
    ERR_new();
    ERR_set_debug("crypto/dso/dso_lib.c",0xf5,"DSO_set_filename");
    uVar2 = 0xc0100;
  }
  else {
    ERR_new();
    ERR_set_debug("crypto/dso/dso_lib.c",0xef,"DSO_set_filename");
    uVar2 = 0x6e;
  }
  ERR_set_error(0x25,uVar2,0);
  return 0;
}

