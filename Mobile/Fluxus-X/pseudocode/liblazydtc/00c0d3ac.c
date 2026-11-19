/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c0d3ac
 */

/* std::__ndk1::__match_any_but_newline<wchar_t>::__exec(std::__ndk1::__state<wchar_t>&) const */

void __thiscall
std::__ndk1::__match_any_but_newline<wchar_t>::__exec
          (__match_any_but_newline<wchar_t> *this,__state *param_1)

{
  int *piVar1;
  int iVar2;
  undefined8 uVar3;
  
  piVar1 = *(int **)(param_1 + 0x10);
  if ((piVar1 == *(int **)(param_1 + 0x18)) ||
     (iVar2 = *piVar1, (iVar2 - 0x2028U < 2 || iVar2 == 0xd) || iVar2 == 10)) {
    *(undefined8 *)(param_1 + 0x50) = 0;
    *(undefined4 *)param_1 = 0xfffffc1f;
    return;
  }
  uVar3 = *(undefined8 *)(this + 8);
  *(undefined4 *)param_1 = 0xfffffc1d;
  *(int **)(param_1 + 0x10) = piVar1 + 1;
  *(undefined8 *)(param_1 + 0x50) = uVar3;
  return;
}

