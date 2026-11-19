/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0097e9f0
 */

/* std::__ndk1::basic_filebuf<char, std::__ndk1::char_traits<char> >::setbuf(char*, long) */

basic_filebuf<char,std::__ndk1::char_traits<char>> * __thiscall
std::__ndk1::basic_filebuf<char,std::__ndk1::char_traits<char>>::setbuf
          (basic_filebuf<char,std::__ndk1::char_traits<char>> *this,char *param_1,long param_2)

{
  basic_filebuf<char,std::__ndk1::char_traits<char>> bVar1;
  void *pvVar2;
  
  *(undefined8 *)(this + 0x28) = 0;
  *(undefined8 *)(this + 0x20) = 0;
  *(undefined8 *)(this + 0x38) = 0;
  *(undefined8 *)(this + 0x30) = 0;
  *(undefined8 *)(this + 0x18) = 0;
  *(undefined8 *)(this + 0x10) = 0;
  if ((this[0xa0] != (basic_filebuf<char,std::__ndk1::char_traits<char>>)0x0) &&
     (*(void **)(this + 0x40) != (void *)0x0)) {
    operator_delete__(*(void **)(this + 0x40));
  }
  if ((this[0xa1] != (basic_filebuf<char,std::__ndk1::char_traits<char>>)0x0) &&
     (*(void **)(this + 0x68) != (void *)0x0)) {
    operator_delete__(*(void **)(this + 0x68));
  }
  *(long *)(this + 0x60) = param_2;
  if ((ulong)param_2 < 9) {
    bVar1 = this[0xa2];
    *(basic_filebuf<char,std::__ndk1::char_traits<char>> **)(this + 0x40) = this + 0x58;
    *(undefined8 *)(this + 0x60) = 8;
    this[0xa0] = (basic_filebuf<char,std::__ndk1::char_traits<char>>)0x0;
  }
  else {
    bVar1 = this[0xa2];
    if ((param_1 != (char *)0x0) &&
       (bVar1 != (basic_filebuf<char,std::__ndk1::char_traits<char>>)0x0)) {
      *(char **)(this + 0x40) = param_1;
      this[0xa0] = (basic_filebuf<char,std::__ndk1::char_traits<char>>)0x0;
      goto LAB_0097ea80;
    }
    pvVar2 = operator_new__(param_2);
    *(void **)(this + 0x40) = pvVar2;
    this[0xa0] = (basic_filebuf<char,std::__ndk1::char_traits<char>>)0x1;
  }
  if (bVar1 == (basic_filebuf<char,std::__ndk1::char_traits<char>>)0x0) {
    if (param_2 < 9) {
      param_2 = 8;
    }
    *(long *)(this + 0x70) = param_2;
    if ((param_1 == (char *)0x0) || ((ulong)param_2 < 8)) {
      pvVar2 = operator_new__(param_2);
      *(void **)(this + 0x68) = pvVar2;
      this[0xa1] = (basic_filebuf<char,std::__ndk1::char_traits<char>>)0x1;
      return this;
    }
    *(char **)(this + 0x68) = param_1;
    this[0xa1] = (basic_filebuf<char,std::__ndk1::char_traits<char>>)0x0;
    return this;
  }
LAB_0097ea80:
  this[0xa1] = (basic_filebuf<char,std::__ndk1::char_traits<char>>)0x0;
  *(undefined8 *)(this + 0x68) = 0;
  *(undefined8 *)(this + 0x70) = 0;
  return this;
}

