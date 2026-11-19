; std::__ndk1::basic_filebuf<char,std::__ndk1::char_traits<char>>::open @ 00bd7e8c
00bd7e8c	bti c
00bd7e90	ldr x8,[x0, #0x78]
00bd7e94	cbz x8,0x00bd7ea0
00bd7e98	mov x0,xzr
00bd7e9c	ret
00bd7ea0	paciasp
00bd7ea4	stp x29,x30,[sp, #-0x30]!
00bd7ea8	str x21,[sp, #0x10]
00bd7eac	stp x20,x19,[sp, #0x20]
00bd7eb0	mov x29,sp
00bd7eb4	mov x20,x0
00bd7eb8	mov w0,w2
00bd7ebc	mov x19,x1
00bd7ec0	mov w21,w2
00bd7ec4	bl 0x00bd87dc
00bd7ec8	cbz x0,0x00bd7f44
00bd7ecc	mov x1,x0
00bd7ed0	mov x0,x19
00bd7ed4	bl 0x00c30c10
00bd7ed8	mov x8,x0
00bd7edc	str x0,[x20, #0x78]
00bd7ee0	cbz x0,0x00bd7f40
00bd7ee4	ldr w9,[x20, #0x9c]
00bd7ee8	mov x0,x20
00bd7eec	str w21,[x20, #0x98]
00bd7ef0	cmp w9,#0x22
00bd7ef4	mov w9,w21
00bd7ef8	b.ne 0x00bd7f14
00bd7efc	mov x0,x8
00bd7f00	mov x1,xzr
00bd7f04	bl 0x00c42490
00bd7f08	mov w9,w21
00bd7f0c	mov x0,x20
00bd7f10	str wzr,[x20, #0x9c]
00bd7f14	tbz w9,#0x1,0x00bd7f44
00bd7f18	ldr x8,[x0, #0x78]
00bd7f1c	str wzr,[x0, #0x9c]
00bd7f20	mov x1,xzr
00bd7f24	mov w2,#0x2
00bd7f28	mov x0,x8
00bd7f2c	bl 0x00c31ec0
00bd7f30	cbz w0,0x00bd7f58
00bd7f34	ldr x0,[x20, #0x78]
00bd7f38	bl 0x00c30be0
00bd7f3c	str xzr,[x20, #0x78]
00bd7f40	mov x0,xzr
00bd7f44	ldp x20,x19,[sp, #0x20]
00bd7f48	ldr x21,[sp, #0x10]
00bd7f4c	ldp x29,x30,[sp], #0x30
00bd7f50	autiasp
00bd7f54	ret
00bd7f58	mov x0,x20
00bd7f5c	b 0x00bd7f44
