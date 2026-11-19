; FUN_00b47a44 @ 00b47a44
00b47a44	str x21,[sp, #-0x30]!
00b47a48	stp x20,x19,[sp, #0x10]
00b47a4c	stp x29,x30,[sp, #0x20]
00b47a50	mov x20,x1
00b47a54	mov x19,x0
00b47a58	ldr x0,[x0]
00b47a5c	ldr x1,[x1]
00b47a60	mov x21,x2
00b47a64	adrp x2,0x29e000
00b47a68	add x2,x2,#0xf04
00b47a6c	mov w3,#0xb8
00b47a70	add x29,sp,#0x20
00b47a74	bl 0x00c345e0
00b47a78	str xzr,[x19]
00b47a7c	str xzr,[x20]
00b47a80	ldr x8,[x21, #0x18]
00b47a84	cbz x8,0x00b47aac
00b47a88	ldr x8,[x21, #0x10]
00b47a8c	cbz x8,0x00b47ac8
00b47a90	mov x0,x21
00b47a94	mov x1,x19
00b47a98	mov x2,xzr
00b47a9c	mov x3,x20
00b47aa0	bl 0x00c3ace0
00b47aa4	cbnz w0,0x00b47ac8
00b47aa8	b 0x00b47acc
00b47aac	adrp x1,0x29e000
00b47ab0	add x1,x1,#0xf04
00b47ab4	mov w0,#0x1
00b47ab8	mov w2,#0xbd
00b47abc	bl 0x00c32320
00b47ac0	str x0,[x19]
00b47ac4	cbz x0,0x00b47adc
00b47ac8	mov w0,#0x1
00b47acc	ldp x29,x30,[sp, #0x20]
00b47ad0	ldp x20,x19,[sp, #0x10]
00b47ad4	ldr x21,[sp], #0x30
00b47ad8	ret
00b47adc	bl 0x00c342a0
00b47ae0	adrp x0,0x29e000
00b47ae4	adrp x2,0x2c0000
00b47ae8	add x0,x0,#0xf04
00b47aec	add x2,x2,#0x954
00b47af0	mov w1,#0xbe
00b47af4	bl 0x00c342b0
00b47af8	mov w1,#0x100
00b47afc	mov w0,#0x39
00b47b00	movk w1,#0xc, LSL #16
00b47b04	mov x2,xzr
00b47b08	bl 0x00c342c0
00b47b0c	mov w0,wzr
00b47b10	b 0x00b47acc
