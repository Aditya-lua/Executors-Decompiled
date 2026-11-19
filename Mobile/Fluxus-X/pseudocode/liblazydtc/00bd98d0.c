/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bd98d0
 */

void FUN_00bd98d0(long param_1,locale *param_2)

{
  byte bVar1;
  undefined4 uVar2;
  long *plVar3;
  undefined8 uVar4;
  long lVar5;
  
  plVar3 = (long *)std::__ndk1::locale::use_facet
                             (param_2,(id *)&std::__ndk1::codecvt<wchar_t,char,mbstate_t>::id);
  lVar5 = *plVar3;
  *(long **)(param_1 + 0x48) = plVar3;
  uVar2 = (**(code **)(lVar5 + 0x30))();
  *(undefined4 *)(param_1 + 0x58) = uVar2;
  bVar1 = (**(code **)(**(long **)(param_1 + 0x48) + 0x38))(*(long **)(param_1 + 0x48));
  *(byte *)(param_1 + 0x61) = bVar1 & 1;
  if (*(int *)(param_1 + 0x58) < 9) {
    return;
  }
  uVar4 = std::__ndk1::__throw_runtime_error("unsupported locale for standard input");
  FUN_00bd9a94(uVar4,0);
  return;
}

