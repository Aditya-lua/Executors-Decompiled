; mbedtls_aria_crypt_ctr @ 00b70fc0
00b70fc0	stp x26,x25,[sp, #-0x50]!
00b70fc4	stp x24,x23,[sp, #0x10]
00b70fc8	stp x22,x21,[sp, #0x20]
00b70fcc	stp x20,x19,[sp, #0x30]
00b70fd0	stp x29,x30,[sp, #0x40]
00b70fd4	add x29,sp,#0x40
00b70fd8	ldr x26,[x2]
00b70fdc	mov x20,x6
00b70fe0	mov x21,x5
00b70fe4	mov x22,x4
00b70fe8	mov x23,x3
00b70fec	mov x19,x2
00b70ff0	mov x24,x1
00b70ff4	cmp x26,#0xf
00b70ff8	mov x25,x0
00b70ffc	b.ls 0x00b71008
00b71000	mov w0,#0xffffffa4
00b71004	b 0x00b7106c
00b71008	cbz x24,0x00b71064
00b7100c	sub x24,x24,#0x1
00b71010	cbnz x26,0x00b71048
00b71014	mov x0,x25
00b71018	mov x1,x23
00b7101c	mov x2,x22
00b71020	bl 0x00c419e0
00b71024	orr w8,wzr,#0xf
00b71028	cmn x8,#0x1
00b7102c	b.eq 0x00b71048
00b71030	ldrb w9,[x23, x8]
00b71034	add w9,w9,#0x1
00b71038	and w10,w9,#0xff
00b7103c	strb w9,[x23, x8]
00b71040	sub x8,x8,#0x1
00b71044	cbz w10,0x00b71028
00b71048	ldrb w8,[x21], #0x1
00b7104c	ldrb w9,[x22, x26]
00b71050	add w10,w26,#0x1
00b71054	and x26,x10,#0xf
00b71058	eor w8,w9,w8
00b7105c	strb w8,[x20], #0x1
00b71060	cbnz x24,0x00b7100c
00b71064	mov w0,wzr
00b71068	str x26,[x19]
00b7106c	ldp x29,x30,[sp, #0x40]
00b71070	ldp x20,x19,[sp, #0x30]
00b71074	ldp x22,x21,[sp, #0x20]
00b71078	ldp x24,x23,[sp, #0x10]
00b7107c	ldp x26,x25,[sp], #0x50
00b71080	ret
