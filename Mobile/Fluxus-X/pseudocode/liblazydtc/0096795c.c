/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0096795c
 */

ulong FUN_0096795c(long param_1)

{
  ulong uVar1;
  long lVar2;
  
  if (((*(byte *)(param_1 + 0x131c) >> 1 & 1) == 0) || (*(char *)(param_1 + 0xa84) < '\0')) {
    uVar1 = 1;
  }
  else {
    uVar1 = 0;
    if (*(long *)(param_1 + 0xc90) != 0) {
      lVar2 = *(long *)(param_1 + 0x20);
      uVar1 = curl_strequal(*(long *)(param_1 + 0xc90),*(undefined8 *)(lVar2 + 0x50));
      if (((int)uVar1 != 0) && (uVar1 = 0, *(int *)(param_1 + 0xc98) == *(int *)(lVar2 + 0x560))) {
        uVar1 = (ulong)(*(int *)(param_1 + 0xc9c) == *(int *)(*(long *)(lVar2 + 0x3a8) + 0x8c));
      }
    }
  }
  return uVar1;
}

