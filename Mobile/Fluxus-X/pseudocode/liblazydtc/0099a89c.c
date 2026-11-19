/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0099a89c
 */

/* std::__ndk1::vector<unsigned char, std::__ndk1::allocator<unsigned char> >::assign(unsigned long,
   unsigned char const&) */

void __thiscall
std::__ndk1::vector<unsigned_char,std::__ndk1::allocator<unsigned_char>>::assign
          (vector<unsigned_char,std::__ndk1::allocator<unsigned_char>> *this,ulong param_1,
          uchar *param_2)

{
  uchar uVar1;
  uchar *puVar2;
  ulong uVar3;
  long lVar4;
  uchar *puVar5;
  ulong uVar6;
  ulong uVar7;
  ulong uVar8;
  ulong uVar9;
  
  uVar3 = *(ulong *)(this + 0x10);
  puVar2 = *(uchar **)this;
  if (uVar3 - (long)puVar2 < param_1) {
    if (puVar2 != (uchar *)0x0) {
      *(uchar **)(this + 8) = puVar2;
      operator_delete(puVar2);
      uVar3 = 0;
      *(undefined8 *)this = 0;
      *(undefined8 *)(this + 8) = 0;
      *(undefined8 *)(this + 0x10) = 0;
    }
    if ((long)param_1 < 0) {
                    /* WARNING: Subroutine does not return */
      __vector_base_common<true>::__throw_length_error();
    }
    if (uVar3 < 0x3fffffffffffffff) {
      uVar9 = param_1;
      if (param_1 <= uVar3 << 1) {
        uVar9 = uVar3 << 1;
      }
    }
    else {
      uVar9 = 0x7fffffffffffffff;
    }
    puVar2 = operator_new(uVar9);
    *(uchar **)this = puVar2;
    *(uchar **)(this + 8) = puVar2;
    *(uchar **)(this + 0x10) = puVar2 + uVar9;
    do {
      param_1 = param_1 - 1;
      *puVar2 = *param_2;
      puVar2 = (uchar *)(*(long *)(this + 8) + 1);
      *(uchar **)(this + 8) = puVar2;
    } while (param_1 != 0);
    return;
  }
  uVar9 = *(long *)(this + 8) - (long)puVar2;
  uVar3 = uVar9;
  if (param_1 <= uVar9) {
    uVar3 = param_1;
  }
  if (uVar3 != 0) {
    uVar7 = uVar3;
    puVar5 = puVar2;
    if ((0x1f < uVar3) && ((param_2 + 1 <= puVar2 || (puVar2 + uVar3 <= param_2)))) {
      uVar1 = *param_2;
      uVar6 = uVar3 & 0xffffffffffffffe0;
      puVar5 = puVar2 + uVar6;
      uVar7 = uVar3 - uVar6;
      puVar2 = puVar2 + 0x10;
      uVar8 = uVar6;
      do {
        *(ulong *)(puVar2 + -8) =
             CONCAT17(uVar1,CONCAT16(uVar1,CONCAT15(uVar1,CONCAT14(uVar1,CONCAT13(uVar1,CONCAT12(
                                                  uVar1,CONCAT11(uVar1,uVar1)))))));
        *(ulong *)(puVar2 + -0x10) =
             CONCAT17(uVar1,CONCAT16(uVar1,CONCAT15(uVar1,CONCAT14(uVar1,CONCAT13(uVar1,CONCAT12(
                                                  uVar1,CONCAT11(uVar1,uVar1)))))));
        *(ulong *)(puVar2 + 8) =
             CONCAT17(uVar1,CONCAT16(uVar1,CONCAT15(uVar1,CONCAT14(uVar1,CONCAT13(uVar1,CONCAT12(
                                                  uVar1,CONCAT11(uVar1,uVar1)))))));
        *(ulong *)puVar2 =
             CONCAT17(uVar1,CONCAT16(uVar1,CONCAT15(uVar1,CONCAT14(uVar1,CONCAT13(uVar1,CONCAT12(
                                                  uVar1,CONCAT11(uVar1,uVar1)))))));
        uVar8 = uVar8 - 0x20;
        puVar2 = puVar2 + 0x20;
      } while (uVar8 != 0);
      if (uVar3 == uVar6) goto LAB_0099a9c0;
    }
    do {
      uVar7 = uVar7 - 1;
      *puVar5 = *param_2;
      puVar5 = puVar5 + 1;
    } while (uVar7 != 0);
  }
LAB_0099a9c0:
  lVar4 = uVar9 - param_1;
  if (uVar9 < param_1) {
    puVar2 = *(uchar **)(this + 8);
    do {
      lVar4 = lVar4 + 1;
      *puVar2 = *param_2;
      puVar2 = (uchar *)(*(long *)(this + 8) + 1);
      *(uchar **)(this + 8) = puVar2;
    } while (lVar4 != 0);
  }
  else {
    *(ulong *)(this + 8) = *(long *)this + param_1;
  }
  return;
}

