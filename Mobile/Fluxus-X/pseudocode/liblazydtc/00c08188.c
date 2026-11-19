/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c08188
 */

/* std::__ndk1::__time_get_storage<wchar_t>::__do_date_order() const */

undefined8 __thiscall
std::__ndk1::__time_get_storage<wchar_t>::__do_date_order(__time_get_storage<wchar_t> *this)

{
  ulong uVar1;
  __time_get_storage<wchar_t> *p_Var2;
  int iVar3;
  __time_get_storage<wchar_t> _Var4;
  uint uVar5;
  ulong uVar6;
  
  _Var4 = this[0x3f8];
  uVar1 = (ulong)((byte)_Var4 >> 1);
  if (((byte)_Var4 & 1) != 0) {
    uVar1 = *(ulong *)(this + 0x400);
  }
  if (uVar1 == 0) {
    uVar5 = 0;
  }
  else {
    uVar6 = 0;
    p_Var2 = this + 0x3fc;
    if (((byte)_Var4 & 1) != 0) {
      p_Var2 = *(__time_get_storage<wchar_t> **)(this + 0x408);
    }
    do {
      uVar5 = (uint)uVar6;
      if (*(int *)(p_Var2 + uVar6 * 4) == 0x25) break;
      uVar5 = uVar5 + 1;
      uVar6 = (ulong)uVar5;
    } while (uVar6 < uVar1);
  }
  p_Var2 = this + 0x3fc;
  if (((byte)_Var4 & 1) != 0) {
    p_Var2 = *(__time_get_storage<wchar_t> **)(this + 0x408);
  }
  iVar3 = *(int *)(p_Var2 + (ulong)(uVar5 + 1) * 4);
  if (iVar3 < 0x6d) {
    if (iVar3 != 0x59) {
      if (iVar3 != 100) {
        return 0;
      }
      uVar5 = uVar5 + 2;
      while ((uVar6 = (ulong)uVar5, uVar6 < uVar1 && (*(int *)(p_Var2 + uVar6 * 4) != 0x25))) {
        uVar5 = uVar5 + 1;
      }
      if (uVar1 == uVar6) {
        return 0;
      }
      if (*(int *)(p_Var2 + (ulong)(uVar5 + 1) * 4) != 0x6d) {
        return 0;
      }
      uVar5 = uVar5 + 2;
      while ((uVar6 = (ulong)uVar5, uVar6 < uVar1 && (*(int *)(p_Var2 + uVar6 * 4) != 0x25))) {
        uVar5 = uVar5 + 1;
      }
      if (uVar1 == uVar6) {
        return 0;
      }
      if (*(int *)(p_Var2 + (ulong)(uVar5 + 1) * 4) == 0x79) {
        return 1;
      }
      if (*(int *)(p_Var2 + (ulong)(uVar5 + 1) * 4) == 0x59) {
        return 1;
      }
      return 0;
    }
  }
  else {
    if (iVar3 == 0x6d) {
      uVar5 = uVar5 + 2;
      while ((uVar6 = (ulong)uVar5, uVar6 < uVar1 && (*(int *)(p_Var2 + uVar6 * 4) != 0x25))) {
        uVar5 = uVar5 + 1;
      }
      if (uVar1 == uVar6) {
        return 0;
      }
      if (*(int *)(p_Var2 + (ulong)(uVar5 + 1) * 4) != 100) {
        return 0;
      }
      uVar5 = uVar5 + 2;
      while ((uVar6 = (ulong)uVar5, uVar6 < uVar1 && (*(int *)(p_Var2 + uVar6 * 4) != 0x25))) {
        uVar5 = uVar5 + 1;
      }
      if (uVar1 == uVar6) {
        return 0;
      }
      if (*(int *)(p_Var2 + (ulong)(uVar5 + 1) * 4) == 0x79) {
        return 2;
      }
      if (*(int *)(p_Var2 + (ulong)(uVar5 + 1) * 4) == 0x59) {
        return 2;
      }
      return 0;
    }
    if (iVar3 != 0x79) {
      return 0;
    }
  }
  uVar5 = uVar5 + 2;
  while ((uVar6 = (ulong)uVar5, uVar6 < uVar1 && (*(int *)(p_Var2 + uVar6 * 4) != 0x25))) {
    uVar5 = uVar5 + 1;
  }
  if (uVar1 != uVar6) {
    if (*(int *)(p_Var2 + (ulong)(uVar5 + 1) * 4) == 100) {
      uVar5 = uVar5 + 2;
      while ((uVar6 = (ulong)uVar5, uVar6 < uVar1 && (*(int *)(p_Var2 + uVar6 * 4) != 0x25))) {
        uVar5 = uVar5 + 1;
      }
      if ((uVar1 != uVar6) && (*(int *)(p_Var2 + (ulong)(uVar5 + 1) * 4) == 0x6d)) {
        return 4;
      }
    }
    else if (*(int *)(p_Var2 + (ulong)(uVar5 + 1) * 4) == 0x6d) {
      uVar5 = uVar5 + 2;
      while ((uVar6 = (ulong)uVar5, uVar6 < uVar1 && (*(int *)(p_Var2 + uVar6 * 4) != 0x25))) {
        uVar5 = uVar5 + 1;
      }
      if ((uVar1 != uVar6) && (*(int *)(p_Var2 + (ulong)(uVar5 + 1) * 4) == 100)) {
        return 3;
      }
    }
  }
  return 0;
}

