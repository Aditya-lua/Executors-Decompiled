; OPENSSL_LH_flush @ 00a7fe50
00a7fe50	cbz x0,0x00a7fed0
00a7fe54	stp x22,x21,[sp, #-0x30]!
00a7fe58	stp x20,x19,[sp, #0x10]
00a7fe5c	stp x29,x30,[sp, #0x20]
00a7fe60	ldr w8,[x0, #0x18]
00a7fe64	mov x19,x0
00a7fe68	add x29,sp,#0x20
00a7fe6c	cbz w8,0x00a7fec0
00a7fe70	adrp x20,0x2b0000
00a7fe74	mov x21,xzr
00a7fe78	add x20,x20,#0xdf
00a7fe7c	ldr x9,[x19]
00a7fe80	add x9,x9,x21, LSL #0x3
00a7fe84	ldr x0,[x9]
00a7fe88	cbz x0,0x00a7feb0
00a7fe8c	ldr x22,[x0, #0x8]
00a7fe90	mov w2,#0x62
00a7fe94	mov x1,x20
00a7fe98	bl 0x00c32310
00a7fe9c	mov x0,x22
00a7fea0	cbnz x22,0x00a7fe8c
00a7fea4	ldr x9,[x19]
00a7fea8	ldr w8,[x19, #0x18]
00a7feac	add x9,x9,x21, LSL #0x3
00a7feb0	add x21,x21,#0x1
00a7feb4	cmp x21,w8, UXTW 
00a7feb8	str xzr,[x9]
00a7febc	b.cc 0x00a7fe7c
00a7fec0	str xzr,[x19, #0x38]
00a7fec4	ldp x29,x30,[sp, #0x20]
00a7fec8	ldp x20,x19,[sp, #0x10]
00a7fecc	ldp x22,x21,[sp], #0x30
00a7fed0	ret
