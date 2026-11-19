; OBJ_find_sigid_algs @ 00aaf384
00aaf384	sub sp,sp,#0x40
00aaf388	str x21,[sp, #0x10]
00aaf38c	adrp x21,0xd22000
00aaf390	ldr x8,[x21, #0x190]
00aaf394	stp x20,x19,[sp, #0x20]
00aaf398	mov x19,x2
00aaf39c	mov x20,x1
00aaf3a0	stp x29,x30,[sp, #0x30]
00aaf3a4	add x29,sp,#0x30
00aaf3a8	str w0,[sp]
00aaf3ac	cbz x8,0x00aaf3d0
00aaf3b0	mov x1,sp
00aaf3b4	mov x0,x8
00aaf3b8	bl 0x00c34760
00aaf3bc	ldr x8,[x21, #0x190]
00aaf3c0	mov w1,w0
00aaf3c4	mov x0,x8
00aaf3c8	bl 0x00c32610
00aaf3cc	cbnz x0,0x00aaf3f4
00aaf3d0	adrp x1,0x774000
00aaf3d4	adrp x4,0xaaf000
00aaf3d8	add x1,x1,#0x1e0
00aaf3dc	add x4,x4,#0x670
00aaf3e0	mov x0,sp
00aaf3e4	mov w2,#0x31
00aaf3e8	orr w3,wzr,#0xc
00aaf3ec	bl 0x00c35830
00aaf3f0	cbz x0,0x00aaf410
00aaf3f4	cbz x20,0x00aaf400
00aaf3f8	ldr w8,[x0, #0x4]
00aaf3fc	str w8,[x20]
00aaf400	cbz x19,0x00aaf40c
00aaf404	ldr w8,[x0, #0x8]
00aaf408	str w8,[x19]
00aaf40c	mov w0,#0x1
00aaf410	ldp x29,x30,[sp, #0x30]
00aaf414	ldp x20,x19,[sp, #0x20]
00aaf418	ldr x21,[sp, #0x10]
00aaf41c	add sp,sp,#0x40
00aaf420	ret
