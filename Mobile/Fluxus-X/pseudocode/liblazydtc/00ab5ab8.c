/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ab5ab8
 */

void PEM_dek_info(char *buf,char *type,int len,char *str)

{
  int iVar1;
  size_t sVar2;
  char *buf_00;
  int iVar3;
  long lVar4;
  
  sVar2 = strlen(buf);
  iVar3 = 0x400 - (int)sVar2;
  iVar1 = BIO_snprintf(buf + sVar2,(long)iVar3,"DEK-Info: %s,",type);
  if (0 < iVar1) {
    iVar3 = iVar3 - iVar1;
    buf_00 = buf + sVar2 + iVar1;
    if (0 < len) {
      lVar4 = 0;
      do {
        iVar1 = BIO_snprintf(buf_00,(long)iVar3,"%02X",(ulong)(byte)str[lVar4]);
        if (iVar1 < 1) {
          return;
        }
        lVar4 = lVar4 + 1;
        iVar3 = iVar3 - iVar1;
        buf_00 = buf_00 + iVar1;
      } while (lVar4 < len);
    }
    if (1 < iVar3) {
      buf_00[0] = '\n';
      buf_00[1] = '\0';
    }
  }
  return;
}

