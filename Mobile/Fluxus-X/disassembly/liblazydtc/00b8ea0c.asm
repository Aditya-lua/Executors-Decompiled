; psa_key_derivation_key_agreement @ 00b8ea0c
00b8ea0c	str x28,[sp, #-0x60]!
00b8ea10	stp x26,x25,[sp, #0x10]
00b8ea14	stp x24,x23,[sp, #0x20]
00b8ea18	stp x22,x21,[sp, #0x30]
00b8ea1c	stp x20,x19,[sp, #0x40]
00b8ea20	stp x29,x30,[sp, #0x50]
00b8ea24	add x29,sp,#0x50
00b8ea28	sub sp,sp,#0x420
00b8ea2c	mrs x25,tpidr_el0
00b8ea30	ldr x9,[x25, #0x28]
00b8ea34	mov x24,x3
00b8ea38	mov w26,#0x9000000
00b8ea3c	mov x22,x4
00b8ea40	stur x9,[x29, #-0x58]
00b8ea44	ldr w3,[x0]
00b8ea48	mov w8,w2
00b8ea4c	mov x19,x0
00b8ea50	mov w21,w1
00b8ea54	and w9,w3,#0x7f000000
00b8ea58	cmp w9,w26
00b8ea5c	b.ne 0x00b8eab0
00b8ea60	add x1,sp,#0x8
00b8ea64	mov w2,#0x4000
00b8ea68	mov w0,w8
00b8ea6c	bl 0x00b86e5c
00b8ea70	cbnz w0,0x00b8eab4
00b8ea74	ldr x23,[sp, #0x8]
00b8ea78	ldr w8,[x23, #0x4]
00b8ea7c	cmp w8,#0x100
00b8ea80	b.cs 0x00b8eae4
00b8ea84	cbz x22,0x00b8eaf8
00b8ea88	mov w1,#0x1
00b8ea8c	mov x0,x22
00b8ea90	bl 0x00c30a30
00b8ea94	mov x20,x0
00b8ea98	cbz x0,0x00b8ebd8
00b8ea9c	mov x0,x20
00b8eaa0	mov x1,x24
00b8eaa4	mov x2,x22
00b8eaa8	bl 0x00c2ffd0
00b8eaac	b 0x00b8eafc
00b8eab0	mov w0,#0xffffff79
00b8eab4	ldr x8,[x25, #0x28]
00b8eab8	ldur x9,[x29, #-0x58]
00b8eabc	cmp x8,x9
00b8eac0	b.ne 0x00b8ec5c
00b8eac4	add sp,sp,#0x420
00b8eac8	ldp x29,x30,[sp, #0x50]
00b8eacc	ldp x20,x19,[sp, #0x40]
00b8ead0	ldp x22,x21,[sp, #0x30]
00b8ead4	ldp x24,x23,[sp, #0x20]
00b8ead8	ldp x26,x25,[sp, #0x10]
00b8eadc	ldr x28,[sp], #0x60
00b8eae0	ret
00b8eae4	mov x0,x23
00b8eae8	bl 0x00c431e0
00b8eaec	str xzr,[sp, #0x8]
00b8eaf0	mov w0,#0xffffff7a
00b8eaf4	b 0x00b8eab4
00b8eaf8	mov x20,xzr
00b8eafc	add x0,sp,#0x18
00b8eb00	mov w2,#0x400
00b8eb04	mov w1,wzr
00b8eb08	mov w24,#0xf6000000
00b8eb0c	bl 0x00c301c0
00b8eb10	str xzr,[sp, #0x10]
00b8eb14	ldr w8,[x19]
00b8eb18	add w9,w24,#0xff0, LSL #12
00b8eb1c	and w9,w8,w9
00b8eb20	orr w9,w9,w26
00b8eb24	and w10,w9,#0x7f000000
00b8eb28	cmp w10,w26
00b8eb2c	b.ne 0x00b8eba4
00b8eb30	and w8,w8,w24
00b8eb34	orr w8,w8,#0x8000000
00b8eb38	mov w10,#0x8000000
00b8eb3c	cmp w8,w10
00b8eb40	b.ne 0x00b8eba4
00b8eb44	ldr w8,[x23, #0x4]
00b8eb48	cmp w8,#0xff
00b8eb4c	b.hi 0x00b8eba4
00b8eb50	ldp x8,x4,[x23, #0x28]
00b8eb54	mov w10,#0x9010000
00b8eb58	cmp w9,w10
00b8eb5c	b.eq 0x00b8ec14
00b8eb60	mov w10,#0x9020000
00b8eb64	cmp w9,w10
00b8eb68	b.ne 0x00b8eba4
00b8eb6c	add w3,w26,#0x20, LSL #12
00b8eb70	add x9,sp,#0x10
00b8eb74	add x6,sp,#0x18
00b8eb78	mov w7,#0x400
00b8eb7c	mov x0,x23
00b8eb80	mov x1,x8
00b8eb84	mov x2,x4
00b8eb88	mov x4,x20
00b8eb8c	mov x5,x22
00b8eb90	str x9,[sp]
00b8eb94	bl 0x00c42f90
00b8eb98	mov w22,w0
00b8eb9c	cbnz w0,0x00b8eba8
00b8eba0	b 0x00b8ec3c
00b8eba4	mov w22,#0xffffff7a
00b8eba8	ldr x1,[sp, #0x10]
00b8ebac	add x0,sp,#0x18
00b8ebb0	bl 0x00c42220
00b8ebb4	cbnz w22,0x00b8ebdc
00b8ebb8	and w8,w21,#0xffff
00b8ebbc	cmp w8,#0x101
00b8ebc0	b.ne 0x00b8ebec
00b8ebc4	ldrb w8,[x19, #0x4]
00b8ebc8	mov w22,wzr
00b8ebcc	orr w8,w8,#0x1
00b8ebd0	strb w8,[x19, #0x4]
00b8ebd4	b 0x00b8ebf0
00b8ebd8	mov w22,#0xffffff73
00b8ebdc	mov x0,x19
00b8ebe0	bl 0x00c42d20
00b8ebe4	mov w21,wzr
00b8ebe8	b 0x00b8ebf4
00b8ebec	mov w22,wzr
00b8ebf0	mov w21,#0x1
00b8ebf4	ldr x0,[sp, #0x8]
00b8ebf8	bl 0x00c431e0
00b8ebfc	mov w19,w0
00b8ec00	mov x0,x20
00b8ec04	bl 0x00c30960
00b8ec08	cmp w21,#0x0
00b8ec0c	csel w0,w19,w22,ne
00b8ec10	b 0x00b8eab4
00b8ec14	add x5,sp,#0x18
00b8ec18	mov w6,#0x400
00b8ec1c	add x7,sp,#0x10
00b8ec20	mov x0,x23
00b8ec24	mov x1,x20
00b8ec28	mov x2,x22
00b8ec2c	mov x3,x8
00b8ec30	bl 0x00c42fd0
00b8ec34	mov w22,w0
00b8ec38	cbnz w0,0x00b8eba8
00b8ec3c	ldr x4,[sp, #0x10]
00b8ec40	mov w2,#0x1200
00b8ec44	add x3,sp,#0x18
00b8ec48	mov x0,x19
00b8ec4c	mov w1,w21
00b8ec50	bl 0x00b8e20c
00b8ec54	mov w22,w0
00b8ec58	b 0x00b8eba8
00b8ec5c	bl 0x00c2fec0
