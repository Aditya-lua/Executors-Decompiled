/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c04650
 */

/* std::__ndk1::__time_get_storage<char>::__analyze(char, std::__ndk1::ctype<char> const&) */

void std::__ndk1::__time_get_storage<char>::__analyze(char param_1,ctype *param_2)

{
  undefined8 *puVar1;
  undefined8 *puVar2;
  char *pcVar3;
  ulong uVar4;
  ulong uVar5;
  basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *pbVar6;
  uint uVar7;
  undefined8 *puVar8;
  size_t sVar9;
  long lVar10;
  char cVar11;
  long *in_x2;
  basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *in_x8;
  byte *pbVar12;
  byte *pbVar13;
  char *pcVar14;
  int iVar15;
  char *pcVar16;
  char *local_120;
  char local_118;
  undefined1 local_117;
  undefined1 local_116;
  char local_114 [100];
  tm local_b0;
  
  puVar8 = (undefined8 *)(ulong)(byte)param_1;
  local_b0.tm_gmtoff = 0;
  local_b0.tm_zone = (char *)0x0;
  local_b0.tm_hour = 0x17;
  local_b0.tm_mday = 0x1f;
  local_b0.tm_sec = 0x3b;
  local_b0.tm_min = 0x37;
  local_117 = SUB81(param_2,0);
  local_b0.tm_wday = 6;
  local_b0.tm_yday = 0x16c;
  local_b0.tm_mon = 0xb;
  local_b0.tm_year = 0xa1;
  local_b0.tm_isdst = -1;
  local_b0._36_4_ = 0;
  local_116 = 0;
  local_118 = '%';
  sVar9 = strftime_l(local_114,100,&local_118,&local_b0,(__locale_t)*puVar8);
  *(undefined8 *)(in_x8 + 8) = 0;
  *(undefined8 *)(in_x8 + 0x10) = 0;
  *(undefined8 *)in_x8 = 0;
  if (sVar9 != 0) {
    puVar1 = puVar8 + 0x2b;
    puVar2 = puVar8 + 0x73;
    pcVar16 = local_114;
    pcVar3 = local_114 + sVar9;
    do {
      if (((long)*pcVar16 < 0) || ((*(ulong *)(in_x2[2] + (long)*pcVar16 * 8) & 1) == 0)) {
                    /* try { // try from 00c04740 to 00c047e7 has its CatchHandler @ 00c04c34 */
        local_120 = pcVar16;
        lVar10 = FUN_00c04c58(&local_120,pcVar3,puVar8 + 1,puVar1);
        lVar10 = lVar10 - (long)(puVar8 + 1);
        if (lVar10 < 0x150) {
          basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::push_back
                    (in_x8,'%');
          cVar11 = 'A';
          if (0xa7 < lVar10) {
            cVar11 = 'a';
          }
          basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::push_back
                    (in_x8,cVar11);
        }
        else {
          local_120 = pcVar16;
          lVar10 = FUN_00c04c58(&local_120,pcVar3,puVar1,puVar2);
          lVar10 = lVar10 - (long)puVar1;
          if (lVar10 < 0x240) {
            basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::
            push_back(in_x8,'%');
            cVar11 = 'B';
            if (0x11f < lVar10) {
              cVar11 = 'b';
            }
            basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::
            push_back(in_x8,cVar11);
            if (((uint)param_2 & 0xff) == 0x78) {
              pbVar12 = (byte *)(puVar1 + (lVar10 >> 3));
              pbVar13 = *(byte **)(pbVar12 + 0x10);
              if ((*pbVar12 & 1) == 0) {
                pbVar13 = pbVar12 + 1;
              }
              if ((-1 < (long)(char)*pbVar13) &&
                 (((uint)*(undefined8 *)(in_x2[2] + (long)(char)*pbVar13 * 8) >> 6 & 1) != 0)) {
                uVar4 = (ulong)((byte)*in_x8 >> 1);
                pbVar6 = in_x8 + 1;
                if (((byte)*in_x8 & 1) != 0) {
                  uVar4 = *(ulong *)(in_x8 + 8);
                  pbVar6 = *(basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>
                             **)(in_x8 + 0x10);
                }
                pbVar6[uVar4 - 1] =
                     (basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>
                     )0x6d;
              }
            }
          }
          else {
            uVar4 = (ulong)(*(byte *)(puVar8 + 0x73) >> 1);
            if ((*(byte *)(puVar8 + 0x73) & 1) != 0) {
              uVar4 = puVar8[0x74];
            }
            uVar5 = (ulong)(*(byte *)(puVar8 + 0x76) >> 1);
            if ((*(byte *)(puVar8 + 0x76) & 1) != 0) {
              uVar5 = puVar8[0x77];
            }
                    /* try { // try from 00c048d4 to 00c04987 has its CatchHandler @ 00c04c34 */
            if ((uVar4 + uVar5 == 0) ||
               (local_120 = pcVar16, lVar10 = FUN_00c04c58(&local_120,pcVar3,puVar2,puVar8 + 0x79),
               0x2f < lVar10 - (long)puVar2)) {
              cVar11 = *pcVar16;
              if ((long)cVar11 < 0) {
LAB_00c04964:
                local_120 = pcVar16;
                basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::
                push_back(in_x8,cVar11);
LAB_00c0496c:
                pcVar14 = pcVar16 + 1;
              }
              else {
                if (((uint)*(undefined8 *)(in_x2[2] + (long)cVar11 * 8) >> 6 & 1) == 0) {
                  if (cVar11 != '%') goto LAB_00c04964;
                  local_120 = pcVar16;
                  basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::
                  push_back(in_x8,'%');
                  basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::
                  push_back(in_x8,'%');
                  goto LAB_00c0496c;
                }
                local_120 = pcVar16;
                uVar7 = (**(code **)(*in_x2 + 0x48))();
                pcVar14 = pcVar16 + 1;
                iVar15 = (uVar7 & 0xff) - 0x30;
                if (pcVar14 == pcVar3) {
LAB_00c04a60:
                  if (pcVar14 != pcVar3) goto LAB_00c04a68;
                  if (iVar15 < 0x1f) goto LAB_00c04ae4;
LAB_00c04a70:
                  if (iVar15 < 0x3d) {
                    if (iVar15 == 0x1f) {
                      basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>
                      ::push_back(in_x8,'%');
                      cVar11 = 'd';
                    }
                    else if (iVar15 == 0x37) {
                      basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>
                      ::push_back(in_x8,'%');
                      cVar11 = 'M';
                    }
                    else {
                      if (iVar15 != 0x3b) goto joined_r0x00c04bdc;
                    /* try { // try from 00c04a90 to 00c04bcb has its CatchHandler @ 00c04c34 */
                      basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>
                      ::push_back(in_x8,'%');
                      cVar11 = 'S';
                    }
                  }
                  else if (iVar15 == 0x3d) {
                    basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::
                    push_back(in_x8,'%');
                    cVar11 = 'y';
                  }
                  else if (iVar15 == 0x16c) {
                    basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::
                    push_back(in_x8,'%');
                    cVar11 = 'j';
                  }
                  else {
                    if (iVar15 != 0x80d) goto joined_r0x00c04bdc;
                    basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::
                    push_back(in_x8,'%');
                    cVar11 = 'Y';
                  }
LAB_00c04bc4:
                  basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::
                  push_back(in_x8,cVar11);
                }
                else {
                  if ((-1 < (long)*pcVar14) &&
                     (((uint)*(undefined8 *)(in_x2[2] + (long)*pcVar14 * 8) >> 6 & 1) != 0)) {
                    /* try { // try from 00c049b8 to 00c04a4b has its CatchHandler @ 00c04c28 */
                    uVar7 = (**(code **)(*in_x2 + 0x48))();
                    pcVar14 = pcVar16 + 2;
                    iVar15 = iVar15 * 10 + (uVar7 & 0xff) + -0x30;
                    if (pcVar14 != pcVar3) {
                      if (((long)*pcVar14 < 0) ||
                         (((uint)*(undefined8 *)(in_x2[2] + (long)*pcVar14 * 8) >> 6 & 1) == 0))
                      goto LAB_00c04a68;
                      uVar7 = (**(code **)(*in_x2 + 0x48))();
                      pcVar14 = pcVar16 + 3;
                      iVar15 = iVar15 * 10 + (uVar7 & 0xff) + -0x30;
                      if (pcVar14 != pcVar3) {
                        if (((long)*pcVar14 < 0) ||
                           (((uint)*(undefined8 *)(in_x2[2] + (long)*pcVar14 * 8) >> 6 & 1) == 0))
                        goto LAB_00c04a68;
                        uVar7 = (**(code **)(*in_x2 + 0x48))();
                        pcVar14 = pcVar16 + 4;
                        iVar15 = iVar15 * 10 + (uVar7 & 0xff) + -0x30;
                      }
                    }
                    goto LAB_00c04a60;
                  }
LAB_00c04a68:
                  if (0x1e < iVar15) goto LAB_00c04a70;
LAB_00c04ae4:
                  if (10 < iVar15) {
                    if (iVar15 == 0xb) {
                      basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>
                      ::push_back(in_x8,'%');
                      cVar11 = 'I';
                    }
                    else if (iVar15 == 0xc) {
                      basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>
                      ::push_back(in_x8,'%');
                      cVar11 = 'm';
                    }
                    else {
                      if (iVar15 != 0x17) goto joined_r0x00c04bdc;
                      basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>
                      ::push_back(in_x8,'%');
                      cVar11 = 'H';
                    }
                    goto LAB_00c04bc4;
                  }
                  if (iVar15 == 6) {
                    basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::
                    push_back(in_x8,'%');
                    cVar11 = 'w';
                    goto LAB_00c04bc4;
                  }
                  if (iVar15 == 7) {
                    basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::
                    push_back(in_x8,'%');
                    cVar11 = 'u';
                    goto LAB_00c04bc4;
                  }
joined_r0x00c04bdc:
                  for (; local_120 != pcVar14; local_120 = local_120 + 1) {
                    /* try { // try from 00c04be4 to 00c04beb has its CatchHandler @ 00c04c2c */
                    basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::
                    push_back(in_x8,*local_120);
                  }
                }
              }
              pcVar16 = pcVar14;
              goto LAB_00c0471c;
            }
            basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::
            push_back(in_x8,'%');
            basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::
            push_back(in_x8,'p');
          }
        }
        pcVar16 = local_120;
      }
      else {
                    /* try { // try from 00c0485c to 00c04867 has its CatchHandler @ 00c04c30 */
        basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::push_back
                  (in_x8,' ');
        pcVar14 = pcVar16;
        do {
          pcVar14 = pcVar14 + 1;
          if (pcVar14 == pcVar3) {
            pcVar16 = local_114 + sVar9;
            break;
          }
          if ((long)*pcVar14 < 0) {
            pcVar16 = pcVar14;
            break;
          }
          pcVar16 = pcVar16 + 1;
        } while ((*(ulong *)(in_x2[2] + (long)*pcVar14 * 8) & 1) != 0);
      }
LAB_00c0471c:
    } while (pcVar16 != pcVar3);
  }
  return;
}

