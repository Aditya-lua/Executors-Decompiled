; EVP_PKEY_CTX_get0_ecdh_kdf_ukm @ 00a7afa0
00a7afa0	sub sp,sp,#0xa0
00a7afa4	str x19,[sp, #0x80]
00a7afa8	stp x29,x30,[sp, #0x90]
00a7afac	add x29,sp,#0x90
00a7afb0	cbz x0,0x00a7b04c
00a7afb4	ldr w8,[x0]
00a7afb8	mov x19,x0
00a7afbc	cmp w8,#0x800
00a7afc0	b.ne 0x00a7b04c
00a7afc4	ldr x8,[x19, #0x20]
00a7afc8	cbz x8,0x00a7b08c
00a7afcc	adrp x0,0x29e000
00a7afd0	add x0,x0,#0x10e
00a7afd4	add x8,sp,#0x8
00a7afd8	mov x2,xzr
00a7afdc	bl 0x00c36de0
00a7afe0	ldr x8,[sp, #0x28]
00a7afe4	ldur q0,[sp, #0x18]
00a7afe8	ldur q1,[sp, #0x8]
00a7afec	str x8,[sp, #0x50]
00a7aff0	add x8,sp,#0x8
00a7aff4	stp q1,q0,[sp, #0x30]
00a7aff8	bl 0x00c34c40
00a7affc	ldr x8,[sp, #0x28]
00a7b000	ldur q0,[sp, #0x18]
00a7b004	ldur q1,[sp, #0x8]
00a7b008	add x1,sp,#0x30
00a7b00c	mov x0,x19
00a7b010	str x8,[sp, #0x78]
00a7b014	stur q0,[sp, #0x68]
00a7b018	stur q1,[sp, #0x58]
00a7b01c	bl 0x00c3c110
00a7b020	cmp w0,#0x1
00a7b024	b.eq 0x00a7b0a8
00a7b028	cmn w0,#0x2
00a7b02c	b.ne 0x00a7b0a0
00a7b030	bl 0x00c342a0
00a7b034	adrp x0,0x2d9000
00a7b038	adrp x2,0x2c9000
00a7b03c	add x0,x0,#0xd63
00a7b040	add x2,x2,#0xa79
00a7b044	mov w1,#0x105
00a7b048	b 0x00a7b064
00a7b04c	bl 0x00c342a0
00a7b050	adrp x0,0x2d9000
00a7b054	adrp x2,0x2bd000
00a7b058	add x0,x0,#0xd63
00a7b05c	add x2,x2,#0xbcb
00a7b060	mov w1,#0x1b
00a7b064	bl 0x00c342b0
00a7b068	orr w0,wzr,#0x6
00a7b06c	mov w1,#0x93
00a7b070	mov x2,xzr
00a7b074	bl 0x00c342c0
00a7b078	orr w0,wzr,#0xfffffffe
00a7b07c	ldp x29,x30,[sp, #0x90]
00a7b080	ldr x19,[sp, #0x80]
00a7b084	add sp,sp,#0xa0
00a7b088	ret
00a7b08c	ldr x8,[x19, #0x78]
00a7b090	cbz x8,0x00a7afcc
00a7b094	ldr w8,[x8]
00a7b098	cmp w8,#0x198
00a7b09c	b.eq 0x00a7afcc
00a7b0a0	mov w0,#0xffffffff
00a7b0a4	b 0x00a7b07c
00a7b0a8	ldr x8,[sp, #0x50]
00a7b0ac	lsr x9,x8,#0x1f
00a7b0b0	cmp x9,#0x0
00a7b0b4	csinv w0,w8,wzr,eq
00a7b0b8	b 0x00a7b07c
