; ASN1_d2i_fp @ 00abd710
00abd710	sub sp,sp,#0x40
00abd714	stp x22,x21,[sp, #0x10]
00abd718	stp x20,x19,[sp, #0x20]
00abd71c	stp x29,x30,[sp, #0x30]
00abd720	add x29,sp,#0x30
00abd724	mov x20,x3
00abd728	mov x22,x2
00abd72c	mov x21,x1
00abd730	bl 0x00c32270
00abd734	bl 0x00c32240
00abd738	cbz x0,0x00abd788
00abd73c	mov w1,#0x6a
00abd740	mov x2,xzr
00abd744	mov x3,x22
00abd748	mov x19,x0
00abd74c	bl 0x00c321a0
00abd750	add x1,sp,#0x8
00abd754	mov x0,x19
00abd758	str xzr,[sp, #0x8]
00abd75c	bl 0x00abd860
00abd760	ldr x22,[sp, #0x8]
00abd764	tbnz w0,#0x1f,0x00abd7c0
00abd768	ldr x8,[x22, #0x8]
00abd76c	sxtw x2,w0
00abd770	mov x1,sp
00abd774	mov x0,x20
00abd778	str x8,[sp]
00abd77c	blr x21
00abd780	mov x20,x0
00abd784	b 0x00abd7c4
00abd788	bl 0x00c342a0
00abd78c	adrp x0,0x2d8000
00abd790	adrp x2,0x2b4000
00abd794	add x0,x0,#0x61b
00abd798	add x2,x2,#0x852
00abd79c	orr w1,wzr,#0x1c
00abd7a0	bl 0x00c342b0
00abd7a4	mov w1,#0x7
00abd7a8	mov w0,#0xd
00abd7ac	movk w1,#0x8, LSL #16
00abd7b0	mov x2,xzr
00abd7b4	bl 0x00c342c0
00abd7b8	mov x20,xzr
00abd7bc	b 0x00abd7d4
00abd7c0	mov x20,xzr
00abd7c4	mov x0,x22
00abd7c8	bl 0x00c35660
00abd7cc	mov x0,x19
00abd7d0	bl 0x00c31a40
00abd7d4	mov x0,x20
00abd7d8	ldp x29,x30,[sp, #0x30]
00abd7dc	ldp x20,x19,[sp, #0x20]
00abd7e0	ldp x22,x21,[sp, #0x10]
00abd7e4	add sp,sp,#0x40
00abd7e8	ret
