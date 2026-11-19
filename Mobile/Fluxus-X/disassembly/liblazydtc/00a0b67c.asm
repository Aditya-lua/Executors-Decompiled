; BN_add_word @ 00a0b67c
00a0b67c	str x21,[sp, #-0x30]!
00a0b680	stp x20,x19,[sp, #0x10]
00a0b684	stp x29,x30,[sp, #0x20]
00a0b688	add x29,sp,#0x20
00a0b68c	cbz x1,0x00a0b758
00a0b690	mov x19,x1
00a0b694	mov x20,x0
00a0b698	bl 0x00c369b0
00a0b69c	cbz w0,0x00a0b6b8
00a0b6a0	mov x0,x20
00a0b6a4	mov x1,x19
00a0b6a8	ldp x29,x30,[sp, #0x20]
00a0b6ac	ldp x20,x19,[sp, #0x10]
00a0b6b0	ldr x21,[sp], #0x30
00a0b6b4	b 0x00c37720
00a0b6b8	ldr w8,[x20, #0x10]
00a0b6bc	cbz w8,0x00a0b6f4
00a0b6c0	mov x0,x20
00a0b6c4	mov x1,x19
00a0b6c8	str wzr,[x20, #0x10]
00a0b6cc	bl 0x00a0b778
00a0b6d0	mov w19,w0
00a0b6d4	mov x0,x20
00a0b6d8	bl 0x00c369b0
00a0b6dc	cbnz w0,0x00a0b75c
00a0b6e0	ldr w8,[x20, #0x10]
00a0b6e4	cmp w8,#0x0
00a0b6e8	cset w8,eq
00a0b6ec	str w8,[x20, #0x10]
00a0b6f0	b 0x00a0b75c
00a0b6f4	ldrsw x9,[x20, #0x8]
00a0b6f8	mov x8,xzr
00a0b6fc	and x21,x9,#0xffffffff
00a0b700	cmp x8,x9
00a0b704	b.ge 0x00a0b72c
00a0b708	ldr x10,[x20]
00a0b70c	lsl x11,x8,#0x3
00a0b710	add x8,x8,#0x1
00a0b714	ldr x12,[x10, x11#0x0]
00a0b718	adds x12,x12,x19
00a0b71c	mov w19,#0x1
00a0b720	str x12,[x10, x11#0x0]
00a0b724	b.cs 0x00a0b700
00a0b728	b 0x00a0b75c
00a0b72c	cmp w9,w8
00a0b730	b.ne 0x00a0b758
00a0b734	add w1,w21,#0x1
00a0b738	mov x0,x20
00a0b73c	bl 0x00c38e80
00a0b740	cbz x0,0x00a0b770
00a0b744	ldr w8,[x20, #0x8]
00a0b748	ldr x9,[x20]
00a0b74c	add w8,w8,#0x1
00a0b750	str w8,[x20, #0x8]
00a0b754	str x19,[x9, x21, LSL #0x3]
00a0b758	mov w19,#0x1
00a0b75c	mov w0,w19
00a0b760	ldp x29,x30,[sp, #0x20]
00a0b764	ldp x20,x19,[sp, #0x10]
00a0b768	ldr x21,[sp], #0x30
00a0b76c	ret
00a0b770	mov w19,wzr
00a0b774	b 0x00a0b75c
