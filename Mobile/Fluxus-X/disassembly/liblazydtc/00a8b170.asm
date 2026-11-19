; FUN_00a8b170 @ 00a8b170
00a8b170	sub sp,sp,#0x50
00a8b174	stp x24,x23,[sp, #0x10]
00a8b178	stp x22,x21,[sp, #0x20]
00a8b17c	stp x20,x19,[sp, #0x30]
00a8b180	stp x29,x30,[sp, #0x40]
00a8b184	add x29,sp,#0x40
00a8b188	mov x20,x3
00a8b18c	mov x21,x2
00a8b190	mov x22,x1
00a8b194	mov x19,x0
00a8b198	bl 0x00c3ceb0
00a8b19c	mov w24,w0
00a8b1a0	mov x0,x19
00a8b1a4	bl 0x00c3cea0
00a8b1a8	tbnz w24,#0x1f,0x00a8b1fc
00a8b1ac	mov x23,x0
00a8b1b0	mov x0,x19
00a8b1b4	str w24,[sp, #0xc]
00a8b1b8	add x24,x19,#0x28
00a8b1bc	bl 0x00c3ce90
00a8b1c0	adrp x7,0xcb5000
00a8b1c4	ldr x7,[x7, #0x318]
00a8b1c8	mov x5,x0
00a8b1cc	add x6,sp,#0xc
00a8b1d0	mov x0,x21
00a8b1d4	mov x1,x22
00a8b1d8	mov x2,x20
00a8b1dc	mov x3,x23
00a8b1e0	mov x4,x24
00a8b1e4	bl 0x00c3e310
00a8b1e8	ldr w1,[sp, #0xc]
00a8b1ec	mov x0,x19
00a8b1f0	bl 0x00c3ced0
00a8b1f4	mov w0,#0x1
00a8b1f8	b 0x00a8b200
00a8b1fc	mov w0,wzr
00a8b200	ldp x29,x30,[sp, #0x40]
00a8b204	ldp x20,x19,[sp, #0x30]
00a8b208	ldp x22,x21,[sp, #0x20]
00a8b20c	ldp x24,x23,[sp, #0x10]
00a8b210	add sp,sp,#0x50
00a8b214	ret
