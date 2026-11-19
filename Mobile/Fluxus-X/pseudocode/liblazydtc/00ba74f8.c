/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ba74f8
 */

ulong mbedtls_rsa_rsaes_oaep_encrypt
                (long param_1,code *param_2,undefined8 param_3,undefined8 param_4,undefined8 param_5
                ,ulong param_6,void *param_7,undefined1 *param_8)

{
  undefined1 *puVar1;
  byte bVar2;
  int iVar3;
  long lVar4;
  ulong uVar5;
  ulong uVar6;
  undefined1 *puVar7;
  ulong __n;
  
  if (param_2 != (code *)0x0) {
    mbedtls_md_info_from_type(*(undefined4 *)(param_1 + 0xe4));
    bVar2 = mbedtls_md_get_size();
    if (bVar2 != 0) {
      uVar6 = (ulong)bVar2;
      uVar5 = param_6 + uVar6 * 2 + 2;
      if (uVar5 < param_6) {
        return 0xffffbf80;
      }
      __n = *(ulong *)(param_1 + 8);
      if (__n < uVar5) {
        return 0xffffbf80;
      }
      memset(param_8,0,__n);
      puVar7 = param_8 + 1;
      *param_8 = 0;
      iVar3 = (*param_2)(param_3,puVar7,uVar6);
      if (iVar3 != 0) {
        return (ulong)(iVar3 - 0x4480);
      }
      lVar4 = mbedtls_md_info_from_type(*(undefined4 *)(param_1 + 0xe4));
      if (lVar4 != 0) {
        puVar1 = puVar7 + uVar6;
        uVar5 = mbedtls_md(lVar4,param_4,param_5,puVar1);
        if ((int)uVar5 != 0) {
          return uVar5;
        }
        puVar1[((-2 - param_6) + __n) - uVar6] = 1;
        if (param_6 != 0) {
          memcpy(puVar1 + (((-2 - param_6) + __n) - uVar6) + 1,param_7,param_6);
        }
        lVar4 = (__n - uVar6) + -1;
        uVar5 = FUN_00ba76c0(param_8 + uVar6 + 1,lVar4,puVar7,uVar6,*(undefined4 *)(param_1 + 0xe4))
        ;
        if ((int)uVar5 != 0) {
          return uVar5;
        }
        uVar5 = FUN_00ba76c0(puVar7,uVar6,param_8 + uVar6 + 1,lVar4,*(undefined4 *)(param_1 + 0xe4))
        ;
        if ((int)uVar5 == 0) {
          uVar5 = mbedtls_rsa_public(param_1,param_8,param_8);
          return uVar5;
        }
        return uVar5;
      }
    }
  }
  return 0xffffbf80;
}

