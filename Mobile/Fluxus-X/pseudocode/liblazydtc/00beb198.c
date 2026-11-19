/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00beb198
 */

/* std::__ndk1::time_get<wchar_t, std::__ndk1::istreambuf_iterator<wchar_t,
   std::__ndk1::char_traits<wchar_t> > >::do_get(std::__ndk1::istreambuf_iterator<wchar_t,
   std::__ndk1::char_traits<wchar_t> >, std::__ndk1::istreambuf_iterator<wchar_t,
   std::__ndk1::char_traits<wchar_t> >, std::__ndk1::ios_base&, unsigned int&, tm*, char, char)
   const */

undefined8
std::__ndk1::
time_get<wchar_t,std::__ndk1::istreambuf_iterator<wchar_t,std::__ndk1::char_traits<wchar_t>>>::
do_get(time_get<wchar_t,std::__ndk1::istreambuf_iterator<wchar_t,std::__ndk1::char_traits<wchar_t>>>
       *param_1,undefined8 param_2,undefined8 param_3,undefined8 param_4,uint *param_5,int *param_6,
      undefined1 param_7)

{
  uint uVar1;
  uint uVar2;
  ulong uVar3;
  ulong uVar4;
  undefined1 auVar5 [16];
  uint uVar6;
  int iVar7;
  long lVar8;
  undefined8 uVar9;
  byte *pbVar10;
  byte *pbVar11;
  undefined8 ***pppuVar12;
  code *pcVar13;
  undefined8 *puVar14;
  long lVar15;
  undefined8 **local_a0;
  undefined8 uStack_98;
  undefined8 local_90;
  undefined4 uStack_88;
  undefined4 local_84;
  byte abStack_80 [16];
  long local_70;
  undefined8 local_68;
  undefined8 *local_60;
  undefined1 *local_58;
  
  pppuVar12 = &local_a0;
  *param_5 = 0;
  local_68 = param_2;
  ios_base::getloc();
  local_60 = &ctype<wchar_t>::id;
  if (ctype<wchar_t>::id != -1) {
    local_a0 = &local_60;
                    /* try { // try from 00beb210 to 00beb227 has its CatchHandler @ 00beb7f0 */
    local_58 = (undefined1 *)&local_a0;
    __call_once((ulong *)&ctype<wchar_t>::id,&local_58,(_func_void_void_ptr *)&LAB_00c0bab0);
  }
  if (((ulong)(*(long *)(local_70 + 0x18) - *(long *)(local_70 + 0x10) >> 3) <=
       (long)DAT_00d27268 - 1U) ||
     (lVar15 = *(long *)(*(long *)(local_70 + 0x10) + ((long)DAT_00d27268 - 1U) * 8), lVar15 == 0))
  {
                    /* WARNING: Subroutine does not return */
                    /* try { // try from 00beb7ec to 00beb7ef has its CatchHandler @ 00beb7f0 */
    FUN_00bd8968();
  }
  locale::~locale((locale *)&local_70);
  switch(param_7) {
  case 0x25:
    __get_percent(param_1,&local_68,param_3,param_5,lVar15);
    return local_68;
  default:
    goto code_r0x00beb724;
  case 0x41:
  case 0x61:
    lVar8 = (*(code *)**(undefined8 **)(param_1 + 0x10))(param_1 + 0x10);
    lVar15 = FUN_00bdede4(&local_68,param_3,lVar8,lVar8 + 0x150,lVar15,param_5,0);
    if (lVar15 - lVar8 < 0x150) {
      lVar15 = (lVar15 - lVar8 >> 3) * -0x5555555555555555;
      auVar5 = SEXT816(lVar15) * SEXT816(0x4924924924924925);
      param_6[6] = (int)lVar15 + ((int)(auVar5._8_8_ >> 1) - (auVar5._12_4_ >> 0x1f)) * -7;
      return local_68;
    }
    return local_68;
  case 0x42:
  case 0x62:
  case 0x68:
    lVar8 = (**(code **)(*(long *)(param_1 + 0x10) + 8))(param_1 + 0x10);
    lVar15 = FUN_00bdede4(&local_68,param_3,lVar8,lVar8 + 0x240,lVar15,param_5,0);
    if (lVar15 - lVar8 < 0x240) {
      lVar15 = (lVar15 - lVar8 >> 3) * -0x5555555555555555;
      iVar7 = (int)(lVar15 >> 0x3f);
      param_6[4] = (int)lVar15 + (((uint)((int)(lVar15 / 6) + iVar7) >> 1) - iVar7) * -0xc;
      return local_68;
    }
    return local_68;
  case 0x44:
    puVar14 = (undefined8 *)&DAT_00364e70;
    goto LAB_00beb5fc;
  case 0x46:
    puVar14 = (undefined8 *)&DAT_00364d30;
    goto LAB_00beb5fc;
  case 0x48:
    iVar7 = FUN_00bec028(&local_68,param_3,param_5,lVar15,2);
    uVar6 = *param_5;
    if (0x17 < iVar7) break;
    goto LAB_00beb590;
  case 0x49:
    iVar7 = FUN_00bec028(&local_68,param_3,param_5,lVar15,2);
    uVar6 = *param_5;
    if (0xb < iVar7 - 1U) break;
LAB_00beb590:
    if ((uVar6 >> 2 & 1) == 0) {
      param_6[2] = iVar7;
      return local_68;
    }
    break;
  case 0x4d:
    iVar7 = FUN_00bec028(&local_68,param_3,param_5,lVar15,2);
    uVar6 = *param_5;
    if ((iVar7 < 0x3c) && ((uVar6 >> 2 & 1) == 0)) {
      param_6[1] = iVar7;
      return local_68;
    }
    break;
  case 0x52:
    local_90 = CONCAT44(local_90._4_4_,0x4d);
    uStack_98 = 0x250000003a;
    local_a0 = (undefined8 **)0x4800000025;
    pbVar10 = (byte *)((long)&local_90 + 4);
    goto LAB_00beb614;
  case 0x53:
    iVar7 = FUN_00bec028(&local_68,param_3,param_5,lVar15,2);
    uVar6 = *param_5;
    if ((iVar7 < 0x3d) && ((uVar6 >> 2 & 1) == 0)) {
      *param_6 = iVar7;
      return local_68;
    }
    break;
  case 0x54:
    puVar14 = (undefined8 *)&DAT_00364db0;
LAB_00beb5fc:
    uStack_98 = puVar14[1];
    local_a0 = (undefined8 **)*puVar14;
    local_90 = puVar14[2];
    pbVar10 = abStack_80;
    uStack_88 = (undefined4)puVar14[3];
    local_84 = (undefined4)((ulong)puVar14[3] >> 0x20);
    pppuVar12 = &local_a0;
LAB_00beb614:
    uVar9 = get(param_1,local_68,param_3,param_4,param_5,param_6,pppuVar12,pbVar10);
    return uVar9;
  case 0x58:
    pcVar13 = *(code **)(*(long *)(param_1 + 0x10) + 0x30);
    goto LAB_00beb484;
  case 0x59:
    iVar7 = FUN_00bec028(&local_68,param_3,param_5,lVar15,4);
    if (((byte)*param_5 >> 2 & 1) == 0) {
      param_6[5] = iVar7 + -0x76c;
      return local_68;
    }
    return local_68;
  case 99:
    pcVar13 = *(code **)(*(long *)(param_1 + 0x10) + 0x18);
LAB_00beb484:
    pbVar10 = (byte *)(*pcVar13)();
    uVar3 = (ulong)(*pbVar10 >> 1);
    pppuVar12 = (undefined8 ***)(pbVar10 + 4);
    if ((*pbVar10 & 1) != 0) {
      uVar3 = *(ulong *)(pbVar10 + 8);
      pppuVar12 = (undefined8 ***)*(byte **)(pbVar10 + 0x10);
    }
    pbVar10 = (byte *)((long)pppuVar12 + uVar3 * 4);
    goto LAB_00beb614;
  case 100:
  case 0x65:
    iVar7 = FUN_00bec028(&local_68,param_3,param_5,lVar15,2);
    uVar6 = *param_5;
    if ((iVar7 - 1U < 0x1f) && ((uVar6 >> 2 & 1) == 0)) {
      param_6[3] = iVar7;
      return local_68;
    }
    break;
  case 0x6a:
    iVar7 = FUN_00bec028(&local_68,param_3,param_5,lVar15,3);
    uVar6 = *param_5;
    if ((iVar7 < 0x16e) && ((uVar6 >> 2 & 1) == 0)) {
      param_6[7] = iVar7;
      return local_68;
    }
    break;
  case 0x6d:
    iVar7 = FUN_00bec028(&local_68,param_3,param_5,lVar15,2);
    uVar6 = *param_5;
    if ((iVar7 - 1U < 0xc) && ((uVar6 >> 2 & 1) == 0)) {
      param_6[4] = iVar7 - 1U;
      return local_68;
    }
    break;
  case 0x6e:
  case 0x74:
    __get_white_space(param_1,&local_68,param_3,param_5,lVar15);
    return local_68;
  case 0x70:
    pbVar10 = (byte *)(**(code **)(*(long *)(param_1 + 0x10) + 0x10))(param_1 + 0x10);
    uVar3 = (ulong)(*pbVar10 >> 1);
    if ((*pbVar10 & 1) != 0) {
      uVar3 = *(ulong *)(pbVar10 + 8);
    }
    uVar4 = (ulong)(pbVar10[0x18] >> 1);
    if ((pbVar10[0x18] & 1) != 0) {
      uVar4 = *(ulong *)(pbVar10 + 0x20);
    }
    if (uVar3 + uVar4 != 0) {
      pbVar11 = (byte *)FUN_00bdede4(&local_68,param_3,pbVar10,pbVar10 + 0x30,lVar15,param_5,0);
      iVar7 = param_6[2];
      if ((pbVar11 == pbVar10) && (iVar7 == 0xc)) {
        param_6[2] = 0;
        return local_68;
      }
      if ((long)pbVar11 - (long)pbVar10 != 0x18) {
        return local_68;
      }
      if (iVar7 < 0xc) {
        param_6[2] = iVar7 + 0xc;
        return local_68;
      }
      return local_68;
    }
    goto code_r0x00beb724;
  case 0x72:
    pbVar10 = abStack_80 + 0xc;
    uStack_98 = 0x250000003a;
    local_a0 = (undefined8 **)0x4900000025;
    uStack_88 = 0x25;
    local_90 = 0x3a0000004d;
    abStack_80[4] = 0x25;
    abStack_80[5] = 0;
    abStack_80[6] = 0;
    abStack_80[7] = 0;
    abStack_80[8] = 0x70;
    abStack_80[9] = 0;
    abStack_80[10] = 0;
    abStack_80[0xb] = 0;
    local_84 = 0x53;
    abStack_80[0] = 0x20;
    abStack_80[1] = 0;
    abStack_80[2] = 0;
    abStack_80[3] = 0;
    pppuVar12 = &local_a0;
    goto LAB_00beb614;
  case 0x77:
    iVar7 = FUN_00bec028(&local_68,param_3,param_5,lVar15,1);
    uVar6 = *param_5;
    if ((iVar7 < 7) && ((uVar6 >> 2 & 1) == 0)) {
      param_6[6] = iVar7;
      return local_68;
    }
    break;
  case 0x78:
    uVar9 = (**(code **)(*(long *)param_1 + 0x28))(param_1,local_68,param_3,param_4,param_5,param_6)
    ;
    return uVar9;
  case 0x79:
    uVar6 = FUN_00bec028(&local_68,param_3,param_5,lVar15,4);
    if (((byte)*param_5 >> 2 & 1) != 0) {
      return local_68;
    }
    uVar1 = uVar6 + 0x76c;
    if (99 < uVar6) {
      uVar1 = uVar6;
    }
    uVar2 = uVar6 + 2000;
    if (0x44 < (int)uVar6) {
      uVar2 = uVar1;
    }
    param_6[5] = uVar2 - 0x76c;
    return local_68;
  }
LAB_00beb72c:
  *param_5 = uVar6 | 4;
  return local_68;
code_r0x00beb724:
  uVar6 = *param_5;
  goto LAB_00beb72c;
}

