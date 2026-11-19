; ASN1_item_d2i_bio @ 00abdc8c
00abdc8c	sub sp,sp,#0x40
00abdc90	stp x21,xzr,[sp, #0x10]
00abdc94	stp x20,x19,[sp, #0x20]
00abdc98	stp x29,x30,[sp, #0x30]
00abdc9c	add x29,sp,#0x30
00abdca0	cbz x1,0x00abdcf0
00abdca4	mov x8,x1
00abdca8	mov x21,x0
00abdcac	add x1,sp,#0x18
00abdcb0	mov x0,x8
00abdcb4	mov x20,x2
00abdcb8	bl 0x00abd860
00abdcbc	ldr x19,[sp, #0x18]
00abdcc0	tbnz w0,#0x1f,0x00abdcf8
00abdcc4	ldr x8,[x19, #0x8]
00abdcc8	sxtw x2,w0
00abdccc	add x1,sp,#0x8
00abdcd0	mov x0,x20
00abdcd4	mov x3,x21
00abdcd8	mov x4,xzr
00abdcdc	mov x5,xzr
00abdce0	str x8,[sp, #0x8]
00abdce4	bl 0x00c37a00
00abdce8	mov x20,x0
00abdcec	b 0x00abdcfc
00abdcf0	mov x20,xzr
00abdcf4	b 0x00abdd04
00abdcf8	mov x20,xzr
00abdcfc	mov x0,x19
00abdd00	bl 0x00c35660
00abdd04	mov x0,x20
00abdd08	ldp x29,x30,[sp, #0x30]
00abdd0c	ldp x20,x19,[sp, #0x20]
00abdd10	ldr x21,[sp, #0x10]
00abdd14	add sp,sp,#0x40
00abdd18	ret
