; mbedtls_camellia_crypt_ctr @ 00b72974
00b72974	stp x26,x25,[sp, #-0x50]!
00b72978	stp x24,x23,[sp, #0x10]
00b7297c	stp x22,x21,[sp, #0x20]
00b72980	stp x20,x19,[sp, #0x30]
00b72984	stp x29,x30,[sp, #0x40]
00b72988	add x29,sp,#0x40
00b7298c	ldr x26,[x2]
00b72990	mov x20,x6
00b72994	mov x21,x5
00b72998	mov x22,x4
00b7299c	mov x23,x3
00b729a0	mov x19,x2
00b729a4	mov x24,x1
00b729a8	cmp x26,#0xf
00b729ac	mov x25,x0
00b729b0	b.ls 0x00b729bc
00b729b4	mov w0,#0xffffffdc
00b729b8	b 0x00b72a24
00b729bc	cbz x24,0x00b72a1c
00b729c0	sub x24,x24,#0x1
00b729c4	cbnz x26,0x00b72a00
00b729c8	mov w1,#0x1
00b729cc	mov x0,x25
00b729d0	mov x2,x23
00b729d4	mov x3,x22
00b729d8	bl 0x00c41f80
00b729dc	orr w8,wzr,#0xf
00b729e0	cmn x8,#0x1
00b729e4	b.eq 0x00b72a00
00b729e8	ldrb w9,[x23, x8]
00b729ec	add w9,w9,#0x1
00b729f0	and w10,w9,#0xff
00b729f4	strb w9,[x23, x8]
00b729f8	sub x8,x8,#0x1
00b729fc	cbz w10,0x00b729e0
00b72a00	ldrb w8,[x21], #0x1
00b72a04	ldrb w9,[x22, x26]
00b72a08	add w10,w26,#0x1
00b72a0c	and x26,x10,#0xf
00b72a10	eor w8,w9,w8
00b72a14	strb w8,[x20], #0x1
00b72a18	cbnz x24,0x00b729c0
00b72a1c	mov w0,wzr
00b72a20	str x26,[x19]
00b72a24	ldp x29,x30,[sp, #0x40]
00b72a28	ldp x20,x19,[sp, #0x30]
00b72a2c	ldp x22,x21,[sp, #0x20]
00b72a30	ldp x24,x23,[sp, #0x10]
00b72a34	ldp x26,x25,[sp], #0x50
00b72a38	ret
