/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00912ca4
 */

ulong FUN_00912ca4(ulong param_1,char *param_2,ulong param_3,byte param_4)

{
  long *plVar1;
  long *plVar2;
  long lVar3;
  int iVar4;
  uint uVar5;
  ulong uVar6;
  FILE *__stream;
  char *pcVar7;
  time_t tVar8;
  undefined8 uVar9;
  long lVar10;
  long *plVar11;
  FILE *pFVar12;
  long lVar13;
  long *plVar14;
  long *plVar15;
  undefined1 auStack_88 [32];
  long local_68;
  
  lVar3 = tpidr_el0;
  local_68 = *(long *)(lVar3 + 0x28);
  uVar6 = param_1;
  if (param_3 == 0) {
    uVar6 = (*(code *)PTR_calloc_00cc4690)(1,0x210);
    param_3 = uVar6;
    if (uVar6 == 0) goto LAB_00912f50;
    *(undefined8 *)(uVar6 + 0x1f8) = 0x7fffffffffffffff;
  }
  *(byte *)(param_3 + 0x209) = param_4 & 1;
  if (param_1 != 0) {
    if ((param_2 == (char *)0x0) || (*param_2 == '\0')) {
LAB_00912d80:
      *(undefined1 *)(param_3 + 0x208) = 0;
    }
    else {
      iVar4 = strcmp(param_2,"-");
      if (iVar4 == 0) {
        pFVar12 = (FILE *)&__sF;
        __stream = (FILE *)0x0;
      }
      else {
        __stream = fopen(param_2,"rb");
        pFVar12 = __stream;
        if (__stream == (FILE *)0x0) {
          uVar6 = 0;
          if (((*(byte *)(param_1 + 0xa85) >> 4 & 1) != 0) &&
             ((*(long *)(param_1 + 0x12a0) == 0 || (0 < *(int *)(*(long *)(param_1 + 0x12a0) + 8))))
             ) {
            uVar6 = FUN_00904c98(param_1,"WARNING: failed to open cookie file \"%s\"",param_2);
          }
          goto LAB_00912d80;
        }
      }
      *(undefined1 *)(param_3 + 0x208) = 0;
      FUN_00904528(auStack_88,5000);
      iVar4 = FUN_009049b8(auStack_88,pFVar12);
      while (iVar4 != 0) {
        pcVar7 = (char *)FUN_00904974(auStack_88);
        iVar4 = curl_strnequal(pcVar7,"Set-Cookie:",0xb);
        if (iVar4 == 0) {
          uVar9 = 0;
        }
        else {
          for (pcVar7 = pcVar7 + 0xb; (*pcVar7 == ' ' || (*pcVar7 == '\t')); pcVar7 = pcVar7 + 1) {
          }
          uVar9 = 1;
        }
        FUN_00912f88(param_1,param_3,uVar9,1,pcVar7,0,0,1);
        iVar4 = FUN_009049b8(auStack_88,pFVar12);
      }
      FUN_00904534(auStack_88);
      tVar8 = time((time_t *)0x0);
      if ((*(long *)(param_3 + 0x1f8) <= tVar8) ||
         (*(long *)(param_3 + 0x1f8) == 0x7fffffffffffffff)) {
        *(undefined8 *)(param_3 + 0x1f8) = 0x7fffffffffffffff;
        lVar13 = 0;
        do {
          plVar1 = (long *)(param_3 + lVar13 * 8);
          plVar14 = (long *)*plVar1;
          if (plVar14 != (long *)0x0) {
            plVar11 = (long *)0x0;
            do {
              while( true ) {
                lVar10 = plVar14[6];
                plVar15 = (long *)*plVar14;
                if ((lVar10 == 0) || (tVar8 <= lVar10)) break;
                plVar2 = plVar1;
                if (plVar11 != (long *)0x0) {
                  plVar2 = plVar11;
                }
                *plVar2 = (long)plVar15;
                *(int *)(param_3 + 0x200) = *(int *)(param_3 + 0x200) + -1;
                (*(code *)PTR_free_00cc4678)(plVar14[5]);
                (*(code *)PTR_free_00cc4678)(plVar14[3]);
                (*(code *)PTR_free_00cc4678)(plVar14[4]);
                (*(code *)PTR_free_00cc4678)(plVar14[1]);
                (*(code *)PTR_free_00cc4678)(plVar14[2]);
                (*(code *)PTR_free_00cc4678)(plVar14);
                plVar14 = plVar15;
                if (plVar15 == (long *)0x0) goto LAB_00912f24;
              }
              if ((lVar10 != 0) && (lVar10 < *(long *)(param_3 + 0x1f8))) {
                *(long *)(param_3 + 0x1f8) = lVar10;
              }
              plVar11 = plVar14;
              plVar14 = plVar15;
            } while (plVar15 != (long *)0x0);
          }
LAB_00912f24:
          lVar13 = lVar13 + 1;
        } while (lVar13 != 0x3f);
      }
      uVar6 = 0;
      if (__stream != (FILE *)0x0) {
        uVar5 = fclose(__stream);
        uVar6 = (ulong)uVar5;
      }
    }
    *(uint *)(param_1 + 0x131c) = *(uint *)(param_1 + 0x131c) | 0x800;
  }
  *(undefined1 *)(param_3 + 0x208) = 1;
LAB_00912f50:
  if (*(long *)(lVar3 + 0x28) != local_68) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail(uVar6);
  }
  return param_3;
}

