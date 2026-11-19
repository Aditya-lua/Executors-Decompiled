; UI_dup_error_string @ 00aee3c4
00aee3c4	str x21,[sp, #-0x30]!
00aee3c8	stp x20,x19,[sp, #0x10]
00aee3cc	stp x29,x30,[sp, #0x20]
00aee3d0	add x29,sp,#0x20
00aee3d4	cbz x1,0x00aee474
00aee3d8	adrp x8,0x2a0000
00aee3dc	add x8,x8,#0xc2f
00aee3e0	mov x19,x0
00aee3e4	mov w2,#0x15a
00aee3e8	mov x0,x1
00aee3ec	mov x1,x8
00aee3f0	bl 0x00c34600
00aee3f4	cbz x0,0x00aee4a4
00aee3f8	adrp x1,0x2a0000
00aee3fc	mov x21,x0
00aee400	add x1,x1,#0xc2f
00aee404	mov w0,#0x48
00aee408	mov w2,#0x6d
00aee40c	bl 0x00c34250
00aee410	cbz x0,0x00aee4d4
00aee414	mov w8,#0x1
00aee418	mov w9,#0x5
00aee41c	str x21,[x0, #0x8]
00aee420	str wzr,[x0, #0x10]
00aee424	str w8,[x0, #0x40]
00aee428	str w9,[x0]
00aee42c	str xzr,[x0, #0x18]
00aee430	ldr x8,[x19, #0x8]!
00aee434	mov x20,x0
00aee438	cbnz x8,0x00aee448
00aee43c	bl 0x00c34780
00aee440	str x0,[x19]
00aee444	cbz x0,0x00aee4ec
00aee448	stp xzr,xzr,[x20, #0x28]
00aee44c	ldr x0,[x19]
00aee450	mov x1,x20
00aee454	bl 0x00c347a0
00aee458	mov w19,w0
00aee45c	cmp w0,#0x0
00aee460	b.gt 0x00aee4d8
00aee464	mov x0,x20
00aee468	sub w19,w19,#0x1
00aee46c	bl 0x00aed930
00aee470	b 0x00aee4d8
00aee474	bl 0x00c342a0
00aee478	adrp x0,0x2a0000
00aee47c	adrp x2,0x2bc000
00aee480	add x0,x0,#0xc2f
00aee484	add x2,x2,#0x531
00aee488	mov w1,#0x69
00aee48c	bl 0x00c342b0
00aee490	mov w8,#0x100
00aee494	movk w8,#0xc, LSL #16
00aee498	add w1,w8,#0x2
00aee49c	mov w0,#0x28
00aee4a0	b 0x00aee4cc
00aee4a4	bl 0x00c342a0
00aee4a8	adrp x0,0x2a0000
00aee4ac	adrp x2,0x2bc000
00aee4b0	add x0,x0,#0xc2f
00aee4b4	add x2,x2,#0x51d
00aee4b8	mov w1,#0x15c
00aee4bc	bl 0x00c342b0
00aee4c0	mov w1,#0x100
00aee4c4	mov w0,#0x28
00aee4c8	movk w1,#0xc, LSL #16
00aee4cc	mov x2,xzr
00aee4d0	bl 0x00c342c0
00aee4d4	mov w19,#0xffffffff
00aee4d8	mov w0,w19
00aee4dc	ldp x29,x30,[sp, #0x20]
00aee4e0	ldp x20,x19,[sp, #0x10]
00aee4e4	ldr x21,[sp], #0x30
00aee4e8	ret
00aee4ec	mov x0,x20
00aee4f0	bl 0x00aed930
00aee4f4	b 0x00aee4d4
