/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00be9468
 */

/* std::__ndk1::time_get<char, std::__ndk1::istreambuf_iterator<char, std::__ndk1::char_traits<char>
   > >::do_get(std::__ndk1::istreambuf_iterator<char, std::__ndk1::char_traits<char> >,
   std::__ndk1::istreambuf_iterator<char, std::__ndk1::char_traits<char> >, std::__ndk1::ios_base&,
   unsigned int&, tm*, char, char) const */

undefined8
std::__ndk1::time_get<char,std::__ndk1::istreambuf_iterator<char,std::__ndk1::char_traits<char>>>::
do_get(time_get<char,std::__ndk1::istreambuf_iterator<char,std::__ndk1::char_traits<char>>> *param_1
      ,undefined8 param_2,undefined8 param_3,undefined8 param_4,uint *param_5,int *param_6,
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
  code *pcVar12;
  long lVar13;
  undefined4 local_80;
  undefined1 uStack_7c;
  undefined2 uStack_7b;
  undefined4 uStack_79;
  byte abStack_75 [5];
  long local_70;
  undefined8 local_68;
  undefined8 *local_60;
  undefined1 *local_58;
  
  pbVar10 = (byte *)&local_80;
  *param_5 = 0;
  local_68 = param_2;
  ios_base::getloc();
  local_60 = &ctype<char>::id;
  if (ctype<char>::id != -1) {
    local_80 = SUB84(&local_60,0);
    uStack_7c = (undefined1)((ulong)&local_60 >> 0x20);
    uStack_7b = (undefined2)((ulong)&local_60 >> 0x28);
    uStack_79._0_1_ = (undefined1)((ulong)&local_60 >> 0x38);
                    /* try { // try from 00be94e0 to 00be94f7 has its CatchHandler @ 00be9ad0 */
    local_58 = (undefined1 *)&local_80;
    __call_once((ulong *)&ctype<char>::id,&local_58,(_func_void_void_ptr *)&LAB_00c0bab0);
  }
  if (((ulong)(*(long *)(local_70 + 0x18) - *(long *)(local_70 + 0x10) >> 3) <=
       (long)DAT_00d27278 - 1U) ||
     (lVar13 = *(long *)(*(long *)(local_70 + 0x10) + ((long)DAT_00d27278 - 1U) * 8), lVar13 == 0))
  {
                    /* WARNING: Subroutine does not return */
                    /* try { // try from 00be9acc to 00be9acf has its CatchHandler @ 00be9ad0 */
    FUN_00bd8968();
  }
  locale::~locale((locale *)&local_70);
  switch(param_7) {
  case 0x25:
    __get_percent(param_1,&local_68,param_3,param_5,lVar13);
    return local_68;
  default:
    goto code_r0x00be9a04;
  case 0x41:
  case 0x61:
    lVar8 = (*(code *)**(undefined8 **)(param_1 + 0x10))(param_1 + 0x10);
    lVar13 = FUN_00bda608(&local_68,param_3,lVar8,lVar8 + 0x150,lVar13,param_5,0);
    if (lVar13 - lVar8 < 0x150) {
      lVar13 = (lVar13 - lVar8 >> 3) * -0x5555555555555555;
      auVar5 = SEXT816(lVar13) * SEXT816(0x4924924924924925);
      param_6[6] = (int)lVar13 + ((int)(auVar5._8_8_ >> 1) - (auVar5._12_4_ >> 0x1f)) * -7;
      return local_68;
    }
    return local_68;
  case 0x42:
  case 0x62:
  case 0x68:
    lVar8 = (**(code **)(*(long *)(param_1 + 0x10) + 8))(param_1 + 0x10);
    lVar13 = FUN_00bda608(&local_68,param_3,lVar8,lVar8 + 0x240,lVar13,param_5,0);
    if (lVar13 - lVar8 < 0x240) {
      lVar13 = (lVar13 - lVar8 >> 3) * -0x5555555555555555;
      iVar7 = (int)(lVar13 >> 0x3f);
      param_6[4] = (int)lVar13 + (((uint)((int)(lVar13 / 6) + iVar7) >> 1) - iVar7) * -0xc;
      return local_68;
    }
    return local_68;
  case 0x44:
    uVar9 = 0x79252f64252f6d25;
    goto LAB_00be98e0;
  case 0x46:
    uVar9 = 0x64252d6d252d5925;
    goto LAB_00be98e0;
  case 0x48:
    iVar7 = FUN_00bea2fc(&local_68,param_3,param_5,lVar13,2);
    uVar6 = *param_5;
    if (0x17 < iVar7) break;
    goto LAB_00be986c;
  case 0x49:
    iVar7 = FUN_00bea2fc(&local_68,param_3,param_5,lVar13,2);
    uVar6 = *param_5;
    if (0xb < iVar7 - 1U) break;
LAB_00be986c:
    if ((uVar6 >> 2 & 1) == 0) {
      param_6[2] = iVar7;
      return local_68;
    }
    break;
  case 0x4d:
    iVar7 = FUN_00bea2fc(&local_68,param_3,param_5,lVar13,2);
    uVar6 = *param_5;
    if ((iVar7 < 0x3c) && ((uVar6 >> 2 & 1) == 0)) {
      param_6[1] = iVar7;
      return local_68;
    }
    break;
  case 0x52:
    uStack_7c = 0x4d;
    local_80 = 0x253a4825;
    pbVar11 = (byte *)&uStack_7b;
    goto LAB_00be98f4;
  case 0x53:
    iVar7 = FUN_00bea2fc(&local_68,param_3,param_5,lVar13,2);
    uVar6 = *param_5;
    if ((iVar7 < 0x3d) && ((uVar6 >> 2 & 1) == 0)) {
      *param_6 = iVar7;
      return local_68;
    }
    break;
  case 0x54:
    uVar9 = 0x53253a4d253a4825;
LAB_00be98e0:
    local_80 = (undefined4)uVar9;
    uStack_7c = (undefined1)((ulong)uVar9 >> 0x20);
    uStack_7b = (undefined2)((ulong)uVar9 >> 0x28);
    uStack_79._0_1_ = (undefined1)((ulong)uVar9 >> 0x38);
    pbVar11 = (byte *)((long)&uStack_79 + 1);
    pbVar10 = (byte *)&local_80;
LAB_00be98f4:
    uVar9 = get(param_1,local_68,param_3,param_4,param_5,param_6,pbVar10,pbVar11);
    return uVar9;
  case 0x58:
    pcVar12 = *(code **)(*(long *)(param_1 + 0x10) + 0x30);
    goto LAB_00be9758;
  case 0x59:
    iVar7 = FUN_00bea2fc(&local_68,param_3,param_5,lVar13,4);
    if (((byte)*param_5 >> 2 & 1) == 0) {
      param_6[5] = iVar7 + -0x76c;
      return local_68;
    }
    return local_68;
  case 99:
    pcVar12 = *(code **)(*(long *)(param_1 + 0x10) + 0x18);
LAB_00be9758:
    pbVar11 = (byte *)(*pcVar12)();
    uVar4 = *(ulong *)(pbVar11 + 8);
    pbVar10 = *(byte **)(pbVar11 + 0x10);
    if ((*pbVar11 & 1) == 0) {
      pbVar10 = pbVar11 + 1;
      uVar4 = (ulong)(*pbVar11 >> 1);
    }
    pbVar11 = pbVar10 + uVar4;
    goto LAB_00be98f4;
  case 100:
  case 0x65:
    iVar7 = FUN_00bea2fc(&local_68,param_3,param_5,lVar13,2);
    uVar6 = *param_5;
    if ((iVar7 - 1U < 0x1f) && ((uVar6 >> 2 & 1) == 0)) {
      param_6[3] = iVar7;
      return local_68;
    }
    break;
  case 0x6a:
    iVar7 = FUN_00bea2fc(&local_68,param_3,param_5,lVar13,3);
    uVar6 = *param_5;
    if ((iVar7 < 0x16e) && ((uVar6 >> 2 & 1) == 0)) {
      param_6[7] = iVar7;
      return local_68;
    }
    break;
  case 0x6d:
    iVar7 = FUN_00bea2fc(&local_68,param_3,param_5,lVar13,2);
    uVar6 = *param_5;
    if ((iVar7 - 1U < 0xc) && ((uVar6 >> 2 & 1) == 0)) {
      param_6[4] = iVar7 - 1U;
      return local_68;
    }
    break;
  case 0x6e:
  case 0x74:
    __get_white_space(param_1,&local_68,param_3,param_5,lVar13);
    return local_68;
  case 0x70:
    pbVar10 = (byte *)(**(code **)(*(long *)(param_1 + 0x10) + 0x10))(param_1 + 0x10);
    uVar4 = (ulong)(*pbVar10 >> 1);
    if ((*pbVar10 & 1) != 0) {
      uVar4 = *(ulong *)(pbVar10 + 8);
    }
    uVar3 = (ulong)(pbVar10[0x18] >> 1);
    if ((pbVar10[0x18] & 1) != 0) {
      uVar3 = *(ulong *)(pbVar10 + 0x20);
    }
    if (uVar4 + uVar3 != 0) {
      pbVar11 = (byte *)FUN_00bda608(&local_68,param_3,pbVar10,pbVar10 + 0x30,lVar13,param_5,0);
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
    goto code_r0x00be9a04;
  case 0x72:
    local_80 = 0x253a4925;
    uStack_7c = 0x4d;
    uStack_7b = 0x253a;
    uStack_79 = 0x70252053;
    pbVar11 = abStack_75;
    pbVar10 = (byte *)&local_80;
    goto LAB_00be98f4;
  case 0x77:
    iVar7 = FUN_00bea2fc(&local_68,param_3,param_5,lVar13,1);
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
    uVar6 = FUN_00bea2fc(&local_68,param_3,param_5,lVar13,4);
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
LAB_00be9a0c:
  *param_5 = uVar6 | 4;
  return local_68;
code_r0x00be9a04:
  uVar6 = *param_5;
  goto LAB_00be9a0c;
}

