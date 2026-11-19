; CAST_ofb64_encrypt @ 00a9191c
00a9191c	sub sp,sp,#0x70
00a91920	stp x26,x25,[sp, #0x20]
00a91924	stp x24,x23,[sp, #0x30]
00a91928	stp x22,x21,[sp, #0x40]
00a9192c	stp x20,x19,[sp, #0x50]
00a91930	stp x29,x30,[sp, #0x60]
00a91934	ldrb w8,[x4]
00a91938	ldrb w12,[x4, #0x4]
00a9193c	ldrb w9,[x4, #0x1]
00a91940	ldrb w13,[x4, #0x5]
00a91944	ldrb w10,[x4, #0x2]
00a91948	ldrb w14,[x4, #0x6]
00a9194c	ldrb w11,[x4, #0x3]
00a91950	ldrb w15,[x4, #0x7]
00a91954	ldr w25,[x5]
00a91958	lsl w16,w8,#0x18
00a9195c	lsl w17,w12,#0x18
00a91960	bfm w16,w9,#0x10,#0x7
00a91964	bfm w17,w13,#0x10,#0x7
00a91968	bfm w16,w10,#0x18,#0x7
00a9196c	bfm w17,w14,#0x18,#0x7
00a91970	mov x19,x5
00a91974	strb w8,[sp, #0x18]
00a91978	strb w9,[sp, #0x19]
00a9197c	orr w8,w16,w11
00a91980	orr w9,w17,w15
00a91984	str x27,[sp, #0x10]
00a91988	add x29,sp,#0x60
00a9198c	strb w10,[sp, #0x1a]
00a91990	strb w11,[sp, #0x1b]
00a91994	strb w12,[sp, #0x1c]
00a91998	strb w13,[sp, #0x1d]
00a9199c	strb w14,[sp, #0x1e]
00a919a0	stp w8,w9,[sp, #0x8]
00a919a4	strb w15,[sp, #0x1f]
00a919a8	cbz x2,0x00a91a78
00a919ac	mov x20,x4
00a919b0	mov x21,x3
00a919b4	mov x22,x2
00a919b8	mov x23,x1
00a919bc	mov x24,x0
00a919c0	mov w26,wzr
00a919c4	add x27,sp,#0x18
00a919c8	sub x22,x22,#0x1
00a919cc	cbnz w25,0x00a91a1c
00a919d0	add x0,sp,#0x8
00a919d4	mov x1,x21
00a919d8	bl 0x00c392b0
00a919dc	ldp w8,w9,[sp, #0x8]
00a919e0	add w26,w26,#0x1
00a919e4	lsr w10,w8,#0x18
00a919e8	strb w10,[sp, #0x18]
00a919ec	lsr w10,w8,#0x10
00a919f0	strb w10,[sp, #0x19]
00a919f4	lsr w10,w8,#0x8
00a919f8	strb w8,[sp, #0x1b]
00a919fc	lsr w8,w9,#0x18
00a91a00	strb w8,[sp, #0x1c]
00a91a04	lsr w8,w9,#0x10
00a91a08	strb w8,[sp, #0x1d]
00a91a0c	lsr w8,w9,#0x8
00a91a10	strb w10,[sp, #0x1a]
00a91a14	strb w8,[sp, #0x1e]
00a91a18	strb w9,[sp, #0x1f]
00a91a1c	ldrb w8,[x24], #0x1
00a91a20	ldrb w9,[x27, w25, SXTW ]
00a91a24	add w10,w25,#0x1
00a91a28	and w25,w10,#0x7
00a91a2c	eor w8,w9,w8
00a91a30	strb w8,[x23], #0x1
00a91a34	cbnz x22,0x00a919c8
00a91a38	cbz w26,0x00a91a78
00a91a3c	ldp w8,w9,[sp, #0x8]
00a91a40	lsr w10,w8,#0x18
00a91a44	strb w10,[x20]
00a91a48	lsr w10,w8,#0x10
00a91a4c	strb w8,[x20, #0x3]
00a91a50	lsr w8,w8,#0x8
00a91a54	strb w10,[x20, #0x1]
00a91a58	lsr w10,w9,#0x18
00a91a5c	strb w8,[x20, #0x2]
00a91a60	lsr w8,w9,#0x10
00a91a64	strb w10,[x20, #0x4]
00a91a68	lsr w10,w9,#0x8
00a91a6c	strb w8,[x20, #0x5]
00a91a70	strb w10,[x20, #0x6]
00a91a74	strb w9,[x20, #0x7]
00a91a78	str w25,[x19]
00a91a7c	ldp x29,x30,[sp, #0x60]
00a91a80	ldp x20,x19,[sp, #0x50]
00a91a84	ldp x22,x21,[sp, #0x40]
00a91a88	ldp x24,x23,[sp, #0x30]
00a91a8c	ldp x26,x25,[sp, #0x20]
00a91a90	ldr x27,[sp, #0x10]
00a91a94	add sp,sp,#0x70
00a91a98	ret
