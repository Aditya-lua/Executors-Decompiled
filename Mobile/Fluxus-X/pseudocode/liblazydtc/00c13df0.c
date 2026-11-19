/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c13df0
 */

undefined8 FUN_00c13df0(long *param_1,undefined8 *param_2)

{
  char *pcVar1;
  long lVar2;
  undefined8 *puVar3;
  char *pcVar4;
  long lVar5;
  undefined8 uVar6;
  char *pcVar7;
  size_t __n;
  undefined1 uVar8;
  long *plVar9;
  long *plVar10;
  void *pvVar11;
  undefined8 *puVar12;
  
  pcVar4 = (char *)*param_1;
  pcVar7 = (char *)param_1[1];
  if (pcVar4 != pcVar7) {
    do {
      if (*pcVar4 != 'W') {
        return 0;
      }
      pcVar1 = pcVar4 + 1;
      *param_1 = (long)pcVar1;
      if ((pcVar1 == pcVar7) || (*pcVar1 != 'P')) {
        uVar8 = 0;
      }
      else {
        uVar8 = 1;
        *param_1 = (long)(pcVar4 + 2);
      }
      lVar2 = FUN_00c14270(param_1);
      if (lVar2 == 0) {
        return 1;
      }
      pvVar11 = (void *)param_1[0x266];
      lVar5 = *(long *)((long)pvVar11 + 8);
      puVar3 = pvVar11;
      if (lVar5 - 0xfc0U < 0xfffffffffffff00f || lVar5 == -0x31) {
        puVar3 = malloc(0x1000);
        if (puVar3 == (void *)0x0) {
                    /* WARNING: Subroutine does not return */
          std::terminate();
        }
        lVar5 = 0;
        *puVar3 = pvVar11;
        puVar3[1] = 0;
        param_1[0x266] = (long)puVar3;
      }
      *(long *)((long)puVar3 + 8) = lVar5 + 0x30;
      uVar6 = *param_2;
      puVar12 = (undefined8 *)((long)puVar3 + lVar5 + 0x10);
      *puVar12 = &PTR_LAB_00cb1538;
      *(undefined1 *)((long)puVar3 + lVar5 + 0x18) = 0x1b;
      *(undefined8 *)((long)puVar3 + lVar5 + 0x20) = uVar6;
      *(long *)((long)puVar3 + lVar5 + 0x28) = lVar2;
      *(undefined1 *)((long)puVar3 + lVar5 + 0x30) = uVar8;
      *(ushort *)((long)puVar3 + lVar5 + 0x19) =
           *(ushort *)((long)puVar3 + lVar5 + 0x19) & 0xf000 | 0x540;
      plVar10 = (long *)param_1[0x26];
      plVar9 = (long *)param_1[0x27];
      *param_2 = puVar12;
      if (plVar10 == plVar9) {
        plVar9 = (long *)param_1[0x25];
        __n = (long)plVar10 - (long)plVar9;
        if (plVar9 == param_1 + 0x28) {
          pvVar11 = malloc(__n * 2);
          if (pvVar11 == (void *)0x0) {
                    /* WARNING: Subroutine does not return */
            abort();
          }
          if (plVar10 != param_1 + 0x28) {
            memmove(pvVar11,plVar9,__n);
          }
          param_1[0x25] = (long)pvVar11;
        }
        else {
          pvVar11 = realloc(plVar9,__n * 2);
          param_1[0x25] = (long)pvVar11;
          if (pvVar11 == (void *)0x0) {
                    /* WARNING: Subroutine does not return */
            abort();
          }
        }
        plVar10 = (long *)((long)pvVar11 + __n);
        param_1[0x27] = (long)((long)pvVar11 + ((long)__n >> 2) * 8);
      }
      pcVar4 = (char *)*param_1;
      pcVar7 = (char *)param_1[1];
      *plVar10 = (long)puVar12;
      param_1[0x26] = (long)(plVar10 + 1);
    } while (pcVar4 != pcVar7);
  }
  return 0;
}

