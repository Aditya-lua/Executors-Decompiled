/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00aa3c88
 */

int FUN_00aa3c88(byte *param_1,int param_2,int param_3)

{
  bool bVar1;
  int iVar2;
  int iVar3;
  long lVar4;
  long lVar5;
  byte bVar6;
  int iVar7;
  
  if (param_1 != (byte *)0x0) {
    lVar4 = ossl_lib_ctx_get_data(*(undefined8 *)(param_1 + 0x50),1,&DAT_00c6d4c8);
    if (lVar4 == 0) {
      ERR_new();
      ERR_set_debug("crypto/provider_core.c",0x156,"get_provider_store");
      ERR_set_error(0xf,0xc0103,0);
      bVar1 = false;
LAB_00aa3d1c:
      iVar2 = *(int *)(param_1 + 0x20);
      if (iVar2 < 2) {
        *(int *)(param_1 + 0x20) = iVar2 + -1;
        *param_1 = *param_1 & 0xfd;
        if ((param_3 != 0 && bVar1) &&
           (iVar3 = OPENSSL_sk_num(*(undefined8 *)(lVar4 + 0x10)), 0 < iVar3)) {
          iVar7 = 0;
          do {
            lVar5 = OPENSSL_sk_value(*(undefined8 *)(lVar4 + 0x10),iVar7);
            (**(code **)(lVar5 + 0x10))(param_1,*(undefined8 *)(lVar5 + 0x20));
            iVar7 = iVar7 + 1;
          } while (iVar3 != iVar7);
        }
        bVar6 = 0;
      }
      else {
        bVar6 = param_2 != 0 & param_1[200];
        *(int *)(param_1 + 0x20) = iVar2 + -1;
      }
      if (bVar1) {
        CRYPTO_THREAD_unlock(*(undefined8 *)(param_1 + 8));
        CRYPTO_THREAD_unlock(*(undefined8 *)(lVar4 + 0x20));
      }
      if (bVar6 == 0) {
        return iVar2 + -1;
      }
      ossl_provider_free_parent(param_1,1);
      return iVar2 + -1;
    }
    iVar2 = CRYPTO_THREAD_read_lock(*(undefined8 *)(lVar4 + 0x20));
    if (iVar2 != 0) {
      iVar2 = CRYPTO_THREAD_write_lock(*(undefined8 *)(param_1 + 8));
      if (iVar2 != 0) {
        bVar1 = true;
        goto LAB_00aa3d1c;
      }
      CRYPTO_THREAD_unlock(*(undefined8 *)(lVar4 + 0x20));
    }
  }
  return -1;
}

