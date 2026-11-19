/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00920274
 */

undefined8 FUN_00920274(long *param_1,char *param_2)

{
  undefined8 *__dest;
  long lVar1;
  char cVar2;
  ulong uVar3;
  undefined8 uVar4;
  char *__s;
  void *pvVar5;
  undefined8 *puVar6;
  size_t sVar7;
  long lVar8;
  ulong uVar9;
  undefined8 *puVar10;
  long lVar11;
  
  if (param_2 == (char *)0x0) {
    sVar7 = 0;
  }
  else {
    sVar7 = strlen(param_2);
  }
  uVar4 = 0;
  if ((param_2 != (char *)0x0) && (sVar7 != 0)) {
    cVar2 = *param_2;
    if ((cVar2 == ' ') || (cVar2 == '\t')) {
      if (param_1[1] != 0) {
        lVar11 = 0;
        while( true ) {
          if ((cVar2 != ' ') && (cVar2 != '\t')) {
            puVar10 = *(undefined8 **)(*param_1 + param_1[1] * 8 + -8);
            lVar1 = puVar10[3];
            puVar6 = (undefined8 *)
                     (*(code *)PTR_calloc_00cc4690)
                               (1,((lVar1 + puVar10[2] + sVar7) - lVar11) + 0x23);
            if (puVar6 == (undefined8 *)0x0) {
              return 0x1b;
            }
            __dest = puVar6 + 4;
            *puVar6 = __dest;
            memcpy(__dest,(void *)*puVar10,puVar10[2]);
            puVar6[2] = puVar10[2];
            pvVar5 = (void *)((long)__dest + puVar10[2] + 1);
            puVar6[1] = pvVar5;
            memcpy(pvVar5,(void *)puVar10[1],puVar10[3]);
            lVar8 = puVar10[3];
            *(undefined1 *)((long)pvVar5 + lVar8) = 0x20;
            memcpy((undefined1 *)((long)pvVar5 + lVar8) + 1,param_2 + lVar11,sVar7 - lVar11);
            puVar6[3] = ((lVar1 + sVar7) - lVar11) + 1;
            *(undefined8 **)(*param_1 + param_1[1] * 8 + -8) = puVar6;
            (*(code *)PTR_free_00cc4678)(puVar10);
            return 0;
          }
          if (sVar7 - 1 == lVar11) break;
          cVar2 = param_2[lVar11 + 1];
          lVar11 = lVar11 + 1;
        }
      }
    }
    else {
      __s = memchr(param_2,0x3a,sVar7);
      if (__s != (char *)0x0) {
        uVar9 = (long)__s - (long)param_2;
        uVar3 = uVar9;
        do {
          uVar3 = uVar3 + 1;
          __s = __s + 1;
          if (sVar7 <= uVar3) break;
        } while ((*__s == ' ') || (*__s == '\t'));
        sVar7 = sVar7 - uVar3;
        pvVar5 = memchr(__s,0xd,sVar7);
        if (pvVar5 == (void *)0x0) {
          pvVar5 = memchr(__s,10,sVar7);
        }
        if (pvVar5 != (void *)0x0) {
          sVar7 = (long)pvVar5 - (long)__s;
        }
        uVar4 = FUN_0091fe64(param_1,param_2,uVar9,__s,sVar7);
        return uVar4;
      }
    }
    uVar4 = 0x2b;
  }
  return uVar4;
}

