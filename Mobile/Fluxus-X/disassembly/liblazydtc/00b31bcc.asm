; FUN_00b31bcc @ 00b31bcc
00b31bcc	stp x22,x21,[sp, #-0x30]!
00b31bd0	stp x20,x19,[sp, #0x10]
00b31bd4	stp x29,x30,[sp, #0x20]
00b31bd8	add x29,sp,#0x20
00b31bdc	mov x22,x3
00b31be0	mov x19,x2
00b31be4	mov x21,x1
00b31be8	mov x20,x0
00b31bec	bl 0x00c41000
00b31bf0	mov w8,w0
00b31bf4	cmp x22,#0x14
00b31bf8	mov w0,wzr
00b31bfc	b.cc 0x00b31c20
00b31c00	cbz w8,0x00b31c20
00b31c04	mov x0,x21
00b31c08	mov x1,x20
00b31c0c	bl 0x00c3e6b0
00b31c10	cbz w0,0x00b31c20
00b31c14	mov w8,#0x14
00b31c18	mov w0,#0x1
00b31c1c	str x8,[x19]
00b31c20	ldp x29,x30,[sp, #0x20]
00b31c24	ldp x20,x19,[sp, #0x10]
00b31c28	ldp x22,x21,[sp], #0x30
00b31c2c	ret
