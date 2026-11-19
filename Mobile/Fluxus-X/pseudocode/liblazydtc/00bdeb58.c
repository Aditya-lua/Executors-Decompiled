/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bdeb58
 */

/* std::__ndk1::num_get<wchar_t, std::__ndk1::istreambuf_iterator<wchar_t,
   std::__ndk1::char_traits<wchar_t> > >::do_get(std::__ndk1::istreambuf_iterator<wchar_t,
   std::__ndk1::char_traits<wchar_t> >, std::__ndk1::istreambuf_iterator<wchar_t,
   std::__ndk1::char_traits<wchar_t> >, std::__ndk1::ios_base&, unsigned int&, bool&) const */

undefined8 __thiscall
std::__ndk1::
num_get<wchar_t,std::__ndk1::istreambuf_iterator<wchar_t,std::__ndk1::char_traits<wchar_t>>>::do_get
          (num_get<wchar_t,std::__ndk1::istreambuf_iterator<wchar_t,std::__ndk1::char_traits<wchar_t>>>
           *this,undefined8 param_2,undefined8 param_3,long param_4,undefined4 *param_5,
          undefined1 *param_6)

{
  long lVar1;
  undefined8 uVar2;
  undefined1 *puVar3;
  long lVar4;
  long *plVar5;
  undefined8 **local_90 [2];
  void *local_80;
  byte local_78;
  undefined7 uStack_77;
  void *local_68;
  long local_60;
  undefined8 local_58;
  undefined8 *local_50;
  undefined1 *local_48;
  
  local_58 = param_2;
  if ((*(byte *)(param_4 + 8) & 1) == 0) {
    local_90[0] = (undefined8 **)0xffffffffffffffff;
    uVar2 = (**(code **)(*(long *)this + 0x20))();
    if (local_90[0] == (undefined8 **)0x1) {
      *param_6 = 1;
    }
    else if (local_90[0] == (undefined8 **)0x0) {
      *param_6 = 0;
    }
    else {
      *param_6 = 1;
      *param_5 = 4;
    }
  }
  else {
    ios_base::getloc();
    lVar4 = local_60;
    local_50 = &ctype<wchar_t>::id;
    if (ctype<wchar_t>::id != -1) {
      local_90[0] = &local_50;
                    /* try { // try from 00bdebfc to 00bdec13 has its CatchHandler @ 00bdedd0 */
      local_48 = (undefined1 *)local_90;
      __call_once((ulong *)&ctype<wchar_t>::id,&local_48,(_func_void_void_ptr *)&LAB_00c0bab0);
    }
    lVar1 = *(long *)(lVar4 + 0x10);
    if (((ulong)(*(long *)(lVar4 + 0x18) - lVar1 >> 3) <= (long)DAT_00d27268 - 1U) ||
       (lVar4 = *(long *)(lVar1 + ((long)DAT_00d27268 - 1U) * 8), lVar4 == 0)) {
                    /* WARNING: Subroutine does not return */
                    /* try { // try from 00bded9c to 00bded9f has its CatchHandler @ 00bdedd0 */
      FUN_00bd8968();
    }
    locale::~locale((locale *)&local_60);
    ios_base::getloc();
    local_50 = &numpunct<wchar_t>::id;
    if (numpunct<wchar_t>::id != -1) {
      local_90[0] = &local_50;
                    /* try { // try from 00bdec74 to 00bdec8b has its CatchHandler @ 00bdedcc */
      local_48 = (undefined1 *)local_90;
      __call_once((ulong *)&numpunct<wchar_t>::id,&local_48,(_func_void_void_ptr *)&LAB_00c0bab0);
    }
    if (((ulong)(*(long *)(local_60 + 0x18) - *(long *)(local_60 + 0x10) >> 3) <=
         (long)DAT_00d272f8 - 1U) ||
       (plVar5 = *(long **)(*(long *)(local_60 + 0x10) + ((long)DAT_00d272f8 - 1U) * 8),
       plVar5 == (long *)0x0)) {
                    /* WARNING: Subroutine does not return */
                    /* try { // try from 00bdeda0 to 00bdeda3 has its CatchHandler @ 00bdedcc */
      FUN_00bd8968();
    }
    locale::~locale((locale *)&local_60);
                    /* try { // try from 00bdecbc to 00bdeccb has its CatchHandler @ 00bdedc8 */
    (**(code **)(*plVar5 + 0x30))(local_90,plVar5);
                    /* try { // try from 00bdecd4 to 00bdecdf has its CatchHandler @ 00bdedb4 */
    (**(code **)(*plVar5 + 0x38))(&local_78,plVar5);
                    /* try { // try from 00bdece4 to 00bded03 has its CatchHandler @ 00bdeda4 */
    puVar3 = (undefined1 *)FUN_00bdede4(&local_58,param_3,local_90,&local_60,lVar4,param_5,1);
    uVar2 = local_58;
    *param_6 = (undefined8 ***)puVar3 == local_90;
    if ((local_78 & 1) != 0) {
      operator_delete(local_68,(CONCAT71(uStack_77,local_78) & 0x3ffffffffffffffe) << 2);
    }
    if (((ulong)local_90[0] & 1) != 0) {
      operator_delete(local_80,((ulong)local_90[0] & 0x3ffffffffffffffe) << 2);
    }
  }
  return uVar2;
}

