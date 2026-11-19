; BIO_lookup_ex @ 009fb4a0
009fb4a0	sub sp,sp,#0x80
009fb4a4	cmp w3,#0xa
009fb4a8	str x25,[sp, #0x30]
009fb4ac	stp x24,x23,[sp, #0x40]
009fb4b0	stp x22,x21,[sp, #0x50]
009fb4b4	stp x20,x19,[sp, #0x60]
009fb4b8	stp x29,x30,[sp, #0x70]
009fb4bc	add x29,sp,#0x70
009fb4c0	b.hi 0x009fb590
009fb4c4	adrp x9,0x74e000
009fb4c8	mov w8,w3
009fb4cc	add x9,x9,#0x378
009fb4d0	ldrsw x8,[x9, x8, LSL #0x2]
009fb4d4	mov x19,x6
009fb4d8	mov w22,w4
009fb4dc	mov w24,w3
009fb4e0	add x8,x8,x9
009fb4e4	mov x20,x0
009fb4e8	br x8
009fb4ec	mov w25,w5
009fb4f0	mov w23,w2
009fb4f4	mov x21,x1
009fb4f8	bl 0x00c385b0
009fb4fc	cmp w0,#0x1
009fb500	mov w0,wzr
009fb504	b.ne 0x009fb830
009fb508	movi v0.2D,#0x0
009fb50c	mov w8,#0x1
009fb510	stp q0,q0,[sp]
009fb514	str q0,[sp, #0x20]
009fb518	stp w24,w22,[sp, #0x4]
009fb51c	str w25,[sp, #0xc]
009fb520	cbz x20,0x009fb534
009fb524	cbnz w24,0x009fb534
009fb528	mov w8,#0x400
009fb52c	str w8,[sp]
009fb530	mov w8,#0x401
009fb534	mov w22,wzr
009fb538	cmp w23,#0x1
009fb53c	mov w23,wzr
009fb540	b.ne 0x009fb718
009fb544	b 0x009fb710
009fb548	mov x0,x20
009fb54c	bl 0x00c2ff50
009fb550	adrp x1,0x2cd000
009fb554	mov x21,x0
009fb558	add x1,x1,#0x866
009fb55c	orr w0,wzr,#0x30
009fb560	mov w2,#0x245
009fb564	bl 0x00c34250
009fb568	str x0,[x19]
009fb56c	cbz x0,0x009fb5b8
009fb570	mov w8,#0x1
009fb574	cmp w22,#0x1
009fb578	stp w8,w22,[x0, #0x4]
009fb57c	b.eq 0x009fb5ec
009fb580	cmp w22,#0x2
009fb584	b.ne 0x009fb5f8
009fb588	mov w8,#0x11
009fb58c	b 0x009fb5f0
009fb590	bl 0x00c342a0
009fb594	adrp x0,0x2cd000
009fb598	adrp x2,0x2bb000
009fb59c	add x0,x0,#0x866
009fb5a0	add x2,x2,#0x9dc
009fb5a4	mov w1,#0x29e
009fb5a8	bl 0x00c342b0
009fb5ac	mov w0,#0x20
009fb5b0	mov w1,#0x83
009fb5b4	b 0x009fb824
009fb5b8	bl 0x00c342a0
009fb5bc	adrp x0,0x2cd000
009fb5c0	adrp x2,0x2cf000
009fb5c4	add x0,x0,#0x866
009fb5c8	add x2,x2,#0x93a
009fb5cc	mov w1,#0x246
009fb5d0	bl 0x00c342b0
009fb5d4	mov w1,#0x100
009fb5d8	mov w0,#0x20
009fb5dc	movk w1,#0xc, LSL #16
009fb5e0	mov x2,xzr
009fb5e4	bl 0x00c342c0
009fb5e8	b 0x009fb6f4
009fb5ec	orr w8,wzr,#0x6
009fb5f0	str w8,[x0, #0xc]!
009fb5f4	b 0x009fb5fc
009fb5f8	add x0,x0,#0xc
009fb5fc	adrp x1,0x2cd000
009fb600	str wzr,[x0]
009fb604	add x1,x1,#0x866
009fb608	orr w0,wzr,#0x70
009fb60c	mov w2,#0x36
009fb610	bl 0x00c34250
009fb614	cbz x0,0x009fb660
009fb618	add x8,x21,#0x1
009fb61c	mov x22,x0
009fb620	cmp x8,#0x6c
009fb624	strh wzr,[x0]
009fb628	b.hi 0x009fb654
009fb62c	mov w2,#0x6e
009fb630	mov x0,x22
009fb634	mov w1,wzr
009fb638	bl 0x00c301c0
009fb63c	mov w8,#0x1
009fb640	mov x0,x22
009fb644	strh w8,[x0], #0x2
009fb648	mov w2,#0x6b
009fb64c	mov x1,x20
009fb650	bl 0x00c30ba0
009fb654	ldr x8,[x19]
009fb658	str x22,[x8, #0x20]
009fb65c	b 0x009fb690
009fb660	bl 0x00c342a0
009fb664	adrp x0,0x2cd000
009fb668	adrp x2,0x2d3000
009fb66c	add x0,x0,#0x866
009fb670	add x2,x2,#0x8f2
009fb674	mov w1,#0x39
009fb678	bl 0x00c342b0
009fb67c	mov w1,#0x100
009fb680	mov w0,#0x20
009fb684	movk w1,#0xc, LSL #16
009fb688	mov x2,xzr
009fb68c	bl 0x00c342c0
009fb690	ldr x8,[x19]
009fb694	str xzr,[x8, #0x28]
009fb698	ldr x20,[x19]
009fb69c	ldr x8,[x20, #0x20]
009fb6a0	cbnz x8,0x009fb794
009fb6a4	cbz x20,0x009fb6f0
009fb6a8	ldr w8,[x20, #0x4]
009fb6ac	cmp w8,#0x1
009fb6b0	b.ne 0x009fb6e8
009fb6b4	adrp x21,0x2cd000
009fb6b8	add x21,x21,#0x866
009fb6bc	ldp x0,x22,[x20, #0x20]
009fb6c0	mov w2,#0x1c1
009fb6c4	mov x1,x21
009fb6c8	bl 0x00c32310
009fb6cc	mov w2,#0x1c2
009fb6d0	mov x0,x20
009fb6d4	mov x1,x21
009fb6d8	bl 0x00c32310
009fb6dc	mov x20,x22
009fb6e0	cbnz x22,0x009fb6bc
009fb6e4	b 0x009fb6f0
009fb6e8	mov x0,x20
009fb6ec	bl 0x00c31cd0
009fb6f0	str xzr,[x19]
009fb6f4	bl 0x00c342a0
009fb6f8	adrp x0,0x2cd000
009fb6fc	adrp x2,0x2bb000
009fb700	add x0,x0,#0x866
009fb704	add x2,x2,#0x9dc
009fb708	mov w1,#0x2a7
009fb70c	b 0x009fb7b4
009fb710	mov w23,w22
009fb714	str w8,[sp]
009fb718	mov x2,sp
009fb71c	mov x0,x20
009fb720	mov x1,x21
009fb724	mov x3,x19
009fb728	bl 0x00c31ce0
009fb72c	cbz w0,0x009fb794
009fb730	mov w22,w0
009fb734	cmp w0,#0x6
009fb738	b.eq 0x009fb79c
009fb73c	cmp w22,#0xb
009fb740	b.eq 0x009fb7c8
009fb744	ldr w8,[sp]
009fb748	tbz w8,#0xa,0x009fb758
009fb74c	and w8,w8,#0xfffffbff
009fb750	orr w8,w8,#0x4
009fb754	b 0x009fb710
009fb758	bl 0x00c342a0
009fb75c	adrp x0,0x2cd000
009fb760	adrp x2,0x2bb000
009fb764	add x0,x0,#0x866
009fb768	add x2,x2,#0x9dc
009fb76c	mov w1,#0x2e2
009fb770	bl 0x00c342b0
009fb774	cmp w23,#0x0
009fb778	csel w0,w22,w23,eq
009fb77c	bl 0x00c33610
009fb780	mov w1,#0x2
009fb784	mov x2,x0
009fb788	mov w0,#0x20
009fb78c	movk w1,#0x8, LSL #16
009fb790	b 0x009fb828
009fb794	mov w0,#0x1
009fb798	b 0x009fb830
009fb79c	bl 0x00c342a0
009fb7a0	adrp x0,0x2cd000
009fb7a4	adrp x2,0x2bb000
009fb7a8	add x0,x0,#0x866
009fb7ac	add x2,x2,#0x9dc
009fb7b0	mov w1,#0x2d3
009fb7b4	bl 0x00c342b0
009fb7b8	mov w1,#0x100
009fb7bc	mov w0,#0x20
009fb7c0	movk w1,#0xc, LSL #16
009fb7c4	b 0x009fb824
009fb7c8	bl 0x00c342a0
009fb7cc	adrp x19,0x2cd000
009fb7d0	adrp x20,0x2bb000
009fb7d4	add x19,x19,#0x866
009fb7d8	add x20,x20,#0x9dc
009fb7dc	mov w1,#0x2cc
009fb7e0	mov x0,x19
009fb7e4	mov x2,x20
009fb7e8	bl 0x00c342b0
009fb7ec	bl 0x00c30710
009fb7f0	ldr w1,[x0]
009fb7f4	adrp x2,0x2c5000
009fb7f8	add x2,x2,#0x7c1
009fb7fc	mov w0,#0x2
009fb800	bl 0x00c342c0
009fb804	bl 0x00c342a0
009fb808	mov w1,#0x2ce
009fb80c	mov x0,x19
009fb810	mov x2,x20
009fb814	bl 0x00c342b0
009fb818	mov w1,#0x2
009fb81c	mov w0,#0x20
009fb820	movk w1,#0x8, LSL #16
009fb824	mov x2,xzr
009fb828	bl 0x00c342c0
009fb82c	mov w0,wzr
009fb830	ldp x29,x30,[sp, #0x70]
009fb834	ldp x20,x19,[sp, #0x60]
009fb838	ldp x22,x21,[sp, #0x50]
009fb83c	ldp x24,x23,[sp, #0x40]
009fb840	ldr x25,[sp, #0x30]
009fb844	add sp,sp,#0x80
009fb848	ret
