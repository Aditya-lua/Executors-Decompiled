/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009afe44
 */

undefined8 FUN_009afe44(long *param_1,long *param_2)

{
  bool bVar1;
  int iVar2;
  void *ptr;
  undefined8 uVar3;
  long *plVar4;
  ulong uVar5;
  long lVar6;
  long *plVar7;
  long *plVar8;
  long *plVar9;
  long *plVar10;
  long *plVar11;
  int iVar12;
  
  iVar2 = 0;
  for (plVar4 = (long *)*param_1; plVar4 != (long *)0x0; plVar4 = (long *)plVar4[2]) {
    iVar12 = iVar2;
    if (((int)plVar4[1] != 0) &&
       (iVar12 = *(int *)(*plVar4 + 0x44), *(int *)(*plVar4 + 0x44) <= iVar2)) {
      iVar12 = iVar2;
    }
    iVar2 = iVar12;
  }
  ptr = (void *)CRYPTO_zalloc(-(ulong)(iVar2 + 1U >> 0x1f) & 0xfffffffc00000000 |
                              (ulong)(iVar2 + 1U) << 2,"ssl/ssl_ciph.c",0x3c7);
  if (ptr == (void *)0x0) {
    ERR_new();
    ERR_set_debug("ssl/ssl_ciph.c",0x3c9,"ssl_cipher_strength_sort");
    ERR_set_error(0x14,0xc0100,0);
    uVar3 = 0;
  }
  else {
    for (plVar4 = (long *)*param_1; plVar4 != (long *)0x0; plVar4 = (long *)plVar4[2]) {
      if ((int)plVar4[1] != 0) {
        lVar6 = (long)*(int *)(*plVar4 + 0x44) * 4;
        *(int *)((long)ptr + lVar6) = *(int *)((long)ptr + lVar6) + 1;
      }
    }
    if (-1 < iVar2) {
      uVar5 = (long)iVar2;
      do {
        if (0 < *(int *)((long)ptr + uVar5 * 4)) {
          plVar4 = (long *)*param_1;
          plVar7 = (long *)*param_2;
          plVar8 = plVar7;
          if ((plVar4 != (long *)0x0) && (plVar7 != (long *)0x0)) {
            plVar11 = plVar4;
            plVar9 = plVar4;
            do {
              plVar10 = (long *)plVar9[2];
              plVar4 = plVar11;
              if (((uVar5 == *(uint *)(*plVar9 + 0x44)) && ((int)plVar9[1] != 0)) &&
                 (plVar9 != plVar8)) {
                lVar6 = plVar9[3];
                plVar4 = plVar10;
                if (plVar9 != plVar11) {
                  plVar4 = plVar11;
                }
                plVar11 = plVar10;
                if (lVar6 != 0) {
                  *(long **)(lVar6 + 0x10) = plVar10;
                  plVar11 = (long *)plVar9[2];
                }
                if (plVar11 != (long *)0x0) {
                  plVar11[3] = lVar6;
                }
                plVar8[2] = (long)plVar9;
                plVar9[2] = 0;
                plVar9[3] = (long)plVar8;
                plVar8 = plVar9;
              }
              if (plVar9 == plVar7) break;
              plVar11 = plVar4;
              plVar9 = plVar10;
            } while (plVar10 != (long *)0x0);
          }
          *param_1 = (long)plVar4;
          *param_2 = (long)plVar8;
        }
        bVar1 = 0 < (long)uVar5;
        uVar5 = uVar5 - 1;
      } while (bVar1);
    }
    CRYPTO_free(ptr);
    uVar3 = 1;
  }
  return uVar3;
}

