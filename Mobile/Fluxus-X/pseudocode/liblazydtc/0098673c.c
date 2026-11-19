/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0098673c
 */

/* ix::DNSLookup::DNSLookup(std::__ndk1::basic_string<char, std::__ndk1::char_traits<char>,
   std::__ndk1::allocator<char> > const&, int, long) */

void __thiscall
ix::DNSLookup::DNSLookup(DNSLookup *this,basic_string_conflict *param_1,int param_2,long param_3)

{
  DNSLookup *pDVar1;
  DNSLookup *__dest;
  ulong __n;
  void *__src;
  ulong uVar2;
  undefined8 uVar3;
  
  *(undefined8 *)(this + 0x20) = 0;
  pDVar1 = this + 0x10;
  *(undefined8 *)(this + 0x18) = 0;
  *(undefined8 *)pDVar1 = 0;
  *(undefined8 *)(this + 8) = 0;
  *(undefined8 *)this = 0;
  if (((byte)*param_1 & 1) == 0) {
    *(undefined8 *)(this + 0x20) = *(undefined8 *)(param_1 + 0x10);
    uVar3 = *(undefined8 *)param_1;
    *(undefined8 *)(this + 0x18) = *(undefined8 *)(param_1 + 8);
    *(undefined8 *)pDVar1 = uVar3;
    goto LAB_009867ec;
  }
  __n = *(ulong *)(param_1 + 8);
  if (0xffffffffffffffef < __n) {
                    /* try { // try from 0098681c to 00986823 has its CatchHandler @ 00986824 */
                    /* WARNING: Subroutine does not return */
    std::__ndk1::__basic_string_common<true>::__throw_length_error();
  }
  __src = *(void **)(param_1 + 0x10);
  if (__n < 0x17) {
    __dest = this + 0x11;
    *pDVar1 = SUB41((int)__n << 1,0);
    if (__n != 0) goto LAB_009867d8;
  }
  else {
    uVar2 = __n + 0x10 & 0xfffffffffffffff0;
                    /* try { // try from 009867c0 to 009867c7 has its CatchHandler @ 00986824 */
    __dest = operator_new(uVar2);
    *(ulong *)(this + 0x18) = __n;
    *(DNSLookup **)(this + 0x20) = __dest;
    *(ulong *)(this + 0x10) = uVar2 | 1;
LAB_009867d8:
    memcpy(__dest,__src,__n);
  }
  __dest[__n] = (DNSLookup)0x0;
LAB_009867ec:
  *(int *)(this + 0x28) = param_2;
  *(long *)(this + 0x30) = param_3;
  memset(this + 0x38,0,0x79);
  return;
}

