; FUN_00bbb08c @ 00bbb08c
00bbb08c	cbz w1,0x00bbb0e0
00bbb090	ldr w10,[x0, #0x4]
00bbb094	mov w9,wzr
00bbb098	mov w8,wzr
00bbb09c	add x11,x0,#0xa
00bbb0a0	mov w12,#0x1
00bbb0a4	sub w13,w12,#0x1
00bbb0a8	lsr w14,w12,w10
00bbb0ac	add w12,w12,#0x1
00bbb0b0	ubfiz x13,x13,#0x3,#0x20
00bbb0b4	ldrb w13,[x11, x13]
00bbb0b8	cmp w8,w13
00bbb0bc	csel w8,w8,w13,hi
00bbb0c0	cmp w13,#0x16
00bbb0c4	cinc w9,w9,hi
00bbb0c8	cbz w14,0x00bbb0a4
00bbb0cc	mov w11,#0x8
00bbb0d0	sub w10,w11,w10
00bbb0d4	lsl w9,w9,w10
00bbb0d8	orr x0,x9,x8, LSL #0x20
00bbb0dc	ret
00bbb0e0	mov x0,xzr
00bbb0e4	ret
