; FUN_00b2aaa0 @ 00b2aaa0
00b2aaa0	stp x22,x21,[sp, #-0x30]!
00b2aaa4	stp x20,x19,[sp, #0x10]
00b2aaa8	stp x29,x30,[sp, #0x20]
00b2aaac	ldr x22,[x0, #0xa8]
00b2aab0	add x29,sp,#0x20
00b2aab4	mov x19,x2
00b2aab8	mov x20,x0
00b2aabc	mov x21,x1
00b2aac0	bl 0x00c41000
00b2aac4	cbz w0,0x00b2aafc
00b2aac8	ldr x8,[x22, #0x18]
00b2aacc	mov x0,x20
00b2aad0	mov x1,x21
00b2aad4	mov x2,x19
00b2aad8	mov x3,xzr
00b2aadc	mov x4,xzr
00b2aae0	blr x8
00b2aae4	cmp w0,#0x1
00b2aae8	b.lt 0x00b2aaf8
00b2aaec	mov w0,#0x1
00b2aaf0	str xzr,[x19]
00b2aaf4	b 0x00b2aafc
00b2aaf8	mov w0,wzr
00b2aafc	ldp x29,x30,[sp, #0x20]
00b2ab00	ldp x20,x19,[sp, #0x10]
00b2ab04	ldp x22,x21,[sp], #0x30
00b2ab08	ret
