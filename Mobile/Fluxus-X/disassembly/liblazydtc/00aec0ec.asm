; ossl_store_unregister_loader_int @ 00aec0ec
00aec0ec	sub sp,sp,#0x100
00aec0f0	stp x20,x19,[sp, #0xe0]
00aec0f4	mov x19,x0
00aec0f8	str x0,[sp]
00aec0fc	adrp x0,0xd22000
00aec100	adrp x1,0xaeb000
00aec104	add x0,x0,#0x308
00aec108	add x1,x1,#0xf60
00aec10c	str x21,[sp, #0xd0]
00aec110	stp x29,x30,[sp, #0xf0]
00aec114	add x29,sp,#0xf0
00aec118	str xzr,[sp, #0x10]
00aec11c	str xzr,[sp, #0x50]
00aec120	stp xzr,xzr,[sp, #0x38]
00aec124	bl 0x00c34d60
00aec128	cbz w0,0x00aec1b8
00aec12c	adrp x8,0xd22000
00aec130	ldr w8,[x8, #0x30c]
00aec134	cbz w8,0x00aec1b8
00aec138	adrp x21,0xd22000
00aec13c	ldr x0,[x21, #0x310]
00aec140	bl 0x00c356a0
00aec144	cbz w0,0x00aec1e8
00aec148	adrp x20,0xd22000
00aec14c	ldr x0,[x20, #0x318]
00aec150	cbnz x0,0x00aec170
00aec154	adrp x0,0xaec000
00aec158	adrp x1,0xaec000
00aec15c	add x0,x0,#0x2ec
00aec160	add x1,x1,#0x2f4
00aec164	bl 0x00c34dd0
00aec168	str x0,[x20, #0x318]
00aec16c	cbz x0,0x00aec1f0
00aec170	mov x1,sp
00aec174	bl 0x00c36010
00aec178	mov x20,x0
00aec17c	cbnz x0,0x00aec228
00aec180	bl 0x00c342a0
00aec184	adrp x0,0x2bc000
00aec188	adrp x2,0x2aa000
00aec18c	add x0,x0,#0x4ea
00aec190	add x2,x2,#0x9a9
00aec194	mov w1,#0x10b
00aec198	bl 0x00c342b0
00aec19c	adrp x2,0x2d4000
00aec1a0	add x2,x2,#0x441
00aec1a4	mov w0,#0x2c
00aec1a8	mov w1,#0x69
00aec1ac	mov x3,x19
00aec1b0	bl 0x00c342c0
00aec1b4	b 0x00aec228
00aec1b8	bl 0x00c342a0
00aec1bc	adrp x0,0x2bc000
00aec1c0	adrp x2,0x2aa000
00aec1c4	add x0,x0,#0x4ea
00aec1c8	add x2,x2,#0x9a9
00aec1cc	mov w1,#0x101
00aec1d0	bl 0x00c342b0
00aec1d4	mov w1,#0x100
00aec1d8	mov w0,#0x2c
00aec1dc	movk w1,#0xc, LSL #16
00aec1e0	mov x2,xzr
00aec1e4	bl 0x00c342c0
00aec1e8	mov x20,xzr
00aec1ec	b 0x00aec230
00aec1f0	bl 0x00c342a0
00aec1f4	adrp x0,0x2bc000
00aec1f8	adrp x2,0x2aa000
00aec1fc	add x0,x0,#0x4ea
00aec200	add x2,x2,#0x9a9
00aec204	mov w1,#0x108
00aec208	bl 0x00c342b0
00aec20c	mov w8,#0x100
00aec210	movk w8,#0xc, LSL #16
00aec214	add w1,w8,#0x3
00aec218	mov w0,#0x2c
00aec21c	mov x2,xzr
00aec220	bl 0x00c342c0
00aec224	mov x20,xzr
00aec228	ldr x0,[x21, #0x310]
00aec22c	bl 0x00c35690
00aec230	mov x0,x20
00aec234	ldp x29,x30,[sp, #0xf0]
00aec238	ldp x20,x19,[sp, #0xe0]
00aec23c	ldr x21,[sp, #0xd0]
00aec240	add sp,sp,#0x100
00aec244	ret
