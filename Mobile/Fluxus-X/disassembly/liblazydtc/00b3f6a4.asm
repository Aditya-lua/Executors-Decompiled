; FUN_00b3f6a4 @ 00b3f6a4
00b3f6a4	sub sp,sp,#0x50
00b3f6a8	mov w9,#0xffffffff
00b3f6ac	stp x23,xzr,[sp, #0x10]
00b3f6b0	stp x22,x21,[sp, #0x20]
00b3f6b4	stp x20,x19,[sp, #0x30]
00b3f6b8	stp x29,x30,[sp, #0x40]
00b3f6bc	str w9,[sp, #0xc]
00b3f6c0	ldr w9,[x6, #0xc]
00b3f6c4	add x29,sp,#0x40
00b3f6c8	cbz w9,0x00b3f710
00b3f6cc	mov x19,x6
00b3f6d0	mov x20,x5
00b3f6d4	mov x8,x4
00b3f6d8	mov w22,w2
00b3f6dc	mov x23,x1
00b3f6e0	mov x21,x0
00b3f6e4	cbz x4,0x00b3f718
00b3f6e8	ldr w2,[x19, #0x8]
00b3f6ec	add x3,sp,#0x18
00b3f6f0	add x4,sp,#0xc
00b3f6f4	mov x0,x23
00b3f6f8	mov w1,w22
00b3f6fc	blr x8
00b3f700	cbz w0,0x00b3f710
00b3f704	ldr x2,[sp, #0x18]
00b3f708	ldr w3,[sp, #0xc]
00b3f70c	b 0x00b3f720
00b3f710	mov w20,wzr
00b3f714	b 0x00b3f75c
00b3f718	mov x2,xzr
00b3f71c	mov w3,#0xffffffff
00b3f720	mov x0,x23
00b3f724	mov w1,w22
00b3f728	mov x4,x20
00b3f72c	mov x5,x19
00b3f730	bl 0x00b3f48c
00b3f734	mov x19,x0
00b3f738	cbz x0,0x00b3f750
00b3f73c	mov x0,x21
00b3f740	mov x1,x19
00b3f744	bl 0x00c3f280
00b3f748	mov w20,w0
00b3f74c	b 0x00b3f754
00b3f750	mov w20,wzr
00b3f754	mov x0,x19
00b3f758	bl 0x00c382f0
00b3f75c	mov w0,w20
00b3f760	ldp x29,x30,[sp, #0x40]
00b3f764	ldp x20,x19,[sp, #0x30]
00b3f768	ldp x22,x21,[sp, #0x20]
00b3f76c	ldr x23,[sp, #0x10]
00b3f770	add sp,sp,#0x50
00b3f774	ret
