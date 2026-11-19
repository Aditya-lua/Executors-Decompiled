/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008e6a28
 */

/* std::__ndk1::__murmur2_or_cityhash<unsigned long, 64ul>::__hash_len_0_to_16(char const*, unsigned
   long) */

ulong std::__ndk1::__murmur2_or_cityhash<unsigned_long,64ul>::__hash_len_0_to_16
                (char *param_1,ulong param_2)

{
  ulong uVar1;
  ulong uVar2;
  
  if (8 < param_2) {
    uVar1 = *(ulong *)(param_1 + (param_2 - 8)) + param_2;
    uVar2 = uVar1 << ((ulong)(0x40 - (int)param_2) & 0x3f) | uVar1 >> (param_2 & 0x3f);
    uVar1 = (uVar2 ^ *(ulong *)param_1) * -0x622015f714c7d297;
    uVar1 = (uVar1 ^ uVar2 ^ uVar1 >> 0x2f) * -0x622015f714c7d297;
    return (uVar1 ^ uVar1 >> 0x2f) * -0x622015f714c7d297 ^ *(ulong *)(param_1 + (param_2 - 8));
  }
  if (3 < param_2) {
    uVar1 = ((uint)(*(int *)param_1 << 3) + param_2 ^ (ulong)*(uint *)(param_1 + (param_2 - 4))) *
            -0x622015f714c7d297;
    uVar1 = (uVar1 ^ *(uint *)(param_1 + (param_2 - 4)) ^ uVar1 >> 0x2f) * -0x622015f714c7d297;
    return (uVar1 ^ uVar1 >> 0x2f) * -0x622015f714c7d297;
  }
  uVar1 = 0x9ae16a3b2f90404f;
  if (param_2 != 0) {
    uVar1 = (ulong)((int)param_2 + (uint)(byte)param_1[param_2 - 1] * 4) * -0x36b62838af619aa9 ^
            (ulong)CONCAT11(param_1[param_2 >> 1],*param_1) * -0x651e95c4d06fbfb1;
    uVar1 = (uVar1 ^ uVar1 >> 0x2f) * -0x651e95c4d06fbfb1;
  }
  return uVar1;
}

