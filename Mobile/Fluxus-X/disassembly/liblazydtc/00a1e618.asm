; DH_compute_key @ 00a1e618
00a1e618	sub sp,sp,#0x40
00a1e61c	mov w8,#0x1
00a1e620	str x21,[sp, #0x10]
00a1e624	stp x20,x19,[sp, #0x20]
00a1e628	stp x29,x30,[sp, #0x30]
00a1e62c	str xzr,[sp, #0x18]
00a1e630	str x8,[sp, #0x8]
00a1e634	ldr x8,[x2, #0xb8]
00a1e638	add x29,sp,#0x30
00a1e63c	mov x20,x0
00a1e640	ldr x8,[x8, #0x10]
00a1e644	blr x8
00a1e648	mov w19,w0
00a1e64c	cmp w0,#0x1
00a1e650	b.lt 0x00a1e6c0
00a1e654	mov x8,xzr
00a1e658	mov w9,w19
00a1e65c	ldrb w10,[x20, x8]
00a1e660	ldr x11,[sp, #0x8]
00a1e664	add x8,x8,#0x1
00a1e668	cmp w10,#0x0
00a1e66c	cset w10,eq
00a1e670	and x10,x11,x10
00a1e674	str x10,[sp, #0x8]
00a1e678	ldr x10,[sp, #0x8]
00a1e67c	ldr x11,[sp, #0x18]
00a1e680	cmp x9,x8
00a1e684	add x10,x11,x10
00a1e688	str x10,[sp, #0x18]
00a1e68c	b.ne 0x00a1e65c
00a1e690	ldr x8,[sp, #0x18]
00a1e694	ldr x9,[sp, #0x18]
00a1e698	mov x0,x20
00a1e69c	sub w19,w19,w8
00a1e6a0	sxtw x21,w19
00a1e6a4	add x1,x20,x9
00a1e6a8	mov x2,x21
00a1e6ac	bl 0x00c2ff60
00a1e6b0	ldr x2,[sp, #0x18]
00a1e6b4	add x0,x20,x21
00a1e6b8	mov w1,wzr
00a1e6bc	bl 0x00c301c0
00a1e6c0	mov w0,w19
00a1e6c4	ldp x29,x30,[sp, #0x30]
00a1e6c8	ldp x20,x19,[sp, #0x20]
00a1e6cc	ldr x21,[sp, #0x10]
00a1e6d0	add sp,sp,#0x40
00a1e6d4	ret
