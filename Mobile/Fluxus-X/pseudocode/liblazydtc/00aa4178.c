/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00aa4178
 */

undefined8 FUN_00aa4178(undefined8 *param_1)

{
  byte bVar1;
  int iVar2;
  int iVar3;
  char *pcVar4;
  long lVar5;
  undefined8 uVar6;
  byte *pbVar7;
  
  iVar2 = CRYPTO_THREAD_read_lock(param_1[4]);
  if (iVar2 != 0) {
    bVar1 = *(byte *)(param_1 + 9);
    CRYPTO_THREAD_unlock(param_1[4]);
    if ((bVar1 & 1) == 0) {
      return 1;
    }
    iVar2 = CRYPTO_THREAD_write_lock(param_1[4]);
    if (iVar2 != 0) {
      if ((*(byte *)(param_1 + 9) & 1) == 0) {
        CRYPTO_THREAD_unlock(param_1[4]);
        return 1;
      }
      pcVar4 = "default";
      iVar2 = 0;
      pbVar7 = &DAT_00c6d8a0;
      do {
        if ((*pbVar7 & 1) != 0) {
          lVar5 = FUN_00aa2f50(pcVar4,*(undefined8 *)(pbVar7 + -0x10),0);
          uVar6 = 0;
          if (lVar5 == 0) goto LAB_00aa4290;
          *(undefined8 *)(lVar5 + 0x50) = *param_1;
          iVar3 = ERR_get_next_error_library();
          *(int *)(lVar5 + 0x60) = iVar3;
          iVar3 = FUN_00aa3714(lVar5,0,0);
          if (-1 < iVar3) {
            *(undefined8 **)(lVar5 + 0x58) = param_1;
            iVar3 = OPENSSL_sk_push(param_1[1],lVar5);
            if (iVar3 != 0) {
              iVar2 = iVar2 + 1;
              goto LAB_00aa425c;
            }
          }
          ossl_provider_free(lVar5);
          goto LAB_00aa428c;
        }
LAB_00aa425c:
        pcVar4 = *(char **)(pbVar7 + 8);
        pbVar7 = pbVar7 + 0x28;
      } while (pcVar4 != (char *)0x0);
      if (iVar2 < 1) {
LAB_00aa428c:
        uVar6 = 0;
      }
      else {
        uVar6 = 1;
        *(byte *)(param_1 + 9) = *(byte *)(param_1 + 9) & 0xfe;
      }
LAB_00aa4290:
      CRYPTO_THREAD_unlock(param_1[4]);
      return uVar6;
    }
  }
  return 0;
}

