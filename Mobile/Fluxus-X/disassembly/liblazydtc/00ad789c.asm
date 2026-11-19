; FUN_00ad789c @ 00ad789c
00ad789c	str x19,[sp, #-0x20]!
00ad78a0	stp x29,x30,[sp, #0x10]
00ad78a4	ldr x8,[x0, #0x38]
00ad78a8	add x29,sp,#0x10
00ad78ac	cbnz x8,0x00ad78dc
00ad78b0	mov x19,x0
00ad78b4	ldr x0,[x1, #0x88]
00ad78b8	bl 0x00c3d8d0
00ad78bc	bl 0x00c3fab0
00ad78c0	adrp x1,0x2ae000
00ad78c4	sxtw x0,w0
00ad78c8	add x1,x1,#0x623
00ad78cc	mov w2,#0x73
00ad78d0	bl 0x00c32320
00ad78d4	str x0,[x19, #0x38]
00ad78d8	cbz x0,0x00ad78ec
00ad78dc	mov w0,#0x1
00ad78e0	ldp x29,x30,[sp, #0x10]
00ad78e4	ldr x19,[sp], #0x20
00ad78e8	ret
00ad78ec	bl 0x00c342a0
00ad78f0	adrp x0,0x2ae000
00ad78f4	adrp x2,0x2c2000
00ad78f8	add x0,x0,#0x623
00ad78fc	add x2,x2,#0x3a7
00ad7900	mov w1,#0x74
00ad7904	bl 0x00c342b0
00ad7908	mov w1,#0x100
00ad790c	mov w0,#0x4
00ad7910	movk w1,#0xc, LSL #16
00ad7914	mov x2,xzr
00ad7918	bl 0x00c342c0
00ad791c	mov w0,wzr
00ad7920	b 0x00ad78e0
