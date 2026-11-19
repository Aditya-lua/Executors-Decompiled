/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009690dc
 */

int FUN_009690dc(ulong param_1,char *param_2,void *param_3,ulong param_4)

{
  char cVar1;
  long lVar2;
  int iVar3;
  uint uVar4;
  int iVar5;
  FILE *__stream;
  ulong uVar6;
  size_t sVar7;
  char *pcVar8;
  char *pcVar9;
  long lVar10;
  long lVar11;
  long lVar12;
  char *pcVar13;
  void *pvVar14;
  void *local_80;
  ulong local_78;
  char *local_70;
  long local_68;
  
  lVar2 = tpidr_el0;
  local_68 = *(long *)(lVar2 + 0x28);
  local_70 = (char *)0x0;
  uVar6 = param_1;
  if (param_2 == (char *)0x0) {
    iVar3 = 0;
    goto LAB_00969220;
  }
  iVar3 = 0x5a;
  if ((param_3 == (void *)0x0) || (param_4 == 0)) goto LAB_00969220;
  iVar3 = strncmp(param_2,"sha256//",8);
  if (iVar3 == 0) {
    local_80 = (void *)0x0;
    local_78 = 0;
    if (*(long *)(PTR_DAT_00cc4d08 + 0xb0) != 0) {
      lVar10 = (*(code *)PTR_malloc_00cc4670)(0x20);
      if (lVar10 == 0) {
        iVar3 = 0x1b;
        uVar6 = 0;
      }
      else {
        iVar3 = (**(code **)(PTR_DAT_00cc4d08 + 0xb0))(param_3,param_4,lVar10,0x20);
        if (iVar3 == 0) {
          iVar3 = FUN_0091e888(lVar10,0x20,&local_80,&local_78);
          uVar6 = (*(code *)PTR_free_00cc4678)(lVar10);
          if (iVar3 == 0) {
            if (((param_1 != 0) && ((*(byte *)(param_1 + 0xa85) >> 4 & 1) != 0)) &&
               ((*(long *)(param_1 + 0x12a0) == 0 || (0 < *(int *)(*(long *)(param_1 + 0x12a0) + 8))
                ))) {
              FUN_00904c98(param_1," public key hash: sha256//%s",local_80);
            }
            pcVar13 = (char *)(*(code *)PTR_strdup_00cc4688)(param_2);
            if (pcVar13 != (char *)0x0) {
              pcVar8 = pcVar13;
              do {
                pcVar9 = strstr(pcVar8,";sha256//");
                uVar6 = local_78;
                if (pcVar9 != (char *)0x0) {
                  *pcVar9 = '\0';
                }
                sVar7 = strlen(pcVar8 + 8);
                pvVar14 = local_80;
                if (uVar6 == sVar7) {
                  iVar5 = memcmp(local_80,pcVar8 + 8,uVar6);
                  if ((iVar5 == 0) || (pcVar9 == (char *)0x0)) {
                    iVar3 = 0;
                    if (iVar5 != 0) {
                      iVar3 = 0x5a;
                    }
                    goto LAB_0096953c;
                  }
                }
                else if (pcVar9 == (char *)0x0) goto LAB_00969408;
                *pcVar9 = ';';
                pcVar8 = strstr(pcVar9,"sha256//");
                if ((pcVar9 == (char *)0x0) || (pcVar8 == (char *)0x0)) goto LAB_00969408;
              } while( true );
            }
            uVar6 = (*(code *)PTR_free_00cc4678)(local_80);
            local_80 = (void *)0x0;
            iVar3 = 0x1b;
          }
        }
        else {
          uVar6 = (*(code *)PTR_free_00cc4678)(lVar10);
        }
      }
      goto LAB_00969220;
    }
  }
  else {
    __stream = fopen(param_2,"rb");
    if (__stream != (FILE *)0x0) {
      iVar3 = fseek(__stream,0,2);
      if (iVar3 == 0) {
        uVar6 = ftell(__stream);
        iVar5 = fseek(__stream,0,0);
        iVar3 = 0x5a;
        pcVar13 = (char *)0x0;
        if ((uVar6 < 0x100001) && (iVar5 == 0)) {
          uVar6 = FUN_00963a7c(uVar6);
          if (uVar6 < param_4) goto LAB_00969170;
          pcVar13 = (char *)(*(code *)PTR_malloc_00cc4670)(uVar6 + 1);
          if ((pcVar13 != (char *)0x0) && (sVar7 = fread(pcVar13,uVar6,1,__stream), (int)sVar7 == 1)
             ) {
            if (uVar6 == param_4) {
              pcVar8 = pcVar13;
LAB_009692e0:
              iVar5 = memcmp(param_3,pcVar8,param_4);
              iVar3 = 0;
              if (iVar5 != 0) {
                iVar3 = 0x5a;
              }
              goto LAB_00969178;
            }
            pcVar13[uVar6] = '\0';
            pcVar8 = strstr(pcVar13,"-----BEGIN PUBLIC KEY-----");
            if ((pcVar8 != (char *)0x0) &&
               ((lVar10 = (long)pcVar8 - (long)pcVar13, lVar10 == 0 ||
                (pcVar13[lVar10 + -1] == '\n')))) {
              uVar6 = lVar10 + 0x1a;
              pcVar9 = strstr(pcVar13 + uVar6,"\n-----END PUBLIC KEY-----");
              if ((pcVar9 != (char *)0x0) &&
                 (lVar10 = (*(code *)PTR_malloc_00cc4670)
                                     (pcVar9 + (-0x19 - (long)(pcVar13 + lVar10))), lVar10 != 0)) {
                lVar11 = 0;
                if (uVar6 < (ulong)((long)pcVar9 - (long)pcVar13)) {
                  pcVar9 = pcVar9 + (-0x1a - (long)pcVar8);
                  pcVar8 = pcVar13 + uVar6;
                  lVar12 = 0;
                  do {
                    cVar1 = *pcVar8;
                    lVar11 = lVar12;
                    if ((cVar1 != '\n') && (cVar1 != '\r')) {
                      lVar11 = lVar12 + 1;
                      *(char *)(lVar10 + lVar12) = cVar1;
                    }
                    pcVar9 = pcVar9 + -1;
                    pcVar8 = pcVar8 + 1;
                    lVar12 = lVar11;
                  } while (pcVar9 != (char *)0x0);
                }
                *(undefined1 *)(lVar10 + lVar11) = 0;
                iVar5 = FUN_0091e5b8(lVar10,&local_70,&local_78);
                (*(code *)PTR_free_00cc4678)(lVar10);
                iVar3 = 0x5a;
                if ((iVar5 != 0) || (local_78 != param_4)) goto LAB_00969178;
                pcVar8 = local_70;
                goto LAB_009692e0;
              }
            }
          }
          goto LAB_00969174;
        }
      }
      else {
LAB_00969170:
        pcVar13 = (char *)0x0;
LAB_00969174:
        iVar3 = 0x5a;
      }
LAB_00969178:
      (*(code *)PTR_free_00cc4678)(pcVar13);
      (*(code *)PTR_free_00cc4678)(local_70);
      local_70 = (char *)0x0;
      uVar4 = fclose(__stream);
      uVar6 = (ulong)uVar4;
      goto LAB_00969220;
    }
  }
  iVar3 = 0x5a;
  uVar6 = 0;
LAB_00969220:
  if (*(long *)(lVar2 + 0x28) != local_68) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail(uVar6);
  }
  return iVar3;
LAB_00969408:
  iVar3 = 0x5a;
  pvVar14 = local_80;
LAB_0096953c:
  (*(code *)PTR_free_00cc4678)(pvVar14);
  local_80 = (void *)0x0;
  uVar6 = (*(code *)PTR_free_00cc4678)(pcVar13);
  goto LAB_00969220;
}

