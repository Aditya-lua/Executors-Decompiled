/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a0cb88
 */

int CONF_parse_list(char *list,int sep,int nospc,list_cb *list_cb,void *arg)

{
  int iVar1;
  byte *pbVar2;
  size_t sVar3;
  uint uVar4;
  byte *pbVar5;
  
  if (list == (char *)0x0) {
    ERR_new();
    ERR_set_debug("crypto/conf/conf_mod.c",0x29d,"CONF_parse_list");
    ERR_set_error(0xe,0x73,0);
    iVar1 = 0;
  }
  else {
    do {
      if ((nospc != 0) && (uVar4 = (uint)(byte)*list, *list != 0)) {
        do {
          iVar1 = isspace(uVar4);
          if (iVar1 == 0) break;
          list = list + 1;
          uVar4 = (uint)(byte)*list;
        } while (uVar4 != 0);
      }
      pbVar2 = (byte *)strchr(list,sep);
      if ((pbVar2 == (byte *)list) || (*list == 0)) {
        list = (char *)0x0;
        iVar1 = 0;
      }
      else {
        if (pbVar2 == (byte *)0x0) {
          sVar3 = strlen(list);
          pbVar5 = (byte *)(list + (sVar3 - 1));
        }
        else {
          pbVar5 = pbVar2 + -1;
        }
        if (nospc != 0) {
          pbVar5 = pbVar5 + 1;
          do {
            pbVar5 = pbVar5 + -1;
            iVar1 = isspace((uint)*pbVar5);
          } while (iVar1 != 0);
        }
        iVar1 = ((int)pbVar5 - (int)list) + 1;
      }
      iVar1 = (*list_cb)(list,iVar1,arg);
      if (iVar1 < 1) {
        return iVar1;
      }
      list = (char *)(pbVar2 + 1);
    } while (pbVar2 != (byte *)0x0);
    iVar1 = 1;
  }
  return iVar1;
}

