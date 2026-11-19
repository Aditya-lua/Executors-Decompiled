/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00971a8c
 */

/* ix::HttpClient::HttpClient(bool) */

void __thiscall ix::HttpClient::HttpClient(HttpClient *this,bool param_1)

{
  long lVar1;
  HttpClient *pHVar2;
  HttpClient *local_88;
  code *local_80;
  undefined8 uStack_78;
  undefined8 local_70;
  long local_68;
  
  lVar1 = tpidr_el0;
  local_68 = *(long *)(lVar1 + 0x28);
  *this = (HttpClient)param_1;
  memset(this + 8,0,0x89);
  pHVar2 = this + 0x98;
  *(undefined8 *)pHVar2 = 0;
  *(undefined8 *)(this + 0xa0) = 0;
                    /* try { // try from 00971ae8 to 00971aef has its CatchHandler @ 00971c94 */
  std::__ndk1::recursive_mutex::recursive_mutex((recursive_mutex *)(this + 0xa8));
  memset(this + 0xd0,0,0x48);
  this[0x100] = (HttpClient)0xc;
  *(undefined2 *)(this + 0x105) = 0x4d45;
  *(undefined4 *)(this + 0x101) = 0x54535953;
  *(undefined8 *)(this + 0x118) = 0;
  *(undefined8 *)(this + 0x120) = 0;
  this[0x118] = (HttpClient)0xe;
  this[0x107] = (HttpClient)0x0;
  *(undefined8 *)(this + 0x128) = 0;
  *(undefined2 *)(this + 0x11d) = 0x4c55;
  *(undefined4 *)(this + 0x119) = 0x41464544;
  this[0x11f] = (HttpClient)0x54;
  this[0x120] = (HttpClient)0x0;
  *(undefined2 *)(this + 0x130) = 0;
  *(undefined8 *)(this + 0x140) = 0;
  *(undefined8 *)(this + 0x148) = 0;
  *(undefined8 *)(this + 0x138) = 0;
  this[0x150] = (HttpClient)0x0;
  this[0x158] = (HttpClient)0x0;
  if (*this != (HttpClient)0x0) {
    uStack_78 = 0;
    local_80 = run;
                    /* try { // try from 00971ba4 to 00971bb3 has its CatchHandler @ 00971c08 */
    local_88 = this;
    FUN_009722e4(&local_70,&local_80,&local_88);
    if (*(long *)pHVar2 != 0) {
                    /* WARNING: Subroutine does not return */
      std::terminate();
    }
    *(undefined8 *)pHVar2 = local_70;
    local_70 = 0;
    std::__ndk1::thread::~thread((thread *)&local_70);
  }
  if (*(long *)(lVar1 + 0x28) != local_68) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return;
}

