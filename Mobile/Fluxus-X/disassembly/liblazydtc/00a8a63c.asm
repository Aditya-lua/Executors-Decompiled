; FUN_00a8a63c @ 00a8a63c
00a8a63c	sub sp,sp,#0x80
00a8a640	stp x24,x23,[sp, #0x40]
00a8a644	stp x22,x21,[sp, #0x50]
00a8a648	stp x20,x19,[sp, #0x60]
00a8a64c	mov x20,x3
00a8a650	mov x23,x2
00a8a654	mov x21,x1
00a8a658	lsr x8,x3,#0x1e
00a8a65c	mov x19,x0
00a8a660	stp x28,x27,[sp, #0x20]
00a8a664	stp x26,x25,[sp, #0x30]
00a8a668	stp x29,x30,[sp, #0x70]
00a8a66c	add x29,sp,#0x70
00a8a670	cbz x8,0x00a8a70c
00a8a674	orr x27,xzr,#-0x40000000
00a8a678	add x8,x20,x27
00a8a67c	mov w22,#0x40000000
00a8a680	and x28,x8,#-0x40000000
00a8a684	str x8,[sp]
00a8a688	add x8,x28,x22
00a8a68c	str x8,[sp, #0x8]
00a8a690	add x8,x23,x8
00a8a694	str x8,[sp, #0x10]
00a8a698	adrp x25,0xcb5000
00a8a69c	ldr x25,[x25, #0x318]
00a8a6a0	add x24,x19,#0x28
00a8a6a4	mov x26,x21
00a8a6a8	mov x0,x19
00a8a6ac	bl 0x00c3ceb0
00a8a6b0	str w0,[sp, #0x1c]
00a8a6b4	mov x0,x19
00a8a6b8	bl 0x00c3cea0
00a8a6bc	mov x3,x0
00a8a6c0	mov w2,#0x40000000
00a8a6c4	add x5,sp,#0x1c
00a8a6c8	mov x0,x23
00a8a6cc	mov x1,x26
00a8a6d0	mov x4,x24
00a8a6d4	mov x6,x25
00a8a6d8	bl 0x00c3e450
00a8a6dc	ldr w1,[sp, #0x1c]
00a8a6e0	mov x0,x19
00a8a6e4	bl 0x00c3ced0
00a8a6e8	add x20,x20,x27
00a8a6ec	add x23,x23,x22
00a8a6f0	lsr x8,x20,#0x1e
00a8a6f4	add x26,x26,x22
00a8a6f8	cbnz x8,0x00a8a6a8
00a8a6fc	ldr x8,[sp]
00a8a700	sub x20,x8,x28
00a8a704	ldp x8,x23,[sp, #0x8]
00a8a708	add x21,x21,x8
00a8a70c	cbz x20,0x00a8a754
00a8a710	mov x0,x19
00a8a714	bl 0x00c3ceb0
00a8a718	str w0,[sp, #0x18]
00a8a71c	mov x0,x19
00a8a720	bl 0x00c3cea0
00a8a724	adrp x6,0xcb5000
00a8a728	ldr x6,[x6, #0x318]
00a8a72c	mov x3,x0
00a8a730	add x4,x19,#0x28
00a8a734	add x5,sp,#0x18
00a8a738	mov x0,x23
00a8a73c	mov x1,x21
00a8a740	mov x2,x20
00a8a744	bl 0x00c3e450
00a8a748	ldr w1,[sp, #0x18]
00a8a74c	mov x0,x19
00a8a750	bl 0x00c3ced0
00a8a754	ldp x29,x30,[sp, #0x70]
00a8a758	ldp x20,x19,[sp, #0x60]
00a8a75c	ldp x22,x21,[sp, #0x50]
00a8a760	ldp x24,x23,[sp, #0x40]
00a8a764	ldp x26,x25,[sp, #0x30]
00a8a768	ldp x28,x27,[sp, #0x20]
00a8a76c	mov w0,#0x1
00a8a770	add sp,sp,#0x80
00a8a774	ret
