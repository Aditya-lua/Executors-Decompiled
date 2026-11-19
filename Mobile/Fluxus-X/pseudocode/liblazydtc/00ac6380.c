/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ac6380
 */

int * FUN_00ac6380(undefined8 param_1,undefined8 param_2)

{
  byte *pbVar1;
  int iVar2;
  int *ptr;
  undefined8 *puVar3;
  undefined8 uVar4;
  int iVar5;
  ulong uVar6;
  byte *pbVar7;
  
  iVar2 = OPENSSL_sk_num(param_2);
  iVar5 = 0x20;
  if (0 < iVar2) {
    iVar5 = (iVar2 + -1) * 0x18 + 0x20;
  }
  ptr = CRYPTO_malloc(iVar5,"crypto/property/property_parse.c",0x141);
  if (ptr != (int *)0x0) {
    OPENSSL_sk_sort(param_2);
    *(byte *)(ptr + 1) = *(byte *)(ptr + 1) & 0xfe;
    if (0 < iVar2) {
      uVar6 = 0;
      pbVar7 = (byte *)(ptr + 5);
      iVar5 = 0;
      do {
        puVar3 = (undefined8 *)OPENSSL_sk_value(param_2,uVar6 & 0xffffffff);
        uVar4 = *puVar3;
        *(undefined8 *)(pbVar7 + -4) = puVar3[1];
        *(undefined8 *)(pbVar7 + -0xc) = uVar4;
        *(undefined8 *)(pbVar7 + 4) = puVar3[2];
        *(byte *)(ptr + 1) = *pbVar7 & 1 | *(byte *)(ptr + 1);
        pbVar1 = pbVar7 + -0xc;
        if ((uVar6 != 0) && (*(int *)pbVar1 == iVar5)) {
          CRYPTO_free(ptr);
          ERR_new();
          ERR_set_debug("crypto/property/property_parse.c",0x14d,"stack_to_property_list");
          uVar4 = ossl_property_name_str(param_1,iVar5);
          ERR_set_error(0x37,0x6c,"Duplicated name `%s\'",uVar4);
          return (int *)0x0;
        }
        uVar6 = uVar6 + 1;
        pbVar7 = pbVar7 + 0x18;
        iVar5 = *(int *)pbVar1;
      } while ((long)uVar6 < (long)iVar2);
    }
    *ptr = iVar2;
  }
  return ptr;
}

