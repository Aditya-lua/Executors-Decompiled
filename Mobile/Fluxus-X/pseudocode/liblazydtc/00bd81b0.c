/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bd81b0
 */

/* std::__ndk1::basic_filebuf<char, std::__ndk1::char_traits<char>
   >::basic_filebuf(std::__ndk1::basic_filebuf<char, std::__ndk1::char_traits<char> >&&) */

void __thiscall
std::__ndk1::basic_filebuf<char,std::__ndk1::char_traits<char>>::basic_filebuf
          (basic_filebuf<char,std::__ndk1::char_traits<char>> *this,basic_filebuf *param_1)

{
  long lVar1;
  basic_filebuf<char,std::__ndk1::char_traits<char>> bVar2;
  basic_filebuf *pbVar3;
  basic_filebuf<char,std::__ndk1::char_traits<char>> *pbVar4;
  basic_filebuf<char,std::__ndk1::char_traits<char>> *pbVar5;
  basic_filebuf<char,std::__ndk1::char_traits<char>> *pbVar6;
  long lVar7;
  basic_filebuf<char,std::__ndk1::char_traits<char>> *pbVar8;
  undefined8 uVar9;
  long lVar10;
  undefined8 uVar11;
  undefined8 uVar12;
  
  *(undefined ***)this = &PTR__basic_streambuf_00c4e728;
  locale::locale((locale *)(this + 8),(locale *)(param_1 + 8));
  pbVar3 = param_1 + 0x10;
  uVar9 = *(undefined8 *)pbVar3;
  *(undefined8 *)(this + 0x18) = *(undefined8 *)(param_1 + 0x18);
  *(undefined8 *)(this + 0x10) = uVar9;
  uVar9 = *(undefined8 *)(param_1 + 0x20);
  *(undefined8 *)(this + 0x28) = *(undefined8 *)(param_1 + 0x28);
  *(undefined8 *)(this + 0x20) = uVar9;
  uVar9 = *(undefined8 *)(param_1 + 0x30);
  *(undefined8 *)(this + 0x38) = *(undefined8 *)(param_1 + 0x38);
  *(undefined8 *)(this + 0x30) = uVar9;
  pbVar4 = *(basic_filebuf<char,std::__ndk1::char_traits<char>> **)(param_1 + 0x40);
  *(undefined ***)this = &PTR__basic_filebuf_00c51ca8;
  if (pbVar4 == (basic_filebuf<char,std::__ndk1::char_traits<char>> *)(param_1 + 0x58)) {
    pbVar4 = this + 0x58;
    lVar10 = *(long *)(param_1 + 0x50);
    *(basic_filebuf<char,std::__ndk1::char_traits<char>> **)(this + 0x40) = pbVar4;
    pbVar5 = pbVar4 + (*(long *)(param_1 + 0x48) - *(long *)(param_1 + 0x40));
    pbVar8 = pbVar4 + (lVar10 - *(long *)(param_1 + 0x40));
  }
  else {
    pbVar5 = *(basic_filebuf<char,std::__ndk1::char_traits<char>> **)(param_1 + 0x48);
    pbVar8 = *(basic_filebuf<char,std::__ndk1::char_traits<char>> **)(param_1 + 0x50);
    *(basic_filebuf<char,std::__ndk1::char_traits<char>> **)(this + 0x40) = pbVar4;
  }
  pbVar6 = *(basic_filebuf<char,std::__ndk1::char_traits<char>> **)(param_1 + 0x68);
  *(basic_filebuf<char,std::__ndk1::char_traits<char>> **)(this + 0x48) = pbVar5;
  *(basic_filebuf<char,std::__ndk1::char_traits<char>> **)(this + 0x50) = pbVar8;
  uVar9 = *(undefined8 *)(param_1 + 0x70);
  *(undefined8 *)(this + 0x60) = *(undefined8 *)(param_1 + 0x60);
  *(basic_filebuf<char,std::__ndk1::char_traits<char>> **)(this + 0x68) = pbVar6;
  uVar12 = *(undefined8 *)(param_1 + 0x80);
  uVar11 = *(undefined8 *)(param_1 + 0x78);
  *(undefined8 *)(this + 0x70) = uVar9;
  *(undefined8 *)(this + 0x80) = uVar12;
  *(undefined8 *)(this + 0x78) = uVar11;
  *(undefined8 *)(this + 0x88) = *(undefined8 *)(param_1 + 0x88);
  *(undefined8 *)(this + 0x90) = *(undefined8 *)(param_1 + 0x90);
  bVar2 = *(basic_filebuf<char,std::__ndk1::char_traits<char>> *)(param_1 + 0xa0);
  *(undefined8 *)(this + 0x98) = *(undefined8 *)(param_1 + 0x98);
  this[0xa0] = bVar2;
  *(undefined2 *)(this + 0xa1) = *(undefined2 *)(param_1 + 0xa1);
  lVar10 = *(long *)(param_1 + 0x28);
  if (lVar10 == 0) {
    lVar10 = *(long *)pbVar3;
    if (lVar10 != 0) {
      lVar7 = *(long *)(param_1 + 0x18);
      lVar1 = *(long *)(param_1 + 0x20);
      if (lVar10 == *(long *)(param_1 + 0x68)) {
        *(basic_filebuf<char,std::__ndk1::char_traits<char>> **)(this + 0x10) = pbVar6;
        *(basic_filebuf<char,std::__ndk1::char_traits<char>> **)(this + 0x18) =
             pbVar6 + (lVar7 - lVar10);
        *(basic_filebuf<char,std::__ndk1::char_traits<char>> **)(this + 0x20) =
             pbVar6 + (lVar1 - lVar10);
      }
      else {
        *(basic_filebuf<char,std::__ndk1::char_traits<char>> **)(this + 0x10) = pbVar4;
        *(basic_filebuf<char,std::__ndk1::char_traits<char>> **)(this + 0x18) =
             pbVar4 + (lVar7 - lVar10);
        *(basic_filebuf<char,std::__ndk1::char_traits<char>> **)(this + 0x20) =
             pbVar4 + (lVar1 - lVar10);
      }
    }
  }
  else {
    if (lVar10 != *(long *)(param_1 + 0x68)) {
      pbVar6 = pbVar4;
    }
    lVar7 = *(long *)(param_1 + 0x38);
    *(basic_filebuf<char,std::__ndk1::char_traits<char>> **)(this + 0x30) = pbVar6;
    *(basic_filebuf<char,std::__ndk1::char_traits<char>> **)(this + 0x28) = pbVar6;
    *(basic_filebuf<char,std::__ndk1::char_traits<char>> **)(this + 0x30) =
         pbVar6 + (*(long *)(param_1 + 0x30) - *(long *)(param_1 + 0x28));
    *(basic_filebuf<char,std::__ndk1::char_traits<char>> **)(this + 0x38) =
         pbVar6 + (lVar7 - lVar10);
  }
  *(undefined8 *)(param_1 + 0x50) = 0;
  *(undefined8 *)(param_1 + 0x90) = 0;
  *(undefined8 *)(param_1 + 0x98) = 0;
  *(undefined8 *)(param_1 + 0x88) = 0;
  *(undefined8 *)(param_1 + 0x18) = 0;
  *(undefined8 *)pbVar3 = 0;
  *(undefined8 *)(param_1 + 0x28) = 0;
  *(undefined8 *)(param_1 + 0x20) = 0;
  *(undefined8 *)(param_1 + 0x38) = 0;
  *(undefined8 *)(param_1 + 0x30) = 0;
  *(undefined8 *)(param_1 + 0x48) = 0;
  *(undefined8 *)(param_1 + 0x40) = 0;
  *(undefined8 *)(param_1 + 0x68) = 0;
  *(undefined8 *)(param_1 + 0x60) = 0;
  *(undefined8 *)(param_1 + 0x78) = 0;
  *(undefined8 *)(param_1 + 0x70) = 0;
  *(undefined2 *)(param_1 + 0xa0) = 0;
  return;
}

