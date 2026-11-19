; FUN_00941cb8 @ 00941cb8
00941cb8	sub sp,sp,#0x50
00941cbc	str x19,[sp, #0x30]
00941cc0	stp x29,x30,[sp, #0x40]
00941cc4	add x29,sp,#0x40
00941cc8	mrs x19,tpidr_el0
00941ccc	ldr x8,[x19, #0x28]
00941cd0	mov w0,#0x4
00941cd4	add x1,sp,#0x8
00941cd8	stur x8,[x29, #-0x18]
00941cdc	bl 0x00c308e0
00941ce0	cbz w0,0x00941d0c
00941ce4	mov w0,#0x1
00941ce8	add x1,sp,#0x8
00941cec	bl 0x00c308e0
00941cf0	cbz w0,0x00941d0c
00941cf4	add x0,sp,#0x18
00941cf8	mov x1,xzr
00941cfc	bl 0x00c31ff0
00941d00	ldr x0,[sp, #0x18]
00941d04	ldr w8,[sp, #0x20]
00941d08	b 0x00941d2c
00941d0c	ldp x0,x8,[sp, #0x8]
00941d10	mov x9,#0xf7cf
00941d14	movk x9,#0xe353, LSL #16
00941d18	movk x9,#0x9ba5, LSL #32
00941d1c	movk x9,#0x20c4, LSL #48
00941d20	smulh x8,x8,x9
00941d24	asr x9,x8,#0x7
00941d28	add x8,x9,x8, LSR #0x3f
00941d2c	ldr x9,[x19, #0x28]
00941d30	ldur x10,[x29, #-0x18]
00941d34	cmp x9,x10
00941d38	b.ne 0x00941d50
00941d3c	ldp x29,x30,[sp, #0x40]
00941d40	ldr x19,[sp, #0x30]
00941d44	and x1,x8,#0xffffffff
00941d48	add sp,sp,#0x50
00941d4c	ret
00941d50	bl 0x00c2fec0
