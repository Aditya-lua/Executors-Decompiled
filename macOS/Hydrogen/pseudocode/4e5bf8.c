
void FUN_004e5bf8(void)

{
  code *pcVar1;
  long lVar2;
  uint in_w8;
  uint *puVar3;
  undefined8 *puVar4;
  uint in_w9;
  long *unaff_x19;
  uint *unaff_x20;
  long unaff_x21;
  long unaff_x22;
  undefined8 uVar5;
  uint *unaff_x25;
  long unaff_x27;
  long in_stack_00000000;
  long in_stack_00000008;
  undefined1 uStack000000000000001c;
  
  do {
    _uStack000000000000001c =
         CONCAT13((char)in_w8,
                  CONCAT12((char)(in_w8 >> 6),CONCAT11((char)(in_w8 >> 0xc),(char)in_w9))) &
         0x3f3f3fff | 0x80808000;
    uVar5 = 4;
    while( true ) {
      while( true ) {
        while( true ) {
          lVar2 = func_0x00187bd0(uVar5,1);
          if (lVar2 == 0) {
            func_0x007a1f00(1,uVar5,&UNK_009e7fe0);
                    /* WARNING: Does not return */
            pcVar1 = (code *)SoftwareBreakpoint(1,0x4e5cf4);
            (*pcVar1)();
          }
          _memcpy(lVar2,&uStack000000000000001c,uVar5);
          if (unaff_x21 == in_stack_00000000) {
            func_0x007a5594();
            unaff_x22 = in_stack_00000008;
          }
          puVar4 = (undefined8 *)(unaff_x22 + unaff_x21 * unaff_x27);
          *puVar4 = uVar5;
          puVar4[1] = lVar2;
          puVar4[2] = uVar5;
          unaff_x21 = unaff_x21 + 1;
          do {
            puVar3 = unaff_x25;
            if (puVar3 == unaff_x20) {
              unaff_x19[1] = in_stack_00000008;
              *unaff_x19 = in_stack_00000000;
              unaff_x19[2] = unaff_x21;
              return;
            }
            unaff_x25 = puVar3 + 2;
          } while ((char)puVar3[1] != '\x01');
          in_w8 = *puVar3;
          if (0x7f < in_w8) break;
          _uStack000000000000001c = in_w8 & 0xff;
          uVar5 = 1;
        }
        if (0x7ff < in_w8) break;
        _uStack000000000000001c = (uint)(CONCAT11((char)in_w8,(char)(in_w8 >> 6)) & 0x3fff | 0x80c0)
        ;
        uVar5 = 2;
      }
      if (0xffff < in_w8) break;
      _uStack000000000000001c =
           (uint)(CONCAT12((char)in_w8,CONCAT11((char)(in_w8 >> 6),(char)(in_w8 >> 0xc))) & 0x3f3fff
                 | 0x8080e0);
      uVar5 = 3;
    }
    in_w9 = in_w8 >> 0x12 | 0xf0;
  } while( true );
}

