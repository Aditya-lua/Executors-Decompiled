/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00aad808
 */

void OBJ_NAME_do_all_sorted(int type,fn *fn,void *arg)

{
  int iVar1;
  long lVar2;
  int local_58;
  int local_54;
  void *local_50;
  int local_48 [2];
  undefined1 *local_40;
  int *local_38;
  
  local_58 = type;
  iVar1 = OPENSSL_LH_num_items(DAT_00d22178);
  local_50 = CRYPTO_malloc(iVar1 << 3,"crypto/objects/o_names.c",0x151);
  if (local_50 != (void *)0x0) {
    local_40 = &LAB_00aad8f8;
    local_38 = &local_58;
    local_54 = 0;
    local_48[0] = type;
    OPENSSL_LH_doall_arg(DAT_00d22178,&LAB_00aad7ec,local_48);
    qsort(local_50,(long)local_54,8,(__compar_fn_t)&LAB_00aad920);
    if (0 < local_54) {
      lVar2 = 0;
      do {
        (*fn)(*(OBJ_NAME **)((long)local_50 + lVar2 * 8),arg);
        lVar2 = lVar2 + 1;
      } while (lVar2 < local_54);
    }
    CRYPTO_free(local_50);
  }
  return;
}

