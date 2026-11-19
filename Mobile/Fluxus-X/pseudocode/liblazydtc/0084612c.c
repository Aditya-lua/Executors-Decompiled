/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0084612c
 */

void FUN_0084612c(long param_1,undefined1 param_2,undefined8 param_3,undefined1 param_4,
                 undefined1 param_5,undefined1 param_6)

{
  ulong uVar1;
  ulong uVar2;
  char *pcVar3;
  bool bVar4;
  undefined1 uVar5;
  void *__dest;
  undefined8 *puVar6;
  locale *plVar7;
  void *__src;
  ulong uVar8;
  size_t __n;
  long lVar9;
  undefined1 *puVar10;
  undefined8 uVar11;
  undefined8 uVar12;
  undefined1 auVar13 [16];
  locale alStack_c8 [8];
  byte bStack_c0;
  undefined7 uStack_bf;
  ulong uStack_b8;
  char *pcStack_b0;
  long lStack_a8;
  undefined1 *puStack_a0;
  code *pcStack_98;
  undefined1 *puStack_90;
  undefined1 auStack_88 [8];
  
  if (*(char *)(param_1 + 0xa5) == '\x01') {
    uVar5 = (**(code **)(**(long **)(param_1 + 0x18) + 0x28))();
    puStack_90 = *(undefined1 **)(param_1 + 0x30);
    if (puStack_90 < *(undefined1 **)(param_1 + 0x38)) {
      puVar10 = puStack_90 + 1;
      *puStack_90 = uVar5;
      goto LAB_00846278;
    }
    __src = *(void **)(param_1 + 0x28);
    __n = (long)puStack_90 - (long)__src;
    uVar1 = __n + 1;
    if ((long)uVar1 < 0) {
LAB_00846294:
      auVar13 = FUN_00815830();
      plVar7 = auVar13._8_8_;
      puVar6 = auVar13._0_8_;
      pcStack_98 = FUN_00846298;
      lVar9 = tpidr_el0;
      lStack_a8 = *(long *)(lVar9 + 0x28);
      *puVar6 = &PTR_FUN_00c48ec0;
      puVar6[1] = param_3;
      puStack_a0 = auStack_88 + 0x38;
      std::__ndk1::locale::locale((locale *)(puVar6 + 2),plVar7);
      uVar12 = *(undefined8 *)(plVar7 + 0x10);
      uVar11 = *(undefined8 *)(plVar7 + 8);
      puVar6[0xc] = 0;
      puVar6[0xb] = 0;
      puVar6[4] = uVar12;
      puVar6[3] = uVar11;
      puVar6[8] = 0;
      puVar6[7] = 0;
      puVar6[10] = 0;
      puVar6[9] = 0;
      puVar6[6] = 0;
      puVar6[5] = 0;
      puVar6[0xe] = 0;
      puVar6[0xd] = 0;
      puVar6[0x10] = 0;
      puVar6[0xf] = 0;
      puVar6[0x12] = 0;
      puVar6[0x11] = 0;
      *(undefined8 *)((long)puVar6 + 0x9c) = 0;
      *(undefined8 *)((long)puVar6 + 0x94) = 0;
      *(undefined1 *)((long)puVar6 + 0xa4) = param_4;
      *(undefined1 *)((long)puVar6 + 0xa5) = param_5;
      *(undefined1 *)((long)puVar6 + 0xa6) = param_6;
      std::__ndk1::locale::locale(alStack_c8,(locale *)(puVar6 + 2));
      std::__ndk1::locale::name();
      uVar1 = (ulong)(bStack_c0 >> 1);
      if ((bStack_c0 & 1) != 0) {
        uVar1 = uStack_b8;
      }
      if (uVar1 == 1) {
        pcVar3 = pcStack_b0;
        if ((bStack_c0 & 1) == 0) {
          pcVar3 = (char *)&uStack_bf;
        }
        bVar4 = *pcVar3 != 'C';
      }
      else {
        bVar4 = true;
      }
      if ((bStack_c0 & 1) != 0) {
        operator_delete(pcStack_b0,CONCAT71(uStack_bf,bStack_c0) & 0xfffffffffffffffe);
      }
      std::__ndk1::locale::~locale(alStack_c8);
      *(bool *)((long)puVar6 + 0xa7) = bVar4;
      if (*(long *)(lVar9 + 0x28) != lStack_a8) {
                    /* WARNING: Subroutine does not return */
        __stack_chk_fail();
      }
      return;
    }
    uVar8 = (long)*(undefined1 **)(param_1 + 0x38) - (long)__src;
    uVar2 = uVar8 * 2;
    if (uVar8 * 2 <= uVar1) {
      uVar2 = uVar1;
    }
    if (0x3ffffffffffffffe < uVar8) {
      uVar2 = 0x7fffffffffffffff;
    }
    if (uVar2 == 0) {
      __dest = (void *)0x0;
    }
    else {
      __dest = operator_new(uVar2);
    }
    puVar10 = (undefined1 *)((long)__dest + __n);
    lVar9 = (long)__dest + uVar2;
    *puVar10 = uVar5;
  }
  else {
    puStack_90 = *(undefined1 **)(param_1 + 0x30);
    if (puStack_90 < *(undefined1 **)(param_1 + 0x38)) {
      puVar10 = puStack_90 + 1;
      *puStack_90 = param_2;
      goto LAB_00846278;
    }
    __src = *(void **)(param_1 + 0x28);
    __n = (long)puStack_90 - (long)__src;
    uVar1 = __n + 1;
    if ((long)uVar1 < 0) goto LAB_00846294;
    uVar8 = (long)*(undefined1 **)(param_1 + 0x38) - (long)__src;
    uVar2 = uVar8 * 2;
    if (uVar8 * 2 <= uVar1) {
      uVar2 = uVar1;
    }
    if (0x3ffffffffffffffe < uVar8) {
      uVar2 = 0x7fffffffffffffff;
    }
    if (uVar2 == 0) {
      __dest = (void *)0x0;
    }
    else {
      __dest = operator_new(uVar2);
    }
    puVar10 = (undefined1 *)((long)__dest + __n);
    lVar9 = (long)__dest + uVar2;
    *puVar10 = param_2;
  }
  puVar10 = puVar10 + 1;
  memcpy(__dest,__src,__n);
  *(void **)(param_1 + 0x28) = __dest;
  *(undefined1 **)(param_1 + 0x30) = puVar10;
  *(long *)(param_1 + 0x38) = lVar9;
  if (__src != (void *)0x0) {
    operator_delete(__src,uVar8);
  }
LAB_00846278:
  *(undefined1 **)(param_1 + 0x30) = puVar10;
  return;
}

