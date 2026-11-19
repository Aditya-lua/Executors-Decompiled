; FUN_00b60f10 @ 00b60f10
00b60f10	sub sp,sp,#0x70
00b60f14	stp x29,x30,[sp, #0x60]
00b60f18	add x29,sp,#0x60
00b60f1c	str x21,[sp, #0x40]
00b60f20	stp x20,x19,[sp, #0x50]
00b60f24	stur wzr,[x29, #-0x14]
00b60f28	cbz x0,0x00b60fa8
00b60f2c	ldr x8,[x0, #0x168]
00b60f30	mov x21,x0
00b60f34	cbz x8,0x00b60fa4
00b60f38	ldr x0,[x21, #0x160]
00b60f3c	mov x19,x2
00b60f40	mov x20,x1
00b60f44	bl 0x00c34c20
00b60f48	cmp w0,#0x40
00b60f4c	mov w0,wzr
00b60f50	b.gt 0x00b60fa8
00b60f54	mov x0,x21
00b60f58	bl 0x00b61478
00b60f5c	cbz w0,0x00b60fa8
00b60f60	ldr x0,[x21, #0x168]
00b60f64	mov x1,sp
00b60f68	sub x2,x29,#0x14
00b60f6c	bl 0x00c31f60
00b60f70	cbz w0,0x00b60fa8
00b60f74	ldr x8,[x21, #0x170]
00b60f78	ldur w1,[x29, #-0x14]
00b60f7c	cbz x8,0x00b60f8c
00b60f80	cmp x8,x1
00b60f84	mov w0,wzr
00b60f88	b.ne 0x00b60fa8
00b60f8c	ldr x4,[x21, #0x10]
00b60f90	mov x0,sp
00b60f94	mov x2,x20
00b60f98	mov w3,w19
00b60f9c	bl 0x00c401c0
00b60fa0	b 0x00b60fa8
00b60fa4	mov w0,wzr
00b60fa8	ldp x29,x30,[sp, #0x60]
00b60fac	ldp x20,x19,[sp, #0x50]
00b60fb0	ldr x21,[sp, #0x40]
00b60fb4	add sp,sp,#0x70
00b60fb8	ret
