/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0087c3cc
 */

undefined1  [16] FUN_0087c3cc(long *param_1,void *param_2)

{
  uint uVar1;
  char cVar2;
  char cVar3;
  int iVar4;
  undefined8 uVar5;
  ulong uVar6;
  long lVar7;
  uint *puVar8;
  uint uVar9;
  size_t __n;
  void *__s1;
  long lVar10;
  long lVar11;
  undefined1 auVar12 [16];
  
  uVar1 = *(uint *)((long)param_2 + 0x100);
  if (uVar1 == 0) {
    uVar6 = 0x8fc5e37bc9b65d29;
  }
  else {
    puVar8 = (uint *)((long)param_2 + 0x80);
    uVar9 = 0x811c9dc5;
    uVar6 = (ulong)uVar1;
    do {
      uVar9 = (puVar8[-0x20] ^ uVar9) * 0x1000193;
      if (*(char *)((long)param_2 + 0x104) != '\0') {
        uVar9 = (*puVar8 ^ uVar9) * 0x1000193;
      }
      uVar6 = uVar6 - 1;
      puVar8 = puVar8 + 1;
    } while (uVar6 != 0);
    uVar6 = (ulong)uVar9 * -0x61c8864680b583eb;
  }
  lVar10 = param_1[3];
  uVar6 = uVar6 >> ((ulong)*(byte *)(param_1 + 6) & 0x3f);
  if ((*(ulong *)(lVar10 + (uVar6 >> 6) * 8) >> (uVar6 & 0x3f) & 1) != 0) {
    lVar7 = param_1[4];
    lVar11 = *param_1;
    __n = (ulong)uVar1 << 2;
    cVar2 = *(char *)((long)param_2 + 0x104);
    do {
      __s1 = (void *)(lVar11 + uVar6 * 0x10c);
      if ((*(uint *)((long)__s1 + 0x100) == uVar1) && (iVar4 = memcmp(__s1,param_2,__n), iVar4 == 0)
         ) {
        cVar3 = *(char *)((long)__s1 + 0x104);
        if (cVar3 == cVar2 && cVar3 != '\0') {
          iVar4 = memcmp((void *)((long)__s1 + 0x80),(void *)((long)param_2 + 0x80),__n);
          if (iVar4 == 0) goto LAB_0087c510;
        }
        else if ((cVar3 == cVar2) && (cVar3 == '\0')) {
LAB_0087c510:
          uVar5 = 1;
          goto LAB_0087c51c;
        }
      }
      uVar6 = uVar6 + 1 & lVar7 - 1U;
    } while ((*(ulong *)(lVar10 + (uVar6 >> 6) * 8) >> (uVar6 & 0x3f) & 1) != 0);
  }
  uVar5 = 0;
LAB_0087c51c:
  auVar12._8_8_ = uVar5;
  auVar12._0_8_ = uVar6;
  return auVar12;
}

