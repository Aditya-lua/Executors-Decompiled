/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ab5958
 */

int PEM_def_callback(char *buf,int num,int w,void *key)

{
  char *prompt;
  int iVar1;
  size_t sVar2;
  char *pcVar3;
  
  if (key == (void *)0x0) {
    pcVar3 = EVP_get_pw_prompt();
    prompt = "Enter PEM pass phrase:";
    if (pcVar3 != (char *)0x0) {
      prompt = pcVar3;
    }
    iVar1 = 0;
    if (w != 0) {
      iVar1 = 4;
    }
    iVar1 = EVP_read_pw_string_min(buf,iVar1,num,prompt,w);
    if (iVar1 == 0) {
      sVar2 = strlen(buf);
      num = (int)sVar2;
    }
    else {
      ERR_new();
      ERR_set_debug("crypto/pem/pem_lib.c",0x3e,"PEM_def_callback");
      ERR_set_error(9,0x6d,0);
      memset(buf,0,(ulong)(uint)num);
      num = -1;
    }
  }
  else {
    sVar2 = strlen(key);
    if ((int)sVar2 <= num) {
      num = (int)sVar2;
    }
    memcpy(buf,key,(long)num);
  }
  return num;
}

