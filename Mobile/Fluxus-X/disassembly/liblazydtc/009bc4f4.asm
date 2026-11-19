; SSL_CTX_use_serverinfo_ex @ 009bc4f4
009bc4f4	str x27,[sp, #-0x60]!
009bc4f8	stp x26,x25,[sp, #0x10]
009bc4fc	stp x24,x23,[sp, #0x20]
009bc500	stp x22,x21,[sp, #0x30]
009bc504	stp x20,x19,[sp, #0x40]
009bc508	stp x29,x30,[sp, #0x50]
009bc50c	add x29,sp,#0x50
009bc510	cbz x0,0x009bc59c
009bc514	mov x21,x2
009bc518	cbz x2,0x009bc59c
009bc51c	mov x20,x3
009bc520	cbz x3,0x009bc59c
009bc524	mov w22,w1
009bc528	mov x19,x0
009bc52c	subs w8,w1,#0x1
009bc530	b.ne 0x009bc5cc
009bc534	add x23,x20,#0x4
009bc538	adrp x1,0x2db000
009bc53c	add x1,x1,#0xaec
009bc540	mov w2,#0x2f2
009bc544	mov x0,x23
009bc548	bl 0x00c32320
009bc54c	cbz x0,0x009bc790
009bc550	mov w8,#0xd0010000
009bc554	mov x22,x0
009bc558	str w8,[x0], #0x4
009bc55c	mov x1,x21
009bc560	mov x2,x20
009bc564	bl 0x00c2ffd0
009bc568	mov w1,#0x2
009bc56c	mov x0,x19
009bc570	mov x2,x22
009bc574	mov x3,x23
009bc578	bl 0x009bc4f4
009bc57c	adrp x1,0x2db000
009bc580	mov w19,w0
009bc584	add x1,x1,#0xaec
009bc588	mov w2,#0x2fd
009bc58c	mov x0,x22
009bc590	bl 0x00c32310
009bc594	mov w0,w19
009bc598	b 0x009bc7c4
009bc59c	bl 0x00c342a0
009bc5a0	adrp x0,0x2db000
009bc5a4	adrp x2,0x2cb000
009bc5a8	add x0,x0,#0xaec
009bc5ac	add x2,x2,#0x51d
009bc5b0	mov w1,#0x2e5
009bc5b4	bl 0x00c342b0
009bc5b8	mov w8,#0x100
009bc5bc	movk w8,#0xc, LSL #16
009bc5c0	add w1,w8,#0x2
009bc5c4	mov w0,#0x14
009bc5c8	b 0x009bc7b8
009bc5cc	tbnz x20,#0x3f,0x009bc768
009bc5d0	cmp w8,#0x1
009bc5d4	b.hi 0x009bc768
009bc5d8	mov x9,x20
009bc5dc	mov x8,x21
009bc5e0	subs x10,x9,#0x4
009bc5e4	b.cc 0x009bc768
009bc5e8	cmp x10,#0x2
009bc5ec	b.cc 0x009bc768
009bc5f0	and x10,x10,#-0x2
009bc5f4	cmp x10,#0x2
009bc5f8	b.eq 0x009bc768
009bc5fc	ldrb w11,[x8, #0x6]
009bc600	ldrb w10,[x8, #0x7]
009bc604	sub x9,x9,#0x8
009bc608	bfm x10,x11,#0x38,#0x7
009bc60c	cmp x9,x10
009bc610	b.cc 0x009bc768
009bc614	add x8,x8,x10
009bc618	subs x9,x9,x10
009bc61c	add x8,x8,#0x8
009bc620	b.ne 0x009bc5e0
009bc624	ldr x8,[x19, #0x158]
009bc628	ldr x8,[x8]
009bc62c	cbz x8,0x009bc7e0
009bc630	ldr x0,[x8, #0x18]
009bc634	adrp x2,0x2db000
009bc638	add x2,x2,#0xaec
009bc63c	mov w3,#0x30a
009bc640	mov x1,x20
009bc644	bl 0x00c356f0
009bc648	cbz x0,0x009bc82c
009bc64c	ldr x8,[x19, #0x158]
009bc650	mov x1,x21
009bc654	mov x2,x20
009bc658	ldr x8,[x8]
009bc65c	str x0,[x8, #0x18]
009bc660	bl 0x00c2ffd0
009bc664	ldr x8,[x19, #0x158]
009bc668	adrp x23,0x9bd000
009bc66c	adrp x24,0x9bd000
009bc670	adrp x25,0x9bd000
009bc674	ldr x8,[x8]
009bc678	adrp x26,0x9bd000
009bc67c	add x23,x23,#0x6c
009bc680	add x24,x24,#0x144
009bc684	add x25,x25,#0x160
009bc688	add x26,x26,#0x248
009bc68c	str x20,[x8, #0x20]
009bc690	cmp w22,#0x2
009bc694	b.ne 0x009bc6d0
009bc698	subs x20,x20,#0x4
009bc69c	b.cc 0x009bc810
009bc6a0	ldrb w8,[x21]
009bc6a4	ldrb w9,[x21, #0x1]
009bc6a8	ldrb w10,[x21, #0x2]
009bc6ac	ldrb w11,[x21, #0x3]
009bc6b0	lsl x8,x8,#0x18
009bc6b4	bfm x8,x9,#0x30,#0x7
009bc6b8	bfm x8,x10,#0x38,#0x7
009bc6bc	orr x2,x8,x11
009bc6c0	add x21,x21,#0x4
009bc6c4	cmp x20,#0x2
009bc6c8	b.cs 0x009bc6dc
009bc6cc	b 0x009bc810
009bc6d0	mov x2,xzr
009bc6d4	cmp x20,#0x2
009bc6d8	b.cc 0x009bc810
009bc6dc	and x8,x20,#-0x2
009bc6e0	cmp x8,#0x2
009bc6e4	b.eq 0x009bc810
009bc6e8	ldrb w8,[x21, #0x2]
009bc6ec	ldrb w27,[x21, #0x3]
009bc6f0	bfm x27,x8,#0x38,#0x7
009bc6f4	sub x8,x20,#0x4
009bc6f8	subs x20,x8,x27
009bc6fc	b.cc 0x009bc810
009bc700	ldrb w8,[x21]
009bc704	ldrb w1,[x21, #0x1]
009bc708	cmp x2,#0x1d0
009bc70c	mov x0,x19
009bc710	bfm w1,w8,#0x18,#0x7
009bc714	b.ne 0x009bc738
009bc718	mov x2,x23
009bc71c	mov x3,xzr
009bc720	mov x4,xzr
009bc724	mov x5,x24
009bc728	mov x6,xzr
009bc72c	bl 0x00c35fc0
009bc730	cbnz w0,0x009bc754
009bc734	b 0x009bc810
009bc738	mov x3,x25
009bc73c	mov x4,xzr
009bc740	mov x5,xzr
009bc744	mov x6,x26
009bc748	mov x7,xzr
009bc74c	bl 0x00c35fb0
009bc750	cbz w0,0x009bc810
009bc754	add x8,x21,x27
009bc758	add x21,x8,#0x4
009bc75c	mov w0,#0x1
009bc760	cbnz x20,0x009bc690
009bc764	b 0x009bc7c4
009bc768	bl 0x00c342a0
009bc76c	adrp x0,0x2db000
009bc770	adrp x2,0x2cb000
009bc774	add x0,x0,#0xaec
009bc778	add x2,x2,#0x51d
009bc77c	mov w1,#0x302
009bc780	bl 0x00c342b0
009bc784	mov w0,#0x14
009bc788	mov w1,#0x184
009bc78c	b 0x009bc7b8
009bc790	bl 0x00c342a0
009bc794	adrp x0,0x2db000
009bc798	adrp x2,0x2cb000
009bc79c	add x0,x0,#0xaec
009bc7a0	add x2,x2,#0x51d
009bc7a4	mov w1,#0x2f4
009bc7a8	bl 0x00c342b0
009bc7ac	mov w1,#0x100
009bc7b0	mov w0,#0x14
009bc7b4	movk w1,#0xc, LSL #16
009bc7b8	mov x2,xzr
009bc7bc	bl 0x00c342c0
009bc7c0	mov w0,wzr
009bc7c4	ldp x29,x30,[sp, #0x50]
009bc7c8	ldp x20,x19,[sp, #0x40]
009bc7cc	ldp x22,x21,[sp, #0x30]
009bc7d0	ldp x24,x23,[sp, #0x20]
009bc7d4	ldp x26,x25,[sp, #0x10]
009bc7d8	ldr x27,[sp], #0x60
009bc7dc	ret
009bc7e0	bl 0x00c342a0
009bc7e4	adrp x0,0x2db000
009bc7e8	adrp x2,0x2cb000
009bc7ec	add x0,x0,#0xaec
009bc7f0	add x2,x2,#0x51d
009bc7f4	mov w1,#0x306
009bc7f8	bl 0x00c342b0
009bc7fc	mov w8,#0x100
009bc800	movk w8,#0xc, LSL #16
009bc804	add w1,w8,#0x3
009bc808	mov w0,#0x14
009bc80c	b 0x009bc7b8
009bc810	bl 0x00c342a0
009bc814	adrp x0,0x2db000
009bc818	adrp x2,0x2cb000
009bc81c	add x0,x0,#0xaec
009bc820	add x2,x2,#0x51d
009bc824	mov w1,#0x319
009bc828	b 0x009bc780
009bc82c	bl 0x00c342a0
009bc830	adrp x0,0x2db000
009bc834	adrp x2,0x2cb000
009bc838	add x0,x0,#0xaec
009bc83c	add x2,x2,#0x51d
009bc840	mov w1,#0x30c
009bc844	b 0x009bc7a8
