; FUN_00925ca4 @ 00925ca4
00925ca4	str x2,[x3]
00925ca8	ldr x8,[x0, #0x18]
00925cac	cbz x8,0x00925ce4
00925cb0	add x9,x1,#0x10
00925cb4	cmp x1,#0x0
00925cb8	csel x10,x9,x0,ne
00925cbc	ldr x10,[x10]
00925cc0	stp x1,x10,[x3, #0x8]
00925cc4	cbz x1,0x00925cf4
00925cc8	ldr x10,[x9]
00925ccc	add x11,x0,#0x8
00925cd0	add x12,x10,#0x8
00925cd4	cmp x10,#0x0
00925cd8	csel x10,x11,x12,eq
00925cdc	str x3,[x10]
00925ce0	b 0x00925d00
00925ce4	mov x9,x0
00925ce8	str x3,[x9], #0x8
00925cec	stp xzr,xzr,[x3, #0x8]
00925cf0	b 0x00925d00
00925cf4	ldr x9,[x0]
00925cf8	str x3,[x9, #0x8]
00925cfc	mov x9,x0
00925d00	add x8,x8,#0x1
00925d04	str x3,[x9]
00925d08	str x8,[x0, #0x18]
00925d0c	ret
