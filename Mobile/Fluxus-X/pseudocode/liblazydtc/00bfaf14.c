/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bfaf14
 */

/* std::__ndk1::locale::locale(char const*) */

void __thiscall std::__ndk1::locale::locale(locale *this,char *param_1)

{
  ulong uVar1;
  void *pvVar2;
  size_t __n;
  void *__dest;
  ulong local_58;
  size_t local_50;
  void *local_48;
  
  if (param_1 == (char *)0x0) {
    __throw_runtime_error("locale constructed with null");
LAB_00bfb018:
                    /* WARNING: Subroutine does not return */
                    /* try { // try from 00bfb018 to 00bfb01b has its CatchHandler @ 00bfb03c */
    FUN_007fe124();
  }
  pvVar2 = operator_new(0x138);
  __n = strlen(param_1);
  if (0xfffffffffffffff7 < __n) goto LAB_00bfb018;
  if (__n < 0x17) {
    __dest = (void *)((ulong)&local_58 | 1);
    local_58 = CONCAT71(local_58._1_7_,(char)((int)__n << 1));
    if (__n == 0) goto LAB_00bfafb4;
  }
  else {
    uVar1 = 0x1a;
    if ((__n | 7) != 0x17) {
      uVar1 = (__n | 7) + 1;
    }
                    /* try { // try from 00bfaf8c to 00bfaf93 has its CatchHandler @ 00bfb03c */
    __dest = operator_new(uVar1);
    local_58 = uVar1 | 1;
    local_50 = __n;
    local_48 = __dest;
  }
  memcpy(__dest,param_1,__n);
LAB_00bfafb4:
  *(undefined1 *)((long)__dest + __n) = 0;
                    /* try { // try from 00bfafb8 to 00bfafc7 has its CatchHandler @ 00bfb01c */
  FUN_00bf52bc(pvVar2,&local_58,0);
  if ((local_58 & 1) != 0) {
    operator_delete(local_48,local_58 & 0xfffffffffffffffe);
  }
  *(void **)this = pvVar2;
  FUN_00c2bce0(1,(long)pvVar2 + 8);
  return;
}

