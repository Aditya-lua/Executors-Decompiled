/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009aba98
 */

undefined8 ssl3_send_alert(int *param_1,int param_2,undefined4 param_3)

{
  int iVar1;
  int iVar2;
  undefined8 uVar3;
  long lVar4;
  
  lVar4 = *(long *)(*(int **)(param_1 + 2) + 0x30);
  if (((((*(byte *)(lVar4 + 0x60) >> 3 & 1) == 0) &&
       (iVar2 = **(int **)(param_1 + 2), 0x303 < iVar2)) && (iVar2 != 0x10000)) ||
     ((param_1[0x21] - 1U < 4 || (param_1[0x23a] == 1)))) {
    iVar2 = tls13_alert_code(param_3);
  }
  else {
    iVar2 = (**(code **)(lVar4 + 0x50))(param_3);
  }
  iVar1 = 0x28;
  if (*param_1 != 0x300 || iVar2 != 0x46) {
    iVar1 = iVar2;
  }
  if ((-1 < iVar1) && ((iVar1 == 0 || ((param_1[0x11] & 1U) == 0)))) {
    if ((param_2 == 2) && (*(SSL_SESSION **)(param_1 + 0x246) != (SSL_SESSION *)0x0)) {
      SSL_CTX_remove_session(*(SSL_CTX **)(param_1 + 0x2e2),*(SSL_SESSION **)(param_1 + 0x246));
    }
    *(char *)(param_1 + 0x6a) = (char)param_2;
    *(char *)((long)param_1 + 0x1a9) = (char)iVar1;
    param_1[0x69] = 1;
    iVar2 = RECORD_LAYER_write_pending(param_1 + 0x316);
    if (iVar2 == 0) {
                    /* WARNING: Could not recover jumptable at 0x009abb90. Too many branches */
                    /* WARNING: Treating indirect jump as call */
      uVar3 = (**(code **)(*(long *)(param_1 + 2) + 0x78))(param_1);
      return uVar3;
    }
  }
  return 0xffffffff;
}

