/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a692dc
 */

int EVP_add_digest(EVP_MD *digest)

{
  int iVar1;
  int iVar2;
  char *name;
  char *pcVar3;
  
  name = OBJ_nid2sn(digest->type);
  iVar1 = OBJ_NAME_add(name,1,(char *)digest);
  iVar2 = 0;
  if (iVar1 != 0) {
    pcVar3 = OBJ_nid2ln(digest->type);
    iVar2 = OBJ_NAME_add(pcVar3,1,(char *)digest);
    if (((iVar2 != 0) && (iVar1 = digest->pkey_type, iVar1 != 0)) && (digest->type != iVar1)) {
      pcVar3 = OBJ_nid2sn(iVar1);
      iVar1 = OBJ_NAME_add(pcVar3,0x8001,name);
      iVar2 = 0;
      if (iVar1 != 0) {
        pcVar3 = OBJ_nid2ln(digest->pkey_type);
        iVar2 = OBJ_NAME_add(pcVar3,0x8001,name);
        return iVar2;
      }
    }
  }
  return iVar2;
}

