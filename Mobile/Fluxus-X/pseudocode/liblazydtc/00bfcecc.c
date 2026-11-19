/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bfcecc
 */

/* std::__ndk1::ctype<char>::do_widen(char const*, char const*, char*) const */

char * __thiscall
std::__ndk1::ctype<char>::do_widen(ctype<char> *this,char *param_1,char *param_2,char *param_3)

{
  char *pcVar1;
  char *pcVar2;
  ulong uVar3;
  ulong uVar4;
  char *pcVar5;
  ulong uVar6;
  undefined8 uVar7;
  undefined8 uVar8;
  undefined8 uVar9;
  
  if (param_1 == param_2) {
    return param_1;
  }
  uVar3 = (long)param_2 - (long)param_1;
  if ((0x1f < uVar3) && (0x1f < (ulong)((long)param_3 - (long)param_1))) {
    uVar4 = uVar3 & 0xffffffffffffffe0;
    pcVar2 = param_1 + 0x10;
    pcVar5 = param_3 + 0x10;
    param_1 = param_1 + uVar4;
    uVar6 = uVar4;
    do {
      pcVar1 = pcVar2 + -8;
      uVar7 = *(undefined8 *)(pcVar2 + -0x10);
      uVar9 = *(undefined8 *)(pcVar2 + 8);
      uVar8 = *(undefined8 *)pcVar2;
      uVar6 = uVar6 - 0x20;
      pcVar2 = pcVar2 + 0x20;
      *(undefined8 *)(pcVar5 + -8) = *(undefined8 *)pcVar1;
      *(undefined8 *)(pcVar5 + -0x10) = uVar7;
      *(undefined8 *)(pcVar5 + 8) = uVar9;
      *(undefined8 *)pcVar5 = uVar8;
      pcVar5 = pcVar5 + 0x20;
    } while (uVar6 != 0);
    param_3 = param_3 + uVar4;
    if (uVar3 == uVar4) {
      return param_1;
    }
  }
  do {
    pcVar2 = param_1 + 1;
    *param_3 = *param_1;
    param_1 = pcVar2;
    param_3 = param_3 + 1;
  } while (pcVar2 != param_2);
  return pcVar2;
}

