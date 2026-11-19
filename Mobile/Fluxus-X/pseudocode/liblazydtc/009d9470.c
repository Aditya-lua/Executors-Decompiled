/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009d9470
 */

undefined8 tls_construct_stoc_etm(long param_1,undefined8 param_2)

{
  int iVar1;
  
  if (*(int *)(param_1 + 0xb2c) != 0) {
    if (*(int *)(*(long *)(param_1 + 0x2e0) + 0x28) != 0x40) {
      iVar1 = *(int *)(*(long *)(param_1 + 0x2e0) + 0x24);
      if (iVar1 < 0x40000) {
        if ((iVar1 != 4) && (iVar1 != 0x400)) goto LAB_009d94e4;
      }
      else if ((iVar1 != 0x40000) && ((iVar1 != 0x800000 && (iVar1 != 0x400000)))) {
LAB_009d94e4:
        iVar1 = WPACKET_put_bytes__(param_2,0x16,2);
        if ((iVar1 == 0) || (iVar1 = WPACKET_put_bytes__(param_2,0,2), iVar1 == 0)) {
          ERR_new();
          ERR_set_debug("ssl/statem/extensions_srvr.c",0x609,"tls_construct_stoc_etm");
          ossl_statem_fatal(param_1,0x50,0xc0103,0);
          return 0;
        }
        return 1;
      }
    }
    *(undefined4 *)(param_1 + 0xb2c) = 0;
  }
  return 2;
}

