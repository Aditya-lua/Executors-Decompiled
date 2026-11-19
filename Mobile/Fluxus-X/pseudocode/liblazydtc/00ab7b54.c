/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ab7b54
 */

int EVP_read_pw_string_min(char *buf,int minlen,int maxlen,char *prompt,int verify)

{
  int iVar1;
  UI *ui;
  char acStack_450 [1024];
  
  if (DAT_00d221a0 != '\0' && prompt == (char *)0x0) {
    prompt = &DAT_00d221a0;
  }
  ui = UI_new();
  if (ui == (UI *)0x0) {
    iVar1 = -1;
  }
  else {
    if (0x3fe < maxlen) {
      maxlen = 0x3ff;
    }
    iVar1 = UI_add_input_string(ui,prompt,0,buf,minlen,maxlen);
    if ((iVar1 < 0) ||
       ((verify != 0 &&
        (iVar1 = UI_add_verify_string(ui,prompt,0,acStack_450,minlen,maxlen,buf), iVar1 < 0)))) {
      iVar1 = -1;
    }
    else {
      iVar1 = UI_process(ui);
      OPENSSL_cleanse(acStack_450,0x400);
    }
    UI_free(ui);
  }
  return iVar1;
}

