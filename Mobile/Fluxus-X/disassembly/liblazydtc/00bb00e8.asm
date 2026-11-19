; ZSTD_getFrameContentSize @ 00bb00e8
00bb00e8	sub sp,sp,#0x60
00bb00ec	stp x29,x30,[sp, #0x40]
00bb00f0	str x19,[sp, #0x50]
00bb00f4	add x29,sp,#0x40
00bb00f8	mrs x19,tpidr_el0
00bb00fc	mov x2,x1
00bb0100	mov x1,x0
00bb0104	ldr x8,[x19, #0x28]
00bb0108	add x0,sp,#0x8
00bb010c	mov w3,wzr
00bb0110	stur x8,[x29, #-0x8]
00bb0114	bl 0x00c435f0
00bb0118	ldr w8,[sp, #0x1c]
00bb011c	ldr x9,[sp, #0x8]
00bb0120	mov x11,#-0x2
00bb0124	cmp w8,#0x1
00bb0128	ldr x8,[x19, #0x28]
00bb012c	ldur x10,[x29, #-0x8]
00bb0130	csel x9,xzr,x9,eq
00bb0134	cmp x0,#0x0
00bb0138	csel x0,x9,x11,eq
00bb013c	cmp x8,x10
00bb0140	b.ne 0x00bb0154
00bb0144	ldp x29,x30,[sp, #0x40]
00bb0148	ldr x19,[sp, #0x50]
00bb014c	add sp,sp,#0x60
00bb0150	ret
00bb0154	bl 0x00c2fec0
