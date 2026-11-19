; FUN_00b63548 @ 00b63548
00b63548	sub sp,sp,#0xe0
00b6354c	stp x22,x21,[sp, #0xb0]
00b63550	stp x20,x19,[sp, #0xc0]
00b63554	stp x29,x30,[sp, #0xd0]
00b63558	add x29,sp,#0xd0
00b6355c	mov x20,x4
00b63560	mov x19,x3
00b63564	bl 0x00c41050
00b63568	str xzr,[sp]
00b6356c	cbz x0,0x00b63640
00b63570	mov x21,x0
00b63574	bl 0x00c35250
00b63578	mov x1,sp
00b6357c	mov x0,x21
00b63580	bl 0x00c37460
00b63584	mov w22,w0
00b63588	bl 0x00c35240
00b6358c	tbz w22,#0x1f,0x00b635a0
00b63590	ldr x0,[sp]
00b63594	cbz x0,0x00b635a0
00b63598	bl 0x00c35660
00b6359c	str xzr,[sp]
00b635a0	mov x0,x21
00b635a4	bl 0x00c31a40
00b635a8	ldr x21,[sp]
00b635ac	stur wzr,[x29, #-0x24]
00b635b0	cbz x21,0x00b63648
00b635b4	adrp x0,0x2ce000
00b635b8	add x0,x0,#0xcd9
00b635bc	add x8,sp,#0x8
00b635c0	sub x1,x29,#0x24
00b635c4	bl 0x00c36260
00b635c8	ldr x8,[sp, #0x28]
00b635cc	ldur q0,[sp, #0x18]
00b635d0	ldur q1,[sp, #0x8]
00b635d4	adrp x0,0x2d1000
00b635d8	str x8,[sp, #0x50]
00b635dc	add x0,x0,#0x67a
00b635e0	stp q1,q0,[sp, #0x30]
00b635e4	ldp x2,x1,[x21]
00b635e8	add x8,sp,#0x8
00b635ec	bl 0x00c34c50
00b635f0	ldr x8,[sp, #0x28]
00b635f4	ldur q0,[sp, #0x18]
00b635f8	ldur q1,[sp, #0x8]
00b635fc	str x8,[sp, #0x78]
00b63600	add x8,sp,#0x8
00b63604	stur q0,[sp, #0x68]
00b63608	stur q1,[sp, #0x58]
00b6360c	bl 0x00c34c40
00b63610	ldr x8,[sp, #0x28]
00b63614	ldur q0,[sp, #0x18]
00b63618	ldur q1,[sp, #0x8]
00b6361c	add x0,sp,#0x30
00b63620	mov x1,x20
00b63624	str x8,[sp, #0xa0]
00b63628	stp q1,q0,[sp, #0x80]
00b6362c	blr x19
00b63630	mov w19,w0
00b63634	mov x0,x21
00b63638	bl 0x00c35660
00b6363c	b 0x00b6364c
00b63640	mov w19,wzr
00b63644	b 0x00b6364c
00b63648	mov w19,#0x1
00b6364c	mov w0,w19
00b63650	ldp x29,x30,[sp, #0xd0]
00b63654	ldp x20,x19,[sp, #0xc0]
00b63658	ldp x22,x21,[sp, #0xb0]
00b6365c	add sp,sp,#0xe0
00b63660	ret
