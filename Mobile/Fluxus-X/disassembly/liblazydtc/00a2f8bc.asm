; ossl_ec_key_simple_priv2oct @ 00a2f8bc
00a2f8bc	str x21,[sp, #-0x30]!
00a2f8c0	stp x20,x19,[sp, #0x10]
00a2f8c4	stp x29,x30,[sp, #0x20]
00a2f8c8	mov x21,x0
00a2f8cc	ldr x0,[x0, #0x18]
00a2f8d0	add x29,sp,#0x20
00a2f8d4	mov x20,x2
00a2f8d8	mov x19,x1
00a2f8dc	bl 0x00c3a790
00a2f8e0	mov w8,w0
00a2f8e4	ldr x0,[x21, #0x28]
00a2f8e8	add w9,w8,#0x7
00a2f8ec	add w8,w8,#0xe
00a2f8f0	cmp w9,#0x0
00a2f8f4	csel w8,w8,w9,lt
00a2f8f8	cbz x0,0x00a2f954
00a2f8fc	sbfx x21,x8,#0x3,#0x1d
00a2f900	cbz x19,0x00a2f95c
00a2f904	cmp x21,x20
00a2f908	mov x1,xzr
00a2f90c	b.hi 0x00a2f960
00a2f910	mov x1,x19
00a2f914	mov w2,w21
00a2f918	bl 0x00c38c70
00a2f91c	cmn w0,#0x1
00a2f920	mov x1,x21
00a2f924	b.ne 0x00a2f960
00a2f928	bl 0x00c342a0
00a2f92c	adrp x0,0x2b4000
00a2f930	adrp x2,0x2d3000
00a2f934	add x0,x0,#0x15e
00a2f938	add x2,x2,#0x9f7
00a2f93c	mov w1,#0x3a0
00a2f940	bl 0x00c342b0
00a2f944	mov w0,#0x10
00a2f948	mov w1,#0x64
00a2f94c	mov x2,xzr
00a2f950	bl 0x00c342c0
00a2f954	mov x1,xzr
00a2f958	b 0x00a2f960
00a2f95c	mov x1,x21
00a2f960	ldp x29,x30,[sp, #0x20]
00a2f964	ldp x20,x19,[sp, #0x10]
00a2f968	mov x0,x1
00a2f96c	ldr x21,[sp], #0x30
00a2f970	ret
