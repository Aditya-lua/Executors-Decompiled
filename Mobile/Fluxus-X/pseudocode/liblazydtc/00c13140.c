/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c13140
 */

undefined1  [16] FUN_00c13140(long param_1,ulong param_2)

{
  void *__src;
  void *pvVar1;
  undefined8 *puVar2;
  long lVar3;
  size_t __n;
  undefined8 *puVar4;
  long lVar5;
  ulong uVar6;
  ulong uVar7;
  undefined1 auVar8 [16];
  
  lVar5 = *(long *)(param_1 + 0x10);
  pvVar1 = *(void **)(param_1 + 0x18);
  uVar6 = (long)pvVar1 - lVar5 >> 3;
  if (uVar6 < param_2) {
                    /* WARNING: Subroutine does not return */
    FUN_00c0de94("%s:%d: %s","out/llvm-project/libcxxabi/src/demangle/ItaniumDemangle.h",0xb18,
                 &DAT_002ab32c);
  }
  __src = (void *)(lVar5 + param_2 * 8);
  puVar4 = *(undefined8 **)(param_1 + 0x1330);
  __n = (long)pvVar1 - (long)__src;
  lVar3 = puVar4[1];
  uVar7 = (ulong)((int)__n + 0xf) & 0xfffffff0;
  puVar2 = puVar4;
  if (0xfef < lVar3 + uVar7) {
    if (0xff0 < uVar7) {
      puVar2 = malloc(uVar7 + 0x10);
      if (puVar2 == (undefined8 *)0x0) {
LAB_00c13298:
                    /* WARNING: Subroutine does not return */
        std::terminate();
      }
      *puVar2 = *puVar4;
      puVar2[1] = 0;
      *puVar4 = puVar2;
      puVar2 = puVar2 + 2;
      goto joined_r0x00c13200;
    }
    puVar2 = malloc(0x1000);
    if (puVar2 == (undefined8 *)0x0) goto LAB_00c13298;
    lVar3 = 0;
    *puVar2 = puVar4;
    puVar2[1] = 0;
    *(undefined8 **)(param_1 + 0x1330) = puVar2;
  }
  puVar2[1] = lVar3 + uVar7;
  puVar2 = (undefined8 *)((long)puVar2 + lVar3 + 0x10);
joined_r0x00c13200:
  if (pvVar1 != __src) {
    memmove(puVar2,__src,__n);
    lVar5 = *(long *)(param_1 + 0x10);
    uVar6 = *(long *)(param_1 + 0x18) - lVar5 >> 3;
  }
  if (uVar6 < param_2) {
                    /* WARNING: Subroutine does not return */
    FUN_00c0de94("%s:%d: %s","out/llvm-project/libcxxabi/src/demangle/ItaniumDemangle.h",0x86,
                 "shrinkToSize() can\'t expand!");
  }
  auVar8._8_8_ = (long)__n >> 3;
  *(ulong *)(param_1 + 0x18) = lVar5 + param_2 * 8;
  auVar8._0_8_ = puVar2;
  return auVar8;
}

