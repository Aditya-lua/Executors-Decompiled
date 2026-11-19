/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c0d35c
 */

/* std::__ndk1::__match_any_but_newline<char>::__exec(std::__ndk1::__state<char>&) const */

void __thiscall
std::__ndk1::__match_any_but_newline<char>::__exec
          (__match_any_but_newline<char> *this,__state *param_1)

{
  char *pcVar1;
  undefined8 uVar2;
  
  pcVar1 = *(char **)(param_1 + 0x10);
  if (((pcVar1 == *(char **)(param_1 + 0x18)) || (*pcVar1 == '\r')) || (*pcVar1 == '\n')) {
    *(undefined8 *)(param_1 + 0x50) = 0;
    *(undefined4 *)param_1 = 0xfffffc1f;
    return;
  }
  uVar2 = *(undefined8 *)(this + 8);
  *(undefined4 *)param_1 = 0xfffffc1d;
  *(char **)(param_1 + 0x10) = pcVar1 + 1;
  *(undefined8 *)(param_1 + 0x50) = uVar2;
  return;
}

