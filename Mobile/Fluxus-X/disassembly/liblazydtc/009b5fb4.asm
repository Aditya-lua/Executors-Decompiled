; SSL_CTX_set_alpn_protos @ 009b5fb4
009b5fb4	str x21,[sp, #-0x30]!
009b5fb8	stp x20,x19,[sp, #0x10]
009b5fbc	mov x19,x0
009b5fc0	stp x29,x30,[sp, #0x20]
009b5fc4	add x29,sp,#0x20
009b5fc8	cbz x1,0x009b6040
009b5fcc	cbz w2,0x009b6040
009b5fd0	cmp w2,#0x2
009b5fd4	b.cc 0x009b6094
009b5fd8	mov w8,wzr
009b5fdc	ldrb w9,[x1, w8, UXTW ]
009b5fe0	cbz w9,0x009b6094
009b5fe4	add w8,w8,w9
009b5fe8	add w8,w8,#0x1
009b5fec	cmp w8,w2
009b5ff0	b.cc 0x009b5fdc
009b5ff4	b.ne 0x009b6094
009b5ff8	mov w20,w2
009b5ffc	adrp x2,0x2c5000
009b6000	add x2,x2,#0x652
009b6004	mov w3,#0xc06
009b6008	mov x0,x1
009b600c	mov x1,x20
009b6010	bl 0x00c345f0
009b6014	cbz x0,0x009b6064
009b6018	mov x21,x0
009b601c	ldr x0,[x19, #0x2a8]
009b6020	adrp x1,0x2c5000
009b6024	add x1,x1,#0x652
009b6028	mov w2,#0xc0b
009b602c	bl 0x00c32310
009b6030	mov w0,wzr
009b6034	str x21,[x19, #0x2a8]
009b6038	str x20,[x19, #0x2b0]
009b603c	b 0x009b6098
009b6040	ldr x0,[x19, #0x2a8]
009b6044	adrp x1,0x2c5000
009b6048	add x1,x1,#0x652
009b604c	mov w2,#0xbfd
009b6050	bl 0x00c32310
009b6054	mov w0,wzr
009b6058	str xzr,[x19, #0x2b0]
009b605c	str xzr,[x19, #0x2a8]
009b6060	b 0x009b6098
009b6064	bl 0x00c342a0
009b6068	adrp x0,0x2c5000
009b606c	adrp x2,0x2a3000
009b6070	add x0,x0,#0x652
009b6074	add x2,x2,#0xbe0
009b6078	mov w1,#0xc08
009b607c	bl 0x00c342b0
009b6080	mov w1,#0x100
009b6084	mov w0,#0x14
009b6088	movk w1,#0xc, LSL #16
009b608c	mov x2,xzr
009b6090	bl 0x00c342c0
009b6094	mov w0,#0x1
009b6098	ldp x29,x30,[sp, #0x20]
009b609c	ldp x20,x19,[sp, #0x10]
009b60a0	ldr x21,[sp], #0x30
009b60a4	ret
