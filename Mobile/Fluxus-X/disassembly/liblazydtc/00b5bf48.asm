; ossl_pool_add_nonce_data @ 00b5bf48
00b5bf48	sub sp,sp,#0x50
00b5bf4c	str x19,[sp, #0x30]
00b5bf50	stp x29,x30,[sp, #0x40]
00b5bf54	add x29,sp,#0x40
00b5bf58	mov x19,x0
00b5bf5c	stp xzr,xzr,[sp, #0x8]
00b5bf60	str xzr,[sp, #0x18]
00b5bf64	bl 0x00c32070
00b5bf68	str w0,[sp, #0x8]
00b5bf6c	bl 0x00c3ecb0
00b5bf70	str x0,[sp, #0x10]
00b5bf74	add x1,sp,#0x20
00b5bf78	mov w0,wzr
00b5bf7c	bl 0x00c308e0
00b5bf80	cbz w0,0x00b5bfa0
00b5bf84	add x0,sp,#0x20
00b5bf88	mov x1,xzr
00b5bf8c	bl 0x00c31ff0
00b5bf90	cbz w0,0x00b5bfa0
00b5bf94	mov x0,xzr
00b5bf98	bl 0x00c30970
00b5bf9c	b 0x00b5bfa8
00b5bfa0	ldp x8,x9,[sp, #0x20]
00b5bfa4	add x0,x9,x8, LSL #0x20
00b5bfa8	str x0,[sp, #0x18]
00b5bfac	add x1,sp,#0x8
00b5bfb0	orr w2,wzr,#0x18
00b5bfb4	mov x0,x19
00b5bfb8	mov x3,xzr
00b5bfbc	bl 0x00c3f8d0
00b5bfc0	ldp x29,x30,[sp, #0x40]
00b5bfc4	ldr x19,[sp, #0x30]
00b5bfc8	add sp,sp,#0x50
00b5bfcc	ret
