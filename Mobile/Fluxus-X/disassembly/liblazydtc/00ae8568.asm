; FUN_00ae8568 @ 00ae8568
00ae8568	sub sp,sp,#0x50
00ae856c	stp x24,x23,[sp, #0x10]
00ae8570	stp x22,x21,[sp, #0x20]
00ae8574	stp x20,x19,[sp, #0x30]
00ae8578	stp x29,x30,[sp, #0x40]
00ae857c	add x29,sp,#0x40
00ae8580	mov w21,w2
00ae8584	mov x22,x1
00ae8588	mov x20,x0
00ae858c	bl 0x00c3cc10
00ae8590	str xzr,[sp, #0x8]
00ae8594	strh wzr,[sp, #0x4]
00ae8598	cbz x0,0x00ae8684
00ae859c	mov x19,x0
00ae85a0	bl 0x00c3cc40
00ae85a4	orr w1,wzr,#0x3
00ae85a8	mov x0,x19
00ae85ac	orr w23,wzr,#0x3
00ae85b0	bl 0x00c3cc60
00ae85b4	mov w8,#0x5556
00ae85b8	movk w8,#0x5555, LSL #16
00ae85bc	smull x8,w21,w8
00ae85c0	lsr x9,x8,#0x3f
00ae85c4	lsr x8,x8,#0x20
00ae85c8	add w8,w8,w9
00ae85cc	add w8,w8,w8, LSL #0x1
00ae85d0	sub w24,w21,w8
00ae85d4	sub w8,w23,w24
00ae85d8	sxtw x23,w8
00ae85dc	cbz w24,0x00ae8604
00ae85e0	add x2,sp,#0xc
00ae85e4	add x3,sp,#0x4
00ae85e8	mov x0,x19
00ae85ec	mov x1,x20
00ae85f0	mov w4,w23
00ae85f4	bl 0x00c3cc50
00ae85f8	cbz w0,0x00ae8678
00ae85fc	ldrsw x8,[sp, #0xc]
00ae8600	b 0x00ae8608
00ae8604	mov x8,xzr
00ae8608	add x1,x20,x8
00ae860c	add x2,sp,#0x8
00ae8610	mov x0,x19
00ae8614	mov x3,x22
00ae8618	mov w4,w21
00ae861c	bl 0x00c3cc50
00ae8620	cbz w0,0x00ae8678
00ae8624	ldpsw x9,x8,[sp, #0x8]
00ae8628	add x2,sp,#0x8
00ae862c	mov x0,x19
00ae8630	add x8,x8,x9
00ae8634	add x1,x20,x8
00ae8638	str w8,[sp, #0xc]
00ae863c	bl 0x00c3cc30
00ae8640	ldpsw x9,x8,[sp, #0x8]
00ae8644	add x8,x8,x9
00ae8648	str w8,[sp, #0xc]
00ae864c	cbz w24,0x00ae8668
00ae8650	sub x21,x8,x23
00ae8654	add x1,x20,x23
00ae8658	mov x0,x20
00ae865c	mov x2,x21
00ae8660	bl 0x00c2ff60
00ae8664	strb wzr,[x20, x21]
00ae8668	mov x0,x19
00ae866c	bl 0x00c3cc00
00ae8670	mov w0,#0x1
00ae8674	b 0x00ae8684
00ae8678	mov x0,x19
00ae867c	bl 0x00c3cc00
00ae8680	mov w0,wzr
00ae8684	ldp x29,x30,[sp, #0x40]
00ae8688	ldp x20,x19,[sp, #0x30]
00ae868c	ldp x22,x21,[sp, #0x20]
00ae8690	ldp x24,x23,[sp, #0x10]
00ae8694	add sp,sp,#0x50
00ae8698	ret
