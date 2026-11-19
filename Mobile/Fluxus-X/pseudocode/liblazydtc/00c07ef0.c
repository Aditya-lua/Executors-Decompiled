/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c07ef0
 */

/* std::__ndk1::__time_get_storage<char>::__do_date_order() const */

undefined8 __thiscall
std::__ndk1::__time_get_storage<char>::__do_date_order(__time_get_storage<char> *this)

{
  ulong uVar1;
  __time_get_storage<char> *p_Var2;
  __time_get_storage<char> _Var3;
  uint uVar4;
  ulong uVar5;
  
  _Var3 = this[0x3f8];
  uVar1 = (ulong)((byte)_Var3 >> 1);
  if (((byte)_Var3 & 1) != 0) {
    uVar1 = *(ulong *)(this + 0x400);
  }
  if (uVar1 == 0) {
    uVar4 = 0;
  }
  else {
    uVar5 = 0;
    p_Var2 = this + 0x3f9;
    if (((byte)_Var3 & 1) != 0) {
      p_Var2 = *(__time_get_storage<char> **)(this + 0x408);
    }
    do {
      uVar4 = (uint)uVar5;
      if (p_Var2[uVar5] == (__time_get_storage<char>)0x25) break;
      uVar4 = uVar4 + 1;
      uVar5 = (ulong)uVar4;
    } while (uVar5 < uVar1);
  }
  p_Var2 = this + 0x3f9;
  if (((byte)_Var3 & 1) != 0) {
    p_Var2 = *(__time_get_storage<char> **)(this + 0x408);
  }
  _Var3 = p_Var2[uVar4 + 1];
  if ((byte)_Var3 < 0x6d) {
    if (_Var3 != (__time_get_storage<char>)0x59) {
      if (_Var3 != (__time_get_storage<char>)0x64) {
        return 0;
      }
      for (uVar4 = uVar4 + 2;
          (uVar5 = (ulong)uVar4, uVar5 < uVar1 && (p_Var2[uVar5] != (__time_get_storage<char>)0x25))
          ; uVar4 = uVar4 + 1) {
      }
      if (uVar1 == uVar5) {
        return 0;
      }
      if (p_Var2[uVar4 + 1] != (__time_get_storage<char>)0x6d) {
        return 0;
      }
      for (uVar4 = uVar4 + 2;
          (uVar5 = (ulong)uVar4, uVar5 < uVar1 && (p_Var2[uVar5] != (__time_get_storage<char>)0x25))
          ; uVar4 = uVar4 + 1) {
      }
      if (uVar1 == uVar5) {
        return 0;
      }
      if (p_Var2[uVar4 + 1] == (__time_get_storage<char>)0x79) {
        return 1;
      }
      if (p_Var2[uVar4 + 1] == (__time_get_storage<char>)0x59) {
        return 1;
      }
      return 0;
    }
  }
  else {
    if (_Var3 == (__time_get_storage<char>)0x6d) {
      for (uVar4 = uVar4 + 2;
          (uVar5 = (ulong)uVar4, uVar5 < uVar1 && (p_Var2[uVar5] != (__time_get_storage<char>)0x25))
          ; uVar4 = uVar4 + 1) {
      }
      if (uVar1 == uVar5) {
        return 0;
      }
      if (p_Var2[uVar4 + 1] != (__time_get_storage<char>)0x64) {
        return 0;
      }
      for (uVar4 = uVar4 + 2;
          (uVar5 = (ulong)uVar4, uVar5 < uVar1 && (p_Var2[uVar5] != (__time_get_storage<char>)0x25))
          ; uVar4 = uVar4 + 1) {
      }
      if (uVar1 == uVar5) {
        return 0;
      }
      if (p_Var2[uVar4 + 1] == (__time_get_storage<char>)0x79) {
        return 2;
      }
      if (p_Var2[uVar4 + 1] == (__time_get_storage<char>)0x59) {
        return 2;
      }
      return 0;
    }
    if (_Var3 != (__time_get_storage<char>)0x79) {
      return 0;
    }
  }
  for (uVar4 = uVar4 + 2;
      (uVar5 = (ulong)uVar4, uVar5 < uVar1 && (p_Var2[uVar5] != (__time_get_storage<char>)0x25));
      uVar4 = uVar4 + 1) {
  }
  if (uVar1 != uVar5) {
    if (p_Var2[uVar4 + 1] == (__time_get_storage<char>)0x64) {
      for (uVar4 = uVar4 + 2;
          (uVar5 = (ulong)uVar4, uVar5 < uVar1 && (p_Var2[uVar5] != (__time_get_storage<char>)0x25))
          ; uVar4 = uVar4 + 1) {
      }
      if ((uVar1 != uVar5) && (p_Var2[uVar4 + 1] == (__time_get_storage<char>)0x6d)) {
        return 4;
      }
    }
    else if (p_Var2[uVar4 + 1] == (__time_get_storage<char>)0x6d) {
      for (uVar4 = uVar4 + 2;
          (uVar5 = (ulong)uVar4, uVar5 < uVar1 && (p_Var2[uVar5] != (__time_get_storage<char>)0x25))
          ; uVar4 = uVar4 + 1) {
      }
      if ((uVar1 != uVar5) && (p_Var2[uVar4 + 1] == (__time_get_storage<char>)0x64)) {
        return 3;
      }
    }
  }
  return 0;
}

