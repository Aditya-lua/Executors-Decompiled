; OPENSSL_LH_free @ 00a7fda4
00a7fda4	cbz x0,0x00a7fe4c
00a7fda8	stp x22,x21,[sp, #-0x30]!
00a7fdac	stp x20,x19,[sp, #0x10]
00a7fdb0	stp x29,x30,[sp, #0x20]
00a7fdb4	ldr w8,[x0, #0x18]
00a7fdb8	mov x19,x0
00a7fdbc	add x29,sp,#0x20
00a7fdc0	cbz w8,0x00a7fe14
00a7fdc4	adrp x20,0x2b0000
00a7fdc8	mov x21,xzr
00a7fdcc	add x20,x20,#0xdf
00a7fdd0	ldr x9,[x19]
00a7fdd4	add x9,x9,x21, LSL #0x3
00a7fdd8	ldr x0,[x9]
00a7fddc	cbz x0,0x00a7fe04
00a7fde0	ldr x22,[x0, #0x8]
00a7fde4	mov w2,#0x62
00a7fde8	mov x1,x20
00a7fdec	bl 0x00c32310
00a7fdf0	mov x0,x22
00a7fdf4	cbnz x22,0x00a7fde0
00a7fdf8	ldr x9,[x19]
00a7fdfc	ldr w8,[x19, #0x18]
00a7fe00	add x9,x9,x21, LSL #0x3
00a7fe04	add x21,x21,#0x1
00a7fe08	cmp x21,w8, UXTW 
00a7fe0c	str xzr,[x9]
00a7fe10	b.cc 0x00a7fdd0
00a7fe14	ldr x0,[x19]
00a7fe18	adrp x20,0x2b0000
00a7fe1c	add x20,x20,#0xdf
00a7fe20	mov w2,#0x52
00a7fe24	mov x1,x20
00a7fe28	str xzr,[x19, #0x38]
00a7fe2c	bl 0x00c32310
00a7fe30	mov x0,x19
00a7fe34	mov x1,x20
00a7fe38	ldp x29,x30,[sp, #0x20]
00a7fe3c	ldp x20,x19,[sp, #0x10]
00a7fe40	mov w2,#0x53
00a7fe44	ldp x22,x21,[sp], #0x30
00a7fe48	b 0x00c32310
00a7fe4c	ret
