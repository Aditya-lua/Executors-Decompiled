; PKCS12_set_mac @ 00abc050
00abc050	sub sp,sp,#0x90
00abc054	stp x24,x23,[sp, #0x50]
00abc058	stp x22,x21,[sp, #0x60]
00abc05c	stp x20,x19,[sp, #0x70]
00abc060	mov w24,w5
00abc064	mov w22,w4
00abc068	mov x23,x3
00abc06c	mov w20,w2
00abc070	mov x21,x1
00abc074	mov x19,x0
00abc078	stp x29,x30,[sp, #0x80]
00abc07c	add x29,sp,#0x80
00abc080	cbnz x6,0x00abc08c
00abc084	bl 0x00c31fb0
00abc088	mov x6,x0
00abc08c	cmp w24,#0x0
00abc090	mov w8,#0x800
00abc094	csel w1,w8,w24,eq
00abc098	mov x0,x19
00abc09c	mov x2,x23
00abc0a0	mov w3,w22
00abc0a4	mov x4,x6
00abc0a8	bl 0x00abc194
00abc0ac	cbz w0,0x00abc0fc
00abc0b0	add x3,sp,#0x10
00abc0b4	add x4,sp,#0xc
00abc0b8	mov x0,x19
00abc0bc	mov x1,x21
00abc0c0	mov w2,w20
00abc0c4	bl 0x00abbc20
00abc0c8	cbz w0,0x00abc124
00abc0cc	ldr x8,[x19, #0x8]
00abc0d0	mov x2,sp
00abc0d4	mov x1,xzr
00abc0d8	ldr x0,[x8]
00abc0dc	bl 0x00c38310
00abc0e0	ldr x0,[sp]
00abc0e4	ldr w2,[sp, #0xc]
00abc0e8	add x1,sp,#0x10
00abc0ec	bl 0x00c377a0
00abc0f0	cbz w0,0x00abc14c
00abc0f4	mov w0,#0x1
00abc0f8	b 0x00abc17c
00abc0fc	bl 0x00c342a0
00abc100	adrp x0,0x2ca000
00abc104	adrp x2,0x2da000
00abc108	add x0,x0,#0x250
00abc10c	add x2,x2,#0x528
00abc110	mov w1,#0xdf
00abc114	bl 0x00c342b0
00abc118	mov w0,#0x23
00abc11c	mov w1,#0x6e
00abc120	b 0x00abc170
00abc124	bl 0x00c342a0
00abc128	adrp x0,0x2ca000
00abc12c	adrp x2,0x2da000
00abc130	add x0,x0,#0x250
00abc134	add x2,x2,#0x528
00abc138	mov w1,#0xe6
00abc13c	bl 0x00c342b0
00abc140	mov w0,#0x23
00abc144	mov w1,#0x6d
00abc148	b 0x00abc170
00abc14c	bl 0x00c342a0
00abc150	adrp x0,0x2ca000
00abc154	adrp x2,0x2da000
00abc158	add x0,x0,#0x250
00abc15c	add x2,x2,#0x528
00abc160	mov w1,#0xeb
00abc164	bl 0x00c342b0
00abc168	mov w0,#0x23
00abc16c	mov w1,#0x6f
00abc170	mov x2,xzr
00abc174	bl 0x00c342c0
00abc178	mov w0,wzr
00abc17c	ldp x29,x30,[sp, #0x80]
00abc180	ldp x20,x19,[sp, #0x70]
00abc184	ldp x22,x21,[sp, #0x60]
00abc188	ldp x24,x23,[sp, #0x50]
00abc18c	add sp,sp,#0x90
00abc190	ret
