; PKCS7_add_recipient_info @ 00ac382c
00ac382c	stp x20,x19,[sp, #-0x20]!
00ac3830	stp x29,x30,[sp, #0x10]
00ac3834	mov x20,x0
00ac3838	ldr x0,[x0, #0x18]
00ac383c	add x29,sp,#0x10
00ac3840	mov x19,x1
00ac3844	bl 0x00c37750
00ac3848	cmp w0,#0x17
00ac384c	b.eq 0x00ac3864
00ac3850	cmp w0,#0x18
00ac3854	b.ne 0x00ac3884
00ac3858	ldr x8,[x20, #0x20]
00ac385c	add x8,x8,#0x30
00ac3860	b 0x00ac386c
00ac3864	ldr x8,[x20, #0x20]
00ac3868	add x8,x8,#0x8
00ac386c	ldr x0,[x8]
00ac3870	mov x1,x19
00ac3874	bl 0x00c347a0
00ac3878	cmp w0,#0x0
00ac387c	cset w0,ne
00ac3880	b 0x00ac38b4
00ac3884	bl 0x00c342a0
00ac3888	adrp x0,0x2ce000
00ac388c	adrp x2,0x2ce000
00ac3890	add x0,x0,#0x1ca
00ac3894	add x2,x2,#0x1e1
00ac3898	mov w1,#0x254
00ac389c	bl 0x00c342b0
00ac38a0	mov w0,#0x21
00ac38a4	mov w1,#0x71
00ac38a8	mov x2,xzr
00ac38ac	bl 0x00c342c0
00ac38b0	mov w0,wzr
00ac38b4	ldp x29,x30,[sp, #0x10]
00ac38b8	ldp x20,x19,[sp], #0x20
00ac38bc	ret
