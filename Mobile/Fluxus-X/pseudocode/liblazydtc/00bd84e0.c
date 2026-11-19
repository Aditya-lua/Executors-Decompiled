/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bd84e0
 */

/* std::__ndk1::basic_filebuf<char, std::__ndk1::char_traits<char>
   >::swap(std::__ndk1::basic_filebuf<char, std::__ndk1::char_traits<char> >&) */

void __thiscall
std::__ndk1::basic_filebuf<char,std::__ndk1::char_traits<char>>::swap
          (basic_filebuf<char,std::__ndk1::char_traits<char>> *this,basic_filebuf *param_1)

{
  basic_filebuf *pbVar1;
  basic_filebuf<char,std::__ndk1::char_traits<char>> *pbVar2;
  undefined4 uVar3;
  basic_filebuf<char,std::__ndk1::char_traits<char>> bVar4;
  basic_filebuf<char,std::__ndk1::char_traits<char>> bVar5;
  undefined8 uVar6;
  basic_filebuf<char,std::__ndk1::char_traits<char>> *pbVar7;
  basic_filebuf *pbVar8;
  long lVar9;
  long lVar10;
  undefined8 uVar11;
  long lVar12;
  undefined8 uVar13;
  long lVar14;
  undefined8 uVar15;
  long lVar16;
  undefined8 uVar17;
  long lVar18;
  long lVar19;
  long lVar20;
  long lVar21;
  locale alStack_28 [8];
  
  locale::locale(alStack_28,(locale *)(this + 8));
  locale::operator=((locale *)(this + 8),(locale *)(param_1 + 8));
  locale::operator=((locale *)(param_1 + 8),alStack_28);
  locale::~locale(alStack_28);
  uVar6 = *(undefined8 *)(this + 0x10);
  pbVar1 = param_1 + 0x58;
  *(undefined8 *)(this + 0x10) = *(undefined8 *)(param_1 + 0x10);
  *(undefined8 *)(param_1 + 0x10) = uVar6;
  uVar6 = *(undefined8 *)(this + 0x18);
  *(undefined8 *)(this + 0x18) = *(undefined8 *)(param_1 + 0x18);
  *(undefined8 *)(param_1 + 0x18) = uVar6;
  uVar6 = *(undefined8 *)(this + 0x20);
  *(undefined8 *)(this + 0x20) = *(undefined8 *)(param_1 + 0x20);
  *(undefined8 *)(param_1 + 0x20) = uVar6;
  uVar6 = *(undefined8 *)(this + 0x28);
  *(undefined8 *)(this + 0x28) = *(undefined8 *)(param_1 + 0x28);
  *(undefined8 *)(param_1 + 0x28) = uVar6;
  uVar6 = *(undefined8 *)(this + 0x30);
  *(undefined8 *)(this + 0x30) = *(undefined8 *)(param_1 + 0x30);
  *(undefined8 *)(param_1 + 0x30) = uVar6;
  uVar6 = *(undefined8 *)(this + 0x38);
  *(undefined8 *)(this + 0x38) = *(undefined8 *)(param_1 + 0x38);
  pbVar2 = this + 0x58;
  *(undefined8 *)(param_1 + 0x38) = uVar6;
  pbVar8 = *(basic_filebuf **)(param_1 + 0x40);
  pbVar7 = *(basic_filebuf<char,std::__ndk1::char_traits<char>> **)(this + 0x40);
  if ((pbVar7 != pbVar2) && (pbVar8 != pbVar1)) {
    *(basic_filebuf **)(this + 0x40) = pbVar8;
    *(basic_filebuf<char,std::__ndk1::char_traits<char>> **)(param_1 + 0x40) = pbVar7;
    uVar6 = *(undefined8 *)(this + 0x48);
    *(undefined8 *)(this + 0x48) = *(undefined8 *)(param_1 + 0x48);
    *(undefined8 *)(param_1 + 0x48) = uVar6;
    uVar6 = *(undefined8 *)(this + 0x50);
    *(undefined8 *)(this + 0x50) = *(undefined8 *)(param_1 + 0x50);
    *(undefined8 *)(param_1 + 0x50) = uVar6;
    goto LAB_00bd867c;
  }
  lVar20 = -(ulong)(*(long *)(this + 0x48) == 0);
  lVar21 = -(ulong)(*(long *)(this + 0x50) == 0);
  lVar10 = *(long *)(this + 0x48) - (long)pbVar7;
  lVar12 = *(long *)(this + 0x50) - (long)pbVar7;
  lVar14 = -(ulong)(*(long *)(param_1 + 0x48) == 0);
  lVar16 = -(ulong)(*(long *)(param_1 + 0x50) == 0);
  lVar18 = *(long *)(param_1 + 0x48) - (long)pbVar8;
  lVar19 = *(long *)(param_1 + 0x50) - (long)pbVar8;
  if (pbVar7 == pbVar2) {
    if (pbVar8 == pbVar1) goto LAB_00bd863c;
    *(basic_filebuf **)(this + 0x40) = pbVar8;
    *(basic_filebuf **)(param_1 + 0x40) = pbVar1;
    *(undefined8 *)(param_1 + 0x58) = *(undefined8 *)(this + 0x58);
  }
  else if (pbVar8 == pbVar1) {
    *(basic_filebuf<char,std::__ndk1::char_traits<char>> **)(param_1 + 0x40) = pbVar7;
    *(basic_filebuf<char,std::__ndk1::char_traits<char>> **)(this + 0x40) = pbVar2;
    *(undefined8 *)(this + 0x58) = *(undefined8 *)(param_1 + 0x58);
  }
  else {
LAB_00bd863c:
    uVar6 = *(undefined8 *)pbVar2;
    *(undefined8 *)pbVar2 = *(undefined8 *)(param_1 + 0x58);
    *(undefined8 *)(param_1 + 0x58) = uVar6;
  }
  lVar9 = *(long *)(param_1 + 0x40);
  *(long *)(this + 0x48) =
       *(long *)(this + 0x40) +
       CONCAT17((byte)((ulong)lVar18 >> 0x38) & ~(byte)((ulong)lVar14 >> 0x38),
                CONCAT16((byte)((ulong)lVar18 >> 0x30) & ~(byte)((ulong)lVar14 >> 0x30),
                         CONCAT15((byte)((ulong)lVar18 >> 0x28) & ~(byte)((ulong)lVar14 >> 0x28),
                                  CONCAT14((byte)((ulong)lVar18 >> 0x20) &
                                           ~(byte)((ulong)lVar14 >> 0x20),
                                           CONCAT13((byte)((ulong)lVar18 >> 0x18) &
                                                    ~(byte)((ulong)lVar14 >> 0x18),
                                                    CONCAT12((byte)((ulong)lVar18 >> 0x10) &
                                                             ~(byte)((ulong)lVar14 >> 0x10),
                                                             CONCAT11((byte)((ulong)lVar18 >> 8) &
                                                                      ~(byte)((ulong)lVar14 >> 8),
                                                                      (byte)lVar18 & ~(byte)lVar14))
                                                   )))));
  *(long *)(this + 0x50) =
       *(long *)(this + 0x40) +
       CONCAT17((byte)((ulong)lVar19 >> 0x38) & ~(byte)((ulong)lVar16 >> 0x38),
                CONCAT16((byte)((ulong)lVar19 >> 0x30) & ~(byte)((ulong)lVar16 >> 0x30),
                         CONCAT15((byte)((ulong)lVar19 >> 0x28) & ~(byte)((ulong)lVar16 >> 0x28),
                                  CONCAT14((byte)((ulong)lVar19 >> 0x20) &
                                           ~(byte)((ulong)lVar16 >> 0x20),
                                           CONCAT13((byte)((ulong)lVar19 >> 0x18) &
                                                    ~(byte)((ulong)lVar16 >> 0x18),
                                                    CONCAT12((byte)((ulong)lVar19 >> 0x10) &
                                                             ~(byte)((ulong)lVar16 >> 0x10),
                                                             CONCAT11((byte)((ulong)lVar19 >> 8) &
                                                                      ~(byte)((ulong)lVar16 >> 8),
                                                                      (byte)lVar19 & ~(byte)lVar16))
                                                   )))));
  *(long *)(param_1 + 0x48) =
       lVar9 + CONCAT17((byte)((ulong)lVar10 >> 0x38) & ~(byte)((ulong)lVar20 >> 0x38),
                        CONCAT16((byte)((ulong)lVar10 >> 0x30) & ~(byte)((ulong)lVar20 >> 0x30),
                                 CONCAT15((byte)((ulong)lVar10 >> 0x28) &
                                          ~(byte)((ulong)lVar20 >> 0x28),
                                          CONCAT14((byte)((ulong)lVar10 >> 0x20) &
                                                   ~(byte)((ulong)lVar20 >> 0x20),
                                                   CONCAT13((byte)((ulong)lVar10 >> 0x18) &
                                                            ~(byte)((ulong)lVar20 >> 0x18),
                                                            CONCAT12((byte)((ulong)lVar10 >> 0x10) &
                                                                     ~(byte)((ulong)lVar20 >> 0x10),
                                                                     CONCAT11((byte)((ulong)lVar10
                                                                                    >> 8) &
                                                                              ~(byte)((ulong)lVar20
                                                                                     >> 8),
                                                                              (byte)lVar10 &
                                                                              ~(byte)lVar20)))))));
  *(long *)(param_1 + 0x50) =
       lVar9 + CONCAT17((byte)((ulong)lVar12 >> 0x38) & ~(byte)((ulong)lVar21 >> 0x38),
                        CONCAT16((byte)((ulong)lVar12 >> 0x30) & ~(byte)((ulong)lVar21 >> 0x30),
                                 CONCAT15((byte)((ulong)lVar12 >> 0x28) &
                                          ~(byte)((ulong)lVar21 >> 0x28),
                                          CONCAT14((byte)((ulong)lVar12 >> 0x20) &
                                                   ~(byte)((ulong)lVar21 >> 0x20),
                                                   CONCAT13((byte)((ulong)lVar12 >> 0x18) &
                                                            ~(byte)((ulong)lVar21 >> 0x18),
                                                            CONCAT12((byte)((ulong)lVar12 >> 0x10) &
                                                                     ~(byte)((ulong)lVar21 >> 0x10),
                                                                     CONCAT11((byte)((ulong)lVar12
                                                                                    >> 8) &
                                                                              ~(byte)((ulong)lVar21
                                                                                     >> 8),
                                                                              (byte)lVar12 &
                                                                              ~(byte)lVar21)))))));
LAB_00bd867c:
  uVar11 = *(undefined8 *)(param_1 + 0x68);
  uVar6 = *(undefined8 *)(this + 0x60);
  uVar13 = *(undefined8 *)(this + 0x68);
  *(undefined8 *)(this + 0x60) = *(undefined8 *)(param_1 + 0x60);
  *(undefined8 *)(this + 0x68) = uVar11;
  *(undefined8 *)(param_1 + 0x60) = uVar6;
  *(undefined8 *)(param_1 + 0x68) = uVar13;
  uVar13 = *(undefined8 *)(param_1 + 0x80);
  uVar11 = *(undefined8 *)(param_1 + 0x78);
  uVar6 = *(undefined8 *)(this + 0x70);
  uVar17 = *(undefined8 *)(this + 0x80);
  uVar15 = *(undefined8 *)(this + 0x78);
  *(undefined8 *)(this + 0x70) = *(undefined8 *)(param_1 + 0x70);
  *(undefined8 *)(this + 0x80) = uVar13;
  *(undefined8 *)(this + 0x78) = uVar11;
  *(undefined8 *)(param_1 + 0x70) = uVar6;
  *(undefined8 *)(param_1 + 0x80) = uVar17;
  *(undefined8 *)(param_1 + 0x78) = uVar15;
  uVar6 = *(undefined8 *)(this + 0x88);
  *(undefined8 *)(this + 0x88) = *(undefined8 *)(param_1 + 0x88);
  *(undefined8 *)(param_1 + 0x88) = uVar6;
  uVar6 = *(undefined8 *)(this + 0x90);
  *(undefined8 *)(this + 0x90) = *(undefined8 *)(param_1 + 0x90);
  bVar4 = *(basic_filebuf<char,std::__ndk1::char_traits<char>> *)(param_1 + 0xa0);
  *(undefined8 *)(param_1 + 0x90) = uVar6;
  uVar3 = *(undefined4 *)(this + 0x98);
  *(undefined4 *)(this + 0x98) = *(undefined4 *)(param_1 + 0x98);
  bVar5 = this[0xa0];
  this[0xa0] = bVar4;
  pbVar8 = *(basic_filebuf **)(this + 0x10);
  *(undefined4 *)(param_1 + 0x98) = uVar3;
  *(basic_filebuf<char,std::__ndk1::char_traits<char>> *)(param_1 + 0xa0) = bVar5;
  bVar4 = *(basic_filebuf<char,std::__ndk1::char_traits<char>> *)(param_1 + 0xa1);
  uVar3 = *(undefined4 *)(this + 0x9c);
  *(undefined4 *)(this + 0x9c) = *(undefined4 *)(param_1 + 0x9c);
  bVar5 = this[0xa1];
  this[0xa1] = bVar4;
  pbVar1 = param_1 + 0x58;
  *(basic_filebuf<char,std::__ndk1::char_traits<char>> *)(param_1 + 0xa1) = bVar5;
  *(undefined4 *)(param_1 + 0x9c) = uVar3;
  bVar4 = this[0xa2];
  this[0xa2] = *(basic_filebuf<char,std::__ndk1::char_traits<char>> *)(param_1 + 0xa2);
  *(basic_filebuf<char,std::__ndk1::char_traits<char>> *)(param_1 + 0xa2) = bVar4;
  if (pbVar8 == pbVar1) {
    *(basic_filebuf<char,std::__ndk1::char_traits<char>> **)(this + 0x10) = pbVar2;
    *(basic_filebuf<char,std::__ndk1::char_traits<char>> **)(this + 0x18) =
         pbVar2 + (*(long *)(this + 0x18) - (long)pbVar1);
    *(basic_filebuf<char,std::__ndk1::char_traits<char>> **)(this + 0x20) =
         pbVar2 + (*(long *)(this + 0x20) - (long)pbVar1);
  }
  else if (*(basic_filebuf **)(this + 0x28) == pbVar1) {
    *(basic_filebuf<char,std::__ndk1::char_traits<char>> **)(this + 0x38) =
         pbVar2 + (*(long *)(this + 0x38) - (long)pbVar1);
    *(basic_filebuf<char,std::__ndk1::char_traits<char>> **)(this + 0x28) = pbVar2;
    *(basic_filebuf<char,std::__ndk1::char_traits<char>> **)(this + 0x30) =
         pbVar2 + (*(long *)(this + 0x30) - (long)pbVar1);
  }
  if (*(basic_filebuf<char,std::__ndk1::char_traits<char>> **)(param_1 + 0x10) == pbVar2) {
    *(basic_filebuf **)(param_1 + 0x10) = pbVar1;
    *(basic_filebuf **)(param_1 + 0x18) = pbVar1 + (*(long *)(param_1 + 0x18) - (long)pbVar2);
    *(basic_filebuf **)(param_1 + 0x20) = pbVar1 + (*(long *)(param_1 + 0x20) - (long)pbVar2);
  }
  else if (*(basic_filebuf<char,std::__ndk1::char_traits<char>> **)(param_1 + 0x28) == pbVar2) {
    *(basic_filebuf **)(param_1 + 0x28) = pbVar1;
    *(basic_filebuf **)(param_1 + 0x30) = pbVar1 + (*(long *)(param_1 + 0x30) - (long)pbVar2);
    *(basic_filebuf **)(param_1 + 0x38) = pbVar1 + (*(long *)(param_1 + 0x38) - (long)pbVar2);
  }
  return;
}

