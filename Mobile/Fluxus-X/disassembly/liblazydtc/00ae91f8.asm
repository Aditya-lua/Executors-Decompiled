; OPENSSL_sk_pop_free @ 00ae91f8
00ae91f8	cbz x0,0x00ae9278
00ae91fc	str x21,[sp, #-0x30]!
00ae9200	stp x20,x19,[sp, #0x10]
00ae9204	stp x29,x30,[sp, #0x20]
00ae9208	ldr w8,[x0]
00ae920c	mov x19,x0
00ae9210	add x29,sp,#0x20
00ae9214	cmp w8,#0x1
00ae9218	b.lt 0x00ae9244
00ae921c	mov x20,x1
00ae9220	mov x21,xzr
00ae9224	ldr x9,[x19, #0x8]
00ae9228	ldr x0,[x9, x21, LSL #0x3]
00ae922c	cbz x0,0x00ae9238
00ae9230	blr x20
00ae9234	ldr w8,[x19]
00ae9238	add x21,x21,#0x1
00ae923c	cmp x21,w8, SXTW 
00ae9240	b.lt 0x00ae9224
00ae9244	ldr x0,[x19, #0x8]
00ae9248	adrp x20,0x2c6000
00ae924c	add x20,x20,#0x275
00ae9250	mov w2,#0x1b2
00ae9254	mov x1,x20
00ae9258	bl 0x00c32310
00ae925c	mov x0,x19
00ae9260	mov x1,x20
00ae9264	ldp x29,x30,[sp, #0x20]
00ae9268	ldp x20,x19,[sp, #0x10]
00ae926c	mov w2,#0x1b3
00ae9270	ldr x21,[sp], #0x30
00ae9274	b 0x00c32310
00ae9278	ret
