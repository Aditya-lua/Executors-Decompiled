; FUN_008b78d0 @ 008b78d0
008b78d0	stp x29,x30,[sp, #-0x50]!
008b78d4	stp x26,x25,[sp, #0x10]
008b78d8	stp x24,x23,[sp, #0x20]
008b78dc	stp x22,x21,[sp, #0x30]
008b78e0	stp x20,x19,[sp, #0x40]
008b78e4	mov x29,sp
008b78e8	sub x8,x1,#0x1
008b78ec	ldr x26,[x0, #0x60]
008b78f0	mov w19,w4
008b78f4	mov w20,w3
008b78f8	mov x21,x1
008b78fc	mov x22,x0
008b7900	cmp x8,#0x3ff
008b7904	mov w23,w2
008b7908	b.hi 0x008b7960
008b790c	adrp x8,0xd1f000
008b7910	add x8,x8,#0x638
008b7914	add x8,x8,x21
008b7918	ldrsb x24,[x8, #0xa0]
008b791c	tbnz x24,#0x3f,0x008b7960
008b7920	add x25,x26,#0x1f0
008b7924	ldr x8,[x25, x24, LSL #0x3]
008b7928	cbz x8,0x008b7a0c
008b792c	ldr w9,[x8, #0x30]
008b7930	tbnz w9,#0x1f,0x008b7a30
008b7934	ldr w10,[x8, #0x24]
008b7938	ldr w11,[x8, #0x34]
008b793c	ldr x12,[x8, #0x28]
008b7940	sub w10,w9,w10
008b7944	add x9,x8,x9
008b7948	add w11,w11,#0x1
008b794c	add x0,x9,#0x40
008b7950	stp w10,w11,[x8, #0x30]
008b7954	cbnz x12,0x008b79d0
008b7958	tbnz w10,#0x1f,0x008b7a4c
008b795c	b 0x008b79d0
008b7960	adrp x24,0xd1f000
008b7964	add w25,w21,#0x40
008b7968	ldrb w8,[x24, #0x618]
008b796c	cmp w8,#0x1
008b7970	ldp x8,x0,[x26, #0x48]
008b7974	sxtw x3,w25
008b7978	mov x1,xzr
008b797c	mov x2,xzr
008b7980	blr x8
008b7984	mov x8,x0
008b7988	cbz x0,0x008b7a90
008b798c	movi v0.2D,#0x0
008b7990	ldrb w9,[x24, #0x618]
008b7994	stp w25,w21,[x8, #0x20]
008b7998	stp xzr,xzr,[x8, #0x28]
008b799c	cmp w9,#0x1
008b79a0	stp q0,q0,[x8]
008b79a4	b.ne 0x008b79ac
008b79a8	str wzr,[x8, #0x38]
008b79ac	ldr x9,[x26, #0x330]
008b79b0	str x9,[x8, #0x8]
008b79b4	cbz x9,0x008b79bc
008b79b8	str x8,[x9]
008b79bc	neg w9,w21
008b79c0	mov w10,#0x1
008b79c4	add x0,x8,#0x40
008b79c8	str x8,[x26, #0x330]
008b79cc	stp w9,w10,[x8, #0x30]
008b79d0	add x9,x26,w23, UXTB  #0x3
008b79d4	ldr x8,[x26, #0x10]
008b79d8	ldr x10,[x9, #0x3848]
008b79dc	add x11,x8,x21
008b79e0	ldr x8,[x26, #0x658]
008b79e4	str x11,[x26, #0x10]
008b79e8	add x10,x10,x21
008b79ec	str x10,[x9, #0x3848]
008b79f0	cbnz x8,0x008b7a64
008b79f4	ldp x20,x19,[sp, #0x40]
008b79f8	ldp x22,x21,[sp, #0x30]
008b79fc	ldp x24,x23,[sp, #0x20]
008b7a00	ldp x26,x25,[sp, #0x10]
008b7a04	ldp x29,x30,[sp], #0x50
008b7a08	ret
008b7a0c	add x2,x26,#0x330
008b7a10	mov x0,x22
008b7a14	mov x1,x25
008b7a18	mov w3,w24
008b7a1c	mov w4,wzr
008b7a20	bl 0x008b8a8c
008b7a24	mov x8,x0
008b7a28	ldr w9,[x8, #0x30]
008b7a2c	tbz w9,#0x1f,0x008b7934
008b7a30	ldr x0,[x8, #0x28]
008b7a34	ldr w9,[x8, #0x34]
008b7a38	ldr x10,[x0, #0x8]
008b7a3c	add w9,w9,#0x1
008b7a40	str w9,[x8, #0x34]
008b7a44	str x10,[x8, #0x28]
008b7a48	cbnz x10,0x008b79d0
008b7a4c	ldr x9,[x8, #0x18]
008b7a50	str x9,[x25, x24, LSL #0x3]
008b7a54	cbz x9,0x008b7a5c
008b7a58	str xzr,[x9, #0x10]
008b7a5c	str xzr,[x8, #0x18]
008b7a60	b 0x008b79d0
008b7a64	mov x24,x0
008b7a68	mov x0,x22
008b7a6c	mov x2,xzr
008b7a70	mov x1,x24
008b7a74	mov x3,x21
008b7a78	mov w4,w23
008b7a7c	mov w5,w20
008b7a80	mov w6,w19
008b7a84	blr x8
008b7a88	mov x0,x24
008b7a8c	b 0x008b79f4
008b7a90	mov x0,x22
008b7a94	mov w1,#0x4
008b7a98	bl 0x008b3f9c
