/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008e95e4
 */

/* std::__ndk1::basic_stringbuf<char, std::__ndk1::char_traits<char>, std::__ndk1::allocator<char>
   >::overflow(int) */

void __thiscall
std::__ndk1::basic_stringbuf<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::
overflow(basic_stringbuf<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *this,
        int param_1)

{
  long lVar1;
  long lVar2;
  basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> bVar3;
  long lVar4;
  ulong uVar5;
  long lVar6;
  basic_stringbuf<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *pbVar7;
  ulong uVar8;
  basic_stringbuf<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *pbVar9;
  basic_stringbuf<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *pbVar10;
  basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *this_00;
  basic_stringbuf<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *pbVar11;
  long lVar12;
  basic_stringbuf<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *local_70;
  long local_68;
  
  lVar4 = tpidr_el0;
  local_68 = *(long *)(lVar4 + 0x28);
  if (param_1 == -1) {
    uVar5 = 0;
    goto LAB_008e9790;
  }
  pbVar11 = *(basic_stringbuf<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> **)
             (this + 0x30);
  pbVar7 = *(basic_stringbuf<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> **)
            (this + 0x38);
  lVar1 = *(long *)(this + 0x10);
  lVar2 = *(long *)(this + 0x18);
  if (pbVar11 == pbVar7) {
    if (((byte)this[0x60] >> 4 & 1) == 0) {
      uVar5 = 0xffffffff;
      goto LAB_008e9790;
    }
    lVar6 = *(long *)(this + 0x58);
    lVar12 = *(long *)(this + 0x28);
    this_00 = (basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *)
              (this + 0x40);
                    /* try { // try from 008e9670 to 008e96cb has its CatchHandler @ 008e97c4 */
    basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::push_back
              (this_00,'\0');
    bVar3 = *this_00;
    if (((byte)bVar3 & 1) == 0) {
      uVar8 = 0x16;
      uVar5 = 0x16 - (ulong)((byte)bVar3 >> 1);
      if (0x16 < (ulong)((byte)bVar3 >> 1) || uVar5 == 0) goto LAB_008e9694;
LAB_008e96c0:
      basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::append
                (this_00,uVar5,'\0');
    }
    else {
      uVar8 = (*(ulong *)(this + 0x40) & 0xfffffffffffffffe) - 1;
      uVar5 = uVar8 - *(ulong *)(this + 0x48);
      if (*(ulong *)(this + 0x48) <= uVar8 && uVar5 != 0) goto LAB_008e96c0;
LAB_008e9694:
      if (((byte)bVar3 & 1) == 0) {
        this_00[uVar8 + 1] =
             (basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>)0x0;
        *this_00 = SUB41((int)uVar8 << 1,0);
      }
      else {
        *(undefined1 *)(*(long *)(this + 0x50) + uVar8) = 0;
        *(ulong *)(this + 0x48) = uVar8;
      }
    }
    if (((byte)*this_00 & 1) == 0) {
      pbVar10 = this + 0x41;
      uVar5 = (ulong)((byte)*this_00 >> 1);
    }
    else {
      uVar5 = *(ulong *)(this + 0x48);
      pbVar10 = *(basic_stringbuf<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>
                  **)(this + 0x50);
    }
    pbVar7 = pbVar10 + uVar5;
    pbVar11 = pbVar10 + ((long)pbVar11 - lVar12);
    pbVar9 = pbVar10 + (lVar6 - lVar12);
    *(basic_stringbuf<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> **)
     (this + 0x30) = pbVar11;
    *(basic_stringbuf<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> **)
     (this + 0x38) = pbVar7;
    *(basic_stringbuf<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> **)
     (this + 0x28) = pbVar10;
    *(basic_stringbuf<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> **)
     (this + 0x58) = pbVar9;
  }
  else {
    pbVar9 = *(basic_stringbuf<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> **)
              (this + 0x58);
  }
  local_70 = pbVar11 + 1;
  pbVar10 = this + 0x58;
  if (pbVar9 <= local_70) {
    pbVar10 = (basic_stringbuf<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *)
              &local_70;
  }
  pbVar10 = *(basic_stringbuf<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> **)
             pbVar10;
  *(basic_stringbuf<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> **)
   (this + 0x58) = pbVar10;
  if (((byte)this[0x60] >> 3 & 1) != 0) {
    if (((byte)this[0x40] & 1) == 0) {
      pbVar9 = this + 0x41;
    }
    else {
      pbVar9 = *(basic_stringbuf<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>
                 **)(this + 0x50);
    }
    *(basic_stringbuf<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> **)
     (this + 0x10) = pbVar9;
    *(basic_stringbuf<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> **)
     (this + 0x18) = pbVar9 + (lVar2 - lVar1);
    *(basic_stringbuf<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> **)
     (this + 0x20) = pbVar10;
  }
  if (pbVar11 == pbVar7) {
    uVar5 = (**(code **)(*(long *)this + 0x68))(this,param_1 & 0xff);
  }
  else {
    *(basic_stringbuf<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> **)
     (this + 0x30) = local_70;
    *pbVar11 = SUB41(param_1,0);
    uVar5 = (ulong)(param_1 & 0xff);
  }
LAB_008e9790:
  if (*(long *)(lVar4 + 0x28) != local_68) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail(uVar5);
  }
  return;
}

