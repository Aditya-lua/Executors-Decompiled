/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b9053c
 */

int psa_pake_input(int *param_1,byte param_2,void *param_3,size_t param_4)

{
  char cVar1;
  char cVar2;
  uint uVar3;
  int iVar4;
  char cVar5;
  char cVar6;
  void *__dest;
  ulong uVar7;
  
  if ((param_1[1] == 0xa000100) && (param_1[2] == 0)) {
    uVar7 = 0;
  }
  else if (param_2 == 1) {
    uVar7 = 0x41;
  }
  else {
    uVar7 = 0x41;
    if (param_2 != 2) {
      uVar7 = 0x20;
    }
  }
  cVar5 = (char)param_1[3];
  if (cVar5 == '\x01') {
    iVar4 = FUN_00b9042c(param_1);
    if (iVar4 == 0) {
      cVar5 = (char)param_1[3];
      goto LAB_00b905d4;
    }
    __dest = (void *)0x0;
    goto LAB_00b90660;
  }
LAB_00b905d4:
  if (cVar5 != '\x02') goto LAB_00b90640;
  if (uVar7 <= param_4 - 1) {
LAB_00b9064c:
    __dest = (void *)0x0;
    iVar4 = -0x87;
    goto LAB_00b90660;
  }
  if (param_1[1] == 0xa000100) {
    if (2 < (byte)(param_2 - 1)) goto LAB_00b9064c;
    uVar3 = param_1[4];
    if ((1 < uVar3) || (*(byte *)((long)param_1 + 0x1a) != param_2)) {
LAB_00b90640:
      __dest = (void *)0x0;
      iVar4 = -0x89;
      goto LAB_00b90660;
    }
    if ((param_2 == 1) && (((char)param_1[6] == '\0' && (*(char *)((long)param_1 + 0x19) == '\0'))))
    {
      param_1[5] = 0;
    }
    else if (param_1[5] != 0) goto LAB_00b90640;
    if (uVar3 == 1) {
      iVar4 = 9;
LAB_00b90714:
      iVar4 = iVar4 + (uint)param_2;
    }
    else {
      iVar4 = 0;
      if (uVar3 == 0) {
        iVar4 = 0;
        if ((char)param_1[6] != '\0') {
          iVar4 = 3;
        }
        goto LAB_00b90714;
      }
    }
    __dest = calloc(param_4,1);
    if (__dest == (void *)0x0) {
      iVar4 = -0x8d;
    }
    else {
      memcpy(__dest,param_3,param_4);
      if (*param_1 == 1) {
        iVar4 = mbedtls_psa_pake_input(param_1 + 8,iVar4,__dest,param_4);
        if (iVar4 == 0) {
          if (param_1[1] == 0xa000100) {
            if (*(char *)((long)param_1 + 0x1a) == '\x03') {
              iVar4 = param_1[4];
              cVar5 = '\x01';
              cVar6 = '\x01';
              if (iVar4 == 0) {
                cVar6 = '\x02';
              }
              cVar1 = (char)param_1[6] + '\x01';
              cVar2 = '\0';
              if (iVar4 != 2) {
                cVar2 = cVar6;
              }
              *(char *)(param_1 + 6) = cVar1;
              if ((cVar2 == cVar1) && (param_1[5] = 1, cVar1 == *(char *)((long)param_1 + 0x19))) {
                *(undefined2 *)(param_1 + 6) = 0;
                param_1[4] = iVar4 + 1;
                cVar5 = '\x01';
              }
            }
            else {
              cVar5 = *(char *)((long)param_1 + 0x1a) + '\x01';
            }
            *(char *)((long)param_1 + 0x1a) = cVar5;
            free(__dest);
            return 0;
          }
          goto LAB_00b9065c;
        }
      }
      else {
        iVar4 = -0x87;
      }
    }
  }
  else {
    __dest = (void *)0x0;
LAB_00b9065c:
    iVar4 = -0x86;
  }
LAB_00b90660:
  free(__dest);
  cVar5 = (char)param_1[3];
  if (cVar5 == '\x02') {
    if (*param_1 != 1) goto LAB_00b906bc;
    mbedtls_psa_pake_abort(param_1 + 8);
    cVar5 = (char)param_1[3];
  }
  if (cVar5 == '\x01') {
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
LAB_00b906bc:
  memset(param_1,0,0x390);
  return iVar4;
}

