/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00be3688
 */

/* std::__ndk1::__num_get<char>::__stage2_int_prep(std::__ndk1::ios_base&, char*, char&) */

void __thiscall
std::__ndk1::__num_get<char>::__stage2_int_prep
          (__num_get<char> *this,ios_base *param_1,char *param_2,char *param_3)

{
  long lVar1;
  long lVar2;
  char cVar3;
  long *plVar4;
  long local_58;
  undefined8 *local_50;
  undefined8 ***local_48;
  undefined8 **local_28;
  
  ios_base::getloc();
  lVar2 = local_58;
  local_50 = &ctype<char>::id;
  if (ctype<char>::id != -1) {
    local_28 = &local_50;
    local_48 = &local_28;
                    /* try { // try from 00be36e4 to 00be3737 has its CatchHandler @ 00be37f0 */
    __call_once((ulong *)&ctype<char>::id,&local_48,(_func_void_void_ptr *)&LAB_00c0bab0);
  }
  lVar1 = *(long *)(lVar2 + 0x10);
  if (((ulong)(*(long *)(lVar2 + 0x18) - lVar1 >> 3) <= (long)DAT_00d27278 - 1U) ||
     (plVar4 = *(long **)(lVar1 + ((long)DAT_00d27278 - 1U) * 8), plVar4 == (long *)0x0)) {
                    /* WARNING: Subroutine does not return */
                    /* try { // try from 00be37e8 to 00be37eb has its CatchHandler @ 00be37f0 */
    FUN_00bd8968();
  }
  (**(code **)(*plVar4 + 0x40))(plVar4,"0123456789abcdefABCDEFxX+-pPiInN","pPiInN",param_1);
  local_50 = &numpunct<char>::id;
  if (numpunct<char>::id != -1) {
    local_28 = &local_50;
    local_48 = &local_28;
                    /* try { // try from 00be3764 to 00be37c3 has its CatchHandler @ 00be37f4 */
    __call_once((ulong *)&numpunct<char>::id,&local_48,(_func_void_void_ptr *)&LAB_00c0bab0);
  }
  if (((ulong)(*(long *)(local_58 + 0x18) - *(long *)(local_58 + 0x10) >> 3) <=
       (long)DAT_00d272e8 - 1U) ||
     (plVar4 = *(long **)(*(long *)(local_58 + 0x10) + ((long)DAT_00d272e8 - 1U) * 8),
     plVar4 == (long *)0x0)) {
                    /* WARNING: Subroutine does not return */
                    /* try { // try from 00be37ec to 00be37ef has its CatchHandler @ 00be37f4 */
    FUN_00bd8968();
  }
  cVar3 = (**(code **)(*plVar4 + 0x20))(plVar4);
  *param_2 = cVar3;
  (**(code **)(*plVar4 + 0x28))(plVar4);
  locale::~locale((locale *)&local_58);
  return;
}

