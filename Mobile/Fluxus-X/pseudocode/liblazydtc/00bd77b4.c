/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bd77b4
 */

/* std::__ndk1::basic_stringbuf<char, std::__ndk1::char_traits<char>, std::__ndk1::allocator<char>
   >::TEMPNAMEPLACEHOLDERVALUE(std::__ndk1::basic_stringbuf<char, std::__ndk1::char_traits<char>,
   std::__ndk1::allocator<char> >&&) */

basic_stringbuf<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> * __thiscall
std::__ndk1::basic_stringbuf<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::
operator=(basic_stringbuf<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *this,
         basic_stringbuf *param_1)

{
  basic_stringbuf<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *pbVar1;
  undefined4 uVar2;
  bool bVar3;
  long lVar4;
  long lVar5;
  basic_stringbuf<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *pbVar6;
  basic_stringbuf *pbVar7;
  basic_stringbuf<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *pbVar8;
  long lVar9;
  basic_stringbuf *pbVar10;
  long lVar11;
  long lVar12;
  long lVar13;
  long lVar14;
  undefined8 uVar15;
  undefined8 uVar16;
  locale alStack_70 [8];
  locale alStack_68 [8];
  
  pbVar10 = param_1 + 0x40;
  pbVar7 = *(basic_stringbuf **)(param_1 + 0x50);
  if (((byte)*pbVar10 & 1) == 0) {
    pbVar7 = param_1 + 0x41;
  }
  if (*(long *)(param_1 + 0x10) == 0) {
    lVar12 = -1;
    lVar9 = -1;
    lVar14 = -1;
  }
  else {
    lVar14 = *(long *)(param_1 + 0x10) - (long)pbVar7;
    lVar9 = *(long *)(param_1 + 0x18) - (long)pbVar7;
    lVar12 = *(long *)(param_1 + 0x20) - (long)pbVar7;
  }
  if (*(long *)(param_1 + 0x28) == 0) {
    lVar13 = -1;
    lVar11 = -1;
    lVar4 = -1;
  }
  else {
    lVar13 = *(long *)(param_1 + 0x28) - (long)pbVar7;
    lVar11 = *(long *)(param_1 + 0x30) - (long)pbVar7;
    lVar4 = *(long *)(param_1 + 0x38) - (long)pbVar7;
  }
  lVar5 = *(long *)(param_1 + 0x58) - (long)pbVar7;
  if (*(long *)(param_1 + 0x58) == 0) {
    lVar5 = -1;
  }
  if (((byte)this[0x40] & 1) != 0) {
    operator_delete(*(void **)(this + 0x50),*(ulong *)(this + 0x40) & 0xfffffffffffffffe);
  }
  uVar16 = *(undefined8 *)(param_1 + 0x48);
  uVar15 = *(undefined8 *)pbVar10;
  *(undefined8 *)(this + 0x50) = *(undefined8 *)(param_1 + 0x50);
  *(undefined8 *)(this + 0x48) = uVar16;
  *(undefined8 *)(this + 0x40) = uVar15;
  *pbVar10 = (basic_stringbuf)0x0;
  param_1[0x41] = (basic_stringbuf)0x0;
  pbVar1 = this + 0x41;
  if (((byte)this[0x40] & 1) != 0) {
    pbVar1 = *(basic_stringbuf<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> **)
              (this + 0x50);
  }
  bVar3 = lVar14 != -1;
  pbVar6 = (basic_stringbuf<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *)0x0;
  if (bVar3) {
    pbVar6 = pbVar1 + lVar14;
  }
  pbVar8 = (basic_stringbuf<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *)0x0;
  if (bVar3) {
    pbVar8 = pbVar1 + lVar9;
  }
  *(basic_stringbuf<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> **)
   (this + 0x10) = pbVar6;
  *(basic_stringbuf<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> **)
   (this + 0x18) = pbVar8;
  pbVar6 = (basic_stringbuf<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *)0x0;
  if (bVar3) {
    pbVar6 = pbVar1 + lVar12;
  }
  *(basic_stringbuf<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> **)
   (this + 0x20) = pbVar6;
  if (lVar13 == -1) {
    pbVar6 = (basic_stringbuf<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *)
             0x0;
    pbVar8 = (basic_stringbuf<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *)
             0x0;
    *(undefined8 *)(this + 0x30) = 0;
  }
  else {
    pbVar6 = pbVar1 + lVar13;
    pbVar8 = pbVar1 + lVar4;
    *(basic_stringbuf<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> **)
     (this + 0x30) = pbVar6 + lVar11;
  }
  *(basic_stringbuf<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> **)
   (this + 0x28) = pbVar6;
  uVar2 = *(undefined4 *)(param_1 + 0x60);
  pbVar6 = (basic_stringbuf<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *)0x0;
  if (lVar5 != -1) {
    pbVar6 = pbVar1 + lVar5;
  }
  *(basic_stringbuf<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> **)
   (this + 0x38) = pbVar8;
  *(basic_stringbuf<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> **)
   (this + 0x58) = pbVar6;
  *(undefined4 *)(this + 0x60) = uVar2;
  pbVar7 = param_1 + 0x41;
  if (((byte)param_1[0x40] & 1) != 0) {
    pbVar7 = *(basic_stringbuf **)(param_1 + 0x50);
  }
  *(basic_stringbuf **)(param_1 + 0x10) = pbVar7;
  *(basic_stringbuf **)(param_1 + 0x18) = pbVar7;
  *(basic_stringbuf **)(param_1 + 0x20) = pbVar7;
  *(basic_stringbuf **)(param_1 + 0x28) = pbVar7;
  *(basic_stringbuf **)(param_1 + 0x30) = pbVar7;
  *(basic_stringbuf **)(param_1 + 0x38) = pbVar7;
  *(basic_stringbuf **)(param_1 + 0x58) = pbVar7;
  locale::locale(alStack_70,(locale *)(param_1 + 8));
                    /* try { // try from 00bd7948 to 00bd7953 has its CatchHandler @ 00bd79a4 */
  (**(code **)(*(long *)this + 0x10))(this,alStack_70);
  locale::locale(alStack_68,(locale *)(this + 8));
  locale::operator=((locale *)(this + 8),alStack_70);
  locale::~locale(alStack_68);
  locale::~locale(alStack_70);
  return this;
}

