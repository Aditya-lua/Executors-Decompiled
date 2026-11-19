; WPACKET_init_static_len @ 00a9c668
00a9c668	sub x8,x3,#0x1
00a9c66c	cmp x8,#0x6
00a9c670	b.ls 0x00a9c6a4
00a9c674	mov x8,#-0x1
00a9c678	cbz x1,0x00a9c6b8
00a9c67c	cbz x2,0x00a9c6b8
00a9c680	ldrb w9,[x0, #0x30]
00a9c684	cmp x8,x2
00a9c688	csel x8,x8,x2,cc
00a9c68c	stp xzr,x1,[x0]
00a9c690	str x8,[x0, #0x20]
00a9c694	and w8,w9,#0xfe
00a9c698	mov x1,x3
00a9c69c	strb w8,[x0, #0x30]
00a9c6a0	b 0x00a9c6c0
00a9c6a4	lsl x9,x3,#0x3
00a9c6a8	mov w10,#0x1
00a9c6ac	lsl x9,x10,x9
00a9c6b0	add x8,x9,x8
00a9c6b4	cbnz x1,0x00a9c67c
00a9c6b8	mov w0,wzr
00a9c6bc	ret
00a9c6c0	sub sp,sp,#0x30
00a9c6c4	stp x20,x19,[sp, #0x10]
00a9c6c8	mov x20,x1
00a9c6cc	adrp x1,0x2bd000
00a9c6d0	stp x29,x30,[sp, #0x20]
00a9c6d4	mov x19,x0
00a9c6d8	stp xzr,xzr,[x0, #0x10]
00a9c6dc	add x1,x1,#0xe31
00a9c6e0	mov w0,#0x28
00a9c6e4	mov w2,#0x6b
00a9c6e8	add x29,sp,#0x20
00a9c6ec	bl 0x00c34250
00a9c6f0	str x0,[x19, #0x28]
00a9c6f4	cbz x0,0x00a9c734
00a9c6f8	cbz x20,0x00a9c72c
00a9c6fc	stp x20,x20,[x0, #0x10]
00a9c700	add x2,sp,#0x8
00a9c704	mov x0,x19
00a9c708	mov x1,x20
00a9c70c	bl 0x00a9c32c
00a9c710	cbz w0,0x00a9c76c
00a9c714	ldr q0,[x19, #0x10]
00a9c718	ldr x8,[x19, #0x28]
00a9c71c	dup v1.2D,x20
00a9c720	add v0.2D,v1.2D,v0.2D
00a9c724	str q0,[x19, #0x10]
00a9c728	str xzr,[x8, #0x8]
00a9c72c	mov w0,#0x1
00a9c730	b 0x00a9c788
00a9c734	bl 0x00c342a0
00a9c738	adrp x0,0x2bd000
00a9c73c	adrp x2,0x2b0000
00a9c740	add x0,x0,#0xe31
00a9c744	add x2,x2,#0x35a
00a9c748	mov w1,#0x6c
00a9c74c	bl 0x00c342b0
00a9c750	mov w1,#0x100
00a9c754	orr w0,wzr,#0xf
00a9c758	movk w1,#0xc, LSL #16
00a9c75c	mov x2,xzr
00a9c760	bl 0x00c342c0
00a9c764	mov w0,wzr
00a9c768	b 0x00a9c788
00a9c76c	ldr x0,[x19, #0x28]
00a9c770	adrp x1,0x2bd000
00a9c774	add x1,x1,#0xe31
00a9c778	mov w2,#0x77
00a9c77c	bl 0x00c32310
00a9c780	mov w0,wzr
00a9c784	str xzr,[x19, #0x28]
00a9c788	ldp x29,x30,[sp, #0x20]
00a9c78c	ldp x20,x19,[sp, #0x10]
00a9c790	add sp,sp,#0x30
00a9c794	ret
