/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ac70bc
 */

undefined8 FUN_00ac70bc(long *param_1,long param_2)

{
  int iVar1;
  undefined8 uVar2;
  char *pcVar3;
  long lVar4;
  undefined1 *puVar5;
  undefined1 *puVar6;
  
  lVar4 = 0;
  puVar6 = (undefined1 *)(*param_1 + -1);
  while( true ) {
    puVar5 = puVar6;
    iVar1 = ossl_isdigit(puVar5[1]);
    if (iVar1 == 0) {
      ERR_new();
      uVar2 = 0x67;
      goto LAB_00ac718c;
    }
    if ((long)(-0x7fffffffffffffd1 - (ulong)(byte)puVar5[1]) / 10 < lVar4) break;
    lVar4 = (ulong)(byte)puVar5[1] + lVar4 * 10 + -0x30;
    iVar1 = ossl_isdigit(puVar5[2]);
    puVar6 = puVar5 + 1;
    if (iVar1 == 0) {
      iVar1 = ossl_ctype_check(puVar5[2],8);
      if (((iVar1 != 0) || (puVar5[2] == '\0')) || (puVar5[2] == ',')) {
        do {
          puVar6 = puVar6 + 1;
          iVar1 = ossl_ctype_check(*puVar6,8);
        } while (iVar1 != 0);
        *param_1 = (long)puVar6;
        *(undefined4 *)(param_2 + 4) = 1;
        *(long *)(param_2 + 0x10) = lVar4;
        return 1;
      }
      ERR_new();
      uVar2 = 0x74;
LAB_00ac718c:
      ERR_set_debug("crypto/property/property_parse.c",uVar2,"parse_number");
      lVar4 = *param_1;
      pcVar3 = "HERE-->%s";
      uVar2 = 0x69;
LAB_00ac71d8:
      ERR_set_error(0x37,uVar2,pcVar3,lVar4);
      return 0;
    }
  }
  ERR_new();
  ERR_set_debug("crypto/property/property_parse.c",0x6d,"parse_number");
  lVar4 = *param_1;
  pcVar3 = "Property %s overflows";
  uVar2 = 0x6c;
  goto LAB_00ac71d8;
}

