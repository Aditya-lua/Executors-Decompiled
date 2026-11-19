; tls_construct_stoc_cryptopro_bug @ 009d9f8c
009d9f8c	sub sp,sp,#0x50
009d9f90	adrp x8,0x74d000
009d9f94	add x8,x8,#0x12
009d9f98	ldp q1,q0,[x8]
009d9f9c	mov w8,#0x203
009d9fa0	movk w8,#0x1702, LSL #16
009d9fa4	stp x20,x19,[sp, #0x30]
009d9fa8	stp x29,x30,[sp, #0x40]
009d9fac	str w8,[sp, #0x20]
009d9fb0	stp q1,q0,[sp]
009d9fb4	ldr x8,[x0, #0x2e0]
009d9fb8	add x29,sp,#0x40
009d9fbc	ldr w8,[x8, #0x18]
009d9fc0	and w8,w8,#0xfffe
009d9fc4	cmp w8,#0x80
009d9fc8	b.ne 0x009d9fdc
009d9fcc	mov x19,x0
009d9fd0	mov x20,x1
009d9fd4	bl 0x00c342f0
009d9fd8	tbnz w0,#0x1f,0x009d9ff0
009d9fdc	mov w0,#0x2
009d9fe0	ldp x29,x30,[sp, #0x40]
009d9fe4	ldp x20,x19,[sp, #0x30]
009d9fe8	add sp,sp,#0x50
009d9fec	ret
009d9ff0	mov x1,sp
009d9ff4	mov w2,#0x24
009d9ff8	mov x0,x20
009d9ffc	bl 0x00c34390
009da000	cbz w0,0x009da00c
009da004	mov w0,#0x1
009da008	b 0x009d9fe0
009da00c	bl 0x00c342a0
009da010	adrp x0,0x2d7000
009da014	adrp x2,0x2a3000
009da018	add x0,x0,#0xae0
009da01c	add x2,x2,#0xd55
009da020	mov w1,#0x746
009da024	bl 0x00c342b0
009da028	mov w2,#0x103
009da02c	mov w1,#0x50
009da030	movk w2,#0xc, LSL #16
009da034	mov x0,x19
009da038	mov x3,xzr
009da03c	bl 0x00c34410
009da040	mov w0,wzr
009da044	b 0x009d9fe0
