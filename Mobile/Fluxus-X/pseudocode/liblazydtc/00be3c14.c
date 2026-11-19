/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00be3c14
 */

/* std::__ndk1::__num_get<wchar_t>::__stage2_int_prep(std::__ndk1::ios_base&, wchar_t*, wchar_t&) */

void __thiscall
std::__ndk1::__num_get<wchar_t>::__stage2_int_prep
          (__num_get<wchar_t> *this,ios_base *param_1,wchar_t *param_2,wchar_t *param_3)

{
  long lVar1;
  long lVar2;
  wchar_t wVar3;
  long *plVar4;
  long local_58;
  undefined8 *local_50;
  undefined8 ***local_48;
  undefined8 **local_28;
  
  ios_base::getloc();
  lVar2 = local_58;
  local_50 = &ctype<wchar_t>::id;
  if (ctype<wchar_t>::id != -1) {
    local_28 = &local_50;
    local_48 = &local_28;
                    /* try { // try from 00be3c70 to 00be3cc3 has its CatchHandler @ 00be3d7c */
    __call_once((ulong *)&ctype<wchar_t>::id,&local_48,(_func_void_void_ptr *)&LAB_00c0bab0);
  }
  lVar1 = *(long *)(lVar2 + 0x10);
  if (((ulong)(*(long *)(lVar2 + 0x18) - lVar1 >> 3) <= (long)DAT_00d27268 - 1U) ||
     (plVar4 = *(long **)(lVar1 + ((long)DAT_00d27268 - 1U) * 8), plVar4 == (long *)0x0)) {
                    /* WARNING: Subroutine does not return */
                    /* try { // try from 00be3d74 to 00be3d77 has its CatchHandler @ 00be3d7c */
    FUN_00bd8968();
  }
  (**(code **)(*plVar4 + 0x60))(plVar4,"0123456789abcdefABCDEFxX+-pPiInN","pPiInN",param_1);
  local_50 = &numpunct<wchar_t>::id;
  if (numpunct<wchar_t>::id != -1) {
    local_28 = &local_50;
    local_48 = &local_28;
                    /* try { // try from 00be3cf0 to 00be3d4f has its CatchHandler @ 00be3d80 */
    __call_once((ulong *)&numpunct<wchar_t>::id,&local_48,(_func_void_void_ptr *)&LAB_00c0bab0);
  }
  if (((ulong)(*(long *)(local_58 + 0x18) - *(long *)(local_58 + 0x10) >> 3) <=
       (long)DAT_00d272f8 - 1U) ||
     (plVar4 = *(long **)(*(long *)(local_58 + 0x10) + ((long)DAT_00d272f8 - 1U) * 8),
     plVar4 == (long *)0x0)) {
                    /* WARNING: Subroutine does not return */
                    /* try { // try from 00be3d78 to 00be3d7b has its CatchHandler @ 00be3d80 */
    FUN_00bd8968();
  }
  wVar3 = (**(code **)(*plVar4 + 0x20))(plVar4);
  *param_2 = wVar3;
  (**(code **)(*plVar4 + 0x28))(plVar4);
  locale::~locale((locale *)&local_58);
  return;
}

