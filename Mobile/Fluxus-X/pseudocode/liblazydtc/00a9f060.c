/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a9f060
 */

undefined8 OSSL_PARAM_set_time_t(long param_1,ulong param_2)

{
  int iVar1;
  uint __c;
  ulong uVar2;
  ulong uVar3;
  ulong *__dest;
  undefined8 uStack_28;
  
  uStack_28 = param_2;
  if (param_1 == 0) {
    return 0;
  }
  iVar1 = *(int *)(param_1 + 8);
  *(undefined8 *)(param_1 + 0x20) = 0;
  if (iVar1 == 1) {
    __dest = *(ulong **)(param_1 + 0x10);
    *(undefined8 *)(param_1 + 0x20) = 8;
    if (__dest == (ulong *)0x0) {
      return 1;
    }
    uVar2 = *(ulong *)(param_1 + 0x18);
    if (uVar2 - 8 == 0) {
LAB_00a9eab0:
      *__dest = param_2;
      return 1;
    }
    if (uVar2 != 4) {
      *(undefined8 *)(param_1 + 0x20) = 8;
      __c = (uint)((long)param_2 >> 0x3f);
      if (uVar2 < 9) {
        if (-uVar2 != -8) {
          uVar3 = 0;
          do {
            if ((uint)*(byte *)((long)&uStack_28 + uVar3 + uVar2) != (__c & 0xff))
            goto LAB_00a9ebe4;
            uVar3 = uVar3 + 1;
          } while (uVar3 < -uVar2 + 8);
        }
        if ((char)(*(byte *)((long)register0x00000008 + (uVar2 - 0x29)) ^
                  (byte)((long)param_2 >> 0x3f)) < '\0') {
LAB_00a9ebe4:
          *(undefined8 *)(param_1 + 0x20) = 8;
          return 0;
        }
        memcpy(__dest,&uStack_28,uVar2);
      }
      else {
        memset(__dest + 1,__c,uVar2 - 8);
        *__dest = param_2;
      }
      *(undefined8 *)(param_1 + 0x20) = *(undefined8 *)(param_1 + 0x18);
      return 1;
    }
    if (param_2 + 0x80000000 >> 0x20 != 0) {
      return 0;
    }
  }
  else {
    if (((long)param_2 < 0) || (iVar1 != 2)) {
      if (iVar1 != 3) {
        return 0;
      }
      *(undefined8 *)(param_1 + 0x20) = 8;
      if (*(double **)(param_1 + 0x10) == (double *)0x0) {
        return 1;
      }
      if (*(long *)(param_1 + 0x18) != 8) {
        return 0;
      }
      uVar2 = -param_2;
      if (-1 < (long)param_2) {
        uVar2 = param_2;
      }
      if (uVar2 >> 0x35 == 0) {
        **(double **)(param_1 + 0x10) = (double)(long)param_2;
        return 1;
      }
      return 0;
    }
    __dest = *(ulong **)(param_1 + 0x10);
    *(undefined8 *)(param_1 + 0x20) = 8;
    if (__dest == (ulong *)0x0) {
      return 1;
    }
    uVar2 = *(ulong *)(param_1 + 0x18);
    if (uVar2 - 8 == 0) goto LAB_00a9eab0;
    if (uVar2 != 4) {
      *(undefined8 *)(param_1 + 0x20) = 8;
      if ((long)param_2 < 0) {
LAB_00a9ebd4:
        *(undefined8 *)(param_1 + 0x20) = 8;
        return 0;
      }
      if (uVar2 < 9) {
        if (-uVar2 != -8) {
          uVar3 = 0;
          do {
            if (*(char *)((long)&uStack_28 + uVar3 + uVar2) != '\0') goto LAB_00a9ebd4;
            uVar3 = uVar3 + 1;
          } while (uVar3 < -uVar2 + 8);
        }
        memcpy(__dest,&uStack_28,uVar2);
      }
      else {
        memset(__dest + 1,0,uVar2 - 8);
        *__dest = param_2;
      }
      *(undefined8 *)(param_1 + 0x20) = *(undefined8 *)(param_1 + 0x18);
      return 1;
    }
    if (0xffffffff < (long)param_2) {
      return 0;
    }
  }
  *(undefined8 *)(param_1 + 0x20) = 4;
  *(int *)__dest = (int)param_2;
  return 1;
}

