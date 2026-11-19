; BIO_socket @ 009ff918
009ff918	str x21,[sp, #-0x30]!
009ff91c	stp x20,x19,[sp, #0x10]
009ff920	stp x29,x30,[sp, #0x20]
009ff924	add x29,sp,#0x20
009ff928	mov w19,w2
009ff92c	mov w20,w1
009ff930	mov w21,w0
009ff934	bl 0x00c385b0
009ff938	cmp w0,#0x1
009ff93c	b.ne 0x009ff9b8
009ff940	mov w0,w21
009ff944	mov w1,w20
009ff948	mov w2,w19
009ff94c	bl 0x00c31c70
009ff950	cmn w0,#0x1
009ff954	b.ne 0x009ff9bc
009ff958	bl 0x00c342a0
009ff95c	adrp x19,0x2c5000
009ff960	adrp x20,0x2db000
009ff964	add x19,x19,#0x7d7
009ff968	add x20,x20,#0xde0
009ff96c	mov w1,#0x32
009ff970	mov x0,x19
009ff974	mov x2,x20
009ff978	bl 0x00c342b0
009ff97c	bl 0x00c30710
009ff980	ldr w1,[x0]
009ff984	adrp x2,0x2cd000
009ff988	add x2,x2,#0x892
009ff98c	mov w0,#0x2
009ff990	bl 0x00c342c0
009ff994	bl 0x00c342a0
009ff998	mov w1,#0x34
009ff99c	mov x0,x19
009ff9a0	mov x2,x20
009ff9a4	bl 0x00c342b0
009ff9a8	mov w0,#0x20
009ff9ac	mov w1,#0x76
009ff9b0	mov x2,xzr
009ff9b4	bl 0x00c342c0
009ff9b8	mov w0,#0xffffffff
009ff9bc	ldp x29,x30,[sp, #0x20]
009ff9c0	ldp x20,x19,[sp, #0x10]
009ff9c4	ldr x21,[sp], #0x30
009ff9c8	ret
