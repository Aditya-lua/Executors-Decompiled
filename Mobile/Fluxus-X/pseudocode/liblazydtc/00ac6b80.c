/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ac6b80
 */

long ossl_property_list_to_string(undefined8 param_1,int *param_2,char *param_3,ulong param_4)

{
  bool bVar1;
  char *pcVar2;
  long lVar3;
  ulong uVar4;
  char cVar5;
  ulong uVar6;
  ulong n;
  int iVar7;
  int *piVar8;
  long local_78;
  ulong local_70;
  char *local_68;
  
  local_78 = 0;
  if (param_2 == (int *)0x0) {
    if (param_4 == 0) {
      local_78 = 1;
    }
    else {
      *param_3 = '\0';
      local_78 = 1;
    }
  }
  else {
    local_68 = param_3;
    if (0 < *param_2) {
      iVar7 = 0;
      piVar8 = param_2 + (long)(*param_2 + -1) * 6 + 2;
      local_70 = param_4;
      do {
        if (*piVar8 != 0) {
          if (local_78 == 0) {
LAB_00ac6c0c:
            if ((*(byte *)(piVar8 + 3) & 1) != 0) goto LAB_00ac6c74;
LAB_00ac6c14:
            if (piVar8[2] == 2) {
              if (local_70 == 1) {
LAB_00ac6c90:
                *local_68 = '\0';
              }
              else {
                if (local_70 == 0) goto LAB_00ac6c84;
                cVar5 = '-';
LAB_00ac6ca4:
                *local_68 = cVar5;
              }
              local_68 = local_68 + 1;
              local_78 = local_78 + 1;
              local_70 = local_70 - 1;
            }
          }
          else {
            if (local_70 == 1) {
              *local_68 = '\0';
            }
            else {
              if (local_70 == 0) {
                local_78 = local_78 + 1;
                goto LAB_00ac6c0c;
              }
              *local_68 = ',';
            }
            local_68 = local_68 + 1;
            local_78 = local_78 + 1;
            local_70 = local_70 - 1;
            if ((*(byte *)(piVar8 + 3) & 1) == 0) goto LAB_00ac6c14;
LAB_00ac6c74:
            if (local_70 == 1) goto LAB_00ac6c90;
            if (local_70 != 0) {
              cVar5 = '?';
              goto LAB_00ac6ca4;
            }
LAB_00ac6c84:
            local_78 = local_78 + 1;
          }
          lVar3 = ossl_property_name_str(param_1,*piVar8);
          if (lVar3 == 0) {
            return 0;
          }
          FUN_00ac6ed4(lVar3,&local_68,&local_70,&local_78);
          if (piVar8[2] == 0) {
            if (local_70 == 1) goto LAB_00ac6d80;
LAB_00ac6d20:
            if (local_70 != 0) {
              *local_68 = '=';
              goto LAB_00ac6d88;
            }
LAB_00ac6d28:
            n = 0;
          }
          else {
            if (piVar8[2] != 1) goto LAB_00ac6e44;
            if (local_70 != 1) {
              if (local_70 != 0) {
                *local_68 = '!';
                goto LAB_00ac6d5c;
              }
              local_78 = local_78 + 1;
              goto LAB_00ac6d28;
            }
            *local_68 = '\0';
LAB_00ac6d5c:
            local_68 = local_68 + 1;
            local_78 = local_78 + 1;
            local_70 = local_70 - 1;
            if (local_70 != 1) goto LAB_00ac6d20;
LAB_00ac6d80:
            *local_68 = '\0';
LAB_00ac6d88:
            local_68 = local_68 + 1;
            n = local_70 - 1;
            local_70 = n;
          }
          pcVar2 = local_68;
          local_78 = local_78 + 1;
          if (piVar8[1] == 1) {
            uVar4 = *(ulong *)(piVar8 + 4);
            uVar6 = -uVar4;
            if (-1 < (long)uVar4) {
              uVar6 = uVar4;
            }
            uVar4 = 1 - ((long)uVar4 >> 0x3f);
            if (9 < (long)uVar6) {
              do {
                uVar4 = uVar4 + 1;
                bVar1 = 99 < uVar6;
                uVar6 = uVar6 / 10;
              } while (bVar1);
            }
            local_78 = local_78 + uVar4;
            if (n != 0) {
              BIO_snprintf(local_68,n,"%lld");
              local_70 = n - uVar4;
              if (n < uVar4) {
                local_70 = 0;
                uVar4 = n;
              }
              local_68 = pcVar2 + uVar4;
            }
          }
          else {
            if (piVar8[1] != 0) {
              return 0;
            }
            lVar3 = ossl_property_value_str(param_1,piVar8[4]);
            if (lVar3 == 0) {
              return 0;
            }
            FUN_00ac6ed4(lVar3,&local_68,&local_70,&local_78);
          }
        }
LAB_00ac6e44:
        iVar7 = iVar7 + 1;
        piVar8 = piVar8 + -6;
      } while (iVar7 < *param_2);
      param_4 = local_70;
    }
    if (param_4 == 0) {
      local_78 = local_78 + 1;
    }
    else {
      *local_68 = '\0';
      local_78 = local_78 + 1;
    }
  }
  return local_78;
}

