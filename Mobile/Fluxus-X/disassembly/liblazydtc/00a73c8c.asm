; ossl_dh_gen_type_name2id @ 00a73c8c
00a73c8c	stp x20,x19,[sp, #-0x20]!
00a73c90	mov x19,x0
00a73c94	adrp x0,0x2a2000
00a73c98	mov w20,w1
00a73c9c	add x0,x0,#0x238
00a73ca0	mov x1,x19
00a73ca4	stp x29,x30,[sp, #0x10]
00a73ca8	add x29,sp,#0x10
00a73cac	bl 0x00c301f0
00a73cb0	cbz w0,0x00a73cdc
00a73cb4	cmp w20,#0x1, LSL #12
00a73cb8	b.eq 0x00a73cf4
00a73cbc	cbnz w20,0x00a73d1c
00a73cc0	adrp x0,0x2c5000
00a73cc4	add x0,x0,#0x89e
00a73cc8	mov x1,x19
00a73ccc	bl 0x00c301f0
00a73cd0	cbnz w0,0x00a73d1c
00a73cd4	mov w8,#0x1
00a73cd8	b 0x00a73ce0
00a73cdc	mov x8,xzr
00a73ce0	adrp x9,0xc60000
00a73ce4	add x9,x9,#0xcc8
00a73ce8	add x8,x9,x8, LSL #0x4
00a73cec	ldr w0,[x8, #0x8]
00a73cf0	b 0x00a73d20
00a73cf4	adrp x0,0x2c9000
00a73cf8	add x0,x0,#0xa44
00a73cfc	mov x1,x19
00a73d00	bl 0x00c301f0
00a73d04	cbz w0,0x00a73d2c
00a73d08	adrp x0,0x2a6000
00a73d0c	add x0,x0,#0x2d
00a73d10	mov x1,x19
00a73d14	bl 0x00c301f0
00a73d18	cbz w0,0x00a73d34
00a73d1c	mov w0,#0xffffffff
00a73d20	ldp x29,x30,[sp, #0x10]
00a73d24	ldp x20,x19,[sp], #0x20
00a73d28	ret
00a73d2c	mov w8,#0x2
00a73d30	b 0x00a73ce0
00a73d34	orr w8,wzr,#0x3
00a73d38	b 0x00a73ce0
