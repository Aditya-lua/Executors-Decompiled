/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009144b4
 */

long * FUN_009144b4(long param_1,long param_2,char *param_3,undefined8 param_4,uint param_5)

{
  long *plVar1;
  undefined4 uVar2;
  char cVar3;
  byte bVar4;
  int iVar5;
  long lVar6;
  time_t tVar7;
  char *__s;
  char *pcVar8;
  size_t sVar9;
  size_t sVar10;
  undefined8 *__base;
  long lVar11;
  undefined8 *puVar12;
  long *plVar13;
  long *plVar14;
  long lVar15;
  ulong __nmemb;
  char *pcVar16;
  long *plVar17;
  long *plVar18;
  
  lVar6 = FUN_009143c8(param_3);
  plVar13 = (long *)0x0;
  if (param_2 != 0) {
    if (*(long *)(param_2 + lVar6 * 8) == 0) {
      plVar13 = (long *)0x0;
    }
    else {
      tVar7 = time((time_t *)0x0);
      if ((*(long *)(param_2 + 0x1f8) <= tVar7) ||
         (*(long *)(param_2 + 0x1f8) == 0x7fffffffffffffff)) {
        *(undefined8 *)(param_2 + 0x1f8) = 0x7fffffffffffffff;
        lVar15 = 0;
        do {
          plVar13 = (long *)(param_2 + lVar15 * 8);
          plVar17 = (long *)*plVar13;
          if (plVar17 != (long *)0x0) {
            plVar14 = (long *)0x0;
            do {
              while( true ) {
                lVar11 = plVar17[6];
                plVar18 = (long *)*plVar17;
                if ((lVar11 == 0) || (tVar7 <= lVar11)) break;
                plVar1 = plVar13;
                if (plVar14 != (long *)0x0) {
                  plVar1 = plVar14;
                }
                *plVar1 = (long)plVar18;
                *(int *)(param_2 + 0x200) = *(int *)(param_2 + 0x200) + -1;
                (*(code *)PTR_free_00cc4678)(plVar17[5]);
                (*(code *)PTR_free_00cc4678)(plVar17[3]);
                (*(code *)PTR_free_00cc4678)(plVar17[4]);
                (*(code *)PTR_free_00cc4678)(plVar17[1]);
                (*(code *)PTR_free_00cc4678)(plVar17[2]);
                (*(code *)PTR_free_00cc4678)(plVar17);
                plVar17 = plVar18;
                if (plVar18 == (long *)0x0) goto LAB_009145e8;
              }
              if ((lVar11 != 0) && (lVar11 < *(long *)(param_2 + 0x1f8))) {
                *(long *)(param_2 + 0x1f8) = lVar11;
              }
              plVar14 = plVar17;
              plVar17 = plVar18;
            } while (plVar18 != (long *)0x0);
          }
LAB_009145e8:
          lVar15 = lVar15 + 1;
        } while (lVar15 != 0x3f);
      }
      bVar4 = FUN_009172dc(param_3);
      plVar17 = *(long **)(param_2 + lVar6 * 8);
      plVar13 = (long *)0x0;
      if (plVar17 != (long *)0x0) {
        __nmemb = 0;
        plVar14 = plVar13;
LAB_009146f4:
        do {
          if ((*(char *)((long)plVar17 + 0x39) == '\0') || ((param_5 & 1) != 0)) {
            pcVar16 = (char *)plVar17[5];
            if (pcVar16 == (char *)0x0) {
LAB_0091479c:
              pcVar16 = (char *)plVar17[4];
              if ((pcVar16 != (char *)0x0) && (sVar9 = strlen(pcVar16), sVar9 != 1)) {
                __s = (char *)(*(code *)PTR_strdup_00cc4688)(param_4);
                if (__s == (char *)0x0) goto LAB_009148bc;
                pcVar8 = strchr(__s,0x3f);
                if (pcVar8 != (char *)0x0) {
                  *pcVar8 = '\0';
                }
                if (*__s != '/') {
                  (*(code *)PTR_free_00cc4678)(__s);
                  __s = (char *)FUN_00941948(&DAT_002a91de,1);
                  if (__s == (char *)0x0) goto LAB_009148bc;
                }
                sVar10 = strlen(__s);
                if ((sVar10 < sVar9) || (iVar5 = strncmp(pcVar16,__s,sVar9), iVar5 != 0)) {
                  (*(code *)PTR_free_00cc4678)(__s);
                  plVar17 = (long *)*plVar17;
                  plVar13 = plVar14;
                  if (plVar17 == (long *)0x0) break;
                  goto LAB_009146f4;
                }
                if (sVar9 == sVar10) {
                  (*(code *)PTR_free_00cc4678)(__s);
                }
                else {
                  cVar3 = __s[sVar9];
                  (*(code *)PTR_free_00cc4678)(__s);
                  if (cVar3 != '/') goto LAB_009148bc;
                }
              }
              plVar13 = (long *)(*(code *)PTR_calloc_00cc4690)(1,0x48);
              if (plVar13 == (long *)0x0) goto joined_r0x009149e0;
              if (plVar17[5] != 0) {
                lVar6 = (*(code *)PTR_strdup_00cc4688)();
                plVar13[5] = lVar6;
                if (lVar6 != 0) goto LAB_009147f8;
LAB_009148d4:
                (*(code *)PTR_free_00cc4678)(plVar13[5]);
                (*(code *)PTR_free_00cc4678)(plVar13[3]);
                (*(code *)PTR_free_00cc4678)(plVar13[4]);
                (*(code *)PTR_free_00cc4678)(plVar13[1]);
                (*(code *)PTR_free_00cc4678)(plVar13[2]);
                (*(code *)PTR_free_00cc4678)(plVar13);
                goto joined_r0x009149e0;
              }
LAB_009147f8:
              if (plVar17[3] != 0) {
                lVar6 = (*(code *)PTR_strdup_00cc4688)();
                plVar13[3] = lVar6;
                if (lVar6 == 0) goto LAB_009148d4;
              }
              if (plVar17[4] != 0) {
                lVar6 = (*(code *)PTR_strdup_00cc4688)();
                plVar13[4] = lVar6;
                if (lVar6 == 0) goto LAB_009148d4;
              }
              if (plVar17[1] != 0) {
                lVar6 = (*(code *)PTR_strdup_00cc4688)();
                plVar13[1] = lVar6;
                if (lVar6 == 0) goto LAB_009148d4;
              }
              if (plVar17[2] != 0) {
                lVar6 = (*(code *)PTR_strdup_00cc4688)();
                plVar13[2] = lVar6;
                if (lVar6 == 0) goto LAB_009148d4;
              }
              __nmemb = __nmemb + 1;
              plVar13[6] = plVar17[6];
              *(char *)(plVar13 + 7) = (char)plVar17[7];
              *(undefined1 *)((long)plVar13 + 0x39) = *(undefined1 *)((long)plVar17 + 0x39);
              *(undefined1 *)((long)plVar13 + 0x3a) = *(undefined1 *)((long)plVar17 + 0x3a);
              *(undefined1 *)((long)plVar13 + 0x3b) = *(undefined1 *)((long)plVar17 + 0x3b);
              uVar2 = *(undefined4 *)((long)plVar17 + 0x3c);
              *plVar13 = (long)plVar14;
              *(undefined4 *)((long)plVar13 + 0x3c) = uVar2;
              if (0x95 < __nmemb) {
                if (((param_1 != 0) && ((*(byte *)(param_1 + 0xa85) >> 4 & 1) != 0)) &&
                   ((*(long *)(param_1 + 0x12a0) == 0 ||
                    (0 < *(int *)(*(long *)(param_1 + 0x12a0) + 8))))) {
                  FUN_00904c98(param_1,"Included max number of cookies (%zu) in request!",__nmemb);
                }
                goto LAB_00914958;
              }
              plVar14 = plVar13;
            }
            else {
              if ((bVar4 & 1) == 0 && (char)plVar17[7] != '\0') {
                sVar9 = strlen(pcVar16);
                sVar10 = strlen(param_3);
                if (sVar9 <= sVar10) {
                  iVar5 = curl_strnequal(pcVar16,param_3 + (sVar10 - sVar9),sVar9);
                  if ((iVar5 != 0) &&
                     ((sVar10 == sVar9 || ((param_3 + (sVar10 - sVar9))[-1] == '.'))))
                  goto LAB_0091479c;
                }
              }
              if (((char)plVar17[7] != '\0' & (bVar4 ^ 0xff)) == 0) {
                iVar5 = curl_strequal(param_3,plVar17[5]);
                if (iVar5 != 0) goto LAB_0091479c;
              }
            }
          }
LAB_009148bc:
          plVar17 = (long *)*plVar17;
          plVar13 = plVar14;
        } while (plVar17 != (long *)0x0);
        if (__nmemb != 0) {
LAB_00914958:
          __base = (undefined8 *)(*(code *)PTR_malloc_00cc4670)(__nmemb << 3);
          plVar14 = plVar13;
          if (__base == (undefined8 *)0x0) {
joined_r0x009149e0:
            while (plVar13 = (long *)0x0, plVar14 != (long *)0x0) {
              lVar6 = *plVar14;
              (*(code *)PTR_free_00cc4678)(plVar14[5]);
              (*(code *)PTR_free_00cc4678)(plVar14[3]);
              (*(code *)PTR_free_00cc4678)(plVar14[4]);
              (*(code *)PTR_free_00cc4678)(plVar14[1]);
              (*(code *)PTR_free_00cc4678)(plVar14[2]);
              (*(code *)PTR_free_00cc4678)(plVar14);
              plVar14 = (long *)lVar6;
            }
          }
          else {
            if (plVar13 != (long *)0x0) {
              puVar12 = __base;
              do {
                *puVar12 = plVar13;
                plVar13 = (long *)*plVar13;
                puVar12 = puVar12 + 1;
              } while (plVar13 != (long *)0x0);
            }
            qsort(__base,__nmemb,8,(__compar_fn_t)&LAB_00914a5c);
            plVar13 = (long *)*__base;
            lVar6 = __nmemb - 1;
            if (lVar6 != 0) {
              lVar15 = lVar6;
              puVar12 = __base;
              do {
                lVar15 = lVar15 + -1;
                *(undefined8 *)*puVar12 = puVar12[1];
                puVar12 = puVar12 + 1;
              } while (lVar15 != 0);
            }
            *(undefined8 *)__base[lVar6] = 0;
            (*(code *)PTR_free_00cc4678)(__base);
          }
        }
      }
    }
  }
  return plVar13;
}

