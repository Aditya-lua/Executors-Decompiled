; FUN_009f5874 @ 009f5874
009f5874	sub sp,sp,#0x90
009f5878	stp x28,x27,[sp, #0x30]
009f587c	stp x26,x25,[sp, #0x40]
009f5880	stp x24,x23,[sp, #0x50]
009f5884	stp x22,x21,[sp, #0x60]
009f5888	stp x20,x19,[sp, #0x70]
009f588c	stp x29,x30,[sp, #0x80]
009f5890	ldr x27,[x1]
009f5894	mov w21,w4
009f5898	mov w20,w3
009f589c	mov x22,x2
009f58a0	mov x19,x1
009f58a4	mov x23,x0
009f58a8	add x29,sp,#0x80
009f58ac	str x27,[sp, #0x28]
009f58b0	cbnz x0,0x009f58c0
009f58b4	tbnz w20,#0x0,0x009f58c0
009f58b8	add x8,x27,x22
009f58bc	b 0x009f59bc
009f58c0	cmp x22,#0x1
009f58c4	b.lt 0x009f59b4
009f58c8	add w24,w21,#0x1
009f58cc	mov x8,x27
009f58d0	cmp x22,#0x1
009f58d4	b.eq 0x009f58e8
009f58d8	ldrb w9,[x8]
009f58dc	cbnz w9,0x009f58e8
009f58e0	ldrb w9,[x8, #0x1]
009f58e4	cbz w9,0x009f5a6c
009f58e8	add x0,sp,#0x20
009f58ec	add x3,sp,#0x18
009f58f0	add x4,sp,#0x1c
009f58f4	add x5,sp,#0x28
009f58f8	mov w7,#0xffffffff
009f58fc	mov x1,xzr
009f5900	mov x2,xzr
009f5904	mov x6,x22
009f5908	str xzr,[sp, #0x10]
009f590c	strb wzr,[sp, #0x8]
009f5910	str wzr,[sp]
009f5914	bl 0x009f5200
009f5918	cbz w0,0x009f59f0
009f591c	ldrb w8,[sp, #0x1c]
009f5920	cbz w8,0x009f594c
009f5924	cmp w21,#0x5
009f5928	b.ge 0x009f5a1c
009f592c	ldr x2,[sp, #0x20]
009f5930	ldrb w3,[sp, #0x18]
009f5934	add x1,sp,#0x28
009f5938	mov x0,x23
009f593c	mov w4,w24
009f5940	bl 0x009f5874
009f5944	cbnz w0,0x009f5994
009f5948	b 0x009f5a4c
009f594c	ldr x25,[sp, #0x20]
009f5950	cbz x25,0x009f5994
009f5954	cbz x23,0x009f5988
009f5958	ldrsw x28,[x23]
009f595c	mov x0,x23
009f5960	add x1,x28,x25
009f5964	bl 0x00c37010
009f5968	cbz x0,0x009f5aa0
009f596c	ldr x8,[x23, #0x8]
009f5970	ldr x26,[sp, #0x28]
009f5974	mov x2,x25
009f5978	add x0,x8,x28
009f597c	mov x1,x26
009f5980	bl 0x00c2ffd0
009f5984	b 0x009f598c
009f5988	ldr x26,[sp, #0x28]
009f598c	add x8,x26,x25
009f5990	str x8,[sp, #0x28]
009f5994	ldr x8,[sp, #0x28]
009f5998	add x9,x27,x22
009f599c	sub x22,x9,x8
009f59a0	cmp x22,#0x0
009f59a4	mov x27,x8
009f59a8	b.gt 0x009f58d0
009f59ac	tbz w20,#0x0,0x009f59bc
009f59b0	b 0x009f59c8
009f59b4	mov x8,x27
009f59b8	tbnz w20,#0x0,0x009f59c8
009f59bc	mov w0,#0x1
009f59c0	str x8,[x19]
009f59c4	b 0x009f5a4c
009f59c8	bl 0x00c342a0
009f59cc	adrp x0,0x2ad000
009f59d0	adrp x2,0x2cf000
009f59d4	add x0,x0,#0x9c8
009f59d8	add x2,x2,#0x8ef
009f59dc	mov w1,#0x442
009f59e0	bl 0x00c342b0
009f59e4	mov w0,#0xd
009f59e8	mov w1,#0x89
009f59ec	b 0x009f5a40
009f59f0	bl 0x00c342a0
009f59f4	adrp x0,0x2ad000
009f59f8	adrp x2,0x2cf000
009f59fc	add x0,x0,#0x9c8
009f5a00	add x2,x2,#0x8ef
009f5a04	mov w1,#0x431
009f5a08	bl 0x00c342b0
009f5a0c	mov w1,#0x10a
009f5a10	mov w0,#0xd
009f5a14	movk w1,#0x8, LSL #16
009f5a18	b 0x009f5a40
009f5a1c	bl 0x00c342a0
009f5a20	adrp x0,0x2ad000
009f5a24	adrp x2,0x2cf000
009f5a28	add x0,x0,#0x9c8
009f5a2c	add x2,x2,#0x8ef
009f5a30	mov w1,#0x438
009f5a34	bl 0x00c342b0
009f5a38	mov w0,#0xd
009f5a3c	mov w1,#0xc5
009f5a40	mov x2,xzr
009f5a44	bl 0x00c342c0
009f5a48	mov w0,wzr
009f5a4c	ldp x29,x30,[sp, #0x80]
009f5a50	ldp x20,x19,[sp, #0x70]
009f5a54	ldp x22,x21,[sp, #0x60]
009f5a58	ldp x24,x23,[sp, #0x50]
009f5a5c	ldp x26,x25,[sp, #0x40]
009f5a60	ldp x28,x27,[sp, #0x30]
009f5a64	add sp,sp,#0x90
009f5a68	ret
009f5a6c	add x8,x8,#0x2
009f5a70	str x8,[sp, #0x28]
009f5a74	tbnz w20,#0x0,0x009f59bc
009f5a78	bl 0x00c342a0
009f5a7c	adrp x0,0x2ad000
009f5a80	adrp x2,0x2cf000
009f5a84	add x0,x0,#0x9c8
009f5a88	add x2,x2,#0x8ef
009f5a8c	mov w1,#0x428
009f5a90	bl 0x00c342b0
009f5a94	mov w0,#0xd
009f5a98	mov w1,#0x9f
009f5a9c	b 0x009f5a40
009f5aa0	bl 0x00c342a0
009f5aa4	adrp x0,0x2ad000
009f5aa8	adrp x2,0x2d7000
009f5aac	add x0,x0,#0x9c8
009f5ab0	add x2,x2,#0xbcb
009f5ab4	mov w1,#0x44f
009f5ab8	bl 0x00c342b0
009f5abc	mov w1,#0x100
009f5ac0	mov w0,#0xd
009f5ac4	movk w1,#0xc, LSL #16
009f5ac8	b 0x009f5a40
