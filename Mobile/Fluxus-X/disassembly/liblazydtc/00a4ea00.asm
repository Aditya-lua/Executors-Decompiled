; OSSL_DECODER_fetch @ 00a4ea00
00a4ea00	sub sp,sp,#0x50
00a4ea04	mov x3,x2
00a4ea08	mov x2,x1
00a4ea0c	str x0,[sp]
00a4ea10	mov x0,sp
00a4ea14	mov w1,wzr
00a4ea18	str x19,[sp, #0x30]
00a4ea1c	stp x29,x30,[sp, #0x40]
00a4ea20	add x29,sp,#0x40
00a4ea24	str xzr,[sp, #0x20]
00a4ea28	bl 0x00a4ea54
00a4ea2c	ldr x8,[sp, #0x20]
00a4ea30	mov x19,x0
00a4ea34	cbz x8,0x00a4ea40
00a4ea38	mov x0,x8
00a4ea3c	bl 0x00c3b5c0
00a4ea40	mov x0,x19
00a4ea44	ldp x29,x30,[sp, #0x40]
00a4ea48	ldr x19,[sp, #0x30]
00a4ea4c	add sp,sp,#0x50
00a4ea50	ret
