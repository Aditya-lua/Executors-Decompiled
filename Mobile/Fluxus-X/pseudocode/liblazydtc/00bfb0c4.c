/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bfb0c4
 */

/* std::__ndk1::locale::locale(std::__ndk1::locale const&, char const*, int) */

void __thiscall std::__ndk1::locale::locale(locale *this,locale *param_1,char *param_2,int param_3)

{
  ulong uVar1;
  void *pvVar2;
  size_t __n;
  undefined8 uVar3;
  void *__dest;
  ulong local_68;
  size_t local_60;
  void *local_58;
  
  if (param_2 == (char *)0x0) {
    __throw_runtime_error("locale constructed with null");
LAB_00bfb1e0:
                    /* WARNING: Subroutine does not return */
                    /* try { // try from 00bfb1e0 to 00bfb1e3 has its CatchHandler @ 00bfb204 */
    FUN_007fe124();
  }
  pvVar2 = operator_new(0x138);
  uVar3 = *(undefined8 *)param_1;
  __n = strlen(param_2);
  if (0xfffffffffffffff7 < __n) goto LAB_00bfb1e0;
  if (__n < 0x17) {
    __dest = (void *)((ulong)&local_68 | 1);
    local_68 = CONCAT71(local_68._1_7_,(char)((int)__n << 1));
    if (__n == 0) goto LAB_00bfb174;
  }
  else {
    uVar1 = 0x1a;
    if ((__n | 7) != 0x17) {
      uVar1 = (__n | 7) + 1;
    }
                    /* try { // try from 00bfb14c to 00bfb153 has its CatchHandler @ 00bfb204 */
    __dest = operator_new(uVar1);
    local_68 = uVar1 | 1;
    local_60 = __n;
    local_58 = __dest;
  }
  memcpy(__dest,param_2,__n);
LAB_00bfb174:
  *(undefined1 *)((long)__dest + __n) = 0;
                    /* try { // try from 00bfb178 to 00bfb18b has its CatchHandler @ 00bfb1e4 */
  FUN_00bf7758(pvVar2,uVar3,&local_68,param_3);
  if ((local_68 & 1) != 0) {
    operator_delete(local_58,local_68 & 0xfffffffffffffffe);
  }
  *(void **)this = pvVar2;
  FUN_00c2bce0(1,(long)pvVar2 + 8);
  return;
}

