; FUN_00ba95ac @ 00ba95ac
00ba95ac	stp x20,x19,[sp, #-0x20]!
00ba95b0	stp x29,x30,[sp, #0x10]
00ba95b4	add x29,sp,#0x10
00ba95b8	mov x20,x0
00ba95bc	cbz x0,0x00ba9624
00ba95c0	ldr x8,[x20, #0x8]
00ba95c4	sub x8,x8,#0x5
00ba95c8	cmp x8,#0x4
00ba95cc	b.hi 0x00ba9624
00ba95d0	adrp x9,0x788000
00ba95d4	add x9,x9,#0x364
00ba95d8	ldrsw x8,[x9, x8, LSL #0x2]
00ba95dc	add x8,x8,x9
00ba95e0	br x8
00ba95e4	ldr x1,[x20, #0x10]
00ba95e8	adrp x0,0x2c6000
00ba95ec	add x0,x0,#0x92d
00ba95f0	mov w2,#0x5
00ba95f4	bl 0x00c300b0
00ba95f8	cbnz w0,0x00ba9624
00ba95fc	adrp x8,0xcab000
00ba9600	add x8,x8,#0x460
00ba9604	add x19,x8,#0xf0
00ba9608	b 0x00ba9628
00ba960c	ldr x1,[x20, #0x10]
00ba9610	adrp x0,0x2ba000
00ba9614	add x0,x0,#0xc3c
00ba9618	orr w2,wzr,#0x7
00ba961c	bl 0x00c300b0
00ba9620	cbz w0,0x00ba9780
00ba9624	mov x19,xzr
00ba9628	ldp x29,x30,[sp, #0x10]
00ba962c	mov x0,x19
00ba9630	ldp x20,x19,[sp], #0x20
00ba9634	ret
00ba9638	ldr x8,[x20, #0x10]
00ba963c	mov x9,#0x862a
00ba9640	movk x9,#0xce48, LSL #16
00ba9644	movk x9,#0x43d, LSL #32
00ba9648	ldr x8,[x8]
00ba964c	movk x9,#0x103, LSL #48
00ba9650	cmp x8,x9
00ba9654	adrp x8,0xcab000
00ba9658	add x8,x8,#0x460
00ba965c	b.eq 0x00ba9790
00ba9660	ldr x9,[x20, #0x10]
00ba9664	mov x10,#0x862a
00ba9668	movk x10,#0xce48, LSL #16
00ba966c	movk x10,#0x43d, LSL #32
00ba9670	ldr x9,[x9]
00ba9674	movk x10,#0x203, LSL #48
00ba9678	cmp x9,x10
00ba967c	b.eq 0x00ba9798
00ba9680	ldr x9,[x20, #0x10]
00ba9684	mov x10,#0x862a
00ba9688	movk x10,#0xce48, LSL #16
00ba968c	movk x10,#0x43d, LSL #32
00ba9690	ldr x9,[x9]
00ba9694	movk x10,#0x303, LSL #48
00ba9698	cmp x9,x10
00ba969c	b.eq 0x00ba97a8
00ba96a0	ldr x9,[x20, #0x10]
00ba96a4	mov x10,#0x862a
00ba96a8	movk x10,#0xce48, LSL #16
00ba96ac	movk x10,#0x43d, LSL #32
00ba96b0	ldr x9,[x9]
00ba96b4	movk x10,#0x403, LSL #48
00ba96b8	cmp x9,x10
00ba96bc	b.ne 0x00ba9624
00ba96c0	add x19,x8,#0x1b8
00ba96c4	b 0x00ba9628
00ba96c8	ldr x1,[x20, #0x10]
00ba96cc	adrp x0,0x2ba000
00ba96d0	add x0,x0,#0xc32
00ba96d4	mov w2,#0x9
00ba96d8	bl 0x00c300b0
00ba96dc	adrp x19,0xcab000
00ba96e0	add x19,x19,#0x460
00ba96e4	cbz w0,0x00ba9628
00ba96e8	ldr x1,[x20, #0x10]
00ba96ec	adrp x0,0x2ab000
00ba96f0	add x0,x0,#0x1b7
00ba96f4	mov w2,#0x9
00ba96f8	bl 0x00c300b0
00ba96fc	cbz w0,0x00ba97a0
00ba9700	ldr x1,[x20, #0x10]
00ba9704	adrp x0,0x2a3000
00ba9708	add x0,x0,#0x3e8
00ba970c	mov w2,#0x9
00ba9710	bl 0x00c300b0
00ba9714	cbz w0,0x00ba97b0
00ba9718	ldr x1,[x20, #0x10]
00ba971c	adrp x0,0x2c0000
00ba9720	add x0,x0,#0xc16
00ba9724	mov w2,#0x9
00ba9728	bl 0x00c300b0
00ba972c	cbz w0,0x00ba97b8
00ba9730	ldr x1,[x20, #0x10]
00ba9734	adrp x0,0x2d6000
00ba9738	add x0,x0,#0xd90
00ba973c	mov w2,#0x9
00ba9740	bl 0x00c300b0
00ba9744	cbz w0,0x00ba97c0
00ba9748	ldr x1,[x20, #0x10]
00ba974c	adrp x0,0x2d0000
00ba9750	add x0,x0,#0x9d8
00ba9754	mov w2,#0x9
00ba9758	bl 0x00c300b0
00ba975c	cbz w0,0x00ba97c8
00ba9760	ldr x1,[x20, #0x10]
00ba9764	adrp x0,0x2cc000
00ba9768	add x0,x0,#0x9bd
00ba976c	mov w2,#0x9
00ba9770	bl 0x00c300b0
00ba9774	cbnz w0,0x00ba9624
00ba9778	add x19,x19,#0x1e0
00ba977c	b 0x00ba9628
00ba9780	adrp x8,0xcab000
00ba9784	add x8,x8,#0x460
00ba9788	add x19,x8,#0x118
00ba978c	b 0x00ba9628
00ba9790	add x19,x8,#0x140
00ba9794	b 0x00ba9628
00ba9798	add x19,x8,#0x168
00ba979c	b 0x00ba9628
00ba97a0	add x19,x19,#0x28
00ba97a4	b 0x00ba9628
00ba97a8	add x19,x8,#0x190
00ba97ac	b 0x00ba9628
00ba97b0	add x19,x19,#0x50
00ba97b4	b 0x00ba9628
00ba97b8	add x19,x19,#0x78
00ba97bc	b 0x00ba9628
00ba97c0	add x19,x19,#0xa0
00ba97c4	b 0x00ba9628
00ba97c8	add x19,x19,#0xc8
00ba97cc	b 0x00ba9628
