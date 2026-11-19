; FUN_00b5f198 @ 00b5f198
00b5f198	sub sp,sp,#0x80
00b5f19c	stp x22,x21,[sp, #0x50]
00b5f1a0	stp x20,x19,[sp, #0x60]
00b5f1a4	stp x29,x30,[sp, #0x70]
00b5f1a8	add x29,sp,#0x70
00b5f1ac	mov x19,x3
00b5f1b0	mov x20,x2
00b5f1b4	mov x21,x1
00b5f1b8	mov x22,x0
00b5f1bc	str wzr,[sp, #0xc]
00b5f1c0	bl 0x00c41000
00b5f1c4	mov w8,w0
00b5f1c8	mov w0,wzr
00b5f1cc	cbz x22,0x00b5f220
00b5f1d0	cbz w8,0x00b5f220
00b5f1d4	ldrb w8,[x22, #0x1c]
00b5f1d8	ldr x0,[x22, #0x28]
00b5f1dc	orr w8,w8,#0x1
00b5f1e0	strb w8,[x22, #0x1c]
00b5f1e4	cbz x0,0x00b5f220
00b5f1e8	cbz x21,0x00b5f204
00b5f1ec	add x1,sp,#0x10
00b5f1f0	add x2,sp,#0xc
00b5f1f4	bl 0x00c31f60
00b5f1f8	cbz w0,0x00b5f220
00b5f1fc	ldr w5,[sp, #0xc]
00b5f200	b 0x00b5f208
00b5f204	mov x5,xzr
00b5f208	add x4,sp,#0x10
00b5f20c	mov x0,x22
00b5f210	mov x1,x21
00b5f214	mov x2,x20
00b5f218	mov x3,x19
00b5f21c	bl 0x00b5e540
00b5f220	ldp x29,x30,[sp, #0x70]
00b5f224	ldp x20,x19,[sp, #0x60]
00b5f228	ldp x22,x21,[sp, #0x50]
00b5f22c	add sp,sp,#0x80
00b5f230	ret
