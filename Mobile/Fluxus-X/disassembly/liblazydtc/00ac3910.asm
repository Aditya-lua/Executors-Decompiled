; PKCS7_set_cipher @ 00ac3910
00ac3910	str x21,[sp, #-0x30]!
00ac3914	stp x20,x19,[sp, #0x10]
00ac3918	stp x29,x30,[sp, #0x20]
00ac391c	mov x19,x0
00ac3920	ldr x0,[x0, #0x18]
00ac3924	add x29,sp,#0x20
00ac3928	mov x20,x1
00ac392c	bl 0x00c37750
00ac3930	cmp w0,#0x17
00ac3934	b.eq 0x00ac394c
00ac3938	cmp w0,#0x18
00ac393c	b.ne 0x00ac3974
00ac3940	ldr x8,[x19, #0x20]
00ac3944	add x8,x8,#0x28
00ac3948	b 0x00ac3954
00ac394c	ldr x8,[x19, #0x20]
00ac3950	add x8,x8,#0x10
00ac3954	ldr x21,[x8]
00ac3958	mov x0,x20
00ac395c	bl 0x00c3cf00
00ac3960	cbz w0,0x00ac399c
00ac3964	add x8,x19,#0x28
00ac3968	mov w0,#0x1
00ac396c	stp x20,x8,[x21, #0x18]
00ac3970	b 0x00ac39cc
00ac3974	bl 0x00c342a0
00ac3978	adrp x0,0x2ce000
00ac397c	adrp x2,0x2ac000
00ac3980	add x0,x0,#0x1ca
00ac3984	add x2,x2,#0x71a
00ac3988	mov w1,#0x2b7
00ac398c	bl 0x00c342b0
00ac3990	mov w0,#0x21
00ac3994	mov w1,#0x71
00ac3998	b 0x00ac39c0
00ac399c	bl 0x00c342a0
00ac39a0	adrp x0,0x2ce000
00ac39a4	adrp x2,0x2ac000
00ac39a8	add x0,x0,#0x1ca
00ac39ac	add x2,x2,#0x71a
00ac39b0	mov w1,#0x2be
00ac39b4	bl 0x00c342b0
00ac39b8	mov w0,#0x21
00ac39bc	mov w1,#0x90
00ac39c0	mov x2,xzr
00ac39c4	bl 0x00c342c0
00ac39c8	mov w0,wzr
00ac39cc	ldp x29,x30,[sp, #0x20]
00ac39d0	ldp x20,x19,[sp, #0x10]
00ac39d4	ldr x21,[sp], #0x30
00ac39d8	ret
