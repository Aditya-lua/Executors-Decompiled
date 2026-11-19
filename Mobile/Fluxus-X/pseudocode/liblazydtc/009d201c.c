/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009d201c
 */

undefined8 FUN_009d201c(undefined8 param_1,long param_2)

{
  undefined8 uVar1;
  
  uVar1 = parse_ca_names();
  if ((int)uVar1 != 0) {
    if (*(long *)(param_2 + 8) == 0) {
      uVar1 = 1;
    }
    else {
      ERR_new();
      ERR_set_debug("ssl/statem/extensions.c",0x4f1,"tls_parse_certificate_authorities");
      ossl_statem_fatal(param_1,0x32,0x6e,0);
      uVar1 = 0;
    }
  }
  return uVar1;
}

