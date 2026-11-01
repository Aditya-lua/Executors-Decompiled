
void FUN_004e5af4(void)

{
  uint uVar1;
  undefined1 uVar2;
  code *pcVar3;
  long lVar4;
  undefined8 *puVar5;
  long lVar6;
  uint *puVar7;
  undefined8 *puVar8;
  undefined8 *unaff_x19;
  uint *unaff_x20;
  undefined8 uVar9;
  uint *unaff_x25;
  undefined8 uStack0000000000000018;
  
  lVar4 = func_0x00187bd0(4,1);
  if (lVar4 == 0) {
    func_0x007a1f00(1,4,&UNK_009e7fe0);
  }
  else {
    _memcpy();
    puVar5 = (undefined8 *)func_0x00187bd0(0x60,8);
    if (puVar5 != (undefined8 *)0x0) {
      *puVar5 = 4;
      puVar5[1] = lVar4;
      puVar5[2] = 4;
      lVar4 = 1;
      while( true ) {
        do {
          puVar7 = unaff_x25;
          if (puVar7 == unaff_x20) {
            unaff_x19[1] = puVar5;
            *unaff_x19 = 4;
            unaff_x19[2] = lVar4;
            return;
          }
          unaff_x25 = puVar7 + 2;
        } while ((char)puVar7[1] != '\x01');
        uVar1 = *puVar7;
        uVar2 = (undefined1)uVar1;
        if (uVar1 < 0x80) {
          uStack0000000000000018._4_4_ = uVar1 & 0xff;
          uVar9 = 1;
        }
        else if (uVar1 < 0x800) {
          uStack0000000000000018._4_4_ =
               (uint)(CONCAT11(uVar2,(char)(uVar1 >> 6)) & 0x3fff | 0x80c0);
          uVar9 = 2;
        }
        else if (uVar1 < 0x10000) {
          uStack0000000000000018._4_4_ =
               (uint)(CONCAT12(uVar2,CONCAT11((char)(uVar1 >> 6),(char)(uVar1 >> 0xc))) & 0x3f3fff |
                     0x8080e0);
          uVar9 = 3;
        }
        else {
          uStack0000000000000018._4_4_ =
               CONCAT13(uVar2,CONCAT12((char)(uVar1 >> 6),
                                       CONCAT11((char)(uVar1 >> 0xc),(char)(uVar1 >> 0x12)))) &
               0x3f3f3fff | 0x808080f0;
          uVar9 = 4;
        }
        lVar6 = func_0x00187bd0(uVar9,1);
        if (lVar6 == 0) break;
        _memcpy(lVar6,(long)&uStack0000000000000018 + 4,uVar9);
        if (lVar4 == 4) {
          func_0x007a5594();
        }
        puVar8 = puVar5 + lVar4 * 3;
        *puVar8 = uVar9;
        puVar8[1] = lVar6;
        puVar8[2] = uVar9;
        lVar4 = lVar4 + 1;
      }
      func_0x007a1f00(1,uVar9,&UNK_009e7fe0);
      goto FUN_004e5cf0;
    }
  }
  func_0x007a1f00(8,0x60);
FUN_004e5cf0:
                    /* WARNING: Does not return */
  pcVar3 = (code *)SoftwareBreakpoint(1,0x4e5cf4);
  (*pcVar3)();
}

