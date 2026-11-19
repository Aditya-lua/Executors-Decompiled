/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0087bef8
 */

long FUN_0087bef8(long *param_1,undefined8 *param_2)

{
  void *__s2;
  size_t __n;
  int iVar1;
  long lVar2;
  void *__s1;
  undefined8 *puVar3;
  ulong uVar4;
  long lVar5;
  long lVar6;
  
  if (param_1[5] == 0) {
    return 0;
  }
  lVar6 = param_1[4];
  lVar2 = FUN_008aa250(*param_2,param_2[1]);
  lVar5 = param_1[3];
  uVar4 = (ulong)(lVar2 * -0x61c8864680b583eb) >> ((ulong)*(byte *)(param_1 + 6) & 0x3f);
  if ((*(ulong *)(lVar5 + (uVar4 >> 6) * 8) >> (uVar4 & 0x3f) & 1) != 0) {
    lVar2 = *param_1;
    __s2 = (void *)*param_2;
    __n = param_2[1];
    do {
      puVar3 = (undefined8 *)(lVar2 + uVar4 * 0x18);
      __s1 = (void *)*puVar3;
      if (__s1 == (void *)0x0 || __s2 == (void *)0x0) {
        if (__s1 == __s2) goto LAB_0087bfc0;
      }
      else if ((puVar3[1] == __n) && (iVar1 = memcmp(__s1,__s2,__n), iVar1 == 0)) {
LAB_0087bfc0:
        return lVar2 + uVar4 * 0x18;
      }
      uVar4 = uVar4 + 1 & lVar6 - 1U;
    } while ((*(ulong *)(lVar5 + (uVar4 >> 6) * 8) >> (uVar4 & 0x3f) & 1) != 0);
  }
  return 0;
}

