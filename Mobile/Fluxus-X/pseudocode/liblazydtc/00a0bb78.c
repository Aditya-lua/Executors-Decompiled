/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a0bb78
 */

int BUF_MEM_grow_clean(BUF_MEM *str,size_t len)

{
  char *pcVar1;
  undefined8 uVar2;
  size_t __n;
  size_t sVar3;
  ulong uVar4;
  
  sVar3 = str->length;
  __n = sVar3 - len;
  if (sVar3 < len) {
    if (str->max < len) {
      if (0x5ffffffc < len) {
        ERR_new();
        uVar2 = 0x80;
LAB_00a0bcc8:
        ERR_set_debug("crypto/buffer/buffer.c",uVar2,"BUF_MEM_grow_clean");
        ERR_set_error(7,0xc0100,0);
        len = 0;
        goto LAB_00a0bc9c;
      }
      uVar4 = (ulong)((int)len + 3) * 0xaaaaaaab >> 0x1f & 0x1fffffffc;
      if ((str[1].length & 1) == 0) {
        pcVar1 = (char *)CRYPTO_clear_realloc
                                   (str->data,str->max,uVar4,"crypto/buffer/buffer.c",0x87);
LAB_00a0bc7c:
        if (pcVar1 == (char *)0x0) {
          ERR_new();
          uVar2 = 0x89;
          goto LAB_00a0bcc8;
        }
      }
      else {
        pcVar1 = (char *)CRYPTO_secure_malloc(uVar4,"crypto/buffer/buffer.c",0x3e);
        if ((pcVar1 == (char *)0x0) || (str->data == (char *)0x0)) goto LAB_00a0bc7c;
        memcpy(pcVar1,str->data,str->length);
        CRYPTO_secure_clear_free(str->data,str->length,"crypto/buffer/buffer.c",0x42);
        str->data = (char *)0x0;
      }
      sVar3 = str->length;
      str->data = pcVar1;
      str->max = uVar4;
      pcVar1 = pcVar1 + sVar3;
    }
    else {
      pcVar1 = str->data + sVar3;
    }
    __n = len - sVar3;
LAB_00a0bc90:
    memset(pcVar1,0,__n);
  }
  else if (str->data != (char *)0x0) {
    pcVar1 = str->data + len;
    goto LAB_00a0bc90;
  }
  str->length = len;
LAB_00a0bc9c:
  return (int)len;
}

