/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009ccc84
 */

undefined8 ssl3_setup_write_buffer(long param_1,ulong param_2,long param_3)

{
  long lVar1;
  int iVar2;
  int iVar3;
  void *pvVar4;
  ulong uVar5;
  undefined8 *puVar6;
  
  *(ulong *)(param_1 + 0xc70) = param_2;
  if (param_3 == 0) {
    lVar1 = 5;
    if ((*(uint *)(*(long *)(*(long *)(param_1 + 8) + 0xc0) + 0x60) & 8) != 0) {
      lVar1 = 0xe;
    }
    iVar2 = ssl_get_max_send_fragment(param_1);
    iVar3 = ssl_allow_compression(param_1);
    param_3 = 0x17;
    if (iVar3 != 0) {
      param_3 = 0x417;
    }
    param_3 = lVar1 + (ulong)(iVar2 + 0x50) + param_3;
    if ((*(byte *)(param_1 + 0x9e9) >> 3 & 1) == 0) {
      param_3 = lVar1 + param_3 + 0x57;
    }
  }
  if (param_2 != 0) {
    uVar5 = 0;
    puVar6 = (undefined8 *)(param_1 + 0xca8);
    do {
      if (puVar6[2] == param_3) {
        if ((void *)*puVar6 == (void *)0x0) goto LAB_009ccd40;
      }
      else {
        CRYPTO_free((void *)*puVar6);
        *puVar6 = 0;
LAB_009ccd40:
        pvVar4 = CRYPTO_malloc((int)param_3,"ssl/record/ssl3_buffer.c",0x81);
        if (pvVar4 == (void *)0x0) {
          *(ulong *)(param_1 + 0xc70) = uVar5;
          ERR_new();
          ERR_set_debug("ssl/record/ssl3_buffer.c",0x89,"ssl3_setup_write_buffer");
          ossl_statem_fatal(param_1,0xffffffff,0xc0100,0);
          return 0;
        }
        puVar6[2] = param_3;
        puVar6[3] = 0;
        puVar6[4] = 0;
        puVar6[5] = 0;
        *puVar6 = pvVar4;
        puVar6[1] = 0;
      }
      uVar5 = uVar5 + 1;
      puVar6 = puVar6 + 6;
    } while (uVar5 < param_2);
  }
  return 1;
}

