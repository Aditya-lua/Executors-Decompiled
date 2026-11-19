/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009c1c14
 */

undefined8 ssl_setup_sig_algs(undefined8 *param_1)

{
  undefined8 *puVar1;
  int iVar2;
  void *ptr;
  EVP_PKEY *pkey;
  EVP_PKEY_CTX *ctx;
  undefined8 uVar3;
  long lVar4;
  undefined8 uVar5;
  undefined8 uVar6;
  undefined8 uVar7;
  
  ptr = CRYPTO_malloc(0x460,"ssl/t1_lib.c",0x495);
  pkey = EVP_PKEY_new();
  if ((ptr == (void *)0x0) || (pkey == (EVP_PKEY *)0x0)) {
    uVar3 = 0;
  }
  else {
    ERR_set_mark();
    lVar4 = 0;
    do {
      uVar7 = *(undefined8 *)((long)&DAT_00c57d28 + lVar4);
      uVar6 = *(undefined8 *)((long)&PTR_s_ecdsa_secp256r1_sha256_00c57d20 + lVar4);
      uVar5 = *(undefined8 *)(&UNK_00c57d38 + lVar4);
      uVar3 = *(undefined8 *)((long)&DAT_00c57d30 + lVar4);
      iVar2 = *(int *)((long)&DAT_00c57d2c + lVar4);
      puVar1 = (undefined8 *)((long)ptr + lVar4);
      puVar1[4] = *(undefined8 *)((long)&DAT_00c57d40 + lVar4);
      puVar1[1] = uVar7;
      *puVar1 = uVar6;
      puVar1[3] = uVar5;
      puVar1[2] = uVar3;
      if (((iVar2 == 0) || (param_1[(long)*(int *)((long)&DAT_00c57d30 + lVar4) + 0xa8] != 0)) &&
         (iVar2 = EVP_PKEY_set_type(pkey,*(int *)((long)&DAT_00c57d34 + lVar4)), iVar2 != 0)) {
        ctx = (EVP_PKEY_CTX *)EVP_PKEY_CTX_new_from_pkey(*param_1,pkey,param_1[0x88]);
        if (ctx == (EVP_PKEY_CTX *)0x0) {
          *(undefined4 *)((long)ptr + lVar4 + 0x24) = 0;
        }
        EVP_PKEY_CTX_free(ctx);
      }
      else {
        *(undefined4 *)((long)ptr + lVar4 + 0x24) = 0;
      }
      lVar4 = lVar4 + 0x28;
    } while (lVar4 != 0x460);
    ERR_pop_to_mark();
    param_1[0xc4] = ptr;
    uVar3 = 1;
    ptr = (void *)0x0;
  }
  CRYPTO_free(ptr);
  EVP_PKEY_free(pkey);
  return uVar3;
}

