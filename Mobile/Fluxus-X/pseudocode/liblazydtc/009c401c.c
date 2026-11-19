/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009c401c
 */

undefined8 tls1_save_u16(undefined8 *param_1,undefined8 *param_2,ulong *param_3)

{
  ushort uVar1;
  bool bVar2;
  void *ptr;
  undefined8 uVar3;
  ulong uVar4;
  ulong uVar5;
  ulong uVar6;
  
  uVar6 = param_1[1];
  if (uVar6 == 0) {
    return 0;
  }
  if ((uVar6 & 1) != 0) {
    return 0;
  }
  ptr = CRYPTO_malloc((uint)uVar6 & 0xfffffffe,"ssl/t1_lib.c",0x8f5);
  if (ptr == (void *)0x0) {
    ERR_new();
    ERR_set_debug("ssl/t1_lib.c",0x8f6,"tls1_save_u16");
    ERR_set_error(0x14,0xc0100,0);
LAB_009c4124:
    uVar3 = 0;
  }
  else {
    uVar6 = uVar6 >> 1;
    if (uVar6 != 0) {
      uVar5 = param_1[1];
      uVar4 = 0;
      do {
        bVar2 = uVar5 < 2;
        uVar5 = uVar5 - 2;
        if (bVar2) break;
        uVar1 = *(ushort *)*param_1;
        *param_1 = (ushort *)*param_1 + 1;
        param_1[1] = uVar5;
        *(ushort *)((long)ptr + uVar4 * 2) = uVar1 >> 8 | uVar1 << 8;
        uVar4 = uVar4 + 1;
      } while (uVar4 < uVar6);
      if (uVar4 != uVar6) {
        CRYPTO_free(ptr);
        goto LAB_009c4124;
      }
    }
    CRYPTO_free((void *)*param_2);
    uVar3 = 1;
    *param_2 = ptr;
    *param_3 = uVar6;
  }
  return uVar3;
}

