/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0097053c
 */

long FUN_0097053c(long param_1,undefined8 param_2,void *param_3,ulong param_4,int *param_5)

{
  long lVar1;
  int iVar2;
  uint uVar3;
  ulong e;
  int *piVar4;
  undefined8 uVar5;
  char *pcVar6;
  int iVar7;
  long lVar8;
  ulong len;
  long lVar9;
  char local_168 [256];
  long local_68;
  
  lVar1 = tpidr_el0;
  local_68 = *(long *)(lVar1 + 0x28);
  uVar5 = *(undefined8 *)(param_1 + 0x18);
  lVar9 = *(long *)(*(long *)(param_1 + 0x10) + 0x30);
  ERR_clear_error();
  iVar2 = (int)param_4;
  if (0x7ffffffe < param_4) {
    iVar2 = 0x7fffffff;
  }
  iVar2 = SSL_read(*(SSL **)(lVar9 + 8),param_3,iVar2);
  lVar8 = (long)iVar2;
  if (0 < iVar2) goto LAB_009705f8;
  uVar3 = SSL_get_error(*(SSL **)(lVar9 + 8),iVar2);
  if (uVar3 - 2 < 2) {
    iVar7 = 0x51;
  }
  else {
    if (uVar3 == 0) goto LAB_009705f8;
    if (uVar3 == 6) {
      if (*(int *)(param_1 + 0x20) == 0) {
        FUN_00908c4c(uVar5,1);
      }
      goto LAB_009705f8;
    }
    iVar7 = *(int *)(lVar9 + 0x20);
    if (iVar7 != 0x51) {
      e = ERR_get_error();
      if ((-1 < iVar2) && (e == 0)) goto LAB_009705f8;
      piVar4 = (int *)__errno();
      iVar2 = *piVar4;
      if (e == 0) {
        if ((uVar3 == 5) && (iVar2 != 0)) {
          FUN_00941a94(iVar2,local_168,0x100);
        }
        else {
          if (uVar3 < 0xb) {
            pcVar6 = (&PTR_s_SSL_ERROR_NONE_00c51700)[(int)uVar3];
          }
          else {
            pcVar6 = "SSL_ERROR unknown";
          }
          curl_msnprintf(local_168,0x100,&DAT_002b6c62,pcVar6);
        }
      }
      else {
        pcVar6 = local_168;
        local_168[0] = '\0';
        uVar5 = OpenSSL_version(6);
        len = 0x100;
        uVar3 = curl_msnprintf(local_168,0x100,"%s/%s","OpenSSL",uVar5);
        if (uVar3 < 0xfe) {
          lVar9 = (long)(int)uVar3;
          (pcVar6 + lVar9)[0] = ':';
          (pcVar6 + lVar9)[1] = ' ';
          pcVar6 = local_168 + lVar9 + 2;
          *pcVar6 = '\0';
          len = 0xfe - lVar9;
        }
        ERR_error_string_n(e,pcVar6,len);
        if ((0xd < len) && (*pcVar6 == '\0')) {
          builtin_strncpy(pcVar6,"Unknown error",0xe);
        }
      }
      FUN_00904b80(param_2,"OpenSSL SSL_read: %s, errno %d",local_168,iVar2);
      iVar7 = 0x38;
    }
  }
  lVar8 = -1;
  *param_5 = iVar7;
LAB_009705f8:
  if (*(long *)(lVar1 + 0x28) != local_68) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return lVar8;
}

