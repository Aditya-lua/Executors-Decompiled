; X509v3_asid_subset @ 00afa0d0
00afa0d0	stp x20,x19,[sp, #-0x20]!
00afa0d4	mov x20,x0
00afa0d8	mov w0,#0x1
00afa0dc	stp x29,x30,[sp, #0x10]
00afa0e0	add x29,sp,#0x10
00afa0e4	cbz x20,0x00afa17c
00afa0e8	mov x19,x1
00afa0ec	cmp x20,x1
00afa0f0	b.eq 0x00afa17c
00afa0f4	cbz x19,0x00afa178
00afa0f8	ldr x8,[x20]
00afa0fc	cbz x8,0x00afa108
00afa100	ldr w9,[x8]
00afa104	cbz w9,0x00afa178
00afa108	ldr x9,[x20, #0x8]
00afa10c	cbz x9,0x00afa118
00afa110	ldr w10,[x9]
00afa114	cbz w10,0x00afa178
00afa118	ldr x10,[x19]
00afa11c	cbz x10,0x00afa128
00afa120	ldr w11,[x10]
00afa124	cbz w11,0x00afa178
00afa128	ldr x11,[x19, #0x8]
00afa12c	cbz x11,0x00afa138
00afa130	ldr w11,[x11]
00afa134	cbz w11,0x00afa178
00afa138	cbz x8,0x00afa154
00afa13c	cbz x10,0x00afa178
00afa140	ldr x0,[x10, #0x8]
00afa144	ldr x1,[x8, #0x8]
00afa148	bl 0x00afa190
00afa14c	cbz w0,0x00afa17c
00afa150	ldr x9,[x20, #0x8]
00afa154	cbz x9,0x00afa188
00afa158	ldr x8,[x19, #0x8]
00afa15c	cbz x8,0x00afa178
00afa160	ldr x0,[x8, #0x8]
00afa164	ldr x1,[x9, #0x8]
00afa168	bl 0x00afa190
00afa16c	cmp w0,#0x0
00afa170	cset w0,ne
00afa174	b 0x00afa17c
00afa178	mov w0,wzr
00afa17c	ldp x29,x30,[sp, #0x10]
00afa180	ldp x20,x19,[sp], #0x20
00afa184	ret
00afa188	mov w0,#0x1
00afa18c	b 0x00afa17c
