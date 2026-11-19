/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0087bdcc
 */

long FUN_0087bdcc(long *param_1,undefined8 *param_2)

{
  void *__s2;
  size_t __n;
  int iVar1;
  long lVar2;
  void *__s1;
  ulong uVar3;
  undefined8 *puVar4;
  ulong uVar5;
  ulong uVar6;
  ulong uVar7;
  long lVar8;
  long lVar9;
  long lVar10;
  undefined8 uVar11;
  
  lVar10 = param_1[4];
  lVar2 = FUN_008aa250(*param_2,param_2[1]);
  lVar9 = param_1[3];
  lVar8 = *param_1;
  uVar7 = (ulong)(lVar2 * -0x61c8864680b583eb) >> ((ulong)*(byte *)(param_1 + 6) & 0x3f);
  uVar3 = uVar7 >> 6;
  uVar6 = 1L << (uVar7 & 0x3f);
  uVar5 = *(ulong *)(lVar9 + uVar3 * 8);
  if ((uVar6 & uVar5) != 0) {
    __s2 = (void *)*param_2;
    __n = param_2[1];
    do {
      puVar4 = (undefined8 *)(lVar8 + uVar7 * 0x18);
      __s1 = (void *)*puVar4;
      if (__s1 == (void *)0x0 || __s2 == (void *)0x0) {
        if (__s1 == __s2) goto LAB_0087bed4;
      }
      else if ((puVar4[1] == __n) && (iVar1 = memcmp(__s1,__s2,__n), iVar1 == 0)) goto LAB_0087bed4;
      uVar7 = uVar7 + 1 & lVar10 - 1U;
      uVar3 = uVar7 >> 6;
      uVar6 = 1L << (uVar7 & 0x3f);
      uVar5 = *(ulong *)(lVar9 + uVar3 * 8);
    } while ((uVar5 & uVar6) != 0);
  }
  *(ulong *)(lVar9 + uVar3 * 8) = uVar5 | uVar6;
  puVar4 = (undefined8 *)(lVar8 + uVar7 * 0x18);
  uVar11 = *param_2;
  puVar4[1] = param_2[1];
  *puVar4 = uVar11;
  lVar2 = param_1[5];
  lVar8 = *param_1;
  *(undefined4 *)(puVar4 + 2) = 0;
  param_1[5] = lVar2 + 1;
LAB_0087bed4:
  return lVar8 + uVar7 * 0x18;
}

