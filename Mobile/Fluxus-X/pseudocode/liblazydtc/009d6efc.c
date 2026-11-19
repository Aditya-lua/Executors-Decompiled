/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009d6efc
 */

undefined8 tls_parse_ctos_sig_algs_cert(long param_1,long *param_2)

{
  ulong uVar1;
  int iVar2;
  undefined8 uVar3;
  undefined1 *puVar4;
  undefined1 *local_30;
  ulong uStack_28;
  
  if (1 < (ulong)param_2[1]) {
    puVar4 = (undefined1 *)*param_2;
    uVar1 = (ulong)CONCAT11(*puVar4,puVar4[1]);
    if (param_2[1] - 2U == uVar1) {
      local_30 = puVar4 + 2;
      *param_2 = (long)(local_30 + uVar1);
      param_2[1] = 0;
      uStack_28 = uVar1;
      if (uVar1 != 0) {
        if (*(int *)(param_1 + 0x4d0) != 0) {
          return 1;
        }
        iVar2 = tls1_save_sigalgs(param_1,&local_30,1);
        if (iVar2 != 0) {
          return 1;
        }
        ERR_new();
        uVar3 = 0x112;
        goto LAB_009d6f70;
      }
    }
  }
  ERR_new();
  uVar3 = 0x10d;
LAB_009d6f70:
  ERR_set_debug("ssl/statem/extensions_srvr.c",uVar3,"tls_parse_ctos_sig_algs_cert");
  ossl_statem_fatal(param_1,0x32,0x6e,0);
  return 0;
}

