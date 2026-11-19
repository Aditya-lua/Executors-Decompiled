/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009e94e0
 */

undefined4 tls_process_end_of_early_data(long param_1,long param_2)

{
  int iVar1;
  undefined8 uVar2;
  undefined8 uVar3;
  undefined4 uVar4;
  
  if (*(long *)(param_2 + 8) == 0) {
    if ((*(uint *)(param_1 + 0x84) & 0xfffffffe) == 10) {
      iVar1 = RECORD_LAYER_processed_read_pending(param_1 + 0xc58);
      if (iVar1 == 0) {
        *(undefined4 *)(param_1 + 0x84) = 0xc;
        iVar1 = (**(code **)(*(long *)(*(long *)(param_1 + 8) + 0xc0) + 0x20))(param_1,0xa1);
        uVar4 = 0;
        if (iVar1 != 0) {
          uVar4 = 3;
        }
        return uVar4;
      }
      ERR_new();
      ERR_set_debug("ssl/statem/statem_srvr.c",0x101d,"tls_process_end_of_early_data");
      uVar2 = 10;
      uVar3 = 0xb6;
    }
    else {
      ERR_new();
      ERR_set_debug("ssl/statem/statem_srvr.c",0x1014,"tls_process_end_of_early_data");
      uVar2 = 0x50;
      uVar3 = 0xc0103;
    }
  }
  else {
    ERR_new();
    ERR_set_debug("ssl/statem/statem_srvr.c",0x100e,"tls_process_end_of_early_data");
    uVar2 = 0x32;
    uVar3 = 0x9f;
  }
  ossl_statem_fatal(param_1,uVar2,uVar3,0);
  return 0;
}

