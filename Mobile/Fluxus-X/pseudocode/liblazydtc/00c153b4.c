/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c153b4
 */

undefined8 * FUN_00c153b4(long *param_1)

{
  byte *pbVar1;
  byte *pbVar2;
  byte bVar3;
  undefined8 *puVar4;
  undefined8 *puVar5;
  byte *pbVar6;
  long lVar7;
  uint uVar8;
  long lVar9;
  undefined4 uVar10;
  void *pvVar11;
  size_t __n;
  long *__src;
  long *plVar12;
  
  pbVar1 = (byte *)*param_1;
  pbVar2 = (byte *)param_1[1];
  if ((pbVar1 != pbVar2) && (*pbVar1 == 0x53)) {
    pbVar6 = pbVar1 + 1;
    *param_1 = (long)pbVar6;
    if (pbVar2 != pbVar6) {
      bVar3 = *pbVar6;
      uVar8 = (uint)bVar3;
      if (bVar3 < 0x61) {
        if (bVar3 == 0x5f) {
          *param_1 = (long)(pbVar1 + 2);
          if ((undefined8 *)param_1[0x25] == (undefined8 *)param_1[0x26]) {
            return (undefined8 *)0x0;
          }
          return *(undefined8 **)param_1[0x25];
        }
        if (uVar8 < 0x30) {
          return (undefined8 *)0x0;
        }
      }
      else if (uVar8 < 0x7b) {
        if (bVar3 < 0x69) {
          if (bVar3 == 0x61) {
            uVar10 = 0;
          }
          else if (bVar3 == 0x62) {
            uVar10 = 1;
          }
          else {
            if (uVar8 != 100) {
              return (undefined8 *)0x0;
            }
            uVar10 = 5;
          }
        }
        else if (bVar3 == 0x69) {
          uVar10 = 3;
        }
        else if (bVar3 == 0x6f) {
          uVar10 = 4;
        }
        else {
          if (bVar3 != 0x73) {
            return (undefined8 *)0x0;
          }
          uVar10 = 2;
        }
        pvVar11 = (void *)param_1[0x266];
        *param_1 = (long)(pbVar1 + 2);
        lVar7 = *(long *)((long)pvVar11 + 8);
        puVar4 = pvVar11;
        if (lVar7 - 0xfe0U < 0xfffffffffffff00f || lVar7 == -0x11) {
          puVar4 = malloc(0x1000);
          if (puVar4 == (void *)0x0) {
                    /* WARNING: Subroutine does not return */
            std::terminate();
          }
          lVar7 = 0;
          *puVar4 = pvVar11;
          puVar4[1] = 0;
          param_1[0x266] = (long)puVar4;
        }
        *(long *)((long)puVar4 + 8) = lVar7 + 0x10;
        puVar4 = (undefined8 *)(lVar7 + 0x10 + (long)puVar4);
        *(undefined1 *)(puVar4 + 1) = 0x30;
        *(undefined4 *)((long)puVar4 + 0xc) = uVar10;
        *(ushort *)((long)puVar4 + 9) = *(ushort *)((long)puVar4 + 9) & 0xf000 | 0x540;
        *puVar4 = &PTR_LAB_00cb3098;
        puVar5 = (undefined8 *)FUN_00c228c4(param_1,puVar4);
        if (puVar5 == puVar4) {
          return puVar4;
        }
        plVar12 = (long *)param_1[0x26];
        if (plVar12 == (long *)param_1[0x27]) {
          __src = (long *)param_1[0x25];
          __n = (long)plVar12 - (long)__src;
          if (__src == param_1 + 0x28) {
            pvVar11 = malloc(__n * 2);
            if (pvVar11 == (void *)0x0) {
                    /* WARNING: Subroutine does not return */
              abort();
            }
            if (plVar12 != __src) {
              memmove(pvVar11,__src,__n);
            }
            param_1[0x25] = (long)pvVar11;
          }
          else {
            pvVar11 = realloc(__src,__n * 2);
            param_1[0x25] = (long)pvVar11;
            if (pvVar11 == (void *)0x0) {
                    /* WARNING: Subroutine does not return */
              abort();
            }
          }
          plVar12 = (long *)((long)pvVar11 + __n);
          param_1[0x27] = (long)((long)pvVar11 + ((long)__n >> 2) * 8);
        }
        *plVar12 = (long)puVar5;
        param_1[0x26] = (long)(plVar12 + 1);
        return puVar5;
      }
      if ((uVar8 < 0x3a) || (uVar8 - 0x41 < 0x1a)) {
        lVar7 = 0;
        do {
          bVar3 = *pbVar6;
          if (bVar3 < 0x30) break;
          if (bVar3 < 0x3a) {
            lVar9 = -0x30;
          }
          else {
            if (0x19 < bVar3 - 0x41) break;
            lVar9 = -0x37;
          }
          pbVar6 = pbVar6 + 1;
          *param_1 = (long)pbVar6;
          lVar7 = (ulong)bVar3 + lVar7 * 0x24 + lVar9;
        } while (pbVar6 != pbVar2);
        if ((pbVar6 != pbVar2) && (*pbVar6 == 0x5f)) {
          *param_1 = (long)(pbVar6 + 1);
          if (lVar7 + 1U < (ulong)(param_1[0x26] - param_1[0x25] >> 3)) {
            return *(undefined8 **)(param_1[0x25] + (lVar7 + 1U) * 8);
          }
        }
      }
    }
  }
  return (undefined8 *)0x0;
}

