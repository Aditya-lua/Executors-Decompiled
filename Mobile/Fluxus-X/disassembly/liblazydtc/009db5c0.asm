; ossl_statem_client_write_transition @ 009db5c0
009db5c0	stp x20,x19,[sp, #-0x20]!
009db5c4	stp x29,x30,[sp, #0x10]
009db5c8	ldr x9,[x0, #0x8]
009db5cc	mov x19,x0
009db5d0	add x29,sp,#0x10
009db5d4	ldr x8,[x9, #0xc0]
009db5d8	ldr w8,[x8, #0x60]
009db5dc	tbnz w8,#0x3,0x009db62c
009db5e0	ldr w9,[x9]
009db5e4	cmp w9,#0x304
009db5e8	b.lt 0x009db62c
009db5ec	cmp w9,#0x10, LSL #12
009db5f0	b.eq 0x009db62c
009db5f4	ldr w8,[x19, #0x5c]
009db5f8	sub w8,w8,#0x1
009db5fc	cmp w8,#0x2f
009db600	b.hi 0x009db79c
009db604	adrp x9,0x74d000
009db608	add x9,x9,#0x1e4
009db60c	ldrsw x8,[x9, x8, LSL #0x2]
009db610	add x8,x8,x9
009db614	br x8
009db618	ldr w8,[x19, #0xba4]
009db61c	cmn w8,#0x1
009db620	b.eq 0x009db728
009db624	mov w8,#0x2b
009db628	b 0x009db868
009db62c	ldr w9,[x19, #0x5c]
009db630	cmp w9,#0x2e
009db634	b.hi 0x009db65c
009db638	adrp x10,0x74d000
009db63c	add x10,x10,#0x2a4
009db640	ldrsw x9,[x10, x9, LSL #0x2]
009db644	mov w20,#0x2
009db648	add x9,x9,x10
009db64c	br x9
009db650	ldr w8,[x19, #0xba0]
009db654	cbnz w8,0x009db758
009db658	b 0x009db728
009db65c	bl 0x00c342a0
009db660	adrp x0,0x2d7000
009db664	adrp x2,0x2b3000
009db668	add x0,x0,#0xb1a
009db66c	add x2,x2,#0xf91
009db670	orr w1,wzr,#0x1ff
009db674	b 0x009db814
009db678	ldr w8,[x19, #0x2f0]
009db67c	mov w9,#0xd
009db680	cmp w8,#0x0
009db684	cinc w8,w9,eq
009db688	b 0x009db868
009db68c	ldr w8,[x19, #0x2f0]
009db690	ldr x9,[x19, #0xa8]
009db694	orr w10,wzr,#0xf
009db698	mov w0,#0x1
009db69c	cmp w8,#0x1
009db6a0	and x8,x9,#0x10
009db6a4	ccmp x8,#0x0,#0x0,eq
009db6a8	cinc w8,w10,ne
009db6ac	str w8,[x19, #0x5c]
009db6b0	b 0x009db874
009db6b4	ldr w9,[x19, #0x8e8]
009db6b8	cmp w9,#0x1
009db6bc	b.eq 0x009db758
009db6c0	ldr w9,[x19, #0x84]
009db6c4	cmp w9,#0x2
009db6c8	b.ne 0x009db7d0
009db6cc	mov w8,#0x2e
009db6d0	b 0x009db868
009db6d4	ldr w8,[x19, #0x4d0]
009db6d8	cbnz w8,0x009db838
009db6dc	b 0x009db728
009db6e0	ldrb w8,[x19, #0x9ea]
009db6e4	tbz w8,#0x4,0x009db758
009db6e8	ldr w8,[x19, #0x84]
009db6ec	cmp w8,#0x7
009db6f0	b.ne 0x009db700
009db6f4	b 0x009db758
009db6f8	ldr w8,[x19, #0x4d0]
009db6fc	cbz w8,0x009db838
009db700	mov w8,#0x10
009db704	b 0x009db868
009db708	ldr w8,[x19, #0x84]
009db70c	cmp w8,#0x2
009db710	b.ne 0x009db728
009db714	ldr x8,[x19, #0x9e8]
009db718	mov w9,#0x10
009db71c	mov w10,#0x2e
009db720	tst x8,#0x100000
009db724	b 0x009db864
009db728	mov w20,#0x2
009db72c	b 0x009db870
009db730	orr w8,wzr,#0xe
009db734	b 0x009db868
009db738	mov w1,#0x1
009db73c	mov x0,x19
009db740	mov w20,#0x1
009db744	bl 0x00c341b0
009db748	cbz w0,0x009db83c
009db74c	mov x0,x19
009db750	bl 0x00c37090
009db754	cbz w0,0x009db7ec
009db758	orr w8,wzr,#0xc
009db75c	b 0x009db868
009db760	ldr w8,[x19, #0xba8]
009db764	cmp w8,#0x4
009db768	b.ne 0x009db7f4
009db76c	mov w8,#0xd
009db770	b 0x009db868
009db774	ldr w8,[x19, #0x2f0]
009db778	mov w9,#0x12
009db77c	orr w10,wzr,#0xf
009db780	cmp w8,#0x1
009db784	b 0x009db864
009db788	ldr w8,[x19, #0xb30]
009db78c	cmp w8,#0x2
009db790	b.ne 0x009db854
009db794	orr w8,wzr,#0x30
009db798	b 0x009db868
009db79c	bl 0x00c342a0
009db7a0	adrp x0,0x2d7000
009db7a4	adrp x2,0x2c1000
009db7a8	add x0,x0,#0xb1a
009db7ac	add x2,x2,#0x8a6
009db7b0	mov w1,#0x1a3
009db7b4	b 0x009db814
009db7b8	ldr w8,[x19, #0x84]
009db7bc	orr w8,w8,#0x4
009db7c0	cmp w8,#0x7
009db7c4	b.ne 0x009db844
009db7c8	mov w8,#0x2f
009db7cc	b 0x009db868
009db7d0	tbnz w8,#0x3,0x009db7e4
009db7d4	ldr w8,[x19, #0x484]
009db7d8	cbz w8,0x009db7e4
009db7dc	mov w8,#0x11
009db7e0	b 0x009db868
009db7e4	mov w8,#0x12
009db7e8	b 0x009db868
009db7ec	mov w20,wzr
009db7f0	b 0x009db870
009db7f4	ldrb w8,[x19, #0x44]
009db7f8	tbnz w8,#0x0,0x009db838
009db7fc	bl 0x00c342a0
009db800	adrp x0,0x2d7000
009db804	adrp x2,0x2c1000
009db808	add x0,x0,#0xb1a
009db80c	add x2,x2,#0x8a6
009db810	mov w1,#0x1b1
009db814	bl 0x00c342b0
009db818	mov w2,#0x103
009db81c	mov w1,#0x50
009db820	movk w2,#0xc, LSL #16
009db824	mov x0,x19
009db828	mov x3,xzr
009db82c	bl 0x00c34410
009db830	mov w20,wzr
009db834	b 0x009db870
009db838	mov w20,#0x1
009db83c	str w20,[x19, #0x5c]
009db840	b 0x009db870
009db844	ldrb w8,[x19, #0x9ea]
009db848	tbz w8,#0x4,0x009db854
009db84c	ldr w8,[x19, #0x8e8]
009db850	cbz w8,0x009db700
009db854	ldr w8,[x19, #0x2f0]
009db858	mov w9,#0xd
009db85c	mov w10,#0x12
009db860	cmp w8,#0x0
009db864	csel w8,w10,w9,eq
009db868	str w8,[x19, #0x5c]
009db86c	mov w20,#0x1
009db870	mov w0,w20
009db874	ldp x29,x30,[sp, #0x10]
009db878	ldp x20,x19,[sp], #0x20
009db87c	ret
