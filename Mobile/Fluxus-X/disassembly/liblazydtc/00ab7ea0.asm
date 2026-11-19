; PEM_ASN1_read_bio @ 00ab7ea0
00ab7ea0	sub sp,sp,#0x40
00ab7ea4	stp x20,x19,[sp, #0x20]
00ab7ea8	mov x6,x5
00ab7eac	mov x5,x4
00ab7eb0	mov x19,x3
00ab7eb4	mov x4,x2
00ab7eb8	mov x3,x1
00ab7ebc	mov x20,x0
00ab7ec0	add x0,sp,#0x10
00ab7ec4	add x1,sp,#0x8
00ab7ec8	mov x2,xzr
00ab7ecc	stp x29,x30,[sp, #0x30]
00ab7ed0	add x29,sp,#0x30
00ab7ed4	stp xzr,xzr,[sp, #0x10]
00ab7ed8	bl 0x00c3f200
00ab7edc	cbz w0,0x00ab7f44
00ab7ee0	ldp x2,x8,[sp, #0x8]
00ab7ee4	add x1,sp,#0x18
00ab7ee8	mov x0,x19
00ab7eec	str x8,[sp, #0x18]
00ab7ef0	blr x20
00ab7ef4	mov x19,x0
00ab7ef8	cbnz x0,0x00ab7f2c
00ab7efc	bl 0x00c342a0
00ab7f00	adrp x0,0x2c0000
00ab7f04	adrp x2,0x2c2000
00ab7f08	add x0,x0,#0x412
00ab7f0c	add x2,x2,#0x292
00ab7f10	mov w1,#0x21
00ab7f14	bl 0x00c342b0
00ab7f18	mov w1,#0xd
00ab7f1c	mov w0,#0x9
00ab7f20	movk w1,#0x8, LSL #16
00ab7f24	mov x2,xzr
00ab7f28	bl 0x00c342c0
00ab7f2c	ldr x0,[sp, #0x10]
00ab7f30	adrp x1,0x2c0000
00ab7f34	add x1,x1,#0x412
00ab7f38	mov w2,#0x22
00ab7f3c	bl 0x00c32310
00ab7f40	b 0x00ab7f48
00ab7f44	mov x19,xzr
00ab7f48	mov x0,x19
00ab7f4c	ldp x29,x30,[sp, #0x30]
00ab7f50	ldp x20,x19,[sp, #0x20]
00ab7f54	add sp,sp,#0x40
00ab7f58	ret
