; ASN1_item_d2i_ex @ 009f3ce4
009f3ce4	sub sp,sp,#0x60
009f3ce8	cmp x0,#0x0
009f3cec	add x8,sp,#0x18
009f3cf0	stp x20,x19,[sp, #0x40]
009f3cf4	csel x20,x8,x0,eq
009f3cf8	stp x29,x30,[sp, #0x50]
009f3cfc	add x29,sp,#0x50
009f3d00	str xzr,[sp, #0x18]
009f3d04	strb wzr,[sp, #0x20]
009f3d08	cbz x3,0x009f3d40
009f3d0c	stp x4,x5,[sp, #0x8]
009f3d10	mov w4,#0xffffffff
009f3d14	add x7,sp,#0x20
009f3d18	mov x0,x20
009f3d1c	mov w5,wzr
009f3d20	mov w6,wzr
009f3d24	mov x19,x3
009f3d28	str wzr,[sp]
009f3d2c	bl 0x009f3da0
009f3d30	cmp w0,#0x0
009f3d34	b.le 0x009f3d74
009f3d38	ldr x0,[x20]
009f3d3c	b 0x009f3d84
009f3d40	bl 0x00c342a0
009f3d44	adrp x0,0x2ad000
009f3d48	adrp x2,0x2c9000
009f3d4c	add x0,x0,#0x9c8
009f3d50	add x2,x2,#0x5c7
009f3d54	mov w1,#0x73
009f3d58	bl 0x00c342b0
009f3d5c	mov w1,#0x102
009f3d60	mov w0,#0xd
009f3d64	movk w1,#0xc, LSL #16
009f3d68	mov x2,xzr
009f3d6c	bl 0x00c342c0
009f3d70	b 0x009f3d80
009f3d74	mov x0,x20
009f3d78	mov x1,x19
009f3d7c	bl 0x00c37f90
009f3d80	mov x0,xzr
009f3d84	ldp x29,x30,[sp, #0x50]
009f3d88	ldp x20,x19,[sp, #0x40]
009f3d8c	add sp,sp,#0x60
009f3d90	ret
