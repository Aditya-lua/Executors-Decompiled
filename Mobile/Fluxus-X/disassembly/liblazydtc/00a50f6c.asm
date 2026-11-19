; engine_unlocked_finish @ 00a50f6c
00a50f6c	stp x20,x19,[sp, #-0x20]!
00a50f70	stp x29,x30,[sp, #0x10]
00a50f74	ldr w8,[x0, #0xa0]
00a50f78	mov x19,x0
00a50f7c	add x29,sp,#0x10
00a50f80	subs w8,w8,#0x1
00a50f84	str w8,[x0, #0xa0]
00a50f88	b.eq 0x00a50fe4
00a50f8c	mov w20,#0x1
00a50f90	mov x0,x19
00a50f94	mov w1,wzr
00a50f98	bl 0x00c3bb10
00a50f9c	mov w8,w0
00a50fa0	mov w0,w20
00a50fa4	cbnz w8,0x00a50fd8
00a50fa8	bl 0x00c342a0
00a50fac	adrp x0,0x2b9000
00a50fb0	adrp x2,0x2a5000
00a50fb4	add x0,x0,#0xd2a
00a50fb8	add x2,x2,#0xf15
00a50fbc	mov w1,#0x4a
00a50fc0	bl 0x00c342b0
00a50fc4	mov w0,#0x26
00a50fc8	mov w1,#0x6a
00a50fcc	mov x2,xzr
00a50fd0	bl 0x00c342c0
00a50fd4	mov w0,wzr
00a50fd8	ldp x29,x30,[sp, #0x10]
00a50fdc	ldp x20,x19,[sp], #0x20
00a50fe0	ret
00a50fe4	ldr x8,[x19, #0x68]
00a50fe8	cbz x8,0x00a50f8c
00a50fec	cbz w1,0x00a51030
00a50ff0	adrp x20,0xcb5000
00a50ff4	ldr x20,[x20, #0x5d8]
00a50ff8	ldr x0,[x20]
00a50ffc	bl 0x00c35690
00a51000	ldr x8,[x19, #0x68]
00a51004	mov x0,x19
00a51008	blr x8
00a5100c	ldr x8,[x20]
00a51010	mov w20,w0
00a51014	mov x0,x8
00a51018	bl 0x00c356a0
00a5101c	cbz w20,0x00a50fd4
00a51020	mov w8,w0
00a51024	mov w0,wzr
00a51028	cbnz w8,0x00a50f90
00a5102c	b 0x00a50fd8
00a51030	mov x0,x19
00a51034	blr x8
00a51038	mov w20,w0
00a5103c	cbnz w0,0x00a50f90
00a51040	b 0x00a50fd8
