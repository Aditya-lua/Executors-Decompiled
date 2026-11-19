/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00aae568
 */

int OBJ_ln2nid(char *s)

{
  long lVar1;
  uint *puVar2;
  undefined **ppuVar3;
  undefined4 local_60 [2];
  undefined1 *local_58;
  undefined1 *local_50;
  undefined1 auStack_48 [8];
  char *local_40;
  
  local_50 = auStack_48;
  OPENSSL_init_crypto(0x40,0);
  local_40 = s;
  if (DAT_00d22188 != 0) {
    local_60[0] = 2;
    local_58 = auStack_48;
    lVar1 = OPENSSL_LH_retrieve(DAT_00d22188,local_60);
    if (lVar1 != 0) {
      ppuVar3 = *(undefined ***)(lVar1 + 8);
      goto LAB_00aae5fc;
    }
  }
  puVar2 = (uint *)ossl_bsearch(&local_50,&DAT_0076fb9c,0x4d7,4,&LAB_00aaf080,0);
  if (puVar2 == (uint *)0x0) {
    return 0;
  }
  ppuVar3 = &PTR_s_UNDEF_00c6da58 + (ulong)*puVar2 * 5;
LAB_00aae5fc:
  return *(int *)(ppuVar3 + 2);
}

