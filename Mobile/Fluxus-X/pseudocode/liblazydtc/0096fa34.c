/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0096fa34
 */

undefined8 FUN_0096fa34(long *param_1,long param_2,ulong param_3,char *param_4)

{
  long lVar1;
  bool bVar2;
  uint uVar3;
  int iVar4;
  int iVar5;
  SSL *ssl;
  undefined8 uVar6;
  undefined4 *puVar7;
  char *pcVar8;
  long lVar9;
  ulong uVar10;
  ulong len;
  long lVar11;
  long lVar12;
  long *plVar13;
  undefined1 auStack_474 [4];
  char local_470 [1040];
  
  lVar1 = tpidr_el0;
  lVar9 = *(long *)(lVar1 + 0x28);
  lVar12 = param_1[2];
  lVar11 = *(long *)(lVar12 + 0x30);
  ssl = *(SSL **)(lVar11 + 8);
  if ((ssl == (SSL *)0x0) || ((*(byte *)((long)param_1 + 0x24) >> 1 & 1) != 0)) {
    *param_4 = '\x01';
    goto LAB_0096fe24;
  }
  *(undefined4 *)(lVar12 + 0x58) = 0;
  *param_4 = '\0';
  uVar3 = SSL_get_shutdown(ssl);
  if ((uVar3 & 1) == 0) {
    ERR_clear_error();
    uVar10 = 1;
    plVar13 = (long *)(param_2 + 0x12a0);
    do {
      iVar4 = SSL_read(*(SSL **)(lVar11 + 8),local_470,0x400);
      if ((((param_2 != 0) && ((*(byte *)(param_2 + 0xa85) >> 4 & 1) != 0)) &&
          ((*plVar13 == 0 || (0 < *(int *)(*plVar13 + 8))))) && (0 < *(int *)(*param_1 + 0xc))) {
        FUN_00904ddc(param_2,param_1,"SSL shutdown not sent, read -> %d",iVar4);
      }
    } while ((0 < iVar4) && (bVar2 = uVar10 < 10, uVar10 = uVar10 + 1, bVar2));
    iVar5 = SSL_get_error(*(SSL **)(lVar11 + 8),iVar4);
    if ((iVar4 != 0) || (iVar5 != 6)) {
      if ((param_3 & 1) != 0) {
LAB_0096fce4:
        iVar4 = SSL_shutdown(*(SSL **)(lVar11 + 8));
        if (iVar4 == 1) {
          if ((((param_2 != 0) && ((*(byte *)(param_2 + 0xa85) >> 4 & 1) != 0)) &&
              ((*plVar13 == 0 || (0 < *(int *)(*plVar13 + 8))))) && (0 < *(int *)(*param_1 + 0xc)))
          {
            pcVar8 = "SSL shutdown finished";
            goto LAB_0096fe08;
          }
          goto LAB_0096fe14;
        }
      }
      goto LAB_0096fbc8;
    }
    if ((param_3 & 1) != 0) {
      uVar10 = (**(code **)(*(long *)param_1[1] + 0x60))((long *)param_1[1],param_2,auStack_474);
      if ((uVar10 & 1) != 0) goto LAB_0096fce4;
      *(byte *)(lVar12 + 0x5c) = *(byte *)(lVar12 + 0x5c) | 2;
      if ((((param_2 != 0) && ((*(byte *)(param_2 + 0xa85) >> 4 & 1) != 0)) &&
          ((*plVar13 == 0 || (0 < *(int *)(*plVar13 + 8))))) && (0 < *(int *)(*param_1 + 0xc))) {
        pcVar8 = "peer closed connection";
        goto LAB_0096fe08;
      }
      goto LAB_0096fe14;
    }
    if (((param_2 == 0) || ((*(byte *)(param_2 + 0xa85) >> 4 & 1) == 0)) ||
       (((*plVar13 != 0 && (*(int *)(*plVar13 + 8) < 1)) || (*(int *)(*param_1 + 0xc) < 1))))
    goto LAB_0096fe14;
    pcVar8 = "SSL shutdown received, not sending";
LAB_0096fe08:
    FUN_00904ddc(param_2,param_1,pcVar8);
  }
  else {
LAB_0096fbc8:
    plVar13 = (long *)(param_2 + 0x12a0);
    uVar10 = 1;
    do {
      ERR_clear_error();
      iVar4 = SSL_read(*(SSL **)(lVar11 + 8),local_470,0x400);
      if ((param_2 != 0) && ((*(byte *)(param_2 + 0xa85) >> 4 & 1) != 0)) {
        if (*plVar13 == 0) {
          if (param_1 != (long *)0x0) goto LAB_0096fc18;
        }
        else if ((param_1 != (long *)0x0) && (0 < *(int *)(*plVar13 + 8))) {
LAB_0096fc18:
          if (0 < *(int *)(*param_1 + 0xc)) {
            FUN_00904ddc(param_2,param_1,"SSL shutdown read -> %d",iVar4);
          }
        }
      }
    } while ((0 < iVar4) && (bVar2 = uVar10 < 10, uVar10 = uVar10 + 1, bVar2));
    uVar3 = SSL_get_shutdown(*(SSL **)(lVar11 + 8));
    if ((uVar3 >> 1 & 1) == 0) {
      uVar3 = SSL_get_error(*(SSL **)(lVar11 + 8),iVar4);
      switch(uVar3) {
      case 0:
      case 2:
        if ((param_2 != 0) && ((*(byte *)(param_2 + 0xa85) >> 4 & 1) != 0)) {
          if (*plVar13 == 0) {
            if (param_1 != (long *)0x0) goto LAB_0096fe70;
          }
          else if ((param_1 != (long *)0x0) && (0 < *(int *)(*plVar13 + 8))) {
LAB_0096fe70:
            if (0 < *(int *)(*param_1 + 0xc)) {
              FUN_00904ddc(param_2,param_1,"SSL shutdown sent, want receive");
            }
          }
        }
        *(undefined4 *)(lVar12 + 0x58) = 1;
        goto LAB_0096fe24;
      default:
        uVar10 = ERR_get_error();
        if ((param_2 != 0) && ((*(byte *)(param_2 + 0xa85) >> 4 & 1) != 0)) {
          if (*plVar13 == 0) {
            if (param_1 != (long *)0x0) goto LAB_0096fef8;
          }
          else if ((param_1 != (long *)0x0) && (0 < *(int *)(*plVar13 + 8))) {
LAB_0096fef8:
            if (0 < *(int *)(*param_1 + 0xc)) {
              if (uVar10 == 0) {
                if (uVar3 < 0xb) {
                  pcVar8 = (&PTR_s_SSL_ERROR_NONE_00c51700)[(int)uVar3];
                }
                else {
                  pcVar8 = "SSL_ERROR unknown";
                }
              }
              else {
                pcVar8 = local_470;
                local_470[0] = '\0';
                uVar6 = OpenSSL_version(6);
                len = 0x400;
                uVar3 = curl_msnprintf(local_470,0x400,"%s/%s","OpenSSL",uVar6);
                if (uVar3 < 0x3fe) {
                  lVar11 = (long)(int)uVar3;
                  (pcVar8 + lVar11)[0] = ':';
                  (pcVar8 + lVar11)[1] = ' ';
                  pcVar8 = local_470 + lVar11 + 2;
                  *pcVar8 = '\0';
                  len = 0x3fe - lVar11;
                }
                ERR_error_string_n(uVar10,pcVar8,len);
                if ((0xd < len) && (*pcVar8 == '\0')) {
                  builtin_strncpy(pcVar8,"Unknown error",0xe);
                }
              }
              puVar7 = (undefined4 *)__errno();
              FUN_00904ddc(param_2,param_1,"SSL shutdown, ignore recv error: \'%s\', errno %d",
                           pcVar8,*puVar7);
            }
          }
        }
        break;
      case 3:
        if ((param_2 != 0) && ((*(byte *)(param_2 + 0xa85) >> 4 & 1) != 0)) {
          if (*plVar13 == 0) {
            if (param_1 != (long *)0x0) goto LAB_0096fea4;
          }
          else if ((param_1 != (long *)0x0) && (0 < *(int *)(*plVar13 + 8))) {
LAB_0096fea4:
            if (0 < *(int *)(*param_1 + 0xc)) {
              FUN_00904ddc(param_2,param_1,"SSL shutdown send blocked");
            }
          }
        }
        *(undefined4 *)(lVar12 + 0x58) = 2;
        goto LAB_0096fe24;
      case 6:
        if ((param_2 != 0) && ((*(byte *)(param_2 + 0xa85) >> 4 & 1) != 0)) {
          if (*plVar13 == 0) {
            if (param_1 != (long *)0x0) goto LAB_0096fed8;
          }
          else if ((param_1 != (long *)0x0) && (0 < *(int *)(*plVar13 + 8))) {
LAB_0096fed8:
            if (0 < *(int *)(*param_1 + 0xc)) {
              pcVar8 = "SSL shutdown not received, but closed";
              goto LAB_0096fe08;
            }
          }
        }
      }
    }
    else if ((param_2 != 0) && ((*(byte *)(param_2 + 0xa85) >> 4 & 1) != 0)) {
      if (*plVar13 == 0) {
        if (param_1 != (long *)0x0) goto LAB_0096fdf0;
      }
      else if ((param_1 != (long *)0x0) && (0 < *(int *)(*plVar13 + 8))) {
LAB_0096fdf0:
        if (0 < *(int *)(*param_1 + 0xc)) {
          pcVar8 = "SSL shutdown received, finished";
          goto LAB_0096fe08;
        }
      }
    }
  }
LAB_0096fe14:
  *param_4 = '\x01';
LAB_0096fe24:
  *(byte *)((long)param_1 + 0x24) = *(byte *)((long)param_1 + 0x24) & 0xfd | *param_4 << 1;
  if (*(long *)(lVar1 + 0x28) != lVar9) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return 0;
}

