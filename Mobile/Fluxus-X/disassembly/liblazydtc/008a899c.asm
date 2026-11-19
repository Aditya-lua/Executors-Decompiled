; FUN_008a899c @ 008a899c
008a899c	mov w9,wzr
008a89a0	cbz x1,0x008a8a5c
008a89a4	adrp x10,0xd1b000
008a89a8	ldr w11,[x1, #0x8]
008a89ac	ldr w10,[x10, #0x20]
008a89b0	cmp w11,w10
008a89b4	b.ne 0x008a8a5c
008a89b8	stp x29,x30,[sp, #-0x10]!
008a89bc	mov x29,sp
008a89c0	mov x8,x0
008a89c4	ldr x9,[x0, #0x28]
008a89c8	ldr x0,[x1, #0x20]
008a89cc	cbz x9,0x008a8a3c
008a89d0	lsr x9,x0,#0x4
008a89d4	mov x10,#0x7c15
008a89d8	movk x10,#0x7f4a, LSL #16
008a89dc	eor x9,x9,x0, LSR #0x9
008a89e0	movk x10,#0x79b9, LSL #32
008a89e4	movk x10,#0x9e37, LSL #48
008a89e8	mul x9,x9,x10
008a89ec	ldrb w10,[x8, #0x30]
008a89f0	lsr x9,x9,x10
008a89f4	ldr x10,[x8, #0x18]
008a89f8	lsr x11,x9,#0x6
008a89fc	ldr x11,[x10, x11, LSL #0x3]
008a8a00	lsr x11,x11,x9
008a8a04	tbz w11,#0x0,0x008a8a3c
008a8a08	ldr x11,[x8, #0x20]
008a8a0c	ldr x8,[x8]
008a8a10	sub x11,x11,#0x1
008a8a14	lsl x12,x9,#0x4
008a8a18	ldr x12,[x8, x12#0x0]
008a8a1c	cmp x12,x0
008a8a20	b.eq 0x008a8a64
008a8a24	add x9,x9,#0x1
008a8a28	and x9,x9,x11
008a8a2c	lsr x12,x9,#0x6
008a8a30	ldr x12,[x10, x12, LSL #0x3]
008a8a34	lsr x12,x12,x9
008a8a38	tbnz w12,#0x0,0x008a8a14
008a8a3c	cbz x0,0x008a8a54
008a8a40	mov x1,x2
008a8a44	bl 0x00c301f0
008a8a48	cmp w0,#0x0
008a8a4c	cset w9,eq
008a8a50	b 0x008a8a58
008a8a54	mov w9,wzr
008a8a58	ldp x29,x30,[sp], #0x10
008a8a5c	mov w0,w9
008a8a60	ret
008a8a64	add x8,x8,x9, LSL #0x4
008a8a68	mov w9,wzr
008a8a6c	ldr w8,[x8, #0x8]
008a8a70	cbnz w8,0x008a8a58
008a8a74	cbnz x0,0x008a8a40
008a8a78	b 0x008a8a58
