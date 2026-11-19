/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ac5b80
 */

undefined8 FUN_00ac5b80(undefined8 param_1,undefined8 *param_2,undefined4 *param_3)

{
  bool bVar1;
  undefined1 uVar2;
  int iVar3;
  undefined4 uVar4;
  undefined8 uVar5;
  undefined8 uVar6;
  undefined1 *puVar7;
  ulong uVar8;
  ulong uVar9;
  undefined1 local_c4 [100];
  
  puVar7 = (undefined1 *)*param_2;
  iVar3 = ossl_ctype_check(*puVar7,3);
  if (iVar3 == 0) {
LAB_00ac5c64:
    ERR_new();
    ERR_set_debug("crypto/property/property_parse.c",0x43,"parse_name");
    uVar5 = *param_2;
    uVar6 = 0x67;
LAB_00ac5cd4:
    ERR_set_error(0x37,uVar6,"HERE-->%s",uVar5);
    return 0;
  }
  uVar6 = 0;
  uVar8 = 0;
  bVar1 = false;
LAB_00ac5bd8:
  puVar7 = puVar7 + 2;
  uVar9 = uVar8;
  if (uVar8 < 99) goto LAB_00ac5bf4;
  do {
    bVar1 = true;
    while( true ) {
      if ((puVar7[-1] != '_') && (iVar3 = ossl_ctype_check(puVar7[-1],7), iVar3 == 0)) {
        if (puVar7[-1] != '.') {
          local_c4[uVar8] = 0;
          if (!bVar1) {
            puVar7 = puVar7 + -2;
            do {
              puVar7 = puVar7 + 1;
              iVar3 = ossl_ctype_check(*puVar7,8);
            } while (iVar3 != 0);
            *param_2 = puVar7;
            uVar4 = ossl_property_name(param_1,local_c4,uVar6);
            *param_3 = uVar4;
            return 1;
          }
          ERR_new();
          ERR_set_debug("crypto/property/property_parse.c",0x58,"parse_name");
          uVar5 = *param_2;
          uVar6 = 100;
          goto LAB_00ac5cd4;
        }
        if (uVar8 < 99) {
          local_c4[uVar8] = 0x2e;
          uVar8 = uVar8 + 1;
        }
        else {
          bVar1 = true;
        }
        iVar3 = ossl_ctype_check(*puVar7,3);
        uVar6 = 1;
        if (iVar3 == 0) goto LAB_00ac5c64;
        goto LAB_00ac5bd8;
      }
      puVar7 = puVar7 + 1;
      uVar9 = uVar8;
      if (0x62 < uVar8) break;
LAB_00ac5bf4:
      uVar2 = ossl_tolower(puVar7[-2]);
      uVar8 = uVar9 + 1;
      local_c4[uVar9] = uVar2;
    }
  } while( true );
}

