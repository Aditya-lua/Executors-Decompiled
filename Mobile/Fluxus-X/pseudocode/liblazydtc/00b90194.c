/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b90194
 */

int psa_pake_output(int *param_1,byte param_2,void *param_3,size_t param_4,undefined8 *param_5)

{
  char cVar1;
  char cVar2;
  uint uVar3;
  int iVar4;
  void *__src;
  char cVar5;
  
  *param_5 = 0;
  cVar5 = (char)param_1[3];
  if (cVar5 == '\x01') {
    iVar4 = FUN_00b9042c(param_1);
    if (iVar4 == 0) {
      cVar5 = (char)param_1[3];
      goto LAB_00b901e4;
    }
  }
  else {
LAB_00b901e4:
    if (cVar5 != '\x02') goto LAB_00b90278;
    if (param_4 == 0) {
LAB_00b90280:
      iVar4 = -0x87;
      goto LAB_00b9028c;
    }
    if (param_1[1] != 0xa000100) {
      iVar4 = -0x86;
      goto LAB_00b9028c;
    }
    if (2 < (byte)(param_2 - 1)) goto LAB_00b90280;
    uVar3 = param_1[4];
    if ((1 < uVar3) || (*(byte *)((long)param_1 + 0x1a) != param_2)) {
LAB_00b90278:
      iVar4 = -0x89;
      goto LAB_00b9028c;
    }
    if ((param_2 == 1) && (((char)param_1[6] == '\0' && (*(char *)((long)param_1 + 0x19) == '\0'))))
    {
      param_1[5] = 1;
      if (uVar3 == 1) goto LAB_00b9031c;
LAB_00b9025c:
      iVar4 = 0;
      if (uVar3 == 0) {
        iVar4 = 0;
        if (*(char *)((long)param_1 + 0x19) != '\0') {
          iVar4 = 3;
        }
        goto LAB_00b90320;
      }
    }
    else {
      if (param_1[5] != 1) goto LAB_00b90278;
      if (uVar3 != 1) goto LAB_00b9025c;
LAB_00b9031c:
      iVar4 = 6;
LAB_00b90320:
      iVar4 = iVar4 + (uint)param_2;
    }
    __src = calloc(param_4,1);
    if (__src == (void *)0x0) {
      iVar4 = -0x8d;
    }
    else {
      if (*param_1 == 1) {
        iVar4 = mbedtls_psa_pake_output(param_1 + 8,iVar4,__src,param_4,param_5);
        if (iVar4 == 0) {
          if (param_1[1] == 0xa000100) {
            if (*(char *)((long)param_1 + 0x1a) == '\x03') {
              iVar4 = param_1[4];
              cVar5 = '\x01';
              if (iVar4 == 0) {
                cVar5 = '\x02';
              }
              cVar1 = *(char *)((long)param_1 + 0x19) + '\x01';
              cVar2 = '\0';
              if (iVar4 != 2) {
                cVar2 = cVar5;
              }
              *(char *)((long)param_1 + 0x19) = cVar1;
              if (cVar2 == cVar1) {
                param_1[5] = 0;
              }
              cVar5 = '\x01';
              if (((char)param_1[6] == cVar1) && (cVar2 == (char)param_1[6])) {
                *(undefined2 *)(param_1 + 6) = 0;
                param_1[4] = iVar4 + 1;
                cVar5 = '\x01';
              }
            }
            else {
              cVar5 = *(char *)((long)param_1 + 0x1a) + '\x01';
            }
            iVar4 = 0;
            *(char *)((long)param_1 + 0x1a) = cVar5;
          }
          else {
            iVar4 = -0x86;
          }
        }
      }
      else {
        iVar4 = -0x87;
      }
      if (param_3 == (void *)0x0) {
        iVar4 = -0x97;
      }
      else {
        memcpy(param_3,__src,param_4);
        free(__src);
        if (iVar4 == 0) {
          return 0;
        }
      }
    }
  }
LAB_00b9028c:
  cVar5 = (char)param_1[3];
  if (cVar5 == '\x02') {
    if (*param_1 != 1) goto LAB_00b902e0;
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
LAB_00b902e0:
  memset(param_1,0,0x390);
  return iVar4;
}

