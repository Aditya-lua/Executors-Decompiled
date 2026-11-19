/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c04f40
 */

/* std::__ndk1::__time_get_storage<wchar_t>::__analyze(char, std::__ndk1::ctype<wchar_t> const&) */

void std::__ndk1::__time_get_storage<wchar_t>::__analyze(char param_1,ctype *param_2)

{
  undefined8 *puVar1;
  undefined8 *puVar2;
  basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>> *pbVar3;
  __locale_struct *p_Var4;
  basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>> bVar5;
  char cVar6;
  uint uVar7;
  undefined8 *puVar8;
  __locale_t __dataset;
  size_t sVar9;
  ulong uVar10;
  long lVar11;
  undefined8 uVar12;
  long *in_x2;
  basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>> *in_x8;
  basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>> *pbVar13;
  undefined4 uVar14;
  int iVar15;
  __locale_struct *p_Var16;
  ulong uVar17;
  __locale_struct *p_Var18;
  char *local_2b8;
  mbstate_t mStack_2b0;
  __locale_struct local_2a8;
  char local_118;
  undefined1 local_117;
  undefined1 local_116;
  char acStack_114 [100];
  tm local_b0;
  __locale_struct *local_78 [3];
  
  puVar8 = (undefined8 *)(ulong)(byte)param_1;
  local_b0.tm_gmtoff = 0;
  local_b0.tm_zone = (char *)0x0;
  local_b0.tm_isdst = -1;
  local_b0._36_4_ = 0;
  local_117 = SUB81(param_2,0);
  local_b0.tm_hour = 0x17;
  local_b0.tm_mday = 0x1f;
  local_b0.tm_sec = 0x3b;
  local_b0.tm_min = 0x37;
  local_b0.tm_wday = 6;
  local_b0.tm_yday = 0x16c;
  local_b0.tm_mon = 0xb;
  local_b0.tm_year = 0xa1;
  local_116 = 0;
  local_118 = '%';
  strftime_l(acStack_114,100,&local_118,&local_b0,(__locale_t)*puVar8);
  mStack_2b0.__count = 0;
  mStack_2b0.__value.__wch = 0;
  local_2b8 = acStack_114;
  __dataset = uselocale((__locale_t)*puVar8);
                    /* try { // try from 00c04fe0 to 00c04ff3 has its CatchHandler @ 00c065bc */
  local_78[0] = __dataset;
  sVar9 = mbsrtowcs((wchar_t *)&local_2a8,&local_2b8,100,&mStack_2b0);
  if (__dataset != (__locale_t)0x0) {
                    /* try { // try from 00c04ffc to 00c05003 has its CatchHandler @ 00c065b4 */
    uselocale(__dataset);
  }
  if (sVar9 == 0xffffffffffffffff) {
    uVar12 = __throw_runtime_error("locale not supported");
                    /* catch(type#1 @ 00000000) { ... } // from try @ 00c05338 with catch @ 00c065b0
                        */
                    /* catch(type#1 @ 00000000) { ... } // from try @ 00c051e0 with catch @ 00c065d8
                        */
    basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>>::
    ~basic_string(in_x8);
                    /* WARNING: Subroutine does not return */
    FUN_00c2c090(uVar12);
  }
  *(undefined8 *)in_x8 = 0;
  *(undefined8 *)(in_x8 + 8) = 0;
  *(undefined8 *)(in_x8 + 0x10) = 0;
  if (sVar9 != 0) {
    p_Var4 = (__locale_struct *)((long)local_2a8.__locales + sVar9 * 4);
    puVar1 = puVar8 + 0x2b;
    puVar2 = puVar8 + 0x73;
    pbVar3 = in_x8 + 4;
    p_Var18 = &local_2a8;
    do {
                    /* try { // try from 00c050a4 to 00c050af has its CatchHandler @ 00c065d0 */
      uVar10 = (**(code **)(*in_x2 + 0x18))();
      p_Var16 = p_Var18;
      if ((uVar10 & 1) == 0) {
                    /* try { // try from 00c050d4 to 00c050f3 has its CatchHandler @ 00c065d4 */
        local_78[0] = p_Var18;
        lVar11 = FUN_00c065ec(local_78,p_Var4,puVar8 + 1,puVar1);
        lVar11 = lVar11 - (long)(puVar8 + 1);
        if (lVar11 < 0x150) {
          bVar5 = *in_x8;
          if (((byte)bVar5 & 1) == 0) {
            if (bVar5 == (basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>>
                          )0x8) {
              uVar17 = 4;
              goto LAB_00c0520c;
            }
            uVar10 = (ulong)((byte)bVar5 >> 1);
            *in_x8 = (basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>>
                      )((char)bVar5 + 2);
            pbVar13 = pbVar3;
          }
          else {
            uVar10 = *(ulong *)(in_x8 + 8);
            uVar17 = (*(ulong *)in_x8 & 0xfffffffffffffffe) - 1;
            if (uVar10 == uVar17) {
LAB_00c0520c:
                    /* try { // try from 00c0520c to 00c05317 has its CatchHandler @ 00c065d4 */
              uVar10 = uVar17;
              basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>>
              ::__grow_by(in_x8,uVar10,1,uVar10,uVar10,0,0);
            }
            *(ulong *)(in_x8 + 8) = uVar10 + 1;
            pbVar13 = *(basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>>
                        **)(in_x8 + 0x10);
          }
          *(undefined8 *)(pbVar13 + uVar10 * 4) = 0x25;
          bVar5 = *in_x8;
          if (lVar11 < 0xa8) {
            if (((byte)bVar5 & 1) == 0) {
              if (bVar5 == (basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>>
                            )0x8) {
                uVar17 = 4;
                goto LAB_00c0549c;
              }
              uVar10 = (ulong)((byte)bVar5 >> 1);
              *in_x8 = (basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>>
                        )((char)bVar5 + 2);
              pbVar13 = pbVar3;
            }
            else {
              uVar10 = *(ulong *)(in_x8 + 8);
              uVar17 = (*(ulong *)in_x8 & 0xfffffffffffffffe) - 1;
              if (uVar10 == uVar17) {
LAB_00c0549c:
                    /* try { // try from 00c0549c to 00c05a0b has its CatchHandler @ 00c065d4 */
                uVar10 = uVar17;
                basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>>
                ::__grow_by(in_x8,uVar10,1,uVar10,uVar10,0,0);
              }
              *(ulong *)(in_x8 + 8) = uVar10 + 1;
              pbVar13 = *(basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>>
                          **)(in_x8 + 0x10);
            }
            pbVar13 = pbVar13 + uVar10 * 4;
            uVar14 = 0x41;
          }
          else {
            if (((byte)bVar5 & 1) == 0) {
              if (bVar5 == (basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>>
                            )0x8) {
                uVar17 = 4;
                goto LAB_00c0504c;
              }
              uVar10 = (ulong)((byte)bVar5 >> 1);
              *in_x8 = (basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>>
                        )((char)bVar5 + 2);
              pbVar13 = pbVar3;
            }
            else {
              uVar10 = *(ulong *)(in_x8 + 8);
              uVar17 = (*(ulong *)in_x8 & 0xfffffffffffffffe) - 1;
              if (uVar10 == uVar17) {
LAB_00c0504c:
                    /* try { // try from 00c0504c to 00c0506b has its CatchHandler @ 00c065d4 */
                uVar10 = uVar17;
                basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>>
                ::__grow_by(in_x8,uVar10,1,uVar10,uVar10,0,0);
              }
              pbVar13 = *(basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>>
                          **)(in_x8 + 0x10);
              *(ulong *)(in_x8 + 8) = uVar10 + 1;
            }
            pbVar13 = pbVar13 + uVar10 * 4;
            uVar14 = 0x61;
          }
          *(undefined4 *)pbVar13 = uVar14;
          *(undefined4 *)(pbVar13 + 4) = 0;
        }
        else {
                    /* try { // try from 00c05164 to 00c05183 has its CatchHandler @ 00c065d4 */
          local_78[0] = p_Var18;
          lVar11 = FUN_00c065ec(local_78,p_Var4,puVar1,puVar2);
          if (0x23f < lVar11 - (long)puVar1) {
            uVar10 = (ulong)(*(byte *)(puVar8 + 0x73) >> 1);
            if ((*(byte *)(puVar8 + 0x73) & 1) != 0) {
              uVar10 = puVar8[0x74];
            }
            uVar17 = (ulong)(*(byte *)(puVar8 + 0x76) >> 1);
            if ((*(byte *)(puVar8 + 0x76) & 1) != 0) {
              uVar17 = puVar8[0x77];
            }
            if (uVar10 + uVar17 != 0) {
              local_78[0] = p_Var18;
              lVar11 = FUN_00c065ec(local_78,p_Var4,puVar2,puVar8 + 0x79);
              if (lVar11 - (long)puVar2 < 0x30) {
                bVar5 = *in_x8;
                if (((byte)bVar5 & 1) == 0) {
                  if (bVar5 == (basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>>
                                )0x8) {
                    uVar17 = 4;
                    goto LAB_00c05764;
                  }
                  uVar10 = (ulong)((byte)bVar5 >> 1);
                  *in_x8 = (basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>>
                            )((char)bVar5 + 2);
                  pbVar13 = pbVar3;
                }
                else {
                  uVar10 = *(ulong *)(in_x8 + 8);
                  uVar17 = (*(ulong *)in_x8 & 0xfffffffffffffffe) - 1;
                  if (uVar10 == uVar17) {
LAB_00c05764:
                    uVar10 = uVar17;
                    basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>>
                    ::__grow_by(in_x8,uVar10,1,uVar10,uVar10,0,0);
                  }
                  *(ulong *)(in_x8 + 8) = uVar10 + 1;
                  pbVar13 = *(basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>>
                              **)(in_x8 + 0x10);
                }
                *(undefined8 *)(pbVar13 + uVar10 * 4) = 0x25;
                bVar5 = *in_x8;
                if (((byte)bVar5 & 1) == 0) {
                  if (bVar5 == (basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>>
                                )0x8) {
                    uVar17 = 4;
                    goto LAB_00c05950;
                  }
                  uVar10 = (ulong)((byte)bVar5 >> 1);
                  *in_x8 = (basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>>
                            )((char)bVar5 + 2);
                  pbVar13 = pbVar3;
                }
                else {
                  uVar10 = *(ulong *)(in_x8 + 8);
                  uVar17 = (*(ulong *)in_x8 & 0xfffffffffffffffe) - 1;
                  if (uVar10 == uVar17) {
LAB_00c05950:
                    uVar10 = uVar17;
                    basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>>
                    ::__grow_by(in_x8,uVar10,1,uVar10,uVar10,0,0);
                  }
                  *(ulong *)(in_x8 + 8) = uVar10 + 1;
                  pbVar13 = *(basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>>
                              **)(in_x8 + 0x10);
                }
                *(undefined8 *)(pbVar13 + uVar10 * 4) = 0x70;
                goto LAB_00c05088;
              }
            }
            local_78[0] = p_Var18;
            uVar10 = (**(code **)(*in_x2 + 0x18))();
            if ((uVar10 & 1) == 0) {
              cVar6 = (**(code **)(*in_x2 + 0x68))();
              if (cVar6 == '%') {
                bVar5 = *in_x8;
                if (((byte)bVar5 & 1) == 0) {
                  if (bVar5 == (basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>>
                                )0x8) {
                    uVar17 = 4;
                    goto LAB_00c05864;
                  }
                  uVar10 = (ulong)((byte)bVar5 >> 1);
                  *in_x8 = (basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>>
                            )((char)bVar5 + 2);
                  pbVar13 = pbVar3;
                }
                else {
                  uVar10 = *(ulong *)(in_x8 + 8);
                  uVar17 = (*(ulong *)in_x8 & 0xfffffffffffffffe) - 1;
                  if (uVar10 == uVar17) {
LAB_00c05864:
                    uVar10 = uVar17;
                    basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>>
                    ::__grow_by(in_x8,uVar10,1,uVar10,uVar10,0,0);
                  }
                  *(ulong *)(in_x8 + 8) = uVar10 + 1;
                  pbVar13 = *(basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>>
                              **)(in_x8 + 0x10);
                }
                *(undefined8 *)(pbVar13 + uVar10 * 4) = 0x25;
                bVar5 = *in_x8;
                if (((byte)bVar5 & 1) == 0) {
                  if (bVar5 == (basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>>
                                )0x8) {
                    uVar17 = 4;
                    goto LAB_00c059ec;
                  }
                  uVar10 = (ulong)((byte)bVar5 >> 1);
                  *in_x8 = (basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>>
                            )((char)bVar5 + 2);
                  pbVar13 = pbVar3;
                }
                else {
                  uVar10 = *(ulong *)(in_x8 + 8);
                  uVar17 = (*(ulong *)in_x8 & 0xfffffffffffffffe) - 1;
                  if (uVar10 == uVar17) {
LAB_00c059ec:
                    uVar10 = uVar17;
                    basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>>
                    ::__grow_by(in_x8,uVar10,1,uVar10,uVar10,0,0);
                  }
                  *(ulong *)(in_x8 + 8) = uVar10 + 1;
                  pbVar13 = *(basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>>
                              **)(in_x8 + 0x10);
                }
                p_Var16 = (__locale_struct *)((long)p_Var18->__locales + 4);
                *(undefined8 *)(pbVar13 + uVar10 * 4) = 0x25;
              }
              else {
                bVar5 = *in_x8;
                uVar14 = *(undefined4 *)p_Var18->__locales;
                if (((byte)bVar5 & 1) == 0) {
                  if (bVar5 == (basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>>
                                )0x8) {
                    uVar17 = 4;
                    goto LAB_00c058ac;
                  }
                  uVar10 = (ulong)((byte)bVar5 >> 1);
                  *in_x8 = (basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>>
                            )((char)bVar5 + 2);
                  pbVar13 = pbVar3;
                }
                else {
                  uVar10 = *(ulong *)(in_x8 + 8);
                  uVar17 = (*(ulong *)in_x8 & 0xfffffffffffffffe) - 1;
                  if (uVar10 == uVar17) {
LAB_00c058ac:
                    uVar10 = uVar17;
                    basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>>
                    ::__grow_by(in_x8,uVar10,1,uVar10,uVar10,0,0);
                  }
                  *(ulong *)(in_x8 + 8) = uVar10 + 1;
                  pbVar13 = *(basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>>
                              **)(in_x8 + 0x10);
                }
                p_Var16 = (__locale_struct *)((long)p_Var18->__locales + 4);
                *(undefined4 *)(pbVar13 + uVar10 * 4) = uVar14;
                *(undefined4 *)(pbVar13 + uVar10 * 4 + 4) = 0;
              }
              goto LAB_00c0508c;
            }
            uVar10 = (**(code **)(*in_x2 + 0x18))();
            if ((uVar10 & 1) == 0) {
              iVar15 = 0;
LAB_00c0566c:
            }
            else {
              uVar7 = (**(code **)(*in_x2 + 0x68))();
              p_Var16 = (__locale_struct *)((long)p_Var18->__locales + 4);
              iVar15 = (uVar7 & 0xff) - 0x30;
              if (p_Var16 == p_Var4) {
joined_r0x00c057a0:
                if (p_Var16 == p_Var4) goto LAB_00c0566c;
              }
              else {
                    /* try { // try from 00c05338 to 00c0540b has its CatchHandler @ 00c065b0 */
                uVar10 = (**(code **)(*in_x2 + 0x18))();
                if ((uVar10 & 1) != 0) {
                  uVar7 = (**(code **)(*in_x2 + 0x68))();
                  p_Var16 = (__locale_struct *)(p_Var18->__locales + 1);
                  iVar15 = iVar15 * 10 + (uVar7 & 0xff) + -0x30;
                  if (p_Var16 != p_Var4) {
                    uVar10 = (**(code **)(*in_x2 + 0x18))();
                    if ((uVar10 & 1) == 0) goto LAB_00c057a8;
                    uVar7 = (**(code **)(*in_x2 + 0x68))();
                    p_Var16 = (__locale_struct *)((long)p_Var18->__locales + 0xc);
                    iVar15 = iVar15 * 10 + (uVar7 & 0xff) + -0x30;
                    if (p_Var16 != p_Var4) {
                      uVar10 = (**(code **)(*in_x2 + 0x18))();
                      if ((uVar10 & 1) == 0) goto LAB_00c057a8;
                      uVar7 = (**(code **)(*in_x2 + 0x68))();
                      p_Var16 = (__locale_struct *)(p_Var18->__locales + 2);
                      iVar15 = iVar15 * 10 + (uVar7 & 0xff) + -0x30;
                    }
                  }
                  goto joined_r0x00c057a0;
                }
              }
            }
LAB_00c057a8:
            if (0x1e < iVar15) {
              if (0x3c < iVar15) {
                if (iVar15 != 0x3d) {
                  if (iVar15 == 0x16c) {
                    bVar5 = *in_x8;
                    if (((byte)bVar5 & 1) == 0) {
                      if (bVar5 == (basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>>
                                    )0x8) {
                        uVar17 = 4;
                        goto LAB_00c05ce8;
                      }
                      uVar10 = (ulong)((byte)bVar5 >> 1);
                      *in_x8 = (basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>>
                                )((char)bVar5 + 2);
                      pbVar13 = pbVar3;
                    }
                    else {
                      uVar10 = *(ulong *)(in_x8 + 8);
                      uVar17 = (*(ulong *)in_x8 & 0xfffffffffffffffe) - 1;
                      if (uVar10 == uVar17) {
LAB_00c05ce8:
                        uVar10 = uVar17;
                        basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>>
                        ::__grow_by(in_x8,uVar10,1,uVar10,uVar10,0,0);
                      }
                      *(ulong *)(in_x8 + 8) = uVar10 + 1;
                      pbVar13 = *(basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>>
                                  **)(in_x8 + 0x10);
                    }
                    *(undefined8 *)(pbVar13 + uVar10 * 4) = 0x25;
                    bVar5 = *in_x8;
                    if (((byte)bVar5 & 1) == 0) {
                      if (bVar5 == (basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>>
                                    )0x8) {
                        uVar17 = 4;
                        goto LAB_00c06104;
                      }
                      uVar10 = (ulong)((byte)bVar5 >> 1);
                      *in_x8 = (basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>>
                                )((char)bVar5 + 2);
                      pbVar13 = pbVar3;
                    }
                    else {
                      uVar10 = *(ulong *)(in_x8 + 8);
                      uVar17 = (*(ulong *)in_x8 & 0xfffffffffffffffe) - 1;
                      if (uVar10 == uVar17) {
LAB_00c06104:
                        uVar10 = uVar17;
                        basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>>
                        ::__grow_by(in_x8,uVar10,1,uVar10,uVar10,0,0);
                      }
                      *(ulong *)(in_x8 + 8) = uVar10 + 1;
                      pbVar13 = *(basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>>
                                  **)(in_x8 + 0x10);
                    }
                    *(undefined8 *)(pbVar13 + uVar10 * 4) = 0x6a;
                    goto LAB_00c0508c;
                  }
                  if (iVar15 != 0x80d) goto joined_r0x00c05b1c;
                  bVar5 = *in_x8;
                  if (((byte)bVar5 & 1) == 0) {
                    if (bVar5 == (basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>>
                                  )0x8) {
                      uVar17 = 4;
                      goto LAB_00c05e08;
                    }
                    uVar10 = (ulong)((byte)bVar5 >> 1);
                    *in_x8 = (basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>>
                              )((char)bVar5 + 2);
                    pbVar13 = pbVar3;
                  }
                  else {
                    uVar10 = *(ulong *)(in_x8 + 8);
                    uVar17 = (*(ulong *)in_x8 & 0xfffffffffffffffe) - 1;
                    if (uVar10 == uVar17) {
LAB_00c05e08:
                      uVar10 = uVar17;
                      basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>>
                      ::__grow_by(in_x8,uVar10,1,uVar10,uVar10,0,0);
                    }
                    *(ulong *)(in_x8 + 8) = uVar10 + 1;
                    pbVar13 = *(basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>>
                                **)(in_x8 + 0x10);
                  }
                  *(undefined8 *)(pbVar13 + uVar10 * 4) = 0x25;
                  bVar5 = *in_x8;
                  if (((byte)bVar5 & 1) == 0) {
                    if (bVar5 == (basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>>
                                  )0x8) {
                      uVar17 = 4;
                      goto LAB_00c062f4;
                    }
                    uVar10 = (ulong)((byte)bVar5 >> 1);
                    *in_x8 = (basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>>
                              )((char)bVar5 + 2);
                    pbVar13 = pbVar3;
                  }
                  else {
                    uVar10 = *(ulong *)(in_x8 + 8);
                    uVar17 = (*(ulong *)in_x8 & 0xfffffffffffffffe) - 1;
                    if (uVar10 == uVar17) {
LAB_00c062f4:
                      uVar10 = uVar17;
                      basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>>
                      ::__grow_by(in_x8,uVar10,1,uVar10,uVar10,0,0);
                    }
                    *(ulong *)(in_x8 + 8) = uVar10 + 1;
                    pbVar13 = *(basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>>
                                **)(in_x8 + 0x10);
                  }
                  *(undefined8 *)(pbVar13 + uVar10 * 4) = 0x59;
                  goto LAB_00c0508c;
                }
                bVar5 = *in_x8;
                if (((byte)bVar5 & 1) == 0) {
                  if (bVar5 == (basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>>
                                )0x8) {
                    uVar17 = 4;
                    goto LAB_00c05e98;
                  }
                  uVar10 = (ulong)((byte)bVar5 >> 1);
                  *in_x8 = (basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>>
                            )((char)bVar5 + 2);
                  pbVar13 = pbVar3;
                }
                else {
                  uVar10 = *(ulong *)(in_x8 + 8);
                  uVar17 = (*(ulong *)in_x8 & 0xfffffffffffffffe) - 1;
                  if (uVar10 == uVar17) {
LAB_00c05e98:
                    uVar10 = uVar17;
                    basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>>
                    ::__grow_by(in_x8,uVar10,1,uVar10,uVar10,0,0);
                  }
                  *(ulong *)(in_x8 + 8) = uVar10 + 1;
                  pbVar13 = *(basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>>
                              **)(in_x8 + 0x10);
                }
                *(undefined8 *)(pbVar13 + uVar10 * 4) = 0x25;
                bVar5 = *in_x8;
                if (((byte)bVar5 & 1) == 0) {
                  if (bVar5 == (basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>>
                                )0x8) {
                    uVar17 = 4;
                    goto LAB_00c063ec;
                  }
                  uVar10 = (ulong)((byte)bVar5 >> 1);
                  *in_x8 = (basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>>
                            )((char)bVar5 + 2);
                  pbVar13 = pbVar3;
                }
                else {
                  uVar10 = *(ulong *)(in_x8 + 8);
                  uVar17 = (*(ulong *)in_x8 & 0xfffffffffffffffe) - 1;
                  if (uVar10 == uVar17) {
LAB_00c063ec:
                    uVar10 = uVar17;
                    basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>>
                    ::__grow_by(in_x8,uVar10,1,uVar10,uVar10,0,0);
                  }
                  *(ulong *)(in_x8 + 8) = uVar10 + 1;
                  pbVar13 = *(basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>>
                              **)(in_x8 + 0x10);
                }
                *(undefined8 *)(pbVar13 + uVar10 * 4) = 0x79;
                goto LAB_00c0508c;
              }
              if (iVar15 != 0x1f) {
                if (iVar15 == 0x37) {
                  bVar5 = *in_x8;
                  if (((byte)bVar5 & 1) == 0) {
                    if (bVar5 == (basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>>
                                  )0x8) {
                      uVar17 = 4;
                      goto LAB_00c05ca0;
                    }
                    uVar10 = (ulong)((byte)bVar5 >> 1);
                    *in_x8 = (basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>>
                              )((char)bVar5 + 2);
                    pbVar13 = pbVar3;
                  }
                  else {
                    uVar10 = *(ulong *)(in_x8 + 8);
                    uVar17 = (*(ulong *)in_x8 & 0xfffffffffffffffe) - 1;
                    if (uVar10 == uVar17) {
LAB_00c05ca0:
                      uVar10 = uVar17;
                      basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>>
                      ::__grow_by(in_x8,uVar10,1,uVar10,uVar10,0,0);
                    }
                    *(ulong *)(in_x8 + 8) = uVar10 + 1;
                    pbVar13 = *(basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>>
                                **)(in_x8 + 0x10);
                  }
                  *(undefined8 *)(pbVar13 + uVar10 * 4) = 0x25;
                  bVar5 = *in_x8;
                  if (((byte)bVar5 & 1) == 0) {
                    if (bVar5 == (basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>>
                                  )0x8) {
                      uVar17 = 4;
                      goto LAB_00c06088;
                    }
                    uVar10 = (ulong)((byte)bVar5 >> 1);
                    *in_x8 = (basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>>
                              )((char)bVar5 + 2);
                    pbVar13 = pbVar3;
                  }
                  else {
                    uVar10 = *(ulong *)(in_x8 + 8);
                    uVar17 = (*(ulong *)in_x8 & 0xfffffffffffffffe) - 1;
                    if (uVar10 == uVar17) {
LAB_00c06088:
                      uVar10 = uVar17;
                      basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>>
                      ::__grow_by(in_x8,uVar10,1,uVar10,uVar10,0,0);
                    }
                    *(ulong *)(in_x8 + 8) = uVar10 + 1;
                    pbVar13 = *(basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>>
                                **)(in_x8 + 0x10);
                  }
                  *(undefined8 *)(pbVar13 + uVar10 * 4) = 0x4d;
                  goto LAB_00c0508c;
                }
                if (iVar15 != 0x3b) goto joined_r0x00c05b1c;
                bVar5 = *in_x8;
                if (((byte)bVar5 & 1) == 0) {
                  if (bVar5 == (basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>>
                                )0x8) {
                    uVar17 = 4;
                    goto LAB_00c05dc0;
                  }
                  uVar10 = (ulong)((byte)bVar5 >> 1);
                  *in_x8 = (basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>>
                            )((char)bVar5 + 2);
                  pbVar13 = pbVar3;
                }
                else {
                  uVar10 = *(ulong *)(in_x8 + 8);
                  uVar17 = (*(ulong *)in_x8 & 0xfffffffffffffffe) - 1;
                  if (uVar10 == uVar17) {
LAB_00c05dc0:
                    uVar10 = uVar17;
                    basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>>
                    ::__grow_by(in_x8,uVar10,1,uVar10,uVar10,0,0);
                  }
                  *(ulong *)(in_x8 + 8) = uVar10 + 1;
                  pbVar13 = *(basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>>
                              **)(in_x8 + 0x10);
                }
                *(undefined8 *)(pbVar13 + uVar10 * 4) = 0x25;
                bVar5 = *in_x8;
                if (((byte)bVar5 & 1) == 0) {
                  if (bVar5 == (basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>>
                                )0x8) {
                    uVar17 = 4;
                    goto LAB_00c06278;
                  }
                  uVar10 = (ulong)((byte)bVar5 >> 1);
                  *in_x8 = (basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>>
                            )((char)bVar5 + 2);
                  pbVar13 = pbVar3;
                }
                else {
                  uVar10 = *(ulong *)(in_x8 + 8);
                  uVar17 = (*(ulong *)in_x8 & 0xfffffffffffffffe) - 1;
                  if (uVar10 == uVar17) {
LAB_00c06278:
                    uVar10 = uVar17;
                    basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>>
                    ::__grow_by(in_x8,uVar10,1,uVar10,uVar10,0,0);
                  }
                  *(ulong *)(in_x8 + 8) = uVar10 + 1;
                  pbVar13 = *(basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>>
                              **)(in_x8 + 0x10);
                }
                *(undefined8 *)(pbVar13 + uVar10 * 4) = 0x53;
                goto LAB_00c0508c;
              }
              bVar5 = *in_x8;
              if (((byte)bVar5 & 1) == 0) {
                if (bVar5 == (basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>>
                              )0x8) {
                  uVar17 = 4;
                  goto LAB_00c05e50;
                }
                uVar10 = (ulong)((byte)bVar5 >> 1);
                *in_x8 = (basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>>
                          )((char)bVar5 + 2);
                pbVar13 = pbVar3;
              }
              else {
                uVar10 = *(ulong *)(in_x8 + 8);
                uVar17 = (*(ulong *)in_x8 & 0xfffffffffffffffe) - 1;
                if (uVar10 == uVar17) {
LAB_00c05e50:
                  uVar10 = uVar17;
                  basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>>
                  ::__grow_by(in_x8,uVar10,1,uVar10,uVar10,0,0);
                }
                *(ulong *)(in_x8 + 8) = uVar10 + 1;
                pbVar13 = *(basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>>
                            **)(in_x8 + 0x10);
              }
              *(undefined8 *)(pbVar13 + uVar10 * 4) = 0x25;
              bVar5 = *in_x8;
              if (((byte)bVar5 & 1) == 0) {
                if (bVar5 == (basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>>
                              )0x8) {
                  uVar17 = 4;
                  goto LAB_00c06370;
                }
                uVar10 = (ulong)((byte)bVar5 >> 1);
                *in_x8 = (basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>>
                          )((char)bVar5 + 2);
                pbVar13 = pbVar3;
              }
              else {
                uVar10 = *(ulong *)(in_x8 + 8);
                uVar17 = (*(ulong *)in_x8 & 0xfffffffffffffffe) - 1;
                if (uVar10 == uVar17) {
LAB_00c06370:
                  uVar10 = uVar17;
                  basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>>
                  ::__grow_by(in_x8,uVar10,1,uVar10,uVar10,0,0);
                }
                *(ulong *)(in_x8 + 8) = uVar10 + 1;
                pbVar13 = *(basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>>
                            **)(in_x8 + 0x10);
              }
              *(undefined8 *)(pbVar13 + uVar10 * 4) = 100;
              goto LAB_00c0508c;
            }
            if (iVar15 < 0xb) {
              if (iVar15 == 6) {
                bVar5 = *in_x8;
                if (((byte)bVar5 & 1) == 0) {
                  if (bVar5 == (basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>>
                                )0x8) {
                    uVar17 = 4;
                    goto LAB_00c05bc8;
                  }
                  uVar10 = (ulong)((byte)bVar5 >> 1);
                  *in_x8 = (basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>>
                            )((char)bVar5 + 2);
                  pbVar13 = pbVar3;
                }
                else {
                  uVar10 = *(ulong *)(in_x8 + 8);
                  uVar17 = (*(ulong *)in_x8 & 0xfffffffffffffffe) - 1;
                  if (uVar10 == uVar17) {
LAB_00c05bc8:
                    /* try { // try from 00c05bc8 to 00c0640b has its CatchHandler @ 00c065d4 */
                    uVar10 = uVar17;
                    basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>>
                    ::__grow_by(in_x8,uVar10,1,uVar10,uVar10,0,0);
                  }
                  *(ulong *)(in_x8 + 8) = uVar10 + 1;
                  pbVar13 = *(basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>>
                              **)(in_x8 + 0x10);
                }
                *(undefined8 *)(pbVar13 + uVar10 * 4) = 0x25;
                bVar5 = *in_x8;
                if (((byte)bVar5 & 1) == 0) {
                  if (bVar5 == (basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>>
                                )0x8) {
                    uVar17 = 4;
                    goto LAB_00c05f14;
                  }
                  uVar10 = (ulong)((byte)bVar5 >> 1);
                  *in_x8 = (basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>>
                            )((char)bVar5 + 2);
                  pbVar13 = pbVar3;
                }
                else {
                  uVar10 = *(ulong *)(in_x8 + 8);
                  uVar17 = (*(ulong *)in_x8 & 0xfffffffffffffffe) - 1;
                  if (uVar10 == uVar17) {
LAB_00c05f14:
                    uVar10 = uVar17;
                    basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>>
                    ::__grow_by(in_x8,uVar10,1,uVar10,uVar10,0,0);
                  }
                  *(ulong *)(in_x8 + 8) = uVar10 + 1;
                  pbVar13 = *(basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>>
                              **)(in_x8 + 0x10);
                }
                *(undefined8 *)(pbVar13 + uVar10 * 4) = 0x77;
                goto LAB_00c0508c;
              }
              if (iVar15 != 7) {
joined_r0x00c05b1c:
                while (local_78[0] != p_Var16) {
                  bVar5 = *in_x8;
                  uVar14 = *(undefined4 *)local_78[0]->__locales;
                  if (((byte)bVar5 & 1) == 0) {
                    if (bVar5 == (basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>>
                                  )0x8) {
                      uVar17 = 4;
                      goto LAB_00c05b28;
                    }
                    uVar10 = (ulong)((byte)bVar5 >> 1);
                    *in_x8 = (basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>>
                              )((char)bVar5 + 2);
                    pbVar13 = pbVar3;
                  }
                  else {
                    uVar10 = *(ulong *)(in_x8 + 8);
                    uVar17 = (*(ulong *)in_x8 & 0xfffffffffffffffe) - 1;
                    if (uVar10 == uVar17) {
LAB_00c05b28:
                    /* try { // try from 00c05b28 to 00c05b47 has its CatchHandler @ 00c065b8 */
                      uVar10 = uVar17;
                      basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>>
                      ::__grow_by(in_x8,uVar10,1,uVar10,uVar10,0,0);
                    }
                    pbVar13 = *(basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>>
                                **)(in_x8 + 0x10);
                    *(ulong *)(in_x8 + 8) = uVar10 + 1;
                  }
                  local_78[0] = (__locale_struct *)((long)local_78[0]->__locales + 4);
                  *(undefined4 *)(pbVar13 + uVar10 * 4) = uVar14;
                  *(undefined4 *)(pbVar13 + uVar10 * 4 + 4) = 0;
                }
                goto LAB_00c0508c;
              }
              bVar5 = *in_x8;
              if (((byte)bVar5 & 1) == 0) {
                if (bVar5 == (basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>>
                              )0x8) {
                  uVar17 = 4;
                  goto LAB_00c05c10;
                }
                uVar10 = (ulong)((byte)bVar5 >> 1);
                *in_x8 = (basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>>
                          )((char)bVar5 + 2);
                pbVar13 = pbVar3;
              }
              else {
                uVar10 = *(ulong *)(in_x8 + 8);
                uVar17 = (*(ulong *)in_x8 & 0xfffffffffffffffe) - 1;
                if (uVar10 == uVar17) {
LAB_00c05c10:
                  uVar10 = uVar17;
                  basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>>
                  ::__grow_by(in_x8,uVar10,1,uVar10,uVar10,0,0);
                }
                *(ulong *)(in_x8 + 8) = uVar10 + 1;
                pbVar13 = *(basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>>
                            **)(in_x8 + 0x10);
              }
              *(undefined8 *)(pbVar13 + uVar10 * 4) = 0x25;
              bVar5 = *in_x8;
              if (((byte)bVar5 & 1) == 0) {
                if (bVar5 == (basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>>
                              )0x8) {
                  uVar17 = 4;
                  goto LAB_00c05f90;
                }
                uVar10 = (ulong)((byte)bVar5 >> 1);
                *in_x8 = (basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>>
                          )((char)bVar5 + 2);
                pbVar13 = pbVar3;
              }
              else {
                uVar10 = *(ulong *)(in_x8 + 8);
                uVar17 = (*(ulong *)in_x8 & 0xfffffffffffffffe) - 1;
                if (uVar10 == uVar17) {
LAB_00c05f90:
                  uVar10 = uVar17;
                  basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>>
                  ::__grow_by(in_x8,uVar10,1,uVar10,uVar10,0,0);
                }
                *(ulong *)(in_x8 + 8) = uVar10 + 1;
                pbVar13 = *(basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>>
                            **)(in_x8 + 0x10);
              }
              *(undefined8 *)(pbVar13 + uVar10 * 4) = 0x75;
              goto LAB_00c0508c;
            }
            if (iVar15 != 0xb) {
              if (iVar15 == 0xc) {
                bVar5 = *in_x8;
                if (((byte)bVar5 & 1) == 0) {
                  if (bVar5 == (basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>>
                                )0x8) {
                    uVar17 = 4;
                    goto LAB_00c05c58;
                  }
                  uVar10 = (ulong)((byte)bVar5 >> 1);
                  *in_x8 = (basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>>
                            )((char)bVar5 + 2);
                  pbVar13 = pbVar3;
                }
                else {
                  uVar10 = *(ulong *)(in_x8 + 8);
                  uVar17 = (*(ulong *)in_x8 & 0xfffffffffffffffe) - 1;
                  if (uVar10 == uVar17) {
LAB_00c05c58:
                    uVar10 = uVar17;
                    basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>>
                    ::__grow_by(in_x8,uVar10,1,uVar10,uVar10,0,0);
                  }
                  *(ulong *)(in_x8 + 8) = uVar10 + 1;
                  pbVar13 = *(basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>>
                              **)(in_x8 + 0x10);
                }
                *(undefined8 *)(pbVar13 + uVar10 * 4) = 0x25;
                bVar5 = *in_x8;
                if (((byte)bVar5 & 1) == 0) {
                  if (bVar5 == (basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>>
                                )0x8) {
                    uVar17 = 4;
                    goto LAB_00c0600c;
                  }
                  uVar10 = (ulong)((byte)bVar5 >> 1);
                  *in_x8 = (basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>>
                            )((char)bVar5 + 2);
                  pbVar13 = pbVar3;
                }
                else {
                  uVar10 = *(ulong *)(in_x8 + 8);
                  uVar17 = (*(ulong *)in_x8 & 0xfffffffffffffffe) - 1;
                  if (uVar10 == uVar17) {
LAB_00c0600c:
                    uVar10 = uVar17;
                    basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>>
                    ::__grow_by(in_x8,uVar10,1,uVar10,uVar10,0,0);
                  }
                  *(ulong *)(in_x8 + 8) = uVar10 + 1;
                  pbVar13 = *(basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>>
                              **)(in_x8 + 0x10);
                }
                *(undefined8 *)(pbVar13 + uVar10 * 4) = 0x6d;
                goto LAB_00c0508c;
              }
              if (iVar15 != 0x17) goto joined_r0x00c05b1c;
              bVar5 = *in_x8;
              if (((byte)bVar5 & 1) == 0) {
                if (bVar5 == (basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>>
                              )0x8) {
                  uVar17 = 4;
                  goto LAB_00c05d30;
                }
                uVar10 = (ulong)((byte)bVar5 >> 1);
                *in_x8 = (basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>>
                          )((char)bVar5 + 2);
                pbVar13 = pbVar3;
              }
              else {
                uVar10 = *(ulong *)(in_x8 + 8);
                uVar17 = (*(ulong *)in_x8 & 0xfffffffffffffffe) - 1;
                if (uVar10 == uVar17) {
LAB_00c05d30:
                  uVar10 = uVar17;
                  basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>>
                  ::__grow_by(in_x8,uVar10,1,uVar10,uVar10,0,0);
                }
                *(ulong *)(in_x8 + 8) = uVar10 + 1;
                pbVar13 = *(basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>>
                            **)(in_x8 + 0x10);
              }
              *(undefined8 *)(pbVar13 + uVar10 * 4) = 0x25;
              bVar5 = *in_x8;
              if (((byte)bVar5 & 1) == 0) {
                if (bVar5 == (basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>>
                              )0x8) {
                  uVar17 = 4;
                  goto LAB_00c06180;
                }
                uVar10 = (ulong)((byte)bVar5 >> 1);
                *in_x8 = (basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>>
                          )((char)bVar5 + 2);
                pbVar13 = pbVar3;
              }
              else {
                uVar10 = *(ulong *)(in_x8 + 8);
                uVar17 = (*(ulong *)in_x8 & 0xfffffffffffffffe) - 1;
                if (uVar10 == uVar17) {
LAB_00c06180:
                  uVar10 = uVar17;
                  basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>>
                  ::__grow_by(in_x8,uVar10,1,uVar10,uVar10,0,0);
                }
                *(ulong *)(in_x8 + 8) = uVar10 + 1;
                pbVar13 = *(basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>>
                            **)(in_x8 + 0x10);
              }
              *(undefined8 *)(pbVar13 + uVar10 * 4) = 0x48;
              goto LAB_00c0508c;
            }
            bVar5 = *in_x8;
            if (((byte)bVar5 & 1) == 0) {
              if (bVar5 == (basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>>
                            )0x8) {
                uVar17 = 4;
                goto LAB_00c05d78;
              }
              uVar10 = (ulong)((byte)bVar5 >> 1);
              *in_x8 = (basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>>
                        )((char)bVar5 + 2);
              pbVar13 = pbVar3;
            }
            else {
              uVar10 = *(ulong *)(in_x8 + 8);
              uVar17 = (*(ulong *)in_x8 & 0xfffffffffffffffe) - 1;
              if (uVar10 == uVar17) {
LAB_00c05d78:
                uVar10 = uVar17;
                basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>>
                ::__grow_by(in_x8,uVar10,1,uVar10,uVar10,0,0);
              }
              *(ulong *)(in_x8 + 8) = uVar10 + 1;
              pbVar13 = *(basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>>
                          **)(in_x8 + 0x10);
            }
            *(undefined8 *)(pbVar13 + uVar10 * 4) = 0x25;
            bVar5 = *in_x8;
            if (((byte)bVar5 & 1) == 0) {
              if (bVar5 == (basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>>
                            )0x8) {
                uVar17 = 4;
                goto LAB_00c061fc;
              }
              uVar10 = (ulong)((byte)bVar5 >> 1);
              *in_x8 = (basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>>
                        )((char)bVar5 + 2);
              pbVar13 = pbVar3;
            }
            else {
              uVar10 = *(ulong *)(in_x8 + 8);
              uVar17 = (*(ulong *)in_x8 & 0xfffffffffffffffe) - 1;
              if (uVar10 == uVar17) {
LAB_00c061fc:
                uVar10 = uVar17;
                basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>>
                ::__grow_by(in_x8,uVar10,1,uVar10,uVar10,0,0);
              }
              *(ulong *)(in_x8 + 8) = uVar10 + 1;
              pbVar13 = *(basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>>
                          **)(in_x8 + 0x10);
            }
            *(undefined8 *)(pbVar13 + uVar10 * 4) = 0x49;
            goto LAB_00c0508c;
          }
          bVar5 = *in_x8;
          if (((byte)bVar5 & 1) == 0) {
            if (bVar5 == (basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>>
                          )0x8) {
              uVar17 = 4;
              goto LAB_00c054fc;
            }
            uVar10 = (ulong)((byte)bVar5 >> 1);
            *in_x8 = (basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>>
                      )((char)bVar5 + 2);
            pbVar13 = pbVar3;
          }
          else {
            uVar10 = *(ulong *)(in_x8 + 8);
            uVar17 = (*(ulong *)in_x8 & 0xfffffffffffffffe) - 1;
            if (uVar10 == uVar17) {
LAB_00c054fc:
              uVar10 = uVar17;
              basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>>
              ::__grow_by(in_x8,uVar10,1,uVar10,uVar10,0,0);
            }
            *(ulong *)(in_x8 + 8) = uVar10 + 1;
            pbVar13 = *(basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>>
                        **)(in_x8 + 0x10);
          }
          *(undefined8 *)(pbVar13 + uVar10 * 4) = 0x25;
          bVar5 = *in_x8;
          if (lVar11 - (long)puVar1 < 0x120) {
            if (((byte)bVar5 & 1) == 0) {
              if (bVar5 == (basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>>
                            )0x8) {
                uVar17 = 4;
                goto LAB_00c055e8;
              }
              uVar10 = (ulong)((byte)bVar5 >> 1);
              *in_x8 = (basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>>
                        )((char)bVar5 + 2);
              pbVar13 = pbVar3;
            }
            else {
              uVar10 = *(ulong *)(in_x8 + 8);
              uVar17 = (*(ulong *)in_x8 & 0xfffffffffffffffe) - 1;
              if (uVar10 == uVar17) {
LAB_00c055e8:
                uVar10 = uVar17;
                basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>>
                ::__grow_by(in_x8,uVar10,1,uVar10,uVar10,0,0);
              }
              *(ulong *)(in_x8 + 8) = uVar10 + 1;
              pbVar13 = *(basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>>
                          **)(in_x8 + 0x10);
            }
            pbVar13 = pbVar13 + uVar10 * 4;
            uVar14 = 0x42;
          }
          else {
            if (((byte)bVar5 & 1) == 0) {
              if (bVar5 == (basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>>
                            )0x8) {
                uVar17 = 4;
                goto LAB_00c05630;
              }
              uVar10 = (ulong)((byte)bVar5 >> 1);
              *in_x8 = (basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>>
                        )((char)bVar5 + 2);
              pbVar13 = pbVar3;
            }
            else {
              uVar10 = *(ulong *)(in_x8 + 8);
              uVar17 = (*(ulong *)in_x8 & 0xfffffffffffffffe) - 1;
              if (uVar10 == uVar17) {
LAB_00c05630:
                uVar10 = uVar17;
                basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>>
                ::__grow_by(in_x8,uVar10,1,uVar10,uVar10,0,0);
              }
              *(ulong *)(in_x8 + 8) = uVar10 + 1;
              pbVar13 = *(basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>>
                          **)(in_x8 + 0x10);
            }
            pbVar13 = pbVar13 + uVar10 * 4;
            uVar14 = 0x62;
          }
          *(undefined4 *)pbVar13 = uVar14;
          *(undefined4 *)(pbVar13 + 4) = 0;
          if ((((uint)param_2 & 0xff) == 0x78) &&
             (uVar10 = (**(code **)(*in_x2 + 0x18))(), (uVar10 & 1) != 0)) {
            uVar10 = (ulong)((byte)*in_x8 >> 1);
            pbVar13 = pbVar3;
            if (((byte)*in_x8 & 1) != 0) {
              uVar10 = *(ulong *)(in_x8 + 8);
              pbVar13 = *(basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>>
                          **)(in_x8 + 0x10);
            }
            *(undefined4 *)(pbVar13 + uVar10 * 4 + -4) = 0x6d;
          }
        }
LAB_00c05088:
        p_Var16 = local_78[0];
      }
      else {
        bVar5 = *in_x8;
        if (((byte)bVar5 & 1) == 0) {
          if (bVar5 == (basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>>
                        )0x8) {
            uVar17 = 4;
            goto LAB_00c0512c;
          }
          uVar10 = (ulong)((byte)bVar5 >> 1);
          *in_x8 = (basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>>
                    )((char)bVar5 + 2);
          pbVar13 = pbVar3;
        }
        else {
          uVar10 = *(ulong *)(in_x8 + 8);
          uVar17 = (*(ulong *)in_x8 & 0xfffffffffffffffe) - 1;
          if (uVar10 == uVar17) {
LAB_00c0512c:
                    /* try { // try from 00c0512c to 00c0514b has its CatchHandler @ 00c065d0 */
            uVar10 = uVar17;
            basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>>
            ::__grow_by(in_x8,uVar10,1,uVar10,uVar10,0,0);
          }
          *(ulong *)(in_x8 + 8) = uVar10 + 1;
          pbVar13 = *(basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>>
                      **)(in_x8 + 0x10);
        }
        *(undefined8 *)(pbVar13 + uVar10 * 4) = 0x20;
        do {
          p_Var16 = (__locale_struct *)((long)p_Var16->__locales + 4);
          if (p_Var16 == p_Var4) break;
                    /* try { // try from 00c051e0 to 00c051eb has its CatchHandler @ 00c065d8 */
          uVar10 = (**(code **)(*in_x2 + 0x18))();
        } while ((uVar10 & 1) != 0);
      }
LAB_00c0508c:
      p_Var18 = p_Var16;
    } while (p_Var16 != p_Var4);
  }
  return;
}

