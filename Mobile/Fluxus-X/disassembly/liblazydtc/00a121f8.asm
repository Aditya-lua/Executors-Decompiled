; CTLOG_STORE_load_default_file @ 00a121f8
00a121f8	str x19,[sp, #-0x20]!
00a121fc	mov x19,x0
00a12200	adrp x0,0x2a2000
00a12204	add x0,x0,#0x1f1
00a12208	stp x29,x30,[sp, #0x10]
00a1220c	add x29,sp,#0x10
00a12210	bl 0x00c395b0
00a12214	ldp x29,x30,[sp, #0x10]
00a12218	adrp x8,0x2a7000
00a1221c	add x8,x8,#0xd86
00a12220	cmp x0,#0x0
00a12224	csel x1,x8,x0,eq
00a12228	mov x0,x19
00a1222c	ldr x19,[sp], #0x20
00a12230	b 0x00a12234
