/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b9f930
 */

ulong FUN_00b9f930(int param_1,char *param_2,undefined8 param_3,int param_4,undefined4 *param_5,
                  void *param_6,int param_7,int param_8)

{
  long lVar1;
  int iVar2;
  uint uVar3;
  long lVar4;
  ulong uVar5;
  char *pcVar6;
  size_t __n;
  long lVar7;
  ulong uVar8;
  undefined1 auStack_78 [16];
  long local_68;
  
  lVar1 = tpidr_el0;
  local_68 = *(long *)(lVar1 + 0x28);
  lVar4 = mbedtls_cipher_info_from_type(param_7);
  if (lVar4 == 0) {
    uVar8 = 0xffff9f80;
    uVar5 = 0;
    goto LAB_00b9fc14;
  }
  lVar7 = (long)param_4;
  __n = (size_t)param_8;
  if (param_1 != 0) {
    printf("  %s CMAC #%d: ",param_2,1);
  }
  uVar5 = mbedtls_cipher_cmac(lVar4,param_3,lVar7,&DAT_00787840,*param_5,auStack_78);
  iVar2 = (int)uVar5;
  uVar8 = uVar5 & 0xffffffff;
  if (iVar2 == -0x6080) {
LAB_00b9f9ec:
    if ((param_7 == 0x24) || (param_7 == 3)) {
      if (param_1 != 0) {
        pcVar6 = "skipped";
LAB_00b9fa38:
        puts(pcVar6);
        printf("  %s CMAC #%d: ",param_2,2);
      }
LAB_00b9fa50:
      uVar5 = mbedtls_cipher_cmac(lVar4,param_3,lVar7,&DAT_00787840,param_5[1],auStack_78);
      iVar2 = (int)uVar5;
      uVar8 = uVar5 & 0xffffffff;
      if (iVar2 == -0x6080) {
LAB_00b9fa8c:
        if ((param_7 == 0x24) || (param_7 == 3)) {
          if (param_1 != 0) {
            pcVar6 = "skipped";
LAB_00b9fad4:
            puts(pcVar6);
            printf("  %s CMAC #%d: ",param_2,3);
          }
LAB_00b9faec:
          uVar5 = mbedtls_cipher_cmac(lVar4,param_3,lVar7,&DAT_00787840,param_5[2],auStack_78);
          iVar2 = (int)uVar5;
          uVar8 = uVar5 & 0xffffffff;
          if (iVar2 == -0x6080) {
LAB_00b9fb28:
            if ((param_7 == 0x24) || (param_7 == 3)) {
              if (param_1 != 0) {
                pcVar6 = "skipped";
LAB_00b9fb70:
                puts(pcVar6);
                printf("  %s CMAC #%d: ",param_2,4);
              }
LAB_00b9fb88:
              uVar5 = mbedtls_cipher_cmac(lVar4,param_3,lVar7,&DAT_00787840,param_5[3],auStack_78);
              iVar2 = (int)uVar5;
              uVar8 = uVar5 & 0xffffffff;
              if (iVar2 == -0x6080) {
LAB_00b9fbc4:
                if ((param_7 == 0x24) || (param_7 == 3)) {
                  if (param_1 != 0) {
                    pcVar6 = "skipped";
LAB_00b9fc54:
                    uVar3 = puts(pcVar6);
                    uVar5 = (ulong)uVar3;
                  }
LAB_00b9fc58:
                  uVar8 = 0;
                  goto LAB_00b9fc14;
                }
              }
              else if (iVar2 == 0) {
                uVar3 = memcmp(auStack_78,(void *)((long)param_6 + __n * 3),__n);
                uVar5 = (ulong)uVar3;
                uVar8 = uVar5;
                if (uVar3 == 0) {
                  if (param_1 != 0) {
                    pcVar6 = "passed";
                    goto LAB_00b9fc54;
                  }
                  goto LAB_00b9fc58;
                }
              }
              else if (iVar2 == -0x72) goto LAB_00b9fbc4;
            }
          }
          else if (iVar2 == 0) {
            uVar3 = memcmp(auStack_78,(void *)((long)param_6 + __n * 2),__n);
            uVar5 = (ulong)uVar3;
            uVar8 = uVar5;
            if (uVar3 == 0) {
              if (param_1 != 0) {
                pcVar6 = "passed";
                goto LAB_00b9fb70;
              }
              goto LAB_00b9fb88;
            }
          }
          else if (iVar2 == -0x72) goto LAB_00b9fb28;
        }
      }
      else if (iVar2 == 0) {
        uVar3 = memcmp(auStack_78,(void *)((long)param_6 + __n),__n);
        uVar5 = (ulong)uVar3;
        uVar8 = uVar5;
        if (uVar3 == 0) {
          if (param_1 != 0) {
            pcVar6 = "passed";
            goto LAB_00b9fad4;
          }
          goto LAB_00b9faec;
        }
      }
      else if (iVar2 == -0x72) goto LAB_00b9fa8c;
    }
  }
  else if (iVar2 == 0) {
    uVar3 = memcmp(auStack_78,param_6,__n);
    uVar5 = (ulong)uVar3;
    uVar8 = uVar5;
    if (uVar3 == 0) {
      if (param_1 != 0) {
        pcVar6 = "passed";
        goto LAB_00b9fa38;
      }
      goto LAB_00b9fa50;
    }
  }
  else if (iVar2 == -0x72) goto LAB_00b9f9ec;
  if (param_1 != 0) {
    uVar3 = puts("failed");
    uVar5 = (ulong)uVar3;
  }
LAB_00b9fc14:
  if (*(long *)(lVar1 + 0x28) != local_68) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail(uVar5);
  }
  return uVar8;
}

