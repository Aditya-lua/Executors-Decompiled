; ossl_ec_encoding_param2id @ 00a27724
00a27724	sub sp,sp,#0x30
00a27728	stp x20,x19,[sp, #0x10]
00a2772c	stp x29,x30,[sp, #0x20]
00a27730	str xzr,[sp, #0x8]
00a27734	ldr w8,[x0, #0x8]
00a27738	mov x19,x1
00a2773c	add x29,sp,#0x20
00a27740	cmp w8,#0x6
00a27744	b.eq 0x00a277a4
00a27748	cmp w8,#0x4
00a2774c	mov w8,wzr
00a27750	b.ne 0x00a277dc
00a27754	ldr x8,[x0, #0x10]
00a27758	cmp x8,#0x0
00a2775c	str x8,[sp, #0x8]
00a27760	cset w0,ne
00a27764	cbz w0,0x00a277b0
00a27768	ldr x20,[sp, #0x8]
00a2776c	cbz x20,0x00a277b8
00a27770	adrp x1,0x2bb000
00a27774	add x1,x1,#0xaaf
00a27778	mov x0,x20
00a2777c	bl 0x00c35ee0
00a27780	cbz w0,0x00a277c0
00a27784	adrp x1,0x2b7000
00a27788	add x1,x1,#0x776
00a2778c	mov x0,x20
00a27790	bl 0x00c35ee0
00a27794	mov w8,wzr
00a27798	cbnz w0,0x00a277dc
00a2779c	mov w8,#0x1
00a277a0	b 0x00a277c4
00a277a4	add x1,sp,#0x8
00a277a8	bl 0x00c3acf0
00a277ac	cbnz w0,0x00a27768
00a277b0	mov w8,wzr
00a277b4	b 0x00a277dc
00a277b8	mov w8,#0x1
00a277bc	b 0x00a277d4
00a277c0	mov x8,xzr
00a277c4	adrp x9,0xc5b000
00a277c8	lsl x8,x8,#0x4
00a277cc	add x9,x9,#0x3b8
00a277d0	ldr w8,[x9, x8#0x0]
00a277d4	str w8,[x19]
00a277d8	mov w8,#0x1
00a277dc	ldp x29,x30,[sp, #0x20]
00a277e0	ldp x20,x19,[sp, #0x10]
00a277e4	mov w0,w8
00a277e8	add sp,sp,#0x30
00a277ec	ret
