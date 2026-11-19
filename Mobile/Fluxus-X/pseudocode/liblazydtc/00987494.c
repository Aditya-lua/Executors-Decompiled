/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00987494
 */

void FUN_00987494(pthread_t *param_1,undefined8 *param_2,undefined8 *param_3,undefined8 *param_4,
                 ulong *param_5,undefined4 *param_6)

{
  long *plVar1;
  undefined8 uVar2;
  undefined8 uVar3;
  undefined8 uVar4;
  long lVar5;
  undefined4 uVar6;
  char cVar7;
  bool bVar8;
  long lVar9;
  int iVar10;
  __thread_struct *this;
  undefined8 *__arg;
  undefined8 uVar11;
  void *__src;
  ulong __n;
  void *__dest;
  ulong uVar12;
  ulong local_80;
  ulong uStack_78;
  void *local_70;
  long local_68;
  
  lVar9 = tpidr_el0;
  local_68 = *(long *)(lVar9 + 0x28);
  this = operator_new(8);
                    /* try { // try from 009874e4 to 009874e7 has its CatchHandler @ 009876bc */
  std::__ndk1::__thread_struct::__thread_struct(this);
                    /* try { // try from 009874e8 to 009874f3 has its CatchHandler @ 009876a0 */
  __arg = operator_new(0x50);
  uVar2 = *param_2;
  uVar4 = param_2[1];
  uVar3 = *param_4;
  lVar5 = param_4[1];
  uVar11 = *param_3;
  if (lVar5 != 0) {
    plVar1 = (long *)(lVar5 + 0x10);
    do {
      cVar7 = '\x01';
      bVar8 = (bool)ExclusiveMonitorPass(plVar1,0x10);
      if (bVar8) {
        *plVar1 = *plVar1 + 1;
        cVar7 = ExclusiveMonitorsStatus();
      }
    } while (cVar7 != '\0');
  }
  uStack_78 = 0;
  local_70 = (void *)0x0;
  local_80 = 0;
  if ((*param_5 & 1) == 0) {
    local_70 = (void *)param_5[2];
    uStack_78 = param_5[1];
    local_80 = *param_5;
    goto LAB_009875b4;
  }
  __n = param_5[1];
  if (0xffffffffffffffef < __n) {
                    /* try { // try from 00987638 to 00987643 has its CatchHandler @ 00987644 */
                    /* WARNING: Subroutine does not return */
    std::__ndk1::__basic_string_common<true>::__throw_length_error();
  }
  __src = (void *)param_5[2];
  if (__n < 0x17) {
    __dest = (void *)((ulong)&local_80 | 1);
    local_80 = (ulong)(byte)((int)__n << 1);
    if (__n != 0) goto LAB_0098759c;
  }
  else {
    uVar12 = __n + 0x10 & 0xfffffffffffffff0;
                    /* try { // try from 00987580 to 00987587 has its CatchHandler @ 00987644 */
    __dest = operator_new(uVar12);
    local_80 = uVar12 | 1;
    uStack_78 = __n;
    local_70 = __dest;
LAB_0098759c:
    memcpy(__dest,__src,__n);
  }
  *(undefined1 *)((long)__dest + __n) = 0;
LAB_009875b4:
  uVar6 = *param_6;
  __arg[2] = uVar4;
  __arg[3] = uVar11;
  *__arg = this;
  __arg[1] = uVar2;
  __arg[4] = uVar3;
  __arg[5] = lVar5;
  __arg[8] = local_70;
  __arg[7] = uStack_78;
  __arg[6] = local_80;
  *(undefined4 *)(__arg + 9) = uVar6;
                    /* try { // try from 009875e0 to 00987633 has its CatchHandler @ 00987660 */
  iVar10 = pthread_create(param_1,(pthread_attr_t *)0x0,
                          std::__ndk1::
                          __thread_proxy<std::__ndk1::tuple<std::__ndk1::unique_ptr<std::__ndk1::__thread_struct,std::__ndk1::default_delete<std::__ndk1::__thread_struct>>,void(ix::DNSLookup::*)(std::__ndk1::weak_ptr<ix::DNSLookup>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,int),ix::DNSLookup*,std::__ndk1::weak_ptr<ix::DNSLookup>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,int>>
                          ,__arg);
  if (iVar10 != 0) {
                    /* WARNING: Subroutine does not return */
    std::__ndk1::__throw_system_error(iVar10,"thread constructor failed");
  }
  if (*(long *)(lVar9 + 0x28) != local_68) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return;
}

