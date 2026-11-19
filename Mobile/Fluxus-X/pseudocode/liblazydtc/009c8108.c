/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009c8108
 */

ulong ssl_set_tmp_ecdh_groups(undefined8 param_1,undefined8 param_2,EC_KEY *param_3)

{
  EC_GROUP *group;
  ulong uVar1;
  uint local_24;
  
  group = EC_KEY_get0_group(param_3);
  if (group == (EC_GROUP *)0x0) {
    ERR_new();
    ERR_set_debug("ssl/tls_depr.c",0xb0,"ssl_set_tmp_ecdh_groups");
    ERR_set_error(0x14,0x122,0);
    uVar1 = 0;
  }
  else {
    local_24 = EC_GROUP_get_curve_name(group);
    uVar1 = (ulong)local_24;
    if (local_24 != 0) {
      uVar1 = tls1_set_groups(param_1,param_2,&local_24,1);
    }
  }
  return uVar1;
}

