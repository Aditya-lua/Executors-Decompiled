; mbedtls_cipher_cmac_finish @ 00b9ea00
00b9ea00	sub sp,sp,#0xa0
00b9ea04	str x25,[sp, #0x50]
00b9ea08	stp x24,x23,[sp, #0x60]
00b9ea0c	stp x22,x21,[sp, #0x70]
00b9ea10	stp x20,x19,[sp, #0x80]
00b9ea14	stp x29,x30,[sp, #0x90]
00b9ea18	add x29,sp,#0x90
00b9ea1c	mrs x25,tpidr_el0
00b9ea20	ldr x8,[x25, #0x28]
00b9ea24	mov x20,x1
00b9ea28	mov x21,x0
00b9ea2c	str x8,[sp, #0x48]
00b9ea30	cbz x0,0x00b9ebf4
00b9ea34	ldr x8,[x21]
00b9ea38	cbz x8,0x00b9ebf4
00b9ea3c	mov w24,#0xffff9f00
00b9ea40	cbz x20,0x00b9ee3c
00b9ea44	ldr x19,[x21, #0x58]
00b9ea48	cbz x19,0x00b9ee3c
00b9ea4c	ldr w8,[x8, #0x8]
00b9ea50	add x0,sp,#0x30
00b9ea54	mov w1,#0x10
00b9ea58	and x22,x8,#0x1f
00b9ea5c	bl 0x00c42220
00b9ea60	add x0,sp,#0x20
00b9ea64	mov w1,#0x10
00b9ea68	bl 0x00c42220
00b9ea6c	add x1,sp,#0x30
00b9ea70	add x2,sp,#0x20
00b9ea74	mov x0,x21
00b9ea78	bl 0x00b9ee70
00b9ea7c	ldr x8,[x19, #0x20]
00b9ea80	add x23,x19,#0x10
00b9ea84	cmp x8,x22
00b9ea88	b.cs 0x00b9ebfc
00b9ea8c	cmp w22,#0x2
00b9ea90	mov x9,xzr
00b9ea94	b.cc 0x00b9eb7c
00b9ea98	mov x10,xzr
00b9ea9c	and x9,x22,#0x1e
00b9eaa0	add x11,sp,#0x10
00b9eaa4	mov w12,#0x80
00b9eaa8	b 0x00b9eac4
00b9eaac	cmp x10,x8
00b9eab0	b.cs 0x00b9eb58
00b9eab4	strb w14,[x11, x10]
00b9eab8	cmp x13,x8
00b9eabc	b.cc 0x00b9eb60
00b9eac0	b 0x00b9eb68
00b9eac4	cmp x10,x8
00b9eac8	add x13,x10,#0x1
00b9eacc	cset w15,cc
00b9ead0	cset w16,eq
00b9ead4	cmp x13,x8
00b9ead8	cset w17,cc
00b9eadc	cset w18,eq
00b9eae0	eor w17,w18,w17
00b9eae4	add x14,x11,x10
00b9eae8	cmp w16,w15
00b9eaec	eor w15,w17,#0x1
00b9eaf0	b.ne 0x00b9eb14
00b9eaf4	strb wzr,[x11, x10]
00b9eaf8	cbnz w15,0x00b9eb18
00b9eafc	cmp x10,x8
00b9eb00	b.ne 0x00b9eb24
00b9eb04	strb w12,[x11, x10]
00b9eb08	cmp x13,x8
00b9eb0c	b.ne 0x00b9eb30
00b9eb10	b 0x00b9eb2c
00b9eb14	cbz w15,0x00b9eafc
00b9eb18	strb wzr,[x14, #0x1]
00b9eb1c	cmp x10,x8
00b9eb20	b.eq 0x00b9eb04
00b9eb24	cmp x13,x8
00b9eb28	b.ne 0x00b9eb30
00b9eb2c	strb w12,[x14, #0x1]
00b9eb30	cmp x10,x8
00b9eb34	b.cs 0x00b9eb40
00b9eb38	add x14,x19,x10
00b9eb3c	ldrb w14,[x14, #0x10]
00b9eb40	cmp x13,x8
00b9eb44	b.cs 0x00b9eaac
00b9eb48	add x15,x19,x10
00b9eb4c	ldrb w15,[x15, #0x11]
00b9eb50	cmp x10,x8
00b9eb54	b.cc 0x00b9eab4
00b9eb58	cmp x13,x8
00b9eb5c	b.cs 0x00b9eb68
00b9eb60	add x10,x11,x10
00b9eb64	strb w15,[x10, #0x1]
00b9eb68	add x10,x13,#0x1
00b9eb6c	cmp x10,x9
00b9eb70	b.ne 0x00b9eac4
00b9eb74	cmp x9,x22
00b9eb78	b.eq 0x00b9ebbc
00b9eb7c	add x10,sp,#0x10
00b9eb80	mov w11,#0x80
00b9eb84	cmp x9,x8
00b9eb88	b.cs 0x00b9eb9c
00b9eb8c	add x12,x19,x9
00b9eb90	ldrb w12,[x12, #0x10]
00b9eb94	strb w12,[x10, x9]
00b9eb98	b 0x00b9ebb0
00b9eb9c	cmp x8,x9
00b9eba0	b.ne 0x00b9ebac
00b9eba4	strb w11,[x10, x9]
00b9eba8	b 0x00b9ebb0
00b9ebac	strb wzr,[x10, x9]
00b9ebb0	add x9,x9,#0x1
00b9ebb4	cmp x22,x9
00b9ebb8	b.ne 0x00b9eb84
00b9ebbc	cmp w22,#0x10
00b9ebc0	mov x8,xzr
00b9ebc4	b.cc 0x00b9ebd8
00b9ebc8	ldp q0,q1,[sp, #0x10]
00b9ebcc	mov w8,#0x10
00b9ebd0	eor v0.16B,v1.16B,v0.16B
00b9ebd4	str q0,[sp, #0x10]
00b9ebd8	cmp x8,x22
00b9ebdc	b.cs 0x00b9ed30
00b9ebe0	sub x10,x22,x8
00b9ebe4	cmp x10,#0x20
00b9ebe8	b.cs 0x00b9ec38
00b9ebec	mov x9,x8
00b9ebf0	b 0x00b9ec80
00b9ebf4	mov w24,#0xffff9f00
00b9ebf8	b 0x00b9ee3c
00b9ebfc	cmp w22,#0x10
00b9ec00	mov x8,xzr
00b9ec04	b.cc 0x00b9ec1c
00b9ec08	ldr q0,[x23]
00b9ec0c	ldr q1,[sp, #0x30]
00b9ec10	mov w8,#0x10
00b9ec14	eor v0.16B,v1.16B,v0.16B
00b9ec18	str q0,[sp, #0x10]
00b9ec1c	cmp x8,x22
00b9ec20	b.cs 0x00b9ed30
00b9ec24	sub x10,x22,x8
00b9ec28	cmp x10,#0x20
00b9ec2c	b.cs 0x00b9ecb0
00b9ec30	mov x9,x8
00b9ec34	b 0x00b9ecfc
00b9ec38	and x11,x10,#-0x20
00b9ec3c	mov x12,xzr
00b9ec40	add x13,sp,#0x10
00b9ec44	orr x9,x8,x11
00b9ec48	add x14,sp,#0x20
00b9ec4c	orr x15,x8,x12
00b9ec50	add x16,x13,x15
00b9ec54	add x15,x14,x15
00b9ec58	ldp q0,q1,[x16]
00b9ec5c	ldp q2,q3,[x15]
00b9ec60	add x12,x12,#0x20
00b9ec64	cmp x11,x12
00b9ec68	eor v0.16B,v2.16B,v0.16B
00b9ec6c	eor v1.16B,v3.16B,v1.16B
00b9ec70	stp q0,q1,[x16]
00b9ec74	b.ne 0x00b9ec4c
00b9ec78	cmp x10,x11
00b9ec7c	b.eq 0x00b9ed30
00b9ec80	add x8,sp,#0x20
00b9ec84	add x10,sp,#0x10
00b9ec88	add x8,x8,x9
00b9ec8c	add x10,x10,x9
00b9ec90	sub x9,x22,x9
00b9ec94	ldrb w11,[x10]
00b9ec98	ldrb w12,[x8], #0x1
00b9ec9c	subs x9,x9,#0x1
00b9eca0	eor w11,w12,w11
00b9eca4	strb w11,[x10], #0x1
00b9eca8	b.ne 0x00b9ec94
00b9ecac	b 0x00b9ed30
00b9ecb0	and x11,x10,#-0x20
00b9ecb4	mov x12,xzr
00b9ecb8	add x13,sp,#0x30
00b9ecbc	orr x9,x8,x11
00b9ecc0	add x14,sp,#0x10
00b9ecc4	orr x15,x8,x12
00b9ecc8	add x16,x19,x15
00b9eccc	add x17,x13,x15
00b9ecd0	ldp q0,q1,[x16, #0x10]
00b9ecd4	ldp q2,q3,[x17]
00b9ecd8	add x12,x12,#0x20
00b9ecdc	add x15,x14,x15
00b9ece0	cmp x11,x12
00b9ece4	eor v0.16B,v2.16B,v0.16B
00b9ece8	eor v1.16B,v3.16B,v1.16B
00b9ecec	stp q0,q1,[x15]
00b9ecf0	b.ne 0x00b9ecc4
00b9ecf4	cmp x10,x11
00b9ecf8	b.eq 0x00b9ed30
00b9ecfc	add x8,sp,#0x10
00b9ed00	add x10,sp,#0x30
00b9ed04	add x11,x19,x9
00b9ed08	add x8,x8,x9
00b9ed0c	add x10,x10,x9
00b9ed10	add x11,x11,#0x10
00b9ed14	sub x9,x22,x9
00b9ed18	ldrb w12,[x11], #0x1
00b9ed1c	ldrb w13,[x10], #0x1
00b9ed20	subs x9,x9,#0x1
00b9ed24	eor w12,w13,w12
00b9ed28	strb w12,[x8], #0x1
00b9ed2c	b.ne 0x00b9ed18
00b9ed30	cmp w22,#0x10
00b9ed34	mov x8,xzr
00b9ed38	b.cc 0x00b9ed50
00b9ed3c	ldr q0,[sp, #0x10]
00b9ed40	ldr q1,[x19]
00b9ed44	mov w8,#0x10
00b9ed48	eor v0.16B,v1.16B,v0.16B
00b9ed4c	str q0,[x19]
00b9ed50	cmp x8,x22
00b9ed54	b.cs 0x00b9edd8
00b9ed58	sub x10,x22,x8
00b9ed5c	cmp x10,#0x20
00b9ed60	b.cs 0x00b9ed6c
00b9ed64	mov x9,x8
00b9ed68	b 0x00b9edb0
00b9ed6c	and x11,x10,#-0x20
00b9ed70	mov x12,xzr
00b9ed74	orr x9,x8,x11
00b9ed78	add x13,sp,#0x10
00b9ed7c	orr x14,x8,x12
00b9ed80	add x15,x13,x14
00b9ed84	add x14,x19,x14
00b9ed88	ldp q0,q1,[x15]
00b9ed8c	ldp q2,q3,[x14]
00b9ed90	add x12,x12,#0x20
00b9ed94	cmp x11,x12
00b9ed98	eor v0.16B,v2.16B,v0.16B
00b9ed9c	eor v1.16B,v3.16B,v1.16B
00b9eda0	stp q0,q1,[x14]
00b9eda4	b.ne 0x00b9ed7c
00b9eda8	cmp x10,x11
00b9edac	b.eq 0x00b9edd8
00b9edb0	add x10,sp,#0x10
00b9edb4	add x8,x19,x9
00b9edb8	add x10,x10,x9
00b9edbc	sub x9,x22,x9
00b9edc0	ldrb w11,[x10], #0x1
00b9edc4	ldrb w12,[x8]
00b9edc8	subs x9,x9,#0x1
00b9edcc	eor w11,w12,w11
00b9edd0	strb w11,[x8], #0x1
00b9edd4	b.ne 0x00b9edc0
00b9edd8	add x4,sp,#0x8
00b9eddc	mov x0,x21
00b9ede0	mov x1,x19
00b9ede4	mov x2,x22
00b9ede8	mov x3,x19
00b9edec	bl 0x00c42180
00b9edf0	mov w24,w0
00b9edf4	cbnz w0,0x00b9ee08
00b9edf8	mov x0,x20
00b9edfc	mov x1,x19
00b9ee00	mov x2,x22
00b9ee04	bl 0x00c2ffd0
00b9ee08	add x0,sp,#0x30
00b9ee0c	mov w1,#0x10
00b9ee10	bl 0x00c42220
00b9ee14	add x0,sp,#0x20
00b9ee18	mov w1,#0x10
00b9ee1c	bl 0x00c42220
00b9ee20	mov w1,#0x10
00b9ee24	mov x0,x23
00b9ee28	str xzr,[x19, #0x20]
00b9ee2c	bl 0x00c42220
00b9ee30	mov w1,#0x10
00b9ee34	mov x0,x19
00b9ee38	bl 0x00c42220
00b9ee3c	ldr x8,[x25, #0x28]
00b9ee40	ldr x9,[sp, #0x48]
00b9ee44	cmp x8,x9
00b9ee48	b.ne 0x00b9ee6c
00b9ee4c	mov w0,w24
00b9ee50	ldp x29,x30,[sp, #0x90]
00b9ee54	ldp x20,x19,[sp, #0x80]
00b9ee58	ldp x22,x21,[sp, #0x70]
00b9ee5c	ldp x24,x23,[sp, #0x60]
00b9ee60	ldr x25,[sp, #0x50]
00b9ee64	add sp,sp,#0xa0
00b9ee68	ret
00b9ee6c	bl 0x00c2fec0
