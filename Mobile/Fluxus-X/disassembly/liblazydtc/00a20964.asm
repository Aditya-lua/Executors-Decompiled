; DSA_free @ 00a20964
00a20964	str x19,[sp, #-0x20]!
00a20968	stp x29,x30,[sp, #0x10]
00a2096c	add x29,sp,#0x10
00a20970	cbz x0,0x00a209a0
00a20974	mov x19,x0
00a20978	add x9,x0,#0x88
00a2097c	ldxr w8,[x9]
00a20980	subs w10,w8,#0x1
00a20984	stxr w11,w10,[x9]
00a20988	cbnz w11,0x00a2097c
00a2098c	b.ne 0x00a20998
00a20990	dmb ISHLD
00a20994	b 0x00a209ac
00a20998	cmp w8,#0x1
00a2099c	b.le 0x00a209ac
00a209a0	ldp x29,x30,[sp, #0x10]
00a209a4	ldr x19,[sp], #0x20
00a209a8	ret
00a209ac	ldr x8,[x19, #0xa0]
00a209b0	cbz x8,0x00a209c4
00a209b4	ldr x8,[x8, #0x38]
00a209b8	cbz x8,0x00a209c4
00a209bc	mov x0,x19
00a209c0	blr x8
00a209c4	ldr x0,[x19, #0xa8]
00a209c8	bl 0x00c32360
00a209cc	add x2,x19,#0x90
00a209d0	orr w0,wzr,#0x7
00a209d4	mov x1,x19
00a209d8	bl 0x00c356c0
00a209dc	ldr x0,[x19, #0xb0]
00a209e0	bl 0x00c34d40
00a209e4	add x0,x19,#0x8
00a209e8	bl 0x00c3a040
00a209ec	ldr x0,[x19, #0x68]
00a209f0	bl 0x00c322e0
00a209f4	ldr x0,[x19, #0x70]
00a209f8	bl 0x00c322e0
00a209fc	ldp x29,x30,[sp, #0x10]
00a20a00	adrp x1,0x2bb000
00a20a04	add x1,x1,#0xa4d
00a20a08	mov w2,#0xee
00a20a0c	mov x0,x19
00a20a10	ldr x19,[sp], #0x20
00a20a14	b 0x00c32310
