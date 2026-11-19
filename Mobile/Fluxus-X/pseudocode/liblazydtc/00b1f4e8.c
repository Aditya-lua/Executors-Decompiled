/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b1f4e8
 */

undefined8
ossl_base_provider_init(undefined8 param_1,long param_2,undefined8 *param_3,long *param_4)

{
  undefined8 uVar1;
  long lVar2;
  long lVar3;
  undefined8 *puVar4;
  code *pcVar5;
  
  uVar1 = ossl_prov_bio_from_dispatch(param_2);
  if ((int)uVar1 == 0) {
    return uVar1;
  }
  pcVar5 = (code *)0x0;
  puVar4 = (undefined8 *)(param_2 + 8);
  do {
    switch(*(undefined4 *)(puVar4 + -1)) {
    case 0:
      if (pcVar5 == (code *)0x0) {
        return 0;
      }
      lVar2 = ossl_prov_ctx_new();
      *param_4 = lVar2;
      if (lVar2 == 0) {
        lVar2 = 0;
      }
      else {
        lVar3 = ossl_bio_prov_init_bio_method();
        lVar2 = *param_4;
        if (lVar3 != 0) {
          uVar1 = (*pcVar5)(param_1);
          ossl_prov_ctx_set0_libctx(lVar2,uVar1);
          ossl_prov_ctx_set0_handle(*param_4,param_1);
          ossl_prov_ctx_set0_core_bio_method(*param_4,lVar3);
          *param_3 = &DAT_00c82d60;
          return 1;
        }
      }
      ossl_prov_ctx_free(lVar2);
      *param_4 = 0;
      return 0;
    case 1:
      DAT_00d227f8 = *puVar4;
      puVar4 = puVar4 + 2;
      break;
    case 2:
      DAT_00d22800 = *puVar4;
      puVar4 = puVar4 + 2;
      break;
    case 4:
      pcVar5 = (code *)*puVar4;
    default:
      puVar4 = puVar4 + 2;
    }
  } while( true );
}

