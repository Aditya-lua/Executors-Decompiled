/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b86050
 */

int mbedtls_asn1_write_bitstring(ulong *param_1,ulong param_2,void *param_3,long param_4)

{
  ulong uVar1;
  void *__dest;
  byte bVar2;
  undefined1 uVar3;
  uint uVar4;
  ulong uVar5;
  ulong uVar6;
  ulong uVar7;
  
  uVar5 = *param_1;
  if (param_2 <= uVar5) {
    uVar7 = param_4 + 7;
    uVar6 = uVar7 >> 3;
    if (uVar6 < uVar5 - param_2) {
      param_4 = (uVar7 & 0xfffffffffffffff8) - param_4;
      uVar1 = uVar6 + 1;
      uVar3 = (undefined1)param_4;
      if (uVar6 == 0) {
        *param_1 = uVar5 - 1;
        *(undefined1 *)(uVar5 - 1) = uVar3;
        uVar4 = 1;
      }
      else {
        bVar2 = *(byte *)((long)param_3 + (uVar6 - 1));
        *param_1 = uVar5 - 1;
        *(byte *)(uVar5 - 1) = bVar2 & (byte)(-1 << (ulong)((uint)param_4 & 0x1f));
        __dest = (void *)(*param_1 + (1 - uVar6));
        *param_1 = (ulong)__dest;
        memcpy(__dest,param_3,uVar6 - 1);
        uVar5 = *param_1;
        *param_1 = uVar5 - 1;
        *(undefined1 *)(uVar5 - 1) = uVar3;
        if (0x7fffffff7 < uVar7) {
          return -100;
        }
        uVar4 = 1;
        if (0x3f7 < uVar7) {
          uVar5 = uVar1;
          do {
            uVar5 = uVar5 >> 8;
            uVar4 = uVar4 + 1;
          } while (uVar5 != 0);
        }
      }
      uVar5 = *param_1;
      if ((long)(ulong)uVar4 <= (long)(uVar5 - param_2)) {
        *param_1 = uVar5 - 1;
        *(char *)(uVar5 - 1) = (char)uVar1;
        uVar5 = uVar1;
        while (uVar5 >> 8 != 0) {
          uVar7 = *param_1;
          *param_1 = uVar7 - 1;
          *(char *)(uVar7 - 1) = (char)(uVar5 >> 8);
          uVar5 = uVar5 >> 8;
        }
        if (1 < uVar4) {
          uVar5 = *param_1;
          *param_1 = uVar5 - 1;
          *(char *)(uVar5 - 1) = (char)uVar4 + '\x7f';
        }
        uVar5 = *param_1;
        if (0 < (long)(uVar5 - param_2)) {
          *param_1 = uVar5 - 1;
          *(undefined1 *)(uVar5 - 1) = 3;
          return (int)uVar1 + uVar4 + 1;
        }
      }
    }
  }
  return -0x6c;
}

