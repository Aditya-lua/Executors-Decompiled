/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a9e210
 */

undefined8 OSSL_PARAM_set_int(long param_1,int param_2)

{
  int iVar1;
  ulong uVar2;
  ulong uVar3;
  long *__dest;
  byte bStack_25;
  int iStack_24;
  
  iStack_24 = param_2;
  if (param_1 == 0) {
    return 0;
  }
  iVar1 = *(int *)(param_1 + 8);
  *(undefined8 *)(param_1 + 0x20) = 0;
  if (iVar1 == 1) {
    __dest = *(long **)(param_1 + 0x10);
    *(undefined8 *)(param_1 + 0x20) = 4;
    if (__dest == (long *)0x0) {
      return 1;
    }
    uVar2 = *(ulong *)(param_1 + 0x18);
    if (uVar2 == 8) {
LAB_00a9e300:
      *(undefined8 *)(param_1 + 0x20) = 8;
      *__dest = (long)param_2;
      return 1;
    }
    if (uVar2 - 4 != 0) {
      *(undefined8 *)(param_1 + 0x20) = 4;
      if (uVar2 < 5) {
        if (-uVar2 != -4) {
          uVar3 = 0;
          do {
            if ((uint)*(byte *)((long)&iStack_24 + uVar3 + uVar2) != (param_2 >> 0x1f & 0xffU))
            goto LAB_00a9e414;
            uVar3 = uVar3 + 1;
          } while (uVar3 < -uVar2 + 4);
        }
        if ((char)((&bStack_25)[uVar2] ^ (byte)(param_2 >> 0x1f)) < '\0') {
LAB_00a9e414:
          *(undefined8 *)(param_1 + 0x20) = 4;
          return 0;
        }
        memcpy(__dest,&iStack_24,uVar2);
      }
      else {
        memset((int *)((long)__dest + 4),param_2 >> 0x1f,uVar2 - 4);
        *(int *)__dest = param_2;
      }
      *(undefined8 *)(param_1 + 0x20) = *(undefined8 *)(param_1 + 0x18);
      return 1;
    }
  }
  else {
    if ((param_2 < 0) || (iVar1 != 2)) {
      if (iVar1 != 3) {
        return 0;
      }
      *(undefined8 *)(param_1 + 0x20) = 8;
      if (*(double **)(param_1 + 0x10) == (double *)0x0) {
        return 1;
      }
      if (*(long *)(param_1 + 0x18) == 8) {
        **(double **)(param_1 + 0x10) = (double)param_2;
        return 1;
      }
      return 0;
    }
    __dest = *(long **)(param_1 + 0x10);
    *(undefined8 *)(param_1 + 0x20) = 4;
    if (__dest == (long *)0x0) {
      return 1;
    }
    uVar2 = *(ulong *)(param_1 + 0x18);
    if (uVar2 == 8) goto LAB_00a9e300;
    if (uVar2 - 4 != 0) {
      *(undefined8 *)(param_1 + 0x20) = 4;
      if (param_2 < 0) {
LAB_00a9e404:
        *(undefined8 *)(param_1 + 0x20) = 4;
        return 0;
      }
      if (uVar2 < 5) {
        if (-uVar2 != -4) {
          uVar3 = 0;
          do {
            if (*(char *)((long)&iStack_24 + uVar3 + uVar2) != '\0') goto LAB_00a9e404;
            uVar3 = uVar3 + 1;
          } while (uVar3 < -uVar2 + 4);
        }
        memcpy(__dest,&iStack_24,uVar2);
      }
      else {
        memset((int *)((long)__dest + 4),0,uVar2 - 4);
        *(int *)__dest = param_2;
      }
      *(undefined8 *)(param_1 + 0x20) = *(undefined8 *)(param_1 + 0x18);
      return 1;
    }
  }
  *(int *)__dest = param_2;
  return 1;
}

