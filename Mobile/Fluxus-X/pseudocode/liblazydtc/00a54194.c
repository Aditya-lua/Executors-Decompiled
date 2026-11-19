/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a54194
 */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

void ERR_clear_error(void)

{
  undefined4 *puVar1;
  long lVar2;
  undefined4 uVar3;
  long lVar4;
  undefined8 *puVar5;
  
  lVar2 = ossl_err_get_state_int();
  if (lVar2 != 0) {
    lVar4 = 0;
    puVar5 = (undefined8 *)(lVar2 + 0x180);
    do {
      if ((*(byte *)(lVar2 + lVar4 + 0x200) & 1) == 0) {
        uVar3 = 0;
        puVar5[-0x10] = 0;
        *puVar5 = 0;
LAB_00a541f4:
        *(undefined4 *)(lVar2 + lVar4 + 0x200) = uVar3;
      }
      else if ((undefined1 *)puVar5[-0x10] != (undefined1 *)0x0) {
        *(undefined1 *)puVar5[-0x10] = 0;
        uVar3 = 1;
        goto LAB_00a541f4;
      }
      puVar1 = (undefined4 *)(lVar2 + lVar4);
      puVar1[0x10] = 0;
      *puVar1 = 0;
      puVar5[-0x20] = 0;
      puVar1[0xb0] = 0xffffffff;
      CRYPTO_free((void *)puVar5[0x18]);
      puVar5[0x18] = 0;
      CRYPTO_free((void *)puVar5[0x30]);
      lVar4 = lVar4 + 4;
      puVar5[0x30] = 0;
      puVar5 = puVar5 + 1;
    } while (lVar4 != 0x40);
    *(undefined8 *)(lVar2 + 0x380) = 0;
  }
  return;
}

