; CONF_load @ 00a0cd98
00a0cd98	sub sp,sp,#0x60
00a0cd9c	mov x8,x1
00a0cda0	adrp x1,0x2bb000
00a0cda4	stp x22,x21,[sp, #0x30]
00a0cda8	mov x21,x0
00a0cdac	add x1,x1,#0x65
00a0cdb0	mov x0,x8
00a0cdb4	stp x20,x19,[sp, #0x40]
00a0cdb8	stp x29,x30,[sp, #0x50]
00a0cdbc	add x29,sp,#0x50
00a0cdc0	mov x20,x2
00a0cdc4	bl 0x00c387e0
00a0cdc8	cbz x0,0x00a0ce24
00a0cdcc	adrp x22,0xd21000
00a0cdd0	mov x19,x0
00a0cdd4	ldr x0,[x22, #0x950]
00a0cdd8	cbnz x0,0x00a0cde4
00a0cddc	bl 0x00c39420
00a0cde0	str x0,[x22, #0x950]
00a0cde4	ldr x8,[x0, #0x10]
00a0cde8	mov x0,sp
00a0cdec	blr x8
00a0cdf0	ldr x8,[sp]
00a0cdf4	str x21,[sp, #0x10]
00a0cdf8	mov x0,sp
00a0cdfc	mov x1,x19
00a0ce00	ldr x8,[x8, #0x28]
00a0ce04	mov x2,x20
00a0ce08	blr x8
00a0ce0c	ldr x8,[sp, #0x10]
00a0ce10	cmp w0,#0x0
00a0ce14	mov x0,x19
00a0ce18	csel x20,xzr,x8,eq
00a0ce1c	bl 0x00c31a40
00a0ce20	b 0x00a0ce58
00a0ce24	bl 0x00c342a0
00a0ce28	adrp x0,0x2af000
00a0ce2c	adrp x2,0x2a7000
00a0ce30	add x0,x0,#0xd73
00a0ce34	add x2,x2,#0xd5d
00a0ce38	mov w1,#0x3a
00a0ce3c	bl 0x00c342b0
00a0ce40	mov w1,#0x2
00a0ce44	orr w0,wzr,#0xe
00a0ce48	movk w1,#0x8, LSL #16
00a0ce4c	mov x2,xzr
00a0ce50	bl 0x00c342c0
00a0ce54	mov x20,xzr
00a0ce58	mov x0,x20
00a0ce5c	ldp x29,x30,[sp, #0x50]
00a0ce60	ldp x20,x19,[sp, #0x40]
00a0ce64	ldp x22,x21,[sp, #0x30]
00a0ce68	add sp,sp,#0x60
00a0ce6c	ret
