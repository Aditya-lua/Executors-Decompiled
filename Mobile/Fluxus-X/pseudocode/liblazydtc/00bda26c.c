/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bda26c
 */

/* std::__ndk1::collate<wchar_t>::do_transform(wchar_t const*, wchar_t const*) const */

wchar_t * std::__ndk1::collate<wchar_t>::do_transform(wchar_t *param_1,wchar_t *param_2)

{
  byte *pbVar1;
  ulong uVar2;
  wchar_t *in_x2;
  ulong *in_x8;
  ulong __n;
  wchar_t *__dest;
  ulong uVar3;
  
  __n = (long)in_x2 - (long)param_2;
  uVar3 = (long)__n >> 2;
  if (0x3ffffffffffffff7 < uVar3) {
                    /* WARNING: Subroutine does not return */
    FUN_00bc5610();
  }
  if (uVar3 < 5) {
    __dest = (wchar_t *)((long)in_x8 + 4);
    *(byte *)in_x8 = (byte)(__n >> 1) & 0xfe;
  }
  else {
    uVar2 = 8;
    if ((uVar3 | 1) != 5) {
      uVar2 = (uVar3 | 1) + 1;
    }
    __dest = operator_new(uVar2 << 2);
    in_x8[1] = uVar3;
    in_x8[2] = (ulong)__dest;
    *in_x8 = uVar2 | 1;
    param_1 = __dest;
  }
  if (in_x2 != param_2) {
    param_1 = memcpy(__dest,param_2,__n);
  }
  pbVar1 = (byte *)((long)__dest + __n);
  pbVar1[0] = 0;
  pbVar1[1] = 0;
  pbVar1[2] = 0;
  pbVar1[3] = 0;
  return param_1;
}

