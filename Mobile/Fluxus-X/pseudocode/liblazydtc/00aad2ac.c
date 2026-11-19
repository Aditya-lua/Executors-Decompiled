/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00aad2ac
 */

int OBJ_NAME_new_index(hash_func *hash_func,cmp_func *cmp_func,free_func *free_func)

{
  int iVar1;
  int iVar2;
  undefined8 *puVar3;
  int iVar4;
  
  iVar1 = CRYPTO_THREAD_run_once(&DAT_00d22160,FUN_00aad21c);
  if (iVar1 == 0) {
    return 0;
  }
  if (DAT_00d22164 == 0) {
    return 0;
  }
  iVar1 = CRYPTO_THREAD_write_lock(DAT_00d22168);
  if (iVar1 == 0) {
    return 0;
  }
  if ((DAT_00d22170 == 0) && (DAT_00d22170 = OPENSSL_sk_new_null(), DAT_00d22170 == 0)) {
    iVar4 = 0;
  }
  else {
    iVar4 = DAT_00cc9158;
    DAT_00cc9158 = DAT_00cc9158 + 1;
    iVar1 = OPENSSL_sk_num();
    if (iVar1 < DAT_00cc9158) {
      do {
        puVar3 = (undefined8 *)CRYPTO_zalloc(0x18,"crypto/objects/o_names.c",0x5a);
        if (puVar3 == (undefined8 *)0x0) {
          ERR_new();
          ERR_set_debug("crypto/objects/o_names.c",0x5c,"OBJ_NAME_new_index");
          ERR_set_error(8,0xc0100,0);
LAB_00aad45c:
          iVar4 = 0;
          goto LAB_00aad464;
        }
        *puVar3 = ossl_lh_strcasehash;
        puVar3[1] = OPENSSL_strcasecmp;
        iVar2 = OPENSSL_sk_push(DAT_00d22170,puVar3);
        if (iVar2 == 0) {
          ERR_new();
          ERR_set_debug("crypto/objects/o_names.c",0x65,"OBJ_NAME_new_index");
          ERR_set_error(8,0xc0100,0);
          CRYPTO_free(puVar3);
          goto LAB_00aad45c;
        }
        iVar1 = iVar1 + 1;
      } while (iVar1 < DAT_00cc9158);
    }
    puVar3 = (undefined8 *)OPENSSL_sk_value(DAT_00d22170,iVar4);
    if (hash_func != (hash_func *)0x0) {
      *puVar3 = hash_func;
    }
    if (cmp_func != (cmp_func *)0x0) {
      puVar3[1] = cmp_func;
    }
    if (free_func != (free_func *)0x0) {
      puVar3[2] = free_func;
    }
  }
LAB_00aad464:
  CRYPTO_THREAD_unlock(DAT_00d22168);
  return iVar4;
}

