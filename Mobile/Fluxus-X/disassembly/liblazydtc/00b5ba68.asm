; ossl_rand_pool_cleanup @ 00b5ba68
00b5ba68	sub sp,sp,#0xb0
00b5ba6c	stp x20,x19,[sp, #0x90]
00b5ba70	adrp x20,0xd23000
00b5ba74	str x21,[sp, #0x80]
00b5ba78	mov x19,xzr
00b5ba7c	add x20,x20,#0x828
00b5ba80	mov w21,#0xffffffff
00b5ba84	stp x29,x30,[sp, #0xa0]
00b5ba88	add x29,sp,#0xa0
00b5ba8c	ldr w0,[x20, x19#0x0]
00b5ba90	cmn w0,#0x1
00b5ba94	b.eq 0x00b5bafc
00b5ba98	mov x1,sp
00b5ba9c	bl 0x00c31d70
00b5baa0	cmn w0,#0x1
00b5baa4	b.eq 0x00b5bafc
00b5baa8	add x8,x20,x19
00b5baac	ldr x9,[x8, #0x8]
00b5bab0	ldr x10,[sp]
00b5bab4	cmp x9,x10
00b5bab8	b.ne 0x00b5bafc
00b5babc	ldr x8,[x8, #0x10]
00b5bac0	ldr x9,[sp, #0x8]
00b5bac4	cmp x8,x9
00b5bac8	b.ne 0x00b5bafc
00b5bacc	add x8,x20,x19
00b5bad0	ldr w9,[x8, #0x18]
00b5bad4	ldr w10,[sp, #0x10]
00b5bad8	eor w9,w10,w9
00b5badc	cmp w9,#0x200
00b5bae0	b.cs 0x00b5bafc
00b5bae4	ldr x8,[x8, #0x20]
00b5bae8	ldr x9,[sp, #0x20]
00b5baec	cmp x8,x9
00b5baf0	b.ne 0x00b5bafc
00b5baf4	ldr w0,[x20, x19#0x0]
00b5baf8	bl 0x00c31bf0
00b5bafc	str w21,[x20, x19#0x0]
00b5bb00	add x19,x19,#0x28
00b5bb04	cmp x19,#0xa0
00b5bb08	b.ne 0x00b5ba8c
00b5bb0c	ldp x29,x30,[sp, #0xa0]
00b5bb10	ldp x20,x19,[sp, #0x90]
00b5bb14	ldr x21,[sp, #0x80]
00b5bb18	add sp,sp,#0xb0
00b5bb1c	ret
