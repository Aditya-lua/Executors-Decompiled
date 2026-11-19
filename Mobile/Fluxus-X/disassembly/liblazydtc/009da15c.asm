; tls_construct_stoc_psk @ 009da15c
009da15c	stp x20,x19,[sp, #-0x20]!
009da160	stp x29,x30,[sp, #0x10]
009da164	ldr w8,[x0, #0x4d0]
009da168	add x29,sp,#0x10
009da16c	cbz w8,0x009da200
009da170	mov x20,x1
009da174	mov x19,x0
009da178	mov w1,#0x29
009da17c	mov w2,#0x2
009da180	mov x0,x20
009da184	bl 0x00c343a0
009da188	cbz w0,0x009da1c4
009da18c	mov w1,#0x2
009da190	mov x0,x20
009da194	bl 0x00c343b0
009da198	cbz w0,0x009da1c4
009da19c	ldrsw x1,[x19, #0xb50]
009da1a0	mov w2,#0x2
009da1a4	mov x0,x20
009da1a8	bl 0x00c343a0
009da1ac	cbz w0,0x009da1c4
009da1b0	mov x0,x20
009da1b4	bl 0x00c34350
009da1b8	cbz w0,0x009da1c4
009da1bc	mov w0,#0x1
009da1c0	b 0x009da204
009da1c4	bl 0x00c342a0
009da1c8	adrp x0,0x2d7000
009da1cc	adrp x2,0x2a7000
009da1d0	add x0,x0,#0xae0
009da1d4	add x2,x2,#0xc28
009da1d8	mov w1,#0x777
009da1dc	bl 0x00c342b0
009da1e0	mov w2,#0x103
009da1e4	mov w1,#0x50
009da1e8	movk w2,#0xc, LSL #16
009da1ec	mov x0,x19
009da1f0	mov x3,xzr
009da1f4	bl 0x00c34410
009da1f8	mov w0,wzr
009da1fc	b 0x009da204
009da200	mov w0,#0x2
009da204	ldp x29,x30,[sp, #0x10]
009da208	ldp x20,x19,[sp], #0x20
009da20c	ret
