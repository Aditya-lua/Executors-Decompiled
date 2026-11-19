/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008e9c98
 */

/* std::__ndk1::basic_stringbuf<char, std::__ndk1::char_traits<char>, std::__ndk1::allocator<char>
   >::str() const */

void std::__ndk1::basic_stringbuf<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>
     ::str(void)

{
  undefined8 *puVar1;
  long in_x0;
  ulong *in_x8;
  undefined1 *puVar2;
  ulong uVar3;
  undefined8 *puVar4;
  undefined8 *puVar5;
  undefined1 *puVar6;
  ulong uVar7;
  undefined1 *puVar8;
  ulong uVar9;
  undefined1 *puVar10;
  undefined1 *puVar11;
  undefined8 uVar12;
  undefined8 uVar13;
  undefined8 uVar14;
  
  if ((*(uint *)(in_x0 + 0x60) >> 4 & 1) == 0) {
    if ((*(uint *)(in_x0 + 0x60) >> 3 & 1) == 0) {
      *in_x8 = 0;
      in_x8[1] = 0;
      in_x8[2] = 0;
      return;
    }
    puVar10 = *(undefined1 **)(in_x0 + 0x10);
    puVar8 = *(undefined1 **)(in_x0 + 0x20);
    *in_x8 = 0;
    in_x8[1] = 0;
    in_x8[2] = 0;
    uVar9 = (long)puVar8 - (long)puVar10;
    if (0xffffffffffffffef < uVar9) {
LAB_008e9ea4:
                    /* WARNING: Subroutine does not return */
      __basic_string_common<true>::__throw_length_error();
    }
    if (uVar9 < 0x17) {
      puVar6 = (undefined1 *)((long)in_x8 + 1);
      *(char *)in_x8 = (char)((int)uVar9 << 1);
    }
    else {
      uVar7 = uVar9 + 0x10 & 0xfffffffffffffff0;
      puVar6 = operator_new(uVar7);
      in_x8[1] = uVar9;
      in_x8[2] = (ulong)puVar6;
      *in_x8 = uVar7 | 1;
    }
    if (puVar10 == puVar8) goto LAB_008e9e8c;
    puVar2 = puVar6;
    if (uVar9 < 0x20) {
      puVar11 = puVar10;
    }
    else if ((puVar8 <= puVar6) || (puVar11 = puVar10, puVar6 + uVar9 <= puVar10)) {
      uVar3 = uVar9 & 0xffffffffffffffe0;
      puVar4 = (undefined8 *)(puVar6 + 0x10);
      puVar11 = puVar10 + uVar3;
      puVar2 = puVar6 + uVar3;
      puVar5 = (undefined8 *)(puVar10 + 0x10);
      uVar7 = uVar3;
      do {
        puVar1 = puVar5 + -1;
        uVar12 = puVar5[-2];
        uVar14 = puVar5[1];
        uVar13 = *puVar5;
        uVar7 = uVar7 - 0x20;
        puVar5 = puVar5 + 4;
        puVar4[-1] = *puVar1;
        puVar4[-2] = uVar12;
        puVar4[1] = uVar14;
        *puVar4 = uVar13;
        puVar4 = puVar4 + 4;
      } while (uVar7 != 0);
      if (uVar9 == uVar3) goto LAB_008e9e88;
    }
    do {
      puVar10 = puVar11 + 1;
      *puVar2 = *puVar11;
      puVar2 = puVar2 + 1;
      puVar11 = puVar10;
    } while (puVar8 != puVar10);
  }
  else {
    puVar10 = *(undefined1 **)(in_x0 + 0x30);
    puVar8 = *(undefined1 **)(in_x0 + 0x58);
    if (*(undefined1 **)(in_x0 + 0x58) < puVar10) {
      *(undefined1 **)(in_x0 + 0x58) = puVar10;
      puVar8 = puVar10;
    }
    puVar10 = *(undefined1 **)(in_x0 + 0x28);
    *in_x8 = 0;
    in_x8[1] = 0;
    in_x8[2] = 0;
    uVar9 = (long)puVar8 - (long)puVar10;
    if (0xffffffffffffffef < uVar9) goto LAB_008e9ea4;
    if (uVar9 < 0x17) {
      puVar6 = (undefined1 *)((long)in_x8 + 1);
      *(char *)in_x8 = (char)((int)uVar9 << 1);
    }
    else {
      uVar7 = uVar9 + 0x10 & 0xfffffffffffffff0;
      puVar6 = operator_new(uVar7);
      in_x8[1] = uVar9;
      in_x8[2] = (ulong)puVar6;
      *in_x8 = uVar7 | 1;
    }
    if (puVar10 == puVar8) goto LAB_008e9e8c;
    puVar2 = puVar6;
    if (uVar9 < 0x20) {
      puVar11 = puVar10;
    }
    else if ((puVar8 <= puVar6) || (puVar11 = puVar10, puVar6 + uVar9 <= puVar10)) {
      uVar3 = uVar9 & 0xffffffffffffffe0;
      puVar4 = (undefined8 *)(puVar6 + 0x10);
      puVar11 = puVar10 + uVar3;
      puVar2 = puVar6 + uVar3;
      puVar5 = (undefined8 *)(puVar10 + 0x10);
      uVar7 = uVar3;
      do {
        puVar1 = puVar5 + -1;
        uVar12 = puVar5[-2];
        uVar14 = puVar5[1];
        uVar13 = *puVar5;
        uVar7 = uVar7 - 0x20;
        puVar5 = puVar5 + 4;
        puVar4[-1] = *puVar1;
        puVar4[-2] = uVar12;
        puVar4[1] = uVar14;
        *puVar4 = uVar13;
        puVar4 = puVar4 + 4;
      } while (uVar7 != 0);
      if (uVar3 == uVar9) goto LAB_008e9e88;
    }
    do {
      puVar10 = puVar11 + 1;
      *puVar2 = *puVar11;
      puVar2 = puVar2 + 1;
      puVar11 = puVar10;
    } while (puVar8 != puVar10);
  }
LAB_008e9e88:
  puVar6 = puVar6 + uVar9;
LAB_008e9e8c:
  *puVar6 = 0;
  return;
}

