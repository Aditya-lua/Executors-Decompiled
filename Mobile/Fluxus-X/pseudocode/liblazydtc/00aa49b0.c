/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00aa49b0
 */

undefined8 FUN_00aa49b0(long param_1,undefined8 param_2)

{
  int iVar1;
  int iVar2;
  long lVar3;
  char *pcVar4;
  undefined8 *puVar5;
  
  lVar3 = OSSL_PARAM_locate(param_2,"openssl-version");
  if (lVar3 != 0) {
    OSSL_PARAM_set_utf8_ptr(lVar3,"3.0.14");
  }
  lVar3 = OSSL_PARAM_locate(param_2,"provider-name");
  if (lVar3 != 0) {
    OSSL_PARAM_set_utf8_ptr(lVar3,*(undefined8 *)(param_1 + 0x28));
  }
  lVar3 = OSSL_PARAM_locate(param_2,"module-filename");
  if (lVar3 != 0) {
    pcVar4 = DSO_get_filename(*(DSO **)(param_1 + 0x38));
    OSSL_PARAM_set_utf8_ptr(lVar3,pcVar4);
  }
  if ((*(long *)(param_1 + 0x48) != 0) && (iVar1 = OPENSSL_sk_num(), 0 < iVar1)) {
    iVar1 = 0;
    do {
      puVar5 = (undefined8 *)OPENSSL_sk_value(*(undefined8 *)(param_1 + 0x48),iVar1);
      lVar3 = OSSL_PARAM_locate(param_2,*puVar5);
      if (lVar3 != 0) {
        OSSL_PARAM_set_utf8_ptr(lVar3,puVar5[1]);
      }
      iVar1 = iVar1 + 1;
      iVar2 = OPENSSL_sk_num(*(undefined8 *)(param_1 + 0x48));
    } while (iVar1 < iVar2);
  }
  return 1;
}

