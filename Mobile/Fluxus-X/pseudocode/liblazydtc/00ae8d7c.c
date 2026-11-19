/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ae8d7c
 */

ulong OPENSSL_sk_insert(uint *param_1,undefined8 param_2,uint param_3)

{
  void *__src;
  uint uVar1;
  ulong uVar2;
  undefined8 uVar3;
  uint uVar4;
  
  if (param_1 == (uint *)0x0) {
    ERR_new();
    ERR_set_debug("crypto/stack/stack.c",0x107,"OPENSSL_sk_insert");
    uVar3 = 0xc0102;
LAB_00ae8df8:
    ERR_set_error(0xf,uVar3,0);
    return 0;
  }
  if (*param_1 == 0x7fffffff) {
    ERR_new();
    ERR_set_debug("crypto/stack/stack.c",0x10b,"OPENSSL_sk_insert");
    uVar3 = 0x72;
    goto LAB_00ae8df8;
  }
  uVar2 = FUN_00ae8ba0(param_1,1,0);
  if ((int)uVar2 == 0) {
    return uVar2;
  }
  uVar4 = *param_1;
  if (-1 < (int)param_3) {
    uVar1 = uVar4 - param_3;
    if (uVar1 != 0 && (int)param_3 <= (int)uVar4) {
      uVar2 = -(ulong)(param_3 >> 0x1f) & 0xfffffff800000000 | (ulong)param_3 << 3;
      __src = (void *)(*(long *)(param_1 + 2) + uVar2);
      memmove((void *)((long)__src + 8),__src,
              -(ulong)(uVar1 >> 0x1f) & 0xfffffff800000000 | (ulong)uVar1 << 3);
      *(undefined8 *)(*(long *)(param_1 + 2) + uVar2) = param_2;
      uVar4 = *param_1;
      goto LAB_00ae8e60;
    }
  }
  *(undefined8 *)(*(long *)(param_1 + 2) + (long)(int)uVar4 * 8) = param_2;
LAB_00ae8e60:
  *param_1 = uVar4 + 1;
  param_1[4] = 0;
  return (ulong)(uVar4 + 1);
}

