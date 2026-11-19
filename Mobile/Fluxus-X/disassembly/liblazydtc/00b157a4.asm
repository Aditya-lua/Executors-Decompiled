; X509_sign @ 00b157a4
00b157a4	sub sp,sp,#0x40
00b157a8	str x21,[sp, #0x10]
00b157ac	stp x20,x19,[sp, #0x20]
00b157b0	stp x29,x30,[sp, #0x30]
00b157b4	add x29,sp,#0x30
00b157b8	cbz x0,0x00b15800
00b157bc	mov w8,#0x1
00b157c0	mov x19,x2
00b157c4	mov x20,x1
00b157c8	mov x21,x0
00b157cc	str w8,[x0, #0x80]
00b157d0	bl 0x00c40ec0
00b157d4	ldp x8,x9,[x21, #0x170]
00b157d8	add x1,x21,#0x20
00b157dc	add x2,x21,#0x88
00b157e0	add x3,x21,#0x98
00b157e4	mov x4,x21
00b157e8	mov x5,xzr
00b157ec	mov x6,x20
00b157f0	mov x7,x19
00b157f4	stp x8,x9,[sp]
00b157f8	bl 0x00c377e0
00b157fc	b 0x00b15834
00b15800	bl 0x00c342a0
00b15804	adrp x0,0x2c4000
00b15808	adrp x2,0x2b2000
00b1580c	add x0,x0,#0x3b5
00b15810	add x2,x2,#0xe0b
00b15814	orr w1,wzr,#0x3f
00b15818	bl 0x00c342b0
00b1581c	mov w1,#0x102
00b15820	mov w0,#0xb
00b15824	movk w1,#0xc, LSL #16
00b15828	mov x2,xzr
00b1582c	bl 0x00c342c0
00b15830	mov w0,wzr
00b15834	ldp x29,x30,[sp, #0x30]
00b15838	ldp x20,x19,[sp, #0x20]
00b1583c	ldr x21,[sp, #0x10]
00b15840	add sp,sp,#0x40
00b15844	ret
