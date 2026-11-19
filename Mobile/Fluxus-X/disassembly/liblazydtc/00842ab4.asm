; FUN_00842ab4 @ 00842ab4
00842ab4	stp x29,x30,[sp, #-0x20]!
00842ab8	stp x20,x19,[sp, #0x10]
00842abc	mov x29,sp
00842ac0	mov w0,#0x18
00842ac4	bl 0x00c30000
00842ac8	mov x19,x0
00842acc	mov w1,#0xe
00842ad0	bl 0x00c30640
00842ad4	adrp x1,0xcb4000
00842ad8	adrp x2,0xcb4000
00842adc	mov x0,x19
00842ae0	ldr x1,[x1, #0xa78]
00842ae4	ldr x2,[x2, #0xa80]
00842ae8	bl 0x00c30020
