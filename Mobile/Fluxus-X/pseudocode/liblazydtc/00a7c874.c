/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a7c874
 */

undefined ** ossl_ffc_name_to_dh_named_group(undefined8 param_1)

{
  int iVar1;
  undefined **ppuVar2;
  
  iVar1 = OPENSSL_strcasecmp("ffdhe2048",param_1);
  ppuVar2 = &PTR_s_ffdhe2048_00c61108;
  if (iVar1 != 0) {
    iVar1 = OPENSSL_strcasecmp("ffdhe3072",param_1);
    if (iVar1 == 0) {
      ppuVar2 = &PTR_s_ffdhe3072_00c61138;
    }
    else {
      iVar1 = OPENSSL_strcasecmp("ffdhe4096",param_1);
      if (iVar1 == 0) {
        ppuVar2 = &PTR_s_ffdhe4096_00c61168;
      }
      else {
        iVar1 = OPENSSL_strcasecmp("ffdhe6144",param_1);
        if (iVar1 == 0) {
          ppuVar2 = &PTR_s_ffdhe6144_00c61198;
        }
        else {
          iVar1 = OPENSSL_strcasecmp("ffdhe8192",param_1);
          if (iVar1 == 0) {
            ppuVar2 = &PTR_s_ffdhe8192_00c611c8;
          }
          else {
            iVar1 = OPENSSL_strcasecmp("modp_1536",param_1);
            if (iVar1 == 0) {
              ppuVar2 = &PTR_s_modp_1536_00c611f8;
            }
            else {
              iVar1 = OPENSSL_strcasecmp("modp_2048",param_1);
              if (iVar1 == 0) {
                ppuVar2 = &PTR_s_modp_2048_00c61228;
              }
              else {
                iVar1 = OPENSSL_strcasecmp("modp_3072",param_1);
                if (iVar1 == 0) {
                  ppuVar2 = &PTR_s_modp_3072_00c61258;
                }
                else {
                  iVar1 = OPENSSL_strcasecmp("modp_4096",param_1);
                  if (iVar1 == 0) {
                    ppuVar2 = &PTR_s_modp_4096_00c61288;
                  }
                  else {
                    iVar1 = OPENSSL_strcasecmp("modp_6144",param_1);
                    if (iVar1 == 0) {
                      ppuVar2 = &PTR_s_modp_6144_00c612b8;
                    }
                    else {
                      iVar1 = OPENSSL_strcasecmp("modp_8192",param_1);
                      if (iVar1 == 0) {
                        ppuVar2 = &PTR_s_modp_8192_00c612e8;
                      }
                      else {
                        iVar1 = OPENSSL_strcasecmp("dh_1024_160",param_1);
                        if (iVar1 == 0) {
                          ppuVar2 = &PTR_s_dh_1024_160_00c61318;
                        }
                        else {
                          iVar1 = OPENSSL_strcasecmp("dh_2048_224",param_1);
                          if (iVar1 != 0) {
                            iVar1 = OPENSSL_strcasecmp("dh_2048_256",param_1);
                            ppuVar2 = &PTR_s_dh_2048_256_00c61378;
                            if (iVar1 != 0) {
                              ppuVar2 = (undefined **)0x0;
                            }
                            return ppuVar2;
                          }
                          ppuVar2 = &PTR_s_dh_2048_224_00c61348;
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
  return ppuVar2;
}

