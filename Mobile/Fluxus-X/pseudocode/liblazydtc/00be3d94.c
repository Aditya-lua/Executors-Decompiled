/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00be3d94
 */

/* std::__ndk1::num_put<char, std::__ndk1::ostreambuf_iterator<char, std::__ndk1::char_traits<char>
   > >::do_put(std::__ndk1::ostreambuf_iterator<char, std::__ndk1::char_traits<char> >,
   std::__ndk1::ios_base&, char, bool) const */

long * __thiscall
std::__ndk1::num_put<char,std::__ndk1::ostreambuf_iterator<char,std::__ndk1::char_traits<char>>>::
do_put(num_put<char,std::__ndk1::ostreambuf_iterator<char,std::__ndk1::char_traits<char>>> *this,
      long *param_2,long param_3,undefined8 param_4,ulong param_5)

{
  long lVar1;
  ulong uVar2;
  undefined1 *puVar3;
  undefined1 uVar4;
  bool bVar5;
  int iVar6;
  long *plVar7;
  undefined1 *puVar8;
  undefined8 **local_60;
  ulong local_58;
  undefined1 *puStack_50;
  long local_48;
  undefined8 *local_40;
  undefined1 *local_38;
  
  if ((*(byte *)(param_3 + 8) & 1) == 0) {
                    /* WARNING: Could not recover jumptable at 0x00be3de0. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    plVar7 = (long *)(**(code **)(*(long *)this + 0x30))(this,param_2,param_3,param_4,param_5 & 1);
    return plVar7;
  }
  ios_base::getloc();
  local_40 = &numpunct<char>::id;
  if (numpunct<char>::id != -1) {
    local_60 = &local_40;
                    /* try { // try from 00be3e1c to 00be3e33 has its CatchHandler @ 00be3f3c */
    local_38 = (undefined1 *)&local_60;
    __call_once((ulong *)&numpunct<char>::id,&local_38,(_func_void_void_ptr *)&LAB_00c0bab0);
  }
  if (((ulong)(*(long *)(local_48 + 0x18) - *(long *)(local_48 + 0x10) >> 3) <=
       (long)DAT_00d272e8 - 1U) ||
     (plVar7 = *(long **)(*(long *)(local_48 + 0x10) + ((long)DAT_00d272e8 - 1U) * 8),
     plVar7 == (long *)0x0)) {
                    /* WARNING: Subroutine does not return */
                    /* try { // try from 00be3f38 to 00be3f3b has its CatchHandler @ 00be3f3c */
    FUN_00bd8968();
  }
  locale::~locale((locale *)&local_48);
  lVar1 = 0x30;
  if ((param_5 & 1) == 0) {
    lVar1 = 0x38;
  }
  (**(code **)(*plVar7 + lVar1))(&local_60,plVar7);
  bVar5 = ((ulong)local_60 & 1) != 0;
  uVar2 = (ulong)((byte)local_60 >> 1);
  if (bVar5) {
    uVar2 = local_58;
  }
  if (uVar2 != 0) {
    puVar8 = (undefined1 *)((ulong)&local_60 | 1);
    if (bVar5) {
      puVar8 = puStack_50;
    }
    do {
      if (param_2 != (long *)0x0) {
        puVar3 = (undefined1 *)param_2[6];
        uVar4 = *puVar8;
        if (puVar3 == (undefined1 *)param_2[7]) {
                    /* try { // try from 00be3ef8 to 00be3eff has its CatchHandler @ 00be3f50 */
          iVar6 = (**(code **)(*param_2 + 0x68))(param_2);
          plVar7 = (long *)0x0;
          if (iVar6 != -1) {
            plVar7 = param_2;
          }
          param_2 = plVar7;
        }
        else {
          param_2[6] = (long)(puVar3 + 1);
          *puVar3 = uVar4;
        }
      }
      puVar8 = puVar8 + 1;
      uVar2 = (ulong)((byte)local_60 >> 1);
      puVar3 = (undefined1 *)((ulong)&local_60 | 1);
      if (((ulong)local_60 & 1) != 0) {
        uVar2 = local_58;
        puVar3 = puStack_50;
      }
    } while (puVar8 != puVar3 + uVar2);
  }
  if (((byte)local_60 & 1) != 0) {
    operator_delete(puStack_50,(ulong)local_60 & 0xfffffffffffffffe);
  }
  return param_2;
}

