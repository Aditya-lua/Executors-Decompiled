/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c229d4
 */

void FUN_00c229d4(long param_1,undefined8 *param_2)

{
  ulong uVar1;
  uint uVar2;
  void *pvVar3;
  size_t __size;
  long lVar4;
  size_t sVar5;
  char *__src;
  
  lVar4 = param_2[1];
  pvVar3 = (void *)*param_2;
  if ((ulong)param_2[2] < lVar4 + 5U) {
    sVar5 = param_2[2] * 2;
    if (sVar5 <= lVar4 + 0x3e5U) {
      sVar5 = lVar4 + 0x3e5U;
    }
    param_2[2] = sVar5;
    pvVar3 = realloc(pvVar3,sVar5);
    *param_2 = pvVar3;
    if (pvVar3 == (void *)0x0) {
                    /* WARNING: Subroutine does not return */
      abort();
    }
    lVar4 = param_2[1];
  }
  *(undefined1 *)((undefined4 *)((long)pvVar3 + lVar4) + 1) = 0x3a;
  *(undefined4 *)((long)pvVar3 + lVar4) = 0x3a647473;
  uVar2 = *(uint *)(param_1 + 0xc);
  lVar4 = param_2[1] + 5;
  param_2[1] = lVar4;
  if ((int)uVar2 < 3) {
    if (1 < uVar2 - 1) {
      __src = "allocator";
      sVar5 = 9;
      goto LAB_00c22af8;
    }
    __src = "basic_string";
    if (uVar2 < 2) {
      sVar5 = 0xc;
      goto LAB_00c22af8;
    }
    sVar5 = 6;
  }
  else {
    if (uVar2 == 3) {
      __src = "basic_istream";
    }
    else {
      if (uVar2 == 5) {
        __src = "basic_iostream";
        sVar5 = 8;
        goto LAB_00c22ad4;
      }
      __src = "basic_ostream";
    }
    sVar5 = 7;
  }
LAB_00c22ad4:
  if (*(int *)__src != 0x69736162 || (short)*(int *)((long)__src + 4) != 0x5f63) {
                    /* WARNING: Subroutine does not return */
    FUN_00c0de94("%s:%d: %s","out/llvm-project/libcxxabi/src/demangle/ItaniumDemangle.h",0x6be,
                 &DAT_002ab32c);
  }
  __src = (char *)((long)__src + 6);
LAB_00c22af8:
  pvVar3 = (void *)*param_2;
  if ((ulong)param_2[2] < lVar4 + sVar5) {
    __size = param_2[2] * 2;
    uVar1 = lVar4 + sVar5 + 0x3e0;
    if (__size <= uVar1) {
      __size = uVar1;
    }
    param_2[2] = __size;
    pvVar3 = realloc(pvVar3,__size);
    *param_2 = pvVar3;
    if (pvVar3 == (void *)0x0) {
                    /* WARNING: Subroutine does not return */
      abort();
    }
    lVar4 = param_2[1];
  }
  memcpy((void *)((long)pvVar3 + lVar4),__src,sVar5);
  param_2[1] = param_2[1] + sVar5;
  return;
}

