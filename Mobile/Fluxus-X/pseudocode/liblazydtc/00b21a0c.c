/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b21a0c
 */

ulong ossl_digest_get_approved_nid(long param_1)

{
  int iVar1;
  ulong uVar2;
  long lVar3;
  
  uVar2 = 0;
  if (param_1 != 0) {
    iVar1 = EVP_MD_is_a(param_1,&DAT_002d142e);
    lVar3 = 0;
    if (iVar1 == 0) {
      iVar1 = EVP_MD_is_a(param_1,"SHA2-224");
      if (iVar1 == 0) {
        iVar1 = EVP_MD_is_a(param_1,"SHA2-256");
        if (iVar1 == 0) {
          iVar1 = EVP_MD_is_a(param_1,"SHA2-384");
          if (iVar1 == 0) {
            iVar1 = EVP_MD_is_a(param_1,"SHA2-512");
            if (iVar1 == 0) {
              iVar1 = EVP_MD_is_a(param_1,"SHA2-512/224");
              if (iVar1 == 0) {
                iVar1 = EVP_MD_is_a(param_1,"SHA2-512/256");
                if (iVar1 == 0) {
                  iVar1 = EVP_MD_is_a(param_1,"SHA3-224");
                  if (iVar1 == 0) {
                    iVar1 = EVP_MD_is_a(param_1,"SHA3-256");
                    if (iVar1 == 0) {
                      iVar1 = EVP_MD_is_a(param_1,"SHA3-384");
                      if (iVar1 == 0) {
                        uVar2 = EVP_MD_is_a(param_1,"SHA3-512");
                        if ((int)uVar2 == 0) {
                          return uVar2;
                        }
                        lVar3 = 10;
                      }
                      else {
                        lVar3 = 9;
                      }
                    }
                    else {
                      lVar3 = 8;
                    }
                  }
                  else {
                    lVar3 = 7;
                  }
                }
                else {
                  lVar3 = 6;
                }
              }
              else {
                lVar3 = 5;
              }
            }
            else {
              lVar3 = 4;
            }
          }
          else {
            lVar3 = 3;
          }
        }
        else {
          lVar3 = 2;
        }
      }
      else {
        lVar3 = 1;
      }
    }
    uVar2 = (ulong)(uint)(&DAT_00c8ca28)[lVar3 * 4];
  }
  return uVar2;
}

