/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0081f034
 */

void FUN_0081f034(long param_1)

{
  ulong uVar1;
  basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> bVar2;
  basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *this;
  ulong uVar3;
  long lVar4;
  ulong uVar5;
  long lVar6;
  ulong uVar7;
  
  this = (basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *)
         (param_1 + 0x40);
  bVar2 = *this;
  lVar4 = *(long *)(param_1 + 0x50);
  *(undefined8 *)(param_1 + 0x58) = 0;
  if (((byte)bVar2 & 1) == 0) {
    uVar7 = (ulong)((byte)bVar2 >> 1);
    lVar6 = param_1 + 0x41;
  }
  else {
    uVar7 = *(ulong *)(param_1 + 0x48);
    lVar6 = lVar4;
  }
  if ((*(uint *)(param_1 + 0x60) >> 3 & 1) != 0) {
    *(long *)(param_1 + 0x10) = lVar6;
    *(long *)(param_1 + 0x18) = lVar6;
    *(ulong *)(param_1 + 0x58) = lVar6 + uVar7;
    *(ulong *)(param_1 + 0x20) = lVar6 + uVar7;
  }
  if ((*(uint *)(param_1 + 0x60) >> 4 & 1) != 0) {
    uVar5 = *(ulong *)(param_1 + 0x40);
    uVar3 = 0x16;
    if (((byte)bVar2 & 1) != 0) {
      uVar3 = (uVar5 & 0xfffffffffffffffe) - 1;
    }
    uVar1 = uVar5 >> 1 & 0x7f;
    if ((uVar5 & 1) != 0) {
      uVar1 = *(ulong *)(param_1 + 0x48);
    }
    *(ulong *)(param_1 + 0x58) = lVar6 + uVar7;
    if (uVar3 < uVar1 || uVar3 - uVar1 == 0) {
      if ((uVar5 & 1) == 0) {
        lVar4 = param_1 + 0x41;
        *this = SUB41((int)uVar3 << 1,0);
      }
      else {
        *(ulong *)(param_1 + 0x48) = uVar3;
      }
      *(undefined1 *)(lVar4 + uVar3) = 0;
    }
    else {
      std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::
      append(this,uVar3 - uVar1,'\0');
    }
    *(long *)(param_1 + 0x28) = lVar6;
    *(long *)(param_1 + 0x30) = lVar6;
    uVar3 = (ulong)(*(byte *)(param_1 + 0x40) >> 1);
    if ((*(byte *)(param_1 + 0x40) & 1) != 0) {
      uVar3 = *(ulong *)(param_1 + 0x48);
    }
    *(ulong *)(param_1 + 0x38) = lVar6 + uVar3;
    if ((*(byte *)(param_1 + 0x60) & 3) != 0) {
      if (uVar7 >> 0x1f != 0) {
        uVar3 = (uVar7 - 0x80000000) / 0x7fffffff;
        lVar6 = lVar6 + 0x7fffffff + uVar3 * 0x7fffffff;
        uVar7 = (uVar7 + uVar3 * -0x7fffffff) - 0x7fffffff;
        *(long *)(param_1 + 0x30) = lVar6;
      }
      if (uVar7 != 0) {
        *(ulong *)(param_1 + 0x30) = lVar6 + uVar7;
      }
    }
  }
  return;
}

