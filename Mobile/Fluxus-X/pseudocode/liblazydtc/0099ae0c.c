/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0099ae0c
 */

/* std::__ndk1::enable_if<__is_forward_iterator<ix::IXWebSocketSendData::IXWebSocketSendData_const_iterator<char>
   >::value&&is_constructible<unsigned char,
   std::__ndk1::iterator_traits<ix::IXWebSocketSendData::IXWebSocketSendData_const_iterator<char>
   >::reference>::value, std::__ndk1::__wrap_iter<unsigned char*> >::type
   std::__ndk1::vector<unsigned char, std::__ndk1::allocator<unsigned char>
   >::insert<ix::IXWebSocketSendData::IXWebSocketSendData_const_iterator<char>
   >(std::__ndk1::__wrap_iter<unsigned char const*>,
   ix::IXWebSocketSendData::IXWebSocketSendData_const_iterator<char>,
   ix::IXWebSocketSendData::IXWebSocketSendData_const_iterator<char>) */

undefined1 * __thiscall
std::__ndk1::vector<unsigned_char,std::__ndk1::allocator<unsigned_char>>::
insert<ix::IXWebSocketSendData::IXWebSocketSendData_const_iterator<char>>
          (vector<unsigned_char,std::__ndk1::allocator<unsigned_char>> *this,undefined1 *param_2,
          undefined8 *param_3,undefined8 *param_4)

