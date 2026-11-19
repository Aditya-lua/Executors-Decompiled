; FUN_008abbf0 @ 008abbf0
008abbf0	stp x29,x30,[sp, #-0x20]!
008abbf4	stp x20,x19,[sp, #0x10]
008abbf8	mov x29,sp
008abbfc	ldr x19,[x0, #0x8]
008abc00	cbz x19,0x008abc3c
008abc04	cbz x1,0x008abc54
008abc08	ldrh w8,[x19, #0x6]
008abc0c	cmp w8,#0x8, LSL #12
008abc10	b.ne 0x008abc4c
008abc14	ldr x8,[x0, #0x60]
008abc18	ldr x8,[x8, #0x6a8]
008abc1c	cbz x8,0x008abc44
008abc20	ldr w2,[x19, #0x14]
008abc24	mov x20,x1
008abc28	add x1,x19,#0x18
008abc2c	blr x8
008abc30	mov x1,x20
008abc34	mov w8,w0
008abc38	b 0x008abc48
008abc3c	mov x0,xzr
008abc40	b 0x008abc58
008abc44	mov w8,#0xffff
008abc48	strh w8,[x19, #0x6]
008abc4c	sxth w8,w8
008abc50	str w8,[x1]
008abc54	add x0,x19,#0x18
008abc58	ldp x20,x19,[sp, #0x10]
008abc5c	ldp x29,x30,[sp], #0x20
008abc60	ret
