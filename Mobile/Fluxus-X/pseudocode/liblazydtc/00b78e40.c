/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b78e40
 */

undefined * mbedtls_md_info_from_string(char *param_1)

{
  int iVar1;
  undefined **ppuVar2;
  
  if (param_1 != (char *)0x0) {
    iVar1 = strcmp("MD5",param_1);
    ppuVar2 = &PTR_DAT_00ca8300;
    if (iVar1 != 0) {
      iVar1 = strcmp("RIPEMD160",param_1);
      if (iVar1 == 0) {
        ppuVar2 = &PTR_s_RIPEMD160_00ca8310;
      }
      else {
        iVar1 = strcmp("SHA1",param_1);
        if (iVar1 == 0) {
          ppuVar2 = &PTR_DAT_00ca8320;
        }
        else {
          iVar1 = strcmp("SHA",param_1);
          if (iVar1 == 0) {
            ppuVar2 = (undefined **)&UNK_00ca8330;
          }
          else {
            iVar1 = strcmp("SHA224",param_1);
            if (iVar1 == 0) {
              ppuVar2 = &PTR_s_SHA224_00ca8340;
            }
            else {
              iVar1 = strcmp("SHA256",param_1);
              if (iVar1 == 0) {
                ppuVar2 = &PTR_s_SHA256_00ca8350;
              }
              else {
                iVar1 = strcmp("SHA384",param_1);
                if (iVar1 == 0) {
                  ppuVar2 = &PTR_s_SHA384_00ca8360;
                }
                else {
                  iVar1 = strcmp("SHA512",param_1);
                  if (iVar1 == 0) {
                    ppuVar2 = &PTR_s_SHA512_00ca8370;
                  }
                  else {
                    iVar1 = strcmp("SHA3-224",param_1);
                    if (iVar1 == 0) {
                      ppuVar2 = &PTR_s_SHA3_224_00ca8380;
                    }
                    else {
                      iVar1 = strcmp("SHA3-256",param_1);
                      if (iVar1 == 0) {
                        ppuVar2 = &PTR_s_SHA3_256_00ca8390;
                      }
                      else {
                        iVar1 = strcmp("SHA3-384",param_1);
                        if (iVar1 == 0) {
                          ppuVar2 = &PTR_s_SHA3_384_00ca83a0;
                        }
                        else {
                          iVar1 = strcmp("SHA3-512",param_1);
                          ppuVar2 = &PTR_s_SHA3_512_00ca83b0;
                          if (iVar1 != 0) {
                            ppuVar2 = (undefined **)&DAT_00ca83c0;
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
    if (*(int *)(ppuVar2 + 1) - 3U < 0x11) {
      return (&PTR_LAB_00ca83d0)[(int)(*(int *)(ppuVar2 + 1) - 3U)];
    }
  }
  return (undefined *)0x0;
}

