; FUN_00bcaab4 @ 00bcaab4
00bcaab4	paciasp
00bcaab8	sub sp,sp,#0x40
00bcaabc	stp x29,x30,[sp, #0x20]
00bcaac0	str x19,[sp, #0x30]
00bcaac4	add x29,sp,#0x20
00bcaac8	adrp x1,0x2ac000
00bcaacc	add x1,x1,#0xd16
00bcaad0	add x8,sp,#0x8
00bcaad4	add x19,sp,#0x8
00bcaad8	bl 0x00bcab58
00bcaadc	ldrb w8,[sp, #0x8]
00bcaae0	ldr x9,[sp, #0x18]
00bcaae4	tst w8,#0x1
00bcaae8	csinc x0,x9,x19,ne
00bcaaec	bl 0x00bcab04
00bcaaf0	mov x19,x0
00bcaaf4	add x0,sp,#0x8
00bcaaf8	bl 0x00c43db0
00bcaafc	mov x0,x19
00bcab00	bl 0x00c2c090
