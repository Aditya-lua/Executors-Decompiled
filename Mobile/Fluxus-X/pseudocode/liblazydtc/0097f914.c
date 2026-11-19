/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0097f914
 */

undefined8 * FUN_0097f914(long param_1)

{
  undefined8 *puVar1;
  void *__dest;
  ulong __n;
  void *__src;
  ulong uVar2;
  undefined8 uVar3;
  
  puVar1 = operator_new(0x28);
  *puVar1 = &PTR_LAB_00c51ad8;
  puVar1[1] = *(undefined8 *)(param_1 + 8);
  puVar1[2] = 0;
  puVar1[3] = 0;
  puVar1[4] = 0;
  if ((*(byte *)(param_1 + 0x10) & 1) == 0) {
    puVar1[4] = *(undefined8 *)(param_1 + 0x20);
    uVar3 = *(undefined8 *)(param_1 + 0x10);
    puVar1[3] = *(undefined8 *)(param_1 + 0x18);
    puVar1[2] = uVar3;
    return puVar1;
  }
  __n = *(ulong *)(param_1 + 0x18);
  if (0xffffffffffffffef < __n) {
                    /* WARNING: Subroutine does not return */
                    /* try { // try from 0097f9f0 to 0097f9f3 has its CatchHandler @ 0097f9f4 */
    std::__ndk1::__basic_string_common<true>::__throw_length_error();
  }
  __src = *(void **)(param_1 + 0x20);
  if (__n < 0x17) {
    __dest = (void *)((long)puVar1 + 0x11);
    *(char *)(puVar1 + 2) = (char)((int)__n << 1);
    if (__n == 0) goto LAB_0097f9d4;
  }
  else {
    uVar2 = __n + 0x10 & 0xfffffffffffffff0;
                    /* try { // try from 0097f9ac to 0097f9b3 has its CatchHandler @ 0097f9f4 */
    __dest = operator_new(uVar2);
    puVar1[3] = __n;
    puVar1[4] = __dest;
    puVar1[2] = uVar2 | 1;
  }
  memcpy(__dest,__src,__n);
LAB_0097f9d4:
  *(undefined1 *)((long)__dest + __n) = 0;
  return puVar1;
}

