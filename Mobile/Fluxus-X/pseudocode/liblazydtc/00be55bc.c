/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00be55bc
 */

/* std::__ndk1::num_put<wchar_t, std::__ndk1::ostreambuf_iterator<wchar_t,
   std::__ndk1::char_traits<wchar_t> > >::do_put(std::__ndk1::ostreambuf_iterator<wchar_t,
   std::__ndk1::char_traits<wchar_t> >, std::__ndk1::ios_base&, wchar_t, bool) const */

long * __thiscall
std::__ndk1::
num_put<wchar_t,std::__ndk1::ostreambuf_iterator<wchar_t,std::__ndk1::char_traits<wchar_t>>>::do_put
          (num_put<wchar_t,std::__ndk1::ostreambuf_iterator<wchar_t,std::__ndk1::char_traits<wchar_t>>>
           *this,long *param_2,long param_3,undefined8 param_4,ulong param_5)

{
  long lVar1;
  ulong uVar2;
  int *piVar3;
  bool bVar4;
  int iVar5;
  long *plVar6;
  int *piVar7;
  ulong uVar8;
  ulong uVar9;
  int *piVar10;
  undefined8 **local_60;
  ulong local_58;
  int *piStack_50;
  long local_48;
  undefined8 *local_40;
  undefined1 *local_38;
  
  if ((*(byte *)(param_3 + 8) & 1) == 0) {
                    /* WARNING: Could not recover jumptable at 0x00be5608. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    plVar6 = (long *)(**(code **)(*(long *)this + 0x30))(this,param_2,param_3,param_4,param_5 & 1);
    return plVar6;
  }
  ios_base::getloc();
  local_40 = &numpunct<wchar_t>::id;
  if (numpunct<wchar_t>::id != -1) {
    local_60 = &local_40;
                    /* try { // try from 00be5644 to 00be565b has its CatchHandler @ 00be5768 */
    local_38 = (undefined1 *)&local_60;
    __call_once((ulong *)&numpunct<wchar_t>::id,&local_38,(_func_void_void_ptr *)&LAB_00c0bab0);
  }
  if (((ulong)(*(long *)(local_48 + 0x18) - *(long *)(local_48 + 0x10) >> 3) <=
       (long)DAT_00d272f8 - 1U) ||
     (plVar6 = *(long **)(*(long *)(local_48 + 0x10) + ((long)DAT_00d272f8 - 1U) * 8),
     plVar6 == (long *)0x0)) {
                    /* WARNING: Subroutine does not return */
                    /* try { // try from 00be5764 to 00be5767 has its CatchHandler @ 00be5768 */
    FUN_00bd8968();
  }
  locale::~locale((locale *)&local_48);
  lVar1 = 0x30;
  if ((param_5 & 1) == 0) {
    lVar1 = 0x38;
  }
  (**(code **)(*plVar6 + lVar1))(&local_60,plVar6);
  uVar8 = (ulong)local_60 & 0xff;
  bVar4 = ((ulong)local_60 & 1) != 0;
  uVar9 = (ulong)local_60 >> 1 & 0x7f;
  if (bVar4) {
    uVar9 = local_58;
  }
  piVar7 = piStack_50;
  if (uVar9 != 0) {
    piVar10 = (int *)((ulong)&local_60 | 4);
    if (bVar4) {
      piVar10 = piStack_50;
    }
    uVar9 = local_58;
    plVar6 = param_2;
    do {
      param_2 = plVar6;
      if (plVar6 != (long *)0x0) {
        piVar7 = (int *)plVar6[6];
        iVar5 = *piVar10;
        if (piVar7 == (int *)plVar6[7]) {
                    /* try { // try from 00be5724 to 00be572f has its CatchHandler @ 00be577c */
          iVar5 = (**(code **)(*plVar6 + 0x68))(plVar6);
        }
        else {
          *piVar7 = iVar5;
          plVar6[6] = (long)(piVar7 + 1);
        }
        uVar8 = (ulong)local_60 & 0xff;
        param_2 = (long *)0x0;
        if (iVar5 != -1) {
          param_2 = plVar6;
        }
        piVar7 = piStack_50;
        uVar9 = local_58;
      }
      piVar10 = piVar10 + 1;
      uVar2 = uVar8 >> 1;
      piVar3 = (int *)((ulong)&local_60 | 4);
      if ((uVar8 & 1) != 0) {
        uVar2 = uVar9;
        piVar3 = piVar7;
      }
      plVar6 = param_2;
    } while (piVar10 != piVar3 + uVar2);
  }
  if ((uVar8 & 1) != 0) {
    operator_delete(piVar7,((ulong)local_60 & 0x3ffffffffffffffe) << 2);
  }
  return param_2;
}

