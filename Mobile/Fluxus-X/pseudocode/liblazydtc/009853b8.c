/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009853b8
 */

/* std::__ndk1::enable_if<__is_forward_iterator<unsigned char*>::value&&is_constructible<unsigned
   char, std::__ndk1::iterator_traits<unsigned char*>::reference>::value,
   std::__ndk1::__wrap_iter<unsigned char*> >::type std::__ndk1::vector<unsigned char,
   std::__ndk1::allocator<unsigned char> >::insert<unsigned char*>(std::__ndk1::__wrap_iter<unsigned
   char const*>, unsigned char*, unsigned char*) */

undefined1 * __thiscall
std::__ndk1::vector<unsigned_char,std::__ndk1::allocator<unsigned_char>>::insert<unsigned_char*>
          (vector<unsigned_char,std::__ndk1::allocator<unsigned_char>> *this,undefined1 *param_2,
          undefined1 *param_3,undefined1 *param_4)

{
  undefined8 *puVar1;
  size_t sVar2;
  long lVar3;
  ulong uVar4;
  undefined1 *puVar5;
  undefined1 *puVar6;
  ulong uVar7;
  undefined8 *puVar8;
  undefined8 *puVar9;
  undefined1 *puVar10;
  undefined1 *puVar11;
  void *__src;
  long lVar12;
  void *pvVar13;
  ulong uVar14;
  size_t __n;
  undefined8 uVar15;
  undefined8 uVar16;
  undefined8 uVar17;
  
  uVar14 = (long)param_4 - (long)param_3;
  if ((long)uVar14 < 1) {
    return param_2;
  }
  puVar11 = *(undefined1 **)(this + 8);
  if ((long)uVar14 <= *(long *)(this + 0x10) - (long)puVar11) {
    lVar12 = (long)puVar11 - (long)param_2;
    puVar5 = puVar11;
    if (lVar12 < (long)uVar14) {
      puVar6 = param_3 + lVar12;
      sVar2 = (long)param_4 - (long)puVar6;
      if (0 < (long)sVar2) {
        memcpy(puVar11,puVar6,sVar2);
        lVar3 = *(long *)(this + 8);
        *(undefined1 **)(this + 8) = (undefined1 *)(lVar3 + sVar2);
        puVar5 = (undefined1 *)(lVar3 + sVar2);
      }
      param_4 = puVar6;
      if (lVar12 < 1) {
        return param_2;
      }
    }
    puVar6 = param_2 + uVar14;
    sVar2 = (long)puVar5 - (long)puVar6;
    if (puVar5 + -uVar14 < puVar11) {
      puVar11 = puVar11 + (long)(puVar6 + (-(long)param_2 - (long)puVar5));
      puVar10 = puVar5 + (long)param_2 + -(long)puVar6;
      puVar6 = puVar5;
      do {
        puVar11 = puVar11 + -1;
        *puVar6 = *puVar10;
        puVar6 = (undefined1 *)(*(long *)(this + 8) + 1);
        *(undefined1 **)(this + 8) = puVar6;
        puVar10 = puVar10 + 1;
      } while (puVar11 != (undefined1 *)0x0);
    }
    if (sVar2 != 0) {
      memmove(puVar5 + -sVar2,param_2,sVar2);
    }
    if ((long)param_4 - (long)param_3 == 0) {
      return param_2;
    }
    memmove(param_2,param_3,(long)param_4 - (long)param_3);
    return param_2;
  }
  __src = *(void **)this;
  puVar11 = puVar11 + (uVar14 - (long)__src);
  if ((long)puVar11 < 0) {
                    /* WARNING: Subroutine does not return */
    __vector_base_common<true>::__throw_length_error();
  }
  uVar4 = *(long *)(this + 0x10) - (long)__src;
  if (uVar4 < 0x3fffffffffffffff) {
    puVar5 = (undefined1 *)(uVar4 * 2);
    if (puVar11 <= puVar5) {
      puVar11 = puVar5;
    }
    if (puVar11 != (undefined1 *)0x0) goto LAB_009854fc;
    pvVar13 = (void *)0x0;
  }
  else {
    puVar11 = (undefined1 *)0x7fffffffffffffff;
LAB_009854fc:
    pvVar13 = operator_new((ulong)puVar11);
  }
  puVar5 = (undefined1 *)((long)pvVar13 + ((long)param_2 - (long)__src));
  if (param_3 == param_4) {
    puVar6 = puVar5;
    goto LAB_009855bc;
  }
  lVar12 = -(long)__src - (long)param_3;
  puVar6 = puVar5;
  if (uVar14 < 0x20) {
LAB_009855a4:
    do {
      puVar10 = param_3 + 1;
      *puVar6 = *param_3;
      puVar6 = puVar6 + 1;
      param_3 = puVar10;
    } while (param_4 != puVar10);
  }
  else {
    if ((puVar5 < param_4) &&
       (param_3 < (undefined1 *)((long)pvVar13 + (long)(param_4 + (long)(param_2 + lVar12)))))
    goto LAB_009855a4;
    uVar7 = uVar14 & 0xffffffffffffffe0;
    puVar8 = (undefined8 *)(param_3 + 0x10);
    puVar6 = puVar5 + uVar7;
    param_3 = param_3 + uVar7;
    puVar9 = (undefined8 *)((long)pvVar13 + (long)(param_2 + (0x10 - (long)__src)));
    uVar4 = uVar7;
    do {
      puVar1 = puVar8 + -1;
      uVar15 = puVar8[-2];
      uVar17 = puVar8[1];
      uVar16 = *puVar8;
      puVar8 = puVar8 + 4;
      uVar4 = uVar4 - 0x20;
      puVar9[-1] = *puVar1;
      puVar9[-2] = uVar15;
      puVar9[1] = uVar17;
      *puVar9 = uVar16;
      puVar9 = puVar9 + 4;
    } while (uVar4 != 0);
    if (uVar14 != uVar7) goto LAB_009855a4;
  }
  __src = *(void **)this;
  puVar6 = (undefined1 *)((long)pvVar13 + (long)(param_4 + (long)(param_2 + lVar12)));
LAB_009855bc:
  sVar2 = (long)param_2 - (long)__src;
  if (0 < (long)sVar2) {
    memcpy(puVar5 + -sVar2,__src,sVar2);
  }
  __n = *(long *)(this + 8) - (long)param_2;
  if (0 < (long)__n) {
    memcpy(puVar6,param_2,__n);
    puVar6 = puVar6 + __n;
  }
  *(undefined1 **)this = puVar5 + -sVar2;
  *(undefined1 **)(this + 8) = puVar6;
  *(undefined1 **)(this + 0x10) = (undefined1 *)((long)pvVar13 + (long)puVar11);
  if (__src != (void *)0x0) {
    operator_delete(__src);
  }
  return puVar5;
}

