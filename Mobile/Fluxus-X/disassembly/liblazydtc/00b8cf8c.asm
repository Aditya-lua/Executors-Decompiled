; psa_key_derivation_abort @ 00b8cf8c
00b8cf8c	stp x20,x19,[sp, #-0x20]!
00b8cf90	stp x29,x30,[sp, #0x10]
00b8cf94	add x29,sp,#0x10
00b8cf98	ldr w8,[x0]
00b8cf9c	mov w9,#0x9000000
00b8cfa0	mov x19,x0
00b8cfa4	and w10,w8,#0x7f000000
00b8cfa8	and w11,w8,#0xfe00ffff
00b8cfac	orr w11,w11,#0x8000000
00b8cfb0	cmp w10,w9
00b8cfb4	csel w8,w11,w8,eq
00b8cfb8	cbz w8,0x00b8d08c
00b8cfbc	mov w9,#0xff00
00b8cfc0	movk w9,#0xf7ff, LSL #16
00b8cfc4	add w9,w8,w9
00b8cfc8	lsr w9,w9,#0x8
00b8cfcc	cmp w9,#0x4
00b8cfd0	b.hi 0x00b8d070
00b8cfd4	mov w8,#0x1
00b8cfd8	lsl w8,w8,w9
00b8cfdc	mov w9,#0x19
00b8cfe0	tst w8,w9
00b8cfe4	b.eq 0x00b8d010
00b8cfe8	ldr x0,[x19, #0x10]
00b8cfec	bl 0x00c30960
00b8cff0	ldr w20,[x19, #0xa8]
00b8cff4	cbz w20,0x00b8d090
00b8cff8	cmp w20,#0x1
00b8cffc	b.ne 0x00b8d054
00b8d000	add x0,x19,#0xb0
00b8d004	bl 0x00c43040
00b8d008	mov w20,w0
00b8d00c	b 0x00b8d058
00b8d010	ldr x0,[x19, #0x18]
00b8d014	cbz x0,0x00b8d020
00b8d018	ldr x1,[x19, #0x20]
00b8d01c	bl 0x00c42230
00b8d020	ldr x0,[x19, #0x28]
00b8d024	cbz x0,0x00b8d030
00b8d028	ldr x1,[x19, #0x30]
00b8d02c	bl 0x00c42230
00b8d030	ldr x0,[x19, #0x38]
00b8d034	cbz x0,0x00b8d040
00b8d038	ldr x1,[x19, #0x40]
00b8d03c	bl 0x00c42230
00b8d040	ldr x0,[x19, #0x48]
00b8d044	cbz x0,0x00b8d08c
00b8d048	ldr x1,[x19, #0x50]
00b8d04c	bl 0x00c42230
00b8d050	b 0x00b8d08c
00b8d054	mov w20,#0xffffff79
00b8d058	ldrb w8,[x19, #0xad]
00b8d05c	strb wzr,[x19, #0xac]
00b8d060	str wzr,[x19, #0xa8]
00b8d064	and w8,w8,#0xfe
00b8d068	strb w8,[x19, #0xad]
00b8d06c	b 0x00b8d090
00b8d070	mov w9,#0x609
00b8d074	movk w9,#0x800, LSL #16
00b8d078	cmp w8,w9
00b8d07c	b.ne 0x00b8d0ac
00b8d080	add x0,x19,#0x10
00b8d084	mov w1,#0x20
00b8d088	bl 0x00c42220
00b8d08c	mov w20,wzr
00b8d090	mov w1,#0x238
00b8d094	mov x0,x19
00b8d098	bl 0x00c42220
00b8d09c	ldp x29,x30,[sp, #0x10]
00b8d0a0	mov w0,w20
00b8d0a4	ldp x20,x19,[sp], #0x20
00b8d0a8	ret
00b8d0ac	mov w20,#0xffffff77
00b8d0b0	b 0x00b8d090
