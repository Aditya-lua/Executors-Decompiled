; OSSL_ENCODER_do_all_provided @ 00a60f54
00a60f54	sub sp,sp,#0x70
00a60f58	str x21,[sp, #0x40]
00a60f5c	stp x20,x19,[sp, #0x50]
00a60f60	mov x20,x2
00a60f64	mov x21,x1
00a60f68	mov x19,x0
00a60f6c	str x0,[sp, #0x10]
00a60f70	add x0,sp,#0x10
00a60f74	mov w1,wzr
00a60f78	mov x2,xzr
00a60f7c	mov x3,xzr
00a60f80	stp x29,x30,[sp, #0x60]
00a60f84	add x29,sp,#0x60
00a60f88	str xzr,[sp, #0x30]
00a60f8c	bl 0x00a60a68
00a60f90	ldr x0,[sp, #0x30]
00a60f94	stp x21,x20,[sp]
00a60f98	cbz x0,0x00a60fac
00a60f9c	adrp x1,0xa60000
00a60fa0	add x1,x1,#0xff0
00a60fa4	mov x2,sp
00a60fa8	bl 0x00c3b5a0
00a60fac	adrp x2,0xc5d000
00a60fb0	add x2,x2,#0x818
00a60fb4	mov w1,#0xa
00a60fb8	mov x0,x19
00a60fbc	bl 0x00c3b520
00a60fc0	adrp x1,0xa60000
00a60fc4	add x1,x1,#0xff0
00a60fc8	mov x2,sp
00a60fcc	bl 0x00c3b5a0
00a60fd0	ldr x0,[sp, #0x30]
00a60fd4	cbz x0,0x00a60fdc
00a60fd8	bl 0x00c3b5c0
00a60fdc	ldp x29,x30,[sp, #0x60]
00a60fe0	ldp x20,x19,[sp, #0x50]
00a60fe4	ldr x21,[sp, #0x40]
00a60fe8	add sp,sp,#0x70
00a60fec	ret
