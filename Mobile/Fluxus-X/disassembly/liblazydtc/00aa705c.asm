; FUN_00aa705c @ 00aa705c
00aa705c	sub sp,sp,#0xe0
00aa7060	stp x26,x25,[sp, #0x90]
00aa7064	stp x24,x23,[sp, #0xa0]
00aa7068	stp x22,x21,[sp, #0xb0]
00aa706c	stp x20,x19,[sp, #0xc0]
00aa7070	stp x29,x30,[sp, #0xd0]
00aa7074	add x29,sp,#0xd0
00aa7078	cbz x2,0x00aa71a0
00aa707c	mov x22,x0
00aa7080	ldrb w9,[x22, #0xc]!
00aa7084	mov x19,x2
00aa7088	mov x20,x1
00aa708c	mov x21,x0
00aa7090	mov x23,x22
00aa7094	ldrb w8,[x23, #0x8]!
00aa7098	mov x24,xzr
00aa709c	add x10,x20,x24
00aa70a0	ldp w26,w25,[x10]
00aa70a4	and w9,w9,#0xffffff9f
00aa70a8	and w8,w8,#0xffffffbf
00aa70ac	orr w9,w9,#0x40
00aa70b0	orr w8,w8,#0x20
00aa70b4	mov x0,x22
00aa70b8	stp w26,w25,[x29, #-0x50]
00aa70bc	stp w26,w25,[x29, #-0x48]
00aa70c0	strb w9,[x21, #0xc]
00aa70c4	strb w8,[x21, #0x14]
00aa70c8	bl 0x00c320a0
00aa70cc	mov x1,sp
00aa70d0	mov x0,x22
00aa70d4	bl 0x00c32090
00aa70d8	sub x0,x29,#0x48
00aa70dc	mov x1,sp
00aa70e0	mov w2,#0x1
00aa70e4	bl 0x00c39a00
00aa70e8	mov x0,x23
00aa70ec	bl 0x00c320a0
00aa70f0	mov x1,sp
00aa70f4	mov x0,x23
00aa70f8	bl 0x00c32090
00aa70fc	sub x0,x29,#0x50
00aa7100	mov x1,sp
00aa7104	mov w2,#0x1
00aa7108	bl 0x00c39a00
00aa710c	ldp w9,w11,[x29, #-0x48]
00aa7110	ldp w8,w10,[x29, #-0x50]
00aa7114	add x24,x24,#0x8
00aa7118	cmp x24,x19
00aa711c	eor w9,w9,w26
00aa7120	lsr w12,w9,#0x8
00aa7124	strb w12,[x21, #0xd]
00aa7128	lsr w12,w9,#0x10
00aa712c	eor w10,w10,w25
00aa7130	strb w12,[x21, #0xe]
00aa7134	lsr w12,w9,#0x18
00aa7138	strb w12,[x21, #0xf]
00aa713c	lsr w12,w10,#0x8
00aa7140	eor w8,w8,w26
00aa7144	strb w12,[x21, #0x11]
00aa7148	lsr w12,w10,#0x10
00aa714c	strb w10,[x21, #0x10]
00aa7150	lsr w10,w10,#0x18
00aa7154	strb w12,[x21, #0x12]
00aa7158	lsr w12,w8,#0x8
00aa715c	eor w11,w11,w25
00aa7160	strb w10,[x21, #0x13]
00aa7164	lsr w10,w8,#0x10
00aa7168	strb w12,[x21, #0x15]
00aa716c	lsr w12,w8,#0x18
00aa7170	strb w11,[x21, #0x18]
00aa7174	strb w10,[x21, #0x16]
00aa7178	lsr w10,w11,#0x8
00aa717c	strb w12,[x21, #0x17]
00aa7180	lsr w12,w11,#0x10
00aa7184	lsr w11,w11,#0x18
00aa7188	strb w9,[x21, #0xc]
00aa718c	strb w8,[x21, #0x14]
00aa7190	strb w10,[x21, #0x19]
00aa7194	strb w12,[x21, #0x1a]
00aa7198	strb w11,[x21, #0x1b]
00aa719c	b.cc 0x00aa709c
00aa71a0	ldp x29,x30,[sp, #0xd0]
00aa71a4	ldp x20,x19,[sp, #0xc0]
00aa71a8	ldp x22,x21,[sp, #0xb0]
00aa71ac	ldp x24,x23,[sp, #0xa0]
00aa71b0	ldp x26,x25,[sp, #0x90]
00aa71b4	add sp,sp,#0xe0
00aa71b8	ret
