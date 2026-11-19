/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a54388
 */

void FUN_00a54388(long param_1,long param_2,int param_3)

{
  long lVar1;
  long lVar2;
  undefined4 *puVar3;
  undefined1 *ptr;
  undefined4 uVar4;
  
  lVar1 = param_1 + param_2 * 4;
  if ((*(byte *)(lVar1 + 0x200) & 1) == 0) {
    uVar4 = 0;
    lVar2 = param_1 + param_2 * 8;
    *(undefined8 *)(lVar2 + 0x100) = 0;
    *(undefined8 *)(lVar2 + 0x180) = 0;
  }
  else {
    lVar2 = param_1 + param_2 * 8;
    ptr = *(undefined1 **)(lVar2 + 0x100);
    if (param_3 == 0) {
      if (ptr == (undefined1 *)0x0) goto LAB_00a54408;
      *ptr = 0;
      uVar4 = 1;
    }
    else {
      CRYPTO_free(ptr);
      uVar4 = 0;
      *(undefined8 *)(lVar2 + 0x100) = 0;
      *(undefined8 *)(lVar2 + 0x180) = 0;
    }
  }
  *(undefined4 *)(lVar1 + 0x200) = uVar4;
LAB_00a54408:
  puVar3 = (undefined4 *)(param_1 + param_2 * 4);
  param_1 = param_1 + param_2 * 8;
  puVar3[0x10] = 0;
  *puVar3 = 0;
  *(undefined8 *)(param_1 + 0x80) = 0;
  puVar3[0xb0] = 0xffffffff;
  CRYPTO_free(*(void **)(param_1 + 0x240));
  *(undefined8 *)(param_1 + 0x240) = 0;
  CRYPTO_free(*(void **)(param_1 + 0x300));
  *(undefined8 *)(param_1 + 0x300) = 0;
  return;
}

