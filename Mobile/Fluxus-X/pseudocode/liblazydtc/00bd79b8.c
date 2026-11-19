/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bd79b8
 */

/* std::__ndk1::basic_stringbuf<char, std::__ndk1::char_traits<char>, std::__ndk1::allocator<char>
   >::swap(std::__ndk1::basic_stringbuf<char, std::__ndk1::char_traits<char>,
   std::__ndk1::allocator<char> >&) */

void __thiscall
std::__ndk1::basic_stringbuf<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::swap
          (basic_stringbuf<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *this,
          basic_stringbuf *param_1)

{
  basic_stringbuf<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *pbVar1;
  basic_stringbuf *pbVar2;
  undefined4 uVar3;
  bool bVar4;
  long lVar5;
  long lVar6;
  basic_stringbuf<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *pbVar7;
  long lVar8;
  long lVar9;
  long lVar10;
  basic_stringbuf<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *pbVar11;
  long lVar12;
  long lVar13;
  undefined8 uVar14;
  basic_stringbuf *pbVar15;
  long lVar16;
  long lVar17;
  basic_stringbuf<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *pbVar18;
  basic_stringbuf *pbVar19;
  basic_stringbuf *pbVar20;
  long lVar21;
  long lVar22;
  long lVar23;
  long lVar24;
  long lVar25;
  long lVar26;
  undefined8 uVar27;
  undefined8 uVar28;
  undefined8 uVar29;
  undefined8 uVar30;
  locale alStack_68 [8];
  locale alStack_60 [8];
  locale alStack_58 [40];
  locale alStack_18 [8];
  
  pbVar15 = param_1 + 0x40;
  pbVar20 = *(basic_stringbuf **)(param_1 + 0x50);
  if (((byte)*pbVar15 & 1) == 0) {
    pbVar20 = param_1 + 0x41;
  }
  if (*(long *)(param_1 + 0x10) == 0) {
    lVar16 = -1;
    lVar17 = -1;
    lVar21 = -1;
    lVar22 = *(long *)(param_1 + 0x28);
  }
  else {
    lVar21 = *(long *)(param_1 + 0x10) - (long)pbVar20;
    lVar16 = *(long *)(param_1 + 0x18) - (long)pbVar20;
    lVar17 = *(long *)(param_1 + 0x20) - (long)pbVar20;
    lVar22 = *(long *)(param_1 + 0x28);
  }
  if (lVar22 == 0) {
    lVar22 = -1;
    lVar23 = -1;
    lVar24 = -1;
  }
  else {
    lVar22 = lVar22 - (long)pbVar20;
    lVar23 = *(long *)(param_1 + 0x30) - (long)pbVar20;
    lVar24 = *(long *)(param_1 + 0x38) - (long)pbVar20;
  }
  pbVar11 = this + 0x40;
  pbVar7 = *(basic_stringbuf<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> **)
            (this + 0x50);
  lVar5 = *(long *)(param_1 + 0x58) - (long)pbVar20;
  if (*(long *)(param_1 + 0x58) == 0) {
    lVar5 = -1;
  }
  if (((byte)*pbVar11 & 1) == 0) {
    pbVar7 = this + 0x41;
  }
  if (*(long *)(this + 0x10) == 0) {
    lVar25 = -1;
    lVar26 = -1;
    lVar6 = -1;
  }
  else {
    lVar25 = *(long *)(this + 0x10) - (long)pbVar7;
    lVar26 = *(long *)(this + 0x18) - (long)pbVar7;
    lVar6 = *(long *)(this + 0x20) - (long)pbVar7;
  }
  if (*(long *)(this + 0x28) == 0) {
    lVar8 = -1;
    lVar9 = -1;
    lVar10 = -1;
  }
  else {
    lVar8 = *(long *)(this + 0x28) - (long)pbVar7;
    lVar9 = *(long *)(this + 0x30) - (long)pbVar7;
    lVar10 = *(long *)(this + 0x38) - (long)pbVar7;
  }
  uVar3 = *(undefined4 *)(this + 0x60);
  *(undefined4 *)(this + 0x60) = *(undefined4 *)(param_1 + 0x60);
  *(undefined4 *)(param_1 + 0x60) = uVar3;
  uVar28 = *(undefined8 *)pbVar15;
  uVar14 = *(undefined8 *)(param_1 + 0x50);
  uVar30 = *(undefined8 *)(this + 0x48);
  uVar29 = *(undefined8 *)pbVar11;
  uVar27 = *(undefined8 *)(this + 0x50);
  *(undefined8 *)(this + 0x48) = *(undefined8 *)(param_1 + 0x48);
  *(undefined8 *)pbVar11 = uVar28;
  *(undefined8 *)(this + 0x50) = uVar14;
  lVar12 = *(long *)(this + 0x58);
  *(undefined8 *)(param_1 + 0x48) = uVar30;
  *(undefined8 *)pbVar15 = uVar29;
  *(undefined8 *)(param_1 + 0x50) = uVar27;
  lVar13 = lVar12 - (long)pbVar7;
  if (lVar12 == 0) {
    lVar13 = -1;
  }
  pbVar7 = this + 0x41;
  if (((byte)this[0x40] & 1) != 0) {
    pbVar7 = *(basic_stringbuf<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> **)
              (this + 0x50);
  }
  bVar4 = lVar21 != -1;
  pbVar11 = (basic_stringbuf<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *)0x0
  ;
  if (bVar4) {
    pbVar11 = pbVar7 + lVar21;
  }
  pbVar18 = (basic_stringbuf<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *)0x0
  ;
  if (bVar4) {
    pbVar18 = pbVar7 + lVar16;
  }
  pbVar1 = (basic_stringbuf<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *)0x0;
  if (bVar4) {
    pbVar1 = pbVar7 + lVar17;
  }
  *(basic_stringbuf<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> **)
   (this + 0x10) = pbVar11;
  *(basic_stringbuf<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> **)
   (this + 0x18) = pbVar18;
  *(basic_stringbuf<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> **)
   (this + 0x20) = pbVar1;
  if (lVar22 == -1) {
    pbVar11 = (basic_stringbuf<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *)
              0x0;
    pbVar18 = (basic_stringbuf<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *)
              0x0;
    *(undefined8 *)(this + 0x30) = 0;
  }
  else {
    pbVar11 = pbVar7 + lVar22;
    pbVar18 = pbVar7 + lVar24;
    *(basic_stringbuf<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> **)
     (this + 0x30) = pbVar11 + lVar23;
  }
  *(basic_stringbuf<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> **)
   (this + 0x28) = pbVar11;
  pbVar11 = (basic_stringbuf<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *)0x0
  ;
  if (lVar5 != -1) {
    pbVar11 = pbVar7 + lVar5;
  }
  *(basic_stringbuf<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> **)
   (this + 0x38) = pbVar18;
  *(basic_stringbuf<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> **)
   (this + 0x58) = pbVar11;
  pbVar20 = param_1 + 0x41;
  if (((byte)param_1[0x40] & 1) != 0) {
    pbVar20 = *(basic_stringbuf **)(param_1 + 0x50);
  }
  bVar4 = lVar25 != -1;
  pbVar15 = (basic_stringbuf *)0x0;
  if (bVar4) {
    pbVar15 = pbVar20 + lVar25;
  }
  pbVar19 = (basic_stringbuf *)0x0;
  if (bVar4) {
    pbVar19 = pbVar20 + lVar26;
  }
  *(basic_stringbuf **)(param_1 + 0x10) = pbVar15;
  *(basic_stringbuf **)(param_1 + 0x18) = pbVar19;
  pbVar15 = (basic_stringbuf *)0x0;
  if (bVar4) {
    pbVar15 = pbVar20 + lVar6;
  }
  *(basic_stringbuf **)(param_1 + 0x20) = pbVar15;
  if (lVar8 == -1) {
    pbVar15 = (basic_stringbuf *)0x0;
    pbVar19 = (basic_stringbuf *)0x0;
    *(undefined8 *)(param_1 + 0x30) = 0;
  }
  else {
    pbVar15 = pbVar20 + lVar8;
    pbVar19 = pbVar20 + lVar10;
    *(basic_stringbuf **)(param_1 + 0x30) = pbVar15 + lVar9;
  }
  pbVar2 = (basic_stringbuf *)0x0;
  if (lVar13 != -1) {
    pbVar2 = pbVar20 + lVar13;
  }
  *(basic_stringbuf **)(param_1 + 0x28) = pbVar15;
  *(basic_stringbuf **)(param_1 + 0x38) = pbVar19;
  *(basic_stringbuf **)(param_1 + 0x58) = pbVar2;
  locale::locale(alStack_18,(locale *)(param_1 + 8));
  locale::locale(alStack_60,(locale *)(this + 8));
                    /* try { // try from 00bd7c04 to 00bd7c4b has its CatchHandler @ 00bd7c8c */
  (**(code **)(*(long *)param_1 + 0x10))(param_1,alStack_60);
  locale::locale(alStack_58,(locale *)(param_1 + 8));
  locale::operator=((locale *)(param_1 + 8),alStack_60);
  locale::~locale(alStack_58);
  locale::~locale(alStack_60);
  (**(code **)(*(long *)this + 0x10))(this,alStack_18);
  locale::locale(alStack_68,(locale *)(this + 8));
  locale::operator=((locale *)(this + 8),alStack_18);
  locale::~locale(alStack_68);
  locale::~locale(alStack_18);
  return;
}

