/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00aefe2c
 */

int UI_UTIL_read_pw(char *buf,char *buff,int size,char *prompt,int verify)

{
  int iVar1;
  UI *ui;
  
  if (size < 1) {
    iVar1 = -1;
  }
  else {
    ui = UI_new();
    if (ui == (UI *)0x0) {
      iVar1 = -2;
    }
    else {
      iVar1 = UI_add_input_string(ui,prompt,0,buf,0,size + -1);
      if ((verify != 0) && (-1 < iVar1)) {
        iVar1 = UI_add_verify_string(ui,prompt,0,buff,0,size + -1,buf);
      }
      if (-1 < iVar1) {
        iVar1 = UI_process(ui);
      }
      UI_free(ui);
    }
  }
  return iVar1;
}

