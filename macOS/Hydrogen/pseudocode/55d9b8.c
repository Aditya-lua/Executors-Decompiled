
/* WARNING: Possible PIC construction at 0x0055d9c8: Changing call to branch */
/* WARNING: Possible PIC construction at 0x0055d978: Changing call to branch */
/* WARNING: Possible PIC construction at 0x0055d9ac: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x0055d97c) */
/* WARNING: Removing unreachable block (ram,0x0055d9cc) */
/* WARNING: Removing unreachable block (ram,0x0055dbc4) */
/* WARNING: Removing unreachable block (ram,0x0055d9e0) */
/* WARNING: Removing unreachable block (ram,0x0055dbfc) */
/* WARNING: Removing unreachable block (ram,0x0055dc08) */
/* WARNING: Removing unreachable block (ram,0x0055dc28) */
/* WARNING: Removing unreachable block (ram,0x0055dc58) */
/* WARNING: Removing unreachable block (ram,0x0055d9b0) */
/* WARNING: Removing unreachable block (ram,0x0055da68) */
/* WARNING: Removing unreachable block (ram,0x0055da6c) */
/* WARNING: Removing unreachable block (ram,0x0055daf4) */
/* WARNING: Removing unreachable block (ram,0x0055da90) */
/* WARNING: Removing unreachable block (ram,0x0055db18) */
/* WARNING: Removing unreachable block (ram,0x0055db3c) */
/* WARNING: Removing unreachable block (ram,0x0055db44) */
/* WARNING: Removing unreachable block (ram,0x0055db64) */
/* WARNING: Removing unreachable block (ram,0x0055db98) */
/* WARNING: Removing unreachable block (ram,0x0055d934) */
/* WARNING: Removing unreachable block (ram,0x0055de2c) */
/* WARNING: Removing unreachable block (ram,0x0055d93c) */
/* WARNING: Removing unreachable block (ram,0x0055dcec) */
/* WARNING: Removing unreachable block (ram,0x0055dd90) */
/* WARNING: Removing unreachable block (ram,0x0055dd08) */
/* WARNING: Removing unreachable block (ram,0x0055ddb8) */
/* WARNING: Removing unreachable block (ram,0x0055ddd0) */
/* WARNING: Removing unreachable block (ram,0x0055ddd8) */
/* WARNING: Removing unreachable block (ram,0x0055ddf8) */
/* WARNING: Removing unreachable block (ram,0x0055d94c) */
/* WARNING: Removing unreachable block (ram,0x0055d984) */
/* WARNING: Removing unreachable block (ram,0x0055d988) */
/* WARNING: Removing unreachable block (ram,0x0055da50) */
/* WARNING: Removing unreachable block (ram,0x0055d99c) */
/* WARNING: Removing unreachable block (ram,0x0055d95c) */
/* WARNING: Removing unreachable block (ram,0x0055dbc0) */
/* WARNING: Removing unreachable block (ram,0x0055dc5c) */
/* WARNING: Removing unreachable block (ram,0x0055de44) */
/* WARNING: Removing unreachable block (ram,0x0055dc6c) */
/* WARNING: Removing unreachable block (ram,0x0055de50) */
/* WARNING: Removing unreachable block (ram,0x0055dc8c) */
/* WARNING: Removing unreachable block (ram,0x0055de60) */
/* WARNING: Removing unreachable block (ram,0x0055dcb0) */
/* WARNING: Removing unreachable block (ram,0x0055ddfc) */

void FUN_0055d9b8(void)

{
  ushort uVar1;
  ushort uVar2;
  code *pcVar3;
  long lVar4;
  ulong uVar5;
  long lVar6;
  ulong unaff_x22;
  ulong uVar7;
  long in_stack_00000088;
  ulong uStack0000000000000098;
  
  uStack0000000000000098 = 5;
  uVar1 = *(ushort *)(in_stack_00000088 + 0x1c2);
  lVar4 = func_0x00187bd0(0x228,8);
  uVar5 = uStack0000000000000098;
  if (lVar4 == 0) {
    func_0x007a1f18(8,0x228);
  }
  else {
    *(undefined8 *)(lVar4 + 0xb0) = 0;
    uVar2 = *(ushort *)(in_stack_00000088 + 0x1c2);
    unaff_x22 = (ulong)uVar2 + ~uStack0000000000000098;
    *(short *)(lVar4 + 0x1c2) = (short)unaff_x22;
    if (unaff_x22 < 0xc) {
      lVar6 = uStack0000000000000098 + 1;
      if ((ulong)uVar2 - lVar6 == unaff_x22) {
        _memcpy(lVar4 + 0xb8,in_stack_00000088 + 0xb8 + lVar6 * 0x18,unaff_x22 * 0x18);
        _memcpy(lVar4,in_stack_00000088 + lVar6 * 0x10,unaff_x22 * 0x10);
        *(short *)(in_stack_00000088 + 0x1c2) = (short)uVar5;
        uVar7 = (ulong)*(ushort *)(lVar4 + 0x1c2);
        lVar6 = uVar7 + 1;
        if (uVar7 < 0xc) {
          if (uVar1 - uVar5 == lVar6) {
            _memcpy(lVar4 + 0x1c8,in_stack_00000088 + uVar5 * 8 + 0x1d0,lVar6 * 8);
            uVar5 = 0;
            do {
              lVar6 = *(long *)(lVar4 + 0x1c8 + uVar5 * 8);
              *(long *)(lVar6 + 0xb0) = lVar4;
              *(short *)(lVar6 + 0x1c0) = (short)uVar5;
              if (uVar7 <= uVar5) {
                return;
              }
              uVar5 = uVar5 + 1;
            } while (uVar5 <= uVar7);
            return;
          }
          func_0x007a247c(&UNK_008ab922,0x28,&UNK_009ee0c0);
        }
        else {
          func_0x007a28b0(lVar6,0xc,&UNK_009ee0f0);
        }
      }
      else {
        func_0x007a247c(&UNK_008ab922,0x28,&UNK_009ee0c0);
      }
      goto code_r0x0055e080;
    }
  }
  func_0x007a28b0(unaff_x22,0xb,&UNK_009ee0d8);
code_r0x0055e080:
                    /* WARNING: Does not return */
  pcVar3 = (code *)SoftwareBreakpoint(1,0x55e084);
  (*pcVar3)();
}

