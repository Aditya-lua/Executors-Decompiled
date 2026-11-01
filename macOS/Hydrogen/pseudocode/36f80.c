
void FUN_00036f80(void)

{
  byte *pbVar1;
  long *plVar2;
  long lVar3;
  byte bVar4;
  ulong uVar5;
  byte *unaff_x20;
  long *unaff_x21;
  long lVar6;
  long unaff_x22;
  long unaff_x23;
  int unaff_w24;
  int unaff_w25;
  byte *unaff_x26;
  byte *pbVar7;
  long unaff_x27;
  long *unaff_x28;
  
  do {
    pbVar7 = unaff_x26;
    if (unaff_x22 == unaff_x27) {
LAB_00036ef0:
      do {
        while( true ) {
          pbVar1 = unaff_x26 + 1;
          if (pbVar1 == unaff_x20) {
            return;
          }
          pbVar7 = unaff_x26 + 2;
          if (*pbVar1 == 0x24 && pbVar7 != unaff_x20) break;
code_r0x00036ee0:
          pbVar7 = pbVar1;
code_r0x00036ee4:
          __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE9push_backEc();
          unaff_x26 = pbVar7;
        }
        bVar4 = *pbVar7;
        if ((char)bVar4 < '\'') {
          if (bVar4 == 0x24) goto code_r0x00036ee4;
          if (bVar4 == 0x26) {
            lVar3 = ((long *)*unaff_x28)[1];
            for (lVar6 = *(long *)*unaff_x28; unaff_x26 = pbVar7, lVar6 != lVar3; lVar6 = lVar6 + 1)
            {
              __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE9push_backEc();
            }
          }
          else {
code_r0x00036fb0:
            if (9 < bVar4 - 0x30) goto code_r0x00036ee0;
            uVar5 = (ulong)bVar4 - 0x30;
            pbVar1 = unaff_x26 + 3;
            if (pbVar1 != unaff_x20) {
              if (*pbVar1 - 0x30 < 10) {
                uVar5 = ((ulong)*pbVar1 + (long)(int)uVar5 * (long)unaff_w25) - 0x30;
              }
              else {
                pbVar1 = unaff_x26 + 2;
              }
              pbVar7 = pbVar1;
            }
            plVar2 = (long *)(*unaff_x28 + (long)(int)uVar5 * (long)unaff_w24);
            if ((ulong)((unaff_x28[1] - *unaff_x28 >> 3) * unaff_x23) <= uVar5) {
              plVar2 = unaff_x21;
            }
            lVar3 = plVar2[1];
            for (lVar6 = *plVar2; unaff_x26 = pbVar7, lVar6 != lVar3; lVar6 = lVar6 + 1) {
              __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE9push_backEc();
            }
          }
          goto LAB_00036ef0;
        }
        if (bVar4 == 0x27) {
          lVar3 = unaff_x28[10];
          for (lVar6 = unaff_x28[9]; unaff_x26 = pbVar7, lVar6 != lVar3; lVar6 = lVar6 + 1) {
            __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE9push_backEc();
          }
          goto LAB_00036ef0;
        }
        if (bVar4 != 0x60) goto code_r0x00036fb0;
        unaff_x22 = unaff_x28[6];
        unaff_x27 = unaff_x28[7];
        unaff_x26 = pbVar7;
      } while (unaff_x22 == unaff_x27);
    }
    unaff_x22 = unaff_x22 + 1;
    __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE9push_backEc();
    unaff_x26 = pbVar7;
  } while( true );
}

