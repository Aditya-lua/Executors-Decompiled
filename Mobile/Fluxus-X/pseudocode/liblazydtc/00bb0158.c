/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bb0158
 */

size_t ZSTD_readSkippableFrame(void *param_1,ulong param_2,int *param_3,uint *param_4,ulong param_5)

{
  ulong uVar1;
  ulong uVar2;
  uint uVar3;
  size_t __n;
  
  __n = 0xffffffffffffffb8;
  if (7 < param_5) {
    uVar3 = *param_4;
    uVar1 = (ulong)param_4[1] + 8;
    uVar2 = 0xffffffffffffffb8;
    if (uVar1 <= param_5) {
      uVar2 = uVar1;
    }
    __n = 0xfffffffffffffff2;
    uVar1 = 0xfffffffffffffff2;
    if (param_4[1] < 0xfffffff8) {
      uVar1 = uVar2;
    }
    if (uVar3 >> 4 == 0x184d2a5) {
      if (param_5 < uVar1) {
        __n = 0xffffffffffffffb8;
      }
      else {
        __n = uVar1 - 8;
        if (param_2 < __n) {
          __n = 0xffffffffffffffba;
        }
        else {
          if ((param_1 != (void *)0x0) && (__n != 0)) {
            memcpy(param_1,param_4 + 2,__n);
          }
          if (param_3 != (int *)0x0) {
            *param_3 = uVar3 + 0xe7b2d5b0;
          }
        }
      }
    }
  }
  return __n;
}

