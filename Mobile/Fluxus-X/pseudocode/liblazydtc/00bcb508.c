/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bcb508
 */

/* std::__ndk1::system_error::system_error(std::__ndk1::error_code, char const*) */

void __thiscall
std::__ndk1::system_error::system_error
          (system_error *this,undefined8 param_2,undefined8 param_3,char *param_4)

{
  ulong uVar1;
  size_t __n;
  void *__dest;
  ulong local_80;
  size_t local_78;
  void *local_70;
  basic_string_conflict local_68;
  undefined7 uStack_67;
  void *local_58;
  undefined8 local_50;
  undefined8 uStack_48;
  
  local_50 = param_2;
  uStack_48 = param_3;
  __n = strlen(param_4);
  if (0xfffffffffffffff7 < __n) {
                    /* WARNING: Subroutine does not return */
    FUN_007fe124();
  }
  if (__n < 0x17) {
    __dest = (void *)((ulong)&local_80 | 1);
    local_80 = CONCAT71(local_80._1_7_,(char)((int)__n << 1));
    if (__n == 0) goto LAB_00bcb59c;
  }
  else {
    uVar1 = 0x1a;
    if ((__n | 7) != 0x17) {
      uVar1 = (__n | 7) + 1;
    }
    __dest = operator_new(uVar1);
    local_80 = uVar1 | 1;
    local_78 = __n;
    local_70 = __dest;
  }
  memcpy(__dest,param_4,__n);
LAB_00bcb59c:
  *(undefined1 *)((long)__dest + __n) = 0;
                    /* try { // try from 00bcb5a0 to 00bcb5af has its CatchHandler @ 00bcb65c */
  FUN_00bcb424(&local_68,&local_50,&local_80);
                    /* try { // try from 00bcb5b0 to 00bcb5bb has its CatchHandler @ 00bcb624 */
  runtime_error::runtime_error((runtime_error *)this,&local_68);
  if (((byte)local_68 & 1) != 0) {
    operator_delete(local_58,CONCAT71(uStack_67,local_68) & 0xfffffffffffffffe);
  }
  if ((local_80 & 1) != 0) {
    operator_delete(local_70,local_80 & 0xfffffffffffffffe);
  }
  *(undefined ***)this = &PTR__system_error_00cac9e0;
  *(undefined8 *)(this + 0x18) = uStack_48;
  *(undefined8 *)(this + 0x10) = local_50;
  return;
}

