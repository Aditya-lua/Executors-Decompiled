; FUN_008499e0 @ 008499e0
008499e0	stp x29,x30,[sp, #-0x60]!
008499e4	stp x28,x27,[sp, #0x10]
008499e8	stp x26,x25,[sp, #0x20]
008499ec	stp x24,x23,[sp, #0x30]
008499f0	stp x22,x21,[sp, #0x40]
008499f4	stp x20,x19,[sp, #0x50]
008499f8	mov x29,sp
008499fc	mov x20,x0
00849a00	mov w0,#0x10
00849a04	mov w24,w6
00849a08	mov x23,x5
00849a0c	mov x25,x4
00849a10	mov x19,x3
00849a14	mov x26,x2
00849a18	mov x27,x1
00849a1c	bl 0x00c2fed0
00849a20	ldr x28,[x20, #0x38]
00849a24	adrp x8,0xcb4000
00849a28	mov x21,x0
00849a2c	ldr x8,[x8, #0xa58]
00849a30	ldr x9,[x28, #0x8]
00849a34	add x8,x8,#0x10
00849a38	stp x8,x9,[x0]
00849a3c	str xzr,[x28, #0x8]
00849a40	mov w0,#0x38
00849a44	bl 0x00c2fed0
00849a48	adrp x9,0xcb4000
00849a4c	ldr x8,[x19, #0x8]
00849a50	mov x22,x0
00849a54	ldr x9,[x9, #0xb08]
00849a58	stp x21,x27,[x0, #0x10]
00849a5c	ldr w27,[x20, #0x20]
00849a60	str x26,[x0, #0x20]
00849a64	add x9,x9,#0x10
00849a68	stp w27,w25,[x0, #0x28]
00849a6c	stp x9,x8,[x0]
00849a70	and w8,w24,#0x1
00849a74	str w23,[x0, #0x30]
00849a78	strb w8,[x0, #0x34]
00849a7c	str xzr,[x19, #0x8]
00849a80	mov w0,#0x10
00849a84	bl 0x00c2fed0
00849a88	adrp x8,0xcb4000
00849a8c	ldr x8,[x8, #0xb10]
00849a90	str x21,[x20, #0x38]
00849a94	str x22,[x0, #0x8]
00849a98	add x8,x8,#0x10
00849a9c	str x0,[x28, #0x8]
00849aa0	str x8,[x0]
00849aa4	add w8,w27,#0x1
00849aa8	str x22,[x19, #0x8]
00849aac	str w8,[x20, #0x20]
00849ab0	ldp x20,x19,[sp, #0x50]
00849ab4	ldp x22,x21,[sp, #0x40]
00849ab8	ldp x24,x23,[sp, #0x30]
00849abc	ldp x26,x25,[sp, #0x20]
00849ac0	ldp x28,x27,[sp, #0x10]
00849ac4	ldp x29,x30,[sp], #0x60
00849ac8	ret
