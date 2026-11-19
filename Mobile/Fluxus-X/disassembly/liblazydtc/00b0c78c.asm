; X509_set1_notBefore @ 00b0c78c
00b0c78c	cbz x0,0x00b0c7dc
00b0c790	stp x20,x19,[sp, #-0x20]!
00b0c794	stp x29,x30,[sp, #0x10]
00b0c798	ldr x8,[x0, #0x38]
00b0c79c	mov x19,x1
00b0c7a0	mov x20,x0
00b0c7a4	add x29,sp,#0x10
00b0c7a8	cmp x8,x1
00b0c7ac	b.eq 0x00b0c7cc
00b0c7b0	mov x0,x19
00b0c7b4	bl 0x00c37a30
00b0c7b8	mov x19,x0
00b0c7bc	cbz x0,0x00b0c7cc
00b0c7c0	ldr x0,[x20, #0x38]
00b0c7c4	bl 0x00c37930
00b0c7c8	str x19,[x20, #0x38]
00b0c7cc	ldp x29,x30,[sp, #0x10]
00b0c7d0	cmp x19,#0x0
00b0c7d4	cset w0,ne
00b0c7d8	ldp x20,x19,[sp], #0x20
00b0c7dc	ret
