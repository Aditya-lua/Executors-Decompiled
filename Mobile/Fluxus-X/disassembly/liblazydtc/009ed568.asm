; FUN_009ed568 @ 009ed568
009ed568	sub sp,sp,#0x80
009ed56c	stp x26,x25,[sp, #0x30]
009ed570	stp x24,x23,[sp, #0x40]
009ed574	stp x22,x21,[sp, #0x50]
009ed578	stp x20,x19,[sp, #0x60]
009ed57c	stp x29,x30,[sp, #0x70]
009ed580	strb wzr,[sp, #0xc]
009ed584	ldrsw x23,[x3, #0x4]
009ed588	mov x21,x3
009ed58c	mov x22,x2
009ed590	mov x19,x1
009ed594	mov x20,x0
009ed598	mov w25,wzr
009ed59c	add x29,sp,#0x70
009ed5a0	tbz w22,#0x6,0x009ed5ec
009ed5a4	mov w0,w23
009ed5a8	bl 0x00c37800
009ed5ac	mov x25,x0
009ed5b0	bl 0x00c2ff50
009ed5b4	mov x24,x0
009ed5b8	mov x0,x19
009ed5bc	mov x1,x25
009ed5c0	mov w2,w24
009ed5c4	blr x20
009ed5c8	cbz w0,0x009ed880
009ed5cc	adrp x1,0x2bc000
009ed5d0	add x1,x1,#0xda4
009ed5d4	mov w2,#0x1
009ed5d8	mov x0,x19
009ed5dc	blr x20
009ed5e0	cmp w0,#0x0
009ed5e4	cinc w25,w24,ne
009ed5e8	cbz w0,0x009ed880
009ed5ec	tbnz w22,#0x7,0x009ed6ec
009ed5f0	tbnz w22,#0x5,0x009ed610
009ed5f4	sub w8,w23,#0x1
009ed5f8	cmp w8,#0x1d
009ed5fc	b.hi 0x009ed6cc
009ed600	adrp x8,0x74d000
009ed604	add x8,x8,#0xd74
009ed608	ldrsb w8,[x8, x23]
009ed60c	b 0x009ed6d0
009ed610	mov w23,#0x1
009ed614	mov w8,#0x40f
009ed618	and w24,w22,w8
009ed61c	tbz w22,#0x4,0x009ed62c
009ed620	orr w8,w23,#0x8
009ed624	cmp w23,#0x0
009ed628	csinc w23,w8,wzr,ne
009ed62c	ldr x0,[x21, #0x8]
009ed630	ldr w1,[x21]
009ed634	add x4,sp,#0xc
009ed638	mov w2,w23
009ed63c	mov w3,w24
009ed640	mov x5,x20
009ed644	mov x6,xzr
009ed648	bl 0x009ed950
009ed64c	tbnz w0,#0x1f,0x009ed880
009ed650	ldrb w8,[sp, #0xc]
009ed654	add w9,w0,w25
009ed658	add w10,w9,#0x2
009ed65c	cmp w8,#0x0
009ed660	csel w22,w9,w10,eq
009ed664	cbz x19,0x009ed884
009ed668	cbz w8,0x009ed684
009ed66c	adrp x1,0x2c6000
009ed670	add x1,x1,#0xec4
009ed674	mov w2,#0x1
009ed678	mov x0,x19
009ed67c	blr x20
009ed680	cbz w0,0x009ed880
009ed684	ldr x0,[x21, #0x8]
009ed688	ldr w1,[x21]
009ed68c	mov w2,w23
009ed690	mov w3,w24
009ed694	mov x4,xzr
009ed698	mov x5,x20
009ed69c	mov x6,x19
009ed6a0	bl 0x009ed950
009ed6a4	tbnz w0,#0x1f,0x009ed880
009ed6a8	ldrb w8,[sp, #0xc]
009ed6ac	cbz w8,0x009ed884
009ed6b0	adrp x1,0x2c6000
009ed6b4	add x1,x1,#0xec4
009ed6b8	mov w2,#0x1
009ed6bc	mov x0,x19
009ed6c0	blr x20
009ed6c4	cbnz w0,0x009ed884
009ed6c8	b 0x009ed880
009ed6cc	mov w8,#0xffffffff
009ed6d0	cmn w8,#0x1
009ed6d4	and x9,x22,#0x100
009ed6d8	ccmp x9,#0x0,#0x0,eq
009ed6dc	csinc w23,w8,wzr,ne
009ed6e0	tbz w22,#0x8,0x009ed614
009ed6e4	cmn w8,#0x1
009ed6e8	b.ne 0x009ed614
009ed6ec	adrp x1,0x2ad000
009ed6f0	add x1,x1,#0x461
009ed6f4	mov w2,#0x1
009ed6f8	mov x0,x19
009ed6fc	blr x20
009ed700	cbz w0,0x009ed880
009ed704	tbnz w22,#0x9,0x009ed774
009ed708	ldrsw x22,[x21]
009ed70c	cbz x19,0x009ed75c
009ed710	cbz w22,0x009ed818
009ed714	ldr x21,[x21, #0x8]
009ed718	adrp x23,0x2a3000
009ed71c	add x23,x23,#0x64c
009ed720	mov x24,x22
009ed724	ldrb w8,[x21], #0x1
009ed728	add x1,sp,#0x2c
009ed72c	mov w2,#0x2
009ed730	mov x0,x19
009ed734	ubfx x9,x8,#0x4,#0x1c
009ed738	and x8,x8,#0xf
009ed73c	ldrb w9,[x23, w9, UXTW ]
009ed740	ldrb w8,[x23, x8]
009ed744	strb w9,[sp, #0x2c]
009ed748	strb w8,[sp, #0x2d]
009ed74c	blr x20
009ed750	cbz w0,0x009ed880
009ed754	subs x24,x24,#0x1
009ed758	b.ne 0x009ed724
009ed75c	lsl w8,w22,#0x1
009ed760	tbnz w8,#0x1f,0x009ed880
009ed764	mov w8,#0x1
009ed768	bfm w8,w22,#0x1f,#0x1e
009ed76c	tbz w8,#0x1f,0x009ed878
009ed770	b 0x009ed880
009ed774	ldr w8,[x21, #0x4]
009ed778	add x0,sp,#0x18
009ed77c	mov x1,xzr
009ed780	str x21,[sp, #0x20]
009ed784	str w8,[sp, #0x18]
009ed788	bl 0x00c37880
009ed78c	mov w22,w0
009ed790	cmp w0,#0x1
009ed794	b.lt 0x009ed880
009ed798	sxtw x23,w22
009ed79c	adrp x1,0x2bb000
009ed7a0	add x1,x1,#0x95a
009ed7a4	mov w2,#0x11d
009ed7a8	mov x0,x23
009ed7ac	bl 0x00c32320
009ed7b0	cbz x0,0x009ed820
009ed7b4	mov x21,x0
009ed7b8	str x0,[sp, #0x10]
009ed7bc	add x0,sp,#0x18
009ed7c0	add x1,sp,#0x10
009ed7c4	bl 0x00c37880
009ed7c8	cbz x19,0x009ed810
009ed7cc	adrp x24,0x2a3000
009ed7d0	add x24,x24,#0x64c
009ed7d4	mov x26,x21
009ed7d8	ldrb w8,[x26], #0x1
009ed7dc	add x1,sp,#0x2c
009ed7e0	mov w2,#0x2
009ed7e4	mov x0,x19
009ed7e8	ubfx x9,x8,#0x4,#0x1c
009ed7ec	and x8,x8,#0xf
009ed7f0	ldrb w9,[x24, w9, UXTW ]
009ed7f4	ldrb w8,[x24, x8]
009ed7f8	strb w9,[sp, #0x2c]
009ed7fc	strb w8,[sp, #0x2d]
009ed800	blr x20
009ed804	cbz w0,0x009ed854
009ed808	subs x23,x23,#0x1
009ed80c	b.ne 0x009ed7d8
009ed810	lsl w19,w22,#0x1
009ed814	b 0x009ed858
009ed818	add w22,w25,#0x1
009ed81c	b 0x009ed884
009ed820	bl 0x00c342a0
009ed824	adrp x0,0x2bb000
009ed828	adrp x2,0x2b5000
009ed82c	add x0,x0,#0x95a
009ed830	add x2,x2,#0xa37
009ed834	mov w1,#0x11e
009ed838	bl 0x00c342b0
009ed83c	mov w1,#0x100
009ed840	mov w0,#0xd
009ed844	movk w1,#0xc, LSL #16
009ed848	mov x2,xzr
009ed84c	bl 0x00c342c0
009ed850	b 0x009ed880
009ed854	mov w19,#0xffffffff
009ed858	adrp x1,0x2bb000
009ed85c	add x1,x1,#0x95a
009ed860	mov w2,#0x124
009ed864	mov x0,x21
009ed868	bl 0x00c32310
009ed86c	tbnz w19,#0x1f,0x009ed880
009ed870	add w8,w19,#0x1
009ed874	tbnz w8,#0x1f,0x009ed880
009ed878	add w22,w8,w25
009ed87c	b 0x009ed884
009ed880	mov w22,#0xffffffff
009ed884	mov w0,w22
009ed888	ldp x29,x30,[sp, #0x70]
009ed88c	ldp x20,x19,[sp, #0x60]
009ed890	ldp x22,x21,[sp, #0x50]
009ed894	ldp x24,x23,[sp, #0x40]
009ed898	ldp x26,x25,[sp, #0x30]
009ed89c	add sp,sp,#0x80
009ed8a0	ret
