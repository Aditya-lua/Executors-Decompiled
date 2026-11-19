/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0098b34c
 */

/* ix::CaseInsensitiveLess::NocaseCompare::TEMPNAMEPLACEHOLDERVALUE(unsigned char const&, unsigned
   char const&) const */

bool __thiscall
ix::CaseInsensitiveLess::NocaseCompare::operator()
          (NocaseCompare *this,uchar *param_1,uchar *param_2)

{
  int iVar1;
  int iVar2;
  
  iVar1 = tolower((uint)*param_1);
  iVar2 = tolower((uint)*param_2);
  return iVar1 < iVar2;
}

