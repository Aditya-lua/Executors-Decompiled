; WPACKET_put_bytes__ @ 00a9cd80
00a9cd80	str x21,[sp, #-0x30]!
00a9cd84	mov x21,x0
00a9cd88	cmp x2,#0x8
00a9cd8c	mov w0,wzr
00a9cd90	stp x20,x19,[sp, #0x10]
00a9cd94	stp x29,x30,[sp, #0x20]
00a9cd98	add x29,sp,#0x20
00a9cd9c	b.hi 0x00a9cdfc
00a9cda0	mov x20,x2
00a9cda4	mov x19,x1
00a9cda8	add x2,sp,#0x8
00a9cdac	mov x0,x21
00a9cdb0	mov x1,x20
00a9cdb4	bl 0x00a9c32c
00a9cdb8	cbz w0,0x00a9cdfc
00a9cdbc	ldr q0,[x21, #0x10]
00a9cdc0	dup v1.2D,x20
00a9cdc4	add v0.2D,v1.2D,v0.2D
00a9cdc8	str q0,[x21, #0x10]
00a9cdcc	ldr x8,[sp, #0x8]
00a9cdd0	cbz x8,0x00a9cdf8
00a9cdd4	cbz x20,0x00a9cdec
00a9cdd8	add x9,x8,x20
00a9cddc	subs x20,x20,#0x1
00a9cde0	sturb w19,[x9, #-0x1]
00a9cde4	lsr x19,x19,#0x8
00a9cde8	b.ne 0x00a9cdd8
00a9cdec	cmp x19,#0x0
00a9cdf0	cset w0,eq
00a9cdf4	b 0x00a9cdfc
00a9cdf8	mov w0,#0x1
00a9cdfc	ldp x29,x30,[sp, #0x20]
00a9ce00	ldp x20,x19,[sp, #0x10]
00a9ce04	ldr x21,[sp], #0x30
00a9ce08	ret
