/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b907f8
 */

void psa_pake_get_implicit_key(int *param_1,undefined8 param_2)

{
  char cVar1;
  long lVar2;
  size_t __n;
  int iVar3;
  int iVar4;
  void *__dest;
  size_t local_1a0;
  undefined1 auStack_198 [336];
  long local_48;
  
  lVar2 = tpidr_el0;
  local_48 = *(long *)(lVar2 + 0x28);
  local_1a0 = 0;
  cVar1 = (char)param_1[3];
  if (cVar1 == '\x02') {
    if (param_1[1] == 0xa000100) {
      if (param_1[4] == 2) {
        if (*param_1 == 1) {
          iVar3 = mbedtls_psa_pake_get_implicit_key(param_1 + 8,auStack_198,0x150,&local_1a0);
          __n = local_1a0;
          if (iVar3 == 0) {
            if (local_1a0 == 0) {
              __dest = (void *)0x0;
LAB_00b90904:
              iVar3 = FUN_00b8e20c(param_2,0x101,0,__dest,__n);
            }
            else {
              __dest = calloc(local_1a0,1);
              if (__dest != (void *)0x0) {
                memcpy(__dest,auStack_198,__n);
                goto LAB_00b90904;
              }
              iVar3 = -0x8d;
            }
            free(__dest);
            mbedtls_platform_zeroize(auStack_198,0x150);
          }
        }
        else {
          iVar3 = -0x87;
        }
      }
      else {
        iVar3 = -0x89;
      }
    }
    else {
      iVar3 = -0x86;
    }
    cVar1 = (char)param_1[3];
    if (cVar1 == '\x02') {
      if (*param_1 != 1) {
        iVar4 = -0x87;
        goto LAB_00b90984;
      }
      iVar4 = mbedtls_psa_pake_abort(param_1 + 8);
      cVar1 = (char)param_1[3];
    }
    else {
      iVar4 = 0;
    }
  }
  else {
    iVar4 = 0;
    iVar3 = -0x89;
  }
  if (cVar1 == '\x01') {
    if (*(long *)(param_1 + 8) != 0) {
      mbedtls_zeroize_and_free(*(long *)(param_1 + 8),*(undefined8 *)(param_1 + 10));
    }
    if (*(void **)(param_1 + 0xc) != (void *)0x0) {
      free(*(void **)(param_1 + 0xc));
    }
    if (*(void **)(param_1 + 0x10) != (void *)0x0) {
      free(*(void **)(param_1 + 0x10));
    }
  }
LAB_00b90984:
  memset(param_1,0,0x390);
  if (iVar3 != 0) {
    iVar4 = iVar3;
  }
  if (*(long *)(lVar2 + 0x28) != local_48) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail(iVar4);
  }
  return;
}

