/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0099ab24
 */

/* std::__ndk1::enable_if<__is_forward_iterator<std::__ndk1::__wrap_iter<unsigned char const*>
   >::value&&is_constructible<unsigned char,
   std::__ndk1::iterator_traits<std::__ndk1::__wrap_iter<unsigned char const*> >::reference>::value,
   std::__ndk1::__wrap_iter<unsigned char*> >::type std::__ndk1::vector<unsigned char,
   std::__ndk1::allocator<unsigned char> >::insert<std::__ndk1::__wrap_iter<unsigned char const*>
   >(std::__ndk1::__wrap_iter<unsigned char const*>, std::__ndk1::__wrap_iter<unsigned char const*>,
   std::__ndk1::__wrap_iter<unsigned char const*>) */

undefined1 * __thiscall
std::__ndk1::vector<unsigned_char,std::__ndk1::allocator<unsigned_char>>::
insert<std::__ndk1::__wrap_iter<unsigned_char_const*>>
          (vector<unsigned_char,std::__ndk1::allocator<unsigned_char>> *this,undefined1 *param_2,
          undefined1 *param_3,undefined1 *param_4)

{
  undefined8 *puVar1;
  size_t sVar2;
  ulong uVar3;
  undefined1 *puVar4;
  undefined1 *puVar5;
  long lVar6;
  undefined1 *puVar8;
  undefined1 *puVar7;
  ulong uVar9;
  undefined8 *puVar10;
  undefined8 *puVar11;
  undefined1 *puVar12;
  void *__src;
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
  puVar12 = *(undefined1 **)(this + 8);
  if ((long)uVar14 <= *(long *)(this + 0x10) - (long)puVar12) {
    lVar6 = (long)puVar12 - (long)param_2;
    puVar4 = puVar12;
    if (lVar6 < (long)uVar14) {
      puVar5 = param_3 + lVar6;
      if (puVar5 != param_4) {
        puVar8 = puVar5;
        do {
          puVar7 = puVar8 + 1;
          *puVar4 = *puVar8;
          puVar4 = (undefined1 *)(*(long *)(this + 8) + 1);
          *(undefined1 **)(this + 8) = puVar4;
          puVar8 = puVar7;
        } while (param_4 != puVar7);
      }
      param_4 = puVar5;
      if (lVar6 < 1) {
        return param_2;
      }
    }
    puVar5 = param_2 + uVar14;
    sVar2 = (long)puVar4 - (long)puVar5;
    if (puVar4 + -uVar14 < puVar12) {
      puVar12 = puVar12 + (long)(puVar5 + (-(long)param_2 - (long)puVar4));
      puVar8 = puVar4 + (long)param_2 + -(long)puVar5;
      puVar5 = puVar4;
      do {
        puVar12 = puVar12 + -1;
        *puVar5 = *puVar8;
        puVar5 = (undefined1 *)(*(long *)(this + 8) + 1);
        *(undefined1 **)(this + 8) = puVar5;
        puVar8 = puVar8 + 1;
      } while (puVar12 != (undefined1 *)0x0);
    }
    if (sVar2 != 0) {
      memmove(puVar4 + -sVar2,param_2,sVar2);
    }
    uVar14 = (long)param_4 - (long)param_3;
    if (uVar14 == 0) {
      return param_2;
    }
    puVar12 = param_2;
    if ((0x1f < uVar14) &&
       ((param_4 <= param_2 || (param_4 + ((long)param_2 - (long)param_3) <= param_3)))) {
      uVar9 = uVar14 & 0xffffffffffffffe0;
      puVar10 = (undefined8 *)(param_3 + 0x10);
      puVar11 = (undefined8 *)(param_2 + 0x10);
      uVar3 = uVar9;
      do {
        puVar1 = puVar10 + -1;
        uVar15 = puVar10[-2];
        uVar17 = puVar10[1];
        uVar16 = *puVar10;
        puVar10 = puVar10 + 4;
        uVar3 = uVar3 - 0x20;
        puVar11[-1] = *puVar1;
        puVar11[-2] = uVar15;
        puVar11[1] = uVar17;
        *puVar11 = uVar16;
        puVar11 = puVar11 + 4;
      } while (uVar3 != 0);
      puVar12 = param_2 + uVar9;
      param_3 = param_3 + uVar9;
      if (uVar9 == uVar14) {
        return param_2;
      }
    }
    do {
      puVar4 = param_3 + 1;
      *puVar12 = *param_3;
      puVar12 = puVar12 + 1;
      param_3 = puVar4;
    } while (param_4 != puVar4);
    return param_2;
  }
  __src = *(void **)this;
  puVar12 = puVar12 + (uVar14 - (long)__src);
  if ((long)puVar12 < 0) {
                    /* WARNING: Subroutine does not return */
    __vector_base_common<true>::__throw_length_error();
  }
  uVar3 = *(long *)(this + 0x10) - (long)__src;
  if (uVar3 < 0x3fffffffffffffff) {
    puVar4 = (undefined1 *)(uVar3 * 2);
    if (puVar12 <= puVar4) {
      puVar12 = puVar4;
    }
    if (puVar12 != (undefined1 *)0x0) goto LAB_0099acdc;
    pvVar13 = (void *)0x0;
  }
  else {
    puVar12 = (undefined1 *)0x7fffffffffffffff;
LAB_0099acdc:
    pvVar13 = operator_new((ulong)puVar12);
  }
  puVar4 = (undefined1 *)((long)pvVar13 + ((long)param_2 - (long)__src));
  if (param_3 == param_4) {
    puVar5 = puVar4;
    goto LAB_0099ad8c;
  }
  lVar6 = -(long)__src;
  puVar5 = puVar4;
  puVar8 = param_3;
  if ((uVar14 < 0x20) ||
     ((puVar4 < param_4 &&
      (param_3 < (undefined1 *)
                 ((long)pvVar13 + (long)(param_4 + (long)(param_2 + (lVar6 - (long)param_3)))))))) {
LAB_0099ad6c:
    do {
      puVar7 = puVar8 + 1;
      *puVar5 = *puVar8;
      puVar5 = puVar5 + 1;
      puVar8 = puVar7;
    } while (param_4 != puVar7);
  }
  else {
    uVar9 = uVar14 & 0xffffffffffffffe0;
    puVar10 = (undefined8 *)(param_3 + 0x10);
    puVar11 = (undefined8 *)((long)pvVar13 + (long)(param_2 + (0x10 - (long)__src)));
    uVar3 = uVar9;
    do {
      puVar1 = puVar10 + -1;
      uVar15 = puVar10[-2];
      uVar17 = puVar10[1];
      uVar16 = *puVar10;
      puVar10 = puVar10 + 4;
      uVar3 = uVar3 - 0x20;
      puVar11[-1] = *puVar1;
      puVar11[-2] = uVar15;
      puVar11[1] = uVar17;
      *puVar11 = uVar16;
      puVar11 = puVar11 + 4;
    } while (uVar3 != 0);
    puVar5 = puVar4 + uVar9;
    puVar8 = param_3 + uVar9;
    if (uVar9 != uVar14) goto LAB_0099ad6c;
  }
  __src = *(void **)this;
  puVar5 = (undefined1 *)
           ((long)pvVar13 + (long)(param_4 + (long)(param_2 + (lVar6 - (long)param_3))));
LAB_0099ad8c:
  sVar2 = (long)param_2 - (long)__src;
  if (0 < (long)sVar2) {
    memcpy(puVar4 + -sVar2,__src,sVar2);
  }
  __n = *(long *)(this + 8) - (long)param_2;
  if (0 < (long)__n) {
    memcpy(puVar5,param_2,__n);
    puVar5 = puVar5 + __n;
  }
  *(undefined1 **)this = puVar4 + -sVar2;
  *(undefined1 **)(this + 8) = puVar5;
  *(undefined1 **)(this + 0x10) = (undefined1 *)((long)pvVar13 + (long)puVar12);
  if (__src == (void *)0x0) {
    return puVar4;
  }
  operator_delete(__src);
  return puVar4;
}

