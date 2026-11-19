/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00970760
 */

void FUN_00970760(long param_1,undefined8 param_2,void *param_3,ulong param_4,int *param_5)

{
  ulong uVar1;
  char *__src;
  long lVar2;
  int iVar3;
  uint uVar4;
  ulong uVar5;
  undefined8 uVar6;
  int *piVar7;
  char *pcVar8;
  long lVar9;
  ulong uVar10;
  char local_158 [256];
  long local_58;
  
  lVar2 = tpidr_el0;
  local_58 = *(long *)(lVar2 + 0x28);
  lVar9 = *(long *)(*(long *)(param_1 + 0x10) + 0x30);
  ERR_clear_error();
  iVar3 = (int)param_4;
  if (0x7ffffffe < param_4) {
    iVar3 = 0x7fffffff;
  }
  iVar3 = SSL_write(*(SSL **)(lVar9 + 8),param_3,iVar3);
  if (0 < iVar3) {
    lVar9 = (long)iVar3;
    *param_5 = 0;
    goto LAB_00970a00;
  }
  iVar3 = SSL_get_error(*(SSL **)(lVar9 + 8),iVar3);
  pcVar8 = "SSL_ERROR_NONE";
  switch(iVar3) {
  case 0:
    break;
  case 1:
    pcVar8 = local_158;
    uVar5 = ERR_get_error();
    local_158[0] = '\0';
    uVar6 = OpenSSL_version(6);
    uVar10 = 0x100;
    uVar4 = curl_msnprintf(local_158,0x100,"%s/%s","OpenSSL",uVar6);
    if (uVar4 < 0xfe) {
      lVar9 = (long)(int)uVar4;
      (pcVar8 + lVar9)[0] = ':';
      (pcVar8 + lVar9)[1] = ' ';
      pcVar8 = local_158 + lVar9 + 2;
      *pcVar8 = '\0';
      uVar10 = 0xfe - lVar9;
    }
    ERR_error_string_n(uVar5,pcVar8,uVar10);
    if (*pcVar8 == '\0') {
      uVar1 = 8;
      if (uVar5 != 0) {
        uVar1 = 0xd;
      }
      if (uVar1 < uVar10) {
        __src = "No error";
        if (uVar5 != 0) {
          __src = "Unknown error";
        }
        strcpy(pcVar8,__src);
      }
    }
    FUN_00904b80(param_2,"SSL_write() error: %s",pcVar8);
    goto LAB_009709f4;
  case 2:
  case 3:
    iVar3 = 0x51;
    goto LAB_009709f8;
  case 4:
    pcVar8 = "SSL_ERROR_WANT_X509_LOOKUP";
    break;
  case 5:
    piVar7 = (int *)__errno();
    iVar3 = *(int *)(lVar9 + 0x20);
    if (iVar3 == 0x51) goto LAB_009709f8;
    iVar3 = *piVar7;
    uVar5 = ERR_get_error();
    if (uVar5 == 0) {
      if (iVar3 == 0) {
        curl_msnprintf(local_158,0x100,&DAT_002b6c62,"SSL_ERROR_SYSCALL");
      }
      else {
        FUN_00941a94(iVar3,local_158,0x100);
      }
    }
    else {
      pcVar8 = local_158;
      local_158[0] = '\0';
      uVar6 = OpenSSL_version(6);
      uVar10 = 0x100;
      uVar4 = curl_msnprintf(local_158,0x100,"%s/%s","OpenSSL",uVar6);
      if (uVar4 < 0xfe) {
        lVar9 = (long)(int)uVar4;
        (pcVar8 + lVar9)[0] = ':';
        (pcVar8 + lVar9)[1] = ' ';
        pcVar8 = local_158 + lVar9 + 2;
        *pcVar8 = '\0';
        uVar10 = 0xfe - lVar9;
      }
      ERR_error_string_n(uVar5,pcVar8,uVar10);
      if ((0xd < uVar10) && (*pcVar8 == '\0')) {
        builtin_strncpy(pcVar8,"Unknown error",0xe);
      }
    }
    pcVar8 = local_158;
    goto LAB_009709f0;
  case 6:
    pcVar8 = "SSL_ERROR_ZERO_RETURN";
    break;
  case 7:
    pcVar8 = "SSL_ERROR_WANT_CONNECT";
    break;
  case 8:
    pcVar8 = "SSL_ERROR_WANT_ACCEPT";
    break;
  case 9:
    pcVar8 = "SSL_ERROR_WANT_ASYNC";
    break;
  case 10:
    pcVar8 = "SSL_ERROR_WANT_ASYNC_JOB";
    break;
  default:
    pcVar8 = "SSL_ERROR unknown";
  }
  piVar7 = (int *)__errno();
  iVar3 = *piVar7;
LAB_009709f0:
  FUN_00904b80(param_2,"OpenSSL SSL_write: %s, errno %d",pcVar8,iVar3);
LAB_009709f4:
  iVar3 = 0x37;
LAB_009709f8:
  *param_5 = iVar3;
  lVar9 = -1;
LAB_00970a00:
  if (*(long *)(lVar2 + 0x28) != local_58) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail(lVar9);
  }
  return;
}

