/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b917c4
 */

undefined * mbedtls_ecp_curve_info_from_name(char *param_1)

{
  int iVar1;
  undefined *puVar2;
  
  if (param_1 == (char *)0x0) {
    puVar2 = (undefined *)0x0;
  }
  else {
    iVar1 = strcmp("secp521r1",param_1);
    puVar2 = &DAT_00ca84f0;
    if (iVar1 != 0) {
      iVar1 = strcmp("brainpoolP512r1",param_1);
      if (iVar1 == 0) {
        puVar2 = &DAT_00ca8500;
      }
      else {
        iVar1 = strcmp("secp384r1",param_1);
        if (iVar1 == 0) {
          puVar2 = &DAT_00ca8510;
        }
        else {
          iVar1 = strcmp("brainpoolP384r1",param_1);
          if (iVar1 == 0) {
            puVar2 = &DAT_00ca8520;
          }
          else {
            iVar1 = strcmp("secp256r1",param_1);
            if (iVar1 == 0) {
              puVar2 = &DAT_00ca8530;
            }
            else {
              iVar1 = strcmp("secp256k1",param_1);
              if (iVar1 == 0) {
                puVar2 = &DAT_00ca8540;
              }
              else {
                iVar1 = strcmp("brainpoolP256r1",param_1);
                if (iVar1 == 0) {
                  puVar2 = &DAT_00ca8550;
                }
                else {
                  iVar1 = strcmp("secp224r1",param_1);
                  if (iVar1 == 0) {
                    puVar2 = &DAT_00ca8560;
                  }
                  else {
                    iVar1 = strcmp("secp224k1",param_1);
                    if (iVar1 == 0) {
                      puVar2 = &DAT_00ca8570;
                    }
                    else {
                      iVar1 = strcmp("secp192r1",param_1);
                      if (iVar1 == 0) {
                        puVar2 = &DAT_00ca8580;
                      }
                      else {
                        iVar1 = strcmp("secp192k1",param_1);
                        if (iVar1 == 0) {
                          puVar2 = &DAT_00ca8590;
                        }
                        else {
                          iVar1 = strcmp("x25519",param_1);
                          if (iVar1 != 0) {
                            iVar1 = strcmp("x448",param_1);
                            puVar2 = &DAT_00ca85b0;
                            if (iVar1 != 0) {
                              puVar2 = (undefined *)0x0;
                            }
                            return puVar2;
                          }
                          puVar2 = &DAT_00ca85a0;
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
      }
    }
  }
  return puVar2;
}

