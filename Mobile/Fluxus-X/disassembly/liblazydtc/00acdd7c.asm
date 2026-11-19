; FUN_00acdd7c @ 00acdd7c
00acdd7c	sub sp,sp,#0x40
00acdd80	stp x22,x21,[sp, #0x10]
00acdd84	stp x20,x19,[sp, #0x20]
00acdd88	stp x29,x30,[sp, #0x30]
00acdd8c	stp xzr,xzr,[sp]
00acdd90	ldr x21,[x1, #0x20]
00acdd94	mov x20,x1
00acdd98	mov x19,x0
00acdd9c	orr w1,wzr,#0xf000
00acdda0	mov x0,x21
00acdda4	add x29,sp,#0x30
00acdda8	bl 0x00c3fac0
00acddac	cmp w0,#0x1, LSL #12
00acddb0	b.ne 0x00acdddc
00acddb4	ldr x21,[x21, #0x80]
00acddb8	cbz x21,0x00acdde4
00acddbc	bl 0x00c3fa50
00acddc0	mov x1,x0
00acddc4	mov x2,sp
00acddc8	mov x0,x21
00acddcc	bl 0x00c37a90
00acddd0	cbz x0,0x00acdec4
00acddd4	mov w22,#0x10
00acddd8	b 0x00acdde8
00acdddc	mov w22,#0x5
00acdde0	b 0x00acdde8
00acdde4	mov w22,#0xffffffff
00acdde8	ldr x0,[x20, #0x20]
00acddec	add x1,sp,#0x8
00acddf0	bl 0x00c3f230
00acddf4	mov w21,w0
00acddf8	cmp w0,#0x0
00acddfc	b.le 0x00acde34
00acde00	ldr x8,[x20, #0x8]
00acde04	ldr w0,[x8]
00acde08	bl 0x00c37740
00acde0c	ldp x4,x5,[sp]
00acde10	mov x1,x0
00acde14	mov x0,x19
00acde18	mov w2,wzr
00acde1c	mov w3,w22
00acde20	mov w6,w21
00acde24	bl 0x00c37ed0
00acde28	cbz w0,0x00acde70
00acde2c	mov w0,#0x1
00acde30	b 0x00acdec4
00acde34	bl 0x00c342a0
00acde38	adrp x0,0x2aa000
00acde3c	adrp x2,0x2da000
00acde40	add x0,x0,#0x8f8
00acde44	add x2,x2,#0x56b
00acde48	mov w1,#0x9d
00acde4c	bl 0x00c342b0
00acde50	mov w1,#0x100
00acde54	mov w0,#0x4
00acde58	movk w1,#0xc, LSL #16
00acde5c	mov x2,xzr
00acde60	bl 0x00c342c0
00acde64	ldr x0,[sp]
00acde68	bl 0x00c37890
00acde6c	b 0x00acdec0
00acde70	bl 0x00c342a0
00acde74	adrp x19,0x2aa000
00acde78	add x19,x19,#0x8f8
00acde7c	adrp x2,0x2da000
00acde80	add x2,x2,#0x56b
00acde84	mov w1,#0xa4
00acde88	mov x0,x19
00acde8c	bl 0x00c342b0
00acde90	mov w1,#0x100
00acde94	mov w0,#0x4
00acde98	movk w1,#0xc, LSL #16
00acde9c	mov x2,xzr
00acdea0	bl 0x00c342c0
00acdea4	ldr x0,[sp]
00acdea8	bl 0x00c37890
00acdeac	ldr x0,[sp, #0x8]
00acdeb0	sxtw x1,w21
00acdeb4	mov w3,#0xa6
00acdeb8	mov x2,x19
00acdebc	bl 0x00c345e0
00acdec0	mov w0,wzr
00acdec4	ldp x29,x30,[sp, #0x30]
00acdec8	ldp x20,x19,[sp, #0x20]
00acdecc	ldp x22,x21,[sp, #0x10]
00acded0	add sp,sp,#0x40
00acded4	ret
