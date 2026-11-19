; ossl_x509_req_set0_libctx @ 00b1e7e4
00b1e7e4	stp x20,x19,[sp, #-0x20]!
00b1e7e8	stp x29,x30,[sp, #0x10]
00b1e7ec	add x29,sp,#0x10
00b1e7f0	cbz x0,0x00b1e838
00b1e7f4	mov x19,x0
00b1e7f8	ldr x0,[x0, #0x70]
00b1e7fc	str x1,[x19, #0x68]
00b1e800	adrp x1,0x2d0000
00b1e804	mov x20,x2
00b1e808	add x1,x1,#0x618
00b1e80c	mov w2,#0x98
00b1e810	bl 0x00c32310
00b1e814	str xzr,[x19, #0x70]
00b1e818	cbz x20,0x00b1e838
00b1e81c	adrp x1,0x2d0000
00b1e820	add x1,x1,#0x618
00b1e824	mov w2,#0x9b
00b1e828	mov x0,x20
00b1e82c	bl 0x00c34600
00b1e830	str x0,[x19, #0x70]
00b1e834	cbz x0,0x00b1e83c
00b1e838	mov w0,#0x1
00b1e83c	ldp x29,x30,[sp, #0x10]
00b1e840	ldp x20,x19,[sp], #0x20
00b1e844	ret
