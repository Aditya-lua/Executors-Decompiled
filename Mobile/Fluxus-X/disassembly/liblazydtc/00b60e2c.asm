; FUN_00b60e2c @ 00b60e2c
00b60e2c	sub sp,sp,#0x80
00b60e30	stp x29,x30,[sp, #0x70]
00b60e34	add x29,sp,#0x70
00b60e38	str x23,[sp, #0x40]
00b60e3c	stp x22,x21,[sp, #0x50]
00b60e40	stp x20,x19,[sp, #0x60]
00b60e44	stur wzr,[x29, #-0x28]
00b60e48	cbz x0,0x00b60ef8
00b60e4c	ldr x8,[x0, #0x168]
00b60e50	mov x21,x0
00b60e54	cbz x8,0x00b60ef4
00b60e58	mov x22,x3
00b60e5c	mov x19,x2
00b60e60	mov x20,x1
00b60e64	cbz x1,0x00b60e90
00b60e68	mov x0,x21
00b60e6c	bl 0x00b61478
00b60e70	cbz w0,0x00b60ef8
00b60e74	ldr x0,[x21, #0x168]
00b60e78	mov x1,sp
00b60e7c	sub x2,x29,#0x28
00b60e80	bl 0x00c31f60
00b60e84	cbz w0,0x00b60ef8
00b60e88	ldur w23,[x29, #-0x28]
00b60e8c	b 0x00b60e94
00b60e90	mov w23,wzr
00b60e94	ldr x0,[x21, #0x10]
00b60e98	bl 0x00c3a720
00b60e9c	sxtw x8,w0
00b60ea0	cbz x20,0x00b60ee8
00b60ea4	cmp x8,x22
00b60ea8	mov w0,wzr
00b60eac	b.hi 0x00b60ef8
00b60eb0	ldr x8,[x21, #0x170]
00b60eb4	mov w1,w23
00b60eb8	cbz x8,0x00b60ec8
00b60ebc	cmp x8,x1
00b60ec0	mov w0,wzr
00b60ec4	b.ne 0x00b60ef8
00b60ec8	ldr x4,[x21, #0x10]
00b60ecc	mov x0,sp
00b60ed0	sub x3,x29,#0x24
00b60ed4	mov x2,x20
00b60ed8	bl 0x00c401b0
00b60edc	cmp w0,#0x1
00b60ee0	b.lt 0x00b60ef4
00b60ee4	ldur w8,[x29, #-0x24]
00b60ee8	mov w0,#0x1
00b60eec	str x8,[x19]
00b60ef0	b 0x00b60ef8
00b60ef4	mov w0,wzr
00b60ef8	ldp x29,x30,[sp, #0x70]
00b60efc	ldp x20,x19,[sp, #0x60]
00b60f00	ldp x22,x21,[sp, #0x50]
00b60f04	ldr x23,[sp, #0x40]
00b60f08	add sp,sp,#0x80
00b60f0c	ret
