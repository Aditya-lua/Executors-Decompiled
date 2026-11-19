; tls_construct_client_certificate @ 009dc4a4
009dc4a4	stp x20,x19,[sp, #-0x20]!
009dc4a8	stp x29,x30,[sp, #0x10]
009dc4ac	ldr x8,[x0, #0x8]
009dc4b0	mov x19,x0
009dc4b4	mov x20,x1
009dc4b8	add x29,sp,#0x10
009dc4bc	ldr x9,[x8, #0xc0]
009dc4c0	ldrb w9,[x9, #0x60]
009dc4c4	tbnz w9,#0x3,0x009dc524
009dc4c8	ldr w8,[x8]
009dc4cc	cmp w8,#0x304
009dc4d0	b.lt 0x009dc524
009dc4d4	cmp w8,#0x10, LSL #12
009dc4d8	b.eq 0x009dc524
009dc4dc	ldr x1,[x19, #0xbb0]
009dc4e0	cbz x1,0x009dc514
009dc4e4	ldr x2,[x19, #0xbb8]
009dc4e8	mov w3,#0x1
009dc4ec	mov x0,x20
009dc4f0	bl 0x00c36f70
009dc4f4	cbnz w0,0x009dc524
009dc4f8	bl 0x00c342a0
009dc4fc	adrp x0,0x2d7000
009dc500	adrp x2,0x2bd000
009dc504	add x0,x0,#0xb1a
009dc508	add x2,x2,#0x6f9
009dc50c	mov w1,#0xdb8
009dc510	b 0x009dc5b8
009dc514	mov w2,#0x1
009dc518	mov x0,x20
009dc51c	bl 0x00c343a0
009dc520	cbz w0,0x009dc5a0
009dc524	ldr w8,[x19, #0x2f0]
009dc528	mov x2,xzr
009dc52c	cmp w8,#0x2
009dc530	b.eq 0x009dc53c
009dc534	ldr x8,[x19, #0x898]
009dc538	ldr x2,[x8]
009dc53c	mov x0,x19
009dc540	mov x1,x20
009dc544	bl 0x00c37170
009dc548	cbz x0,0x009dc600
009dc54c	ldr x9,[x19, #0x8]
009dc550	ldr x8,[x9, #0xc0]
009dc554	ldrb w10,[x8, #0x60]
009dc558	tbnz w10,#0x3,0x009dc598
009dc55c	ldr w9,[x9]
009dc560	mov w0,#0x1
009dc564	cmp w9,#0x304
009dc568	b.lt 0x009dc600
009dc56c	cmp w9,#0x10, LSL #12
009dc570	b.eq 0x009dc600
009dc574	ldr x9,[x19, #0x240]
009dc578	cbz x9,0x009dc584
009dc57c	ldr x9,[x19, #0x2c8]
009dc580	cbnz x9,0x009dc598
009dc584	ldr x8,[x8, #0x20]
009dc588	mov w1,#0x92
009dc58c	mov x0,x19
009dc590	blr x8
009dc594	cbz w0,0x009dc5cc
009dc598	mov w0,#0x1
009dc59c	b 0x009dc600
009dc5a0	bl 0x00c342a0
009dc5a4	adrp x0,0x2d7000
009dc5a8	adrp x2,0x2bd000
009dc5ac	add x0,x0,#0xb1a
009dc5b0	add x2,x2,#0x6f9
009dc5b4	mov w1,#0xdb4
009dc5b8	bl 0x00c342b0
009dc5bc	mov w2,#0x103
009dc5c0	mov w1,#0x50
009dc5c4	movk w2,#0xc, LSL #16
009dc5c8	b 0x009dc5f0
009dc5cc	bl 0x00c342a0
009dc5d0	adrp x0,0x2d7000
009dc5d4	adrp x2,0x2bd000
009dc5d8	add x0,x0,#0xb1a
009dc5dc	add x2,x2,#0x6f9
009dc5e0	mov w1,#0xdcb
009dc5e4	bl 0x00c342b0
009dc5e8	mov w1,#0xffffffff
009dc5ec	mov w2,#0x6d
009dc5f0	mov x0,x19
009dc5f4	mov x3,xzr
009dc5f8	bl 0x00c34410
009dc5fc	mov w0,wzr
009dc600	ldp x29,x30,[sp, #0x10]
009dc604	ldp x20,x19,[sp], #0x20
009dc608	ret
