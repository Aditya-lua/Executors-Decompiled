/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bcb86c
 */

/* std::__ndk1::system_error::system_error(int, std::__ndk1::error_category const&, char const*) */

void __thiscall
std::__ndk1::system_error::system_error
          (system_error *this,int param_1,error_category *param_2,char *param_3)

{
  ulong uVar1;
  size_t __n;
  void *__dest;
  ulong local_90;
  size_t local_88;
  void *local_80;
  int local_78 [2];
  error_category *local_70;
  basic_string_conflict local_68;
  undefined7 uStack_67;
  void *local_58;
  
  local_78[0] = param_1;
  local_70 = param_2;
  __n = strlen(param_3);
  if (0xfffffffffffffff7 < __n) {
                    /* WARNING: Subroutine does not return */
    FUN_007fe124();
  }
  if (__n < 0x17) {
    __dest = (void *)((ulong)&local_90 | 1);
    local_90 = CONCAT71(local_90._1_7_,(char)((int)__n << 1));
    if (__n == 0) goto LAB_00bcb910;
  }
  else {
    uVar1 = 0x1a;
    if ((__n | 7) != 0x17) {
      uVar1 = (__n | 7) + 1;
    }
    __dest = operator_new(uVar1);
    local_90 = uVar1 | 1;
    local_88 = __n;
    local_80 = __dest;
  }
  memcpy(__dest,param_3,__n);
LAB_00bcb910:
  *(undefined1 *)((long)__dest + __n) = 0;
                    /* try { // try from 00bcb914 to 00bcb923 has its CatchHandler @ 00bcb9d4 */
  FUN_00bcb424(&local_68,local_78,&local_90);
                    /* try { // try from 00bcb924 to 00bcb92f has its CatchHandler @ 00bcb99c */
  runtime_error::runtime_error((runtime_error *)this,&local_68);
  if (((byte)local_68 & 1) != 0) {
    operator_delete(local_58,CONCAT71(uStack_67,local_68) & 0xfffffffffffffffe);
  }
  if ((local_90 & 1) != 0) {
    operator_delete(local_80,local_90 & 0xfffffffffffffffe);
  }
  *(int *)(this + 0x10) = param_1;
  *(undefined ***)this = &PTR__system_error_00cac9e0;
  *(error_category **)(this + 0x18) = param_2;
  return;
}

