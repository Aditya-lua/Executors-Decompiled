; mbedtls_sha1 @ 00bac5a0
00bac5a0	sub sp,sp,#0xc0
00bac5a4	stp x26,x25,[sp, #0x70]
00bac5a8	stp x24,x23,[sp, #0x80]
00bac5ac	stp x22,x21,[sp, #0x90]
00bac5b0	stp x20,x19,[sp, #0xa0]
00bac5b4	stp x29,x30,[sp, #0xb0]
00bac5b8	add x29,sp,#0xb0
00bac5bc	mrs x23,tpidr_el0
00bac5c0	ldr x8,[x23, #0x28]
00bac5c4	mov x19,x2
00bac5c8	mov x20,x1
00bac5cc	mov x21,x0
00bac5d0	add x0,sp,#0x8
00bac5d4	mov w2,#0x5c
00bac5d8	mov w1,wzr
00bac5dc	stur x8,[x29, #-0x48]
00bac5e0	bl 0x00c301c0
00bac5e4	adrp x8,0x29c000
00bac5e8	ldr q0,[x8, #0x2e0]
00bac5ec	mov w8,#0xe1f0
00bac5f0	movk w8,#0xc3d2, LSL #16
00bac5f4	str w8,[sp, #0x20]
00bac5f8	stur q0,[sp, #0x10]
00bac5fc	cbz x20,0x00bac654
00bac600	subs x24,x20,#0x40
00bac604	str w20,[sp, #0x8]
00bac608	b.cc 0x00bac640
00bac60c	and x26,x24,#-0x40
00bac610	add x25,x26,#0x40
00bac614	mov x22,x21
00bac618	add x0,sp,#0x8
00bac61c	mov x1,x22
00bac620	bl 0x00c434e0
00bac624	sub x20,x20,#0x40
00bac628	cmp x20,#0x3f
00bac62c	add x22,x22,#0x40
00bac630	b.hi 0x00bac618
00bac634	subs x20,x24,x26
00bac638	b.eq 0x00bac654
00bac63c	add x21,x21,x25
00bac640	add x8,sp,#0x8
00bac644	add x0,x8,#0x1c
00bac648	mov x1,x21
00bac64c	mov x2,x20
00bac650	bl 0x00c2ffd0
00bac654	add x0,sp,#0x8
00bac658	mov x1,x19
00bac65c	bl 0x00c42a20
00bac660	add x0,sp,#0x8
00bac664	mov w1,#0x5c
00bac668	bl 0x00c42220
00bac66c	ldr x8,[x23, #0x28]
00bac670	ldur x9,[x29, #-0x48]
00bac674	cmp x8,x9
00bac678	b.ne 0x00bac69c
00bac67c	ldp x29,x30,[sp, #0xb0]
00bac680	ldp x20,x19,[sp, #0xa0]
00bac684	ldp x22,x21,[sp, #0x90]
00bac688	ldp x24,x23,[sp, #0x80]
00bac68c	ldp x26,x25,[sp, #0x70]
00bac690	mov w0,wzr
00bac694	add sp,sp,#0xc0
00bac698	ret
00bac69c	bl 0x00c2fec0
