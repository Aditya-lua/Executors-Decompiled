/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a84fec
 */

void OSSL_CMP_print_errors_cb(code *param_1)

{
  int iVar1;
  ulong e;
  char *pcVar2;
  char *pcVar3;
  BIO *param0;
  ulong param3;
  uint uVar4;
  char acStack_1188 [256];
  byte local_1088 [4];
  undefined4 local_1084;
  char *local_1080;
  char *local_1078;
  undefined8 local_1070;
  char acStack_1068 [4104];
  
  local_1078 = (char *)0x0;
  local_1070 = 0;
  local_1080 = (char *)0x0;
  e = ERR_get_error_all(&local_1070,&local_1084,&local_1078,&local_1080,local_1088);
  if (e != 0) {
    do {
      pcVar3 = local_1078;
      pcVar2 = ERR_lib_error_string(e);
      if (pcVar2 == (char *)0x0) {
        pcVar2 = "(unknown function)";
        if (pcVar3 != (char *)0x0) {
          pcVar2 = pcVar3;
        }
      }
      else if ((pcVar3 != (char *)0x0) && (*pcVar3 != '\0')) {
        iVar1 = strcmp(pcVar3,"(unknown function)");
        if (iVar1 != 0) {
          pcVar2 = pcVar3;
        }
      }
      uVar4 = (uint)e;
      param3 = (ulong)(((int)uVar4 >> 0x1f & 0x7f800000U | 0x7fffff) & uVar4);
      if ((int)uVar4 < 0) {
        pcVar3 = acStack_1188;
        iVar1 = openssl_strerror_r(param3,acStack_1188,0x100);
        if (iVar1 == 0) goto LAB_00a85148;
LAB_00a850d4:
        if (local_1080 == (char *)0x0) goto LAB_00a85168;
LAB_00a850dc:
        if ((local_1088[0] >> 1 & 1) == 0) goto LAB_00a85168;
        BIO_snprintf(acStack_1068,0x1000,"%s:%s",pcVar3,local_1080);
        if (param_1 != (code *)0x0) goto LAB_00a85180;
LAB_00a850fc:
        param0 = BIO_new_fp((FILE *)sched_yield,0);
        if (param0 != (BIO *)0x0) {
          BIO_printf(param0,"CMP %s: %s\n","error",acStack_1068);
          BIO_free(param0);
        }
      }
      else {
        pcVar3 = ERR_reason_error_string(e);
        if (pcVar3 != (char *)0x0) goto LAB_00a850d4;
LAB_00a85148:
        pcVar3 = acStack_1188;
        BIO_snprintf(acStack_1188,0x100,"reason(%lu)",param3);
        if (local_1080 != (char *)0x0) goto LAB_00a850dc;
LAB_00a85168:
        BIO_snprintf(acStack_1068,0x1000,"%s",pcVar3);
        if (param_1 == (code *)0x0) goto LAB_00a850fc;
LAB_00a85180:
        iVar1 = (*param_1)(pcVar2,local_1070,local_1084,3,acStack_1068);
        if (iVar1 < 1) {
          return;
        }
      }
      e = ERR_get_error_all(&local_1070,&local_1084,&local_1078,&local_1080,local_1088);
    } while (e != 0);
  }
  return;
}

