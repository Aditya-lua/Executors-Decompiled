; ossl_provider_activate @ 00aa35fc
00aa35fc	str x21,[sp, #-0x30]!
00aa3600	stp x20,x19,[sp, #0x10]
00aa3604	stp x29,x30,[sp, #0x20]
00aa3608	add x29,sp,#0x20
00aa360c	cbz x0,0x00aa3704
00aa3610	mov w8,w1
00aa3614	mov x19,x0
00aa3618	cbz w2,0x00aa3624
00aa361c	ldrb w9,[x19, #0xc8]
00aa3620	tbz w9,#0x0,0x00aa36c0
00aa3624	mov w1,#0x1
00aa3628	mov x0,x19
00aa362c	mov w2,w8
00aa3630	bl 0x00aa3714
00aa3634	cmp w0,#0x1
00aa3638	b.lt 0x00aa36c8
00aa363c	b.ne 0x00aa36c0
00aa3640	ldr x0,[x19, #0x50]
00aa3644	adrp x2,0xc6d000
00aa3648	add x2,x2,#0x4c8
00aa364c	mov w1,#0x1
00aa3650	bl 0x00c3b520
00aa3654	cbz x0,0x00aa36d0
00aa3658	mov x20,x0
00aa365c	ldr x0,[x0, #0x20]
00aa3660	bl 0x00c35680
00aa3664	cbz w0,0x00aa3704
00aa3668	ldr x0,[x20, #0x20]
00aa366c	ldrb w21,[x20, #0x48]
00aa3670	bl 0x00c35690
00aa3674	tbnz w21,#0x1,0x00aa36c0
00aa3678	ldr x0,[x19, #0x50]
00aa367c	bl 0x00c3cdc0
00aa3680	ldr x8,[x19, #0x50]
00aa3684	mov w20,w0
00aa3688	mov x0,x8
00aa368c	bl 0x00c3b940
00aa3690	ldr x8,[x19, #0x50]
00aa3694	add w20,w0,w20
00aa3698	mov x0,x8
00aa369c	bl 0x00c3b500
00aa36a0	ldr x8,[x19, #0x50]
00aa36a4	add w19,w20,w0
00aa36a8	mov x0,x8
00aa36ac	bl 0x00c3ec10
00aa36b0	add w8,w19,w0
00aa36b4	cmp w8,#0x4
00aa36b8	cset w0,eq
00aa36bc	b 0x00aa3704
00aa36c0	mov w0,#0x1
00aa36c4	b 0x00aa3704
00aa36c8	mov w0,wzr
00aa36cc	b 0x00aa3704
00aa36d0	bl 0x00c342a0
00aa36d4	adrp x0,0x2aa000
00aa36d8	adrp x2,0x2bb000
00aa36dc	add x0,x0,#0x4b5
00aa36e0	add x2,x2,#0xf7d
00aa36e4	mov w1,#0x156
00aa36e8	bl 0x00c342b0
00aa36ec	mov w1,#0x103
00aa36f0	orr w0,wzr,#0xf
00aa36f4	movk w1,#0xc, LSL #16
00aa36f8	mov x2,xzr
00aa36fc	bl 0x00c342c0
00aa3700	mov w0,wzr
00aa3704	ldp x29,x30,[sp, #0x20]
00aa3708	ldp x20,x19,[sp, #0x10]
00aa370c	ldr x21,[sp], #0x30
00aa3710	ret