{
  undefined8 *puVar1;
  size_t sVar2;
  undefined8 *puVar3;
  ulong uVar4;
  undefined1 *puVar5;
  undefined1 *puVar6;
  undefined1 *puVar8;
  undefined1 *puVar7;
  long lVar9;
  ulong uVar10;
  undefined8 *puVar11;
  undefined1 *puVar12;
  void *__src;
  void *pvVar13;
  undefined1 *puVar14;
  undefined1 *puVar15;
  ulong uVar16;
  size_t __n;
  undefined8 uVar17;
  undefined8 uVar18;
  undefined8 uVar19;
  
  puVar14 = (undefined1 *)*param_3;
  puVar15 = (undefined1 *)*param_4;
  uVar16 = (long)puVar15 - (long)puVar14;
  uVar4 = 0;
  if (puVar14 != puVar15) {
    uVar4 = uVar16;
  }
  if ((long)uVar4 < 1) {
    return param_2;
  }
  puVar12 = *(undefined1 **)(this + 8);
  if ((long)uVar4 <= *(long *)(this + 0x10) - (long)puVar12) {
    uVar16 = (long)puVar12 - (long)param_2;
    puVar5 = puVar12;
    if ((long)uVar16 < (long)uVar4) {
      puVar6 = puVar14;
      if (0 < (long)uVar16) {
        uVar10 = 0xfffffffffffffffe;
        if (-2 < (long)~uVar16) {
          uVar10 = ~uVar16;
        }
        puVar14 = puVar14 + uVar16 + uVar10 + 2;
        puVar6 = puVar14;
      }
      for (; puVar14 != puVar15; puVar14 = puVar14 + 1) {
        *puVar5 = *puVar14;
        lVar9 = *(long *)(this + 8);
        *(undefined1 **)(this + 8) = (undefined1 *)(lVar9 + 1U);
        puVar5 = (undefined1 *)(lVar9 + 1U);
      }
      puVar15 = puVar6;
      if ((long)uVar16 < 1) {
        return param_2;
      }
    }
    puVar14 = param_2 + uVar4;
    sVar2 = (long)puVar5 - (long)puVar14;
    if (puVar5 + -uVar4 < puVar12) {
      puVar12 = puVar12 + (long)(puVar14 + (-(long)param_2 - (long)puVar5));
      puVar6 = puVar5 + (long)param_2 + -(long)puVar14;
      puVar14 = puVar5;
      do {
        puVar12 = puVar12 + -1;
        *puVar14 = *puVar6;
        puVar14 = (undefined1 *)(*(long *)(this + 8) + 1);
        *(undefined1 **)(this + 8) = puVar14;
        puVar6 = puVar6 + 1;
      } while (puVar12 != (undefined1 *)0x0);
    }
    if (sVar2 != 0) {
      memmove(puVar5 + -sVar2,param_2,sVar2);
    }
    puVar14 = (undefined1 *)*param_3;
    if (puVar14 == puVar15) {
      return param_2;
    }
    uVar4 = (long)puVar15 - (long)puVar14;
    puVar12 = param_2;
    if (uVar4 < 0x20) {
      puVar5 = puVar14;
    }
    else if ((puVar15 <= param_2) ||
            (puVar5 = puVar14, puVar15 + ((long)param_2 - (long)puVar14) <= puVar14)) {
      uVar10 = uVar4 & 0xffffffffffffffe0;
      puVar11 = (undefined8 *)(param_2 + 0x10);
      puVar5 = puVar14 + uVar10;
      puVar12 = param_2 + uVar10;
      puVar3 = (undefined8 *)(puVar14 + 0x10);
      uVar16 = uVar10;
      do {
        puVar1 = puVar3 + -1;
        uVar17 = puVar3[-2];
        uVar19 = puVar3[1];
        uVar18 = *puVar3;
        uVar16 = uVar16 - 0x20;
        puVar3 = puVar3 + 4;
        puVar11[-1] = *puVar1;
        puVar11[-2] = uVar17;
        puVar11[1] = uVar19;
        *puVar11 = uVar18;
        puVar11 = puVar11 + 4;
      } while (uVar16 != 0);
      if (uVar4 == uVar10) {
        return param_2;
      }
    }
    do {
      puVar14 = puVar5 + 1;
      *puVar12 = *puVar5;
      puVar5 = puVar14;
      puVar12 = puVar12 + 1;
    } while (puVar15 != puVar14);
    return param_2;
  }
  __src = *(void **)this;
  puVar12 = puVar12 + (uVar4 - (long)__src);
  if ((long)puVar12 < 0) {
                    /* WARNING: Subroutine does not return */
    __vector_base_common<true>::__throw_length_error();
  }
  uVar4 = *(long *)(this + 0x10) - (long)__src;
  if (uVar4 < 0x3fffffffffffffff) {
    puVar5 = (undefined1 *)(uVar4 * 2);
    if (puVar12 <= puVar5) {
      puVar12 = puVar5;
    }
    if (puVar12 != (undefined1 *)0x0) goto LAB_0099aee4;
    pvVar13 = (void *)0x0;
  }
  else {
    puVar12 = (undefined1 *)0x7fffffffffffffff;
LAB_0099aee4:
    pvVar13 = operator_new((ulong)puVar12);
  }
  puVar5 = (undefined1 *)((long)pvVar13 + ((long)param_2 - (long)__src));
  if (puVar14 == puVar15) {
    puVar14 = puVar5;
    goto LAB_0099af94;
  }
  lVar9 = -(long)__src;
  puVar6 = puVar5;
  puVar8 = puVar14;
  if ((uVar16 < 0x20) ||
     ((puVar5 < puVar15 &&
      (puVar14 < (undefined1 *)
                 ((long)pvVar13 + (long)(puVar15 + (long)(param_2 + (lVar9 - (long)puVar14)))))))) {
LAB_0099af74:
    do {
      puVar7 = puVar8 + 1;
      *puVar6 = *puVar8;
      puVar6 = puVar6 + 1;
      puVar8 = puVar7;
    } while (puVar15 != puVar7);
  }
  else {
    uVar10 = uVar16 & 0xffffffffffffffe0;
    puVar11 = (undefined8 *)(puVar14 + 0x10);
    puVar3 = (undefined8 *)((long)pvVar13 + (long)(param_2 + (0x10 - (long)__src)));
    uVar4 = uVar10;
    do {
      puVar1 = puVar11 + -1;
      uVar17 = puVar11[-2];
      uVar19 = puVar11[1];
      uVar18 = *puVar11;
      puVar11 = puVar11 + 4;
      uVar4 = uVar4 - 0x20;
      puVar3[-1] = *puVar1;
      puVar3[-2] = uVar17;
      puVar3[1] = uVar19;
      *puVar3 = uVar18;
      puVar3 = puVar3 + 4;
    } while (uVar4 != 0);
    puVar6 = puVar5 + uVar10;
    puVar8 = puVar14 + uVar10;
    if (uVar10 != uVar16) goto LAB_0099af74;
  }
  __src = *(void **)this;
  puVar14 = (undefined1 *)
            ((long)pvVar13 + (long)(puVar15 + (long)(param_2 + (lVar9 - (long)puVar14))));
LAB_0099af94:
  sVar2 = (long)param_2 - (long)__src;
  if (0 < (long)sVar2) {
    memcpy(puVar5 + -sVar2,__src,sVar2);
  }
  __n = *(long *)(this + 8) - (long)param_2;
  if (0 < (long)__n) {
    memcpy(puVar14,param_2,__n);
    puVar14 = puVar14 + __n;
  }
  *(undefined1 **)this = puVar5 + -sVar2;
  *(undefined1 **)(this + 8) = puVar14;
  *(undefined1 **)(this + 0x10) = (undefined1 *)((long)pvVar13 + (long)puVar12);
  if (__src == (void *)0x0) {
    return puVar5;
  }
  operator_delete(__src);
  return puVar5;
}

