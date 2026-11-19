/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00901b68
 */

/* void std::__ndk1::vector<cpr::CertInfo, std::__ndk1::allocator<cpr::CertInfo>
   >::__emplace_back_slow_path<cpr::CertInfo&>(cpr::CertInfo&) */

void __thiscall
std::__ndk1::vector<cpr::CertInfo,std::__ndk1::allocator<cpr::CertInfo>>::
__emplace_back_slow_path<cpr::CertInfo&>
          (vector<cpr::CertInfo,std::__ndk1::allocator<cpr::CertInfo>> *this,CertInfo *param_1)

{
  ulong uVar1;
  vector<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::allocator<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>>
  *pvVar2;
  void *pvVar3;
  byte *pbVar4;
  long lVar5;
  long lVar6;
  ulong uVar7;
  vector<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::allocator<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>>
  *this_00;
  vector *pvVar8;
  vector *pvVar9;
  byte *pbVar10;
  vector *pvVar11;
  byte *pbVar12;
  ulong uVar13;
  
  lVar5 = *(long *)(this + 8) - *(long *)this >> 3;
  uVar13 = 0xaaaaaaaaaaaaaaa;
  uVar1 = lVar5 * -0x5555555555555555 + 1;
  if (0xaaaaaaaaaaaaaaa < uVar1) {
                    /* WARNING: Subroutine does not return */
    __vector_base_common<true>::__throw_length_error();
  }
  lVar6 = *(long *)(this + 0x10) - *(long *)this >> 3;
  if ((ulong)(lVar6 * -0x5555555555555555) < 0x555555555555555) {
    uVar7 = lVar6 * 0x5555555555555556;
    uVar13 = uVar1;
    if (uVar1 <= uVar7) {
      uVar13 = uVar7;
    }
    if (uVar13 == 0) {
      pvVar3 = (void *)0x0;
      goto LAB_00901c00;
    }
  }
  pvVar3 = operator_new(uVar13 * 0x18);
LAB_00901c00:
  this_00 = (vector<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::allocator<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>>
             *)((long)pvVar3 + lVar5 * 8);
                    /* try { // try from 00901c08 to 00901c13 has its CatchHandler @ 00901d0c */
  vector<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::allocator<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>>
  ::vector(this_00,(vector *)param_1);
  pvVar9 = *(vector **)this;
  pvVar11 = *(vector **)(this + 8);
  pvVar2 = this_00 + 0x18;
  if (pvVar11 == pvVar9) {
    pvVar11 = pvVar9;
  }
  else {
    do {
      pvVar11 = pvVar11 + -0x18;
                    /* try { // try from 00901c2c to 00901c33 has its CatchHandler @ 00901d20 */
      vector<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::allocator<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>>
      ::vector(this_00 + -0x18,pvVar11);
      this_00 = this_00 + -0x18;
    } while (pvVar9 != pvVar11);
    pvVar9 = *(vector **)this;
    pvVar11 = *(vector **)(this + 8);
  }
  *(vector<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::allocator<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>>
    **)this = this_00;
  *(vector<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::allocator<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>>
    **)(this + 8) = pvVar2;
  *(void **)(this + 0x10) = (void *)((long)pvVar3 + uVar13 * 0x18);
  if (pvVar11 != pvVar9) {
    do {
      pvVar8 = pvVar11 + -0x18;
      pbVar10 = *(byte **)pvVar8;
      if (pbVar10 != (byte *)0x0) {
        if (*(byte **)(pvVar11 + -0x10) == pbVar10) {
          pbVar4 = pbVar10;
        }
        else {
          pbVar4 = *(byte **)(pvVar11 + -0x10);
          do {
            pbVar12 = pbVar4 + -0x18;
            if ((*pbVar12 & 1) != 0) {
              operator_delete(*(void **)(pbVar4 + -8));
            }
            pbVar4 = pbVar12;
          } while (pbVar10 != pbVar12);
          pbVar4 = *(byte **)pvVar8;
        }
        *(byte **)(pvVar11 + -0x10) = pbVar10;
        operator_delete(pbVar4);
      }
      pvVar11 = pvVar8;
    } while (pvVar8 != pvVar9);
  }
  if (pvVar9 == (vector *)0x0) {
    return;
  }
  operator_delete(pvVar9);
  return;
}

