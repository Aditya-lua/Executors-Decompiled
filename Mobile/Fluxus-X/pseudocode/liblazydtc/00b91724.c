/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b91724
 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

undefined * mbedtls_ecp_grp_id_list(void)

{
  if ((DAT_00d25fc0 & 1) == 0) {
    DAT_00d26000 = 0xd;
    uRam0000000000d25fd8 = 0x700000004;
    _DAT_00d25fd0 = 0x800000005;
    uRam0000000000d25fe8 = 0x200000006;
    _DAT_00d25fe0 = 0xc00000003;
    uRam0000000000d25ff8 = 0x90000000a;
    _DAT_00d25ff0 = 0x10000000b;
    DAT_00d25fc0 = 1;
  }
  return &DAT_00d25fd0;
}

