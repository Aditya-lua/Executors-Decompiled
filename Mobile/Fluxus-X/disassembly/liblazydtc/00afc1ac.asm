; i2s_ASN1_ENUMERATED_TABLE @ 00afc1ac
00afc1ac	stp x20,x19,[sp, #-0x20]!
00afc1b0	mov x20,x0
00afc1b4	mov x0,x1
00afc1b8	stp x29,x30,[sp, #0x10]
00afc1bc	add x29,sp,#0x10
00afc1c0	mov x19,x1
00afc1c4	bl 0x00c37540
00afc1c8	ldr x9,[x20, #0x60]
00afc1cc	ldr x8,[x9, #0x8]
00afc1d0	cbz x8,0x00afc1ec
00afc1d4	ldrsw x10,[x9]
00afc1d8	cmp x0,x10
00afc1dc	b.eq 0x00afc200
00afc1e0	ldr x8,[x9, #0x20]
00afc1e4	add x9,x9,#0x18
00afc1e8	cbnz x8,0x00afc1d4
00afc1ec	ldp x29,x30,[sp, #0x10]
00afc1f0	mov x0,x20
00afc1f4	mov x1,x19
00afc1f8	ldp x20,x19,[sp], #0x20
00afc1fc	b 0x00c40920
00afc200	ldp x29,x30,[sp, #0x10]
00afc204	adrp x1,0x2b4000
00afc208	add x1,x1,#0xa18
00afc20c	mov w2,#0x32
00afc210	mov x0,x8
00afc214	ldp x20,x19,[sp], #0x20
00afc218	b 0x00c34600
