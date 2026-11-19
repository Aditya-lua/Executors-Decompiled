; X509_get_signature_info @ 00b0c920
00b0c920	str x23,[sp, #-0x40]!
00b0c924	stp x22,x21,[sp, #0x10]
00b0c928	mov x22,x2
00b0c92c	mov x23,x1
00b0c930	mov w1,#0xffffffff
00b0c934	mov w2,#0xffffffff
00b0c938	stp x20,x19,[sp, #0x20]
00b0c93c	stp x29,x30,[sp, #0x30]
00b0c940	add x29,sp,#0x30
00b0c944	mov x19,x4
00b0c948	mov x21,x3
00b0c94c	mov x20,x0
00b0c950	bl 0x00c40a60
00b0c954	cbz x23,0x00b0c960
00b0c958	ldr w8,[x20, #0xb0]
00b0c95c	str w8,[x23]
00b0c960	cbz x22,0x00b0c96c
00b0c964	ldr w8,[x20, #0xb4]
00b0c968	str w8,[x22]
00b0c96c	cbz x21,0x00b0c978
00b0c970	ldr w8,[x20, #0xb8]
00b0c974	str w8,[x21]
00b0c978	cbz x19,0x00b0c984
00b0c97c	ldr w8,[x20, #0xbc]
00b0c980	str w8,[x19]
00b0c984	ldr w8,[x20, #0xbc]
00b0c988	ldp x29,x30,[sp, #0x30]
00b0c98c	ldp x20,x19,[sp, #0x20]
00b0c990	ldp x22,x21,[sp, #0x10]
00b0c994	and w0,w8,#0x1
00b0c998	ldr x23,[sp], #0x40
00b0c99c	ret
