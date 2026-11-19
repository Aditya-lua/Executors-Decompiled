/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b94e7c
 */

uint FUN_00b94e7c(int param_1,undefined8 param_2,undefined8 param_3,undefined8 param_4,
                 undefined8 param_5,undefined8 *param_6)

{
  long lVar1;
  long lVar2;
  long lVar3;
  uint uVar4;
  uint param1;
  
  DAT_00d26018 = 0;
  DAT_00d26010 = 0;
  DAT_00d26008 = 0;
  uVar4 = mbedtls_mpi_read_string(param_4,0x10,*param_6);
  if ((uVar4 == 0) &&
     (uVar4 = FUN_00b923c4(param_2,param_3,param_4,param_5,&LAB_00b94e44,0), lVar3 = DAT_00d26018,
     lVar2 = DAT_00d26010, lVar1 = DAT_00d26008, uVar4 == 0)) {
    DAT_00d26018 = 0;
    DAT_00d26010 = 0;
    DAT_00d26008 = 0;
    uVar4 = mbedtls_mpi_read_string(param_4,0x10,param_6[1]);
    if ((uVar4 == 0) &&
       (uVar4 = FUN_00b923c4(param_2,param_3,param_4,param_5,&LAB_00b94e44,0), uVar4 == 0)) {
      param1 = 1;
      if (DAT_00d26018 == lVar3) {
        if (DAT_00d26010 == lVar2) {
          uVar4 = 1;
          if (DAT_00d26008 == lVar1) {
            DAT_00d26018 = 0;
            DAT_00d26010 = 0;
            DAT_00d26008 = 0;
            uVar4 = mbedtls_mpi_read_string(param_4,0x10,param_6[2]);
            if ((uVar4 == 0) &&
               (uVar4 = FUN_00b923c4(param_2,param_3,param_4,param_5,&LAB_00b94e44,0), uVar4 == 0))
            {
              uVar4 = 1;
              param1 = 2;
              if ((DAT_00d26018 == lVar3) && ((DAT_00d26010 == lVar2 && (DAT_00d26008 == lVar1)))) {
                DAT_00d26018 = 0;
                DAT_00d26010 = 0;
                DAT_00d26008 = 0;
                uVar4 = mbedtls_mpi_read_string(param_4,0x10,param_6[3]);
                if ((uVar4 == 0) &&
                   (uVar4 = FUN_00b923c4(param_2,param_3,param_4,param_5,&LAB_00b94e44,0),
                   uVar4 == 0)) {
                  uVar4 = 1;
                  param1 = 3;
                  if (((DAT_00d26018 == lVar3) && (DAT_00d26010 == lVar2)) &&
                     (DAT_00d26008 == lVar1)) {
                    DAT_00d26018 = 0;
                    DAT_00d26010 = 0;
                    DAT_00d26008 = 0;
                    uVar4 = mbedtls_mpi_read_string(param_4,0x10,param_6[4]);
                    if ((uVar4 == 0) &&
                       (uVar4 = FUN_00b923c4(param_2,param_3,param_4,param_5,&LAB_00b94e44,0),
                       uVar4 == 0)) {
                      uVar4 = 1;
                      param1 = 4;
                      if (((DAT_00d26018 == lVar3) && (DAT_00d26010 == lVar2)) &&
                         (DAT_00d26008 == lVar1)) {
                        DAT_00d26018 = 0;
                        DAT_00d26010 = 0;
                        DAT_00d26008 = 0;
                        uVar4 = mbedtls_mpi_read_string(param_4,0x10,param_6[5]);
                        if (uVar4 == 0) {
                          uVar4 = FUN_00b923c4(param_2,param_3,param_4,param_5,&LAB_00b94e44,0);
                          param1 = 5;
                          if (uVar4 == 0) {
                            param1 = 5;
                            if ((DAT_00d26018 == lVar3 && DAT_00d26010 == lVar2) &&
                                DAT_00d26008 == lVar1) {
                              param1 = 6;
                            }
                            uVar4 = ((DAT_00d26018 == lVar3 && DAT_00d26010 == lVar2) &&
                                    DAT_00d26008 == lVar1) ^ 1;
                          }
                        }
                        else {
                          param1 = 5;
                        }
                      }
                    }
                    else {
                      param1 = 4;
                    }
                  }
                }
                else {
                  param1 = 3;
                }
              }
            }
            else {
              param1 = 2;
            }
          }
        }
        else {
          uVar4 = 1;
        }
      }
      else {
        uVar4 = 1;
        param1 = 1;
      }
    }
    else {
      param1 = 1;
    }
  }
  else {
    param1 = 0;
  }
  if (param_1 != 0) {
    if (uVar4 == 0) {
      puts("passed");
    }
    else {
      printf("failed (%u)\n",param1);
    }
  }
  return uVar4;
}

