; BIO_get_host_ip @ 009ff11c
009ff11c	sub sp,sp,#0x30
009ff120	stp x20,x19,[sp, #0x10]
009ff124	mov x19,x1
009ff128	mov w3,#0x2
009ff12c	mov w4,#0x1
009ff130	add x5,sp,#0x8
009ff134	mov x1,xzr
009ff138	mov w2,wzr
009ff13c	stp x29,x30,[sp, #0x20]
009ff140	add x29,sp,#0x20
009ff144	mov x20,x0
009ff148	str xzr,[sp, #0x8]
009ff14c	bl 0x00c38590
009ff150	cbz w0,0x009ff1a8
009ff154	ldr x0,[sp, #0x8]
009ff158	bl 0x00c384c0
009ff15c	cmp w0,#0x2
009ff160	b.ne 0x009ff1c4
009ff164	ldr x0,[sp, #0x8]
009ff168	bl 0x00c384b0
009ff16c	mov x2,sp
009ff170	mov x1,xzr
009ff174	bl 0x00c38530
009ff178	cbz w0,0x009ff1f0
009ff17c	ldr x8,[sp]
009ff180	mov w20,wzr
009ff184	cmp x8,#0x4
009ff188	b.ne 0x009ff1f4
009ff18c	ldr x0,[sp, #0x8]
009ff190	bl 0x00c384b0
009ff194	mov x2,sp
009ff198	mov x1,x19
009ff19c	bl 0x00c38530
009ff1a0	mov w20,w0
009ff1a4	b 0x009ff1f4
009ff1a8	adrp x1,0x2d3000
009ff1ac	add x1,x1,#0x8ff
009ff1b0	mov w0,#0x2
009ff1b4	mov x2,x20
009ff1b8	bl 0x00c37fb0
009ff1bc	mov w20,wzr
009ff1c0	b 0x009ff1fc
009ff1c4	bl 0x00c342a0
009ff1c8	adrp x0,0x2c3000
009ff1cc	adrp x2,0x2b2000
009ff1d0	add x0,x0,#0x72e
009ff1d4	add x2,x2,#0x75
009ff1d8	mov w1,#0x3a
009ff1dc	bl 0x00c342b0
009ff1e0	mov w0,#0x20
009ff1e4	mov w1,#0x6b
009ff1e8	mov x2,xzr
009ff1ec	bl 0x00c342c0
009ff1f0	mov w20,wzr
009ff1f4	ldr x0,[sp, #0x8]
009ff1f8	bl 0x00c384d0
009ff1fc	mov w0,w20
009ff200	ldp x29,x30,[sp, #0x20]
009ff204	ldp x20,x19,[sp, #0x10]
009ff208	add sp,sp,#0x30
009ff20c	ret
