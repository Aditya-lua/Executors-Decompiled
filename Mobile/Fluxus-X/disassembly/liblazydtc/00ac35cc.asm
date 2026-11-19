; PKCS7_add_recipient @ 00ac35cc
00ac35cc	str x21,[sp, #-0x30]!
00ac35d0	stp x20,x19,[sp, #0x10]
00ac35d4	stp x29,x30,[sp, #0x20]
00ac35d8	add x29,sp,#0x20
00ac35dc	mov x21,x1
00ac35e0	mov x20,x0
00ac35e4	bl 0x00c3f690
00ac35e8	mov x19,x0
00ac35ec	cbz x0,0x00ac3678
00ac35f0	mov x0,x19
00ac35f4	mov x1,x21
00ac35f8	bl 0x00ac3698
00ac35fc	cmp w0,#0x1
00ac3600	b.lt 0x00ac3678
00ac3604	ldr x0,[x20, #0x18]
00ac3608	bl 0x00c37750
00ac360c	cmp w0,#0x17
00ac3610	b.eq 0x00ac3628
00ac3614	cmp w0,#0x18
00ac3618	b.ne 0x00ac364c
00ac361c	ldr x8,[x20, #0x20]
00ac3620	add x8,x8,#0x30
00ac3624	b 0x00ac3630
00ac3628	ldr x8,[x20, #0x20]
00ac362c	add x8,x8,#0x8
00ac3630	ldr x0,[x8]
00ac3634	mov x1,x19
00ac3638	bl 0x00c347a0
00ac363c	cbz w0,0x00ac3678
00ac3640	add x8,x20,#0x28
00ac3644	str x8,[x19, #0x28]
00ac3648	b 0x00ac3684
00ac364c	bl 0x00c342a0
00ac3650	adrp x0,0x2ce000
00ac3654	adrp x2,0x2ce000
00ac3658	add x0,x0,#0x1ca
00ac365c	add x2,x2,#0x1e1
00ac3660	mov w1,#0x254
00ac3664	bl 0x00c342b0
00ac3668	mov w0,#0x21
00ac366c	mov w1,#0x71
00ac3670	mov x2,xzr
00ac3674	bl 0x00c342c0
00ac3678	mov x0,x19
00ac367c	bl 0x00c3f680
00ac3680	mov x19,xzr
00ac3684	mov x0,x19
00ac3688	ldp x29,x30,[sp, #0x20]
00ac368c	ldp x20,x19,[sp, #0x10]
00ac3690	ldr x21,[sp], #0x30
00ac3694	ret
