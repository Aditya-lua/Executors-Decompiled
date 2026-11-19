; X509v3_addr_add_range @ 00af633c
00af633c	sub sp,sp,#0x40
00af6340	stp x22,x21,[sp, #0x10]
00af6344	stp x20,x19,[sp, #0x20]
00af6348	stp x29,x30,[sp, #0x30]
00af634c	add x29,sp,#0x30
00af6350	mov x19,x4
00af6354	mov x21,x3
00af6358	mov w22,w1
00af635c	bl 0x00af615c
00af6360	cbz x0,0x00af63c4
00af6364	cmp w22,#0x2
00af6368	cset w8,eq
00af636c	cmp w22,#0x1
00af6370	lsl w8,w8,#0x4
00af6374	mov w9,#0x4
00af6378	mov x20,x0
00af637c	csel w3,w9,w8,eq
00af6380	add x0,sp,#0x8
00af6384	mov x1,x21
00af6388	mov x2,x19
00af638c	bl 0x00af63d8
00af6390	cbz w0,0x00af63c4
00af6394	ldr x19,[sp, #0x8]
00af6398	mov x0,x20
00af639c	mov x1,x19
00af63a0	bl 0x00c347a0
00af63a4	cbz w0,0x00af63b0
00af63a8	mov w0,#0x1
00af63ac	b 0x00af63c4
00af63b0	adrp x1,0xc7e000
00af63b4	add x1,x1,#0x788
00af63b8	mov x0,x19
00af63bc	bl 0x00c36160
00af63c0	mov w0,wzr
00af63c4	ldp x29,x30,[sp, #0x30]
00af63c8	ldp x20,x19,[sp, #0x20]
00af63cc	ldp x22,x21,[sp, #0x10]
00af63d0	add sp,sp,#0x40
00af63d4	ret
