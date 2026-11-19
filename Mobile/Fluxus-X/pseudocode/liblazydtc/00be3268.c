/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00be3268
 */

/* std::__ndk1::__num_get<char>::__stage2_float_prep(std::__ndk1::ios_base&, char*, char&, char&) */

void __thiscall
std::__ndk1::__num_get<char>::__stage2_float_prep
          (__num_get<char> *this,ios_base *param_1,char *param_2,char *param_3,char *param_4)

{
  long lVar1;
  long lVar2;
  char cVar3;
  long *plVar4;
  long local_60;
  undefined8 *local_58;
  undefined8 ***local_50;
  undefined8 **local_48;
  
  ios_base::getloc();
  lVar2 = local_60;
  local_58 = &ctype<char>::id;
  if (ctype<char>::id != -1) {
    local_48 = &local_58;
    local_50 = &local_48;
                    /* try { // try from 00be32c8 to 00be331b has its CatchHandler @ 00be33e8 */
    __call_once((ulong *)&ctype<char>::id,&local_50,(_func_void_void_ptr *)&LAB_00c0bab0);
  }
  lVar1 = *(long *)(lVar2 + 0x10);
  if (((ulong)(*(long *)(lVar2 + 0x18) - lVar1 >> 3) <= (long)DAT_00d27278 - 1U) ||
     (plVar4 = *(long **)(lVar1 + ((long)DAT_00d27278 - 1U) * 8), plVar4 == (long *)0x0)) {
                    /* WARNING: Subroutine does not return */
                    /* try { // try from 00be33e0 to 00be33e3 has its CatchHandler @ 00be33e8 */
    FUN_00bd8968();
  }
  (**(code **)(*plVar4 + 0x40))(plVar4,"0123456789abcdefABCDEFxX+-pPiInN","iInN",param_1);
  local_58 = &numpunct<char>::id;
  if (numpunct<char>::id != -1) {
    local_48 = &local_58;
    local_50 = &local_48;
                    /* try { // try from 00be3348 to 00be33bb has its CatchHandler @ 00be33ec */
    __call_once((ulong *)&numpunct<char>::id,&local_50,(_func_void_void_ptr *)&LAB_00c0bab0);
  }
  if (((ulong)(*(long *)(local_60 + 0x18) - *(long *)(local_60 + 0x10) >> 3) <=
       (long)DAT_00d272e8 - 1U) ||
     (plVar4 = *(long **)(*(long *)(local_60 + 0x10) + ((long)DAT_00d272e8 - 1U) * 8),
     plVar4 == (long *)0x0)) {
                    /* WARNING: Subroutine does not return */
                    /* try { // try from 00be33e4 to 00be33e7 has its CatchHandler @ 00be33ec */
    FUN_00bd8968();
  }
  cVar3 = (**(code **)(*plVar4 + 0x18))(plVar4);
  *param_2 = cVar3;
  cVar3 = (**(code **)(*plVar4 + 0x20))(plVar4);
  *param_3 = cVar3;
  (**(code **)(*plVar4 + 0x28))(plVar4);
  locale::~locale((locale *)&local_60);
  return;
}

