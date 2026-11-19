/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b9f744
 */

int FUN_00b9f744(int param_1,char *param_2,undefined8 param_3,undefined4 param_4,void *param_5,
                int param_6,int param_7)

{
  long lVar1;
  bool bVar2;
  int iVar3;
  long lVar4;
  char *pcVar5;
  size_t __n;
  uint param2;
  undefined1 auStack_f0 [16];
  undefined1 auStack_e0 [16];
  undefined1 auStack_d0 [96];
  long local_70;
  
  lVar1 = tpidr_el0;
  local_70 = *(long *)(lVar1 + 0x28);
  lVar4 = mbedtls_cipher_info_from_type(param_6);
  if (lVar4 == 0) {
    iVar3 = -0x6080;
  }
  else {
    __n = (size_t)param_7;
    param2 = 1;
    do {
      if (param_1 != 0) {
        printf("  %s CMAC subkey #%d: ",param_2,param2);
      }
      mbedtls_cipher_init(auStack_d0);
      iVar3 = mbedtls_cipher_setup(auStack_d0,lVar4);
      if (iVar3 != 0) {
LAB_00b9f8b4:
        if (param_1 != 0) {
          pcVar5 = "test execution failed";
LAB_00b9f8c0:
          puts(pcVar5);
        }
LAB_00b9f8c8:
        mbedtls_cipher_free(auStack_d0);
        goto LAB_00b9f8d0;
      }
      iVar3 = mbedtls_cipher_setkey(auStack_d0,param_3,param_4,1);
      if (iVar3 == 0) {
        iVar3 = FUN_00b9ee70(auStack_d0,auStack_e0,auStack_f0);
        if (iVar3 == 0) {
          iVar3 = memcmp(auStack_e0,param_5,__n);
          if ((iVar3 == 0) &&
             (iVar3 = memcmp(auStack_f0,(void *)((long)param_5 + __n),__n), iVar3 == 0)) {
            if (param_1 != 0) {
              pcVar5 = "passed";
              goto LAB_00b9f888;
            }
            goto LAB_00b9f88c;
          }
          if (param_1 != 0) {
            puts("failed");
          }
        }
        else if (param_1 != 0) {
          pcVar5 = "failed";
          goto LAB_00b9f8c0;
        }
        goto LAB_00b9f8c8;
      }
      if ((param_6 != 3) || (iVar3 != -0x72 && iVar3 != -0x6080)) goto LAB_00b9f8b4;
      if (param_1 != 0) {
        pcVar5 = "skipped";
LAB_00b9f888:
        puts(pcVar5);
      }
LAB_00b9f88c:
      mbedtls_cipher_free(auStack_d0);
      bVar2 = param2 < 4;
      param2 = param2 + 1;
    } while (bVar2);
    iVar3 = 0;
  }
LAB_00b9f8d0:
  if (*(long *)(lVar1 + 0x28) != local_70) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return iVar3;
}

