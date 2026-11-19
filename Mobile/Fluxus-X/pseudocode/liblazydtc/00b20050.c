/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b20050
 */

undefined8
ossl_prov_get_capabilities(undefined8 param_1,undefined8 param_2,code *param_3,undefined8 param_4)

{
  int iVar1;
  undefined8 uVar2;
  undefined **ppuVar3;
  ulong uVar4;
  
  iVar1 = OPENSSL_strcasecmp(param_2,"TLS-GROUP");
  uVar2 = 0;
  if (iVar1 == 0) {
    uVar4 = 0;
    ppuVar3 = &PTR_s_tls_group_name_00c87868;
    do {
      uVar2 = (*param_3)(ppuVar3,param_4);
      if ((int)uVar2 == 0) {
        return uVar2;
      }
      uVar4 = uVar4 + 1;
      ppuVar3 = ppuVar3 + 0x32;
    } while (uVar4 < 0x32);
    uVar2 = 1;
  }
  return uVar2;
}

