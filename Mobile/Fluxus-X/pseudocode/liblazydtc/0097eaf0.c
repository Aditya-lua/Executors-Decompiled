/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0097eaf0
 */

/* std::__ndk1::basic_filebuf<char, std::__ndk1::char_traits<char> >::seekoff(long long,
   std::__ndk1::ios_base::seekdir, unsigned int) */

undefined1  [16]
std::__ndk1::basic_filebuf<char,std::__ndk1::char_traits<char>>::seekoff
          (long *param_1,long param_2,uint param_3)

{
  int iVar1;
  int iVar2;
  bad_cast *this;
  __off_t _Var3;
  long lVar4;
  undefined1 auVar5 [16];
  
  if ((long *)param_1[0x10] == (long *)0x0) {
    this = (bad_cast *)__cxa_allocate_exception(8);
    bad_cast::bad_cast(this);
                    /* WARNING: Subroutine does not return */
    __cxa_throw(this,&bad_cast::typeinfo,bad_cast::~bad_cast);
  }
  iVar1 = (**(code **)(*(long *)param_1[0x10] + 0x30))();
  if ((param_1[0xf] != 0) && ((param_2 == 0 || (0 < iVar1)))) {
    iVar2 = (**(code **)(*param_1 + 0x30))(param_1);
    _Var3 = -1;
    if (iVar2 != 0) {
      lVar4 = 0;
      goto LAB_0097eb84;
    }
    lVar4 = 0;
    if (2 < param_3) goto LAB_0097eb84;
    _Var3 = iVar1 * param_2;
    if (iVar1 < 1) {
      _Var3 = 0;
    }
    iVar1 = fseeko((FILE *)param_1[0xf],_Var3,param_3);
    if (iVar1 == 0) {
      _Var3 = ftello((FILE *)param_1[0xf]);
      lVar4 = param_1[0x11];
      goto LAB_0097eb84;
    }
  }
  lVar4 = 0;
  _Var3 = -1;
LAB_0097eb84:
  auVar5._8_8_ = _Var3;
  auVar5._0_8_ = lVar4;
  return auVar5;
}

