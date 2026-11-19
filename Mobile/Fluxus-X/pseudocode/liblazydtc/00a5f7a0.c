/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a5f7a0
 */

undefined8 * EVP_MD_meth_dup(undefined8 *param_1)

{
  undefined8 *__dest;
  undefined8 uVar1;
  undefined8 uVar2;
  
  __dest = (undefined8 *)0x0;
  if (param_1[0xe] == 0) {
    uVar1 = *param_1;
    __dest = (undefined8 *)evp_md_new();
    if (__dest != (undefined8 *)0x0) {
      uVar2 = __dest[0x10];
      *__dest = uVar1;
      *(undefined4 *)(__dest + 3) = 2;
      memcpy(__dest,param_1,0xf0);
      __dest[0x10] = uVar2;
      *(undefined4 *)(__dest + 3) = 2;
    }
  }
  return __dest;
}

