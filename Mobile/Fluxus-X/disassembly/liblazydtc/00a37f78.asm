; ossl_ec_GFp_nist_field_sqr @ 00a37f78
00a37f78	str x23,[sp, #-0x40]!
00a37f7c	stp x22,x21,[sp, #0x10]
00a37f80	stp x20,x19,[sp, #0x20]
00a37f84	stp x29,x30,[sp, #0x30]
00a37f88	add x29,sp,#0x30
00a37f8c	cbz x0,0x00a37ffc
00a37f90	mov x20,x1
00a37f94	cbz x1,0x00a37ffc
00a37f98	mov x23,x2
00a37f9c	cbz x2,0x00a37ffc
00a37fa0	mov x21,x3
00a37fa4	mov x22,x0
00a37fa8	mov x19,xzr
00a37fac	cbnz x3,0x00a37fc4
00a37fb0	ldr x0,[x22, #0xa8]
00a37fb4	bl 0x00c38a60
00a37fb8	mov x21,x0
00a37fbc	mov x19,x0
00a37fc0	cbz x0,0x00a38034
00a37fc4	mov x0,x20
00a37fc8	mov x1,x23
00a37fcc	mov x2,x21
00a37fd0	bl 0x00c39090
00a37fd4	cbz w0,0x00a38034
00a37fd8	ldr x8,[x22, #0x88]
00a37fdc	ldr x2,[x22, #0x40]
00a37fe0	mov x0,x20
00a37fe4	mov x1,x20
00a37fe8	mov x3,x21
00a37fec	blr x8
00a37ff0	cmp w0,#0x0
00a37ff4	cset w20,ne
00a37ff8	b 0x00a38038
00a37ffc	bl 0x00c342a0
00a38000	adrp x0,0x2d3000
00a38004	adrp x2,0x2c5000
00a38008	add x0,x0,#0xa4b
00a3800c	add x2,x2,#0x99f
00a38010	mov w1,#0xa0
00a38014	bl 0x00c342b0
00a38018	mov w0,#0x10
00a3801c	mov w1,#0x86
00a38020	mov x2,xzr
00a38024	bl 0x00c342c0
00a38028	mov w20,wzr
00a3802c	mov x19,xzr
00a38030	b 0x00a38038
00a38034	mov w20,wzr
00a38038	mov x0,x19
00a3803c	bl 0x00c38a30
00a38040	mov w0,w20
00a38044	ldp x29,x30,[sp, #0x30]
00a38048	ldp x20,x19,[sp, #0x20]
00a3804c	ldp x22,x21,[sp, #0x10]
00a38050	ldr x23,[sp], #0x40
00a38054	ret
