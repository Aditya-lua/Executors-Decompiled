/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b595ec
 */

long ossl_rand_drbg_new(undefined8 param_1,long param_2,int *param_3,code *param_4,code *param_5,
                       undefined8 param_6,undefined8 param_7,undefined8 param_8,undefined8 param_9)

{
  int *piVar1;
  int iVar2;
  __pid_t _Var3;
  long lVar4;
  int iVar5;
  uint local_54;
  
  iVar2 = ossl_prov_is_running();
  if (iVar2 != 0) {
    lVar4 = CRYPTO_zalloc(0x128,"providers/implementations/rands/drbg.c",0x312);
    if (lVar4 == 0) {
      ERR_new();
      ERR_set_debug("providers/implementations/rands/drbg.c",0x314,"ossl_rand_drbg_new");
      ERR_set_error(0x39,0xc0100,0);
      return 0;
    }
    *(undefined8 *)(lVar4 + 8) = param_1;
    *(undefined8 *)(lVar4 + 0x10) = param_6;
    *(undefined8 *)(lVar4 + 0x18) = param_7;
    *(undefined8 *)(lVar4 + 0x20) = param_8;
    *(undefined8 *)(lVar4 + 0x28) = param_9;
    _Var3 = openssl_get_fork_id();
    *(__pid_t *)(lVar4 + 0x78) = _Var3;
    *(long *)(lVar4 + 0x30) = param_2;
    if ((param_3 != (int *)0x0) && (iVar2 = *param_3, iVar2 != 0)) {
      iVar5 = iVar2;
      piVar1 = param_3;
      do {
        if (iVar5 == 8) {
          *(undefined8 *)(lVar4 + 0x38) = *(undefined8 *)(piVar1 + 2);
          break;
        }
        iVar5 = piVar1[4];
        piVar1 = piVar1 + 4;
      } while (iVar5 != 0);
      if (iVar2 != 0) {
        iVar5 = iVar2;
        piVar1 = param_3;
        do {
          if (iVar5 == 9) {
            *(undefined8 *)(lVar4 + 0x40) = *(undefined8 *)(piVar1 + 2);
            break;
          }
          iVar5 = piVar1[4];
          piVar1 = piVar1 + 4;
        } while (iVar5 != 0);
        if (iVar2 != 0) {
          iVar5 = iVar2;
          piVar1 = param_3;
          do {
            if (iVar5 == 10) {
              *(undefined8 *)(lVar4 + 0x48) = *(undefined8 *)(piVar1 + 2);
              break;
            }
            iVar5 = piVar1[4];
            piVar1 = piVar1 + 4;
          } while (iVar5 != 0);
          if (iVar2 != 0) {
            iVar5 = iVar2;
            piVar1 = param_3;
            do {
              if (iVar5 == 0xf) {
                *(undefined8 *)(lVar4 + 0x50) = *(undefined8 *)(piVar1 + 2);
                break;
              }
              iVar5 = piVar1[4];
              piVar1 = piVar1 + 4;
            } while (iVar5 != 0);
            if (iVar2 != 0) {
              iVar5 = iVar2;
              piVar1 = param_3;
              do {
                if (iVar5 == 7) {
                  *(undefined8 *)(lVar4 + 0x58) = *(undefined8 *)(piVar1 + 2);
                  break;
                }
                iVar5 = piVar1[4];
                piVar1 = piVar1 + 4;
              } while (iVar5 != 0);
              if (iVar2 != 0) {
                iVar5 = iVar2;
                piVar1 = param_3;
                do {
                  if (iVar5 == 0x12) {
                    *(undefined8 *)(lVar4 + 0x60) = *(undefined8 *)(piVar1 + 2);
                    break;
                  }
                  iVar5 = piVar1[4];
                  piVar1 = piVar1 + 4;
                } while (iVar5 != 0);
                if (iVar2 != 0) {
                  do {
                    if (iVar2 == 0x13) {
                      *(undefined8 *)(lVar4 + 0x68) = *(undefined8 *)(param_3 + 2);
                      break;
                    }
                    iVar2 = param_3[4];
                    param_3 = param_3 + 4;
                  } while (iVar2 != 0);
                }
              }
            }
          }
        }
      }
    }
    *(undefined8 *)(lVar4 + 0x98) = 0x7fffffff;
    *(undefined8 *)(lVar4 + 0xb8) = 0x7fffffff;
    *(undefined4 *)(lVar4 + 0xc0) = 1;
    *(undefined4 *)(lVar4 + 0xc4) = 0x100;
    *(undefined8 *)(lVar4 + 0xb0) = 0x7fffffff;
    *(undefined8 *)(lVar4 + 0xa8) = 0x7fffffff;
    *(undefined4 *)(lVar4 + 0xd8) = 1;
    *(undefined8 *)(lVar4 + 0xd0) = 0xe10;
    iVar2 = (*param_4)(lVar4);
    if (iVar2 != 0) {
      if (param_2 == 0) {
        return lVar4;
      }
      iVar2 = FUN_00b59874(lVar4,&local_54);
      if (iVar2 != 0) {
        if (*(uint *)(lVar4 + 0x80) <= local_54) {
          return lVar4;
        }
        ERR_new();
        ERR_set_debug("providers/implementations/rands/drbg.c",0x345,"ossl_rand_drbg_new");
        ERR_set_error(0x39,0xc2,0);
      }
    }
    (*param_5)(lVar4);
  }
  return 0;
}

