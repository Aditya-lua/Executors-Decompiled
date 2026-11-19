; FUN_008e49b0 @ 008e49b0
008e49b0	sub sp,sp,#0x40
008e49b4	str x30,[sp, #0x30]
008e49b8	ldr w8,[x1, #0x10]
008e49bc	cmp w8,#0x40
008e49c0	b.ne 0x008e4a08
008e49c4	ldr w8,[x2, #0x10]
008e49c8	cmp w8,#0x40
008e49cc	b.ne 0x008e4a08
008e49d0	adrp x9,0x29a000
008e49d4	ldr d1,[x9, #0x858]
008e49d8	adrp x8,0xc4e000
008e49dc	add x8,x8,#0x320
008e49e0	movi v0.2D,#-0x1
008e49e4	mov x4,#-0x10000
008e49e8	str wzr,[sp, #0x18]
008e49ec	stp x3,x8,[sp]
008e49f0	str d0,[sp, #0x20]
008e49f4	str d1,[sp, #0x10]
008e49f8	str wzr,[sp, #0x28]
008e49fc	mov x3,sp
008e4a00	movk x4,#0x9100, LSL #16
008e4a04	b 0x008e4a38
008e4a08	adrp x9,0x29a000
008e4a0c	ldr d1,[x9, #0x858]
008e4a10	adrp x8,0xc4e000
008e4a14	add x8,x8,#0x320
008e4a18	movi v0.2D,#-0x1
008e4a1c	stp x3,x8,[sp]
008e4a20	mov x3,sp
008e4a24	mov w4,#0x11000000
008e4a28	str wzr,[sp, #0x18]
008e4a2c	str d0,[sp, #0x20]
008e4a30	str d1,[sp, #0x10]
008e4a34	str wzr,[sp, #0x28]
008e4a38	bl 0x008e4a48
008e4a3c	ldr x30,[sp, #0x30]
008e4a40	add sp,sp,#0x40
008e4a44	ret
