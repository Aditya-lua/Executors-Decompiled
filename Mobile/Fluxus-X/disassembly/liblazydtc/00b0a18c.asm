; X509_LOOKUP_new @ 00b0a18c
00b0a18c	stp x20,x19,[sp, #-0x20]!
00b0a190	adrp x1,0x2aa000
00b0a194	mov x20,x0
00b0a198	add x1,x1,#0xba3
00b0a19c	mov w0,#0x20
00b0a1a0	mov w2,#0x14
00b0a1a4	stp x29,x30,[sp, #0x10]
00b0a1a8	add x29,sp,#0x10
00b0a1ac	bl 0x00c34250
00b0a1b0	mov x19,x0
00b0a1b4	cbz x0,0x00b0a1ec
00b0a1b8	str x20,[x19, #0x8]
00b0a1bc	ldr x8,[x20, #0x8]
00b0a1c0	cbz x8,0x00b0a21c
00b0a1c4	mov x0,x19
00b0a1c8	blr x8
00b0a1cc	cbnz w0,0x00b0a21c
00b0a1d0	adrp x1,0x2aa000
00b0a1d4	add x1,x1,#0xba3
00b0a1d8	mov w2,#0x1d
00b0a1dc	mov x0,x19
00b0a1e0	bl 0x00c32310
00b0a1e4	mov x19,xzr
00b0a1e8	b 0x00b0a21c
00b0a1ec	bl 0x00c342a0
00b0a1f0	adrp x0,0x2aa000
00b0a1f4	adrp x2,0x2da000
00b0a1f8	add x0,x0,#0xba3
00b0a1fc	add x2,x2,#0x7c2
00b0a200	mov w1,#0x17
00b0a204	bl 0x00c342b0
00b0a208	mov w1,#0x100
00b0a20c	mov w0,#0xb
00b0a210	movk w1,#0xc, LSL #16
00b0a214	mov x2,xzr
00b0a218	bl 0x00c342c0
00b0a21c	ldp x29,x30,[sp, #0x10]
00b0a220	mov x0,x19
00b0a224	ldp x20,x19,[sp], #0x20
00b0a228	ret
