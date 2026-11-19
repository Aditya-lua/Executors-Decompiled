; bn_cmp_part_words @ 00a029fc
00a029fc	sxtw x8,w2
00a02a00	sub x8,x8,#0x1
00a02a04	tbz w3,#0x1f,0x00a02a34
00a02a08	sxtw x10,w3
00a02a0c	sxtw x11,w8
00a02a10	sub x9,x10,#0x1
00a02a14	sub x10,x11,x10
00a02a18	add x10,x1,x10, LSL #0x3
00a02a1c	ldr x11,[x10]
00a02a20	cbnz x11,0x00a02ac8
00a02a24	add x9,x9,#0x1
00a02a28	cmn x9,#0x2
00a02a2c	sub x10,x10,#0x8
00a02a30	b.le 0x00a02a1c
00a02a34	cmp w3,#0x1
00a02a38	b.lt 0x00a02a58
00a02a3c	sxtw x9,w3
00a02a40	add x10,x0,w8, SXTW  #0x3
00a02a44	ldr x11,[x10, x9, LSL #0x3]
00a02a48	cbnz x11,0x00a02aa4
00a02a4c	cmp x9,#0x2
00a02a50	sub x9,x9,#0x1
00a02a54	b.ge 0x00a02a44
00a02a58	cbz w2,0x00a02ac0
00a02a5c	lsl x8,x8,#0x3
00a02a60	ldr x9,[x0, x8#0x0]
00a02a64	ldr x8,[x1, x8#0x0]
00a02a68	cmp x9,x8
00a02a6c	b.ne 0x00a02ab0
00a02a70	subs w9,w2,#0x2
00a02a74	mov w8,wzr
00a02a78	b.lt 0x00a02ab8
00a02a7c	sxtw x8,w9
00a02a80	lsl x9,x8,#0x3
00a02a84	ldr x10,[x0, x9#0x0]
00a02a88	ldr x9,[x1, x9#0x0]
00a02a8c	cmp x10,x9
00a02a90	b.ne 0x00a02ab0
00a02a94	subs x8,x8,#0x1
00a02a98	b.ge 0x00a02a80
00a02a9c	mov w0,wzr
00a02aa0	ret
00a02aa4	mov w8,#0x1
00a02aa8	mov w0,w8
00a02aac	ret
00a02ab0	mov w8,#0x1
00a02ab4	cneg w8,w8,ls
00a02ab8	mov w0,w8
00a02abc	ret
00a02ac0	mov w0,wzr
00a02ac4	ret
00a02ac8	mov w8,#0xffffffff
00a02acc	mov w0,w8
00a02ad0	ret
