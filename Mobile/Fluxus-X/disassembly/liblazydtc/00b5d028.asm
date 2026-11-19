; FUN_00b5d028 @ 00b5d028
00b5d028	stp x20,x19,[sp, #-0x20]!
00b5d02c	stp x29,x30,[sp, #0x10]
00b5d030	mov x19,x0
00b5d034	ldr x0,[x0, #0x8]
00b5d038	adrp x20,0x2aa000
00b5d03c	add x20,x20,#0xfdb
00b5d040	mov w2,#0x179
00b5d044	mov x1,x20
00b5d048	add x29,sp,#0x10
00b5d04c	bl 0x00c32310
00b5d050	ldr x0,[x19, #0x178]
00b5d054	bl 0x00c31f90
00b5d058	ldr x0,[x19, #0x170]
00b5d05c	bl 0x00c35800
00b5d060	ldr x0,[x19, #0x10]
00b5d064	str xzr,[x19, #0x8]
00b5d068	str xzr,[x19, #0x160]
00b5d06c	stp xzr,xzr,[x19, #0x170]
00b5d070	bl 0x00c3a7c0
00b5d074	ldr x0,[x19, #0x180]
00b5d078	bl 0x00c322e0
00b5d07c	ldr x0,[x19, #0x188]
00b5d080	bl 0x00c322e0
00b5d084	ldp x29,x30,[sp, #0x10]
00b5d088	mov w2,#0x183
00b5d08c	mov x0,x19
00b5d090	mov x1,x20
00b5d094	ldp x20,x19,[sp], #0x20
00b5d098	b 0x00c32310
