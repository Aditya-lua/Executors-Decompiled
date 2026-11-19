/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00aa2c44
 */

void ossl_provider_free(byte *param_1)

{
  byte *pbVar1;
  int iVar2;
  char cVar3;
  bool bVar4;
  
  if (param_1 != (byte *)0x0) {
    pbVar1 = param_1 + 0x10;
    do {
      iVar2 = *(int *)pbVar1;
      cVar3 = '\x01';
      bVar4 = (bool)ExclusiveMonitorPass(pbVar1,0x10);
      if (bVar4) {
        *(int *)pbVar1 = iVar2 + -1;
        cVar3 = ExclusiveMonitorsStatus();
      }
    } while (cVar3 != '\0');
    if (iVar2 + -1 == 0) {
      DataMemoryBarrier(2,1);
      if ((*param_1 & 1) != 0) {
        if ((*(code **)(param_1 + 0x70) != (code *)0x0) && ((param_1[200] & 1) == 0)) {
          (**(code **)(param_1 + 0x70))(*(undefined8 *)(param_1 + 0xd0));
        }
        if (*(ERR_STRING_DATA **)(param_1 + 0x68) != (ERR_STRING_DATA *)0x0) {
          ERR_unload_strings(*(int *)(param_1 + 0x60),*(ERR_STRING_DATA **)(param_1 + 0x68));
          CRYPTO_free(*(void **)(param_1 + 0x68));
          param_1[0x68] = 0;
          param_1[0x69] = 0;
          param_1[0x6a] = 0;
          param_1[0x6b] = 0;
          param_1[0x6c] = 0;
          param_1[0x6d] = 0;
          param_1[0x6e] = 0;
          param_1[0x6f] = 0;
        }
        CRYPTO_free(*(void **)(param_1 + 0xa8));
        param_1[0xa8] = 0;
        param_1[0xa9] = 0;
        param_1[0xaa] = 0;
        param_1[0xab] = 0;
        param_1[0xac] = 0;
        param_1[0xad] = 0;
        param_1[0xae] = 0;
        param_1[0xaf] = 0;
        param_1[0xb0] = 0;
        param_1[0xb1] = 0;
        param_1[0xb2] = 0;
        param_1[0xb3] = 0;
        param_1[0xb4] = 0;
        param_1[0xb5] = 0;
        param_1[0xb6] = 0;
        param_1[0xb7] = 0;
        *param_1 = *param_1 & 0xfe;
      }
      ossl_init_thread_deregister(param_1);
      DSO_free(*(DSO **)(param_1 + 0x38));
      CRYPTO_free(*(void **)(param_1 + 0x28));
      CRYPTO_free(*(void **)(param_1 + 0x30));
      OPENSSL_sk_pop_free(*(undefined8 *)(param_1 + 0x48),FUN_00aa27d0);
      CRYPTO_THREAD_lock_free(*(undefined8 *)(param_1 + 0xb8));
      CRYPTO_THREAD_lock_free(*(undefined8 *)(param_1 + 8));
      CRYPTO_free(param_1);
      return;
    }
    if ((param_1[200] & 1) != 0) {
      ossl_provider_free_parent(param_1,0);
      return;
    }
  }
  return;
}

