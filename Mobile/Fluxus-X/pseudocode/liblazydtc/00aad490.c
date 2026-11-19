/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00aad490
 */

char * OBJ_NAME_get(char *name,int type)

{
  int iVar1;
  long lVar2;
  uint uVar3;
  char *pcVar4;
  uint local_48 [2];
  char *local_40;
  
  if ((name != (char *)0x0) &&
     (iVar1 = CRYPTO_THREAD_run_once(&DAT_00d22160,FUN_00aad21c), iVar1 != 0)) {
    if (DAT_00d22164 == 0) {
      return (char *)0x0;
    }
    iVar1 = CRYPTO_THREAD_read_lock(DAT_00d22168);
    if (iVar1 != 0) {
      local_48[0] = type & 0xffff7fff;
      local_40 = name;
      lVar2 = OPENSSL_LH_retrieve(DAT_00d22178,local_48);
      if (lVar2 != 0) {
        uVar3 = 0xffffffff;
        do {
          if ((((uint)type >> 0xf & 1) != 0) || (*(int *)(lVar2 + 4) == 0)) {
            pcVar4 = *(char **)(lVar2 + 0x10);
            goto LAB_00aad550;
          }
          uVar3 = uVar3 + 1;
          if (9 < uVar3) break;
          local_40 = *(char **)(lVar2 + 0x10);
          lVar2 = OPENSSL_LH_retrieve(DAT_00d22178,local_48);
        } while (lVar2 != 0);
      }
      pcVar4 = (char *)0x0;
LAB_00aad550:
      CRYPTO_THREAD_unlock(DAT_00d22168);
      return pcVar4;
    }
  }
  return (char *)0x0;
}

