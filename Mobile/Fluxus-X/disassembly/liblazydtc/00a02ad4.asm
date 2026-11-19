; BN_consttime_swap @ 00a02ad4
00a02ad4	cmp x1,x2
00a02ad8	b.eq 0x00a02c1c
00a02adc	ldr w9,[x1, #0x8]
00a02ae0	ldr w10,[x2, #0x8]
00a02ae4	sub x8,x0,#0x1
00a02ae8	bic x8,x8,x0
00a02aec	lsr x8,x8,#0x3f
00a02af0	sub x8,x8,#0x1
00a02af4	eor w10,w10,w9
00a02af8	and w10,w10,w8
00a02afc	eor w9,w10,w9
00a02b00	str w9,[x1, #0x8]
00a02b04	ldr w9,[x2, #0x8]
00a02b08	ldr w11,[x2, #0x10]
00a02b0c	cmp w3,#0x1
00a02b10	eor w9,w9,w10
00a02b14	str w9,[x2, #0x8]
00a02b18	ldr w9,[x1, #0x10]
00a02b1c	eor w10,w11,w9
00a02b20	and w10,w10,w8
00a02b24	eor w9,w10,w9
00a02b28	str w9,[x1, #0x10]
00a02b2c	ldp w9,w11,[x2, #0x10]
00a02b30	eor w9,w9,w10
00a02b34	str w9,[x2, #0x10]
00a02b38	ldr w9,[x1, #0x14]
00a02b3c	eor w10,w11,w9
00a02b40	and w10,w8,w10
00a02b44	and w10,w10,#0x4
00a02b48	eor w9,w10,w9
00a02b4c	str w9,[x1, #0x14]
00a02b50	ldr w9,[x2, #0x14]
00a02b54	eor w9,w10,w9
00a02b58	str w9,[x2, #0x14]
00a02b5c	b.lt 0x00a02c1c
00a02b60	ldr x9,[x1]
00a02b64	ldr x10,[x2]
00a02b68	mov x12,xzr
00a02b6c	cmp w3,#0x1
00a02b70	mov w11,w3
00a02b74	b.eq 0x00a02be0
00a02b78	lsl x12,x11,#0x3
00a02b7c	add x13,x10,x12
00a02b80	cmp x9,x13
00a02b84	b.cs 0x00a02b98
00a02b88	add x12,x9,x12
00a02b8c	cmp x10,x12
00a02b90	mov x12,xzr
00a02b94	b.cc 0x00a02be0
00a02b98	and x12,x11,#0xfffffffe
00a02b9c	dup v0.2D,x8
00a02ba0	mov x13,x12
00a02ba4	mov x14,x10
00a02ba8	mov x15,x9
00a02bac	ldr q1,[x15]
00a02bb0	ldr q2,[x14]
00a02bb4	subs x13,x13,#0x2
00a02bb8	eor v2.16B,v2.16B,v1.16B
00a02bbc	and v2.16B,v2.16B,v0.16B
00a02bc0	eor v1.16B,v2.16B,v1.16B
00a02bc4	str q1,[x15], #0x10
00a02bc8	ldr q1,[x14]
00a02bcc	eor v1.16B,v1.16B,v2.16B
00a02bd0	str q1,[x14], #0x10
00a02bd4	b.ne 0x00a02bac
00a02bd8	cmp x12,x11
00a02bdc	b.eq 0x00a02c1c
00a02be0	lsl x13,x12,#0x3
00a02be4	add x10,x10,x13
00a02be8	add x9,x9,x13
00a02bec	sub x11,x11,x12
00a02bf0	ldr x12,[x9]
00a02bf4	ldr x13,[x10]
00a02bf8	subs x11,x11,#0x1
00a02bfc	eor x13,x13,x12
00a02c00	and x13,x13,x8
00a02c04	eor x12,x13,x12
00a02c08	str x12,[x9], #0x8
00a02c0c	ldr x12,[x10]
00a02c10	eor x12,x12,x13
00a02c14	str x12,[x10], #0x8
00a02c18	b.ne 0x00a02bf0
00a02c1c	ret
