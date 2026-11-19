/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bf0ce8
 */

basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>> *
FUN_00bf0ce8(basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>>
             *param_1,
            basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>>
            *param_2,long param_3)

{
  basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>> *pbVar1;
  long lVar2;
  ulong uVar3;
  ulong uVar4;
  ulong uVar5;
  ulong uVar6;
  ulong uVar7;
  ulong __n;
  basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>> *pbVar8;
  bool bVar9;
  uint uVar10;
  byte bVar11;
  wchar_t *pwVar12;
  ulong uVar13;
  basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>> *pbVar14;
  ulong uVar15;
  ulong uVar16;
  ulong local_78;
  ulong local_70;
  wchar_t *local_68;
  
  uVar6 = *(ulong *)param_1;
  uVar7 = *(ulong *)(param_1 + 8);
  bVar9 = ((byte)*param_1 & 1) != 0;
  uVar15 = (uVar6 & 0xfffffffffffffffe) - 1;
  uVar5 = (ulong)((byte)*param_1 >> 1);
  if (bVar9) {
    uVar5 = uVar7;
  }
  uVar4 = 4;
  if (bVar9) {
    uVar4 = uVar15;
  }
  __n = param_3 - (long)param_2;
  if (__n != 0) {
    pbVar14 = *(basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>>
                **)(param_1 + 0x10);
    uVar10 = (uint)uVar6;
    pbVar1 = param_1 + 4;
    uVar13 = uVar6 >> 1 & 0x7f;
    uVar16 = (long)__n >> 2;
    uVar3 = uVar13;
    pbVar8 = pbVar1;
    if ((uVar6 & 1) != 0) {
      uVar3 = uVar7;
      pbVar8 = pbVar14;
    }
    if ((param_2 < pbVar8) || (pbVar8 + uVar3 * 4 + 4 <= param_2)) {
      if (uVar4 - uVar5 < uVar16) {
        std::__ndk1::
        basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>>::
        __grow_by(param_1,uVar4,(uVar5 + uVar16) - uVar4,uVar5,uVar5,0,0);
        pbVar14 = *(basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>>
                    **)(param_1 + 0x10);
        *(ulong *)(param_1 + 8) = uVar5;
        uVar10 = (uint)(byte)*param_1;
      }
      if ((uVar10 & 1) != 0) {
        pbVar1 = pbVar14;
      }
      memmove(pbVar1 + uVar5 * 4,param_2,__n);
      *(undefined4 *)(pbVar1 + uVar5 * 4 + __n) = 0;
      if (((byte)*param_1 & 1) == 0) {
        *param_1 = SUB41((int)(uVar5 + uVar16) << 1,0);
      }
      else {
        *(ulong *)(param_1 + 8) = uVar5 + uVar16;
      }
    }
    else {
      if (0x3ffffffffffffff7 < uVar16) {
                    /* WARNING: Subroutine does not return */
        FUN_00bc5610();
      }
      if (uVar16 < 5) {
        pwVar12 = (wchar_t *)((ulong)&local_78 | 4);
        local_78 = CONCAT71(local_78._1_7_,(char)(__n >> 1)) & 0xfffffffffffffffe;
      }
      else {
        uVar5 = 8;
        if ((uVar16 | 1) != 5) {
          uVar5 = (uVar16 | 1) + 1;
        }
        pwVar12 = operator_new(uVar5 << 2);
        local_78 = uVar5 | 1;
        local_70 = uVar16;
        local_68 = pwVar12;
      }
      memcpy(pwVar12,param_2,__n);
      *(undefined4 *)((long)pwVar12 + __n) = 0;
      bVar11 = (byte)local_78 & 1;
      uVar5 = (ulong)((byte)local_78 >> 1);
      pwVar12 = (wchar_t *)((ulong)&local_78 | 4);
      if ((local_78 & 1) != 0) {
        uVar5 = local_70;
        pwVar12 = local_68;
      }
      uVar4 = 4;
      if ((uVar6 & 1) != 0) {
        uVar4 = uVar15;
      }
      if ((uVar6 & 1) != 0) {
        uVar13 = uVar7;
      }
      if (uVar4 - uVar13 < uVar5) {
                    /* try { // try from 00bf0eb4 to 00bf0ecb has its CatchHandler @ 00bf0f5c */
        std::__ndk1::
        basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>>::
        __grow_by_and_replace(param_1,uVar4,(uVar5 - uVar4) + uVar13,uVar13,uVar13,0,uVar5,pwVar12);
        bVar11 = (byte)local_78 & 1;
      }
      else if (uVar5 != 0) {
        if ((uVar6 & 1) != 0) {
          pbVar1 = pbVar14;
        }
        memmove(pbVar1 + uVar13 * 4,pwVar12,uVar5 << 2);
        lVar2 = uVar13 + uVar5;
        if (((byte)*param_1 & 1) == 0) {
          *param_1 = SUB41((int)lVar2 << 1,0);
        }
        else {
          *(long *)(param_1 + 8) = lVar2;
        }
        *(undefined4 *)(pbVar1 + lVar2 * 4) = 0;
      }
      if (bVar11 != 0) {
        operator_delete(local_68,(local_78 & 0x3ffffffffffffffe) << 2);
      }
    }
  }
  return param_1;
}

