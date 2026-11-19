; FUN_0095bbec @ 0095bbec
0095bbec	sub sp,sp,#0x40
0095bbf0	str x21,[sp, #0x10]
0095bbf4	stp x20,x19,[sp, #0x20]
0095bbf8	stp x29,x30,[sp, #0x30]
0095bbfc	add x29,sp,#0x30
0095bc00	mrs x21,tpidr_el0
0095bc04	ldr x8,[x21, #0x28]
0095bc08	mov x19,x0
0095bc0c	mov w1,wzr
0095bc10	str x8,[sp, #0x8]
0095bc14	ldr x20,[x0, #0x20]
0095bc18	strb wzr,[sp, #0x4]
0095bc1c	mov x0,x20
0095bc20	bl 0x00907858
0095bc24	tbnz w0,#0x0,0x0095bc3c
0095bc28	mov x0,x19
0095bc2c	mov x1,x20
0095bc30	mov w2,wzr
0095bc34	bl 0x0096a268
0095bc38	cbnz w0,0x0095bce8
0095bc3c	add x3,sp,#0x4
0095bc40	mov x0,x19
0095bc44	mov w1,wzr
0095bc48	mov w2,wzr
0095bc4c	bl 0x00907508
0095bc50	cbnz w0,0x0095bce8
0095bc54	ldrb w8,[x20, #0x4f8]
0095bc58	ldrb w9,[sp, #0x4]
0095bc5c	ldr w10,[x20, #0x4e8]
0095bc60	and w8,w8,#0xfffffffe
0095bc64	orr w8,w8,w9
0095bc68	cmp w10,#0x5
0095bc6c	strb w8,[x20, #0x4f8]
0095bc70	b.eq 0x0095bc84
0095bc74	ldr x8,[x19, #0x20]
0095bc78	mov w9,#0x5
0095bc7c	str w9,[x8, #0x4e8]
0095bc80	ldrb w8,[x20, #0x4f8]
0095bc84	mov w0,wzr
0095bc88	tbz w8,#0x0,0x0095bce8
0095bc8c	ldr x8,[x20, #0x3a0]
0095bc90	adrp x9,0xc50000
0095bc94	add x9,x9,#0xf18
0095bc98	str x9,[x20, #0x3a8]
0095bc9c	orr x8,x8,#0x8000000
0095bca0	str x8,[x20, #0x3a0]
0095bca4	ldr x8,[x19, #0x20]
0095bca8	mov w10,#0xed
0095bcac	adrp x2,0x2a5000
0095bcb0	add x2,x2,#0x598
0095bcb4	ldrb w9,[x8, #0x4f8]
0095bcb8	ldr x3,[x8, #0x4f0]
0095bcbc	add x1,x8,#0x428
0095bcc0	mov x0,x19
0095bcc4	and w9,w9,w10
0095bcc8	strh wzr,[x8, #0x4e0]
0095bccc	strh wzr,[x8, #0x4e4]
0095bcd0	strb w9,[x8, #0x4f8]
0095bcd4	bl 0x009453ec
0095bcd8	cbnz w0,0x0095bce8
0095bcdc	ldr x8,[x19, #0x20]
0095bce0	mov w9,#0x2
0095bce4	str w9,[x8, #0x4e8]
0095bce8	ldr x8,[x21, #0x28]
0095bcec	ldr x9,[sp, #0x8]
0095bcf0	cmp x8,x9
0095bcf4	b.ne 0x0095bd0c
0095bcf8	ldp x29,x30,[sp, #0x30]
0095bcfc	ldp x20,x19,[sp, #0x20]
0095bd00	ldr x21,[sp, #0x10]
0095bd04	add sp,sp,#0x40
0095bd08	ret
0095bd0c	bl 0x00c2fec0
